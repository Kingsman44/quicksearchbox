package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.search.n.b.b.an */
/* compiled from: PG */
public final /* synthetic */ class C39293an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39319bm f103517a;

    /* renamed from: b */
    public final /* synthetic */ C39670cx f103518b;

    public /* synthetic */ C39293an(C39319bm bmVar, C39670cx cxVar) {
        this.f103517a = bmVar;
        this.f103518b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C39319bm bmVar = this.f103517a;
        C39670cx cxVar = this.f103518b;
        Void voidR = (Void) obj;
        C39280aa aaVar = bmVar.f103570g;
        C62940bt r2 = C62942bv.checkIsLite(C39666ct.f104416f);
        cxVar.mo58887l(r2);
        Object l = cxVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj2 = r2.f169969b;
        } else {
            obj2 = r2.mo58889c(l);
        }
        C39666ct ctVar = (C39666ct) obj2;
        Context context = bmVar.f103565b;
        boolean z = bmVar.f103573j;
        boolean z2 = true;
        if (aaVar.f103491v != 1) {
            z2 = false;
        }
        C58838bb.m90884s(z2, "#backgroundUpdate failed due to ongoing ASR.");
        return aaVar.f103471b.mo51512b(new C39348w(aaVar, ctVar, context, z), aaVar.f103473d);
    }
}
