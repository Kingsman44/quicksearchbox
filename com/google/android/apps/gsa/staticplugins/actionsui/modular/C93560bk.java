package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bk */
/* compiled from: PG */
public final class C93560bk extends C93623dt {

    /* renamed from: a */
    public static final ForegroundColorSpan f261237a = new ForegroundColorSpan(Color.argb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID));

    /* renamed from: b */
    private final Resources f261238b;

    /* renamed from: c */
    private final boolean f261239c;

    public C93560bk(Resources resources, boolean z) {
        this.f261238b = resources;
        this.f261239c = z;
    }

    /* renamed from: c */
    private static final void m154309c(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof TextView) {
            transitionValues.values.put("com:google:android:googlequicksearchbox:textfadetypewrite:gravity", Integer.valueOf(((TextView) view).getGravity()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Animator mo87976a(TransitionValues transitionValues, CharSequence charSequence, TransitionValues transitionValues2, CharSequence charSequence2) {
        TransitionValues transitionValues3 = transitionValues;
        CharSequence charSequence3 = charSequence;
        TransitionValues transitionValues4 = transitionValues2;
        View view = transitionValues4.view;
        int[] iArr = null;
        if (!(view instanceof TextView) || TextUtils.equals(charSequence3, charSequence2)) {
            return null;
        }
        TextView textView = (TextView) view;
        int color = this.f261238b.getColor(R.color.voice_of_google_highlight);
        int color2 = this.f261238b.getColor(R.color.action_card_medium_grey);
        int i = 8388611;
        int intValue = transitionValues3.values.containsKey("com:google:android:googlequicksearchbox:textfadetypewrite:gravity") ? ((Integer) transitionValues3.values.get("com:google:android:googlequicksearchbox:textfadetypewrite:gravity")).intValue() : 8388611;
        if (transitionValues4.values.containsKey("com:google:android:googlequicksearchbox:textfadetypewrite:gravity")) {
            i = ((Integer) transitionValues4.values.get("com:google:android:googlequicksearchbox:textfadetypewrite:gravity")).intValue();
        }
        if (transitionValues3.values.containsKey("com:google:android:googlequicksearchbox:textfadetypewrite:drawable_state")) {
            iArr = (int[]) transitionValues3.values.get("com:google:android:googlequicksearchbox:textfadetypewrite:drawable_state");
        }
        textView.setText(charSequence3);
        C93557bh bhVar = r1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", new float[]{view.getAlpha(), 0.0f});
        C93557bh bhVar2 = new C93557bh(textView, color2, charSequence, intValue, iArr, color, i, charSequence2);
        ofFloat.addListener(bhVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.removeAllUpdateListeners();
        C93633ec ecVar = new C93633ec(textView, charSequence2.toString());
        valueAnimator.addUpdateListener(ecVar);
        valueAnimator.addListener(ecVar);
        valueAnimator.setIntValues(new int[]{1, charSequence2.length()});
        valueAnimator.setDuration((long) ((charSequence2.length() - 1) * 33));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)});
        ofObject.setDuration(500);
        ofObject.addUpdateListener(new C93558bi(textView, ofObject));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, valueAnimator, ofObject});
        if (this.f261239c) {
            animatorSet.addListener(new C93559bj(textView, color2));
        }
        return animatorSet;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        C93623dt.m154469b(transitionValues);
        m154309c(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        C93623dt.m154469b(transitionValues);
        m154309c(transitionValues);
        transitionValues.values.put("com:google:android:googlequicksearchbox:textfadetypewrite:drawable_state", transitionValues.view.getDrawableState());
    }
}
