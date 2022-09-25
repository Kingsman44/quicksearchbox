package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58710pc;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.f */
/* compiled from: PG */
public final class C97218f {
    /* renamed from: a */
    public static float m160922a(C97214b bVar, C97214b bVar2) {
        return PointF.length(bVar2.mo90592a() - bVar.mo90592a(), bVar2.mo90593b() - bVar.mo90593b());
    }

    /* renamed from: b */
    public static RectF m160923b(C97214b bVar, int i, int i2) {
        float f = ((float) i) / 2.0f;
        float f2 = ((float) i2) / 2.0f;
        return new RectF(bVar.mo90592a() - f, bVar.mo90593b() - f2, bVar.mo90592a() + f, bVar.mo90593b() + f2);
    }

    /* renamed from: c */
    public static C97214b m160924c(Collection collection, C97214b bVar) {
        C58838bb.m90868c(!collection.isEmpty());
        return (C97214b) C58710pc.m90487d(new C97217e(bVar)).mo55813h(collection);
    }
}
