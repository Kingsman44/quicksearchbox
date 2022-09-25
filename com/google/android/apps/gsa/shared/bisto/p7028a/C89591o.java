package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.o */
/* compiled from: PG */
public final /* synthetic */ class C89591o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C89474bm f242655a;

    /* renamed from: b */
    public final /* synthetic */ String f242656b;

    /* renamed from: c */
    public final /* synthetic */ long f242657c;

    public /* synthetic */ C89591o(C89474bm bmVar, String str, long j) {
        this.f242655a = bmVar;
        this.f242656b = str;
        this.f242657c = j;
    }

    public final void accept(Object obj) {
        this.f242655a.mo83413s(this.f242656b, new C58759qy(12), this.f242657c, (C124709g) obj, true);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
