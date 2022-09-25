package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.k */
/* compiled from: PG */
public final class C106055k implements C87682aj {

    /* renamed from: a */
    public final ViewGroup f296091a;

    /* renamed from: b */
    final C108423id f296092b;

    /* renamed from: c */
    private final Context f296093c;

    public C106055k(Context context, ViewGroup viewGroup, C108423id idVar) {
        this.f296091a = viewGroup;
        this.f296092b = idVar;
        this.f296093c = context;
        idVar.mo96863g();
        View inflate = LayoutInflater.from(context).inflate(R.layout.canvas_suggestion_carousel_view, viewGroup, false);
        inflate.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.canvas_suggestion_recycler_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setAdapter(idVar);
        idVar.mo96869o(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        viewGroup.addView(inflate);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
    }
}
