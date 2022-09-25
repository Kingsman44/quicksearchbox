package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cw */
/* compiled from: PG */
public final class C15068cw extends C0673gh {

    /* renamed from: k */
    public static final /* synthetic */ int f45193k = 0;

    /* renamed from: a */
    public final ImageView f45194a;

    /* renamed from: b */
    public final TextView f45195b;

    /* renamed from: c */
    public final ImageView f45196c;

    /* renamed from: d */
    public final View f45197d;

    /* renamed from: e */
    View f45198e;

    /* renamed from: f */
    ImageView f45199f;

    /* renamed from: g */
    TextView f45200g;

    /* renamed from: h */
    TextView f45201h;

    /* renamed from: i */
    C14348fx f45202i = null;

    /* renamed from: j */
    final /* synthetic */ C15069cx f45203j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15068cw(C15069cx cxVar, View view) {
        super(view);
        this.f45203j = cxVar;
        this.f45195b = (TextView) view.findViewById(R.id.unread_message_sender_name);
        this.f45194a = (ImageView) view.findViewById(R.id.unread_message_sender_avatar);
        this.f45196c = (ImageView) view.findViewById(R.id.unread_message_app_icon);
        this.f45197d = cxVar.f45214k ? view.findViewById(R.id.playable_message_view) : view;
        if (cxVar.f45214k) {
            this.f45198e = view.findViewById(R.id.reply_message_view);
            this.f45200g = (TextView) view.findViewById(R.id.num_unread_messages);
            this.f45201h = (TextView) view.findViewById(R.id.unread_message_timestamp);
            return;
        }
        this.f45199f = (ImageView) view.findViewById(R.id.unread_message_missed_badge);
    }
}
