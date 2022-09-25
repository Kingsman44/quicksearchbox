package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62730a;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.t */
/* compiled from: PG */
final class C128342t implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C62730a f352981a;

    public C128342t(C62730a aVar) {
        this.f352981a = aVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C69664n.m101061g(charSequence, "it");
        C62730a aVar = this.f352981a;
        String obj2 = charSequence.toString();
        C69664n.m101061g(obj2, "value");
        C62731b bVar = aVar.f169434a;
        bVar.copyOnWrite();
        C62734e eVar = (C62734e) bVar.instance;
        C62734e eVar2 = C62734e.f169440g;
        obj2.getClass();
        eVar.f169442a |= 2;
        eVar.f169444c = obj2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
