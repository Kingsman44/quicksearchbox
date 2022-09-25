package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.View;
import androidx.annotation.C0826b;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.m */
/* compiled from: PG */
final class C105076m implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f292813a;

    public C105076m(Runnable runnable) {
        this.f292813a = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C22872h.m42743c(C0826b.class);
        view.removeOnLayoutChangeListener(this);
        view.post(this.f292813a);
    }
}
