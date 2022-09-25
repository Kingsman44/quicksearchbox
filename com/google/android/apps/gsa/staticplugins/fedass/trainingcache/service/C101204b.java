package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.b */
/* compiled from: PG */
public final /* synthetic */ class C101204b implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ TrainingCacheService f282483a;

    public /* synthetic */ C101204b(TrainingCacheService trainingCacheService) {
        this.f282483a = trainingCacheService;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        TrainingCacheService trainingCacheService = this.f282483a;
        if (!Boolean.TRUE.equals(Boolean.valueOf(((C132798f) obj).f362320d))) {
            ((C59052c) ((C59052c) TrainingCacheService.f282463a.mo56224b()).mo56372aa(19907)).mo56386p("Clearing cache on account status change.");
            trainingCacheService.f282464b.mo92042e();
        }
    }
}
