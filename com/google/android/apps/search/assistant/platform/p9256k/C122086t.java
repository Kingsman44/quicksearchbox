package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.apps.search.assistant.libraries.p8979j.C119439f;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.data.android.server.C61551af;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.k.t */
/* compiled from: PG */
public final class C122086t {

    /* renamed from: a */
    public static final C59071e f338717a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f338718b;

    /* renamed from: c */
    public final List f338719c;

    /* renamed from: d */
    public final C61551af f338720d;

    /* renamed from: e */
    private final C119439f f338721e;

    /* renamed from: f */
    private final C119439f f338722f;

    /* renamed from: g */
    private final C119439f f338723g;

    /* renamed from: h */
    private final Executor f338724h;

    public C122086t(C119439f fVar, C119439f fVar2, C119439f fVar3, C71422aw awVar, Executor executor) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "executor");
        this.f338721e = fVar;
        this.f338722f = fVar2;
        this.f338723g = fVar3;
        this.f338718b = awVar;
        this.f338724h = executor;
        this.f338719c = C69540x.m100947e(fVar, fVar2, fVar3);
        this.f338720d = new C61551af(new C122085s(this), executor);
    }
}
