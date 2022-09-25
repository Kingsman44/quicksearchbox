package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.webkit.WebView;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.f */
/* compiled from: PG */
final class C10718f extends WebView.VisualStateCallback {

    /* renamed from: a */
    final /* synthetic */ String f35650a;

    /* renamed from: b */
    final /* synthetic */ C10719g f35651b;

    public C10718f(C10719g gVar, String str) {
        this.f35651b = gVar;
        this.f35650a = str;
    }

    public final void onComplete(long j) {
        C10719g gVar = this.f35651b;
        gVar.f35653b.onReadyToRender(this.f35650a, gVar.f35652a);
    }
}
