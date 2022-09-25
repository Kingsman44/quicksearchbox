package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.apps.p489g.p490a.C9118c;
import com.google.android.apps.p489g.p490a.C9119d;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7678fx;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7683gb;
import com.google.p375ai.p378b.C7684gc;
import com.google.p375ai.p378b.C7707gz;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7862ms;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8175yh;
import com.google.p375ai.p378b.C8176yi;
import com.google.p375ai.p378b.C8177yj;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bi */
/* compiled from: PG */
public final class C91331bi extends C91953ad {

    /* renamed from: a */
    public static final C60220t f254880a;

    /* renamed from: b */
    private final C60220t f254881b;

    static {
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        sVar.copyOnWrite();
        C60220t tVar = (C60220t) sVar.instance;
        tVar.f162933a |= 2;
        tVar.f162935c = 0;
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 4;
        tVar2.f162936d = 0;
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 1;
        tVar3.f162934b = 0;
        f254880a = (C60220t) sVar.build();
    }

    public C91331bi(C60220t tVar) {
        this.f254881b = tVar;
    }

    /* renamed from: g */
    public static C7718hj m149338g(C60220t tVar, C7718hj hjVar) {
        C7709ha haVar = hjVar.f26972m;
        if (haVar == null) {
            haVar = C7709ha.f26910f;
        }
        if ((haVar.f26912a & 1) != 0) {
            return hjVar;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        m149339h(tVar, hcVar);
        return (C7718hj) hcVar.build();
    }

    /* renamed from: h */
    public static void m149339h(C60220t tVar, C7711hc hcVar) {
        C7709ha haVar = ((C7718hj) hcVar.instance).f26972m;
        if (haVar == null) {
            haVar = C7709ha.f26910f;
        }
        if ((haVar.f26912a & 1) != 0) {
            C7709ha haVar2 = ((C7718hj) hcVar.instance).f26972m;
            if (haVar2 == null) {
                haVar2 = C7709ha.f26910f;
            }
            C60220t tVar2 = haVar2.f26913b;
            if (tVar2 == null) {
                tVar2 = C60220t.f162931e;
            }
            m149341o(tVar2, hcVar);
            return;
        }
        m149341o(tVar, hcVar);
        C7709ha haVar3 = ((C7718hj) hcVar.instance).f26972m;
        if (haVar3 == null) {
            haVar3 = C7709ha.f26910f;
        }
        C7707gz gzVar = (C7707gz) haVar3.toBuilder();
        gzVar.copyOnWrite();
        C7709ha haVar4 = (C7709ha) gzVar.instance;
        tVar.getClass();
        haVar4.f26913b = tVar;
        haVar4.f26912a |= 1;
        hcVar.copyOnWrite();
        C7718hj hjVar = (C7718hj) hcVar.instance;
        C7709ha haVar5 = (C7709ha) gzVar.build();
        haVar5.getClass();
        hjVar.f26972m = haVar5;
        hjVar.f26955a |= 64;
    }

    /* renamed from: n */
    private static C8178yk m149340n(C60220t tVar, C8178yk ykVar) {
        C8176yi yiVar;
        C8177yj yjVar = (C8177yj) ykVar.toBuilder();
        if (ykVar.f28739b == 1) {
            yiVar = (C8176yi) ykVar.f28740c;
        } else {
            yiVar = C8176yi.f28728f;
        }
        C8175yh yhVar = (C8175yh) yiVar.toBuilder();
        yhVar.copyOnWrite();
        C8176yi yiVar2 = (C8176yi) yhVar.instance;
        tVar.getClass();
        yiVar2.f28731b = tVar;
        yiVar2.f28730a |= 1;
        yjVar.copyOnWrite();
        C8178yk ykVar2 = (C8178yk) yjVar.instance;
        C8176yi yiVar3 = (C8176yi) yhVar.build();
        yiVar3.getClass();
        ykVar2.f28740c = yiVar3;
        ykVar2.f28739b = 1;
        return (C8178yk) yjVar.build();
    }

    /* renamed from: o */
    private static void m149341o(C60220t tVar, C7711hc hcVar) {
        C8176yi yiVar;
        C7718hj hjVar = (C7718hj) hcVar.instance;
        if ((hjVar.f26955a & 1073741824) != 0) {
            C7874nd ndVar = hjVar.f26938J;
            if (ndVar == null) {
                ndVar = C7874nd.f27577J;
            }
            C7862ms msVar = (C7862ms) ndVar.toBuilder();
            C7874nd ndVar2 = (C7874nd) msVar.instance;
            if ((ndVar2.f27590b & 4) != 0) {
                C8178yk ykVar = ndVar2.f27584F;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                if (ykVar.f28739b == 1) {
                    yiVar = (C8176yi) ykVar.f28740c;
                } else {
                    yiVar = C8176yi.f28728f;
                }
                if ((yiVar.f28730a & 1) == 0) {
                    C8178yk ykVar2 = ((C7874nd) msVar.instance).f27584F;
                    if (ykVar2 == null) {
                        ykVar2 = C8178yk.f28736g;
                    }
                    C8178yk n = m149340n(tVar, ykVar2);
                    msVar.copyOnWrite();
                    C7874nd ndVar3 = (C7874nd) msVar.instance;
                    n.getClass();
                    ndVar3.f27584F = n;
                    ndVar3.f27590b |= 4;
                }
            }
            C7874nd ndVar4 = (C7874nd) msVar.instance;
            if ((ndVar4.f27590b & 8) != 0) {
                C7682ga gaVar = ndVar4.f27585G;
                if (gaVar == null) {
                    gaVar = C7682ga.f26836d;
                }
                if ((gaVar.f26838a & 4) != 0) {
                    C7682ga gaVar2 = ((C7874nd) msVar.instance).f27585G;
                    if (gaVar2 == null) {
                        gaVar2 = C7682ga.f26836d;
                    }
                    C7678fx fxVar = (C7678fx) gaVar2.toBuilder();
                    C7684gc gcVar = ((C7682ga) fxVar.instance).f26840c;
                    if (gcVar == null) {
                        gcVar = C7684gc.f26842l;
                    }
                    C7683gb gbVar = (C7683gb) gcVar.toBuilder();
                    C8178yk ykVar3 = ((C7684gc) gbVar.instance).f26848e;
                    if (ykVar3 == null) {
                        ykVar3 = C8178yk.f28736g;
                    }
                    C8178yk n2 = m149340n(tVar, ykVar3);
                    gbVar.copyOnWrite();
                    C7684gc gcVar2 = (C7684gc) gbVar.instance;
                    n2.getClass();
                    gcVar2.f26848e = n2;
                    gcVar2.f26844a |= 8;
                    C8178yk ykVar4 = gcVar2.f26849f;
                    if (ykVar4 == null) {
                        ykVar4 = C8178yk.f28736g;
                    }
                    C8178yk n3 = m149340n(tVar, ykVar4);
                    gbVar.copyOnWrite();
                    C7684gc gcVar3 = (C7684gc) gbVar.instance;
                    n3.getClass();
                    gcVar3.f26849f = n3;
                    gcVar3.f26844a |= 16;
                    C8178yk ykVar5 = gcVar3.f26850g;
                    if (ykVar5 == null) {
                        ykVar5 = C8178yk.f28736g;
                    }
                    C8178yk n4 = m149340n(tVar, ykVar5);
                    gbVar.copyOnWrite();
                    C7684gc gcVar4 = (C7684gc) gbVar.instance;
                    n4.getClass();
                    gcVar4.f26850g = n4;
                    gcVar4.f26844a |= 32;
                    C8178yk ykVar6 = gcVar4.f26851h;
                    if (ykVar6 == null) {
                        ykVar6 = C8178yk.f28736g;
                    }
                    C8178yk n5 = m149340n(tVar, ykVar6);
                    gbVar.copyOnWrite();
                    C7684gc gcVar5 = (C7684gc) gbVar.instance;
                    n5.getClass();
                    gcVar5.f26851h = n5;
                    gcVar5.f26844a |= 64;
                    C8178yk ykVar7 = gcVar5.f26852i;
                    if (ykVar7 == null) {
                        ykVar7 = C8178yk.f28736g;
                    }
                    C8178yk n6 = m149340n(tVar, ykVar7);
                    gbVar.copyOnWrite();
                    C7684gc gcVar6 = (C7684gc) gbVar.instance;
                    n6.getClass();
                    gcVar6.f26852i = n6;
                    gcVar6.f26844a |= 128;
                    C8178yk ykVar8 = gcVar6.f26853j;
                    if (ykVar8 == null) {
                        ykVar8 = C8178yk.f28736g;
                    }
                    C8178yk n7 = m149340n(tVar, ykVar8);
                    gbVar.copyOnWrite();
                    C7684gc gcVar7 = (C7684gc) gbVar.instance;
                    n7.getClass();
                    gcVar7.f26853j = n7;
                    gcVar7.f26844a |= 256;
                    C8178yk ykVar9 = gcVar7.f26854k;
                    if (ykVar9 == null) {
                        ykVar9 = C8178yk.f28736g;
                    }
                    C8178yk n8 = m149340n(tVar, ykVar9);
                    gbVar.copyOnWrite();
                    C7684gc gcVar8 = (C7684gc) gbVar.instance;
                    n8.getClass();
                    gcVar8.f26854k = n8;
                    gcVar8.f26844a |= 512;
                    fxVar.copyOnWrite();
                    C7682ga gaVar3 = (C7682ga) fxVar.instance;
                    C7684gc gcVar9 = (C7684gc) gbVar.build();
                    gcVar9.getClass();
                    gaVar3.f26840c = gcVar9;
                    gaVar3.f26838a |= 4;
                    msVar.copyOnWrite();
                    C7874nd ndVar5 = (C7874nd) msVar.instance;
                    C7682ga gaVar4 = (C7682ga) fxVar.build();
                    gaVar4.getClass();
                    ndVar5.f27585G = gaVar4;
                    ndVar5.f27590b |= 8;
                }
            }
            hcVar.copyOnWrite();
            C7718hj hjVar2 = (C7718hj) hcVar.instance;
            C7874nd ndVar6 = (C7874nd) msVar.build();
            ndVar6.getClass();
            hjVar2.f26938J = ndVar6;
            hjVar2.f26955a |= 1073741824;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7726hr mo85622a(C7726hr hrVar) {
        C8176yi yiVar;
        if ((hrVar.f27010a & 16) == 0) {
            return hrVar;
        }
        C8178yk ykVar = hrVar.f27017h;
        if (ykVar == null) {
            ykVar = C8178yk.f28736g;
        }
        C7725hq hqVar = (C7725hq) hrVar.toBuilder();
        C8177yj yjVar = (C8177yj) ykVar.toBuilder();
        if (ykVar.f28739b == 1) {
            yiVar = (C8176yi) ykVar.f28740c;
        } else {
            yiVar = C8176yi.f28728f;
        }
        C8175yh yhVar = (C8175yh) yiVar.toBuilder();
        C60220t tVar = this.f254881b;
        yhVar.copyOnWrite();
        C8176yi yiVar2 = (C8176yi) yhVar.instance;
        tVar.getClass();
        yiVar2.f28731b = tVar;
        yiVar2.f28730a |= 1;
        yjVar.copyOnWrite();
        C8178yk ykVar2 = (C8178yk) yjVar.instance;
        C8176yi yiVar3 = (C8176yi) yhVar.build();
        yiVar3.getClass();
        ykVar2.f28740c = yiVar3;
        ykVar2.f28739b = 1;
        hqVar.copyOnWrite();
        C7726hr hrVar2 = (C7726hr) hqVar.instance;
        C8178yk ykVar3 = (C8178yk) yjVar.build();
        ykVar3.getClass();
        hrVar2.f27017h = ykVar3;
        hrVar2.f27010a |= 16;
        return (C7726hr) hqVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        return m149338g(this.f254881b, hjVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C7744ii mo85624d(C7744ii iiVar) {
        C7728ht htVar = (C7728ht) iiVar.toBuilder();
        C62940bt btVar = C9119d.f31392d;
        C9118c cVar = (C9118c) C9119d.f31391c.createBuilder();
        C60220t tVar = this.f254881b;
        cVar.copyOnWrite();
        C9119d dVar = (C9119d) cVar.instance;
        tVar.getClass();
        dVar.f31395b = tVar;
        dVar.f31394a |= 1;
        htVar.mo58885m(btVar, (C9119d) cVar.build());
        return (C7744ii) htVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C7718hj mo85640e(C7718hj hjVar) {
        return m149338g(this.f254881b, hjVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C7718hj mo85641f(C7718hj hjVar) {
        return m149338g(this.f254881b, hjVar);
    }
}
