package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.gsa.assistant.shared.k.a.f;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109369d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109370e;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.l */
/* compiled from: PG */
public final /* synthetic */ class C109413l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C109422u f304710a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f304711b;

    /* renamed from: c */
    public final /* synthetic */ String f304712c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f304713d;

    public /* synthetic */ C109413l(C109422u uVar, C60870cx cxVar, String str, C60870cx cxVar2) {
        this.f304710a = uVar;
        this.f304711b = cxVar;
        this.f304712c = str;
        this.f304713d = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C109422u uVar = this.f304710a;
        C60870cx cxVar = this.f304711b;
        String str = this.f304712c;
        C60870cx cxVar2 = this.f304713d;
        f fVar = (f) C60856cj.m92909r(cxVar);
        if (fVar.b.equals(str) && !fVar.c.isEmpty() && uVar.mo97819d(fVar)) {
            return C60856cj.m92900i(true);
        }
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        if (!axVar.mo56113h() || !uVar.mo97820e((C53615x) axVar.mo56107c())) {
            return C60856cj.m92900i(false);
        }
        C62971cq cqVar = ((C53615x) axVar.mo56107c()).f140724a;
        C109369d dVar = new C109369d();
        dVar.mo97809b(str);
        if (uVar.f304736b.mo79746e(C90037cp.f248422aC)) {
            dVar.mo97808a();
        }
        if (uVar.f304736b.mo79746e(C90037cp.f248471az)) {
            dVar.mo97810c();
        }
        List a = new C109370e(dVar).mo97811a(cqVar);
        if (a.isEmpty()) {
            return C60856cj.m92900i(false);
        }
        C60870cx g = C60922j.m93044g(((C109398av) uVar.f304739e.mo27525b()).mo97813a(a), C109412k.f304709a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
