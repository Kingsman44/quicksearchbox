package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.aa */
/* compiled from: PG */
public final class C27125aa implements C27131ag {

    /* renamed from: a */
    private final Context f74118a;

    /* renamed from: c */
    private final C27179u f74119c;

    /* renamed from: d */
    private final C28310af f74120d;

    /* renamed from: e */
    private final C28443m f74121e;

    /* renamed from: f */
    private final C60888db f74122f;

    /* renamed from: g */
    private final C28306ab f74123g;

    /* renamed from: h */
    private final C47770dh f74124h;

    public C27125aa(Context context, C27179u uVar, C28310af afVar, C28443m mVar, C60888db dbVar, C28306ab abVar, C47770dh dhVar) {
        this.f74118a = context;
        this.f74119c = uVar;
        this.f74120d = afVar;
        this.f74121e = mVar;
        this.f74122f = dbVar;
        this.f74123g = abVar;
        this.f74124h = dhVar;
    }

    /* renamed from: a */
    public final /* synthetic */ View mo32451a(C27129ae aeVar) {
        return C27130af.m50335a(this, aeVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ View mo32452b(C27129ae aeVar) {
        C27183y yVar = (C27183y) aeVar;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.f74118a).inflate(R.layout.lens_suggestion_list_carousel, (ViewGroup) null, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f74118a, 0, false));
        recyclerView.getScrollingChildHelper().mo5279a(false);
        Context context = this.f74118a;
        C27177s sVar = new C27177s(context, this.f74119c, LayoutInflater.from(context), recyclerView, this.f74120d, this.f74121e, this.f74122f, this.f74123g, this.f74124h);
        sVar.f74278b.addAll(yVar.f74306a);
        sVar.f74284h = yVar.f74307b;
        sVar.mObservable.mo2879a();
        Objects.requireNonNull(sVar);
        yVar.f74135d = new C27184z(sVar);
        this.f74123g.mo33801b(recyclerView, this.f74120d.mo33805a(C28427h.m53115a(81947)));
        return recyclerView;
    }
}
