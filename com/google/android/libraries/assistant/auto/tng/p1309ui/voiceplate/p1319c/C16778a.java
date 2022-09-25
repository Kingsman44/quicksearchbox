package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1319c;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16751bl;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.a */
/* compiled from: PG */
public final /* synthetic */ class C16778a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16779b f49091a;

    public /* synthetic */ C16778a(C16779b bVar) {
        this.f49091a = bVar;
    }

    public final void run() {
        C16779b bVar = this.f49091a;
        C16781d dVar = bVar.f49093b;
        C16751bl blVar = (C16751bl) dVar.f49099d.toBuilder();
        blVar.copyOnWrite();
        C16752bm bmVar = (C16752bm) blVar.instance;
        bmVar.f49005a |= 2;
        bmVar.f49007c = true;
        dVar.f49099d = (C16752bm) blVar.build();
        C16781d dVar2 = bVar.f49093b;
        dVar2.mo23009i(dVar2.f49099d);
    }
}
