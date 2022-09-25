package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.lifecycle.C43878b;
import com.google.android.libraries.web.p3418j.C43841f;
import com.google.android.libraries.web.p3418j.C43843h;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.web.j.a.x */
/* compiled from: PG */
public final class C43835x {

    /* renamed from: a */
    private final Supplier f114267a;

    /* renamed from: b */
    private final Map f114268b = new HashMap();

    /* renamed from: c */
    private final int f114269c;

    public C43835x(int i, Supplier supplier) {
        this.f114269c = i;
        this.f114267a = supplier;
    }

    /* renamed from: b */
    private final C43878b m77371b() {
        C43878b bVar = (C43878b) this.f114267a.get();
        C58838bb.m90866a(bVar, "This WebStoreOwner does not support having children.");
        return bVar;
    }

    /* renamed from: a */
    public final C43841f mo46846a(String str, C43843h hVar, C43833v vVar) {
        C43841f fVar = (C43841f) this.f114268b.get(str);
        if (fVar == null) {
            int i = this.f114269c - 1;
            fVar = new C43829r(i != 0 ? i != 1 ? new C43831t(hVar.mo46831a()) : C43824m.m77350e(str, hVar, vVar, m77371b()) : new C43828q(C43824m.m77350e(str, hVar, vVar, m77371b()), new C43831t(hVar.mo46831a())));
            this.f114268b.put(str, fVar);
        }
        return fVar;
    }
}
