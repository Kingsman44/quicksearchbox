package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import com.google.common.p4552o.C60512sq;
import com.google.common.p4552o.C60523ta;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.e */
/* compiled from: PG */
public final /* synthetic */ class C117217e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C60512sq f325386a;

    public /* synthetic */ C117217e(C60512sq sqVar) {
        this.f325386a = sqVar;
    }

    public final void accept(Object obj) {
        C60512sq sqVar = this.f325386a;
        int i = true != ((Boolean) obj).booleanValue() ? 2 : 3;
        sqVar.copyOnWrite();
        C60523ta taVar = (C60523ta) sqVar.instance;
        C60523ta taVar2 = C60523ta.f163862u;
        taVar.f163878o = i - 1;
        taVar.f163864a |= 8192;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
