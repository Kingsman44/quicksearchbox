package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bk */
/* compiled from: PG */
public final /* synthetic */ class C122252bk implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Consumer f338999a;

    public /* synthetic */ C122252bk(Consumer consumer) {
        this.f338999a = consumer;
    }

    public final C60870cx apply(Object obj) {
        Exception exc = (Exception) obj;
        this.f338999a.accept(exc);
        return C60856cj.m92899h(exc);
    }
}
