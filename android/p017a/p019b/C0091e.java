package android.p017a.p019b;

import com.google.common.p4535g.C59203do;
import java.text.Format;

/* renamed from: android.a.b.e */
/* compiled from: PG */
final class C0091e {

    /* renamed from: a */
    final int f244a;

    /* renamed from: b */
    final String f245b;

    /* renamed from: c */
    final Number f246c;

    /* renamed from: d */
    final double f247d;

    /* renamed from: e */
    int f248e;

    /* renamed from: f */
    Format f249f;

    /* renamed from: g */
    String f250g;

    /* renamed from: h */
    boolean f251h;

    public C0091e(int i, String str, Number number, double d) {
        this.f244a = i;
        this.f245b = str;
        if (d == C59203do.f157270a) {
            this.f246c = number;
        } else {
            this.f246c = Double.valueOf(number.doubleValue() - d);
        }
        this.f247d = d;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
