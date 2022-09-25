package com.google.p3723ar.imp.core.web;

/* renamed from: com.google.ar.imp.core.web.g */
/* compiled from: PG */
public final /* synthetic */ class C47977g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47978h f124175a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f124176b;

    public /* synthetic */ C47977g(C47978h hVar, byte[] bArr) {
        this.f124175a = hVar;
        this.f124176b = bArr;
    }

    public final void run() {
        C47978h hVar = this.f124175a;
        ImpWebViewBridge.nPostMessage(hVar.f124177a.f124154a, this.f124176b);
    }
}
