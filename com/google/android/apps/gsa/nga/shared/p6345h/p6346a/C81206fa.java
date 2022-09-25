package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fa */
/* compiled from: PG */
public final class C81206fa {

    /* renamed from: a */
    public final C68214a f222345a;

    /* renamed from: b */
    private final C22871g f222346b;

    public C81206fa(C68214a aVar, C22871g gVar) {
        this.f222345a = aVar;
        this.f222346b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo74966a() {
        return this.f222346b.mo28201a("[NGA] InitializePreferenceCache", new C81204ez(this));
    }

    /* renamed from: b */
    public final C60870cx mo74967b(C81251ap apVar) {
        C81251ap apVar2 = C81251ap.NGA_STARTUP_PREFERENCES;
        int ordinal = apVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return mo74968c();
        }
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo74968c() {
        return ((C81174dw) this.f222345a.mo27525b()).mo74935d();
    }
}
