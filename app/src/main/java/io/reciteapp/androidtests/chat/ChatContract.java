package io.reciteapp.androidtests.chat;

public interface ChatContract {

  interface View {
    void addMessage(String message);

    void clearMessageInput();

    void enableSendButon();

    void disableSendButton();
  }

  interface Presenter {
    void sendMessage(String message);

    void messageInputTextChanged(String messageInput);
  }

}
