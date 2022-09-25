package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.protobuf.C63088z;
import java.util.Deque;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.o */
/* compiled from: PG */
public final /* synthetic */ class C107416o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107419r f298935a;

    /* renamed from: b */
    public final /* synthetic */ List f298936b;

    /* renamed from: c */
    public final /* synthetic */ List f298937c;

    /* renamed from: d */
    public final /* synthetic */ Deque f298938d;

    /* renamed from: e */
    public final /* synthetic */ int f298939e;

    public /* synthetic */ C107416o(C107419r rVar, List list, int i, List list2, Deque deque) {
        this.f298935a = rVar;
        this.f298936b = list;
        this.f298939e = i;
        this.f298937c = list2;
        this.f298938d = deque;
    }

    public final void accept(Object obj) {
        C107419r rVar = this.f298935a;
        List list = this.f298936b;
        int i = this.f298939e;
        List list2 = this.f298937c;
        Deque deque = this.f298938d;
        C83683b bVar = (C83683b) obj;
        C48871n nVar = bVar.f228109c;
        if (nVar == null) {
            nVar = C48871n.f126470e;
        }
        rVar.mo96002g(nVar);
        rVar.mo96003h(bVar);
        C108013bm bmVar = rVar.f298946c;
        C48851br brVar = bVar.f228110d;
        if (brVar == null) {
            brVar = C48851br.f126412f;
        }
        C63088z byteString = brVar.toByteString();
        C83682a aVar = (C83682a) bVar.toBuilder();
        aVar.copyOnWrite();
        C83683b bVar2 = (C83683b) aVar.instance;
        bVar2.f228108b = i - 1;
        bVar2.f228107a |= 1;
        list.add(bmVar.mo96356G(byteString, (C83683b) aVar.build(), C107419r.f298944a));
        list2.remove(bVar);
        deque.addFirst(bVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
