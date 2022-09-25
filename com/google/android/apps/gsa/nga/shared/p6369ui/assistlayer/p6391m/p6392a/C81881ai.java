package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C81881ai implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223903a;

    /* renamed from: b */
    public final /* synthetic */ AssistantP6GlowView f223904b;

    public /* synthetic */ C81881ai(C81889aq aqVar, AssistantP6GlowView assistantP6GlowView) {
        this.f223903a = aqVar;
        this.f223904b = assistantP6GlowView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81889aq aqVar = this.f223903a;
        AssistantP6GlowView assistantP6GlowView = this.f223904b;
        C22871g gVar = aqVar.f223917b;
        Objects.requireNonNull(assistantP6GlowView);
        new C90873ag((C60870cx) obj, gVar, "[NGA] stringFuture", new C81911v(assistantP6GlowView)).mo85223a(C81912w.f223983a);
    }
}
