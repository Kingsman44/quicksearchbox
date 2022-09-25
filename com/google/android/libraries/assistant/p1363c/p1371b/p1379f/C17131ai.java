package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122180a;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122181b;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.b.f.ai */
/* compiled from: PG */
public final /* synthetic */ class C17131ai implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122180a f49815a;

    public /* synthetic */ C17131ai(C122180a aVar) {
        this.f49815a = aVar;
    }

    public final void accept(Object obj) {
        C122180a aVar = this.f49815a;
        C29690f fVar = (C29690f) obj;
        aVar.copyOnWrite();
        C122181b bVar = C122181b.f338867b;
        fVar.getClass();
        ((C122181b) aVar.instance).f338869a = fVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
