package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75284q;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.ag */
/* compiled from: PG */
public final /* synthetic */ class C77554ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75284q f213694a;

    public /* synthetic */ C77554ag(C75284q qVar) {
        this.f213694a = qVar;
    }

    public final void accept(Object obj) {
        C75284q qVar = this.f213694a;
        C77890v vVar = (C77890v) obj;
        if (vVar == C77890v.HOTWORD_NOT_FOUND) {
            qVar.f209750b = Optional.m71637of(false);
        } else if (vVar == C77890v.HOTWORD_FOUND) {
            qVar.f209750b = Optional.m71637of(true);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
