package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.core.TypeLimits;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42427f;
import com.google.android.libraries.social.populous.p3296e.p3301e.C42518g;
import com.google.android.libraries.social.populous.storage.C42675cv;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69302j;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69308p;

/* renamed from: com.google.android.libraries.social.populous.e.a.g */
/* compiled from: PG */
public final /* synthetic */ class C42392g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42401p f111174a;

    /* renamed from: b */
    public final /* synthetic */ C42549n f111175b;

    /* renamed from: c */
    public final /* synthetic */ int f111176c;

    public /* synthetic */ C42392g(C42401p pVar, C42549n nVar, int i) {
        this.f111174a = pVar;
        this.f111175b = nVar;
        this.f111176c = i;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C58833ax axVar;
        C57883f fVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C60870cx cxVar4;
        C60870cx cxVar5;
        C42401p pVar = this.f111174a;
        C42549n nVar = this.f111175b;
        int i = this.f111176c;
        Void voidR = (Void) obj;
        boolean isEmpty = nVar.f111605b.isEmpty();
        C58528ij<C42262ao> ijVar = nVar.f111609f.f110725k;
        C58526ih ihVar = new C58526ih();
        for (C42262ao ordinal : ijVar) {
            C42262ao aoVar = C42262ao.EMAIL;
            int ordinal2 = ordinal.ordinal();
            if (ordinal2 == 0) {
                ihVar.mo55373c(C42675cv.EMAIL.name());
            } else if (ordinal2 == 1) {
                ihVar.mo55373c(C42675cv.PHONE.name());
            } else if (ordinal2 == 3) {
                ihVar.mo55373c(C42675cv.GROUP.name());
            } else if (ordinal2 == 4) {
                ihVar.mo55373c(C42675cv.CONTACT_LABEL.name());
            } else if (ordinal2 == 5) {
                ihVar.mo55373c(C42675cv.IN_APP_NOTIFICATION_TARGET.name());
                ihVar.mo55373c(C42675cv.IN_APP_EMAIL.name());
                ihVar.mo55373c(C42675cv.IN_APP_PHONE.name());
                ihVar.mo55373c(C42675cv.IN_APP_GAIA.name());
            }
        }
        C58528ij f = ihVar.mo55486f();
        long b = pVar.f111203h.f110538c.mo26870b();
        long a = b - C69302j.f185437a.mo6453a().mo60975a();
        SessionContext sessionContext = nVar.f111607d;
        String str = sessionContext.f110813g;
        if (isEmpty) {
            C58833ax axVar2 = sessionContext.f110812f;
            if (axVar2.mo56113h()) {
                C58480gp e = C58485gu.m89837e();
                C58872ci b2 = pVar.f111199d.mo45632b();
                C58801sm G = ((TypeLimits) axVar2.mo56107c()).f110830a.listIterator(0);
                while (G.hasNext()) {
                    TypeLimits.TypeLimitSet typeLimitSet = (TypeLimits.TypeLimitSet) G.next();
                    int i2 = C42401p.m74644i(nVar, typeLimitSet.f110832b);
                    C58528ij e2 = C42401p.m74643e(typeLimitSet.f110831a);
                    if (((C42427f) nVar.f111610g).f111291a == 2) {
                        cxVar5 = pVar.f111196a.mo45695d().mo45726h(e2, f, i2);
                    } else {
                        cxVar5 = pVar.f111196a.mo45695d().mo45724f(e2, f, i2);
                    }
                    e.mo55395g(cxVar5);
                }
                cxVar = pVar.mo45374f(b2, e.mo55394f(), C42401p.m74645j(str) ? pVar.f111196a.mo45697f().mo45747b(f, str, a) : null, nVar);
            } else {
                int i3 = C42401p.m74644i(nVar, nVar.f111609f.mo45105b());
                C58872ci b3 = pVar.f111199d.mo45632b();
                if (((C42427f) nVar.f111610g).f111291a == 2) {
                    cxVar4 = pVar.f111196a.mo45695d().mo45725g(f, i3);
                } else {
                    cxVar4 = pVar.f111196a.mo45695d().mo45723e(f, i3);
                }
                cxVar = pVar.mo45374f(b3, C58485gu.m89846n(cxVar4), C42401p.m74645j(str) ? pVar.f111196a.mo45697f().mo45747b(f, str, a) : null, nVar);
            }
        } else {
            C58833ax axVar3 = sessionContext.f110812f;
            if (axVar3.mo56113h()) {
                C58485gu j = C58485gu.m89842j(C58597ky.m90217h(C42518g.m74966c(nVar.f111605b, false), C42391f.f111173a));
                C58480gp e3 = C58485gu.m89837e();
                C58872ci b4 = pVar.f111199d.mo45632b();
                C58801sm G2 = ((TypeLimits) axVar3.mo56107c()).f110830a.listIterator(0);
                while (G2.hasNext()) {
                    TypeLimits.TypeLimitSet typeLimitSet2 = (TypeLimits.TypeLimitSet) G2.next();
                    int i4 = C42401p.m74644i(nVar, typeLimitSet2.f110832b);
                    C58528ij e4 = C42401p.m74643e(typeLimitSet2.f110831a);
                    C58801sm smVar = G2;
                    if (((C42427f) nVar.f111610g).f111291a == 2) {
                        cxVar3 = pVar.f111196a.mo45695d().mo45722d(j, e4, f, i4);
                    } else {
                        cxVar3 = pVar.f111196a.mo45695d().mo45720b(j, e4, f, i4);
                    }
                    e3.mo55395g(cxVar3);
                    G2 = smVar;
                }
                cxVar = pVar.mo45374f(b4, e3.mo55394f(), C42401p.m74645j(str) ? pVar.f111196a.mo45697f().mo45746a(j, f, str, a) : null, nVar);
            } else {
                C58485gu j2 = C58485gu.m89842j(C58597ky.m90217h(C42518g.m74966c(nVar.f111605b, false), C42386a.f111167a));
                int i5 = C42401p.m74644i(nVar, nVar.f111609f.mo45105b());
                C58872ci b5 = pVar.f111199d.mo45632b();
                if (((C42427f) nVar.f111610g).f111291a == 2) {
                    cxVar2 = pVar.f111196a.mo45695d().mo45721c(j2, f, i5);
                } else {
                    cxVar2 = pVar.f111196a.mo45695d().mo45719a(j2, f, i5);
                }
                cxVar = pVar.mo45374f(b5, C58485gu.m89846n(cxVar2), C42401p.m74645j(str) ? pVar.f111196a.mo45697f().mo45746a(j2, f, str, a) : null, nVar);
            }
        }
        if (C42401p.m74645j(str)) {
            if (C69302j.f185437a.mo6453a().mo60979e()) {
                C60856cj.m92911t(cxVar, new C42399n(pVar, b), pVar.f111197b);
            } else {
                pVar.mo45376h(C60922j.m93045h(cxVar, new C42388c(pVar, b), pVar.f111197b));
            }
        }
        if (C69308p.m100586e()) {
            C58833ax a2 = pVar.f111200e.mo45322a();
            if (a2.mo56113h()) {
                axVar = (C58833ax) a2.mo56107c();
            } else {
                axVar = C58836b.f156633a;
            }
        } else {
            axVar = (C58833ax) pVar.f111202g.get();
        }
        C58833ax axVar4 = axVar;
        return C60922j.m93044g(cxVar, new C42395j(pVar, i, axVar4, (Long) axVar4.mo56106b(C42394i.f111178a).mo56111f(), (!axVar4.mo56113h() || (fVar = ((C42680d) axVar4.mo56107c()).f111895d) == null) ? null : Integer.valueOf(fVar.f154842b)), pVar.f111197b);
    }
}
