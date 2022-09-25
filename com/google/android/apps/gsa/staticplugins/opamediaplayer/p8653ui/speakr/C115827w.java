package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115440j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115443m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.w */
/* compiled from: PG */
public final class C115827w extends C115713ch implements C115820p {

    /* renamed from: e */
    public final C115440j f321221e;

    /* renamed from: f */
    public C115822r f321222f;

    /* renamed from: g */
    private final C115443m f321223g;

    public C115827w(C22945j jVar, C115443m mVar, Context context, C115440j jVar2, C58833ax axVar) {
        super(jVar, context, axVar);
        this.f321223g = mVar;
        this.f321221e = jVar2;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        mo28295iC(LayoutInflater.from(this.f321208b).inflate(R.layout.speakr_language_selection, (ViewGroup) null));
        super.mo28299iw();
        RecyclerView recyclerView = (RecyclerView) mo28297il().findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f321208b));
        C115822r rVar = new C115822r(this.f321208b, this);
        this.f321222f = rVar;
        recyclerView.setAdapter(rVar);
        ((C115811g) this.f321223g).f321160c.mo28726b(new C115823s(this));
        ((C115811g) this.f321223g).f321158a.mo28726b(new C115824t(this));
        ((C115811g) this.f321223g).f321159b.mo28726b(new C115825u(this));
    }
}
