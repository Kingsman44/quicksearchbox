package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9182e;

import android.databinding.C0118a;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.e.k */
/* compiled from: PG */
public final class C121273k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C121481e f336841a;

    /* renamed from: b */
    final /* synthetic */ C121274l f336842b;

    public C121273k(C121274l lVar, C121481e eVar) {
        this.f336842b = lVar;
        this.f336841a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C0118a.m110r(C121274l.f336843a.mo56226d(), "Failed to retrieve suggestions", 35758, th, C58979ad.FULL);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f336842b.f336845c.mo105074b(this.f336841a.mo105169a(), (C58485gu) Collection.EL.stream(((C121269g) obj).mo105100a()).map(C121271i.f336839a).flatMap(C121272j.f336840a).collect(C58370cn.f155946a));
    }
}
