package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8210b;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.assistant.p3886c.p3887a.C50681q;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.assistant.p3886c.p3887a.C50686v;
import com.google.assistant.p3886c.p3887a.C50688x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.EnumMap;
import p3186j$.time.Duration;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C106489c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106490d f296982a;

    public /* synthetic */ C106489c(C106490d dVar) {
        this.f296982a = dVar;
    }

    public final Object apply(Object obj) {
        C50681q qVar;
        C106490d dVar = this.f296982a;
        ArrayList arrayList = new ArrayList();
        boolean e = dVar.f296988f.mo79746e(C90017bw.f248030g);
        EnumMap enumMap = new EnumMap(C106531e.class);
        C58485gu F = C58485gu.m89836F(Comparator.CC.comparingLong(C106488b.f296981a), ((C50688x) obj).f131870a);
        int i = ((C58724pq) F).f156474d;
        C50681q qVar2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            C50686v vVar = (C50686v) F.get(i2);
            C106529c a = C106529c.m177304a(vVar.f131866d);
            if (a == null) {
                a = C106529c.UNSPECIFIED;
            }
            if (a == C106529c.CONNECTED) {
                C50681q qVar3 = (C50681q) C50682r.f131853f.createBuilder();
                C106531e a2 = C106531e.m177306a(vVar.f131865c);
                if (a2 == null) {
                    a2 = C106531e.UNKNOWN;
                }
                qVar3.copyOnWrite();
                C50682r rVar = (C50682r) qVar3.instance;
                rVar.f131856b = a2.f297077e;
                rVar.f131855a |= 1;
                C63042fg fgVar = vVar.f131864b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                long millis = Duration.ofSeconds(fgVar.f170154a).toMillis();
                qVar3.copyOnWrite();
                C50682r rVar2 = (C50682r) qVar3.instance;
                rVar2.f131855a |= 2;
                rVar2.f131857c = millis;
                if ((vVar.f131863a & 8) != 0) {
                    String str = vVar.f131867e;
                    qVar3.copyOnWrite();
                    C50682r rVar3 = (C50682r) qVar3.instance;
                    str.getClass();
                    rVar3.f131855a |= 8;
                    rVar3.f131859e = str;
                }
                if (e) {
                    C106531e a3 = C106531e.m177306a(vVar.f131865c);
                    if (a3 == null) {
                        a3 = C106531e.UNKNOWN;
                    }
                    enumMap.put(a3, qVar3);
                } else {
                    qVar2 = qVar3;
                }
            } else {
                C106529c a4 = C106529c.m177304a(vVar.f131866d);
                if (a4 == null) {
                    a4 = C106529c.UNSPECIFIED;
                }
                if (a4 == C106529c.DISCONNECTED) {
                    C63042fg fgVar2 = vVar.f131864b;
                    if (fgVar2 == null) {
                        fgVar2 = C63042fg.f170152c;
                    }
                    long millis2 = Duration.ofSeconds(fgVar2.f170154a).toMillis();
                    if (e) {
                        C106531e a5 = C106531e.m177306a(vVar.f131865c);
                        if (a5 == null) {
                            a5 = C106531e.UNKNOWN;
                        }
                        qVar = (C50681q) enumMap.get(a5);
                    } else {
                        qVar = qVar2;
                    }
                    if (qVar != null) {
                        C50682r rVar4 = (C50682r) qVar.instance;
                        if ((rVar4.f131855a & 2) != 0 && rVar4.f131857c < millis2) {
                            qVar.copyOnWrite();
                            C50682r rVar5 = (C50682r) qVar.instance;
                            rVar5.f131855a |= 4;
                            rVar5.f131858d = millis2;
                            arrayList.add((C50682r) qVar.build());
                            C106531e a6 = C106531e.m177306a(vVar.f131865c);
                            if (a6 == null) {
                                a6 = C106531e.UNKNOWN;
                            }
                            enumMap.remove(a6);
                            qVar2 = null;
                        }
                    }
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        arrayList.size();
        return arrayList;
    }
}
