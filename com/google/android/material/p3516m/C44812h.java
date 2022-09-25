package com.google.android.material.p3516m;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import androidx.p197u.C4195af;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;

/* renamed from: com.google.android.material.m.h */
/* compiled from: PG */
final class C44812h {
    static {
        new RectF();
    }

    /* renamed from: a */
    static float m79481a(float f, float f2, float f3, float f4) {
        return f4 >= 0.0f ? f4 > f3 ? f2 : f + (((f4 + 0.0f) / (f3 + 0.0f)) * (f2 - f)) : f;
    }

    /* renamed from: b */
    static void m79482b(C4195af afVar, Context context, int i) {
        int a;
        if (i != 0 && afVar.f13592b == -1 && (a = C44693c.m79225a(context, i, -1)) != -1) {
            afVar.mo8872D((long) a);
        }
    }

    /* renamed from: c */
    static void m79483c(C4195af afVar, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && afVar.f13593c == null) {
            afVar.mo8873E(C44688a.m79217a(context, i, timeInterpolator));
        }
    }
}
