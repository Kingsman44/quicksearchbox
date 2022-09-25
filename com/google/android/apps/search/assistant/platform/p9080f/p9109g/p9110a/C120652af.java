package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120814g;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.speech.p5218j.C67050je;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.af */
/* compiled from: PG */
public final /* synthetic */ class C120652af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120814g f335594a;

    public /* synthetic */ C120652af(C120814g gVar) {
        this.f335594a = gVar;
    }

    public final void accept(Object obj) {
        C120814g gVar = this.f335594a;
        C67050je jeVar = (C67050je) obj;
        gVar.copyOnWrite();
        C120815h hVar = (C120815h) gVar.instance;
        C120815h hVar2 = C120815h.f335972f;
        jeVar.getClass();
        hVar.f335977d = jeVar;
        hVar.f335974a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
