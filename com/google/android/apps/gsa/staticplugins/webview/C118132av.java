package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7828c.C99763h;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7828c.C99765i;
import com.google.android.apps.gsa.staticplugins.webview.common.ScrollableGsaWebView;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.av */
/* compiled from: PG */
public final /* synthetic */ class C118132av implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118152bo f327882a;

    /* renamed from: b */
    public final /* synthetic */ C118119ai f327883b;

    /* renamed from: c */
    public final /* synthetic */ ScrollableGsaWebView f327884c;

    public /* synthetic */ C118132av(C118152bo boVar, C118119ai aiVar, ScrollableGsaWebView scrollableGsaWebView) {
        this.f327882a = boVar;
        this.f327883b = aiVar;
        this.f327884c = scrollableGsaWebView;
    }

    public final void accept(Object obj) {
        C118152bo boVar = this.f327882a;
        C118119ai aiVar = this.f327883b;
        ScrollableGsaWebView scrollableGsaWebView = this.f327884c;
        C99765i iVar = (C99765i) obj;
        C118123am amVar = new C118123am(boVar, aiVar);
        Context context = scrollableGsaWebView.getContext();
        context.getClass();
        C84411o oVar = (C84411o) iVar.f279151a.mo17428b();
        oVar.getClass();
        C86034c cVar = (C86034c) iVar.f279152b.mo17428b();
        cVar.getClass();
        C90851k kVar = (C90851k) iVar.f279153c.mo17428b();
        kVar.getClass();
        scrollableGsaWebView.addJavascriptInterface(new C99763h(amVar, context, oVar, cVar, kVar), "silk_channels_ext");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
