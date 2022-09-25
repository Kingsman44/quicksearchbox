package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ep */
/* compiled from: PG */
public final class C73660ep extends C0658ft {

    /* renamed from: a */
    private final LinearLayoutManager f194847a;

    /* renamed from: b */
    private final int f194848b;

    /* renamed from: c */
    private boolean f194849c = false;

    /* renamed from: d */
    private int f194850d = 0;

    /* renamed from: e */
    private C73659eo f194851e;

    public C73660ep(LinearLayoutManager linearLayoutManager, int i) {
        this.f194847a = linearLayoutManager;
        this.f194848b = i;
    }

    /* renamed from: b */
    private final void m108197b() {
        int findLastVisibleItemPosition;
        int itemCount = this.f194847a.getItemCount();
        if (itemCount != this.f194850d) {
            this.f194849c = false;
            this.f194850d = itemCount;
        }
        if (!this.f194849c && this.f194851e != null && (findLastVisibleItemPosition = this.f194847a.findLastVisibleItemPosition()) != -1 && findLastVisibleItemPosition + this.f194848b >= itemCount) {
            this.f194849c = true;
            C73659eo eoVar = this.f194851e;
            eoVar.getClass();
            eoVar.mo65135a();
        }
    }

    /* renamed from: a */
    public final void mo65136a(C73659eo eoVar) {
        if (eoVar != this.f194851e) {
            this.f194849c = false;
        }
        this.f194851e = eoVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        m108197b();
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        m108197b();
    }
}
