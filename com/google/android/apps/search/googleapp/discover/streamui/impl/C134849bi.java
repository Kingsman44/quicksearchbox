package com.google.android.apps.search.googleapp.discover.streamui.impl;

import androidx.core.content.C1878d;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134713k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47397j;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.bi */
/* compiled from: PG */
public final class C134849bi {

    /* renamed from: a */
    public final SwipeRefreshView f367113a;

    /* renamed from: b */
    public final int f367114b;

    public C134849bi(SwipeRefreshView swipeRefreshView, C47400m mVar) {
        C69664n.m101061g(mVar, "events");
        this.f367113a = swipeRefreshView;
        this.f367114b = swipeRefreshView.f13517j;
        swipeRefreshView.mo8790i(C1878d.m5128a(swipeRefreshView.getContext(), R.color.agsa_color_primary), C1878d.m5128a(swipeRefreshView.getContext(), R.color.googleapp_progress_bar_red), C1878d.m5128a(swipeRefreshView.getContext(), R.color.googleapp_progress_bar_yellow), C1878d.m5128a(swipeRefreshView.getContext(), R.color.googleapp_progress_bar_green));
        swipeRefreshView.f13513f.setBackgroundColor(C1878d.m5128a(swipeRefreshView.getContext(), R.color.agsa_color_surface_elevation_2));
        swipeRefreshView.mo8811p();
        swipeRefreshView.f13508a = new C47397j(mVar, swipeRefreshView, C134713k.f366832a);
    }
}
