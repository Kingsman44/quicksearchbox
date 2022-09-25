package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class InterpreterMicButtonView extends RelativeLayout {

    /* renamed from: a */
    public AnimatorSet f314782a;

    /* renamed from: b */
    private C113670av f314783b;

    public InterpreterMicButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.interpreter_mic_button, this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final FrameLayout mo100438a() {
        return (FrameLayout) findViewById(R.id.mic_icon);
    }

    /* renamed from: b */
    public final TextView mo100439b() {
        return (TextView) findViewById(R.id.lang_name);
    }

    /* renamed from: c */
    public final void mo100440c() {
        C58976aa aaVar = C58975e.f156826a;
        AnimatorSet animatorSet = this.f314782a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C113670av avVar = this.f314783b;
        if (avVar != null) {
            avVar.mo100320a();
        }
    }

    /* renamed from: d */
    public final void mo100441d(C21370a aVar, C113670av avVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314783b = avVar;
        setOnClickListener(new C113685bj(aVar, new C113669au(this)));
        setContentDescription(getContext().getString(R.string.mic_button_description, new Object[]{BuildConfig.FLAVOR}));
        mo100438a().setOnClickListener(new C113685bj(aVar, new C113669au(this)));
        new C1991k(AccessibilityNodeInfo.obtain(mo100438a())).f5921a.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo100442e(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo100439b().setText(str);
        setContentDescription(getContext().getString(R.string.mic_button_description, new Object[]{str}));
    }

    /* renamed from: f */
    public final void mo100443f(int i, int i2) {
        LayerDrawable layerDrawable = (LayerDrawable) mo100438a().getBackground().mutate();
        layerDrawable.findDrawableByLayerId(R.id.mic_background_shape).setColorFilter(i, PorterDuff.Mode.SRC_IN);
        layerDrawable.findDrawableByLayerId(R.id.mic_pic).setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        ((LayerDrawable) findViewById(R.id.pulse_circle).getBackground().mutate()).findDrawableByLayerId(R.id.pulse_background_shape).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
