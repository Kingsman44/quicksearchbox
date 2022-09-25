package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.m */
/* compiled from: PG */
public final class C84018m {
    /* renamed from: a */
    public static CharSequence m133906a(int i, View view) {
        if (i == 0) {
            return null;
        }
        return view.getResources().getText(i);
    }

    /* renamed from: b */
    public static void m133907b(Button button, int i, View view) {
        if (i != 0) {
            String string = view.getResources().getString(i);
            button.setText(string);
            button.setContentDescription(string);
            view.invalidate();
            view.requestLayout();
        }
    }

    /* renamed from: c */
    public static void m133908c(TextView textView, CharSequence charSequence, TextView.BufferType bufferType, View view) {
        textView.setText(charSequence == null ? BuildConfig.FLAVOR : charSequence, bufferType);
        textView.setContentDescription(charSequence);
        m133910e(textView, charSequence);
        view.invalidate();
        view.requestLayout();
    }

    /* renamed from: d */
    public static void m133909d(View view, int i, CharSequence charSequence) {
        m133908c((TextView) view.findViewById(i), charSequence, TextView.BufferType.NORMAL, view);
    }

    /* renamed from: e */
    public static void m133910e(View view, Object obj) {
        m133911f(view, obj != null);
    }

    /* renamed from: f */
    public static void m133911f(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }
}
