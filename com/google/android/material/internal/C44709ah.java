package com.google.android.material.internal;

import android.support.p033v7.widget.C0675gj;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.internal.ah */
/* compiled from: PG */
public final class C44709ah extends C0675gj {

    /* renamed from: c */
    final /* synthetic */ C44714am f116539c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44709ah(C44714am amVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.f116539c = amVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        C44704ac acVar = this.f116539c.f116545e;
        int i = acVar.f116534d.f116542b.getChildCount() == 0 ? 0 : 1;
        for (int i2 = 0; i2 < acVar.f116534d.f116545e.f116531a.size(); i2++) {
            int itemViewType = acVar.f116534d.f116545e.getItemViewType(i2);
            if (itemViewType == 0 || itemViewType == 1) {
                i++;
            }
        }
        kVar.mo5154c(C1989i.m5332b(i));
    }
}
