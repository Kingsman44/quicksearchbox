package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* compiled from: PG */
public class InterpreterKeyboardButtonView extends RelativeLayout {
    public InterpreterKeyboardButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.interpreter_keyboard_button, this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ImageButton mo100393a() {
        return (ImageButton) findViewById(R.id.keyboard_icon);
    }

    /* renamed from: b */
    public final TextView mo100394b() {
        return (TextView) findViewById(R.id.lang_name);
    }

    /* renamed from: c */
    public final void mo100395c(C21370a aVar, C113701r rVar) {
        Objects.requireNonNull(rVar);
        setOnClickListener(new C113685bj(aVar, new C113700q(rVar)));
        ImageButton a = mo100393a();
        Objects.requireNonNull(rVar);
        a.setOnClickListener(new C113685bj(aVar, new C113700q(rVar)));
        new C1991k(AccessibilityNodeInfo.obtain(mo100393a())).f5921a.setEnabled(false);
    }

    /* renamed from: d */
    public final void mo100396d(int i, int i2) {
        LayerDrawable layerDrawable = (LayerDrawable) mo100393a().getBackground().mutate();
        layerDrawable.findDrawableByLayerId(R.id.keyboard_background_shape).setColorFilter(i, PorterDuff.Mode.SRC_IN);
        layerDrawable.findDrawableByLayerId(R.id.keyboard_pic).setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: e */
    public final void mo100397e(String str) {
        C58976aa aaVar = C58975e.f156826a;
        mo100394b().setText(str);
        setContentDescription(getContext().getString(R.string.keyboard_button_description, new Object[]{str}));
    }
}
