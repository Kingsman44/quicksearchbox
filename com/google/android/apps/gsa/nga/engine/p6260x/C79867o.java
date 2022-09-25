package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80476a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.speech.recognizer.p5233a.C67442ak;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.o */
/* compiled from: PG */
public final /* synthetic */ class C79867o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80476a f218932a;

    public /* synthetic */ C79867o(C80476a aVar) {
        this.f218932a = aVar;
    }

    public final void accept(Object obj) {
        C80476a aVar = this.f218932a;
        C67442ak akVar = (C67442ak) obj;
        aVar.copyOnWrite();
        C80484i iVar = C80484i.f220937h;
        akVar.getClass();
        ((C80484i) aVar.instance).f220941c = akVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
