package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122197r;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122198s;
import com.google.assistant.p3793ae.p3794a.C48773e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.b.f.ac */
/* compiled from: PG */
public final /* synthetic */ class C17125ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122197r f49809a;

    public /* synthetic */ C17125ac(C122197r rVar) {
        this.f49809a = rVar;
    }

    public final void accept(Object obj) {
        C122197r rVar = this.f49809a;
        C48773e eVar = (C48773e) obj;
        rVar.copyOnWrite();
        C122198s sVar = C122198s.f338900b;
        eVar.getClass();
        ((C122198s) rVar.instance).f338902a = eVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
