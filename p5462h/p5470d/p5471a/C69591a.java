package p5462h.p5470d.p5471a;

/* renamed from: h.d.a.a */
/* compiled from: PG */
final class C69591a {

    /* renamed from: a */
    public static final Integer f185996a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f185996a = num2;
            }
        } catch (Throwable unused) {
        }
        num = null;
        num2 = num;
        f185996a = num2;
    }
}
