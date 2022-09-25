package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.assistant.p1528m.p1529a.C18430o;
import com.google.android.libraries.assistant.p1528m.p1530b.C18432a;
import com.google.android.libraries.assistant.p1528m.p1530b.C18433b;
import com.google.assistant.p3745ab.p3746a.C48177a;
import com.google.assistant.p3745ab.p3746a.C48178b;
import com.google.assistant.p3745ab.p3746a.C48179c;
import com.google.assistant.p3745ab.p3746a.C48188l;
import com.google.assistant.p3745ab.p3746a.C48189m;
import com.google.assistant.p3745ab.p3746a.C48190n;
import com.google.assistant.p3745ab.p3746a.C48194r;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4580v.C60950i;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bb */
/* compiled from: PG */
public final class C106030bb {

    /* renamed from: a */
    public static final C59071e f296034a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ac.bb");

    /* renamed from: b */
    public static final C106027az f296035b = new C106027az();

    /* renamed from: e */
    private static final C106029ba f296036e = new C106029ba();

    /* renamed from: c */
    public final C18433b f296037c;

    /* renamed from: d */
    public final C60950i f296038d;

    public C106030bb(C86124t tVar, C60950i iVar) {
        this.f296037c = new C18433b((int) tVar.mo79743a(C90014bt.f247093ae));
        this.f296038d = iVar;
    }

    /* renamed from: c */
    public static void m176635c(C48190n nVar, C51842bc bcVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1600;
        C48179c cVar = (C48179c) C48194r.f124712g.createBuilder();
        C48177a aVar = (C48177a) C18432a.m35904a(bcVar).toBuilder();
        C52431rm b = C52431rm.m86628b(bcVar.f136003d);
        if (b == null) {
            b = C52431rm.UNKNOWN;
        }
        aVar.copyOnWrite();
        C48178b bVar = (C48178b) aVar.instance;
        bVar.f124664d = b.f137633ah;
        bVar.f124661a |= 8;
        String str = bcVar.f136004e;
        aVar.copyOnWrite();
        C48178b bVar2 = (C48178b) aVar.instance;
        str.getClass();
        bVar2.f124661a |= 16;
        bVar2.f124665e = str;
        C48178b bVar3 = (C48178b) aVar.build();
        cVar.copyOnWrite();
        C48194r rVar = (C48194r) cVar.instance;
        bVar3.getClass();
        rVar.f124715b = bVar3;
        rVar.f124714a |= 1;
        cVar.copyOnWrite();
        C48194r rVar2 = (C48194r) cVar.instance;
        nVar.getClass();
        rVar2.f124719f = nVar;
        rVar2.f124714a |= 512;
        C48194r rVar3 = (C48194r) cVar.build();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        rVar3.getClass();
        ufVar2.f164235cm = rVar3;
        ufVar2.f164255j |= 8;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95247a(com.google.assistant.p3897e.p3921j.p3926e.C51842bc r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r8.hashCode()
            r1 = -446239562(0xffffffffe566ecb6, float:-6.8156927E22)
            r2 = -1
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1808577511(0x6bccb3e7, float:4.9494086E26)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "RELEASE"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "ACQUIRE"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0025
            r8 = 0
            goto L_0x0026
        L_0x0025:
            r8 = -1
        L_0x0026:
            r0 = 2
            if (r8 == 0) goto L_0x002f
            if (r8 == r3) goto L_0x002d
            r8 = 1
            goto L_0x0030
        L_0x002d:
            r8 = 3
            goto L_0x0030
        L_0x002f:
            r8 = 2
        L_0x0030:
            if (r8 != r3) goto L_0x0047
            com.google.common.f.e r7 = f296034a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "ImmersiveCanvasErrorLogger"
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "Wake lock action is unspecified"
            r0 = 24697(0x6079, float:3.4608E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x0047:
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r0 = r0 | r5
            r4.f164093a = r0
            r0 = 1594(0x63a, float:2.234E-42)
            r4.f164258m = r0
            com.google.assistant.ab.a.r r0 = com.google.assistant.p3745ab.p3746a.C48194r.f124712g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ab.a.c r0 = (com.google.assistant.p3745ab.p3746a.C48179c) r0
            com.google.assistant.ab.a.b r7 = com.google.android.libraries.assistant.p1528m.p1530b.C18432a.m35904a(r7)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.ab.a.r r4 = (com.google.assistant.p3745ab.p3746a.C48194r) r4
            r7.getClass()
            r4.f124715b = r7
            int r7 = r4.f124714a
            r7 = r7 | r3
            r4.f124714a = r7
            com.google.assistant.ab.a.q r7 = com.google.assistant.p3745ab.p3746a.C48193q.f124708c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.ab.a.p r7 = (com.google.assistant.p3745ab.p3746a.C48192p) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.assistant.ab.a.q r4 = (com.google.assistant.p3745ab.p3746a.C48193q) r4
            int r8 = r8 + r2
            r4.f124711b = r8
            int r8 = r4.f124710a
            r8 = r8 | r3
            r4.f124710a = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.ab.a.q r7 = (com.google.assistant.p3745ab.p3746a.C48193q) r7
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.ab.a.r r8 = (com.google.assistant.p3745ab.p3746a.C48194r) r8
            r7.getClass()
            r8.f124718e = r7
            int r7 = r8.f124714a
            r7 = r7 | 32
            r8.f124714a = r7
            com.google.protobuf.bv r7 = r0.build()
            com.google.assistant.ab.a.r r7 = (com.google.assistant.p3745ab.p3746a.C48194r) r7
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            r7.getClass()
            r8.f164235cm = r7
            int r7 = r8.f164255j
            r7 = r7 | 8
            r8.f164255j = r7
            com.google.protobuf.bv r7 = r1.build()
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            r8 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r7, r8, r8, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106030bb.mo95247a(com.google.assistant.e.j.e.bc, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo95248b(int i, C18430o oVar, C51842bc bcVar) {
        C48189m mVar = (C48189m) C48190n.f124701e.createBuilder();
        mVar.copyOnWrite();
        C48190n nVar = (C48190n) mVar.instance;
        nVar.f124703a |= 1;
        nVar.f124706d = (long) i;
        C48188l a = f296036e.apply(oVar);
        mVar.copyOnWrite();
        C48190n nVar2 = (C48190n) mVar.instance;
        nVar2.f124705c = Integer.valueOf(a.f124700k);
        nVar2.f124704b = 3;
        m176635c((C48190n) mVar.build(), bcVar);
    }
}
