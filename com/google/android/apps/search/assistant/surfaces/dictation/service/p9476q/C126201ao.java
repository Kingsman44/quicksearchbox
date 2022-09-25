package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ao */
/* compiled from: PG */
public final /* synthetic */ class C126201ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347736a;

    /* renamed from: b */
    public final /* synthetic */ C126207au f347737b;

    public /* synthetic */ C126201ao(C126208av avVar, C126207au auVar) {
        this.f347736a = avVar;
        this.f347737b = auVar;
    }

    public final void accept(Object obj) {
        C126208av avVar = this.f347736a;
        C126207au auVar = this.f347737b;
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36930)).mo56389s("%s done [SD]", avVar.f347766o);
        avVar.f347755d.mo107435f();
        avVar.f347773v.f347829a.mo107477b(avVar, auVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
