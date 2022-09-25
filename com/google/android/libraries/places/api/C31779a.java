package com.google.android.libraries.places.api;

import android.content.Context;
import com.android.p275j.p276a.C5186p;
import com.google.android.gms.location.C144894ay;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31781b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31785f;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31827e;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31836n;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31801i;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31810r;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31811s;
import com.google.android.libraries.places.api.p2426a.p2427a.p2433d.C31840d;
import com.google.android.libraries.places.api.p2426a.p2434b.C31841a;
import com.google.android.libraries.places.api.p2426a.p2436d.C31843a;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.places.p2424a.p2425a.C31773d;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.android.libraries.places.p2438b.C31894a;
import com.google.common.base.C58838bb;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.libraries.places.api.a */
/* compiled from: PG */
public final class C31779a {

    /* renamed from: a */
    private static final C31843a f85390a = new C31843a();

    /* renamed from: b */
    private static volatile C31841a f85391b;

    /* renamed from: a */
    public static synchronized C31863s m59136a(Context context) {
        C31863s b;
        synchronized (C31779a.class) {
            try {
                C58838bb.m90866a(context, "Context must not be null.");
                b = m59137b(context, C31773d.m59126d(context).mo37379b());
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
        return b;
    }

    /* renamed from: b */
    public static synchronized C31863s m59137b(Context context, C31773d dVar) {
        C31836n nVar;
        Context context2 = context;
        C31773d dVar2 = dVar;
        synchronized (C31779a.class) {
            try {
                C58838bb.m90866a(context2, "Context must not be null.");
                C58838bb.m90866a(dVar2, "ClientProfile must not be null.");
                C58838bb.m90884s(m59139d(), "Places must be initialized first.");
                context.getClass();
                C31843a aVar = f85390a;
                dVar.getClass();
                C31841a aVar2 = new C31841a(context2, aVar, dVar2);
                C31843a aVar3 = aVar2.f85466a;
                C31894a aVar4 = new C31894a(aVar2.f85467b);
                Context applicationContext = aVar2.f85467b.getApplicationContext();
                C68225k.m98532d(applicationContext);
                C31827e eVar = new C31827e(C5186p.m14143a(applicationContext), new C31801i());
                Context applicationContext2 = aVar2.f85467b.getApplicationContext();
                C68225k.m98532d(applicationContext2);
                C5186p.m14143a(applicationContext2);
                int i = C31811s.f85435a;
                C31810r rVar = new C31810r(aVar3, aVar4, eVar, aVar2.mo37399a(), (C21370a) aVar2.f85468c.mo17428b());
                Context applicationContext3 = aVar2.f85467b.getApplicationContext();
                C68225k.m98532d(applicationContext3);
                C31781b bVar = new C31781b(C144894ay.m235496a(applicationContext3), new C31840d());
                Context applicationContext4 = aVar2.f85467b.getApplicationContext();
                C68225k.m98532d(applicationContext4);
                nVar = new C31836n(rVar, bVar, new C31785f(applicationContext4, (C21370a) aVar2.f85468c.mo17428b()), aVar2.mo37399a(), (C21370a) aVar2.f85468c.mo17428b());
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
        return nVar;
    }

    /* renamed from: c */
    public static void m59138c(Context context, String str) {
        try {
            m59141f(context, str);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: d */
    public static synchronized boolean m59139d() {
        boolean c;
        synchronized (C31779a.class) {
            try {
                c = f85390a.mo37402c();
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
        return c;
    }

    /* renamed from: e */
    public static synchronized C31843a m59140e() {
        C31843a aVar;
        synchronized (C31779a.class) {
            aVar = f85390a;
        }
        return aVar;
    }

    /* renamed from: f */
    public static synchronized void m59141f(Context context, String str) {
        synchronized (C31779a.class) {
            try {
                C58838bb.m90866a(context, "Application context must not be null.");
                C58838bb.m90866a(str, "API Key must not be null.");
                C58838bb.m90869d(!str.isEmpty(), "API Key must not be empty.");
                C31775f.m59131b(context.getApplicationContext());
                f85390a.mo37403d(str);
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
    }
}
