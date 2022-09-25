package com.google.android.apps.gsa.nowoverlayservice;

import android.os.Handler;
import com.google.android.libraries.gsa.p1859d.p1861b.C22757c;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.x */
/* compiled from: PG */
final class C83552x {

    /* renamed from: a */
    final /* synthetic */ C83553y f227782a;

    public C83552x(C83553y yVar) {
        this.f227782a = yVar;
    }

    /* renamed from: a */
    public final void mo76874a() {
        this.f227782a.mo28042ab(false);
    }

    /* renamed from: b */
    public final void mo76875b() {
        this.f227782a.mo28039Y(new C22757c(1, 0), true);
        this.f227782a.mo28042ab(false);
        new Handler().post(new C83550v(this));
    }
}
