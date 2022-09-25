package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.h */
/* compiled from: PG */
public final class C27166h implements C27131ag {

    /* renamed from: a */
    public final Context f74255a;

    public C27166h(Context context) {
        this.f74255a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ View mo32451a(C27129ae aeVar) {
        return C27130af.m50335a(this, aeVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ View mo32452b(C27129ae aeVar) {
        View inflate = LayoutInflater.from(this.f74255a).inflate(R.layout.lens_card_with_illustration, (ViewGroup) null);
        C27162d a = C27162d.m50375a(inflate);
        a.f74246a.setText(R.string.lens_auth_bad_authentication_header);
        a.f74247b.setText(R.string.lens_auth_bad_authentication_body);
        C27162d.m50376b(a.f74248c, this.f74255a.getResources().getString(R.string.lens_auth_label), new C27165g(this, (C27164f) aeVar));
        return inflate;
    }
}
