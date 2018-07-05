package io.reciteapp.androidtests.chat;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ChatPresenterTest {
  public static final String MESSAGE = "AbuNyan is here!";
  private ChatContract.Presenter presenter;
  @Mock
  private ChatContract.View chatView;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    presenter = new ChatPresenter(chatView);
  }

  @Test
  public void sendMessage_NullString_NoMessageSent() {
    presenter.sendMessage(null);
    //never - so that method was not called
    verify(chatView, never()).addMessage(anyString());
  }

  @Test
  public void sendMessage_EmptyString_NoMessageSent() {
    presenter.sendMessage("");
    //never - so that method was not called
    verify(chatView, never()).addMessage(anyString());
  }

  @Test
  public void sendMessage_NormalString_MessageSent() {
    presenter.sendMessage(MESSAGE);
    //never - so that method was not called
    verify(chatView).addMessage(MESSAGE);
  }

  @Test
  public void messageInputTextChanged_NullString_SendButtonDisabled() {
    presenter.messageInputTextChanged(null);
    verify(chatView).disableSendButton();
  }

  @Test
  public void messageInputTextChanged_EmptyString_SendButtonDisabled() {
    presenter.messageInputTextChanged("");
    verify(chatView).disableSendButton();
  }

  @Test
  public void messageInputTextChanged_NormalString_SendButtonEnabled() {
    presenter.messageInputTextChanged(MESSAGE);
    verify(chatView).enableSendButon();
  }
}
