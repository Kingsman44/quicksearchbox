package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.engine.C74748a;
import com.google.android.apps.gsa.nga.engine.b.b;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.t */
/* compiled from: PG */
public final /* synthetic */ class C81419t implements Function {

    /* renamed from: a */
    public final /* synthetic */ HotwordDetectedEventData f222826a;

    public /* synthetic */ C81419t(HotwordDetectedEventData hotwordDetectedEventData) {
        this.f222826a = hotwordDetectedEventData;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((b) ((C74748a) obj).mo71131dQ().mo27525b()).d(this.f222826a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
