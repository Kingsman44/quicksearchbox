package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.i */
/* compiled from: PG */
public final class C134758i {
    /* renamed from: a */
    public static final C134766q m218593a(C134749h hVar) {
        C134766q pVar;
        C69664n.m101061g(hVar, "args");
        C57528m a = C57528m.m88369a(hVar.f366909b);
        if (a == null) {
            a = C57528m.UNKNOWN_SURFACE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return C134762m.f366947a;
        }
        if (ordinal == 2) {
            C53842b bVar = hVar.f366911d;
            if (bVar == null) {
                bVar = C53842b.f141313k;
            }
            C57315dp dpVar = bVar.f141321g;
            if (dpVar == null) {
                dpVar = C57315dp.f152986c;
            }
            C69664n.m101060f(dpVar, "args.channel.tngToken");
            C134699b a2 = C134699b.m218534a(hVar.f366915h);
            if (a2 == null) {
                a2 = C134699b.MAIN_FEED;
            }
            C69664n.m101060f(a2, "args.clearcutEventType");
            pVar = new C134765p(dpVar, a2);
        } else if (ordinal == 3) {
            return C134763n.f366949a;
        } else {
            if (ordinal == 9) {
                C57315dp dpVar2 = hVar.f366912e;
                if (dpVar2 == null) {
                    dpVar2 = C57315dp.f152986c;
                }
                C69664n.m101060f(dpVar2, "args.fullCoverageToken");
                pVar = new C134759j(dpVar2);
            } else if (ordinal == 14) {
                return C134760k.f366943a;
            } else {
                if (ordinal == 11) {
                    C53842b bVar2 = hVar.f366911d;
                    if (bVar2 == null) {
                        bVar2 = C53842b.f141313k;
                    }
                    C57315dp dpVar3 = bVar2.f141321g;
                    if (dpVar3 == null) {
                        dpVar3 = C57315dp.f152986c;
                    }
                    C69664n.m101060f(dpVar3, "args.channel.tngToken");
                    C134699b a3 = C134699b.m218534a(hVar.f366915h);
                    if (a3 == null) {
                        a3 = C134699b.MAIN_FEED;
                    }
                    C69664n.m101060f(a3, "args.clearcutEventType");
                    pVar = new C134757h(dpVar3, a3);
                } else if (ordinal == 12) {
                    return C134761l.f366945a;
                } else {
                    C57528m a4 = C57528m.m88369a(hVar.f366909b);
                    if (a4 == null) {
                        a4 = C57528m.UNKNOWN_SURFACE;
                    }
                    int i = a4.f153693B;
                    throw new IllegalStateException("Non-valid Surface for Discover: " + i);
                }
            }
        }
        return pVar;
    }
}
