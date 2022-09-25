package com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10991a;

import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147518b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147521c;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147545s;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147546t;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147549w;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11001e.C147529a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11001e.C147530b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.af.a.b.a.a.a */
/* compiled from: PG */
public final class C147484a {
    /* renamed from: a */
    public static final C147488c m240451a(C147546t tVar) {
        C58833ax axVar;
        Executor executor;
        C58817ah ahVar;
        String str;
        C42813k kVar;
        C21370a aVar;
        C147479b bVar;
        C147545s sVar;
        C147490a aVar2;
        if (!tVar.mo124275b().mo56113h()) {
            ((C147518b) tVar).f398148d = "common";
        }
        C147518b bVar2 = (C147518b) tVar;
        bVar2.f398152h = new C147479b(tVar.mo124274a());
        C58817ah ahVar2 = bVar2.f398147c;
        if (ahVar2 == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(ahVar2);
        }
        if (!axVar.mo56113h()) {
            Context a = tVar.mo124274a();
            String str2 = (String) tVar.mo124275b().mo56107c();
            C147530b.m240534a(str2);
            bVar2.f398147c = new C147529a(a, str2);
        }
        Context context = bVar2.f398145a;
        if (context != null && (executor = bVar2.f398146b) != null && (ahVar = bVar2.f398147c) != null && (str = bVar2.f398148d) != null && (kVar = bVar2.f398149e) != null && (aVar = bVar2.f398150f) != null && (bVar = bVar2.f398152h) != null && (sVar = bVar2.f398153i) != null && (aVar2 = bVar2.f398151g) != null) {
            return new C147549w(new C147521c(context, executor, ahVar, str, kVar, aVar, bVar, sVar, aVar2));
        }
        StringBuilder sb = new StringBuilder();
        if (bVar2.f398145a == null) {
            sb.append(" context");
        }
        if (bVar2.f398146b == null) {
            sb.append(" ioExecutor");
        }
        if (bVar2.f398147c == null) {
            sb.append(" accountToDirectoryUriFunction");
        }
        if (bVar2.f398148d == null) {
            sb.append(" instanceId");
        }
        if (bVar2.f398149e == null) {
            sb.append(" fileStorage");
        }
        if (bVar2.f398150f == null) {
            sb.append(" clock");
        }
        if (bVar2.f398152h == null) {
            sb.append(" loggerFactory");
        }
        if (bVar2.f398153i == null) {
            sb.append(" facsClientFactory");
        }
        if (bVar2.f398151g == null) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public static final void m240452b(Context context, C147546t tVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ((C147518b) tVar).f398145a = applicationContext;
            return;
        }
        throw new NullPointerException("Null context");
    }
}
