package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.staticplugins.p7666ci.C97764ae;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.t */
/* compiled from: PG */
public final /* synthetic */ class C97848t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C97764ae f273237a;

    /* renamed from: b */
    public final /* synthetic */ List f273238b;

    public /* synthetic */ C97848t(C97764ae aeVar, List list) {
        this.f273237a = aeVar;
        this.f273238b = list;
    }

    public final void accept(Object obj) {
        C97764ae aeVar = this.f273237a;
        List list = this.f273238b;
        C123623b Q = ((C97764ae.C97765a) C47245e.m84045a(aeVar.f272972b, C97764ae.C97765a.class, (AccountId) obj)).mo90807Q();
        list.add(Q.f341552d.mo106059c(Q.f341550b, Q.f341551c));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
