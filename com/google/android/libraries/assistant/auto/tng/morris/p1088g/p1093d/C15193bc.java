package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14580om;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bc */
/* compiled from: PG */
public final class C15193bc {

    /* renamed from: a */
    public TextView f45607a;

    /* renamed from: b */
    public ImageView f45608b;

    /* renamed from: c */
    public ImageView f45609c;

    /* renamed from: d */
    public C14576oi f45610d;

    /* renamed from: e */
    private final C15352z f45611e;

    /* renamed from: f */
    private final C14132bf f45612f;

    /* renamed from: g */
    private TextView f45613g;

    public C15193bc(C15352z zVar, C14132bf bfVar) {
        this.f45611e = zVar;
        this.f45612f = bfVar;
    }

    /* renamed from: a */
    public final void mo22069a(C14576oi oiVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45607a == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(true != oiVar.f44074c ? R.layout.message_compose : R.layout.message_compose_large, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_compose_container);
            this.f45612f.mo21444a(viewGroup2, 114346);
            viewGroup2.getClass();
            this.f45607a = (TextView) viewGroup2.findViewById(R.id.message_receiver_name);
            this.f45613g = (TextView) viewGroup2.findViewById(R.id.message_app_name);
            this.f45608b = (ImageView) viewGroup2.findViewById(R.id.message_receiver_avatar);
            this.f45609c = (ImageView) viewGroup2.findViewById(R.id.message_app_icon);
        }
        if (!oiVar.equals(this.f45610d)) {
            C14580om omVar = oiVar.f44073b;
            if (omVar == null) {
                omVar = C14580om.f44082d;
            }
            TextView textView = this.f45607a;
            textView.getClass();
            textView.setText(omVar.f44084a);
            C14348fx fxVar = oiVar.f44072a;
            if (fxVar != null) {
                TextView textView2 = this.f45607a;
                textView2.getClass();
                textView2.setText(fxVar.f43416a);
                TextView textView3 = this.f45613g;
                textView3.getClass();
                textView3.setText(this.f45611e.mo22227h(fxVar.f43418c));
                C15352z zVar = this.f45611e;
                ImageView imageView = this.f45608b;
                imageView.getClass();
                C14361gj gjVar = fxVar.f43419d;
                if (gjVar == null) {
                    gjVar = C14361gj.f43456e;
                }
                zVar.mo22229l(imageView, gjVar, C15192bb.f45606a);
                C15352z zVar2 = this.f45611e;
                ImageView imageView2 = this.f45609c;
                imageView2.getClass();
                zVar2.mo22228k(imageView2, fxVar.f43418c);
            } else {
                TextView textView4 = this.f45613g;
                textView4.getClass();
                textView4.setText(this.f45611e.mo22227h(omVar.f44086c));
                C15352z zVar3 = this.f45611e;
                ImageView imageView3 = this.f45608b;
                imageView3.getClass();
                zVar3.mo22232o(imageView3, omVar.f44085b, C15192bb.f45606a, C5593j.m14518b());
                C15352z zVar4 = this.f45611e;
                ImageView imageView4 = this.f45609c;
                imageView4.getClass();
                zVar4.mo22228k(imageView4, omVar.f44086c);
            }
            this.f45610d = oiVar;
        }
    }
}
