package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.g */
/* compiled from: PG */
public final /* synthetic */ class C15145g implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C15146h f45438a;

    public /* synthetic */ C15145g(C15146h hVar) {
        this.f45438a = hVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        C15146h hVar = this.f45438a;
        if (Build.VERSION.SDK_INT >= 30) {
            i = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()).top;
        } else {
            i = windowInsets.getSystemWindowInsetTop();
        }
        if (i != 0) {
            hVar.f45444f.f45462f = i;
        }
        return windowInsets;
    }
}
