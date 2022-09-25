package com.google.android.apps.gsa.sidekick.main.p7223o;

import com.google.android.apps.p489g.p491b.p492a.C9124b;
import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C8090vd;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.sidekick.main.o.b */
/* compiled from: PG */
public final /* synthetic */ class C91554b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C91554b f255353a = new C91554b();

    private /* synthetic */ C91554b() {
    }

    public final Object apply(Object obj) {
        C8090vd vdVar = (C8090vd) obj;
        try {
            return String.valueOf(((C9124b) C62942bv.parseFrom((C62942bv) C9124b.f31408b, vdVar.toByteString())).f31410a);
        } catch (C62974ct unused) {
            int a = C56992b.m88249a(vdVar.f28452b);
            if (a == 0) {
                a = 1;
            }
            return String.valueOf(a - 1);
        }
    }
}
