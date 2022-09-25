package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.d */
/* compiled from: PG */
public final /* synthetic */ class C103981d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103981d f289380a = new C103981d();

    private /* synthetic */ C103981d() {
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
        C58974d dVar = C104123t.f289645a;
        C29690f fVar = ((C48770b) obj).f126196a;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        return a.equals(C29689e.DOWNLOADED);
    }
}
