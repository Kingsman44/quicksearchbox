package com.google.android.hotword.service;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.hotword.service.d */
/* compiled from: PG */
final class C146586d extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ String f395939a;

    /* renamed from: b */
    final /* synthetic */ boolean f395940b;

    /* renamed from: c */
    final /* synthetic */ C146587e f395941c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146586d(C146587e eVar, String str, boolean z) {
        super("requestHotwordDetection");
        this.f395941c = eVar;
        this.f395939a = str;
        this.f395940b = z;
    }

    public final void run() {
        this.f395941c.mo123394f(this.f395939a, this.f395940b);
    }
}
