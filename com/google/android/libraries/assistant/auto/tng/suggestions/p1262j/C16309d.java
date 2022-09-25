package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.apps.auto.p450a.p451a.C8859ad;
import com.google.android.apps.auto.p450a.p451a.C8869an;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.d */
/* compiled from: PG */
public final /* synthetic */ class C16309d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C8859ad f47997a;

    public /* synthetic */ C16309d(C8859ad adVar) {
        this.f47997a = adVar;
    }

    public final void accept(Object obj) {
        C8859ad adVar = this.f47997a;
        C60870cx cxVar = (C60870cx) obj;
        Object[] objArr = new Object[2];
        int a = C8869an.m23503a(adVar.f30774a);
        objArr[0] = (a == 0 || a == 1) ? "LOGGING_TYPE_UNSPECIFIED" : a != 2 ? a != 3 ? "LOGGING_TYPE_INTERACTION" : "LOGGING_TYPE_DISMISSED" : "LOGGING_TYPE_SHOWN";
        objArr[1] = adVar.f30775b;
        C46459k.m82829b(cxVar, "Failure logging %s event for %s", objArr);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
