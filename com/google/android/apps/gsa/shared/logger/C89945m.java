package com.google.android.apps.gsa.shared.logger;

import android.view.View;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.apps.gsa.shared.logger.m */
/* compiled from: PG */
public final class C89945m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C60321oe f246442a;

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f246443b;

    public C89945m(C60321oe oeVar, View.OnClickListener onClickListener) {
        this.f246442a = oeVar;
        this.f246443b = onClickListener;
    }

    public final void onClick(View view) {
        C89949q.m146521e(this.f246442a, false);
        this.f246443b.onClick(view);
    }
}
