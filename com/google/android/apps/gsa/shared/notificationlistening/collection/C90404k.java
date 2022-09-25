package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.graphics.Bitmap;
import androidx.core.app.C1787ad;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.k */
/* compiled from: PG */
public final /* synthetic */ class C90404k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C90429j f252482a;

    /* renamed from: b */
    public final /* synthetic */ C1787ad f252483b;

    public /* synthetic */ C90404k(C90429j jVar, C1787ad adVar) {
        this.f252482a = jVar;
        this.f252483b = adVar;
    }

    public final void accept(Object obj) {
        C90429j jVar = this.f252482a;
        C1787ad adVar = this.f252483b;
        int i = C90406m.f252484c;
        jVar.f252624u = adVar.f5572e;
        jVar.f252613B = (Bitmap) obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
