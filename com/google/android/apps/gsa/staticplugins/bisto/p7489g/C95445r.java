package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142297ac;
import com.google.android.p10712d.C142302ah;
import com.google.android.p10712d.C142308an;
import com.google.android.p10712d.C142309ao;
import com.google.android.p10712d.C142348c;
import com.google.android.p10712d.C142375d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.r */
/* compiled from: PG */
public final /* synthetic */ class C95445r implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95447t f267061a;

    /* renamed from: b */
    public final /* synthetic */ int f267062b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f267063c;

    /* renamed from: d */
    public final /* synthetic */ int f267064d;

    public /* synthetic */ C95445r(C95447t tVar, int i, int i2, byte[] bArr) {
        this.f267061a = tVar;
        this.f267064d = i;
        this.f267062b = i2;
        this.f267063c = bArr;
    }

    public final void run() {
        C95447t tVar = this.f267061a;
        int i = this.f267064d;
        int i2 = this.f267062b;
        byte[] bArr = this.f267063c;
        if (i == 4) {
            if (i2 == 1) {
                C142297ac acVar = (C142297ac) C142302ah.f386044q.createBuilder();
                acVar.copyOnWrite();
                C142302ah ahVar = (C142302ah) acVar.instance;
                ahVar.f386047b = 6;
                ahVar.f386046a |= 1;
                String l = tVar.mo89305l();
                acVar.copyOnWrite();
                C142302ah ahVar2 = (C142302ah) acVar.instance;
                l.getClass();
                ahVar2.f386046a |= 32768;
                ahVar2.f386060o = l;
                String m = tVar.mo89306m();
                acVar.copyOnWrite();
                C142302ah ahVar3 = (C142302ah) acVar.instance;
                m.getClass();
                ahVar3.f386046a = 8 | ahVar3.f386046a;
                ahVar3.f386050e = m;
                acVar.copyOnWrite();
                C142302ah ahVar4 = (C142302ah) acVar.instance;
                ahVar4.f386046a |= 2;
                ahVar4.f386048c = 1;
                acVar.copyOnWrite();
                C142302ah ahVar5 = (C142302ah) acVar.instance;
                ahVar5.f386046a |= 2048;
                ahVar5.f386056k = 0;
                acVar.copyOnWrite();
                C142302ah ahVar6 = (C142302ah) acVar.instance;
                ahVar6.f386046a |= 16384;
                ahVar6.f386059n = false;
                Integer i3 = tVar.mo89313i();
                if (i3 != null) {
                    int intValue = i3.intValue();
                    acVar.copyOnWrite();
                    C142302ah ahVar7 = (C142302ah) acVar.instance;
                    ahVar7.f386046a |= 1024;
                    ahVar7.f386055j = intValue;
                }
                String j = tVar.mo89314j();
                if (j != null) {
                    acVar.copyOnWrite();
                    C142302ah ahVar8 = (C142302ah) acVar.instance;
                    ahVar8.f386046a |= 4;
                    ahVar8.f386049d = j;
                }
                acVar.copyOnWrite();
                C142302ah ahVar9 = (C142302ah) acVar.instance;
                ahVar9.f386046a |= 2048;
                ahVar9.f386056k = 0;
                tVar.mo89254E(tVar.f267071c, 4, 2, ((C142302ah) acVar.build()).toByteArray());
                return;
            }
            i = 4;
        }
        if (i == 10) {
            if (i2 == 3) {
                C142348c cVar = (C142348c) C142375d.f386335d.createBuilder();
                cVar.copyOnWrite();
                C142375d dVar = (C142375d) cVar.instance;
                dVar.f386337a |= 1;
                dVar.f386338b = false;
                tVar.mo89254E(tVar.f267071c, 10, 2, ((C142375d) cVar.build()).toByteArray());
            } else if (i2 == 2) {
                try {
                    if (((C142375d) C62942bv.parseFrom((C62942bv) C142375d.f386335d, bArr)).f386338b) {
                        tVar.mo89265f("opa disabled");
                    }
                } catch (C62974ct e) {
                    C59104x c = C95447t.f267069a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14915)).mo56386p("invalid proto");
                }
            }
        } else if (i == 9 && i2 == 13 && !tVar.f267072d.mo83555j(146)) {
            try {
                C142309ao aoVar = (C142309ao) C62942bv.parseFrom((C62942bv) C142309ao.f386072c, bArr, C62921ba.m95368a());
                if ((aoVar.f386074a & 1) != 0) {
                    int i4 = aoVar.f386075b;
                    int a = C142308an.m231060a(i4);
                    if (a != 0) {
                        if (a == 2) {
                            tVar.f267073e.mo89096a(9);
                            return;
                        }
                    }
                    int a2 = C142308an.m231060a(i4);
                    if (a2 != 0 && a2 == 3) {
                        tVar.f267073e.mo89096a(8);
                    }
                }
            } catch (C62974ct e2) {
                C59104x c2 = C95447t.f267069a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(14914)).mo56386p("invalid proto");
            }
        }
    }
}
