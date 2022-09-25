package com.google.android.libraries.p1657ba.p1658a;

/* renamed from: com.google.android.libraries.ba.a.b */
/* compiled from: PG */
public final class C19640b extends Exception {

    /* renamed from: a */
    public final int f54641a;

    private C19640b(int i, String str) {
        super(str);
        this.f54641a = i;
    }

    /* renamed from: a */
    public static C19640b m37468a(int i, String str, Object... objArr) {
        Object[] objArr2 = new Object[2];
        objArr2[0] = i != 1 ? i != 2 ? i != 3 ? "PASSWORD_LENGTH_INVALID" : "SECURE_NETWORK_BUT_MISSING_PASSWORD" : "OPEN_NETWORK_HAS_PASSWORD" : "SSID_LENGTH_INVALID";
        objArr2[1] = String.format(str, objArr);
        return new C19640b(i, String.format("Reason: %s. Additional details: %s", objArr2));
    }
}
