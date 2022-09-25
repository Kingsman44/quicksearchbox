package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.p */
/* compiled from: PG */
final class C114884p extends C114811bh {

    /* renamed from: a */
    private final int f318749a;

    /* renamed from: b */
    private final String f318750b;

    /* renamed from: c */
    private final String f318751c;

    /* renamed from: d */
    private final long f318752d;

    public C114884p(int i, String str, String str2, long j) {
        this.f318749a = i;
        this.f318750b = str;
        this.f318751c = str2;
        this.f318752d = j;
    }

    /* renamed from: a */
    public final int mo101617a() {
        return this.f318749a;
    }

    /* renamed from: b */
    public final long mo101618b() {
        return this.f318752d;
    }

    /* renamed from: c */
    public final Intent mo101619c() {
        return null;
    }

    /* renamed from: d */
    public final String mo101620d() {
        return this.f318750b;
    }

    /* renamed from: e */
    public final String mo101621e() {
        return this.f318751c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114811bh) {
            C114811bh bhVar = (C114811bh) obj;
            return this.f318749a == bhVar.mo101617a() && this.f318750b.equals(bhVar.mo101620d()) && this.f318751c.equals(bhVar.mo101621e()) && bhVar.mo101619c() == null && this.f318752d == bhVar.mo101618b();
        }
    }

    public final int hashCode() {
        int i = this.f318749a;
        int hashCode = this.f318750b.hashCode();
        int hashCode2 = this.f318751c.hashCode();
        long j = this.f318752d;
        return ((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * -721379959) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        int i = this.f318749a;
        String str = this.f318750b;
        String str2 = this.f318751c;
        long j = this.f318752d;
        return "SuggestionChipItem{id=" + i + ", displayText=" + str + ", query=" + str2 + ", intent=null, expirationTime=" + j + "}";
    }
}
