package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ha */
/* compiled from: PG */
final class C0693ha implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2525a;

    public C0693ha(SearchView searchView) {
        this.f2525a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f2525a.adjustDropDownSizeAndPosition();
    }
}
