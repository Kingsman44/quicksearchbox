package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ad */
/* compiled from: PG */
public final /* synthetic */ class C77918ad implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C77918ad f214647a = new C77918ad();

    private /* synthetic */ C77918ad() {
    }

    public final void accept(Object obj) {
        if (!NativeScreenAnnotator.nativeDestroy(((NativeScreenAnnotator) obj).f214628b)) {
            ((C58970a) ((C58970a) NativeScreenAnnotator.f214627a.mo56225c()).mo56372aa(4518)).mo56386p("Failure destroying JNI storage.");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
