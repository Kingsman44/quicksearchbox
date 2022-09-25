package com.google.android.libraries.lens.view.gallery.p2112e;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayDeque;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.k */
/* compiled from: PG */
public final class C26418k extends C0658ft {

    /* renamed from: a */
    public int f71890a = 0;

    /* renamed from: b */
    RecyclerView f71891b;

    /* renamed from: c */
    private final View f71892c;

    /* renamed from: d */
    private final ArrayDeque f71893d = new ArrayDeque();

    /* renamed from: e */
    private int f71894e = 0;

    public C26418k(View view) {
        this.f71892c = view;
    }

    /* renamed from: c */
    private final void m48707c() {
        RecyclerView recyclerView = this.f71891b;
        recyclerView.getClass();
        if (recyclerView.computeVerticalScrollOffset() <= 0) {
            this.f71894e = 0;
        }
        float height = (float) this.f71892c.getHeight();
        float f = (float) (this.f71894e - this.f71890a);
        float f2 = 0.0f;
        if (height > 0.0f && f >= 0.0f) {
            f2 = Math.min(1.0f, f / height);
        }
        this.f71892c.setAlpha(f2);
    }

    /* renamed from: a */
    public final void mo31623a() {
        RecyclerView recyclerView = this.f71891b;
        recyclerView.getClass();
        recyclerView.removeOnScrollListener(this);
        if (this.f71893d.isEmpty()) {
            this.f71891b = null;
            this.f71892c.setAlpha(0.0f);
            return;
        }
        C26417j jVar = (C26417j) this.f71893d.removeFirst();
        this.f71894e = jVar.f71888b;
        this.f71890a = jVar.f71889c;
        RecyclerView recyclerView2 = jVar.f71887a;
        this.f71891b = recyclerView2;
        recyclerView2.addOnScrollListener(this);
        m48707c();
    }

    /* renamed from: b */
    public final void mo31624b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f71891b;
        if (recyclerView2 != null) {
            this.f71893d.addFirst(new C26417j(recyclerView2, this.f71894e, this.f71890a));
            RecyclerView recyclerView3 = this.f71891b;
            recyclerView3.getClass();
            recyclerView3.removeOnScrollListener(this);
        }
        this.f71894e = 0;
        this.f71890a = 0;
        this.f71891b = recyclerView;
        recyclerView.addOnScrollListener(this);
        m48707c();
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.f71894e += i2;
        m48707c();
    }
}
