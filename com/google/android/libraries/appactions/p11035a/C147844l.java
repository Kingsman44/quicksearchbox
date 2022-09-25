package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58486gv;
import com.google.p4129b.p4136c.C54772t;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.l */
/* compiled from: PG */
public final /* synthetic */ class C147844l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f398863a;

    /* renamed from: b */
    public final /* synthetic */ C58486gv f398864b;

    /* renamed from: c */
    public final /* synthetic */ String f398865c;

    public /* synthetic */ C147844l(C58480gp gpVar, C58486gv gvVar, String str) {
        this.f398863a = gpVar;
        this.f398864b = gvVar;
        this.f398865c = str;
    }

    public final void accept(Object obj) {
        C54772t tVar = (C54772t) obj;
        Collection.EL.stream(tVar.f143703b).forEach(new C147848p(this.f398863a, tVar, this.f398864b, this.f398865c));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
