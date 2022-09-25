package com.google.android.libraries.search.p3090o;

import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.o.d */
/* compiled from: PG */
public final /* synthetic */ class C39826d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C39827e f104726a;

    /* renamed from: b */
    public final /* synthetic */ C39823a f104727b;

    public /* synthetic */ C39826d(C39827e eVar, C39823a aVar) {
        this.f104726a = eVar;
        this.f104727b = aVar;
    }

    public final void accept(Object obj) {
        C39827e eVar = this.f104726a;
        C39823a aVar = this.f104727b;
        aVar.copyOnWrite();
        C39824b bVar = (C39824b) aVar.instance;
        C39824b bVar2 = C39824b.f104719e;
        bVar.f104723c = ((C56016b) obj).f149184d;
        bVar.f104721a |= 2;
        C63042fg i = C62953e.m95484i(eVar.f104730a.mo26870b());
        aVar.copyOnWrite();
        C39824b bVar3 = (C39824b) aVar.instance;
        i.getClass();
        bVar3.f104724d = i;
        bVar3.f104721a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
