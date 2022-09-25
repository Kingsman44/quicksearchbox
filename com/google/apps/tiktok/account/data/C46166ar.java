package com.google.apps.tiktok.account.data;

/* renamed from: com.google.apps.tiktok.account.data.ar */
/* compiled from: PG */
public final class C46166ar extends C46327v {

    /* renamed from: a */
    private final String f121092a;

    /* renamed from: b */
    private final C46326u f121093b;

    public C46166ar(String str, C46326u uVar) {
        this.f121092a = str;
        this.f121093b = uVar;
    }

    /* renamed from: a */
    public final C46326u mo50239a() {
        return this.f121093b;
    }

    /* renamed from: b */
    public final String mo50240b() {
        return this.f121092a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46327v) {
            C46327v vVar = (C46327v) obj;
            return this.f121092a.equals(vVar.mo50240b()) && this.f121093b.equals(vVar.mo50239a());
        }
    }

    public final int hashCode() {
        return ((this.f121092a.hashCode() ^ 1000003) * 1000003) ^ this.f121093b.hashCode();
    }

    public final String toString() {
        String str = this.f121092a;
        String obj = this.f121093b.toString();
        return "AccountProviderConfig{type=" + str + ", provider=" + obj + "}";
    }
}
