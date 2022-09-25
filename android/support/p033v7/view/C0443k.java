package android.support.p033v7.view;

import android.view.View;
import androidx.core.p098j.C2059by;
import androidx.core.p098j.C2060bz;

/* renamed from: android.support.v7.view.k */
/* compiled from: PG */
final class C0443k extends C2060bz {

    /* renamed from: a */
    final /* synthetic */ C0444l f1497a;

    /* renamed from: b */
    private boolean f1498b = false;

    /* renamed from: c */
    private int f1499c = 0;

    public C0443k(C0444l lVar) {
        this.f1497a = lVar;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        int i = this.f1499c + 1;
        this.f1499c = i;
        if (i == this.f1497a.f1500a.size()) {
            C2059by byVar = this.f1497a.f1501b;
            if (byVar != null) {
                byVar.mo1119a((View) null);
            }
            this.f1499c = 0;
            this.f1498b = false;
            this.f1497a.f1502c = false;
        }
    }

    /* renamed from: b */
    public final void mo1120b() {
        if (!this.f1498b) {
            this.f1498b = true;
            C2059by byVar = this.f1497a.f1501b;
            if (byVar != null) {
                byVar.mo1120b();
            }
        }
    }
}
