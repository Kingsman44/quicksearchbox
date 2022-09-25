package com.google.android.material.navigationrail;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.material.internal.C44739bk;
import com.google.android.material.internal.C44740bl;

/* renamed from: com.google.android.material.navigationrail.c */
/* compiled from: PG */
final class C44834c implements C44739bk {

    /* renamed from: a */
    final /* synthetic */ NavigationRailView f116969a;

    public C44834c(NavigationRailView navigationRailView) {
        this.f116969a = navigationRailView;
    }

    /* renamed from: a */
    public final void mo34121a(View view, C2082cp cpVar, C44740bl blVar) {
        NavigationRailView navigationRailView = this.f116969a;
        if (navigationRailView.mo48247e(navigationRailView.f116963f)) {
            blVar.f116603b += cpVar.f5994b.mo5216a(7).f5822c;
        }
        NavigationRailView navigationRailView2 = this.f116969a;
        if (navigationRailView2.mo48247e(navigationRailView2.f116964g)) {
            blVar.f116605d += cpVar.f5994b.mo5216a(7).f5824e;
        }
        int f = C2043bi.m5577f(view);
        int b = cpVar.mo5240b();
        int c = cpVar.mo5241c();
        int i = blVar.f116602a;
        if (f == 1) {
            b = c;
        }
        blVar.f116602a = i + b;
        blVar.mo48050a(view);
    }
}
