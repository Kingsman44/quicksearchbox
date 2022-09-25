package android.support.p033v7.widget;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import androidx.core.p097i.C1968c;

/* renamed from: android.support.v7.widget.aw */
/* compiled from: PG */
final class C0525aw {
    /* renamed from: a */
    static void m1930a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!C1968c.m5305b(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
