package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.C142796al;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bp */
/* compiled from: PG */
public final /* synthetic */ class C103250bp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Set f288023a;

    public /* synthetic */ C103250bp(Set set) {
        this.f288023a = set;
    }

    public final void accept(Object obj) {
        Set set = this.f288023a;
        C58974d dVar = C103262ca.f288039a;
        String h = ((C142796al) obj).mo117712h("sameAs");
        if (h != null) {
            set.add(h);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
