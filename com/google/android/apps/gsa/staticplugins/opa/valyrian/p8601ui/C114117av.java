package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110426a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113979by;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114053ds;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.av */
/* compiled from: PG */
public final class C114117av extends C0648fj {

    /* renamed from: a */
    private final Context f316305a;

    /* renamed from: b */
    private final C110426a f316306b;

    /* renamed from: c */
    private final C113716d f316307c;

    /* renamed from: d */
    private final C113716d f316308d;

    /* renamed from: e */
    private final C113716d f316309e;

    /* renamed from: f */
    private final boolean f316310f;

    /* renamed from: g */
    private final boolean f316311g;

    /* renamed from: h */
    private final C86124t f316312h;

    public C114117av(C110426a aVar, C113716d dVar, C113716d dVar2, C113716d dVar3, boolean z, Context context, boolean z2, C86124t tVar) {
        this.f316305a = context;
        this.f316306b = aVar;
        this.f316307c = dVar;
        this.f316308d = dVar2;
        this.f316309e = dVar3;
        this.f316310f = z;
        this.f316311g = z2;
        this.f316312h = tVar;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        if (recyclerView.getChildViewHolder(view).mItemViewType != -2) {
            int i = rect.bottom;
            return;
        }
        rect.bottom += this.f316305a.getResources().getDimensionPixelOffset(R.dimen.suggestion_carousel_padding_top);
        int i2 = 0;
        boolean z = true;
        if (!this.f316307c.mo100574c() && this.f316311g) {
            z = false;
        }
        if ((recyclerView.getId() != R.id.dynamic_response_container || !z) && recyclerView.getId() != R.id.demand_state_view) {
            if (this.f316306b.mo96176c()) {
                rect.bottom += this.f316305a.getResources().getDimensionPixelOffset(R.dimen.opa_suggestion_container_height);
            }
            if (this.f316307c.mo100574c() && ((C114053ds) this.f316308d).f315748a.f315856an.mo101172s() == 2) {
                rect.bottom += this.f316307c.mo100572a();
            } else if (this.f316310f) {
                rect.bottom += this.f316307c.mo100573b();
            }
        } else if (this.f316312h.mo79746e(C90014bt.f247609kQ)) {
            rect.bottom += this.f316305a.getResources().getDimensionPixelOffset(R.dimen.interaction_container_min_height_with_app_search_carousel);
        } else {
            rect.bottom += this.f316307c.mo100573b();
        }
        int i3 = rect.bottom;
        if (((C113979by) this.f316309e).f315614a.f315985u.findViewById(R.id.opa_csat_container).isShown()) {
            i2 = this.f316309e.mo100572a();
        }
        rect.bottom = i3 + i2;
        int i4 = rect.bottom;
    }
}
