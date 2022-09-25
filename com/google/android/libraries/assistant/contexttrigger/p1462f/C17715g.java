package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48893ah;
import com.google.assistant.p3803ag.p3807b.p3808a.C48895aj;
import com.google.assistant.p3803ag.p3807b.p3808a.C48896ak;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.g */
/* compiled from: PG */
public final /* synthetic */ class C17715g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48895aj f50914a;

    public /* synthetic */ C17715g(C48895aj ajVar) {
        this.f50914a = ajVar;
    }

    public final void accept(Object obj) {
        C48895aj ajVar = this.f50914a;
        int i = C17716h.f50916e;
        C48897al alVar = (C48897al) ((C48893ah) obj).build();
        ajVar.copyOnWrite();
        C48896ak akVar = (C48896ak) ajVar.instance;
        C48896ak akVar2 = C48896ak.f126523b;
        alVar.getClass();
        akVar.mo53193a();
        akVar.f126525a.add(alVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
