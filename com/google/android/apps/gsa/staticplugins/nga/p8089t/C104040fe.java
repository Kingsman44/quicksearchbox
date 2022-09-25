package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.shared.p6973ad.C89085a;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fe */
/* compiled from: PG */
public final class C104040fe implements C89085a {

    /* renamed from: a */
    private final C68214a f289495a;

    /* renamed from: b */
    private final C104079gq f289496b;

    public C104040fe(C68214a aVar, C104079gq gqVar) {
        this.f289495a = aVar;
        this.f289496b = gqVar;
    }

    /* renamed from: a */
    public final void mo83057a(String str) {
        if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK") || str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
            mo93929c();
        }
    }

    /* renamed from: b */
    public final void mo83058b(String str, Throwable th) {
    }

    /* renamed from: c */
    public final void mo93929c() {
        if (this.f289496b.mo93939b()) {
            Collection.EL.stream((Set) this.f289495a.mo27525b()).forEach(C104039fd.f289494a);
        }
    }
}
