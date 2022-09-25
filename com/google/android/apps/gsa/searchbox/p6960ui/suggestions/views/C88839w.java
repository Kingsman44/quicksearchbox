package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.w */
/* compiled from: PG */
public final class C88839w extends C88804ao implements C89199d {

    /* renamed from: b */
    private static final C58485gu f240516b = C58485gu.m89846n(43);

    /* renamed from: c */
    private RemoteViews f240517c;

    /* renamed from: d */
    private int f240518d;

    /* renamed from: e */
    private int f240519e;

    /* renamed from: f */
    private int f240520f;

    /* renamed from: g */
    private int f240521g;

    public C88839w(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        RemoteViews remoteViews = this.f240517c;
        if (remoteViews == null) {
            return null;
        }
        return new C88838v(this.f240429a, remoteViews, this.f240518d, this.f240519e, this.f240520f, this.f240521g);
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f240516b;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88709j jVar = (C88709j) obj;
        this.f240517c = jVar.f239885k;
        int i = jVar.f239886l;
        this.f240518d = i > 0 ? jVar.f239887m / i : 0;
        this.f240519e = jVar.f239888n;
        this.f240520f = jVar.f239889o;
        this.f240521g = jVar.f239890p;
    }
}
