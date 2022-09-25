package com.google.android.apps.gsa.assist;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assist.bn */
/* compiled from: PG */
public final /* synthetic */ class C9373bn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C9397cb f32533a;

    public /* synthetic */ C9373bn(C9397cb cbVar) {
        this.f32533a = cbVar;
    }

    public final void accept(Object obj) {
        ((GsaVoiceInteractionView) obj).f32317d = this.f32533a;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
