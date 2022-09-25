package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.al */
/* compiled from: PG */
public final /* synthetic */ class C122576al implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339736a;

    /* renamed from: b */
    public final /* synthetic */ C122401at f339737b;

    /* renamed from: c */
    public final /* synthetic */ C122811k f339738c;

    public /* synthetic */ C122576al(C122720au auVar, C122811k kVar, C122401at atVar) {
        this.f339736a = auVar;
        this.f339738c = kVar;
        this.f339737b = atVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122720au auVar = this.f339736a;
        C122811k kVar = this.f339738c;
        C122401at atVar = this.f339737b;
        C122859d dVar = auVar.f340019g;
        boolean z = auVar.f340024l;
        C122419bk bkVar = atVar.f339340b;
        if (bkVar == null) {
            bkVar = C122419bk.f339392l;
        }
        if (bkVar.f339403j || z) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return C47633f.m84733g(kVar.mo105753b()).mo51516i(new C122568ad(atVar), C60826bg.f164896a).mo51513e(Throwable.class, new C122569ae(dVar), C60826bg.f164896a);
    }
}
