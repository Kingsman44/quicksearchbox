package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p197u.C4195af;
import androidx.p197u.C4206aq;
import java.util.Map;

/* renamed from: com.google.android.material.internal.bc */
/* compiled from: PG */
public final class C44731bc extends C4195af {
    /* renamed from: e */
    private static final void m79291e(C4206aq aqVar) {
        View view = aqVar.f13626b;
        if (view instanceof TextView) {
            aqVar.f13625a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: a */
    public final Animator mo8876a(ViewGroup viewGroup, C4206aq aqVar, C4206aq aqVar2) {
        if (aqVar == null || aqVar2 == null || !(aqVar.f13626b instanceof TextView)) {
            return null;
        }
        View view = aqVar2.f13626b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = aqVar.f13625a;
        Map map2 = aqVar2.f13625a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C44730bb(textView));
        return ofFloat;
    }

    /* renamed from: b */
    public final void mo8877b(C4206aq aqVar) {
        m79291e(aqVar);
    }

    /* renamed from: c */
    public final void mo8878c(C4206aq aqVar) {
        m79291e(aqVar);
    }
}
