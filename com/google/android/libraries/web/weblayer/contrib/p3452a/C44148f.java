package com.google.android.libraries.web.weblayer.contrib.p3452a;

import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.f */
/* compiled from: PG */
public final /* synthetic */ class C44148f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114886a;

    /* renamed from: b */
    public final /* synthetic */ List f114887b;

    public /* synthetic */ C44148f(C44161s sVar, List list) {
        this.f114886a = sVar;
        this.f114887b = list;
    }

    public final void run() {
        Collection.EL.stream(this.f114886a.f114905b.mo47214e()).filter(new C44149g(this.f114887b)).forEach(C44150h.f114889a);
    }
}
