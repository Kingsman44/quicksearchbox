package com.google.android.libraries.search.p2904c.p2942m;

import com.google.android.libraries.search.p2904c.C37404bi;

/* renamed from: com.google.android.libraries.search.c.m.d */
/* compiled from: PG */
public final class C37882d extends C37826a {

    /* renamed from: a */
    private final C37404bi f100449a;

    /* renamed from: b */
    private final int f100450b;

    public C37882d(C37404bi biVar, int i) {
        if (biVar != null) {
            this.f100449a = biVar;
            this.f100450b = i;
            return;
        }
        throw new NullPointerException("Null audioRequestClient");
    }

    /* renamed from: a */
    public final int mo41090a() {
        return this.f100450b;
    }

    /* renamed from: b */
    public final C37404bi mo41091b() {
        return this.f100449a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37826a) {
            C37826a aVar = (C37826a) obj;
            return this.f100449a.equals(aVar.mo41091b()) && this.f100450b == aVar.mo41090a();
        }
    }

    public final int hashCode() {
        return ((this.f100449a.hashCode() ^ 1000003) * 1000003) ^ this.f100450b;
    }

    public final String toString() {
        String obj = this.f100449a.toString();
        int i = this.f100450b;
        return "AudioRequestClientData{audioRequestClient=" + obj + ", clientToken=" + i + "}";
    }
}
