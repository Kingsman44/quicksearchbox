package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136450c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.libraries.p10922ab.C146710f;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.o */
/* compiled from: PG */
public final /* synthetic */ class C136548o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371765a;

    /* renamed from: b */
    public final /* synthetic */ WindowManager.LayoutParams f371766b;

    /* renamed from: c */
    public final /* synthetic */ Configuration f371767c;

    /* renamed from: d */
    public final /* synthetic */ int f371768d;

    /* renamed from: e */
    public final /* synthetic */ C146710f f371769e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f371770f;

    /* renamed from: g */
    public final /* synthetic */ String f371771g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f371772h;

    /* renamed from: i */
    public final /* synthetic */ boolean f371773i;

    /* renamed from: j */
    public final /* synthetic */ int f371774j;

    public /* synthetic */ C136548o(C136433ae aeVar, WindowManager.LayoutParams layoutParams, Configuration configuration, int i, C146710f fVar, Bitmap bitmap, String str, Bundle bundle, boolean z, int i2) {
        this.f371765a = aeVar;
        this.f371766b = layoutParams;
        this.f371767c = configuration;
        this.f371768d = i;
        this.f371769e = fVar;
        this.f371770f = bitmap;
        this.f371771g = str;
        this.f371772h = bundle;
        this.f371773i = z;
        this.f371774j = i2;
    }

    public final void run() {
        C136451d dVar;
        C136433ae aeVar = this.f371765a;
        WindowManager.LayoutParams layoutParams = this.f371766b;
        Configuration configuration = this.f371767c;
        int i = this.f371768d;
        C146710f fVar = this.f371769e;
        Bitmap bitmap = this.f371770f;
        String str = this.f371771g;
        Bundle bundle = this.f371772h;
        boolean z = this.f371773i;
        int i2 = this.f371774j;
        C136455h d = C136433ae.m221692d(bitmap, str);
        if (!bundle.containsKey("background_color_hint") || !bundle.containsKey("background_secondary_color_hint")) {
            dVar = C136451d.f371493e;
        } else {
            C136450c cVar = (C136450c) C136451d.f371493e.createBuilder();
            int i3 = bundle.getInt("background_color_hint");
            cVar.copyOnWrite();
            C136451d dVar2 = (C136451d) cVar.instance;
            dVar2.f371495a |= 1;
            dVar2.f371496b = i3;
            int i4 = bundle.getInt("background_secondary_color_hint");
            cVar.copyOnWrite();
            C136451d dVar3 = (C136451d) cVar.instance;
            dVar3.f371495a |= 2;
            dVar3.f371497c = i4;
            dVar = (C136451d) cVar.build();
        }
        aeVar.mo113021E(layoutParams, configuration, i, fVar, d, dVar, z, i2);
        if (bundle.containsKey("system_ui_visibility")) {
            aeVar.f371418e.f371457l = bundle.getInt("system_ui_visibility");
        }
    }
}
