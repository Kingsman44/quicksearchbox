package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import java.io.Closeable;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C122623ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122640at f339813a;

    /* renamed from: b */
    public final /* synthetic */ C61920cc f339814b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f339815c;

    /* renamed from: d */
    public final /* synthetic */ C122964p f339816d;

    public /* synthetic */ C122623ac(C122640at atVar, C122964p pVar, C61920cc ccVar, Runnable runnable) {
        this.f339813a = atVar;
        this.f339816d = pVar;
        this.f339814b = ccVar;
        this.f339815c = runnable;
    }

    public final C60870cx apply(Object obj) {
        C122640at atVar = this.f339813a;
        C122964p pVar = this.f339816d;
        C61920cc ccVar = this.f339814b;
        Runnable runnable = this.f339815c;
        Optional optional = (Optional) obj;
        Objects.requireNonNull(atVar);
        Optional flatMap = optional.flatMap(new C122626af(atVar));
        pVar.mo105804a(flatMap.flatMap(new C122631ak(optional)));
        optional.map(C122662r.f339911a).orElse("<empty>");
        ccVar.mo58361d((Closeable) flatMap.orElse(null));
        C122641au.m202042b(((C122639as) runnable).f339857a);
        return C60866ct.f164955a;
    }
}
