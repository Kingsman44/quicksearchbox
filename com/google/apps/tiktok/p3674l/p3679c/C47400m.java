package com.google.apps.tiktok.p3674l.p3679c;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58881cr;

/* renamed from: com.google.apps.tiktok.l.c.m */
/* compiled from: PG */
public final class C47400m {

    /* renamed from: a */
    public final C47770dh f123127a;

    /* renamed from: b */
    public View f123128b;

    public C47400m(C47770dh dhVar) {
        this.f123127a = dhVar;
    }

    /* renamed from: c */
    public static final String m84244c(String str, View view) {
        String str2 = (String) view.getTag(R.id.tiktok_event_internal_trace);
        if (str2 == null) {
            str2 = view.getClass().getSimpleName();
        }
        return str + " " + str2;
    }

    /* renamed from: a */
    public final void mo51252a(View view, C47388b bVar) {
        mo51254d(view, new C47399l(bVar));
    }

    /* renamed from: b */
    public final void mo51253b(View view, C58881cr crVar) {
        mo51254d(view, new C47396i(crVar));
    }

    @Deprecated
    /* renamed from: d */
    public final void mo51254d(View view, View.OnClickListener onClickListener) {
        view.setOnClickListener(new C47398k(this, onClickListener));
    }
}
