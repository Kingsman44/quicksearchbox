package androidx.core.p096h;

/* renamed from: androidx.core.h.k */
/* compiled from: PG */
final class C1958k implements C1959l {

    /* renamed from: a */
    static final C1958k f5875a = new C1958k();

    private C1958k() {
    }

    /* renamed from: a */
    public final int mo5117a(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }
}
