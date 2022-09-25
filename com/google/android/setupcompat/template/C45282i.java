package com.google.android.setupcompat.template;

import android.view.Window;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: com.google.android.setupcompat.template.i */
/* compiled from: PG */
public final class C45282i implements C45280g {

    /* renamed from: a */
    public final TemplateLayout f118297a;

    /* renamed from: b */
    public final Window f118298b;

    /* renamed from: c */
    public final boolean f118299c;

    /* renamed from: d */
    public final boolean f118300d;

    /* renamed from: e */
    public int f118301e = 0;

    public C45282i(TemplateLayout templateLayout, Window window) {
        boolean z = false;
        this.f118297a = templateLayout;
        this.f118298b = window;
        boolean z2 = templateLayout instanceof C45251c;
        this.f118299c = z2 && ((C45251c) templateLayout).mo49121f();
        if (z2 && ((C45251c) templateLayout).mo49122g()) {
            z = true;
        }
        this.f118300d = z;
    }
}
