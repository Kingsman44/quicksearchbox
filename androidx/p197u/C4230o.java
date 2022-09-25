package androidx.p197u;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: androidx.u.o */
/* compiled from: PG */
public final class C4230o extends C4215az {
    public C4230o() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f13625a.get("android:fade:transitionAlpha");
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m12119I(androidx.p197u.C4206aq r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0013
            java.util.Map r1 = r1.f13625a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0013
            float r1 = r1.floatValue()
            return r1
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p197u.C4230o.m12119I(androidx.u.aq, float):float");
    }

    /* renamed from: J */
    private final Animator m12120J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        int i = C4211av.f13633b;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C4211av.f13632a, new float[]{f2});
        ofFloat.addListener(new C4229n(view));
        mo8900z(new C4228m(view));
        return ofFloat;
    }

    /* renamed from: c */
    public final void mo8878c(C4206aq aqVar) {
        C4215az.m12099H(aqVar);
        Map map = aqVar.f13625a;
        View view = aqVar.f13626b;
        int i = C4211av.f13633b;
        map.put("android:fade:transitionAlpha", Float.valueOf(view.getTransitionAlpha()));
    }

    /* renamed from: e */
    public final Animator mo8922e(ViewGroup viewGroup, View view, C4206aq aqVar) {
        float f = 0.0f;
        float I = m12119I(aqVar, 0.0f);
        if (I != 1.0f) {
            f = I;
        }
        return m12120J(view, f, 1.0f);
    }

    /* renamed from: f */
    public final Animator mo8923f(ViewGroup viewGroup, View view, C4206aq aqVar) {
        int i = C4211av.f13633b;
        return m12120J(view, m12119I(aqVar, 1.0f), 0.0f);
    }

    public C4230o(int i) {
        this.f13651o = i;
    }
}
