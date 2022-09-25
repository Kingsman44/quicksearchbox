package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.l */
/* compiled from: PG */
public final class C27956l implements C27965u {

    /* renamed from: a */
    public final C27965u f76115a;

    /* renamed from: b */
    public final C27965u f76116b;

    /* renamed from: c */
    public C27965u f76117c;

    public C27956l(C27965u uVar, C27965u uVar2, LensConnectivityManager lensConnectivityManager) {
        this.f76115a = uVar;
        this.f76116b = uVar2;
        this.f76117c = !lensConnectivityManager.mo30907k() ? uVar2 : uVar;
        lensConnectivityManager.mo30904h(new C27955k(this), true);
    }

    /* renamed from: a */
    public final C60870cx mo33423a(String str, String str2, C27966v vVar) {
        return this.f76117c.mo33423a(str, str2, vVar);
    }

    /* renamed from: b */
    public final void mo33424b(String str, String str2) {
        this.f76117c.mo33424b(str, str2);
    }

    /* renamed from: c */
    public final void mo33425c() {
        this.f76116b.mo33425c();
        this.f76115a.mo33425c();
    }

    /* renamed from: d */
    public final void mo33426d() {
        this.f76116b.mo33426d();
        this.f76115a.mo33426d();
    }

    /* renamed from: e */
    public final boolean mo33427e(String... strArr) {
        return this.f76117c.mo33427e(strArr);
    }

    /* renamed from: f */
    public final boolean mo33428f() {
        return this.f76117c.mo33428f();
    }
}
