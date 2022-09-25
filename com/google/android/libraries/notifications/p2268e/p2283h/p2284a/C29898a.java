package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;

/* renamed from: com.google.android.libraries.notifications.e.h.a.a */
/* compiled from: PG */
final class C29898a extends C29904b {

    /* renamed from: a */
    private final C55564bq f81016a;

    /* renamed from: b */
    private final String f81017b;

    /* renamed from: c */
    private final int f81018c;

    public C29898a(C55564bq bqVar, String str, int i) {
        if (bqVar != null) {
            this.f81016a = bqVar;
            if (str != null) {
                this.f81017b = str;
                this.f81018c = i;
                return;
            }
            throw new NullPointerException("Null actionId");
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    /* renamed from: a */
    public final C55564bq mo35211a() {
        return this.f81016a;
    }

    /* renamed from: b */
    public final String mo35212b() {
        return this.f81017b;
    }

    /* renamed from: c */
    public final int mo35213c() {
        return this.f81018c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29904b) {
            C29904b bVar = (C29904b) obj;
            return this.f81016a.equals(bVar.mo35211a()) && this.f81017b.equals(bVar.mo35212b()) && this.f81018c == bVar.mo35213c();
        }
    }

    public final int hashCode() {
        return ((((this.f81016a.hashCode() ^ 1000003) * 1000003) ^ this.f81017b.hashCode()) * 1000003) ^ this.f81018c;
    }

    public final String toString() {
        String obj = this.f81016a.toString();
        String str = this.f81017b;
        String num = Integer.toString(this.f81018c - 1);
        return "SdkBatchUpdateKey{threadStateUpdate=" + obj + ", actionId=" + str + ", eventSource=" + num + "}";
    }
}
