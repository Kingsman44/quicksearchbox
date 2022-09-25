package android.support.p033v7.widget;

import android.widget.AbsListView;

/* renamed from: android.support.v7.widget.dy */
/* compiled from: PG */
final class C0609dy implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C0613eb f2346a;

    public C0609dy(C0613eb ebVar) {
        this.f2346a = ebVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f2346a.mo2827t() && this.f2346a.f2366q.getContentView() != null) {
            C0613eb ebVar = this.f2346a;
            ebVar.f2364o.removeCallbacks(ebVar.f2363n);
            this.f2346a.f2363n.run();
        }
    }
}
