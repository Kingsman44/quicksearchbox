package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.phenotype.client.stable.C31705ax;
import com.google.android.libraries.phenotype.client.stable.C31715bg;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.phenotype.client.t */
/* compiled from: PG */
public final class C31760t {

    /* renamed from: b */
    private static final Object f85359b = new Object();

    /* renamed from: c */
    private static Context f85360c;

    /* renamed from: d */
    private static volatile C31760t f85361d;

    /* renamed from: e */
    private static volatile C31760t f85362e;

    /* renamed from: f */
    private static final C58881cr f85363f = C58886cw.m90973a(C31680s.f85192a);

    /* renamed from: a */
    public final Context f85364a;

    /* renamed from: g */
    private final C58881cr f85365g;

    /* renamed from: h */
    private final C58881cr f85366h;

    /* renamed from: i */
    private final C58833ax f85367i;

    /* renamed from: j */
    private final C58881cr f85368j;

    /* renamed from: com.google.android.libraries.phenotype.client.t$a */
    /* compiled from: PG */
    public interface C31761a {
        /* renamed from: dC */
        C58833ax mo37369dC();
    }

    public C31760t(Context context, C58881cr crVar, C58881cr crVar2, C58833ax axVar, C58881cr crVar3) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        crVar.getClass();
        crVar2.getClass();
        crVar3.getClass();
        this.f85364a = applicationContext;
        this.f85365g = C58886cw.m90973a(crVar);
        this.f85366h = C58886cw.m90973a(crVar2);
        this.f85367i = axVar;
        this.f85368j = C58886cw.m90973a(crVar3);
    }

    /* renamed from: a */
    public static C31760t m59098a() {
        C31763v.f85371c = true;
        Context context = f85360c;
        if (context != null) {
            return m59099b(context);
        }
        synchronized (C31763v.f85369a) {
        }
        if (C31763v.f85372d == null) {
            C31763v.f85372d = new C31762u();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    /* renamed from: b */
    public static C31760t m59099b(Context context) {
        C31761a aVar;
        C31760t tVar;
        synchronized (C31763v.f85369a) {
        }
        C31760t tVar2 = f85361d;
        if (tVar2 == null) {
            synchronized (f85359b) {
                tVar2 = f85361d;
                if (tVar2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        aVar = (C31761a) C47266f.m84076a(applicationContext, C31761a.class);
                    } catch (IllegalStateException unused) {
                        aVar = null;
                    }
                    C58833ax axVar = C58836b.f156633a;
                    if (aVar != null) {
                        axVar = aVar.mo37369dC();
                    } else if (applicationContext instanceof C31761a) {
                        axVar = ((C31761a) applicationContext).mo37369dC();
                    } else {
                        Log.d("PhenotypeContext", "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.");
                    }
                    if (axVar.mo56113h()) {
                        tVar = (C31760t) axVar.mo56107c();
                    } else {
                        C58881cr crVar = f85363f;
                        tVar = new C31760t(applicationContext, crVar, m59100f(applicationContext), C58833ax.m90834k(new C31705ax(crVar)), m59101g(applicationContext));
                    }
                    f85361d = tVar;
                    tVar2 = tVar;
                }
            }
        }
        return tVar2;
    }

    /* renamed from: f */
    public static C58881cr m59100f(Context context) {
        return C58886cw.m90973a(new C31677p(context));
    }

    /* renamed from: g */
    public static C58881cr m59101g(Context context) {
        return C58886cw.m90973a(new C31678q(context));
    }

    /* renamed from: i */
    public static void m59102i(Context context) {
        synchronized (f85359b) {
            if (f85360c == null) {
                synchronized (C31763v.f85369a) {
                }
                f85360c = context.getApplicationContext();
            }
        }
    }

    /* renamed from: j */
    public static void m59103j() {
        synchronized (C31763v.f85369a) {
        }
        if (f85360c == null && C31763v.f85370b == null) {
            C31763v.f85370b = new C31762u();
        }
    }

    /* renamed from: c */
    public final C31639g mo37365c() {
        return (C31639g) this.f85366h.mo6453a();
    }

    /* renamed from: d */
    public final C31715bg mo37366d() {
        return (C31715bg) ((C58847bk) this.f85367i).f156646a;
    }

    /* renamed from: e */
    public final C42813k mo37367e() {
        return (C42813k) this.f85368j.mo6453a();
    }

    /* renamed from: h */
    public final C60888db mo37368h() {
        return (C60888db) this.f85365g.mo6453a();
    }
}
