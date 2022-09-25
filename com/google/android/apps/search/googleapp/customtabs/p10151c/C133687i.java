package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.i */
/* compiled from: PG */
public final /* synthetic */ class C133687i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133691m f364138a;

    /* renamed from: b */
    public final /* synthetic */ String f364139b;

    /* renamed from: c */
    public final /* synthetic */ Duration f364140c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f364141d;

    public /* synthetic */ C133687i(C133691m mVar, String str, Duration duration, AtomicReference atomicReference) {
        this.f364138a = mVar;
        this.f364139b = str;
        this.f364140c = duration;
        this.f364141d = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C133691m mVar = this.f364138a;
        String str = this.f364139b;
        Duration duration = this.f364140c;
        AtomicReference atomicReference = this.f364141d;
        C133693o oVar = (C133693o) obj;
        if (!mVar.mo111337e(str, oVar, duration)) {
            atomicReference.set(oVar);
            return C60856cj.m92900i(oVar);
        }
        C60870cx q = C60856cj.m92908q(mVar.f364152e.mo111386a(), C133691m.f364150c.toMillis(), TimeUnit.MILLISECONDS, mVar.f364154g);
        C133680b bVar = new C133680b(mVar);
        C60870cx h = C60922j.m93045h(q, C47810es.m84966f(bVar), C60826bg.f164896a);
        C133685g gVar = new C133685g(atomicReference);
        return C60922j.m93044g(h, C47810es.m84963c(gVar), C60826bg.f164896a);
    }
}
