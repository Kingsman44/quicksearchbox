package com.google.android.libraries.lens.view.p2089b;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.lens.view.utils.C28110al;

/* renamed from: com.google.android.libraries.lens.view.b.f */
/* compiled from: PG */
public final class C25679f {

    /* renamed from: a */
    private final Activity f69819a;

    public C25679f(Activity activity) {
        this.f69819a = activity;
    }

    /* renamed from: a */
    public final void mo30784a() {
        Window window = this.f69819a.getWindow();
        window.setNavigationBarColor(-16777216);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -17);
    }

    /* renamed from: b */
    public final void mo30785b() {
        int i;
        Window window = this.f69819a.getWindow();
        window.setNavigationBarColor(C28110al.m52389a(this.f69819a, 16842801));
        View decorView = window.getDecorView();
        if (C28110al.m52391c(this.f69819a)) {
            i = decorView.getSystemUiVisibility() & -17;
        } else {
            i = decorView.getSystemUiVisibility() | 16;
        }
        decorView.setSystemUiVisibility(i);
    }
}
