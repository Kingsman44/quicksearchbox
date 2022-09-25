package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.aq */
/* compiled from: PG */
public final /* synthetic */ class C42891aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112210a;

    /* renamed from: b */
    public final /* synthetic */ C60931s f112211b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f112212c;

    public /* synthetic */ C42891aq(C42905ba baVar, C60931s sVar, AtomicBoolean atomicBoolean) {
        this.f112210a = baVar;
        this.f112211b = sVar;
        this.f112212c = atomicBoolean;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112210a;
        MessageLite messageLite = (MessageLite) obj;
        return C60922j.m93045h(this.f112211b.apply(messageLite), C47810es.m84966f(new C42887am(baVar, messageLite, this.f112212c)), C60826bg.f164896a);
    }
}
