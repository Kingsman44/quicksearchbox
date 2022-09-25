package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.content.res.Configuration;
import android.view.WindowManager;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.libraries.p10922ab.C146710f;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.q */
/* compiled from: PG */
public final /* synthetic */ class C136550q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371778a;

    /* renamed from: b */
    public final /* synthetic */ WindowManager.LayoutParams f371779b;

    /* renamed from: c */
    public final /* synthetic */ int f371780c;

    /* renamed from: d */
    public final /* synthetic */ C146710f f371781d;

    public /* synthetic */ C136550q(C136433ae aeVar, WindowManager.LayoutParams layoutParams, int i, C146710f fVar) {
        this.f371778a = aeVar;
        this.f371779b = layoutParams;
        this.f371780c = i;
        this.f371781d = fVar;
    }

    public final void run() {
        this.f371778a.mo113021E(this.f371779b, (Configuration) null, this.f371780c, this.f371781d, C136455h.f371506d, C136451d.f371493e, true, -1);
    }
}
