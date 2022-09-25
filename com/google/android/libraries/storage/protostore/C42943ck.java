package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.ck */
/* compiled from: PG */
public final /* synthetic */ class C42943ck implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42966db f112337a;

    /* renamed from: b */
    public final /* synthetic */ C42954cv f112338b;

    public /* synthetic */ C42943ck(C42966db dbVar, C42954cv cvVar) {
        this.f112337a = dbVar;
        this.f112338b = cvVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42966db dbVar = this.f112337a;
        C42954cv cvVar = this.f112338b;
        Uri uri = (Uri) C60856cj.m92909r(dbVar.f112379b);
        try {
            return C60856cj.m92900i(dbVar.mo46028j(cvVar, uri));
        } catch (IOException e) {
            return C60922j.m93045h(dbVar.mo46024c(e, dbVar.f112385h), C47810es.m84966f(new C42948cp(dbVar, cvVar, uri)), dbVar.f112381d);
        }
    }
}
