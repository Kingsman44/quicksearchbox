package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.QuantumKeyboardGlowView */
/* compiled from: PG */
public class QuantumKeyboardGlowView extends View {
    public QuantumKeyboardGlowView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) getWidth();
        float height = (float) getHeight();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        float f = height;
        float f2 = width;
        float f3 = height;
        paint.setShader(new ComposeShader(new LinearGradient(0.0f, f, f2, f3, new int[]{getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_light_blue), getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_blue), getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_red), getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_yellow), getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_green), getContext().getResources().getColor(R.color.quantum_keyboard_gradient_start_light_green)}, new float[]{0.0f, 0.125f, 0.375f, 0.625f, 0.875f, 1.0f}, Shader.TileMode.CLAMP), new LinearGradient(0.0f, height, 0.0f, 0.0f, new int[]{-16777216, 0}, (float[]) null, Shader.TileMode.CLAMP), PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
    }

    public QuantumKeyboardGlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuantumKeyboardGlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
