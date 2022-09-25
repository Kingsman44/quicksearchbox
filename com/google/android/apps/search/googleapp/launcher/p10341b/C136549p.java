package com.google.android.apps.search.googleapp.launcher.p10341b;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.p */
/* compiled from: PG */
public final /* synthetic */ class C136549p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371775a;

    /* renamed from: b */
    public final /* synthetic */ float f371776b;

    /* renamed from: c */
    public final /* synthetic */ Instant f371777c;

    public /* synthetic */ C136549p(C136433ae aeVar, float f, Instant instant) {
        this.f371775a = aeVar;
        this.f371776b = f;
        this.f371777c = instant;
    }

    public final void run() {
        C136508k j;
        C136512o c;
        C136433ae aeVar = this.f371775a;
        float f = this.f371776b;
        Instant instant = this.f371777c;
        C136531i iVar = aeVar.f371418e.f371452g;
        if (iVar != null && (j = iVar.mo113158j()) != null && (c = j.mo113104c()) != null && j.f371633j) {
            int measuredWidth = (int) (((float) c.getMeasuredWidth()) * f);
            j.f371634k = measuredWidth;
            j.mo113107f(measuredWidth, 2, instant);
        }
    }
}
