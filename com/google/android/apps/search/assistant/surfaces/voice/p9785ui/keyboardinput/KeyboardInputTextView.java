package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.content.Context;
import android.support.p033v7.widget.C0508af;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33564e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.KeyboardInputTextView */
/* compiled from: PG */
public final class KeyboardInputTextView extends C0508af {

    /* renamed from: a */
    public C130111t f356635a;

    public KeyboardInputTextView(Context context) {
        super(context);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f356635a != null) {
                C47393f.m84237h(new C33564e(), this);
            }
            i = 4;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public KeyboardInputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardInputTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
