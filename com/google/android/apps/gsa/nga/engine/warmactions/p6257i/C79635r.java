package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.r */
/* compiled from: PG */
public final /* synthetic */ class C79635r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C66751r f218447a;

    public /* synthetic */ C79635r(C66751r rVar) {
        this.f218447a = rVar;
    }

    public final void accept(Object obj) {
        C66751r rVar = this.f218447a;
        C66722az azVar = (C66722az) obj;
        rVar.copyOnWrite();
        C66752s sVar = (C66752s) rVar.instance;
        C66752s sVar2 = C66752s.f181544q;
        azVar.getClass();
        sVar.f181552g = azVar;
        sVar.f181546a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
