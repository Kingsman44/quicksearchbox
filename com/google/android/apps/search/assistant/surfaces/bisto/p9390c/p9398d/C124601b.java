package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124542a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.p9400b.C124602a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.p9400b.C124603b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.d.b */
/* compiled from: PG */
public final class C124601b implements C124599a, C124603b {

    /* renamed from: b */
    private static final C59071e f343716b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.c.d.b");

    /* renamed from: a */
    public final C124603b f343717a;

    /* renamed from: c */
    private final Map f343718c;

    /* renamed from: d */
    private C124602a f343719d;

    public C124601b(Map map, C124603b bVar) {
        this.f343718c = map;
        this.f343717a = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo90213a() {
    }

    /* renamed from: b */
    public final void mo106552b() {
        C59104x c = f343716b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TngBistoOtaSession");
        ((C59052c) ((C59052c) c).mo56372aa(36264)).mo56386p("OtaSession delegate should not be overridden");
    }

    /* renamed from: c */
    public final synchronized void mo90214c() {
    }

    /* renamed from: e */
    public final synchronized void mo90217e(long j) {
    }

    /* renamed from: g */
    public final synchronized void mo90219g() {
    }

    /* renamed from: h */
    public final synchronized void mo90220h(boolean z, boolean z2, boolean z3, Collection collection) {
        if (this.f343719d == null) {
            C124602a aVar = (C124602a) this.f343718c.get("OtaIdleState");
            aVar.getClass();
            this.f343719d = aVar;
        }
        C124629av avVar = C124629av.f343812r;
        C124542a.m204020a();
    }

    /* renamed from: i */
    public final synchronized void mo90221i() {
    }
}
