package androidx.slice.widget;

import android.view.ViewTreeObserver;

/* renamed from: androidx.slice.widget.g */
/* compiled from: PG */
final class C4151g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ GridRowView f13371a;

    public C4151g(GridRowView gridRowView) {
        this.f13371a = gridRowView;
    }

    public final boolean onPreDraw() {
        GridRowView gridRowView = this.f13371a;
        gridRowView.f13173e = gridRowView.mo8639c();
        this.f13371a.mo8641e();
        this.f13371a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f13371a.f13169a = false;
        return true;
    }
}
