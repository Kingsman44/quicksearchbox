package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.support.p033v7.widget.C0673gh;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cp */
/* compiled from: PG */
final class C33337cp extends C0673gh {

    /* renamed from: a */
    final ImageComponent f89357a;

    /* renamed from: b */
    final TextView f89358b;

    /* renamed from: c */
    final TextInputEditText f89359c;

    /* renamed from: d */
    final ImageButton f89360d;

    /* renamed from: e */
    final Button f89361e;

    /* renamed from: f */
    final Button f89362f;

    /* renamed from: g */
    boolean f89363g = false;

    public C33337cp(LinearLayout linearLayout) {
        super(linearLayout);
        ImageComponent imageComponent = (ImageComponent) linearLayout.findViewById(R.id.fa_message_reply_card_sender_avatar);
        imageComponent.getClass();
        this.f89357a = imageComponent;
        TextView textView = (TextView) linearLayout.findViewById(R.id.fa_message_reply_card_sender_name);
        textView.getClass();
        this.f89358b = textView;
        TextInputEditText textInputEditText = (TextInputEditText) linearLayout.findViewById(R.id.fa_message_reply_card_edit_text);
        textInputEditText.getClass();
        this.f89359c = textInputEditText;
        ImageButton imageButton = (ImageButton) linearLayout.findViewById(R.id.fa_message_reply_card_provider_button);
        imageButton.getClass();
        this.f89360d = imageButton;
        Button button = (Button) linearLayout.findViewById(R.id.fa_message_reply_card_cancel_button);
        button.getClass();
        this.f89361e = button;
        Button button2 = (Button) linearLayout.findViewById(R.id.fa_message_reply_card_send_button);
        button2.getClass();
        this.f89362f = button2;
    }
}
