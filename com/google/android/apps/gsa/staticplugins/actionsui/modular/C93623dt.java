package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dt */
/* compiled from: PG */
public abstract class C93623dt extends Transition {

    /* renamed from: a */
    private static final String[] f261358a = {"com:google:android:googlequicksearchbox:text:text"};

    /* renamed from: b */
    public static final void m154469b(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof TextView) {
            transitionValues.values.put("com:google:android:googlequicksearchbox:text:text", ((TextView) view).getText());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo87976a(TransitionValues transitionValues, CharSequence charSequence, TransitionValues transitionValues2, CharSequence charSequence2);

    public void captureEndValues(TransitionValues transitionValues) {
        m154469b(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        m154469b(transitionValues);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator createAnimator(android.view.ViewGroup r3, android.transition.TransitionValues r4, android.transition.TransitionValues r5) {
        /*
            r2 = this;
            java.lang.String r3 = "com:google:android:googlequicksearchbox:text:text"
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x000f
            java.util.Map r1 = r4.values
            java.lang.Object r1 = r1.get(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            if (r5 == 0) goto L_0x001b
            java.util.Map r0 = r5.values
            java.lang.Object r3 = r0.get(r3)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x001b:
            if (r1 == 0) goto L_0x002b
            if (r0 == 0) goto L_0x002b
            boolean r3 = android.text.TextUtils.equals(r1, r0)
            if (r3 == 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            android.animation.Animator r3 = r2.mo87976a(r4, r1, r5, r0)
            return r3
        L_0x002b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93623dt.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    public final String[] getTransitionProperties() {
        return f261358a;
    }
}
