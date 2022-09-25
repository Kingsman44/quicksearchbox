package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22076bf;
import com.google.android.libraries.gsa.actionusermodel.C22077bg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.p */
/* compiled from: PG */
public final /* synthetic */ class C22037p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22076bf f60759a;

    public /* synthetic */ C22037p(C22076bf bfVar) {
        this.f60759a = bfVar;
    }

    public final void accept(Object obj) {
        C22076bf bfVar = this.f60759a;
        String str = (String) obj;
        bfVar.copyOnWrite();
        C22077bg bgVar = (C22077bg) bfVar.instance;
        C22077bg bgVar2 = C22077bg.f60849o;
        str.getClass();
        bgVar.f60851a |= 32;
        bgVar.f60858h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
