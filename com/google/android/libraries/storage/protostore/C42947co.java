package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3307c.C42765r;
import com.google.android.libraries.storage.p3304a.p3312f.C42781e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.co */
/* compiled from: PG */
public final /* synthetic */ class C42947co implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42966db f112343a;

    /* renamed from: b */
    public final /* synthetic */ C60931s f112344b;

    /* renamed from: c */
    public final /* synthetic */ Executor f112345c;

    /* renamed from: d */
    public final /* synthetic */ C42955cw f112346d;

    public /* synthetic */ C42947co(C42966db dbVar, C60931s sVar, Executor executor, C42955cw cwVar) {
        this.f112343a = dbVar;
        this.f112344b = sVar;
        this.f112345c = executor;
        this.f112346d = cwVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C42966db dbVar = this.f112343a;
        C60931s sVar = this.f112344b;
        Executor executor = this.f112345c;
        C42955cw cwVar = this.f112346d;
        Uri uri = (Uri) C60856cj.m92909r(dbVar.f112379b);
        C42765r rVar = new C42765r((Closeable) dbVar.f112382e.mo45889c(uri, C42781e.m75547b()));
        try {
            cxVar = C60856cj.m92900i(dbVar.mo46025d(uri));
        } catch (IOException e) {
            try {
                cxVar = C60922j.m93045h(dbVar.mo46024c(e, dbVar.f112386i), C47810es.m84966f(new C42950cr(dbVar, uri)), dbVar.f112381d);
            } catch (Throwable th) {
                C42942cj.m75834a(th, th);
            }
        }
        C60870cx h = C60922j.m93045h(cxVar, sVar, executor);
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(new C42952ct(dbVar, cxVar, h, cwVar)), C60826bg.f164896a);
        Closeable closeable = rVar.f112024a;
        rVar.f112024a = null;
        C60870cx b = C42966db.m75849b(h2, closeable, dbVar.f112381d);
        rVar.close();
        return b;
        throw th;
    }
}
