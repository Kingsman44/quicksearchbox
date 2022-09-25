package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126977d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129538a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17517t;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.UiActionsImpl */
/* compiled from: PG */
public final class UiActionsImpl implements C127118j, C2376g {

    /* renamed from: a */
    private final C126977d f349997a;

    /* renamed from: b */
    private final C129540c f349998b;

    /* renamed from: c */
    private final C17362b f349999c;

    public UiActionsImpl(C126977d dVar, C129540c cVar, C17362b bVar, C71422aw awVar) {
        C69664n.m101061g(dVar, "conversationActions");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f349997a = dVar;
        this.f349998b = cVar;
        this.f349999c = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo107931g(C127110b bVar) {
        C69664n.m101061g(bVar, "startRequest");
        return this.f349997a.mo107875a(bVar);
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final C60870cx mo107932h(C127114f fVar) {
        C69664n.m101061g(fVar, "stopRequest");
        return this.f349997a.mo107876b(fVar);
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo107933i() {
        C127117i.m207897a(this);
    }

    /* renamed from: j */
    public final void mo107934j(C129538a aVar) {
        C69664n.m101061g(aVar, "reason");
        this.f349998b.mo109081b(aVar);
    }

    /* renamed from: k */
    public final void mo107935k() {
        C17362b bVar = this.f349999c;
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17517t tVar = (C17517t) C17518u.f50532a.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        a.mo23377c(C69664n.m101061g(tVar, "builder").mo23378a());
        bVar.mo23309a(a.mo23375a()).mo23308c();
    }
}
