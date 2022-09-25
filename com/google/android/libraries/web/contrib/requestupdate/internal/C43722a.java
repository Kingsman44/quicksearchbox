package com.google.android.libraries.web.contrib.requestupdate.internal;

import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3416i.p3417a.C43810c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.requestupdate.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C43722a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43367l f114057a;

    /* renamed from: b */
    public final /* synthetic */ C43810c f114058b;

    public /* synthetic */ C43722a(C43367l lVar, C43810c cVar) {
        this.f114057a = lVar;
        this.f114058b = cVar;
    }

    public final void accept(Object obj) {
        ((C43807a) obj).mo42700x(this.f114057a, this.f114058b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
