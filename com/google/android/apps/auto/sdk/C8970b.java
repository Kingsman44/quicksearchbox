package com.google.android.apps.auto.sdk;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.apps.auto.sdk.b */
/* compiled from: PG */
public final /* synthetic */ class C8970b implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C8971c f31070a;

    /* renamed from: b */
    public final /* synthetic */ int f31071b;

    public /* synthetic */ C8970b(C8971c cVar, int i) {
        this.f31070a = cVar;
        this.f31071b = i;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C8971c cVar = this.f31070a;
        int i = this.f31071b;
        C8968ad adVar = cVar.f31072a.f31077b;
        return windowInsets.replaceSystemWindowInsets(0, i, 0, 0);
    }
}
