package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9225c;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121219ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.c.a */
/* compiled from: PG */
public final class C121472a implements C121214b {

    /* renamed from: a */
    private final C60950i f337138a;

    public C121472a(C60950i iVar) {
        this.f337138a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Duration mo105081a() {
        return Duration.ofDays(1);
    }

    /* renamed from: b */
    public final /* synthetic */ Duration mo105082b() {
        return Duration.ofHours(4);
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo105083c() {
        return true;
    }

    /* renamed from: d */
    public final C60870cx mo105084d() {
        C121219ad adVar = (C121219ad) C121220ae.f336741f.createBuilder();
        long epochMilli = this.f337138a.mo57444a().toEpochMilli();
        adVar.copyOnWrite();
        C121220ae aeVar = (C121220ae) adVar.instance;
        aeVar.f336743a |= 1;
        aeVar.f336746d = epochMilli;
        C48714bv bvVar = C48714bv.APP_USAGE_STATS_SIGNAL;
        adVar.copyOnWrite();
        C121220ae aeVar2 = (C121220ae) adVar.instance;
        aeVar2.f336747e = bvVar.f126042j;
        aeVar2.f336743a |= 2;
        return C60856cj.m92900i((C121220ae) adVar.build());
    }
}
