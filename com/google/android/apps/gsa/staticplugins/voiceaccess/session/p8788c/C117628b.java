package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8788c;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117623d;
import com.google.android.libraries.accessibility.voiceaccess.api.VoiceAccessClientEventData;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147335a;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147336b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.c.b */
/* compiled from: PG */
public final class C117628b {

    /* renamed from: a */
    public final C117623d f326516a;

    /* renamed from: b */
    private final C22871g f326517b;

    public C117628b(C117623d dVar, C22871g gVar) {
        this.f326516a = dVar;
        this.f326517b = gVar;
    }

    /* renamed from: b */
    public static final C147335a m195531b(int i) {
        C147335a aVar = (C147335a) C147336b.f397726f.createBuilder();
        aVar.copyOnWrite();
        C147336b bVar = (C147336b) aVar.instance;
        bVar.f397729b = i;
        bVar.f397728a |= 1;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.copyOnWrite();
        C147336b bVar2 = (C147336b) aVar.instance;
        bVar2.f397728a |= 4;
        bVar2.f397732e = currentTimeMillis;
        return aVar;
    }

    /* renamed from: a */
    public final void mo103418a(C147335a aVar) {
        VoiceAccessClientEventData voiceAccessClientEventData = new VoiceAccessClientEventData((C147336b) aVar.build());
        if (C22872h.m42744d(C0826b.class)) {
            this.f326516a.mo103414c(voiceAccessClientEventData);
        } else {
            this.f326517b.mo28207g("sendEvent", new C117627a(this, voiceAccessClientEventData));
        }
    }
}
