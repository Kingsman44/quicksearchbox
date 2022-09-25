package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
public class DummyFocusView extends View {
    public DummyFocusView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m144342a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    public final void draw(Canvas canvas) {
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.imeOptions &= -1073742080;
        editorInfo.imeOptions |= 33554435;
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m144342a(getSuggestedMinimumWidth(), i), m144342a(getSuggestedMinimumHeight(), i2));
    }

    public DummyFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DummyFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }
}
