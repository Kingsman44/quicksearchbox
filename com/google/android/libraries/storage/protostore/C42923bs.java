package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3307c.C42765r;
import com.google.android.libraries.storage.p3304a.p3312f.C42781e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.bs */
/* compiled from: PG */
public final /* synthetic */ class C42923bs implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112286a;

    /* renamed from: b */
    public final /* synthetic */ C60931s f112287b;

    /* renamed from: c */
    public final /* synthetic */ Executor f112288c;

    public /* synthetic */ C42923bs(C42929by byVar, C60931s sVar, Executor executor) {
        this.f112286a = byVar;
        this.f112287b = sVar;
        this.f112288c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C42929by byVar = this.f112286a;
        C60931s sVar = this.f112287b;
        Executor executor = this.f112288c;
        Uri uri = (Uri) C60856cj.m92909r(byVar.f112295a);
        C42765r rVar = new C42765r((Closeable) byVar.f112297c.mo45889c(uri, C42781e.m75547b()));
        try {
            cxVar = C60856cj.m92900i(byVar.mo45999h(uri));
        } catch (IOException e) {
            try {
                cxVar = C60922j.m93045h(byVar.mo45997c(e, new C42928bx(byVar)), C47810es.m84966f(new C42910bf(byVar, uri)), byVar.f112296b);
            } catch (Throwable th) {
                C42908bd.m75784a(th, th);
            }
        }
        C60870cx h = C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(cxVar), C47810es.m84966f(sVar), executor), C47810es.m84966f(new C42921bq(byVar, cxVar)), byVar.f112296b);
        Closeable closeable = rVar.f112024a;
        rVar.f112024a = null;
        C60870cx b = C42929by.m75798b(h, closeable, byVar.f112296b);
        rVar.close();
        return b;
        throw th;
    }
}
