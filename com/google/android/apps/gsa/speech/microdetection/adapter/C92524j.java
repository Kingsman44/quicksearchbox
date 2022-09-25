package com.google.android.apps.gsa.speech.microdetection.adapter;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.j */
/* compiled from: PG */
final class C92524j extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ boolean f258218a;

    /* renamed from: b */
    final /* synthetic */ C92525k f258219b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92524j(C92525k kVar, boolean z) {
        super("Run callback with setRecognitionState result");
        this.f258219b = kVar;
        this.f258218a = z;
    }

    public final void run() {
        this.f258219b.f258221b.mo49375a(this.f258218a);
    }
}
