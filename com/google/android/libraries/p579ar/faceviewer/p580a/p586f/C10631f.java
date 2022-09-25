package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.webkit.ValueCallback;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.f */
/* compiled from: PG */
public final /* synthetic */ class C10631f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10634i f35517a;

    /* renamed from: b */
    public final /* synthetic */ String f35518b;

    public /* synthetic */ C10631f(C10634i iVar, String str) {
        this.f35517a = iVar;
        this.f35518b = str;
    }

    public final void run() {
        C10634i iVar = this.f35517a;
        iVar.f35520b.evaluateJavascript(String.format("receiveDataJson(\"%s\")", new Object[]{this.f35518b}), (ValueCallback) null);
    }
}
