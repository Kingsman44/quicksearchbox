package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.df */
/* compiled from: PG */
public final /* synthetic */ class C77234df implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51500k f213074a;

    public /* synthetic */ C77234df(C51500k kVar) {
        this.f213074a = kVar;
    }

    public final void accept(Object obj) {
        C51500k kVar = this.f213074a;
        long millis = ((Duration) obj).toMillis();
        kVar.copyOnWrite();
        C51527l lVar = (C51527l) kVar.instance;
        C51527l lVar2 = C51527l.f134273f;
        lVar.f134275a |= 2;
        lVar.f134277c = millis;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
