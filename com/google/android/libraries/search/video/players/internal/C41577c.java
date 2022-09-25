package com.google.android.libraries.search.video.players.internal;

import android.support.p031v4.app.C0174at;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.search.video.players.internal.c */
/* compiled from: PG */
public final class C41577c extends C0174at {

    /* renamed from: a */
    private final C41576b f108692a;

    public C41577c(C41576b bVar) {
        super(bVar, C19559g.m37302a());
        this.f108692a = bVar;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        return this.f108692a.getWindow().findViewById(i);
    }

    /* renamed from: c */
    public final LayoutInflater mo532c() {
        return LayoutInflater.from(this.f742c).cloneInContext(this.f108692a.getBaseContext());
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo533f() {
        return this.f108692a;
    }
}
