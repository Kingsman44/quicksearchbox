package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d;

import com.google.android.gms.facs.cache.C144184l;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.tasks.C146006ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.af.a.b.c.d.c */
/* compiled from: PG */
public final class C147527c {

    /* renamed from: a */
    public final C144184l f398180a;

    /* renamed from: b */
    private final String f398181b;

    public C147527c(C144184l lVar, String str) {
        this.f398180a = lVar;
        this.f398181b = str;
    }

    /* renamed from: b */
    public static C60870cx m240532b(C146006ab abVar) {
        SettableFuture settableFuture = new SettableFuture();
        abVar.mo122493l(C60826bg.f164896a, new C147526b(settableFuture));
        return settableFuture;
    }

    /* renamed from: a */
    public final FacsCacheCallOptions mo124298a() {
        return new FacsCacheCallOptions(this.f398181b, 1);
    }
}
