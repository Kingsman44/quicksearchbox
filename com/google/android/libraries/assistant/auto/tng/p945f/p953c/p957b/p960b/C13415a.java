package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C13415a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C62731b f41219a;

    public /* synthetic */ C13415a(C62731b bVar) {
        this.f41219a = bVar;
    }

    public final void accept(Object obj) {
        C62731b bVar = this.f41219a;
        String obj2 = ((CharSequence) obj).toString();
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
