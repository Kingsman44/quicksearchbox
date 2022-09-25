package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114732b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.dh */
/* compiled from: PG */
public final class C115058dh extends C115000bd {

    /* renamed from: g */
    private final C114999bc f319381g;

    /* renamed from: h */
    private final C68214a f319382h;

    public C115058dh(Context context, C115057dg dgVar, C114742l lVar, C114732b bVar, C68214a aVar, C115002bf bfVar, C108226ax axVar) {
        super(context, lVar, bVar);
        this.f319382h = aVar;
        C58485gu a = bfVar.mo101811a();
        Context context2 = (Context) dgVar.f319380a.mo17428b();
        context2.getClass();
        a.getClass();
        this.f319381g = new C115056df(context2, a, axVar);
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        ViewGroup viewGroup = this.f319189f;
        if (viewGroup != null) {
            return viewGroup;
        }
        this.f319189f = (RecyclerView) this.f319185b.inflate(R.layout.conversation_starters_section_view, (ViewGroup) null);
        ViewGroup viewGroup2 = this.f319189f;
        viewGroup2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewGroup2;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f319184a, 1, false));
        recyclerView.setAdapter(this.f319381g);
        C28293k kVar = this.f319381g.f319182i;
        C28295m.m52919e(viewGroup2, ((C28257a) kVar).f76908a);
        this.f319188e = new C28291i(recyclerView, this.f319186c);
        C28291i iVar = this.f319188e;
        iVar.f76970d = this.f319381g;
        iVar.mo33786b();
        recyclerView.getViewTreeObserver().dispatchOnGlobalLayout();
        recyclerView.addOnScrollListener(this.f319187d.mo101550a(kVar, 2));
        recyclerView.addOnScrollListener(((C114737g) this.f319382h.mo27525b()).mo101567f(false));
        return viewGroup2;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        return this.f319381g.f319182i;
    }
}
