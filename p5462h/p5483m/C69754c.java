package p5462h.p5483m;

/* renamed from: h.m.c */
/* compiled from: PG */
class C69754c extends C69753b {
    /* renamed from: c */
    public static final boolean m101209c(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
