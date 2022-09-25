package com.google.android.apps.search.googleapp.tabs.manager;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ae */
/* compiled from: PG */
final class C139723ae extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f379795a;

    /* renamed from: b */
    final /* synthetic */ int f379796b;

    /* renamed from: c */
    final /* synthetic */ ExtendedFloatingActionButton f379797c;

    /* renamed from: d */
    final /* synthetic */ ViewGroup f379798d;

    /* renamed from: e */
    final /* synthetic */ int f379799e;

    public C139723ae(RecyclerView recyclerView, int i, ExtendedFloatingActionButton extendedFloatingActionButton, ViewGroup viewGroup, int i2) {
        this.f379795a = recyclerView;
        this.f379796b = i;
        this.f379797c = extendedFloatingActionButton;
        this.f379798d = viewGroup;
        this.f379799e = i2;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int computeVerticalScrollOffset = this.f379795a.computeVerticalScrollOffset();
        int i3 = this.f379796b / 2;
        if (computeVerticalScrollOffset == 0) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.f379797c;
            extendedFloatingActionButton.mo47890r(extendedFloatingActionButton.f116352n);
        } else {
            if (i2 > i3) {
                ExtendedFloatingActionButton extendedFloatingActionButton2 = this.f379797c;
                if (extendedFloatingActionButton2.f116357s) {
                    extendedFloatingActionButton2.mo47890r(extendedFloatingActionButton2.f116351m);
                }
            }
            if (i2 < (-i3)) {
                ExtendedFloatingActionButton extendedFloatingActionButton3 = this.f379797c;
                if (!extendedFloatingActionButton3.f116357s) {
                    extendedFloatingActionButton3.mo47890r(extendedFloatingActionButton3.f116352n);
                }
            }
        }
        ViewGroup viewGroup = this.f379798d;
        int i4 = computeVerticalScrollOffset / i3;
        int i5 = this.f379799e;
        viewGroup.setElevation((float) Math.min(i4 * i5, i5));
    }
}
