package com.google.android.libraries.p1647az.p1648a;

import android.text.method.MovementMethod;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.az.a.a */
/* compiled from: PG */
public final class C19603a {
    /* renamed from: a */
    public static void m37408a(TextView textView, MovementMethod movementMethod) {
        boolean isClickable = textView.isClickable();
        boolean isLongClickable = textView.isLongClickable();
        textView.setMovementMethod(movementMethod);
        textView.setClickable(isClickable);
        textView.setLongClickable(isLongClickable);
    }
}
