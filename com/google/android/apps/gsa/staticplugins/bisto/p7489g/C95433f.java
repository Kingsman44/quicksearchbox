package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import java.util.Arrays;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.f */
/* compiled from: PG */
final class C95433f extends C95393cq {

    /* renamed from: a */
    private final String f267029a;

    /* renamed from: b */
    private final int f267030b;

    /* renamed from: c */
    private final byte[] f267031c;

    /* renamed from: d */
    private final Duration f267032d;

    /* renamed from: e */
    private final int f267033e;

    public C95433f(String str, int i, int i2, byte[] bArr, Duration duration) {
        this.f267029a = str;
        this.f267033e = i;
        this.f267030b = i2;
        this.f267031c = bArr;
        this.f267032d = duration;
    }

    /* renamed from: a */
    public final int mo89331a() {
        return this.f267030b;
    }

    /* renamed from: b */
    public final Duration mo89332b() {
        return this.f267032d;
    }

    /* renamed from: c */
    public final String mo89333c() {
        return this.f267029a;
    }

    /* renamed from: d */
    public final byte[] mo89334d() {
        return this.f267031c;
    }

    /* renamed from: e */
    public final int mo89335e() {
        return this.f267033e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95393cq) {
            C95393cq cqVar = (C95393cq) obj;
            if (this.f267029a.equals(cqVar.mo89333c()) && this.f267033e == cqVar.mo89335e() && this.f267030b == cqVar.mo89331a()) {
                return Arrays.equals(this.f267031c, cqVar instanceof C95433f ? ((C95433f) cqVar).f267031c : cqVar.mo89334d()) && this.f267032d.equals(cqVar.mo89332b());
            }
        }
    }

    public final int hashCode() {
        return ((((((((this.f267029a.hashCode() ^ 1000003) * 1000003) ^ this.f267033e) * 1000003) ^ this.f267030b) * 1000003) ^ Arrays.hashCode(this.f267031c)) * 1000003) ^ this.f267032d.hashCode();
    }

    public final String toString() {
        String str = this.f267029a;
        String num = Integer.toString(this.f267033e - 1);
        int i = this.f267030b;
        String arrays = Arrays.toString(this.f267031c);
        String obj = this.f267032d.toString();
        return "DeviceRequest{name=" + str + ", messageGroup=" + num + ", messageType=" + i + ", messageBytes=" + arrays + ", timeout=" + obj + "}";
    }
}
