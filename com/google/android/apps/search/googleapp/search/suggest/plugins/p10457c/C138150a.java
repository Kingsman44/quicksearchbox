package com.google.android.apps.search.googleapp.search.suggest.plugins.p10457c;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C39991aa;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.c.a */
/* compiled from: PG */
public final class C138150a extends C46756m {

    /* renamed from: a */
    private final C40305b f375863a;

    public C138150a(C40305b bVar) {
        this.f375863a = bVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return new C21196h(viewGroup.getContext(), this.f375863a.mo32548g().mo26713a());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C138015ag agVar = (C138015ag) obj;
        C69664n.m101061g(view, "view");
        C69664n.m101061g(agVar, "container");
        C138030av avVar = (C138030av) agVar.f375483c.get(0);
        C69664n.m101060f(avVar, "container.getSuggestion(0)");
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C69664n.m101060f(aqVar, "suggestion.serverSuggestResult");
        C39991aa l = this.f375863a.mo32553l();
        C21196h hVar = (C21196h) view;
        C57784p pVar = aqVar.f142350v;
        if (pVar == null) {
            pVar = C57784p.f154382f;
        }
        l.mo42108a(hVar, pVar);
    }
}
