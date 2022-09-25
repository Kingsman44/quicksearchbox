package com.google.android.material.behavior;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2150h;
import com.google.android.material.snackbar.C44883n;

/* renamed from: com.google.android.material.behavior.e */
/* compiled from: PG */
final class C44544e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f115848a;

    /* renamed from: b */
    private final View f115849b;

    /* renamed from: c */
    private final boolean f115850c;

    public C44544e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f115848a = swipeDismissBehavior;
        this.f115849b = view;
        this.f115850c = z;
    }

    public final void run() {
        C44883n nVar;
        C2150h hVar = this.f115848a.f115835a;
        if (hVar != null && hVar.mo5415l()) {
            C2043bi.m5520N(this.f115849b, this);
        } else if (this.f115850c && (nVar = this.f115848a.f115840f) != null) {
            nVar.mo48376a(this.f115849b);
        }
    }
}
