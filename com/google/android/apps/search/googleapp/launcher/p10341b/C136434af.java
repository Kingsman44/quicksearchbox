package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2071ce;
import androidx.core.p098j.C2072cf;
import androidx.core.p098j.C2073cg;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.af */
/* compiled from: PG */
public final /* synthetic */ class C136434af implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ int f371437a;

    public /* synthetic */ C136434af(int i) {
        this.f371437a = i;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C2073cg cgVar;
        int i = this.f371437a;
        if (Build.VERSION.SDK_INT >= 30) {
            C1926c a = cpVar.f5994b.mo5216a(7);
            if (Build.VERSION.SDK_INT >= 30) {
                cgVar = new C2072cf(cpVar);
            } else {
                cgVar = new C2071ce(cpVar);
            }
            cgVar.mo5214g(7, C1926c.m5198d(a.f5821b, a.f5822c, a.f5823d, i));
            cpVar = cgVar.mo5208a();
        }
        return C2043bi.m5507A(view, cpVar);
    }
}
