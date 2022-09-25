package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.app.PendingIntent;
import com.google.android.gms.semanticlocation.C145988z;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ax */
/* compiled from: PG */
public final /* synthetic */ class C131784ax implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131790bc f359966a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f359967b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f359968c;

    public /* synthetic */ C131784ax(C131790bc bcVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f359966a = bcVar;
        this.f359967b = cxVar;
        this.f359968c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131790bc bcVar = this.f359966a;
        C60870cx cxVar = this.f359967b;
        C60870cx cxVar2 = this.f359968c;
        if (((Optional) C60856cj.m92909r(cxVar)).isEmpty()) {
            ((C58970a) ((C58970a) bcVar.f359981h.mo56226d()).mo56372aa(39373)).mo56386p("Pending intent is null, CSL is not registered");
            return C60866ct.f164955a;
        }
        try {
            return C47633f.m84733g(C43205e.m76192b(((C145988z) C60856cj.m92909r(cxVar2)).mo122427a(C131790bc.f359974a, (PendingIntent) ((Optional) C60856cj.m92909r(cxVar)).get()))).mo51516i(new C131779as(bcVar), bcVar.f359978e).mo51513e(Exception.class, new C131780at(bcVar), bcVar.f359978e);
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) bcVar.f359981h.mo56225c()).mo56382g(e)).mo56372aa(39372)).mo56386p("CSL subscription exception");
            return C60866ct.f164955a;
        }
    }
}
