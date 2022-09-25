package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.bk */
/* compiled from: PG */
public final /* synthetic */ class C42915bk implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112272a;

    /* renamed from: b */
    public final /* synthetic */ MappedCounterCacheVersion f112273b;

    public /* synthetic */ C42915bk(C42929by byVar, MappedCounterCacheVersion mappedCounterCacheVersion) {
        this.f112272a = byVar;
        this.f112273b = mappedCounterCacheVersion;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42929by byVar = this.f112272a;
        MappedCounterCacheVersion mappedCounterCacheVersion = this.f112273b;
        Uri uri = (Uri) C60856cj.m92909r(byVar.f112295a);
        try {
            return C60856cj.m92900i(byVar.mo46000i(uri, mappedCounterCacheVersion));
        } catch (IOException e) {
            return C60922j.m93045h(byVar.mo45997c(e, new C42927bw(byVar)), C47810es.m84966f(new C42919bo(byVar, uri, mappedCounterCacheVersion)), byVar.f112296b);
        }
    }
}
