package androidx.core.widget;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: androidx.core.widget.x */
/* compiled from: PG */
public final class C2137x {
    /* renamed from: a */
    public static PrecomputedText.Params m5933a(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: b */
    public static void m5934b(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: c */
    static String[] m5935c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
}
