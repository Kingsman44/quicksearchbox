package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.c */
/* compiled from: PG */
public final class C128393c implements C32597b {

    /* renamed from: a */
    public final C32597b f353131a;

    /* renamed from: b */
    private final Executor f353132b;

    /* renamed from: c */
    private final C46423aj f353133c;

    public C128393c(C32597b bVar, Executor executor) {
        C69664n.m101061g(bVar, "delegate");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f353131a = bVar;
        this.f353132b = executor;
        this.f353133c = new C46423aj(new C128392b(this), executor);
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        C32836cd d = this.f353131a.mo38174d();
        C69664n.m101060f(d, "delegate.supportedContextKey");
        return d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return this.f353133c.mo50395b();
    }

    public final String toString() {
        C32597b bVar = this.f353131a;
        return "CachingContextProvider(" + bVar + ")";
    }
}
