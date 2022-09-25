package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4545b.C59363ad;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59392z;
import com.google.protobuf.C62963cj;
import com.google.speech.p5218j.C66964g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.q */
/* compiled from: PG */
public final /* synthetic */ class C10955q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10879g f36074a;

    public /* synthetic */ C10955q(C10879g gVar) {
        this.f36074a = gVar;
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
        C58833ax axVar;
        C10879g gVar = this.f36074a;
        C10882h hVar = (C10882h) obj;
        C58974d dVar = C10812ap.f35848a;
        if (gVar.f35964e.size() == 0) {
            return true;
        }
        C58485gu j = C58485gu.m89842j(new C62963cj(gVar.f35964e, C10879g.f35957f));
        if ((gVar.f35960a & 4) != 0) {
            C66964g a = C66964g.m97396a(gVar.f35963d);
            if (a == null) {
                a = C66964g.UNKNOWN;
            }
            axVar = C58833ax.m90834k(a);
        } else {
            axVar = C58836b.f156633a;
        }
        C59364ae j2 = C59364ae.m92266l(hVar.mo19286e()).mo56901j(new C10960v(axVar));
        C59363ad adVar = (C59363ad) j2;
        return adVar.f157565b.anyMatch(new C59392z(adVar, new C10799ac(j)));
    }
}
