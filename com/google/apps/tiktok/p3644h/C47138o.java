package com.google.apps.tiktok.p3644h;

import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.apps.tiktok.h.o */
/* compiled from: PG */
final class C47138o extends C47141r {

    /* renamed from: a */
    private final String f122756a;

    /* renamed from: b */
    private final Integer f122757b;

    /* renamed from: c */
    private final C61373ao f122758c;

    public C47138o(String str, Integer num, C61373ao aoVar) {
        this.f122756a = str;
        this.f122757b = num;
        this.f122758c = aoVar;
    }

    /* renamed from: a */
    public final C61373ao mo51036a() {
        return this.f122758c;
    }

    /* renamed from: b */
    public final Integer mo51037b() {
        return this.f122757b;
    }

    /* renamed from: c */
    public final String mo51038c() {
        return this.f122756a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47141r) {
            C47141r rVar = (C47141r) obj;
            String str = this.f122756a;
            if (str != null ? str.equals(rVar.mo51038c()) : rVar.mo51038c() == null) {
                Integer num = this.f122757b;
                if (num != null ? num.equals(rVar.mo51037b()) : rVar.mo51037b() == null) {
                    if (this.f122758c.equals(rVar.mo51036a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f122756a;
        Integer num = this.f122757b;
        String obj = this.f122758c.toString();
        return "GrpcClientConfig{host=" + str + ", port=" + num + ", rpcServiceConfig=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f122756a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Integer num = this.f122757b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f122758c.hashCode();
    }
}
