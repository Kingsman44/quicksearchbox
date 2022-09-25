package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.y */
/* compiled from: PG */
final class C134920y implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ C134904m f367353a;

    public C134920y(C134904m mVar) {
        this.f367353a = mVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C69664n.m101061g(view, "<anonymous parameter 0>");
        C1926c d = cpVar.f5994b.mo5219d();
        C69664n.m101060f(d, "insets.systemWindowInsets");
        C134904m mVar = this.f367353a;
        C134898g r = mVar.mo112061r();
        if (r != null) {
            C69664n.m101061g(d, "systemWindowInsets");
            DiscoverRecyclerView discoverRecyclerView = r.f367234b;
            discoverRecyclerView.setClipToPadding(false);
            if (r.f367238f.mo111990b()) {
                discoverRecyclerView.setPadding(discoverRecyclerView.getPaddingLeft(), discoverRecyclerView.getPaddingTop(), discoverRecyclerView.getPaddingRight(), d.f5824e);
            } else {
                discoverRecyclerView.setPadding(discoverRecyclerView.getPaddingLeft(), d.f5822c, discoverRecyclerView.getPaddingRight(), d.f5824e);
            }
        }
        SwipeRefreshView s = mVar.mo112062s();
        if (s != null) {
            C134849bi q = s.mo17754z();
            C69664n.m101061g(d, "systemWindowInsets");
            SwipeRefreshView swipeRefreshView = q.f367113a;
            int i = q.f367114b + d.f5822c;
            if (swipeRefreshView.f13517j != i) {
                boolean z = swipeRefreshView.f13509b;
                swipeRefreshView.mo8793k(false, i);
                swipeRefreshView.f13518k = q.f367114b + (d.f5822c / 2);
                if (z) {
                    swipeRefreshView.mo8794l(false, false);
                    swipeRefreshView.mo8794l(true, false);
                }
            }
        }
        mVar.f367275X.ifPresent(new C134915t(d));
        mVar.f367276Y.ifPresent(new C134916u(d));
        return cpVar;
    }
}
