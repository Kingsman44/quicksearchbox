package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1326c.p1329b.C16848a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1326c.p1329b.C16849b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.t */
/* compiled from: PG */
public final /* synthetic */ class C118769t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331289a;

    public /* synthetic */ C118769t(C118744ab abVar) {
        this.f331289a = abVar;
    }

    public final Object call() {
        C118744ab abVar = this.f331289a;
        C16848a aVar = (C16848a) C16849b.f49313c.createBuilder();
        boolean z = ((C86338r) abVar.f331220b.mo17428b()).getBoolean("aae_settings_hotword_detector", true);
        aVar.copyOnWrite();
        C16849b bVar = (C16849b) aVar.instance;
        bVar.f49315a = 1 | bVar.f49315a;
        bVar.f49316b = z;
        return (C16849b) aVar.build();
    }
}
