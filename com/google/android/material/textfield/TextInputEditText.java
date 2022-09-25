package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.p033v7.widget.C0508af;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44756p;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class TextInputEditText extends C0508af {

    /* renamed from: a */
    private final Rect f117256a;

    /* renamed from: b */
    private boolean f117257b;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final TextInputLayout m79751b() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    private final boolean m79752c(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f117257b;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout b = m79751b();
        if (m79752c(b) && rect != null) {
            b.getFocusedRect(this.f117256a);
            rect.bottom = this.f117256a.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout b = m79751b();
        if (m79752c(b)) {
            return b.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public final CharSequence getHint() {
        TextInputLayout b = m79751b();
        if (b == null || !b.f117317k) {
            return super.getHint();
        }
        return b.mo48464c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = m79751b();
        if (b != null && b.f117317k && super.getHint() == null && C44756p.m79361a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout b = m79751b();
            editorInfo.hintText = b != null ? b.mo48464c() : null;
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m79751b();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout b = m79751b();
        if (!m79752c(b) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f117256a.set(rect.left, rect.top, rect.right, rect.bottom + (b.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f117256a);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 0), attributeSet, i);
        this.f117256a = new Rect();
        TypedArray a = C44733be.m79295a(context, attributeSet, C44930ak.f117382b, i, 2132151254, new int[0]);
        this.f117257b = a.getBoolean(0, false);
        a.recycle();
    }
}
