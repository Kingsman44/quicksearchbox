package com.google.apps.tiktok.cache;

import com.google.apps.tiktok.p3648i.p3649a.C47154e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.e */
/* compiled from: PG */
final class C46390e extends C46409x {

    /* renamed from: a */
    private final MessageLite f121429a;

    /* renamed from: b */
    private final int f121430b;

    /* renamed from: c */
    private final int f121431c;

    /* renamed from: d */
    private final long f121432d;

    /* renamed from: e */
    private final int f121433e;

    public C46390e(MessageLite messageLite, int i, int i2, long j, int i3) {
        this.f121429a = messageLite;
        this.f121430b = i;
        this.f121431c = i2;
        this.f121432d = j;
        this.f121433e = i3;
    }

    /* renamed from: a */
    public final int mo50362a() {
        return this.f121431c;
    }

    /* renamed from: b */
    public final int mo50363b() {
        return this.f121430b;
    }

    /* renamed from: c */
    public final long mo50364c() {
        return this.f121432d;
    }

    /* renamed from: d */
    public final MessageLite mo50365d() {
        return this.f121429a;
    }

    /* renamed from: e */
    public final int mo50366e() {
        return this.f121433e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46409x) {
            C46409x xVar = (C46409x) obj;
            return this.f121429a.equals(xVar.mo50365d()) && this.f121430b == xVar.mo50363b() && this.f121431c == xVar.mo50362a() && this.f121432d == xVar.mo50364c() && this.f121433e == xVar.mo50366e();
        }
    }

    public final int hashCode() {
        int hashCode = this.f121429a.hashCode();
        int i = this.f121430b;
        int i2 = this.f121431c;
        long j = this.f121432d;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f121433e;
    }

    public final String toString() {
        String obj = this.f121429a.toString();
        int i = this.f121430b;
        int i2 = this.f121431c;
        long j = this.f121432d;
        int i3 = this.f121433e;
        return "KeyValueCacheConfig{valueDefaultInstance=" + obj + ", maxSizeBytes=" + i + ", maxEntryCount=" + i2 + ", filterAfterWriteMs=" + j + ", storage=" + C47154e.m83868a(i3) + "}";
    }
}
