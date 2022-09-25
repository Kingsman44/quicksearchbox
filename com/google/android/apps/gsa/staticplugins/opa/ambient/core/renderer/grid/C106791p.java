package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.C106795c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.ReorderingGridLayout;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.TopLevelRendererHelper;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.p */
/* compiled from: PG */
public final class C106791p implements C106740b {

    /* renamed from: a */
    public final C58974d f297585a;

    /* renamed from: b */
    public final C60888db f297586b;

    /* renamed from: c */
    public final ReorderingGridLayout f297587c;

    /* renamed from: d */
    public final C60870cx f297588d;

    /* renamed from: e */
    private final boolean f297589e;

    public C106791p(C60888db dbVar, Optional optional, C90021c cVar, TopLevelRendererHelper topLevelRendererHelper, Context context, C50701am amVar, ViewGroup viewGroup, C83564a aVar) {
        this.f297586b = dbVar;
        ReorderingGridLayout reorderingGridLayout = (ReorderingGridLayout) LayoutInflater.from(context).inflate(R.layout.aa_grid_layout, viewGroup, false);
        this.f297587c = reorderingGridLayout;
        C58974d a = aVar.mo76900a("GRend");
        this.f297585a = a;
        C28295m.m52919e(reorderingGridLayout, new C28292j(104354));
        reorderingGridLayout.f297598a = false;
        boolean e = cVar.mo79746e(C90017bw.f247974bj);
        this.f297589e = e;
        if (e) {
            reorderingGridLayout.setOnTouchListener(new C106781f(new GestureDetector(context, new C106788m(this, optional))));
            reorderingGridLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C106782g(this));
            reorderingGridLayout.getLayoutTransition().disableTransitionType(4);
        }
        C60870cx a2 = topLevelRendererHelper.mo95682a(amVar, reorderingGridLayout);
        this.f297588d = C60856cj.m92900i(Optional.m71637of(reorderingGridLayout));
        C107043b.m177757a(a, C60922j.m93045h(a2, C47810es.m84966f(new C106783h(this, context)), dbVar), "Processing child renderers failed.", new Object[0]);
    }

    /* renamed from: c */
    public static void m177535c(ViewGroup.LayoutParams layoutParams, View view) {
        if (view.getLayoutParams() != null) {
            layoutParams.height = view.getLayoutParams().height;
        }
    }

    /* renamed from: e */
    public static void m177536e(View view, C106734a aVar) {
        int i = aVar == C106734a.FULL ? 2 : 1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C106795c cVar = new C106795c(GridLayout.spec(LinearLayoutManager.INVALID_OFFSET, 1.0f), GridLayout.spec(LinearLayoutManager.INVALID_OFFSET, i), layoutParams instanceof C106795c ? (C106795c) layoutParams : null);
        cVar.width = 0;
        m177535c(cVar, view);
        cVar.mo95666a(i, i);
        view.setLayoutParams(cVar);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).setMeasureAllChildren(true);
        }
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.UNDEFINED);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        hashCode();
        return this.f297588d;
    }

    /* renamed from: d */
    public final void mo95653d(View view) {
        ((C58970a) ((C58970a) this.f297585a.mo56224b()).mo56372aa(23208)).mo56386p("adding child view to grid");
        if (this.f297589e) {
            view.setClickable(true);
        }
        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.setGravity(7);
    }
}
