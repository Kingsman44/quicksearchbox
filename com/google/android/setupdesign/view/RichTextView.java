package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.setupdesign.p3552a.C45284a;
import com.google.android.setupdesign.p3554c.C45289b;
import com.google.android.setupdesign.p3554c.C45290c;
import com.google.android.setupdesign.p3554c.C45291d;

/* compiled from: PG */
public class RichTextView extends AppCompatTextView implements C45289b {

    /* renamed from: a */
    public static Typeface f118432a;

    /* renamed from: b */
    private C45284a f118433b;

    public RichTextView(Context context) {
        super(context);
        m80798b();
    }

    /* renamed from: b */
    private final void m80798b() {
        if (!isInEditMode()) {
            C45284a aVar = new C45284a();
            this.f118433b = aVar;
            C2043bi.m5526T(this, aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo49217a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof C45326f) {
            C45326f fVar = (C45326f) movementMethod;
            if (fVar.f118450b == motionEvent) {
                return fVar.f118449a;
            }
        }
        return onTouchEvent;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        TypefaceSpan typefaceSpan;
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    C45291d.m80722a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    C45290c cVar = new C45290c();
                    if (f118432a != null) {
                        typefaceSpan = new TypefaceSpan(f118432a);
                    } else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    C45291d.m80722a(spannableString, annotation, cVar, typefaceSpan);
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new C45326f());
        } else {
            setMovementMethod((MovementMethod) null);
        }
        setFocusable(z);
        setRevealOnFocusHint(false);
        setFocusableInTouchMode(z);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80798b();
    }
}
