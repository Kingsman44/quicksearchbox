package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lt */
/* compiled from: PG */
public final /* synthetic */ class C109447lt implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C109452ly f304782a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f304783b;

    public /* synthetic */ C109447lt(C109452ly lyVar, C86124t tVar) {
        this.f304782a = lyVar;
        this.f304783b = tVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        C109452ly lyVar = this.f304782a;
        C86124t tVar = this.f304783b;
        int paddingStart = view.getPaddingStart();
        int i2 = 0;
        if (lyVar.f304827n.mo97525br()) {
            i = 0;
        } else {
            i = windowInsets.getInsets(1).top;
        }
        int paddingEnd = view.getPaddingEnd();
        if (!tVar.mo79746e(C90063do.f249440da)) {
            i2 = windowInsets.getInsets(8).bottom;
        }
        view.setPaddingRelative(paddingStart, i, paddingEnd, i2);
        return windowInsets;
    }
}
