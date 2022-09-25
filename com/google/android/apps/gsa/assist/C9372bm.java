package com.google.android.apps.gsa.assist;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assist.bm */
/* compiled from: PG */
public final /* synthetic */ class C9372bm implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C9397cb f32532a;

    public /* synthetic */ C9372bm(C9397cb cbVar) {
        this.f32532a = cbVar;
    }

    public final void accept(Object obj) {
        ((GsaVoiceInteractionView) obj).f32316c = this.f32532a.f32619p;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
