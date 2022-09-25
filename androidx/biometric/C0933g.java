package androidx.biometric;

import java.util.Arrays;

/* renamed from: androidx.biometric.g */
/* compiled from: PG */
final class C0933g {

    /* renamed from: a */
    public final int f3032a;

    /* renamed from: b */
    public final CharSequence f3033b;

    public C0933g(int i, CharSequence charSequence) {
        this.f3032a = i;
        this.f3033b = charSequence;
    }

    /* renamed from: a */
    private static String m2855a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0933g) {
            C0933g gVar = (C0933g) obj;
            if (this.f3032a == gVar.f3032a) {
                CharSequence charSequence = gVar.f3033b;
                String a = m2855a(this.f3033b);
                String a2 = m2855a(charSequence);
                if (a == null && a2 == null) {
                    return true;
                }
                if (a == null || !a.equals(a2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3032a), m2855a(this.f3033b)});
    }
}
