package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.p10997a;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4197c.C55944ar;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.af.a.b.c.a.a.d */
/* compiled from: PG */
public final class C147496d implements C147493a {

    /* renamed from: a */
    public final Uri f398117a;

    /* renamed from: b */
    public final C42813k f398118b;

    /* renamed from: c */
    private final Executor f398119c;

    public C147496d(Uri uri, Executor executor, C42813k kVar) {
        this.f398117a = uri;
        this.f398119c = executor;
        this.f398118b = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo124259a(C55944ar arVar) {
        C147494b bVar = new C147494b(this, arVar);
        return C60856cj.m92905n(C47810es.m84965e(bVar), this.f398119c);
    }

    /* renamed from: b */
    public final C60870cx mo124260b() {
        C147495c cVar = new C147495c(this);
        return C60856cj.m92905n(C47810es.m84965e(cVar), this.f398119c);
    }
}
