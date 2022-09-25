package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.g */
/* compiled from: PG */
final class C92612g implements C92515a {

    /* renamed from: a */
    final /* synthetic */ boolean f258454a;

    /* renamed from: b */
    final /* synthetic */ C92614i f258455b;

    public C92612g(C92614i iVar, boolean z) {
        this.f258455b = iVar;
        this.f258454a = z;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        C92518d dVar;
        if (z && (dVar = this.f258455b.f258459c) != null) {
            dVar.mo87284l(this.f258454a, (C92516b) null, EventForDump.m147676e(5, "#handleHotwordDetectorChange"));
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
