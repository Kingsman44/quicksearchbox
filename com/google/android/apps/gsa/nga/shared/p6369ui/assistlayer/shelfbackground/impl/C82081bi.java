package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.libraries.animation.C147768a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.bi */
/* compiled from: PG */
public final /* synthetic */ class C82081bi implements C147768a {

    /* renamed from: a */
    public final /* synthetic */ C82084bl f224375a;

    /* renamed from: b */
    public final /* synthetic */ float f224376b;

    /* renamed from: c */
    public final /* synthetic */ float f224377c;

    public /* synthetic */ C82081bi(C82084bl blVar, float f, float f2) {
        this.f224375a = blVar;
        this.f224376b = f;
        this.f224377c = f2;
    }

    /* renamed from: a */
    public final void mo42047a(Object obj) {
        C82084bl blVar = this.f224375a;
        float f = this.f224376b;
        float f2 = this.f224377c;
        float floatValue = ((Float) obj).floatValue();
        float min = Math.min(floatValue, Math.max(f, f2));
        blVar.f224411k = min;
        C83349aj.m132647b(blVar.f224407g, blVar.f224404d, Integer.valueOf((int) min), "shelfHeightObservable");
        blVar.f224413m = floatValue - min;
        blVar.mo75502d();
    }
}
