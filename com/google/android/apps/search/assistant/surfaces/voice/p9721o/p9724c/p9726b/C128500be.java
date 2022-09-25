package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.view.View;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9727c.C128535a;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128536a;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128537b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128539d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.be */
/* compiled from: PG */
final class C128500be implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128501bf f353387a;

    /* renamed from: b */
    final /* synthetic */ C128543h f353388b;

    public C128500be(C128501bf bfVar, C128543h hVar) {
        this.f353387a = bfVar;
        this.f353388b = hVar;
    }

    public final void onClick(View view) {
        C128501bf bfVar = this.f353387a;
        C79570b a = C79570b.m127648a(this.f353388b.f353468c);
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        C69664n.m101060f(a, "data.contextType");
        C59052c cVar = (C59052c) C128501bf.f353389a.mo56224b();
        String name = a.name();
        cVar.mo56379ah(new C59094n(38877));
        cVar.mo56389s("#MWW Settings Deeplink for context: %s", name);
        C128535a aVar = bfVar.f353395g;
        C128536a aVar2 = (C128536a) C128537b.f353446d.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        C128539d dVar = C128539d.WARM_ACTIONS_UI_ACTION_CATEGORY_OPEN_SETTINGS;
        C69664n.m101061g(dVar, "value");
        aVar2.copyOnWrite();
        C128537b bVar = (C128537b) aVar2.instance;
        bVar.f353449b = dVar.f353455c;
        bVar.f353448a |= 1;
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        C69664n.m101061g(a, "value");
        aVar2.copyOnWrite();
        C128537b bVar2 = (C128537b) aVar2.instance;
        bVar2.f353450c = a.f218339o;
        bVar2.f353448a |= 2;
        C62942bv build = aVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        aVar.f353445a.mo109510b((C128537b) build);
    }
}
