package com.google.android.libraries.lens.view.p2113h.p2125g;

import com.google.android.libraries.lens.view.p2113h.p2115b.p2116a.C26679q;
import com.google.android.libraries.lens.view.p2113h.p2115b.p2117b.C26701t;
import com.google.android.libraries.lens.view.p2113h.p2115b.p2118c.C26704a;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26739ah;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26743al;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26772x;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.h.g.c */
/* compiled from: PG */
final class C26835c {

    /* renamed from: a */
    private static final C58974d f73137a = C58974d.m91135i("CameraModule");

    /* renamed from: a */
    static C26774z m49679a(boolean z, boolean z2, boolean z3, C26772x xVar) {
        if (z) {
            return C26774z.LENS_TELECAMERA;
        }
        if (z3 || ((C58485gu) xVar.f72950c.mo6453a()).isEmpty()) {
            return C26774z.NO_OP;
        }
        boolean z4 = xVar.mo32137a() == 2;
        ((C58970a) ((C58970a) f73137a.mo56224b()).mo56372aa(49228)).mo56358K("shouldUseCamera1: isLegacyDevice[%b], forceCamera1[%b]", z4, z2);
        if (z4 || z2) {
            return C26774z.LENS_CAMERA_1_EXP;
        }
        return C26774z.LENS_CAMERA_2;
    }

    /* renamed from: b */
    static C26739ah m49680b(C26774z zVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, Set set, C26764p pVar) {
        C26774z zVar2 = C26774z.LENS_CAMERA_1_EXP;
        int ordinal = zVar.ordinal();
        if (ordinal == 0) {
            pVar.mo31947l(2);
            C26679q qVar = (C26679q) aVar.mo17428b();
            Objects.requireNonNull(qVar);
            set.add(new C26833a(qVar));
            return qVar;
        } else if (ordinal == 1) {
            pVar.mo31947l(3);
            C26701t tVar = (C26701t) aVar2.mo17428b();
            Objects.requireNonNull(tVar);
            set.add(new C26834b(tVar));
            return tVar;
        } else if (ordinal == 2) {
            return (C26739ah) aVar3.mo17428b();
        } else {
            if (ordinal == 3) {
                pVar.mo31947l(4);
                C26704a aVar5 = (C26704a) aVar4.mo17428b();
                aVar5.f72819a.mo31936a();
                return aVar5;
            }
            throw new IllegalStateException("Cannot provide a LensCamera for camera type ".concat(String.valueOf(zVar.name())));
        }
    }

    /* renamed from: c */
    static C58833ax m49681c(boolean z, C69464a aVar) {
        return z ? C58833ax.m90834k((C26743al) aVar.mo17428b()) : C58836b.f156633a;
    }
}
