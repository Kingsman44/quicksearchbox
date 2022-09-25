package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class OneSearchAppSearchData {

    /* renamed from: a */
    public final String f376066a;

    /* renamed from: b */
    public final String f376067b;

    /* renamed from: c */
    public final long f376068c;

    /* renamed from: d */
    public final long f376069d;

    /* renamed from: e */
    public final byte[] f376070e;

    /* renamed from: f */
    public final byte[] f376071f;

    public OneSearchAppSearchData(String str, String str2, long j, long j2, byte[] bArr, byte[] bArr2) {
        C69664n.m101061g(str, "namespace");
        C69664n.m101061g(bArr, "zeroStateGetSuggestionsResponseBytes");
        C69664n.m101061g(bArr2, "zeroStateInternalBytes");
        this.f376066a = str;
        this.f376067b = str2;
        this.f376068c = j;
        this.f376069d = j2;
        this.f376070e = bArr;
        this.f376071f = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneSearchAppSearchData)) {
            return false;
        }
        OneSearchAppSearchData oneSearchAppSearchData = (OneSearchAppSearchData) obj;
        return C69664n.m101066l(this.f376066a, oneSearchAppSearchData.f376066a) && C69664n.m101066l(this.f376067b, oneSearchAppSearchData.f376067b) && this.f376068c == oneSearchAppSearchData.f376068c && this.f376069d == oneSearchAppSearchData.f376069d && C69664n.m101066l(this.f376070e, oneSearchAppSearchData.f376070e) && C69664n.m101066l(this.f376071f, oneSearchAppSearchData.f376071f);
    }

    public final int hashCode() {
        int hashCode = this.f376066a.hashCode();
        int hashCode2 = this.f376067b.hashCode();
        long j = this.f376068c;
        long j2 = this.f376069d;
        return (((((((((hashCode * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f376070e)) * 31) + Arrays.hashCode(this.f376071f);
    }

    public final String toString() {
        String str = this.f376066a;
        String str2 = this.f376067b;
        long j = this.f376068c;
        long j2 = this.f376069d;
        String arrays = Arrays.toString(this.f376070e);
        String arrays2 = Arrays.toString(this.f376071f);
        return "OneSearchAppSearchData(namespace=" + str + ", id=" + str2 + ", createdAt=" + j + ", ttl=" + j2 + ", zeroStateGetSuggestionsResponseBytes=" + arrays + ", zeroStateInternalBytes=" + arrays2 + ")";
    }
}
