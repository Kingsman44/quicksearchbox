package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.protobuf.C62947c;
import java.util.Collections;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.l */
/* compiled from: PG */
public final /* synthetic */ class C79828l implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C79828l f218899a = new C79828l();

    private /* synthetic */ C79828l() {
    }

    public final void accept(Object obj) {
        C79813di diVar = (C79813di) obj;
        List unmodifiableList = Collections.unmodifiableList(((C79814dj) diVar.instance).f218854d);
        diVar.clear();
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        djVar.mo74261a();
        C62947c.addAll((Iterable) unmodifiableList, (List) djVar.f218854d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
