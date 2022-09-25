package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28290h;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aje;
import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l */
/* compiled from: PG */
public final class C114742l implements C28290h {

    /* renamed from: f */
    private static final C59071e f318413f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l");

    /* renamed from: a */
    public e f318414a = e.a;

    /* renamed from: b */
    public C53287ih f318415b = null;

    /* renamed from: c */
    public C60218r f318416c;

    /* renamed from: d */
    final long f318417d = C90719ac.f253778a.f253779b.nextLong();

    /* renamed from: e */
    public int f318418e = 1;

    /* renamed from: g */
    private final C39141kp f318419g;

    /* renamed from: h */
    private final C86124t f318420h;

    public C114742l(C39141kp kpVar, C86124t tVar) {
        this.f318419g = kpVar;
        this.f318420h = tVar;
    }

    /* renamed from: h */
    private static void m190204h(C60321oe oeVar) {
        if (oeVar != null) {
            C89949q.m146521e(oeVar, false);
        }
    }

    /* renamed from: i */
    private static void m190205i(int i, View view) {
        C28292j a = C28295m.m52915a(view);
        if (i != 2) {
            i = 3;
        }
        if (a != null && a.f76977e != 3) {
            view.getClass();
            m190204h(C28285c.m52881h(i, C28295m.m52916b(view), (View) null));
        }
    }

    /* renamed from: a */
    public final void mo33783a(View view) {
        m190205i(3, view);
    }

    /* renamed from: b */
    public final void mo33784b(View view) {
        m190205i(2, view);
    }

    /* JADX WARNING: type inference failed for: r13v8, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4552o.C60321oe mo101568c(com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h r13) {
        /*
            r12 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.logging.k r0 = r13.mo101412b()
            long r3 = r13.mo101417g()
            r1 = 0
            if (r0 != 0) goto L_0x0022
            com.google.common.f.e r13 = f318413f
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ZSVisualElementLogger"
            r13.mo56378ag(r0, r2)
            java.lang.String r0 = "Zero State VE tree does not exist."
            r2 = 29419(0x72eb, float:4.1225E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x0022:
            r2 = 472(0x1d8, float:6.61E-43)
            com.google.common.o.oe r0 = com.google.android.libraries.logging.C28285c.m52875b(r0, r2)
            com.google.protos.ai.b.j r13 = r13.mo101420j()
            if (r0 == 0) goto L_0x0184
            com.google.protobuf.cq r5 = r0.f163228c
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            com.google.common.o.aqs r5 = (com.google.common.p4552o.aqs) r5
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.common.o.aqp r5 = (com.google.common.p4552o.aqp) r5
            com.google.protobuf.bt r7 = com.google.common.p4552o.ajg.f158866h
            com.google.common.o.ajg r8 = com.google.common.p4552o.ajg.f158865g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.ajb r8 = (com.google.common.p4552o.ajb) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.common.o.ajg r9 = (com.google.common.p4552o.ajg) r9
            r10 = 3
            r9.f158869b = r10
            int r10 = r9.f158868a
            r10 = r10 | 16
            r9.f158868a = r10
            int r9 = r12.f318418e
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.common.o.ajg r10 = (com.google.common.p4552o.ajg) r10
            int r11 = r9 + -1
            if (r9 == 0) goto L_0x0183
            r10.f158870c = r11
            int r1 = r10.f158868a
            r1 = r1 | 32
            r10.f158868a = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.common.o.ajg r1 = (com.google.common.p4552o.ajg) r1
            r9 = 1
            r1.f158872e = r9
            int r9 = r1.f158868a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r1.f158868a = r9
            com.google.protobuf.bv r1 = r8.build()
            com.google.common.o.ajg r1 = (com.google.common.p4552o.ajg) r1
            r5.mo58885m(r7, r1)
            com.google.protobuf.bv r1 = r5.build()
            com.google.common.o.aqs r1 = (com.google.common.p4552o.aqs) r1
            if (r13 == 0) goto L_0x00a9
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.common.o.aqp r1 = (com.google.common.p4552o.aqp) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.common.o.aqs r5 = (com.google.common.p4552o.aqs) r5
            r5.f159788g = r13
            int r13 = r5.f159782a
            r13 = r13 | 16
            r5.f159782a = r13
            com.google.protobuf.bv r13 = r1.build()
            r1 = r13
            com.google.common.o.aqs r1 = (com.google.common.p4552o.aqs) r1
        L_0x00a9:
            com.google.protobuf.bn r13 = r0.toBuilder()
            com.google.common.o.od r13 = (com.google.common.p4552o.C60320od) r13
            r13.mo57084d(r6, r1)
            com.google.common.o.aqm r0 = com.google.common.p4552o.aqm.f159760n
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.aql r0 = (com.google.common.p4552o.aql) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aqm r1 = (com.google.common.p4552o.aqm) r1
            int r5 = r1.f159762a
            r5 = r5 | 4
            r1.f159762a = r5
            r5 = 51627(0xc9ab, float:7.2345E-41)
            r1.f159765d = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.aqm r0 = (com.google.common.p4552o.aqm) r0
            com.google.common.o.l.r r1 = r12.f318416c
            if (r1 == 0) goto L_0x00e5
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.common.o.oe r5 = (com.google.common.p4552o.C60321oe) r5
            r5.f163229d = r1
            int r1 = r5.f163226a
            r1 = r1 | 2
            r5.f163226a = r1
        L_0x00e5:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.common.o.oe r1 = (com.google.common.p4552o.C60321oe) r1
            r0.getClass()
            r1.f163230e = r0
            int r0 = r1.f163226a
            r0 = r0 | 16
            r1.f163226a = r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.oe r13 = (com.google.common.p4552o.C60321oe) r13
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r5 = r1.f164093a
            r5 = r5 | 2
            r1.f164093a = r5
            r1.f164258m = r2
            com.google.common.o.a.u r1 = com.google.common.p4552o.p4553a.C59565u.f158051f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.a.p r1 = (com.google.common.p4552o.p4553a.C59560p) r1
            com.google.android.apps.gsa.assistant.shared.l.e r5 = r12.f318414a
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.common.o.a.u r6 = (com.google.common.p4552o.p4553a.C59565u) r6
            int r5 = r5.ca
            r6.f158054b = r5
            int r5 = r6.f158053a
            r5 = r5 | 2
            r6.f158053a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.a.u r1 = (com.google.common.p4552o.p4553a.C59565u) r1
            r1.getClass()
            r5.f164174bb = r1
            int r1 = r5.f164251f
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r6
            r5.f164251f = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            if (r13 != 0) goto L_0x0151
            goto L_0x0179
        L_0x0151:
            if (r0 != 0) goto L_0x0170
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r5 = r1.f164093a
            r5 = r5 | 2
            r1.f164093a = r5
            r1.f164258m = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
        L_0x0170:
            r7 = r0
            r1 = 0
            long r5 = r12.f318417d
            r8 = r13
            com.google.android.apps.gsa.sidekick.shared.p7253n.C91876a.m150548b(r1, r3, r5, r7, r8)
        L_0x0179:
            com.google.assistant.s.a.ih r0 = r12.f318415b
            int r1 = r12.f318418e
            com.google.android.apps.gsa.assistant.shared.l.e r2 = r12.f318414a
            r12.mo101572g(r0, r1, r2)
            return r13
        L_0x0183:
            throw r1
        L_0x0184:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l.mo101568c(com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h):com.google.common.o.oe");
    }

    /* renamed from: d */
    public final void mo101569d(C28293k kVar, C28292j jVar) {
        if (kVar != null && jVar != null) {
            m190204h(C28285c.m52877d(kVar, jVar));
        }
    }

    /* renamed from: e */
    public final void mo101570e(C28293k kVar, C28293k kVar2) {
        if (kVar2 != null) {
            mo101569d(kVar, kVar2.mo33745a());
        }
    }

    /* renamed from: g */
    public final void mo101572g(C53287ih ihVar, int i, e eVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (i != 0) {
            eVar.name();
            this.f318420h.mo79746e(C90014bt.f247287eM);
            C39141kp kpVar = this.f318419g;
            if (ihVar == null) {
                str = "null";
            } else {
                int b = C53286ig.m86808b(ihVar.f139703i);
                if (b == 0) {
                    b = 1;
                }
                str = C53286ig.m86807a(b);
            }
            ((C19567d) kpVar.f102938cP.mo6453a()).mo24822a(1, str, aje.m92414a(i), eVar.name(), Boolean.valueOf(this.f318420h.mo79746e(C90014bt.f247287eM)));
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public final void mo101571f(C28293k kVar, int i) {
        if (kVar != null) {
            C28292j a = kVar.mo33745a();
            a.getClass();
            m190204h(C28285c.m52883j(a, i, (Integer) null));
        }
    }
}
