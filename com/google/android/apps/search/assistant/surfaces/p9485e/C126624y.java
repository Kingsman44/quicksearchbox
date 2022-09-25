package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126377ae;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9487b.C126413b;
import com.google.android.libraries.assistant.p1533o.C18469be;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.y */
/* compiled from: PG */
public final class C126624y extends C18469be {

    /* renamed from: a */
    public static final C126371a f348714a = new C126371a();

    /* renamed from: b */
    public static final C126377ae f348715b;

    /* renamed from: c */
    public static final C126413b f348716c;

    /* renamed from: d */
    public static final C59071e f348717d = C59071e.m91331h();

    /* renamed from: e */
    public final Executor f348718e;

    /* renamed from: f */
    public final C126431c f348719f;

    /* renamed from: g */
    public final AtomicReference f348720g = new AtomicReference((Object) null);

    static {
        Duration ofMillis = Duration.ofMillis(200);
        C69664n.m101060f(ofMillis, "ofMillis(200)");
        f348715b = new C126377ae(ofMillis);
        Duration ofSeconds = Duration.ofSeconds(5);
        C69664n.m101060f(ofSeconds, "ofSeconds(5)");
        Duration ofSeconds2 = Duration.ofSeconds(5);
        C69664n.m101060f(ofSeconds2, "ofSeconds(5)");
        f348716c = new C126413b(ofSeconds, ofSeconds2);
    }

    public C126624y(Executor executor, C126431c cVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(cVar, "connectionFactory");
        this.f348718e = executor;
        this.f348719f = cVar;
    }

    /* renamed from: b */
    public final C70862aj mo23997b(C70862aj ajVar) {
        C69664n.m101061g(ajVar, "responseObserver");
        Object updateAndGet = DesugarAtomicReference.updateAndGet(this.f348720g, new C126623x(this, ajVar));
        C69664n.m101058d(updateAndGet);
        return (C70862aj) updateAndGet;
    }
}
