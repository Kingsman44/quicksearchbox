package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.i */
/* compiled from: PG */
final class C16693i extends C16682ao {

    /* renamed from: a */
    private final Integer f48861a;

    /* renamed from: b */
    private final Integer f48862b;

    /* renamed from: c */
    private final C16636ah f48863c;

    public C16693i(Integer num, Integer num2, C16636ah ahVar) {
        this.f48861a = num;
        this.f48862b = num2;
        if (ahVar != null) {
            this.f48863c = ahVar;
            return;
        }
        throw new NullPointerException("Null color");
    }

    /* renamed from: a */
    public final C16636ah mo22973a() {
        return this.f48863c;
    }

    /* renamed from: b */
    public final Integer mo22974b() {
        return this.f48862b;
    }

    /* renamed from: c */
    public final Integer mo22975c() {
        return this.f48861a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16682ao) {
            C16682ao aoVar = (C16682ao) obj;
            return this.f48861a.equals(aoVar.mo22975c()) && this.f48862b.equals(aoVar.mo22974b()) && this.f48863c.equals(aoVar.mo22973a());
        }
    }

    public final int hashCode() {
        return ((((this.f48861a.hashCode() ^ 1000003) * 1000003) ^ this.f48862b.hashCode()) * 1000003) ^ this.f48863c.hashCode();
    }

    public final String toString() {
        Integer num = this.f48861a;
        Integer num2 = this.f48862b;
        String obj = this.f48863c.toString();
        return "SmartActionButtonInfo{veId=" + num + ", iconId=" + num2 + ", color=" + obj + "}";
    }
}
