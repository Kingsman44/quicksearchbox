package p3186j$.sun.misc;

/* renamed from: j$.sun.misc.a */
public abstract /* synthetic */ class C40951a {
    /* renamed from: a */
    public static /* synthetic */ AssertionError m71110a(IllegalAccessException illegalAccessException) {
        try {
            return AssertionError.class.getDeclaredConstructor(new Class[]{String.class, Throwable.class}).newInstance(new Object[]{"Couldn't get the Unsafe", illegalAccessException});
        } catch (Exception unused) {
            return new AssertionError("Couldn't get the Unsafe");
        }
    }

    /* renamed from: b */
    public static /* synthetic */ AssertionError m71111b(NoSuchFieldException noSuchFieldException) {
        try {
            return AssertionError.class.getDeclaredConstructor(new Class[]{String.class, Throwable.class}).newInstance(new Object[]{"Couldn't find the Unsafe", noSuchFieldException});
        } catch (Exception unused) {
            return new AssertionError("Couldn't find the Unsafe");
        }
    }

    /* renamed from: c */
    public static /* synthetic */ AssertionError m71112c(NoSuchFieldException noSuchFieldException) {
        try {
            return AssertionError.class.getDeclaredConstructor(new Class[]{String.class, Throwable.class}).newInstance(new Object[]{"Cannot find field:", noSuchFieldException});
        } catch (Exception unused) {
            return new AssertionError("Cannot find field:");
        }
    }
}
