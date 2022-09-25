package com.google.android.apps.search.assistant.verticals.p9880a.p9887d;

import android.content.ComponentName;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C130356a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130357b f357269a;

    /* renamed from: b */
    public final /* synthetic */ String f357270b;

    public /* synthetic */ C130356a(C130357b bVar, String str) {
        this.f357269a = bVar;
        this.f357270b = str;
    }

    public final void accept(Object obj) {
        this.f357269a.f357272b.f357276d.put(this.f357270b, (ComponentName) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
