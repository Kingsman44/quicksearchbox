package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.support.p033v7.widget.C0673gh;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.co */
/* compiled from: PG */
final class C33336co extends C0673gh {

    /* renamed from: a */
    final LinearLayout f89348a;

    /* renamed from: b */
    final ImageComponent f89349b;

    /* renamed from: c */
    final TextView f89350c;

    /* renamed from: d */
    final LinearLayout f89351d;

    /* renamed from: e */
    final TextView f89352e;

    /* renamed from: f */
    final TextView f89353f;

    /* renamed from: g */
    final TextView f89354g;

    /* renamed from: h */
    final ImageButton f89355h;

    /* renamed from: i */
    final Button f89356i;

    public C33336co(LinearLayout linearLayout) {
        super(linearLayout);
        this.f89348a = linearLayout;
        ImageComponent imageComponent = (ImageComponent) linearLayout.findViewById(R.id.fa_message_preview_card_sender_avatar);
        imageComponent.getClass();
        this.f89349b = imageComponent;
        TextView textView = (TextView) linearLayout.findViewById(R.id.fa_message_preview_card_sender_name);
        textView.getClass();
        this.f89350c = textView;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.fa_message_preview_card_message_container);
        linearLayout2.getClass();
        this.f89351d = linearLayout2;
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.fa_message_preview_card_additional_info_sender_name);
        textView2.getClass();
        this.f89352e = textView2;
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.fa_message_preview_card_additional_info_separator);
        textView3.getClass();
        this.f89353f = textView3;
        TextView textView4 = (TextView) linearLayout.findViewById(R.id.fa_message_preview_card_additional_info_timestamp);
        textView4.getClass();
        this.f89354g = textView4;
        ImageButton imageButton = (ImageButton) linearLayout.findViewById(R.id.fa_message_preview_card_provider_button);
        imageButton.getClass();
        this.f89355h = imageButton;
        Button button = (Button) linearLayout.findViewById(R.id.fa_message_preview_card_reply_button);
        button.getClass();
        this.f89356i = button;
    }
}
