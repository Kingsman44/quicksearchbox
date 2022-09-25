package android.support.p033v7.app;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2059by;
import androidx.core.p098j.C2060bz;

/* renamed from: android.support.v7.app.ab */
/* compiled from: PG */
final class C0341ab extends C2060bz {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1136a;

    public C0341ab(C0356aq aqVar) {
        this.f1136a = aqVar;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        this.f1136a.f1219s.setAlpha(1.0f);
        this.f1136a.f1222v.mo5203e((C2059by) null);
        this.f1136a.f1222v = null;
    }

    /* renamed from: b */
    public final void mo1120b() {
        this.f1136a.f1219s.setVisibility(0);
        if (this.f1136a.f1219s.getParent() instanceof View) {
            C2043bi.m5524R((View) this.f1136a.f1219s.getParent());
        }
    }
}
