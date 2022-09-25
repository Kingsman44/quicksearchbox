package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.l */
/* compiled from: PG */
public final /* synthetic */ class C79554l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f218275a;

    public /* synthetic */ C79554l(StringBuilder sb) {
        this.f218275a = sb;
    }

    public final void accept(Object obj) {
        StringBuilder sb = this.f218275a;
        int i = C79561s.f218282d;
        sb.append(": ");
        sb.append((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
