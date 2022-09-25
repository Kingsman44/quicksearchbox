package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bk */
/* compiled from: PG */
public final class C15201bk {

    /* renamed from: a */
    public TextView f45630a;

    /* renamed from: b */
    public TextView f45631b;

    /* renamed from: c */
    public ImageView f45632c;

    /* renamed from: d */
    public ImageView f45633d;

    /* renamed from: e */
    public C14582oo f45634e;

    /* renamed from: f */
    private final C15352z f45635f;

    /* renamed from: g */
    private final C14132bf f45636g;

    public C15201bk(C15352z zVar, C14132bf bfVar) {
        this.f45635f = zVar;
        this.f45636g = bfVar;
    }

    /* renamed from: a */
    public final void mo22075a(C14582oo ooVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45630a == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(true != ooVar.f44090b ? R.layout.message_read : R.layout.message_read_large, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_read_container);
            this.f45636g.mo21444a(viewGroup2, 114348);
            viewGroup2.getClass();
            this.f45630a = (TextView) viewGroup2.findViewById(R.id.incoming_message_sender_name);
            this.f45631b = (TextView) viewGroup2.findViewById(R.id.message_app_name);
            this.f45632c = (ImageView) viewGroup2.findViewById(R.id.incoming_message_sender_avatar);
            this.f45633d = (ImageView) viewGroup2.findViewById(R.id.message_app_icon);
        }
        if (!ooVar.equals(this.f45634e)) {
            C14348fx fxVar = ooVar.f44089a;
            if (fxVar == null) {
                fxVar = C14348fx.f43414h;
            }
            TextView textView = this.f45630a;
            textView.getClass();
            textView.setText(fxVar.f43416a);
            TextView textView2 = this.f45631b;
            textView2.getClass();
            textView2.setText(this.f45635f.mo22227h(fxVar.f43418c));
            C15352z zVar = this.f45635f;
            ImageView imageView = this.f45632c;
            imageView.getClass();
            C14361gj gjVar = fxVar.f43419d;
            if (gjVar == null) {
                gjVar = C14361gj.f43456e;
            }
            zVar.mo22229l(imageView, gjVar, C15200bj.f45629a);
            C15352z zVar2 = this.f45635f;
            ImageView imageView2 = this.f45633d;
            imageView2.getClass();
            zVar2.mo22228k(imageView2, fxVar.f43418c);
            this.f45634e = ooVar;
        }
    }
}
