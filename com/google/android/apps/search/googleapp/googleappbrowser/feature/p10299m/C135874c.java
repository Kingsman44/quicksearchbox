package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10299m;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.m.c */
/* compiled from: PG */
final class C135874c implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ View f370059a;

    public C135874c(View view) {
        this.f370059a = view;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i;
        C69664n.m101061g(view, "<anonymous parameter 0>");
        View view2 = this.f370059a;
        if (Build.VERSION.SDK_INT >= 30) {
            i = cpVar.f5994b.mo5216a(WindowInsets.Type.systemBars()).f5822c;
        } else {
            i = cpVar.mo5242d();
        }
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, i));
        return cpVar;
    }
}
