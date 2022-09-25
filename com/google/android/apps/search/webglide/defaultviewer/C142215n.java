package com.google.android.apps.search.webglide.defaultviewer;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.RecyclerView;
import android.util.SparseArray;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.webcontent.C142265x;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.n */
/* compiled from: PG */
public final class C142215n extends FragmentStateAdapter {

    /* renamed from: f */
    public final List f385816f = new ArrayList();

    /* renamed from: g */
    private final AccountId f385817g;

    /* renamed from: h */
    private final SparseArray f385818h = new SparseArray();

    public C142215n(AccountId accountId, Fragment fragment) {
        super(fragment);
        this.f385817g = accountId;
    }

    /* renamed from: b */
    public final Fragment mo9192b(int i) {
        int i2 = ((C142185p) this.f385816f.get(i)).f385727c;
        AccountId accountId = this.f385817g;
        C142265x xVar = new C142265x();
        C68324h.m98669f(xVar);
        C47247a.m84047b(xVar, accountId);
        C47243l.m84039a(xVar, (C142185p) this.f385816f.get(i));
        this.f385818h.put(i, xVar);
        return xVar;
    }

    public final int getItemCount() {
        return this.f385816f.size();
    }

    /* renamed from: h */
    public final C142185p mo117061h(int i) {
        if (i < 0 || i >= this.f385816f.size()) {
            return C142185p.f385723l;
        }
        return (C142185p) this.f385816f.get(i);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C0661fw fwVar = recyclerView.mRecycler;
        fwVar.f2435e = 0;
        fwVar.mo3038o();
        super.onAttachedToRecyclerView(recyclerView);
    }
}
