package com.google.android.apps.gsa.nga.engine.recognition.p6136o;

import com.google.android.apps.gsa.nga.engine.recognition.C77562ao;
import com.google.common.p4520a.C58206am;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.o.c */
/* compiled from: PG */
public final /* synthetic */ class C77878c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77881f f214533a;

    /* renamed from: b */
    public final /* synthetic */ String f214534b;

    public /* synthetic */ C77878c(C77881f fVar, String str) {
        this.f214533a = fVar;
        this.f214534b = str;
    }

    public final void accept(Object obj) {
        ((C58206am) this.f214533a.f214537a).f155647a.put(this.f214534b, (C77562ao) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
