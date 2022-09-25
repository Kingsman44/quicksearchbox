package android.support.p033v7.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.p098j.C2058bx;
import androidx.core.p098j.C2059by;
import androidx.core.p098j.C2060bz;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.l */
/* compiled from: PG */
public final class C0444l {

    /* renamed from: a */
    public final ArrayList f1500a = new ArrayList();

    /* renamed from: b */
    C2059by f1501b;

    /* renamed from: c */
    public boolean f1502c;

    /* renamed from: d */
    private long f1503d = -1;

    /* renamed from: e */
    private Interpolator f1504e;

    /* renamed from: f */
    private final C2060bz f1505f = new C0443k(this);

    /* renamed from: a */
    public final void mo1435a() {
        if (this.f1502c) {
            ArrayList arrayList = this.f1500a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C2058bx) arrayList.get(i)).mo5199a();
            }
            this.f1502c = false;
        }
    }

    /* renamed from: b */
    public final void mo1436b() {
        View view;
        if (!this.f1502c) {
            ArrayList arrayList = this.f1500a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2058bx bxVar = (C2058bx) arrayList.get(i);
                long j = this.f1503d;
                if (j >= 0) {
                    bxVar.mo5202d(j);
                }
                Interpolator interpolator = this.f1504e;
                if (!(interpolator == null || (view = (View) bxVar.f5964a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f1501b != null) {
                    bxVar.mo5203e(this.f1505f);
                }
                bxVar.mo5200b();
            }
            this.f1502c = true;
        }
    }

    /* renamed from: c */
    public final void mo1437c(C2058bx bxVar) {
        if (!this.f1502c) {
            this.f1500a.add(bxVar);
        }
    }

    /* renamed from: d */
    public final void mo1438d() {
        if (!this.f1502c) {
            this.f1503d = 250;
        }
    }

    /* renamed from: e */
    public final void mo1439e(Interpolator interpolator) {
        if (!this.f1502c) {
            this.f1504e = interpolator;
        }
    }

    /* renamed from: f */
    public final void mo1440f(C2059by byVar) {
        if (!this.f1502c) {
            this.f1501b = byVar;
        }
    }
}
