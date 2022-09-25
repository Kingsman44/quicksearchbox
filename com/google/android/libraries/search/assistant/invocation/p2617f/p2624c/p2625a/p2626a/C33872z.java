package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33572e;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33574g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71816z;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.z */
/* compiled from: PG */
final class C33872z implements Consumer {

    /* renamed from: a */
    public static final C33872z f90386a = new C33872z();

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C71816z zVar;
        C33574g gVar = (C33574g) obj;
        C69664n.m101061g(gVar, "it");
        synchronized (gVar.f89757b) {
            zVar = gVar.f89759d;
        }
        if (zVar.mo62867mj()) {
            zVar.mo62723u(new CancellationException("previous session wasn't ever received"));
            return;
        }
        synchronized (gVar.f89757b) {
            gVar.f89759d = new C71816z();
        }
        gVar.mo38990a("onVisDestroy", C33572e.f89754a);
        synchronized (gVar.f89757b) {
            gVar.f89758c = null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
