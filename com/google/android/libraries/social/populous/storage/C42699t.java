package com.google.android.libraries.social.populous.storage;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.social.populous.storage.t */
/* compiled from: PG */
public final class C42699t implements C42605af {

    /* renamed from: a */
    final C58839bc f111920a;

    /* renamed from: b */
    public final String[] f111921b;

    /* renamed from: c */
    public final Context f111922c;

    /* renamed from: d */
    public final C42591z f111923d;

    /* renamed from: e */
    public final C42697r f111924e;

    /* renamed from: f */
    private final C21370a f111925f;

    /* renamed from: g */
    private final C60887da f111926g;

    public C42699t(Context context, C58839bc bcVar, C21370a aVar, C60887da daVar, C42591z zVar) {
        String[] databaseList = context.databaseList();
        C42697r rVar = new C42697r(daVar);
        this.f111922c = context;
        this.f111921b = databaseList;
        this.f111920a = bcVar;
        this.f111925f = aVar;
        this.f111926g = daVar;
        this.f111923d = zVar;
        this.f111924e = rVar;
    }

    /* renamed from: a */
    public final void mo45707a(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long b = this.f111925f.mo26870b();
        long j2 = b - millis;
        if (b <= 0) {
            this.f111923d.mo45635e(60, C42576k.f111734a);
            return;
        }
        C60856cj.m92911t(this.f111926g.mo19399b(new C42694o(this, j2)), new C42698s(this, this.f111923d.mo45632b()), this.f111926g);
    }
}
