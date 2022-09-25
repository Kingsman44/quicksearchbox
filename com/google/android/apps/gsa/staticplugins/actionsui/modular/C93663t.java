package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.t */
/* compiled from: PG */
public abstract class C93663t extends Transition {

    /* renamed from: a */
    private static final String[] f261441a = {"com:google:android:googlequicksearchbox:argument:argument", "com:google:android:googlequicksearchbox:argument:prompt", "com:google:android:googlequicksearchbox:argument:hasValueToShow"};

    /* renamed from: b */
    private static final void m154543b(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.view;
        if (view instanceof C93666w) {
            C93666w wVar = (C93666w) view;
            Argument argument = wVar.f261447m;
            if (z) {
                Argument m = argument.mo81278m(argument.f236140a);
                m.mo81290y(argument.f236144e);
                argument = m;
            }
            transitionValues.values.put("com:google:android:googlequicksearchbox:argument:argument", argument);
            transitionValues.values.put("com:google:android:googlequicksearchbox:argument:prompt", wVar.mo88098m());
            if (wVar instanceof C93566bq) {
                transitionValues.values.put("com:google:android:googlequicksearchbox:argument:hasValueToShow", Boolean.valueOf(((C93566bq) wVar).mo87740ig()));
            } else {
                transitionValues.values.put("com:google:android:googlequicksearchbox:argument:hasValueToShow", true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo88122a(Argument argument, CharSequence charSequence, TransitionValues transitionValues, Argument argument2, CharSequence charSequence2);

    public final void captureEndValues(TransitionValues transitionValues) {
        m154543b(transitionValues, false);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        m154543b(transitionValues, true);
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Argument argument = (Argument) transitionValues.values.get("com:google:android:googlequicksearchbox:argument:argument");
        Argument argument2 = (Argument) transitionValues2.values.get("com:google:android:googlequicksearchbox:argument:argument");
        CharSequence charSequence = (CharSequence) transitionValues.values.get("com:google:android:googlequicksearchbox:argument:prompt");
        CharSequence charSequence2 = (CharSequence) transitionValues2.values.get("com:google:android:googlequicksearchbox:argument:prompt");
        boolean booleanValue = ((Boolean) transitionValues.values.get("com:google:android:googlequicksearchbox:argument:hasValueToShow")).booleanValue();
        boolean booleanValue2 = ((Boolean) transitionValues2.values.get("com:google:android:googlequicksearchbox:argument:hasValueToShow")).booleanValue();
        if (argument == null || argument2 == null) {
            return null;
        }
        if ((Argument.m141690A(argument, argument2) || (!booleanValue && !booleanValue2)) && TextUtils.equals(charSequence, charSequence2)) {
            return null;
        }
        return mo88122a(argument, charSequence, transitionValues2, argument2, charSequence2);
    }

    public final String[] getTransitionProperties() {
        return f261441a;
    }
}
