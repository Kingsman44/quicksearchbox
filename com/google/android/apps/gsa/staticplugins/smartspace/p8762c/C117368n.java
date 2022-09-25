package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.assistant.p3886c.C50780cd;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57019k;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.n */
/* compiled from: PG */
public final class C117368n implements C117356b {

    /* renamed from: a */
    private final C91189au f325823a;

    /* renamed from: b */
    private final C60888db f325824b;

    /* renamed from: c */
    private final C86124t f325825c;

    public C117368n(C86124t tVar, C91189au auVar, C90851k kVar) {
        this.f325825c = tVar;
        this.f325823a = auVar;
        this.f325824b = kVar.mo85208a("backgroundExecutor");
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: b */
    public final C60870cx mo103277b(C92113i iVar) {
        Object obj;
        C58833ax axVar;
        C58833ax axVar2;
        C60870cx e = C92025g.m151036e(iVar, this.f325824b, this.f325823a, this.f325825c);
        C50818do doVar = iVar.f256820a;
        if ((doVar.f132304a & 33554432) == 0) {
            return e;
        }
        C50813dj djVar = doVar.f132329z;
        if (djVar == null) {
            djVar = C50813dj.f132278a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C50780cd.f132146d);
        djVar.mo58887l(r0);
        if (!djVar.f169962ag.mo58857o(r0.f169971d)) {
            return e;
        }
        C50813dj djVar2 = doVar.f132329z;
        if (djVar2 == null) {
            djVar2 = C50813dj.f132278a;
        }
        C62940bt r02 = C62942bv.checkIsLite(C50780cd.f132146d);
        djVar2.mo58887l(r02);
        Object l = djVar2.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C50780cd cdVar = (C50780cd) obj;
        if ((cdVar.f132148a & 1) == 0) {
            return e;
        }
        C57019k kVar = cdVar.f132149b;
        if (kVar == null) {
            kVar = C57019k.f152221j;
        }
        C57019k kVar2 = kVar;
        if ((kVar2.f152223a & 32) != 0) {
            axVar = C58833ax.m90834k(kVar2.f152229g);
        } else {
            axVar = C58836b.f156633a;
        }
        C60870cx c = mo103279c(axVar);
        if ((kVar2.f152223a & 64) != 0) {
            axVar2 = C58833ax.m90834k(kVar2.f152230h);
        } else {
            axVar2 = C58836b.f156633a;
        }
        C60870cx c2 = mo103279c(axVar2);
        return C60856cj.m92893b(c, c2, e).mo57334a(new C117367m(kVar2, c, c2, e, doVar), this.f325824b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo103279c(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C92025g.m151035d((String) axVar.mo56107c(), this.f325823a, this.f325824b);
    }
}
