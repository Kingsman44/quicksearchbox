package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.p3353c.C43376u;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.c */
/* compiled from: PG */
public final class C43479c extends C43501y {

    /* renamed from: a */
    private final Instant f113578a;

    /* renamed from: b */
    private final C43376u f113579b;

    /* renamed from: c */
    private final long f113580c;

    /* renamed from: d */
    private final int f113581d;

    public C43479c(Instant instant, C43376u uVar, long j, int i) {
        if (instant != null) {
            this.f113578a = instant;
            if (uVar != null) {
                this.f113579b = uVar;
                this.f113580c = j;
                this.f113581d = i;
                return;
            }
            throw new NullPointerException("Null webState");
        }
        throw new NullPointerException("Null timestamp");
    }

    /* renamed from: a */
    public final int mo46562a() {
        return this.f113581d;
    }

    /* renamed from: b */
    public final long mo46563b() {
        return this.f113580c;
    }

    /* renamed from: c */
    public final C43376u mo46564c() {
        return this.f113579b;
    }

    /* renamed from: d */
    public final Instant mo46565d() {
        return this.f113578a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43501y) {
            C43501y yVar = (C43501y) obj;
            return this.f113578a.equals(yVar.mo46565d()) && this.f113579b.equals(yVar.mo46564c()) && this.f113580c == yVar.mo46563b() && this.f113581d == yVar.mo46562a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f113578a.hashCode();
        int hashCode2 = this.f113579b.hashCode();
        long j = this.f113580c;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f113581d;
    }

    public final String toString() {
        String obj = this.f113578a.toString();
        String obj2 = this.f113579b.toString();
        long j = this.f113580c;
        int i = this.f113581d;
        return "TimestampedWebState{timestamp=" + obj + ", webState=" + obj2 + ", coordinatorId=" + j + ", windowId=" + i + "}";
    }
}
