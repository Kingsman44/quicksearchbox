package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.as */
/* compiled from: PG */
final class C92590as implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92518d f258379a;

    /* renamed from: b */
    final /* synthetic */ EventForDump f258380b;

    /* renamed from: c */
    final /* synthetic */ C92591at f258381c;

    public C92590as(C92591at atVar, C92518d dVar, EventForDump eventForDump) {
        this.f258381c = atVar;
        this.f258379a = dVar;
        this.f258380b = eventForDump;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            C92518d dVar = this.f258379a;
            EventForDump eventForDump = this.f258380b;
            dVar.mo87284l(false, new C92589ar(this, dVar, eventForDump), eventForDump);
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
        this.f258381c.mo87363e(this.f258380b);
    }
}
