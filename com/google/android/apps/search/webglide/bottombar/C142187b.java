package com.google.android.apps.search.webglide.bottombar;

import android.app.Activity;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47274n;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.webglide.bottombar.b */
/* compiled from: PG */
public final class C142187b {

    /* renamed from: a */
    public int f385739a;

    /* renamed from: b */
    private final RecyclerView f385740b;

    /* renamed from: c */
    private final BottomBarCarouselView f385741c;

    /* renamed from: d */
    private final C142174e f385742d;

    /* renamed from: e */
    private final Activity f385743e;

    /* renamed from: f */
    private final LinearLayoutManager f385744f;

    /* renamed from: g */
    private final List f385745g;

    /* renamed from: h */
    private final C142194i f385746h;

    public C142187b(BottomBarCarouselView bottomBarCarouselView, C47274n nVar, C142174e eVar, Activity activity, C142194i iVar) {
        this.f385741c = bottomBarCarouselView;
        this.f385743e = activity;
        this.f385742d = eVar;
        this.f385746h = iVar;
        C62971cq cqVar = C142174e.m230796b(activity.getIntent(), eVar.f385686a).f385678b;
        this.f385745g = cqVar;
        LayoutInflater.from(nVar).inflate(R.layout.webglide_bottom_bar, bottomBarCarouselView);
        RecyclerView recyclerView = (RecyclerView) bottomBarCarouselView.findViewById(R.id.webglide_bottom_bar_recycler_view);
        this.f385740b = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        this.f385744f = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        int size = iVar.f385760b.size();
        iVar.f385760b.addAll(cqVar);
        iVar.mObservable.mo2882d(size, cqVar.size());
        recyclerView.setAdapter(iVar);
    }

    /* renamed from: a */
    public final void mo117045a(int i) {
        this.f385739a = i;
        C142194i iVar = this.f385746h;
        int i2 = iVar.f385759a;
        iVar.f385759a = i;
        iVar.notifyItemChanged(i2);
        iVar.notifyItemChanged(i);
        int i3 = i - 2;
        if (i3 >= 0) {
            this.f385740b.scrollToPosition(i3);
        } else {
            this.f385740b.scrollToPosition(i);
        }
    }
}
