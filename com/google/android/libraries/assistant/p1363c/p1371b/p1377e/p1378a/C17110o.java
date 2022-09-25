package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.o */
/* compiled from: PG */
public final /* synthetic */ class C17110o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17119x f49782a;

    /* renamed from: b */
    public final /* synthetic */ int f49783b;

    /* renamed from: c */
    public final /* synthetic */ C28740br f49784c;

    /* renamed from: d */
    public final /* synthetic */ Duration f49785d;

    public /* synthetic */ C17110o(C17119x xVar, int i, C28740br brVar, Duration duration) {
        this.f49782a = xVar;
        this.f49783b = i;
        this.f49784c = brVar;
        this.f49785d = duration;
    }

    public final C60870cx apply(Object obj) {
        C17119x xVar = this.f49782a;
        int i = this.f49783b;
        C28740br brVar = this.f49784c;
        Duration duration = this.f49785d;
        C29690f fVar = (C29690f) obj;
        if (i <= 0 || fVar != null) {
            return C60866ct.f164955a;
        }
        C17111p pVar = new C17111p(xVar, brVar, duration, i);
        return C60856cj.m92902k(C47810es.m84965e(pVar), duration.toMillis(), TimeUnit.MILLISECONDS, xVar.f49803d);
    }
}
