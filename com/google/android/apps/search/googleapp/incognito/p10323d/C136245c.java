package com.google.android.apps.search.googleapp.incognito.p10323d;

import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;

/* renamed from: com.google.android.apps.search.googleapp.incognito.d.c */
/* compiled from: PG */
public final class C136245c {

    /* renamed from: a */
    private final C136139t f371035a;

    /* renamed from: b */
    private final boolean f371036b;

    public C136245c(C136139t tVar, boolean z) {
        this.f371035a = tVar;
        this.f371036b = z;
    }

    /* renamed from: a */
    public final boolean mo112857a() {
        C38510a a = this.f371035a.mo112792a();
        C38510a aVar = C38510a.OPT_OUT;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return this.f371036b;
        }
        if (ordinal == 2) {
            return true;
        }
        throw new AssertionError("Unhandled enum value");
    }
}
