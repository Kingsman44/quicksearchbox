package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d;

import com.google.android.libraries.assistant.pcp.p1578m.C18983m;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import com.google.android.libraries.assistant.pcp.p1578m.C18989s;
import com.google.assistant.p3803ag.p3804a.p3806b.C48833n;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c */
/* compiled from: PG */
public final /* synthetic */ class C132628c implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C132628c f361953a = new C132628c();

    private /* synthetic */ C132628c() {
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        for (C18985o oVar : (List) obj) {
            Iterator it = oVar.f53349a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C18983m mVar = (C18983m) it.next();
                    C49118hc hcVar = mVar.f53344c;
                    if (hcVar == null) {
                        hcVar = C49118hc.f127034a;
                    }
                    C18989s sVar = mVar.f53343b;
                    if (sVar == null) {
                        sVar = C18989s.f53353f;
                    }
                    if (sVar.f53356b == C49051eq.WEATHER_PRECISE.f126885t) {
                        C62940bt r1 = C62942bv.checkIsLite(C48833n.f126351l);
                        hcVar.mo58887l(r1);
                        if (hcVar.f169962ag.mo58857o(r1.f169971d)) {
                            C62940bt r5 = C62942bv.checkIsLite(C48833n.f126351l);
                            hcVar.mo58887l(r5);
                            Object l = hcVar.f169962ag.mo58854l(r5.f169971d);
                            if (l == null) {
                                obj2 = r5.f169969b;
                            } else {
                                obj2 = r5.mo58889c(l);
                            }
                            return C60856cj.m92900i((C48833n) obj2);
                        }
                    }
                }
            }
        }
        return C60856cj.m92899h(new NoSuchElementException("No weather in PCPv2 response"));
    }
}
