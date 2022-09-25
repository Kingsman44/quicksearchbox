package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C147826ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C147827ac f398824a;

    /* renamed from: b */
    public final /* synthetic */ String f398825b;

    public /* synthetic */ C147826ab(C147827ac acVar, String str) {
        this.f398824a = acVar;
        this.f398825b = str;
    }

    public final void accept(Object obj) {
        C147827ac acVar = this.f398824a;
        Map.Entry entry = (Map.Entry) obj;
        acVar.f398827b.mo55540b(this.f398825b, (String) entry.getKey(), C58485gu.m89842j((Collection) entry.getValue()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
