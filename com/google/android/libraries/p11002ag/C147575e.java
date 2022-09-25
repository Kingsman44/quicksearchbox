package com.google.android.libraries.p11002ag;

/* renamed from: com.google.android.libraries.ag.e */
/* compiled from: PG */
public final class C147575e extends Exception {

    /* renamed from: a */
    public final int f398272a;

    /* renamed from: b */
    private final String f398273b;

    public C147575e(int i, String str) {
        super(str);
        this.f398273b = str;
        this.f398272a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error type: ");
        int i = this.f398272a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE");
        sb.append(". ");
        sb.append(this.f398273b);
        return sb.toString();
    }
}
