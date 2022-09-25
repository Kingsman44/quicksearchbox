package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126981b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126998s;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126999t;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C127000u;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127012af;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127034w;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.o */
/* compiled from: PG */
public final class C127081o implements Closeable {

    /* renamed from: a */
    public static final C59071e f349917a = C59071e.m91331h();

    /* renamed from: b */
    public final C69626l f349918b;

    /* renamed from: c */
    public final C127012af f349919c;

    /* renamed from: d */
    public final C71422aw f349920d;

    /* renamed from: e */
    public final Context f349921e;

    /* renamed from: f */
    public C71643cp f349922f;

    /* renamed from: g */
    public final C71788b f349923g = new C71799m();

    /* renamed from: h */
    public C127034w f349924h;

    /* renamed from: i */
    public final C127071e f349925i;

    /* renamed from: j */
    public C127070d f349926j;

    /* renamed from: k */
    public C127070d f349927k;

    /* renamed from: l */
    public C127070d f349928l;

    /* renamed from: m */
    public C127070d f349929m;

    /* renamed from: n */
    private final C127034w f349930n;

    public C127081o(C69626l lVar, C127034w wVar, C127012af afVar, C71422aw awVar, Executor executor, C127071e eVar, Context context) {
        C69664n.m101061g(wVar, "initialConversationState");
        C69664n.m101061g(afVar, "conversationStateManager");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(context, "context");
        this.f349918b = lVar;
        this.f349930n = wVar;
        this.f349919c = afVar;
        this.f349920d = awVar;
        this.f349925i = eVar;
        this.f349921e = context;
        this.f349924h = wVar;
    }

    /* renamed from: a */
    public final void mo107924a() {
        for (C127070d dVar : C69540x.m100947e(this.f349927k, this.f349926j, this.f349928l, this.f349929m)) {
            if (dVar != null) {
                dVar.mo107919a();
            }
        }
    }

    /* renamed from: b */
    public final void mo107925b(C119834cb cbVar) {
        C126986g gVar = (C126986g) C126988i.f349669h.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C126981b a = C69664n.m101061g(gVar, "builder");
        a.mo107883c(C126985f.ERROR_TIMEOUT);
        a.mo107887g(C126998s.TIMEOUT_FULL_LISTENING);
        a.mo107884d(cbVar);
        C126999t tVar = (C126999t) C127000u.f349717a.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        C69664n.m101061g(tVar, "builder");
        C62942bv build = tVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C127000u uVar = (C127000u) build;
        C69664n.m101061g(uVar, "value");
        C126986g gVar2 = a.f349652a;
        gVar2.copyOnWrite();
        C126988i iVar = (C126988i) gVar2.instance;
        uVar.getClass();
        iVar.f349675e = uVar;
        iVar.f349674d = 10;
        this.f349918b.mo5761a(a.mo107881a());
    }

    public final void close() {
        mo107924a();
        C71643cp cpVar = this.f349922f;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
    }
}
