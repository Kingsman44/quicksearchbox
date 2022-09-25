package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.appbar.u */
/* compiled from: PG */
final class C44525u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C44526v f115758a;

    /* renamed from: b */
    private final CoordinatorLayout f115759b;

    /* renamed from: c */
    private final View f115760c;

    public C44525u(C44526v vVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f115758a = vVar;
        this.f115759b = coordinatorLayout;
        this.f115760c = view;
    }

    public final void run() {
        OverScroller overScroller;
        if (this.f115760c != null && (overScroller = this.f115758a.f115764d) != null) {
            if (overScroller.computeScrollOffset()) {
                C44526v vVar = this.f115758a;
                vVar.mo47462B(this.f115759b, this.f115760c, vVar.f115764d.getCurrY());
                C2043bi.m5520N(this.f115760c, this);
                return;
            }
            this.f115758a.mo47425x(this.f115759b, this.f115760c);
        }
    }
}
