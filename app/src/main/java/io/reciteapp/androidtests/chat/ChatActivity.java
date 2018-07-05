package io.reciteapp.androidtests.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import io.reciteapp.androidtests.R;

public class ChatActivity extends AppCompatActivity implements ChatContract.View{

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }

  @Override
  public void addMessage(String message) {

  }

  @Override
  public void clearMessageInput() {

  }

  @Override
  public void enableSendButon() {

  }

  @Override
  public void disableSendButton() {

  }
}
