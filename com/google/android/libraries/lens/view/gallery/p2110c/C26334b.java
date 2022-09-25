package com.google.android.libraries.lens.view.gallery.p2110c;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.C6007z;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gallery.c.b */
/* compiled from: PG */
public final class C26334b {

    /* renamed from: a */
    public final Context f71583a;

    /* renamed from: b */
    public final C37215b f71584b;

    /* renamed from: c */
    public final C26335c f71585c;

    /* renamed from: d */
    public final Executor f71586d;

    /* renamed from: e */
    public final C26393l f71587e;

    /* renamed from: f */
    public final boolean f71588f;

    /* renamed from: g */
    private final C26336d f71589g;

    public C26334b(Context context, C37215b bVar, C26335c cVar, C60887da daVar, C26393l lVar, C26336d dVar, boolean z) {
        this.f71583a = context;
        this.f71584b = bVar;
        this.f71585c = cVar;
        this.f71586d = C25806i.m47612a(daVar);
        this.f71587e = lVar;
        this.f71589g = dVar;
        this.f71588f = z;
    }

    /* renamed from: a */
    public final boolean mo31530a(C58485gu guVar, int i, List list, int i2) {
        int i3 = ((C58724pq) list).f156474d;
        int i4 = i * i3;
        int min = Math.min(i3 + i4, guVar.size());
        boolean z = false;
        int i5 = 0;
        while (i4 < min) {
            ((C6007z) this.f71589g.mo31531a((C26404w) guVar.get(i4)).mo11962O(((Integer) list.get(i5)).intValue(), i2)).mo12456t(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
            i4++;
            z = true;
            i5++;
        }
        return z;
    }
}
