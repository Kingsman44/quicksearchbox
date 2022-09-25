package com.google.android.apps.search.googleapp.p10122ab;

import android.content.Context;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.app.C0395p;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2069cc;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3506c.C44581b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.ab.g */
/* compiled from: PG */
public final class C133148g {

    /* renamed from: a */
    public final boolean f362963a;

    /* renamed from: b */
    private final boolean f362964b;

    public C133148g(boolean z, boolean z2) {
        this.f362963a = z;
        this.f362964b = z2;
    }

    /* renamed from: a */
    public final C44581b mo110993a(Context context, Optional optional) {
        return (C44581b) mo110995c(Optional.empty(), optional).map(new C133144c(context)).orElseGet(new C133145d(context));
    }

    /* renamed from: b */
    public final C44581b mo110994b(Context context, Optional optional) {
        return (C44581b) mo110995c(Optional.m71637of(2132150987), optional).map(new C133146e(context)).orElseGet(new C133147f(context));
    }

    /* renamed from: c */
    public final Optional mo110995c(Optional optional, Optional optional2) {
        return this.f362963a ? optional : optional2;
    }

    /* renamed from: d */
    public final void mo110996d(C0395p pVar, int i, int i2) {
        if (this.f362963a) {
            pVar.setTheme(i2);
        }
        if (this.f362963a && this.f362964b) {
            C44534d.m78714a(pVar);
        }
        C2069cc.m5650a(pVar.getWindow(), false);
        pVar.setContentView(i);
        View findViewById = pVar.findViewById(16908290);
        C2043bi.m5555ai(findViewById, new C133142a(findViewById));
    }

    /* renamed from: e */
    public final void mo110997e(C0260w wVar) {
        wVar.setStyle(0, true != this.f362963a ? 2132150662 : 2132150663);
    }
}
