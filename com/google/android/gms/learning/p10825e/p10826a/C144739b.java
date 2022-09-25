package com.google.android.gms.learning.p10825e.p10826a;

import com.google.android.gms.learning.ExampleConsumption;
import com.google.protobuf.C63070h;
import java.util.Arrays;

/* renamed from: com.google.android.gms.learning.e.a.b */
/* compiled from: PG */
public final class C144739b {

    /* renamed from: a */
    private final String f391539a;

    /* renamed from: b */
    private final C63070h f391540b;

    /* renamed from: c */
    private int f391541c = 0;

    /* renamed from: d */
    private byte[] f391542d = null;

    public C144739b(String str, C63070h hVar) {
        this.f391539a = str;
        this.f391540b = hVar;
    }

    /* renamed from: a */
    public final synchronized ExampleConsumption mo120175a() {
        return new ExampleConsumption(this.f391539a, this.f391540b.toByteArray(), this.f391541c, this.f391542d);
    }

    /* renamed from: b */
    public final synchronized void mo120176b(byte[] bArr) {
        this.f391541c++;
        this.f391542d = Arrays.copyOf(bArr, bArr.length);
    }
}
