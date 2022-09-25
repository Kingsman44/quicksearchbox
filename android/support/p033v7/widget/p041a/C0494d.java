package android.support.p033v7.widget.p041a;

import android.support.p033v7.widget.C0644ff;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.a.d */
/* compiled from: PG */
final class C0494d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0499i f1981a;

    /* renamed from: b */
    final /* synthetic */ C0502l f1982b;

    public C0494d(C0502l lVar, C0499i iVar) {
        this.f1982b = lVar;
        this.f1981a = iVar;
    }

    public final void run() {
        RecyclerView recyclerView = this.f1982b.f2017m;
        if (recyclerView != null && recyclerView.mIsAttached) {
            C0499i iVar = this.f1981a;
            if (!iVar.f1998n && iVar.f1992h.getAbsoluteAdapterPosition() != -1) {
                C0646fh fhVar = this.f1982b.f2017m.mItemAnimator;
                if (fhVar == null || !fhVar.mo2896t((C0644ff) null)) {
                    C0502l lVar = this.f1982b;
                    int size = lVar.f2016l.size();
                    int i = 0;
                    while (i < size) {
                        if (((C0499i) lVar.f2016l.get(i)).f1999o) {
                            i++;
                        }
                    }
                    this.f1982b.f2014j.mo2448k(this.f1981a.f1992h);
                    return;
                }
                this.f1982b.f2017m.post(this);
            }
        }
    }
}
