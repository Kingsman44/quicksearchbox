package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147816a;
import com.google.android.libraries.appactions.p11035a.p11036a.C147820e;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.v */
/* compiled from: PG */
public final /* synthetic */ class C147854v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C147816a f398879a;

    public /* synthetic */ C147854v(C147816a aVar) {
        this.f398879a = aVar;
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        C147820e eVar = (C147820e) this.f398879a;
        if (eVar.f398802c == null) {
            eVar.f398802c = C58485gu.m89837e();
        }
        eVar.f398802c.mo55395g(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
