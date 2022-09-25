package com.google.android.libraries.notifications.p2268e.p2281g;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.notifications.e.g.b */
/* compiled from: PG */
final class C29891b extends C29892c {

    /* renamed from: a */
    private final MessageLite f81007a;

    /* renamed from: b */
    private final MessageLite f81008b;

    /* renamed from: c */
    private final Throwable f81009c;

    /* renamed from: d */
    private final boolean f81010d;

    public C29891b(MessageLite messageLite, MessageLite messageLite2, Throwable th, boolean z) {
        this.f81007a = messageLite;
        this.f81008b = messageLite2;
        this.f81009c = th;
        this.f81010d = z;
    }

    /* renamed from: a */
    public final MessageLite mo35198a() {
        return this.f81007a;
    }

    /* renamed from: b */
    public final MessageLite mo35199b() {
        return this.f81008b;
    }

    /* renamed from: c */
    public final Throwable mo35200c() {
        return this.f81009c;
    }

    /* renamed from: d */
    public final boolean mo35201d() {
        return this.f81010d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29892c) {
            C29892c cVar = (C29892c) obj;
            MessageLite messageLite = this.f81007a;
            if (messageLite != null ? messageLite.equals(cVar.mo35198a()) : cVar.mo35198a() == null) {
                MessageLite messageLite2 = this.f81008b;
                if (messageLite2 != null ? messageLite2.equals(cVar.mo35199b()) : cVar.mo35199b() == null) {
                    Throwable th = this.f81009c;
                    if (th != null ? th.equals(cVar.mo35200c()) : cVar.mo35200c() == null) {
                        if (this.f81010d == cVar.mo35201d()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f81007a);
        String valueOf2 = String.valueOf(this.f81008b);
        String valueOf3 = String.valueOf(this.f81009c);
        boolean z = this.f81010d;
        return "ChimeRpc{request=" + valueOf + ", response=" + valueOf2 + ", error=" + valueOf3 + ", isRetryableError=" + z + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        MessageLite messageLite = this.f81007a;
        int i3 = 0;
        if (messageLite == null) {
            i = 0;
        } else {
            i = messageLite.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        MessageLite messageLite2 = this.f81008b;
        if (messageLite2 == null) {
            i2 = 0;
        } else {
            i2 = messageLite2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Throwable th = this.f81009c;
        if (th != null) {
            i3 = th.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ (true != this.f81010d ? 1237 : 1231);
    }
}
