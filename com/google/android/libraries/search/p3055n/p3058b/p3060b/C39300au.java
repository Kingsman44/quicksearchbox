package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.search.n.b.b.au */
/* compiled from: PG */
public final /* synthetic */ class C39300au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39318bl f103528a;

    /* renamed from: b */
    public final /* synthetic */ C39670cx f103529b;

    /* renamed from: c */
    public final /* synthetic */ C19347o f103530c;

    public /* synthetic */ C39300au(C39318bl blVar, C39670cx cxVar, C19347o oVar) {
        this.f103528a = blVar;
        this.f103529b = cxVar;
        this.f103530c = oVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C39318bl blVar = this.f103528a;
        C39670cx cxVar = this.f103529b;
        C19347o oVar = this.f103530c;
        Void voidR = (Void) obj;
        C39280aa aaVar = blVar.f103561b;
        C62940bt r9 = C62942bv.checkIsLite(C39655ci.f104378k);
        cxVar.mo58887l(r9);
        Object l = cxVar.f169962ag.mo58854l(r9.f169971d);
        if (l == null) {
            obj2 = r9.f169969b;
        } else {
            obj2 = r9.mo58889c(l);
        }
        C39655ci ciVar = (C39655ci) obj2;
        C39319bm bmVar = blVar.f103563d;
        Context context = bmVar.f103565b;
        boolean z = bmVar.f103573j;
        aaVar.f103482m.ifPresent(new C39347v(ciVar));
        return aaVar.mo41759e(ciVar, oVar, context, false, z);
    }
}
