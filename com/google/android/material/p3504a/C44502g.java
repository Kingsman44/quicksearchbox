package com.google.android.material.p3504a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.p060c.C0984n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.a.g */
/* compiled from: PG */
public final class C44502g {

    /* renamed from: a */
    public final C0984n f115659a = new C0984n(0);

    /* renamed from: b */
    private final C0984n f115660b = new C0984n(0);

    /* renamed from: b */
    public static C44502g m78603b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m78604c(context, resourceId);
    }

    /* renamed from: c */
    public static C44502g m78604c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m78605g(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m78605g(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(i))), e);
            return null;
        }
    }

    /* renamed from: g */
    private static C44502g m78605g(List list) {
        C44502g gVar = new C44502g();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f115659a.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C44497b.f115651b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C44497b.f115652c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C44497b.f115653d;
                }
                C44503h hVar = new C44503h(startDelay, duration, interpolator);
                hVar.f115661a = objectAnimator.getRepeatCount();
                hVar.f115662b = objectAnimator.getRepeatMode();
                gVar.f115660b.put(propertyName, hVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public final ObjectAnimator mo47378a(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, mo47382f(str));
        ofPropertyValuesHolder.setProperty(property);
        mo47379d(str).mo47386b(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    public final C44503h mo47379d(String str) {
        if (this.f115660b.get(str) != null) {
            return (C44503h) this.f115660b.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final boolean mo47380e(String str) {
        return this.f115659a.get(str) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44502g)) {
            return false;
        }
        return this.f115660b.equals(((C44502g) obj).f115660b);
    }

    /* renamed from: f */
    public final PropertyValuesHolder[] mo47382f(String str) {
        if (mo47380e(str)) {
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f115659a.get(str);
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
            for (int i = 0; i < propertyValuesHolderArr.length; i++) {
                propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
            }
            return propertyValuesHolderArr2;
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        return this.f115660b.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f115660b + "}\n";
    }
}
