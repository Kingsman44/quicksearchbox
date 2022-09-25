package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import android.util.Pair;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.bq */
/* compiled from: PG */
public final /* synthetic */ class C42921bq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112282a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112283b;

    public /* synthetic */ C42921bq(C42929by byVar, C60870cx cxVar) {
        this.f112282a = byVar;
        this.f112283b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C42929by byVar = this.f112282a;
        Object r = C60856cj.m92909r(this.f112283b);
        if (r.equals(obj)) {
            return C60866ct.f164955a;
        }
        MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) C60856cj.m92909r(byVar.f112300f.mo50395b());
        Uri uri = (Uri) C60856cj.m92909r(byVar.f112295a);
        Pair pair = (Pair) byVar.f112303i.get();
        long nativeGetCounter = (long) MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.f112175a);
        if (pair != null && nativeGetCounter == ((Long) pair.second).longValue()) {
            C58838bb.m90884s(r.equals(pair.first), "Cache is inconsistent when it shouldn't be");
        }
        C47558bi b = byVar.f112302h.mo51389b("Write ".concat(String.valueOf(byVar.f112301g)));
        try {
            byVar.mo46001j(uri, obj, mappedCounterCacheVersion);
            if (b != null) {
                b.close();
            }
            return C60866ct.f164955a;
        } catch (Throwable th) {
            C42908bd.m75784a(th, th);
        }
        throw th;
    }
}
