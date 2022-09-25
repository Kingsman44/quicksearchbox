package com.facebook.litho;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.litho.p326e.p327a.C6211c;
import com.facebook.p313c.p316c.C6036d;

/* renamed from: com.facebook.litho.gr */
/* compiled from: PG */
public class C6365gr {

    /* renamed from: g */
    public static final C6361gn f18821g;

    /* renamed from: h */
    public static final C6362go f18822h = C6362go.LOCAL;

    /* renamed from: i */
    public static final C6361gn f18823i;

    static {
        C6359gl glVar = new C6359gl(C6211c.f18367a);
        f18821g = glVar;
        f18823i = glVar;
        new AccelerateDecelerateInterpolator();
    }

    /* renamed from: c */
    public static C6361gn m17055c(int i, Interpolator interpolator) {
        return new C6360gm(i, interpolator);
    }

    /* renamed from: d */
    public static C6364gq m17056d(C6362go goVar, String str) {
        int i;
        if (goVar == C6362go.GLOBAL) {
            i = 4;
        } else if (goVar == C6362go.LOCAL) {
            i = 2;
        } else {
            throw new RuntimeException("Unhandled TransitionKeyType ".concat(String.valueOf(String.valueOf(goVar))));
        }
        return new C6364gq(i, str);
    }

    /* renamed from: e */
    public static boolean m17057e(Object obj) {
        return obj == null;
    }

    /* renamed from: f */
    static float m17058f(C6363gp gpVar, C6036d dVar) {
        C6367gt gtVar = ((C6187dg) dVar).f18311p;
        return gpVar.f18819d.f17966a;
    }
}
