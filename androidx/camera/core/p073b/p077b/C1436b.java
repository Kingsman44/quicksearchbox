package androidx.camera.core.p073b.p077b;

import android.util.Rational;
import java.util.Comparator;

/* renamed from: androidx.camera.core.b.b.b */
/* compiled from: PG */
public final class C1436b implements Comparator {

    /* renamed from: a */
    private final Rational f3994a;

    public C1436b(Rational rational) {
        this.f3994a = rational;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        if (rational.equals(rational2)) {
            return 0;
        }
        return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f3994a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f3994a.floatValue())).floatValue());
    }
}
