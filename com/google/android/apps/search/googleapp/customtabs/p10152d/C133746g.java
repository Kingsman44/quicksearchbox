package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133732r;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133739y;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133740z;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.HashSet;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.g */
/* compiled from: PG */
public final class C133746g {

    /* renamed from: a */
    public static final Duration f364283a = Duration.ofMinutes(1);

    /* renamed from: b */
    public static final C59071e f364284b = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.d.g");

    /* renamed from: c */
    public final C20665u f364285c;

    /* renamed from: d */
    public final Object f364286d = new Object();

    /* renamed from: e */
    public final C133742c f364287e;

    /* renamed from: f */
    public final C133739y f364288f;

    /* renamed from: g */
    public boolean f364289g = false;

    /* renamed from: h */
    public final Set f364290h = new HashSet();

    public C133746g(C20665u uVar, C133742c cVar, C133740z zVar) {
        this.f364285c = uVar;
        this.f364287e = cVar;
        C133732r rVar = (C133732r) zVar.f364267a.mo17428b();
        rVar.getClass();
        C60888db dbVar = (C60888db) zVar.f364268b.mo17428b();
        dbVar.getClass();
        C21370a aVar = (C21370a) zVar.f364269c.mo17428b();
        aVar.getClass();
        uVar.getClass();
        this.f364288f = new C133739y(rVar, dbVar, aVar, uVar);
    }

    /* renamed from: a */
    public final void mo111382a() {
        C58485gu j;
        synchronized (this.f364286d) {
            C58893dc.m90997b(!this.f364289g);
            this.f364289g = true;
            j = C58485gu.m89842j(this.f364290h);
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) j.get(i)).run();
        }
    }
}
