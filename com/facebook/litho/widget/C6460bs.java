package com.facebook.litho.widget;

import android.support.p033v7.widget.RecyclerView;
import androidx.core.p098j.C2043bi;

/* renamed from: com.facebook.litho.widget.bs */
/* compiled from: PG */
final class C6460bs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6474cf f19142a;

    public C6460bs(C6474cf cfVar) {
        this.f19142a = cfVar;
    }

    public final void run() {
        RecyclerView recyclerView = this.f19142a.f19224q;
        if (recyclerView == null || !recyclerView.hasPendingAdapterUpdates()) {
            if (this.f19142a.f19182B.mo13622d()) {
                this.f19142a.f19182B.mo13620b(1);
            }
            this.f19142a.f19183C = 0;
            return;
        }
        RecyclerView recyclerView2 = this.f19142a.f19224q;
        if (!recyclerView2.mIsAttached || recyclerView2.getVisibility() == 8) {
            this.f19142a.f19183C = 0;
            return;
        }
        C6474cf cfVar = this.f19142a;
        int i = cfVar.f19183C;
        if (i >= 3) {
            cfVar.f19183C = 0;
            if (cfVar.f19182B.mo13622d()) {
                this.f19142a.f19182B.mo13620b(1);
                return;
            }
            return;
        }
        cfVar.f19183C = i + 1;
        C2043bi.m5520N(cfVar.f19224q, cfVar.f19185E);
    }
}
