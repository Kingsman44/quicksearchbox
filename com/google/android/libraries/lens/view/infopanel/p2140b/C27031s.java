package com.google.android.libraries.lens.view.infopanel.p2140b;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4702h.p4703a.p4704a.C62367d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.C66198dl;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.s */
/* compiled from: PG */
public final class C27031s implements C21270bm {

    /* renamed from: a */
    public static final C58974d f73679a = C58974d.m91135i("LoggingProperties");

    /* renamed from: b */
    public final Set f73680b = new HashSet();

    /* renamed from: a */
    public final C62917ay mo25837a() {
        return C66198dl.f180009c;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        Object obj2;
        C66198dl dlVar = (C66198dl) obj;
        C62940bt r1 = C62942bv.checkIsLite(C62367d.f168366e);
        dlVar.mo58887l(r1);
        if (dlVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C62367d.f168366e);
            dlVar.mo58887l(r12);
            Object l = dlVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj2 = r12.f169969b;
            } else {
                obj2 = r12.mo58889c(l);
            }
            C62367d dVar = (C62367d) obj2;
            if ((dVar.f168368a & 1) != 0) {
                arVar.mo25948v(new C27030r(this, dVar));
                arVar.mo25943q(new C27029q(this, dVar));
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }

    /* renamed from: d */
    public final void mo32475d(C27026n nVar) {
        this.f73680b.add(nVar);
    }

    /* renamed from: e */
    public final void mo32476e(C27026n nVar) {
        this.f73680b.remove(nVar);
    }
}
