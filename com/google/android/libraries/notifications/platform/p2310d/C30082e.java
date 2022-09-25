package com.google.android.libraries.notifications.platform.p2310d;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.d.e */
/* compiled from: PG */
final class C30082e extends C30088k {

    /* renamed from: a */
    private final Integer f81411a;

    /* renamed from: b */
    private final Map f81412b;

    /* renamed from: c */
    private final byte[] f81413c;

    /* renamed from: d */
    private final byte[] f81414d;

    /* renamed from: e */
    private final Exception f81415e;

    public C30082e(Integer num, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.f81411a = num;
        this.f81412b = map;
        this.f81413c = bArr;
        this.f81414d = bArr2;
        this.f81415e = exc;
    }

    /* renamed from: a */
    public final Exception mo35475a() {
        return this.f81415e;
    }

    /* renamed from: b */
    public final Integer mo35476b() {
        return this.f81411a;
    }

    /* renamed from: c */
    public final String mo35477c() {
        return null;
    }

    /* renamed from: d */
    public final Map mo35478d() {
        return this.f81412b;
    }

    /* renamed from: e */
    public final byte[] mo35479e() {
        return this.f81414d;
    }

    public final boolean equals(Object obj) {
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30088k) {
            C30088k kVar = (C30088k) obj;
            Integer num = this.f81411a;
            if (num != null ? num.equals(kVar.mo35476b()) : kVar.mo35476b() == null) {
                if (kVar.mo35477c() == null && this.f81412b.equals(kVar.mo35478d())) {
                    boolean z = kVar instanceof C30082e;
                    if (Arrays.equals(this.f81413c, z ? ((C30082e) kVar).f81413c : kVar.mo35481f())) {
                        return Arrays.equals(this.f81414d, z ? ((C30082e) kVar).f81414d : kVar.mo35479e()) && ((exc = this.f81415e) != null ? exc.equals(kVar.mo35475a()) : kVar.mo35475a() == null);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final byte[] mo35481f() {
        return this.f81413c;
    }

    public final String toString() {
        Integer num = this.f81411a;
        String obj = this.f81412b.toString();
        String arrays = Arrays.toString(this.f81413c);
        String arrays2 = Arrays.toString(this.f81414d);
        String valueOf = String.valueOf(this.f81415e);
        return "GnpHttpResponse{statusCode=" + num + ", statusMessage=null, headers=" + obj + ", rawBody=" + arrays + ", body=" + arrays2 + ", exception=" + valueOf + "}";
    }

    public final int hashCode() {
        int i;
        Integer num = this.f81411a;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int hashCode = (((((((i ^ 1000003) * -721379959) ^ this.f81412b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f81413c)) * 1000003) ^ Arrays.hashCode(this.f81414d)) * 1000003;
        Exception exc = this.f81415e;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode ^ i2;
    }
}
