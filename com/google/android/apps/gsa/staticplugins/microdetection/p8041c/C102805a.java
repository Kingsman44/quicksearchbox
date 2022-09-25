package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.a */
/* compiled from: PG */
public final /* synthetic */ class C102805a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C102810f f287062a;

    /* renamed from: b */
    public final /* synthetic */ C118569b f287063b;

    public /* synthetic */ C102805a(C102810f fVar, C118569b bVar) {
        this.f287062a = fVar;
        this.f287063b = bVar;
    }

    public final void accept(Object obj) {
        C118569b bVar = (C118569b) obj;
        ((C118827a) this.f287062a.f287075c.mo27525b()).mo77944g(bVar, C118575h.HOTWORD_MODEL_UPDATE_MDD).mo104025g(bVar == this.f287063b ? 1 : 0);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
