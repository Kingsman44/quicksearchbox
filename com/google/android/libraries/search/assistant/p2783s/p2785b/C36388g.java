package com.google.android.libraries.search.assistant.p2783s.p2785b;

import com.google.speech.p5208h.C66553aj;
import com.google.speech.p5208h.C66555al;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.s.b.g */
/* compiled from: PG */
final class C36388g implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C66553aj f95020a;

    public C36388g(C66553aj ajVar) {
        this.f95020a = ajVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C36384c cVar = (C36384c) obj;
        C69664n.m101061g(cVar, "it");
        C66553aj ajVar = this.f95020a;
        int i = cVar.f95011a;
        ajVar.copyOnWrite();
        C66555al alVar = (C66555al) ajVar.instance;
        C66555al alVar2 = C66555al.f181029g;
        alVar.f181032a |= 1;
        alVar.f181033b = i;
        C66553aj ajVar2 = this.f95020a;
        int i2 = cVar.f95012b;
        ajVar2.copyOnWrite();
        C66555al alVar3 = (C66555al) ajVar2.instance;
        alVar3.f181032a |= 2;
        alVar3.f181034c = i2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
