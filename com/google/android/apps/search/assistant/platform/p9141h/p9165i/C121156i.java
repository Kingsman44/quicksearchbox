package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121143a;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121144b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.i */
/* compiled from: PG */
final class C121156i implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C121144b f336634a;

    /* renamed from: b */
    final /* synthetic */ boolean f336635b;

    public C121156i(C121144b bVar, boolean z) {
        this.f336634a = bVar;
        this.f336635b = z;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.f336634a.mo105062a(((C121143a) obj).getNumber(), this.f336635b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
