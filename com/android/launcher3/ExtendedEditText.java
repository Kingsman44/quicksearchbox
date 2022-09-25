package com.android.launcher3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

/* compiled from: PG */
public class ExtendedEditText extends EditText {
    public OnBackKeyListener mBackKeyListener;

    /* compiled from: PG */
    public interface OnBackKeyListener {
        boolean onBackKey();
    }

    public ExtendedEditText(Context context) {
        super(context);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                OnBackKeyListener onBackKeyListener = this.mBackKeyListener;
                if (onBackKeyListener != null) {
                    return onBackKeyListener.onBackKey();
                }
                return false;
            }
            i = 4;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
