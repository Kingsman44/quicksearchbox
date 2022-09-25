package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.y */
/* compiled from: PG */
public final /* synthetic */ class C78086y implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C78086y f215072a = new C78086y();

    private /* synthetic */ C78086y() {
    }

    public final void accept(Object obj) {
        Duration duration = AnswerUiRenderer.f214882a;
        ((C78034ag) obj).mo73000f().ifPresent(C78085x.f215071a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
