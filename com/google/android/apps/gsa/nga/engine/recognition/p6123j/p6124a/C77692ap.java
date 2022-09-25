package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C77692ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77693aq f214015a;

    public /* synthetic */ C77692ap(C77693aq aqVar) {
        this.f214015a = aqVar;
    }

    public final void accept(Object obj) {
        C77556ai aiVar = (C77556ai) obj;
        this.f214015a.f214017b.mo56158a(TimeUnit.MILLISECONDS);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
