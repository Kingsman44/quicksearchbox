package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.p */
/* compiled from: PG */
public final /* synthetic */ class C138290p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376242a;

    public /* synthetic */ C138290p(OneSearchImageProvider oneSearchImageProvider) {
        this.f376242a = oneSearchImageProvider;
    }

    public final void accept(Object obj) {
        C138213bu buVar = (C138213bu) obj;
        long c = this.f376242a.f376211e.mo26871c();
        buVar.copyOnWrite();
        C138214bv bvVar = (C138214bv) buVar.instance;
        C138214bv bvVar2 = C138214bv.f376051f;
        bvVar.f376053a |= 4;
        bvVar.f376056d = c;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
