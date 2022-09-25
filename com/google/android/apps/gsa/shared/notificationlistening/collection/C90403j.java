package com.google.android.apps.gsa.shared.notificationlistening.collection;

import androidx.core.app.C1787ad;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.j */
/* compiled from: PG */
public final /* synthetic */ class C90403j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C90429j f252480a;

    /* renamed from: b */
    public final /* synthetic */ C1787ad f252481b;

    public /* synthetic */ C90403j(C90429j jVar, C1787ad adVar) {
        this.f252480a = jVar;
        this.f252481b = adVar;
    }

    public final void accept(Object obj) {
        C90429j jVar = this.f252480a;
        C1787ad adVar = this.f252481b;
        int i = C90406m.f252484c;
        jVar.f252625v = (String) obj;
        jVar.f252624u = adVar.f5572e;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
