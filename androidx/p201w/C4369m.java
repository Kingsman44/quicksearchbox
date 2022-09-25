package androidx.p201w;

/* renamed from: androidx.w.m */
/* compiled from: PG */
final class C4369m {

    /* renamed from: a */
    final String f13977a;

    /* renamed from: b */
    final String f13978b;

    /* renamed from: c */
    final C4368l f13979c;

    public C4369m(String str, C4368l lVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        } else if (str.endsWith("/")) {
            this.f13977a = "appassets.androidplatform.net";
            this.f13978b = str;
            this.f13979c = lVar;
        } else {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
    }
}
