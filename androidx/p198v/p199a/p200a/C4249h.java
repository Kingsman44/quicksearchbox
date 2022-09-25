package androidx.p198v.p199a.p200a;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;

/* renamed from: androidx.v.a.a.h */
/* compiled from: PG */
final class C4249h {
    /* renamed from: a */
    static void m12160a(Object obj) {
        ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
    }

    /* renamed from: b */
    static void m12161b(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
    }

    /* renamed from: c */
    static boolean m12162c(Object obj, Object obj2) {
        return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
    }
}
