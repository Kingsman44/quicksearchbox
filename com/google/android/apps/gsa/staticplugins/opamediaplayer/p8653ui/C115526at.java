package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115479w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115482z;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115650z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.at */
/* compiled from: PG */
public final class C115526at extends C22939d {

    /* renamed from: a */
    public final Context f320436a;

    /* renamed from: b */
    public final C115479w f320437b;

    /* renamed from: c */
    public final C21370a f320438c;

    /* renamed from: d */
    public final C22871g f320439d;

    /* renamed from: e */
    public final C115620ah f320440e;

    /* renamed from: f */
    public C115650z f320441f;

    /* renamed from: g */
    private final C115482z f320442g;

    public C115526at(C22945j jVar, C115482z zVar, Context context, C115479w wVar, C21370a aVar, C22871g gVar, C115620ah ahVar) {
        super(jVar);
        this.f320442g = zVar;
        this.f320436a = context;
        this.f320437b = wVar;
        this.f320438c = aVar;
        this.f320439d = gVar;
        this.f320440e = ahVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo28295iC(LayoutInflater.from(this.f320436a).inflate(R.layout.omp_feature_playlist, (ViewGroup) null));
        RecyclerView recyclerView = (RecyclerView) mo28297il().findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f320436a));
        C115650z zVar = new C115650z(this.f320436a, new C115522ap(this));
        this.f320441f = zVar;
        recyclerView.setAdapter(zVar);
        ((C115531ay) this.f320442g).f320459a.mo28726b(new C115523aq(this));
        ((C115531ay) this.f320442g).f320460b.mo28726b(new C115524ar(this));
    }
}
