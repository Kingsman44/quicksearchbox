package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59799g;
import com.google.common.p4552o.C60003j;
import com.google.common.p4552o.p4553a.C59476b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.h.b */
/* compiled from: PG */
public class C22697b implements C22720x {

    /* renamed from: d */
    public static final C60870cx f62475d = C60856cj.m92900i(C22402a.f61894b);

    /* renamed from: o */
    public static C58485gu m42245o(C22722z zVar) {
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = ((C22707k) zVar).f62506c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C22715s sVar = (C22715s) guVar.get(i);
            if (sVar.mo27848c() != C22714r.POSTPONED) {
                C59799g gVar = (C59799g) C60003j.f162165g.createBuilder();
                String e2 = sVar.mo27850e();
                gVar.copyOnWrite();
                C60003j jVar = (C60003j) gVar.instance;
                e2.getClass();
                int i2 = 1;
                jVar.f162167a |= 1;
                jVar.f162168b = e2;
                long b = sVar.mo27847b();
                gVar.copyOnWrite();
                C60003j jVar2 = (C60003j) gVar.instance;
                jVar2.f162167a |= 8;
                jVar2.f162171e = b;
                long a = sVar.mo27846a();
                gVar.copyOnWrite();
                C60003j jVar3 = (C60003j) gVar.instance;
                jVar3.f162167a |= 16;
                jVar3.f162172f = a;
                int ordinal = sVar.mo27848c().ordinal();
                if (ordinal == 1) {
                    C52236kg kgVar = sVar.mo27849d().f136654b;
                    if (kgVar == null) {
                        kgVar = C52236kg.f137089d;
                    }
                    C52235kf a2 = C52235kf.m86549a(kgVar.f137092b);
                    if (a2 == null) {
                        a2 = C52235kf.OK;
                    }
                    int i3 = a2.f137088t;
                    gVar.copyOnWrite();
                    C60003j jVar4 = (C60003j) gVar.instance;
                    jVar4.f162167a |= 2;
                    jVar4.f162169c = i3;
                    i2 = 2;
                } else if (ordinal == 3) {
                    int i4 = C52235kf.UNKNOWN.f137088t;
                    gVar.copyOnWrite();
                    C60003j jVar5 = (C60003j) gVar.instance;
                    jVar5.f162167a = 2 | jVar5.f162167a;
                    jVar5.f162169c = i4;
                    i2 = 3;
                } else if (ordinal == 4) {
                    int i5 = C52235kf.CANCELLED.f137088t;
                    gVar.copyOnWrite();
                    C60003j jVar6 = (C60003j) gVar.instance;
                    jVar6.f162167a = 2 | jVar6.f162167a;
                    jVar6.f162169c = i5;
                    i2 = 4;
                }
                gVar.copyOnWrite();
                C60003j jVar7 = (C60003j) gVar.instance;
                jVar7.f162170d = i2 - 1;
                jVar7.f162167a |= 4;
                e.mo55395g((C60003j) gVar.build());
            }
        }
        return e.mo55394f();
    }

    /* renamed from: p */
    protected static final void m42246p(C22722z zVar, C22684a aVar) {
        aVar.mo27785a(zVar.mo27879f(), m42245o(zVar));
    }

    /* renamed from: a */
    public void mo27813a(C22722z zVar) {
    }

    /* renamed from: b */
    public C60870cx mo27814b(C51809dy dyVar, C58833ax axVar) {
        return f62475d;
    }

    /* renamed from: c */
    public void mo27815c(C59476b bVar) {
    }

    /* renamed from: d */
    public void mo27816d(C58833ax axVar) {
    }

    /* renamed from: e */
    public void mo27817e(C22688aa aaVar, C58833ax axVar) {
    }

    /* renamed from: f */
    public void mo27818f(C22689ab abVar) {
    }

    /* renamed from: g */
    public void mo27819g() {
    }

    /* renamed from: h */
    public void mo27694h(String str, String str2, boolean z) {
    }

    /* renamed from: i */
    public void mo27820i(C51809dy dyVar, C58833ax axVar) {
    }

    /* renamed from: j */
    public void mo27821j(boolean z) {
    }

    /* renamed from: k */
    public void mo27822k() {
    }

    /* renamed from: l */
    public void mo27823l() {
    }

    /* renamed from: n */
    public /* synthetic */ boolean mo27824n() {
        return true;
    }

    /* renamed from: q */
    public final void mo27825q() {
    }

    /* renamed from: r */
    public final void mo27826r() {
    }

    /* renamed from: s */
    public final void mo27827s() {
    }

    /* renamed from: u */
    public void mo27828u() {
    }
}
