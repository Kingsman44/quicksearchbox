package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9720d;

import com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128416ak;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18450am;
import com.google.android.libraries.assistant.p1533o.C18451an;
import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.android.libraries.assistant.p1533o.C18503u;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.d.c */
/* compiled from: PG */
public final /* synthetic */ class C128431c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128433e f353206a;

    public /* synthetic */ C128431c(C128433e eVar) {
        this.f353206a = eVar;
    }

    public final void run() {
        C128433e eVar = this.f353206a;
        C128416ak akVar = eVar.f353212d.f353217e;
        C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
        C18450am amVar = (C18450am) C18451an.f52363e.createBuilder();
        amVar.copyOnWrite();
        ((C18451an) amVar.instance).f52367c = true;
        tVar.copyOnWrite();
        C18451an anVar = (C18451an) amVar.build();
        anVar.getClass();
        ((C18503u) tVar.instance).f52452a = anVar;
        akVar.mo108415d((C18503u) tVar.build());
        C128426a aVar = akVar.f353177c;
        C37258g gVar = C37176a.f96825W;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_SEARCH_RESULT_STREAMING_LAST_EVENT");
        aVar.mo108429g(gVar);
        eVar.f353209a.mo5437b(C36180b.f94545b);
    }
}
