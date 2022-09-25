package com.google.android.gms.usonia.auth.internal;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.usonia.auth.internal.c */
/* compiled from: PG */
final class C146130c {

    /* renamed from: a */
    public static final String[] f394876a = {"usonia_leaf_key0", "usonia_leaf_key1"};

    /* renamed from: b */
    public final PrivateKey[] f394877b = new PrivateKey[2];

    /* renamed from: c */
    public final X509Certificate[] f394878c = new X509Certificate[2];

    /* renamed from: d */
    public int f394879d = 0;

    /* renamed from: a */
    public final int mo122669a() {
        return (this.f394879d + 1) % 2;
    }

    /* renamed from: b */
    public final boolean mo122670b() {
        return this.f394877b[this.f394879d] != null;
    }
}
