package com.google.android.libraries.web.contrib.p3388h;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import p3186j$.util.Collection;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.web.contrib.h.j */
/* compiled from: PG */
public final /* synthetic */ class C43618j implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C43626r f113851a;

    /* renamed from: b */
    public final /* synthetic */ C43625q f113852b;

    /* renamed from: c */
    public final /* synthetic */ BiConsumer f113853c;

    /* renamed from: d */
    public final /* synthetic */ C43624p f113854d;

    public /* synthetic */ C43618j(C43626r rVar, C43625q qVar, BiConsumer biConsumer, C43624p pVar) {
        this.f113851a = rVar;
        this.f113852b = qVar;
        this.f113853c = biConsumer;
        this.f113854d = pVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C43626r rVar = this.f113851a;
        C43625q qVar = this.f113852b;
        BiConsumer biConsumer = this.f113853c;
        C43624p pVar = this.f113854d;
        if (!qVar.f113868b.isEmpty()) {
            Collection.EL.stream(qVar.f113868b).forEach(new C43616h(biConsumer, cVar));
            return "screenshotFuture";
        }
        rVar.mo46654c(pVar, cVar);
        return "screenshotFuture";
    }
}
