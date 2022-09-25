package com.google.android.apps.gsa.staticplugins.opa.util;

import android.view.Menu;
import android.view.View;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.aj */
/* compiled from: PG */
final class C113767aj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f315068a;

    /* renamed from: b */
    final /* synthetic */ C28292j f315069b;

    /* renamed from: c */
    final /* synthetic */ Menu f315070c;

    /* renamed from: d */
    final /* synthetic */ C113768ak f315071d;

    public C113767aj(C113768ak akVar, View.OnClickListener onClickListener, C28292j jVar, Menu menu) {
        this.f315071d = akVar;
        this.f315068a = onClickListener;
        this.f315069b = jVar;
        this.f315070c = menu;
    }

    public final void onClick(View view) {
        this.f315068a.onClick(view);
        this.f315071d.f315072a.mo100721a(0, 0, C28285c.m52875b(this.f315071d.mo100611c(this.f315069b, this.f315070c), 472));
    }
}
