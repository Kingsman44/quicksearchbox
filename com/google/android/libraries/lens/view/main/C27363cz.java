package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.main.cz */
/* compiled from: PG */
public final /* synthetic */ class C27363cz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C27228h f74855a;

    public /* synthetic */ C27363cz(C27228h hVar) {
        this.f74855a = hVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C27228h hVar = this.f74855a;
        C24226r rVar = (C24226r) obj;
        C59071e eVar = C27384dt.f74877a;
        return hVar.mo32673f().mo56107c() == rVar;
    }
}
