package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.STSortSpec;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.f.a.s */
/* compiled from: PG */
public final /* synthetic */ class C89759s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C142826w f242952a;

    public /* synthetic */ C89759s(C142826w wVar) {
        this.f242952a = wVar;
    }

    public final void accept(Object obj) {
        C142826w wVar = this.f242952a;
        wVar.f387609b = 5;
        wVar.f387613f = new STSortSpec((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
