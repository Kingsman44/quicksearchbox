package com.google.android.libraries.search.assistant.performer.communication;

import android.telecom.Call;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cq */
/* compiled from: PG */
public final /* synthetic */ class C35588cq implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C35588cq f93415a = new C35588cq();

    private /* synthetic */ C35588cq() {
    }

    public final void accept(Object obj) {
        C59071e eVar = C35591ct.f93419a;
        ((Call) obj).reject(false, BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
