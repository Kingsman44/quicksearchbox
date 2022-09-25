package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4522b.C58393dj;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.dw */
/* compiled from: PG */
final class C115307dw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C52176ia f319938a;

    /* renamed from: b */
    final /* synthetic */ boolean f319939b;

    /* renamed from: c */
    final /* synthetic */ boolean f319940c;

    /* renamed from: d */
    final /* synthetic */ C115315ed f319941d;

    public C115307dw(C115315ed edVar, C52176ia iaVar, boolean z, boolean z2) {
        this.f319941d = edVar;
        this.f319938a = iaVar;
        this.f319939b = z;
        this.f319940c = z2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar;
        C52583xc xcVar;
        C52583xc xcVar2;
        C52583xc xcVar3;
        C52583xc xcVar4;
        C52583xc xcVar5;
        Void voidR = (Void) obj;
        C115315ed edVar = this.f319941d;
        C52176ia iaVar = this.f319938a;
        if (!iaVar.equals(edVar.f319955c)) {
            C52176ia iaVar2 = edVar.f319955c;
            edVar.f319955c = iaVar;
            if (!edVar.f319955c.equals(C52176ia.f136911k)) {
                if (C115387w.m191344e(iaVar2) != C115387w.m191344e(iaVar)) {
                    guVar = C58485gu.m89845m();
                } else {
                    C58480gp e = C58485gu.m89837e();
                    HashMap hashMap = new HashMap();
                    for (C52174hz hzVar : iaVar.f136914b) {
                        hashMap.put(hzVar.f136895b, hzVar);
                    }
                    for (C52174hz hzVar2 : iaVar2.f136914b) {
                        C52174hz hzVar3 = (C52174hz) hashMap.get(hzVar2.f136895b);
                        if (hzVar3 == null) {
                            C52171hw hwVar = (C52171hw) hzVar2.toBuilder();
                            C52568wo woVar = hzVar2.f136897d;
                            if (woVar == null) {
                                woVar = C52568wo.f137992v;
                            }
                            C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder(woVar);
                            C52568wo woVar2 = hzVar2.f136897d;
                            if (woVar2 == null) {
                                woVar2 = C52568wo.f137992v;
                            }
                            if (woVar2.f137996c == 26) {
                                xcVar5 = (C52583xc) woVar2.f137997d;
                            } else {
                                xcVar5 = C52583xc.f138063o;
                            }
                            C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder(xcVar5);
                            C52579wz wzVar = C52579wz.ARCHIVED;
                            wvVar.copyOnWrite();
                            C52583xc xcVar6 = (C52583xc) wvVar.instance;
                            xcVar6.f138066b = wzVar.f138049f;
                            xcVar6.f138065a |= 1;
                            wjVar.copyOnWrite();
                            C52568wo woVar3 = (C52568wo) wjVar.instance;
                            C52583xc xcVar7 = (C52583xc) wvVar.build();
                            xcVar7.getClass();
                            woVar3.f137997d = xcVar7;
                            woVar3.f137996c = 26;
                            hwVar.copyOnWrite();
                            C52174hz hzVar4 = (C52174hz) hwVar.instance;
                            C52568wo woVar4 = (C52568wo) wjVar.build();
                            woVar4.getClass();
                            hzVar4.f136897d = woVar4;
                            hzVar4.f136894a |= 8;
                            e.mo55395g((C52174hz) hwVar.build());
                        } else {
                            C58393dj djVar = C58393dj.f155989b;
                            C52568wo woVar5 = hzVar2.f136897d;
                            if (woVar5 == null) {
                                woVar5 = C52568wo.f137992v;
                            }
                            if (woVar5.f137996c == 26) {
                                xcVar = (C52583xc) woVar5.f137997d;
                            } else {
                                xcVar = C52583xc.f138063o;
                            }
                            C52579wz a = C52579wz.m86656a(xcVar.f138066b);
                            if (a == null) {
                                a = C52579wz.UNKNOWN_READ_STATE;
                            }
                            C52568wo woVar6 = hzVar3.f136897d;
                            if (woVar6 == null) {
                                woVar6 = C52568wo.f137992v;
                            }
                            if (woVar6.f137996c == 26) {
                                xcVar2 = (C52583xc) woVar6.f137997d;
                            } else {
                                xcVar2 = C52583xc.f138063o;
                            }
                            C52579wz a2 = C52579wz.m86656a(xcVar2.f138066b);
                            if (a2 == null) {
                                a2 = C52579wz.UNKNOWN_READ_STATE;
                            }
                            C58393dj c = djVar.mo55136c(a, a2);
                            C52568wo woVar7 = hzVar2.f136897d;
                            if (woVar7 == null) {
                                woVar7 = C52568wo.f137992v;
                            }
                            if (woVar7.f137996c == 26) {
                                xcVar3 = (C52583xc) woVar7.f137997d;
                            } else {
                                xcVar3 = C52583xc.f138063o;
                            }
                            int i = xcVar3.f138067c;
                            C52568wo woVar8 = hzVar3.f136897d;
                            if (woVar8 == null) {
                                woVar8 = C52568wo.f137992v;
                            }
                            if (woVar8.f137996c == 26) {
                                xcVar4 = (C52583xc) woVar8.f137997d;
                            } else {
                                xcVar4 = C52583xc.f138063o;
                            }
                            if (c.mo55135b(i, xcVar4.f138067c).mo55134a() != 0) {
                                e.mo55395g(hzVar3);
                            }
                        }
                    }
                    guVar = e.mo55394f();
                }
                if (!guVar.isEmpty()) {
                    edVar.mo101961i(new C115293di(guVar));
                }
                if (!iaVar2.equals(iaVar)) {
                    edVar.mo101961i(new C115297dm(iaVar));
                }
            }
            if (!iaVar.equals(C52176ia.f136911k) && (iaVar2.f136916d != iaVar.f136916d || iaVar2.f136914b.isEmpty() || !C115387w.m191349j(iaVar2, iaVar))) {
                C58976aa aaVar = C58975e.f156826a;
                int i2 = iaVar.f136916d;
                edVar.mo101961i(new C115290df(iaVar));
            }
            if (!C115387w.m191349j(iaVar2, iaVar)) {
                edVar.f319963k.mo101946a();
            }
        }
        if (this.f319939b || this.f319940c) {
            this.f319941d.f319963k.mo101946a();
        }
    }
}
