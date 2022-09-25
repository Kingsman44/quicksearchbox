package androidx.core.widget;

import android.graphics.Paint;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.core.widget.z */
/* compiled from: PG */
public final class C2139z {
    /* renamed from: a */
    public static void m5936a(TextView textView, int i) {
        C1974i.m5317e(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: b */
    public static void m5937b(ActionMode.Callback callback) {
        if (callback instanceof C2138y) {
            C2138y yVar = (C2138y) callback;
            throw null;
        }
    }
}
