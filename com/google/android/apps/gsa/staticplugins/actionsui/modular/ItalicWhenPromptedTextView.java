package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ItalicWhenPromptedTextView extends TextView {

    /* renamed from: a */
    private int[] f261050a;

    public ItalicWhenPromptedTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo87883a() {
        this.f261050a = null;
        refreshDrawableState();
        invalidate();
    }

    /* renamed from: b */
    public final void mo87884b(int[] iArr) {
        this.f261050a = iArr;
        refreshDrawableState();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int length = drawableState.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (drawableState[i2] == R.attr.state_showingVoiceOfGoogle) {
                i = 2;
                break;
            } else {
                i2++;
            }
        }
        setTypeface((Typeface) null, i);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.f261050a;
        return iArr != null ? iArr : super.onCreateDrawableState(i);
    }

    public ItalicWhenPromptedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItalicWhenPromptedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItalicWhenPromptedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
