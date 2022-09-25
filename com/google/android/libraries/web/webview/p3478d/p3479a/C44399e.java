package com.google.android.libraries.web.webview.p3478d.p3479a;

import com.google.android.libraries.web.base.p3348b.p3350b.C43242a;
import com.google.android.libraries.web.contrib.debug.internal.C43490n;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.d.a.e */
/* compiled from: PG */
final class C44399e implements Consumer {

    /* renamed from: a */
    public static final C44399e f115413a = new C44399e();

    public final /* synthetic */ void accept(Object obj) {
        C43490n nVar = (C43490n) obj;
        C69664n.m101061g(nVar, "it");
        nVar.f113591a.f113612d = C43242a.DESTROYED_BROWSER;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
