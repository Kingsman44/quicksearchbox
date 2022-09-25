package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts;

import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17517t;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.tts.a */
/* compiled from: PG */
public final class C127119a {

    /* renamed from: a */
    public static final C59071e f350016a = C59071e.m91331h();

    /* renamed from: b */
    public C17360b f350017b;

    /* renamed from: c */
    public final C17361a f350018c;

    public C127119a(C17362b bVar) {
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17517t tVar = (C17517t) C17518u.f50532a.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        a.mo23377c(C69664n.m101061g(tVar, "builder").mo23378a());
        this.f350018c = bVar.mo23309a(a.mo23375a());
    }

    /* renamed from: a */
    public final void mo107941a() {
        C17360b bVar = this.f350017b;
        if (bVar != null) {
            C59052c cVar = (C59052c) f350016a.mo56224b();
            cVar.mo56379ah(new C59094n(37386));
            cVar.mo56386p("Tts Session stopped");
            bVar.close();
            this.f350017b = null;
        }
    }
}
