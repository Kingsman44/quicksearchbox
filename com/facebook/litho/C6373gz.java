package com.facebook.litho;

import com.facebook.litho.p322a.C6076i;
import com.facebook.litho.p322a.C6077j;
import com.facebook.litho.p322a.C6085r;

/* renamed from: com.facebook.litho.gz */
/* compiled from: PG */
public final class C6373gz {

    /* renamed from: a */
    final /* synthetic */ C6376ha f18848a;

    public C6373gz(C6376ha haVar) {
        this.f18848a = haVar;
    }

    /* renamed from: a */
    public final float mo13386a(C6085r rVar) {
        C6259fb fbVar;
        C6076i iVar = rVar.f17978b;
        C6369gv gvVar = (C6369gv) this.f18848a.f18862b.mo13380a(rVar.f17977a);
        C6370gw gwVar = (C6370gw) gvVar.f18832a.get(iVar);
        if (gwVar != null) {
            return gwVar.f18840a.f18404c;
        }
        if (gvVar.f18834c == 0) {
            fbVar = gvVar.f18836e;
        } else {
            fbVar = gvVar.f18835d;
        }
        if (fbVar != null) {
            return iVar.mo12764e((C6185de) fbVar.mo13250b());
        }
        throw new RuntimeException("Both LayoutOutputs were null!");
    }

    /* renamed from: b */
    public final C6077j mo13387b(C6085r rVar) {
        return ((C6370gw) ((C6369gv) this.f18848a.f18862b.mo13380a(rVar.f17977a)).f18832a.get(rVar.f17978b)).f18840a;
    }
}
