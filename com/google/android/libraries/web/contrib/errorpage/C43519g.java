package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.common.base.C58893dc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.g */
/* compiled from: PG */
public final /* synthetic */ class C43519g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ErrorPageMixin$1 f113639a;

    public /* synthetic */ C43519g(ErrorPageMixin$1 errorPageMixin$1) {
        this.f113639a = errorPageMixin$1;
    }

    public final void accept(Object obj) {
        C43531s.C43532a aVar = this.f113639a.f113619b.f113667g;
        C58893dc.m90996a(aVar);
        aVar.mo46593d((C43512b) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
