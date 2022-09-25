package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ar */
/* compiled from: PG */
public final /* synthetic */ class C92589ar implements C92516b {

    /* renamed from: a */
    public final /* synthetic */ C92590as f258376a;

    /* renamed from: b */
    public final /* synthetic */ C92518d f258377b;

    /* renamed from: c */
    public final /* synthetic */ EventForDump f258378c;

    public /* synthetic */ C92589ar(C92590as asVar, C92518d dVar, EventForDump eventForDump) {
        this.f258376a = asVar;
        this.f258377b = dVar;
        this.f258378c = eventForDump;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        C92590as asVar = this.f258376a;
        C92518d dVar = this.f258377b;
        EventForDump eventForDump = this.f258378c;
        C92591at atVar = asVar.f258381c;
        if (dVar != null) {
            dVar.mo87286n(atVar.f258384b, new C92585an(atVar, dVar, eventForDump));
        }
    }
}
