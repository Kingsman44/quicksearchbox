package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.googlehelp.internal.common.t */
/* compiled from: PG */
final class C144325t extends C144305ak {

    /* renamed from: a */
    final /* synthetic */ Intent f390879a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f390880b;

    /* renamed from: c */
    final /* synthetic */ C144295aa f390881c;

    /* renamed from: d */
    final /* synthetic */ C144280a f390882d;

    /* renamed from: e */
    final /* synthetic */ C144189a f390883e;

    public C144325t(Intent intent, WeakReference weakReference, C144295aa aaVar, C144280a aVar, C144189a aVar2) {
        this.f390879a = intent;
        this.f390880b = weakReference;
        this.f390881c = aaVar;
        this.f390882d = aVar;
        this.f390883e = aVar2;
    }

    /* renamed from: g */
    public final void mo119830g(GoogleHelp googleHelp) {
        long nanoTime = System.nanoTime();
        this.f390879a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.f390880b.get();
        if (activity == null) {
            this.f390881c.mo119110m(C144296ab.f390830a);
            return;
        }
        if (!(this.f390882d == null && this.f390883e == null)) {
            C144304aj.m234565a(activity.getApplicationContext(), this.f390883e, this.f390882d, nanoTime, googleHelp);
        }
        googleHelp.f390776z = C143875g.f389988b;
        TogglingData togglingData = googleHelp.f390773w;
        if (togglingData != null) {
            togglingData.f390825c = C144299ae.m234545a(activity);
        }
        C144296ab.m234540a(this.f390881c, activity, this.f390879a, googleHelp);
    }
}
