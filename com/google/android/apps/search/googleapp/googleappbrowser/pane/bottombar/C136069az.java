package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.az */
/* compiled from: PG */
public final class C136069az extends C136075ba {

    /* renamed from: a */
    public final BottomSheetPlaceholderView f370585a;

    /* renamed from: b */
    public final boolean f370586b;

    /* renamed from: c */
    public int f370587c = 0;

    public C136069az(BottomSheetPlaceholderView bottomSheetPlaceholderView, boolean z) {
        this.f370585a = bottomSheetPlaceholderView;
        this.f370586b = z;
    }

    /* renamed from: a */
    public final void mo112727a(int i) {
        if (this.f370586b) {
            if (this.f370585a.getLayoutParams().height != i) {
                this.f370585a.getLayoutParams().height = i;
                BottomSheetPlaceholderView bottomSheetPlaceholderView = this.f370585a;
                bottomSheetPlaceholderView.setLayoutParams(bottomSheetPlaceholderView.getLayoutParams());
                this.f370587c = i;
            }
        } else if (i != this.f370587c) {
            this.f370587c = i;
            this.f370585a.requestLayout();
        }
    }
}
