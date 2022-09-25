package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.h.ac */
/* compiled from: PG */
final class C29493ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f79920a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f79921b;

    public C29493ac(String str, C58833ax axVar) {
        this.f79920a = str;
        this.f79921b = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C29045l.m53938j(th, "%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.f79920a, String.valueOf(this.f79921b.mo56111f()), "null");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C29045l.m53932d("%s: Added file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.f79920a, String.valueOf(this.f79921b.mo56111f()), "null");
            return;
        }
        C29045l.m53932d("%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.f79920a, String.valueOf(this.f79921b.mo56111f()), "null");
    }
}
