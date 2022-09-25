package com.google.android.libraries.web.webview.p3491j;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.j.h */
/* compiled from: PG */
final class C44457h implements Consumer {
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C44475p pVar = (C44475p) obj;
        C69664n.m101061g(pVar, "windowPlugin");
        C44454f fVar = pVar.f115616a;
        C44455g.m78521o(fVar, (Context) null);
        ViewParent parent = fVar.getParent();
        C69664n.m101059e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(fVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
