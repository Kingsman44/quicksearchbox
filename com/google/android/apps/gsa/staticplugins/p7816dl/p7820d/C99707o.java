package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.graphics.Rect;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.o */
/* compiled from: PG */
public final /* synthetic */ class C99707o implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f279012a;

    public /* synthetic */ C99707o(SwipeRefreshLayout swipeRefreshLayout) {
        this.f279012a = swipeRefreshLayout;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        SwipeRefreshLayout swipeRefreshLayout = this.f279012a;
        if (rect != null && rect.left != 0) {
            swipeRefreshLayout.setPadding(rect.left, 0, 0, 0);
        } else if (rect == null || rect.right == 0) {
            swipeRefreshLayout.setPadding(0, 0, 0, 0);
        } else {
            swipeRefreshLayout.setPadding(0, 0, rect.right, 0);
        }
    }
}
