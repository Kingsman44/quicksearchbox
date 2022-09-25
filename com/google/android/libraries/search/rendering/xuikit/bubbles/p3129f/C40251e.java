package com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58710pc;
import java.util.Collection;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.f.e */
/* compiled from: PG */
public final class C40251e {
    /* renamed from: a */
    public static float m69864a(C40248b bVar, C40248b bVar2) {
        return PointF.length(bVar2.mo42347a() - bVar.mo42347a(), bVar2.mo42348b() - bVar.mo42348b());
    }

    /* renamed from: b */
    public static RectF m69865b(C40248b bVar, int i, int i2) {
        float f = ((float) i) / 2.0f;
        float f2 = ((float) i2) / 2.0f;
        return new RectF(bVar.mo42347a() - f, bVar.mo42348b() - f2, bVar.mo42347a() + f, bVar.mo42348b() + f2);
    }

    /* renamed from: c */
    public static C40248b m69866c(Collection collection, C40248b bVar) {
        C58838bb.m90868c(!collection.isEmpty());
        return (C40248b) C58710pc.m90487d(new C40250d(bVar)).mo55813h(collection);
    }
}
