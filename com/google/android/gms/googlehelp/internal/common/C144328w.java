package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.googlehelp.internal.common.w */
/* compiled from: PG */
final class C144328w extends C144305ak {

    /* renamed from: a */
    final /* synthetic */ WeakReference f390891a;

    /* renamed from: b */
    final /* synthetic */ C144295aa f390892b;

    /* renamed from: c */
    final /* synthetic */ C144280a f390893c;

    /* renamed from: d */
    final /* synthetic */ C144189a f390894d;

    public C144328w(WeakReference weakReference, C144295aa aaVar, C144280a aVar, C144189a aVar2) {
        this.f390891a = weakReference;
        this.f390892b = aaVar;
        this.f390893c = aVar;
        this.f390894d = aVar2;
    }

    /* renamed from: h */
    public final void mo119831h(InProductHelp inProductHelp) {
        long nanoTime = System.nanoTime();
        GoogleHelp googleHelp = inProductHelp.f390777a;
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_START_TICK", nanoTime);
        putExtra.putExtra("EXTRA_IN_PRODUCT_HELP", C143948d.m234110c(inProductHelp));
        Activity activity = (Activity) this.f390891a.get();
        if (activity == null) {
            this.f390892b.mo119110m(C144296ab.f390830a);
            return;
        }
        if (!(this.f390893c == null && this.f390894d == null)) {
            C144304aj.m234565a(activity.getApplicationContext(), this.f390894d, this.f390893c, nanoTime, googleHelp);
        }
        googleHelp.f390776z = C143875g.f389988b;
        TogglingData togglingData = googleHelp.f390773w;
        if (togglingData != null) {
            togglingData.f390825c = C144299ae.m234545a(activity);
        }
        C144296ab.m234540a(this.f390892b, activity, putExtra, googleHelp);
    }
}
