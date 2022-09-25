package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.o */
/* compiled from: PG */
public final /* synthetic */ class C105647o implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C105474ab f294747a;

    public /* synthetic */ C105647o(C105474ab abVar) {
        this.f294747a = abVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C105474ab abVar = this.f294747a;
        abVar.f294211s = rect.top;
        Context context = abVar.f294180a;
        if (((Boolean) C58833ax.m90833j(context instanceof Activity ? ((Activity) context).getWindow().getAttributes() : null).mo56106b(C105580e.f294567a).mo56109e(true)).booleanValue() && !abVar.f294218z) {
            int i = rect != null ? rect.left : 0;
            int i2 = rect != null ? rect.right : 0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abVar.f294207o.getLayoutParams();
            if (!(marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == i2)) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i2;
                abVar.f294207o.setLayoutParams(marginLayoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 80);
        if (abVar.f294195c) {
            layoutParams.setMargins(rect.left, 0, rect.right, rect.bottom);
        }
        int i3 = abVar.f294208p + rect.top;
        SwipeRefreshLayout swipeRefreshLayout = abVar.f294207o;
        if (swipeRefreshLayout.f13517j != i3) {
            boolean z = swipeRefreshLayout.f13509b;
            swipeRefreshLayout.mo8793k(false, i3);
            SwipeRefreshLayout swipeRefreshLayout2 = abVar.f294207o;
            swipeRefreshLayout2.f13518k = abVar.f294208p;
            if (z) {
                swipeRefreshLayout2.mo8794l(false, false);
                abVar.f294207o.mo8794l(true, false);
            }
        }
    }
}
