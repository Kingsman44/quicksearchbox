package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ao */
/* compiled from: PG */
public final /* synthetic */ class C92586ao implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C92591at f258371a;

    /* renamed from: b */
    public final /* synthetic */ boolean f258372b;

    /* renamed from: c */
    public final /* synthetic */ EventForDump f258373c;

    public /* synthetic */ C92586ao(C92591at atVar, boolean z, EventForDump eventForDump) {
        this.f258371a = atVar;
        this.f258372b = z;
        this.f258373c = eventForDump;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C92591at atVar = this.f258371a;
        boolean z = this.f258372b;
        EventForDump eventForDump = this.f258373c;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            if (atVar.f258386d.mo27525b() != null) {
                C92518d dVar = (C92518d) atVar.f258386d.mo27525b();
                dVar.mo87273a(new C92590as(atVar, dVar, eventForDump));
                return;
            }
            return;
        }
        atVar.mo87363e(eventForDump);
        atVar.f258387e.mo83702b(C89849ae.DELETE_UTTERANCES_ON_DELETE_VOICE_MODEL_SCREEN_ON);
    }
}
