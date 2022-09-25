package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c;

import com.google.assistant.p3803ag.p3804a.C48796ad;
import com.google.assistant.p3803ag.p3804a.C48862e;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.c.d */
/* compiled from: PG */
public final /* synthetic */ class C107424d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107424d f298959a = new C107424d();

    private /* synthetic */ C107424d() {
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
        C48862e eVar;
        C48865h hVar = (C48865h) obj;
        C48864g a = C48864g.m85285a(hVar.f126460d);
        if (a == null) {
            a = C48864g.TYPE_UNSPECIFIED;
        }
        if (a != C48864g.SHOW_MOBILE_NOTIFICATION) {
            return false;
        }
        if (hVar.f126458b == 4) {
            eVar = (C48862e) hVar.f126459c;
        } else {
            eVar = C48862e.f126439a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C48796ad.f126260c);
        eVar.mo58887l(r0);
        return eVar.f169962ag.mo58857o(r0.f169971d);
    }
}
