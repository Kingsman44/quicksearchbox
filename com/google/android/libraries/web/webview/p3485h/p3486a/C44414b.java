package com.google.android.libraries.web.webview.p3485h.p3486a;

import androidx.p201w.C4322a;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4354w;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.webview.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C44414b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C4322a f115456a;

    public /* synthetic */ C44414b(C4322a aVar) {
        this.f115456a = aVar;
    }

    public final void accept(Object obj) {
        C4322a aVar = this.f115456a;
        String str = ((String) obj).toString();
        if (C4325ab.f13949b.mo9267d()) {
            ((C4354w) aVar).f13968a.postMessage(str);
            return;
        }
        throw C4325ab.m12422a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
