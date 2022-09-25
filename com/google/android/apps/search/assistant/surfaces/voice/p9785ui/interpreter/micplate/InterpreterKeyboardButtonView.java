package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.InterpreterKeyboardButtonView */
/* compiled from: PG */
public final class InterpreterKeyboardButtonView extends RelativeLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterKeyboardButtonView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterKeyboardButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterpreterKeyboardButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterpreterKeyboardButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C69664n.m101061g(context, "context");
        LayoutInflater.from(context).inflate(R.layout.assistant_interpreter_keyboard_button, this, true);
    }

    /* renamed from: d */
    private final FrameLayout m212237d() {
        View findViewById = findViewById(R.id.assistant_interpreter_mic_icon);
        C69664n.m101060f(findViewById, "this.findViewById(R.id.a…ant_interpreter_mic_icon)");
        return (FrameLayout) findViewById;
    }

    /* renamed from: e */
    private final TextView m212238e() {
        View findViewById = findViewById(R.id.assistant_interpreter_mic_lang_name);
        C69664n.m101060f(findViewById, "this.findViewById(R.id.a…nterpreter_mic_lang_name)");
        return (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo109389a(int i, int i2) {
        Drawable mutate = m212237d().getBackground().mutate();
        C69664n.m101059e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        layerDrawable.findDrawableByLayerId(R.id.assistant_interpreter_keyboard_background_shape).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        layerDrawable.findDrawableByLayerId(R.id.assistant_interpreter_mic_plate_keyboard_pic).setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        m212238e().setTextColor(i);
    }

    /* renamed from: b */
    public final void mo109390b(String str) {
        C69664n.m101061g(str, "language");
        m212238e().setText(str);
    }

    /* renamed from: c */
    public final void mo109391c(View.OnClickListener onClickListener) {
        m212237d().setOnClickListener(new C130005a(onClickListener));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterpreterKeyboardButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C69659i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
