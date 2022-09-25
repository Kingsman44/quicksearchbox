package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.b */
/* compiled from: PG */
public final /* synthetic */ class C17710b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17712d f50907a;

    /* renamed from: b */
    public final /* synthetic */ List f50908b;

    public /* synthetic */ C17710b(C17712d dVar, List list) {
        this.f50907a = dVar;
        this.f50908b = list;
    }

    public final void accept(Object obj) {
        this.f50908b.add(this.f50907a.mo23445a((C48897al) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
