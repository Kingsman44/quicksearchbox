package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.a */
/* compiled from: PG */
final class C111888a extends C111914h {

    /* renamed from: a */
    private final Duration f310902a;

    /* renamed from: b */
    private final String f310903b;

    /* renamed from: c */
    private final String f310904c;

    /* renamed from: d */
    private final int f310905d;

    public C111888a(Duration duration, String str, String str2, int i) {
        this.f310902a = duration;
        this.f310903b = str;
        this.f310904c = str2;
        this.f310905d = i;
    }

    /* renamed from: a */
    public final int mo99283a() {
        return this.f310905d;
    }

    /* renamed from: b */
    public final Duration mo99284b() {
        return this.f310902a;
    }

    /* renamed from: c */
    public final String mo99285c() {
        return this.f310904c;
    }

    /* renamed from: d */
    public final String mo99286d() {
        return this.f310903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111914h) {
            C111914h hVar = (C111914h) obj;
            return this.f310902a.equals(hVar.mo99284b()) && this.f310903b.equals(hVar.mo99286d()) && this.f310904c.equals(hVar.mo99285c()) && this.f310905d == hVar.mo99283a();
        }
    }

    public final int hashCode() {
        return ((((((this.f310902a.hashCode() ^ 1000003) * 1000003) ^ this.f310903b.hashCode()) * 1000003) ^ this.f310904c.hashCode()) * 1000003) ^ this.f310905d;
    }

    public final String toString() {
        String obj = this.f310902a.toString();
        String str = this.f310903b;
        String str2 = this.f310904c;
        int i = this.f310905d;
        return "PredictionInfo{predictionTime=" + obj + ", modelName=" + str + ", modelConfig=" + str2 + ", predictionPosition=" + i + "}";
    }
}
