package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.al */
/* compiled from: PG */
public final /* synthetic */ class C96819al implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96828au f270757a;

    /* renamed from: b */
    public final /* synthetic */ int f270758b;

    /* renamed from: c */
    public final /* synthetic */ long f270759c;

    public /* synthetic */ C96819al(C96828au auVar, int i, long j) {
        this.f270757a = auVar;
        this.f270758b = i;
        this.f270759c = j;
    }

    public final void run() {
        C96828au auVar = this.f270757a;
        int i = this.f270758b;
        long j = this.f270759c;
        auVar.f270785l.mo28212l("GddBackgroundTaskProxyPopulator#unscheduleOneOffTask", new C96821an(auVar, i));
        ((C59052c) ((C59052c) C96828au.f270774a.mo56226d()).mo56372aa(20911)).mo56349B("Batch timed out; batchId=%d taskId=%d", j, i);
        auVar.mo90364a(2);
        auVar.f270784k.mo90363a(j);
    }
}
