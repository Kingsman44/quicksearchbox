package com.google.android.libraries.notifications.p2296j;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.notifications.j.b */
/* compiled from: PG */
public final class C30032b extends C30034d {

    /* renamed from: a */
    public final Integer f81271a;

    /* renamed from: b */
    public final boolean f81272b;

    /* renamed from: c */
    private final MessageLite f81273c;

    /* renamed from: d */
    private final Throwable f81274d;

    /* renamed from: e */
    private final boolean f81275e;

    public C30032b(Integer num, MessageLite messageLite, Throwable th, boolean z, boolean z2) {
        this.f81271a = num;
        this.f81273c = messageLite;
        this.f81274d = th;
        this.f81275e = z;
        this.f81272b = z2;
    }

    /* renamed from: a */
    public final MessageLite mo35360a() {
        return this.f81273c;
    }

    /* renamed from: b */
    public final Integer mo35361b() {
        return this.f81271a;
    }

    /* renamed from: c */
    public final Throwable mo35362c() {
        return this.f81274d;
    }

    /* renamed from: d */
    public final boolean mo35363d() {
        return this.f81272b;
    }

    /* renamed from: e */
    public final boolean mo35364e() {
        return this.f81275e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30034d) {
            C30034d dVar = (C30034d) obj;
            Integer num = this.f81271a;
            if (num != null ? num.equals(dVar.mo35361b()) : dVar.mo35361b() == null) {
                MessageLite messageLite = this.f81273c;
                if (messageLite != null ? messageLite.equals(dVar.mo35360a()) : dVar.mo35360a() == null) {
                    Throwable th = this.f81274d;
                    if (th != null ? th.equals(dVar.mo35362c()) : dVar.mo35362c() == null) {
                        return this.f81275e == dVar.mo35364e() && this.f81272b == dVar.mo35363d();
                    }
                }
            }
        }
    }

    public final String toString() {
        Integer num = this.f81271a;
        String valueOf = String.valueOf(this.f81273c);
        String valueOf2 = String.valueOf(this.f81274d);
        boolean z = this.f81275e;
        boolean z2 = this.f81272b;
        return "ChimeRpcResponse{statusCode=" + num + ", response=" + valueOf + ", error=" + valueOf2 + ", isRetryableError=" + z + ", isAuthError=" + z2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        Integer num = this.f81271a;
        int i3 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        MessageLite messageLite = this.f81273c;
        if (messageLite == null) {
            i2 = 0;
        } else {
            i2 = messageLite.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Throwable th = this.f81274d;
        if (th != null) {
            i3 = th.hashCode();
        }
        int i6 = 1237;
        int i7 = (((i5 ^ i3) * 1000003) ^ (true != this.f81275e ? 1237 : 1231)) * 1000003;
        if (true == this.f81272b) {
            i6 = 1231;
        }
        return i7 ^ i6;
    }
}
