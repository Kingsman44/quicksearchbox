package com.google.android.apps.search.weather;

import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.C4186o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.search.weather.p10683b.C142068k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4552o.p4566l.C60200dk;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.search.weather.t */
/* compiled from: PG */
public final /* synthetic */ class C142154t implements C4186o {

    /* renamed from: a */
    public final /* synthetic */ C142155u f385628a;

    /* renamed from: b */
    public final /* synthetic */ View f385629b;

    /* renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f385630c;

    public /* synthetic */ C142154t(C142155u uVar, View view, SwipeRefreshLayout swipeRefreshLayout) {
        this.f385628a = uVar;
        this.f385629b = view;
        this.f385630c = swipeRefreshLayout;
    }

    /* renamed from: a */
    public final void mo8858a() {
        C142155u uVar = this.f385628a;
        View view = this.f385629b;
        SwipeRefreshLayout swipeRefreshLayout = this.f385630c;
        C21196h hVar = (C21196h) view.findViewById(R.id.weather_dialog_elements_view);
        if (hVar == null || !(hVar.getChildAt(0) instanceof ViewGroup) || ((ViewGroup) hVar.getChildAt(0)).getChildCount() <= 0) {
            uVar.f385644n.mo33853c(C28442l.m53146l(C60200dk.DOWN), C28485y.m53234a(swipeRefreshLayout));
            uVar.f385641k.mo50788b(C60866ct.f164955a, C142068k.f385455a);
            return;
        }
        swipeRefreshLayout.mo8794l(false, false);
    }
}
