package com.google.android.ssb.service;

import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.ssb.service.g */
/* compiled from: PG */
final class C45361g implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92518d f118601a;

    /* renamed from: b */
    final /* synthetic */ Runnable f118602b;

    /* renamed from: c */
    final /* synthetic */ C45363i f118603c;

    public C45361g(C45363i iVar, C92518d dVar, Runnable runnable) {
        this.f118603c = iVar;
        this.f118601a = dVar;
        this.f118602b = runnable;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            C59071e eVar = C45363i.f118606a;
            this.f118603c.f118614i.set(this.f118601a.mo87283k());
            this.f118603c.mo49382i();
            Runnable runnable = this.f118602b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
