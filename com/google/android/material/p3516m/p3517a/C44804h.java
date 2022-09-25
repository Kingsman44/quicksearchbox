package com.google.android.material.p3516m.p3517a;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.Transition;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;

/* renamed from: com.google.android.material.m.a.h */
/* compiled from: PG */
final class C44804h {

    /* renamed from: a */
    public static final /* synthetic */ int f116842a = 0;

    static {
        new RectF();
    }

    /* renamed from: a */
    static void m79461a(Transition transition, Context context, int i) {
        int a;
        if (i != 0 && transition.getDuration() == -1 && (a = C44693c.m79225a(context, i, -1)) != -1) {
            transition.setDuration((long) a);
        }
    }

    /* renamed from: b */
    static void m79462b(Transition transition, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(C44688a.m79217a(context, i, timeInterpolator));
        }
    }
}
