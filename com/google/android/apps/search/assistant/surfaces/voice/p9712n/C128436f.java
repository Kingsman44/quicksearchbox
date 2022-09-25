package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.gsa.binaries.satin.app.any;
import com.google.android.apps.search.assistant.libraries.p8979j.p8980a.C119412c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.f */
/* compiled from: PG */
public final class C128436f {

    /* renamed from: a */
    public static final C59071e f353225a = C59071e.m91331h();

    /* renamed from: b */
    public final C32904f f353226b;

    /* renamed from: c */
    public final C128413ah f353227c;

    /* renamed from: d */
    public final Executor f353228d;

    /* renamed from: e */
    public final C71422aw f353229e;

    /* renamed from: f */
    public final boolean f353230f;

    /* renamed from: g */
    public final boolean f353231g;

    /* renamed from: h */
    public final boolean f353232h;

    /* renamed from: i */
    public final boolean f353233i;

    /* renamed from: j */
    public final boolean f353234j;

    /* renamed from: k */
    public final String f353235k;

    /* renamed from: l */
    public final C119412c f353236l;

    /* renamed from: m */
    public C128418am f353237m;

    /* renamed from: n */
    public final C119767q f353238n;

    public C128436f(C32904f fVar, C119767q qVar, C128413ah ahVar, Executor executor, C71422aw awVar, boolean z, boolean z2, C69464a aVar, any any, boolean z3, boolean z4, boolean z5, boolean z6, String str) {
        C69664n.m101061g(fVar, "contextSource");
        C69664n.m101061g(qVar, "connectionFactory");
        C69664n.m101061g(ahVar, "voiceSearchCallbacksFactory");
        C69664n.m101061g(executor, "sequentialExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "opaHandover");
        C69664n.m101061g(any, "handoverConfigurationProviderFactory");
        this.f353226b = fVar;
        this.f353238n = qVar;
        this.f353227c = ahVar;
        this.f353228d = executor;
        this.f353229e = awVar;
        this.f353230f = z;
        this.f353231g = z2;
        this.f353232h = z4;
        this.f353233i = z5;
        this.f353234j = z6;
        this.f353235k = str;
        this.f353236l = any.a(z3);
    }
}
