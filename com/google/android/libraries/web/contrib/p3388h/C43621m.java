package com.google.android.libraries.web.contrib.p3388h;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.h.m */
/* compiled from: PG */
public final /* synthetic */ class C43621m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43626r f113857a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f113858b;

    /* renamed from: c */
    public final /* synthetic */ C43624p f113859c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f113860d;

    public /* synthetic */ C43621m(C43626r rVar, AtomicInteger atomicInteger, C43624p pVar, C2164c cVar) {
        this.f113857a = rVar;
        this.f113858b = atomicInteger;
        this.f113859c = pVar;
        this.f113860d = cVar;
    }

    public final void accept(Object obj) {
        C43626r rVar = this.f113857a;
        AtomicInteger atomicInteger = this.f113858b;
        C43624p pVar = this.f113859c;
        C2164c cVar = this.f113860d;
        if (!((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C43626r.f113870a.mo56226d()).mo56372aa(54114)).mo56386p("Failed to setIsEmbedded to true on WebLayer Browser.");
        }
        if (atomicInteger.decrementAndGet() == 0) {
            rVar.mo46654c(pVar, cVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
