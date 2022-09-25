package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C125388ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125390ar f345826a;

    public /* synthetic */ C125388ap(C125390ar arVar) {
        this.f345826a = arVar;
    }

    public final void accept(Object obj) {
        C125385am amVar = (C125385am) obj;
        C46459k.m82829b(this.f345826a.f345830b.mo46039a(C125387ao.f345825a, C60826bg.f164896a), "Error while updating last stats delta request time. [SD]", new Object[0]);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
