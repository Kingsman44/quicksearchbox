package androidx.core.p096h;

/* renamed from: androidx.core.h.j */
/* compiled from: PG */
final class C1957j implements C1959l {

    /* renamed from: a */
    static final C1957j f5874a = new C1957j();

    private C1957j() {
    }

    /* renamed from: a */
    public final int mo5117a(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        return z ? 1 : 2;
    }
}
