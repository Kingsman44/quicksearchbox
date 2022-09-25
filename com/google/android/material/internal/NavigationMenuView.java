package com.google.android.material.internal;

import android.content.Context;
import android.support.p033v7.view.menu.C0454ah;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
public class NavigationMenuView extends RecyclerView implements C0454ah {
    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo1454a(C0477q qVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
