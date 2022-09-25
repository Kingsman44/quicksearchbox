package com.google.android.libraries.lens.view.session;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.session.w */
/* compiled from: PG */
public final /* synthetic */ class C28025w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27228h f76272a;

    /* renamed from: b */
    public final /* synthetic */ RectF f76273b;

    /* renamed from: c */
    public final /* synthetic */ int f76274c;

    public /* synthetic */ C28025w(int i, C27228h hVar, RectF rectF) {
        this.f76274c = i;
        this.f76272a = hVar;
        this.f76273b = rectF;
    }

    public final C60870cx apply(Object obj) {
        return C28027y.m52213g((Bitmap) obj, this.f76274c, this.f76272a, this.f76273b);
    }
}
