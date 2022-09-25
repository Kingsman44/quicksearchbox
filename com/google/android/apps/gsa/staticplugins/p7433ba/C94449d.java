package com.google.android.apps.gsa.staticplugins.p7433ba;

import android.util.Pair;
import com.google.android.apps.gsa.search.core.logging.eventprocessor.C86177a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7192v.C91165r;
import com.google.android.apps.search.googleapp.p10370p.C136852as;
import com.google.android.apps.search.googleapp.p10370p.C136853at;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4552o.C59696ck;
import com.google.common.p4552o.C59698cm;
import com.google.common.p4552o.C59745eb;
import com.google.common.p4552o.C59747ed;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4817a.C63190d;
import com.google.protos.p4816ai.p4817a.C63192f;
import com.google.protos.p4816ai.p4817a.C63193g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p5451f.p5452a.p5453a.p5454a.C69445j;
import p5451f.p5452a.p5453a.p5454a.C69448m;
import p5451f.p5452a.p5453a.p5454a.C69449n;

/* renamed from: com.google.android.apps.gsa.staticplugins.ba.d */
/* compiled from: PG */
public final class C94449d implements C86177a {

    /* renamed from: a */
    private final C86124t f264043a;

    /* renamed from: b */
    private final Map f264044b = new HashMap();

    /* renamed from: c */
    private final Map f264045c = new HashMap();

    /* renamed from: d */
    private final C21370a f264046d;

    /* renamed from: e */
    private final C42876ab f264047e;

    /* renamed from: f */
    private boolean f264048f = false;

    public C94449d(C21370a aVar, C86124t tVar, C42876ab abVar) {
        this.f264046d = aVar;
        this.f264043a = tVar;
        this.f264047e = abVar;
        this.f264048f = tVar.mo79746e(C89972ak.f246580u);
        C69449n g = C91165r.m148932g(tVar);
        C91165r.m148946u(aVar, tVar, abVar);
        if (this.f264048f && g != null) {
            for (C69448m mVar : g.f185851a) {
                int i = mVar.f185846c;
                C62961ch<Integer> chVar = mVar.f185844a;
                Map map = this.f264044b;
                for (Integer intValue : chVar) {
                    Integer valueOf = Integer.valueOf(intValue.intValue());
                    if (!map.containsKey(valueOf)) {
                        map.put(valueOf, new HashSet());
                    }
                    Set set = (Set) map.get(valueOf);
                    set.getClass();
                    set.add(Integer.valueOf(i));
                }
                C62971cq<C69445j> cqVar = mVar.f185845b;
                Map map2 = this.f264045c;
                for (C69445j jVar : cqVar) {
                    Pair pair = new Pair(Integer.valueOf(jVar.f185823a), Integer.valueOf(jVar.f185824b));
                    if (!map2.containsKey(pair)) {
                        map2.put(pair, new HashSet());
                    }
                    Set set2 = (Set) map2.get(pair);
                    set2.getClass();
                    set2.add(Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo79812c(int i) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo79813d(C60321oe oeVar) {
    }

    /* renamed from: e */
    public final void mo79814e(C60555uf ufVar) {
        Set<Integer> set;
        int a;
        if (this.f264048f) {
            if (ufVar.f164258m == 883 && this.f264043a.mo79746e(C89972ak.f246571l)) {
                C59698cm cmVar = ufVar.f164184bl;
                if (cmVar == null) {
                    cmVar = C59698cm.f160165g;
                }
                int a2 = C59696ck.m92484a(cmVar.f160168b);
                if (a2 != 0 && a2 == 2) {
                    int i = cmVar.f160167a;
                    if (!((i & 4) == 0 || (i & 8) == 0)) {
                        Map map = this.f264045c;
                        C89849ae a3 = C89849ae.m146281a(cmVar.f160171e);
                        if (a3 == null) {
                            a3 = C89849ae.UNKNOWN_EVENT;
                        }
                        Integer valueOf = Integer.valueOf(a3.f245884YW);
                        C89849ae a4 = C89849ae.m146281a(cmVar.f160172f);
                        if (a4 == null) {
                            a4 = C89849ae.UNKNOWN_EVENT;
                        }
                        set = (Set) Map.EL.getOrDefault(map, new Pair(valueOf, Integer.valueOf(a4.f245884YW)), C58733pz.f156496a);
                    }
                }
                set = C58733pz.f156496a;
            } else {
                if (ufVar.f164258m == 1192) {
                    C63193g gVar = ufVar.f164110aQ;
                    if (gVar == null) {
                        gVar = C63193g.f170718h;
                    }
                    Iterator it = gVar.f170725f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            set = C58733pz.f156496a;
                            break;
                        }
                        int i2 = ((C63192f) it.next()).f170705e;
                        int a5 = C63190d.m96203a(i2);
                        if ((a5 != 0 && a5 == 4) || ((a = C63190d.m96203a(i2)) != 0 && a == 10)) {
                            break;
                        }
                    }
                }
                set = (Set) Map.EL.getOrDefault(this.f264044b, Integer.valueOf(ufVar.f164258m), C58733pz.f156496a);
            }
            if (!set.isEmpty()) {
                int i3 = ufVar.f164258m;
                C136852as asVar = (C136852as) C136853at.f372494c.createBuilder();
                if (i3 == 248) {
                    C59747ed edVar = ufVar.f164134ao;
                    if (edVar == null) {
                        edVar = C59747ed.f161427h;
                    }
                    C59745eb ebVar = edVar.f161435g;
                    if (ebVar == null) {
                        ebVar = C59745eb.f161422d;
                    }
                    if ((ebVar.f161424a & 1) != 0) {
                        C59747ed edVar2 = ufVar.f164134ao;
                        if (edVar2 == null) {
                            edVar2 = C59747ed.f161427h;
                        }
                        C59745eb ebVar2 = edVar2.f161435g;
                        if (ebVar2 == null) {
                            ebVar2 = C59745eb.f161422d;
                        }
                        int i4 = ebVar2.f161425b;
                        asVar.copyOnWrite();
                        C136853at atVar = (C136853at) asVar.instance;
                        atVar.f372496a |= 1;
                        atVar.f372497b = i4;
                    }
                } else if (i3 == 887) {
                    int i5 = C91165r.f254531b;
                    asVar.copyOnWrite();
                    C136853at atVar2 = (C136853at) asVar.instance;
                    atVar2.f372496a |= 1;
                    atVar2.f372497b = i5;
                }
                C136853at atVar3 = (C136853at) asVar.build();
                for (Integer intValue : set) {
                    C91165r.m148945t(intValue.intValue(), this.f264046d, this.f264043a, this.f264047e, atVar3);
                }
            }
        }
    }
}
