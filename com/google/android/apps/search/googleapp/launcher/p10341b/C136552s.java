package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.graphics.Bitmap;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136472h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136533k;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.s */
/* compiled from: PG */
public final /* synthetic */ class C136552s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371784a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f371785b;

    /* renamed from: c */
    public final /* synthetic */ String f371786c;

    public /* synthetic */ C136552s(C136433ae aeVar, Bitmap bitmap, String str) {
        this.f371784a = aeVar;
        this.f371785b = bitmap;
        this.f371786c = str;
    }

    public final void run() {
        C136531i iVar;
        C136533k i;
        C136433ae aeVar = this.f371784a;
        C136455h d = C136433ae.m221692d(this.f371785b, this.f371786c);
        if (C136433ae.m221688H(d) && (iVar = aeVar.f371418e.f371452g) != null && (i = iVar.mo22017i()) != null) {
            iVar.f371717n = d;
            C136470f b = i.mo113163b();
            if ((b instanceof C136472h) && (d.f371508a & 1) != 0) {
                ((C136472h) b).mo113078m(d);
                i.f371731d = d;
            }
        }
    }
}
