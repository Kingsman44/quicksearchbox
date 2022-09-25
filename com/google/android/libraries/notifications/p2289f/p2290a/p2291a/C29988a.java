package com.google.android.libraries.notifications.p2289f.p2290a.p2291a;

import com.google.android.libraries.notifications.data.C29820k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.notifications.f.a.a.a */
/* compiled from: PG */
final class C29988a extends C29989b {

    /* renamed from: a */
    private final C29820k f81194a;

    /* renamed from: b */
    private final long f81195b;

    /* renamed from: c */
    private final C58485gu f81196c;

    public C29988a(C29820k kVar, long j, C58485gu guVar) {
        this.f81194a = kVar;
        this.f81195b = j;
        if (guVar != null) {
            this.f81196c = guVar;
            return;
        }
        throw new NullPointerException("Null threads");
    }

    /* renamed from: a */
    public final long mo35298a() {
        return this.f81195b;
    }

    /* renamed from: b */
    public final C29820k mo35299b() {
        return this.f81194a;
    }

    /* renamed from: c */
    public final C58485gu mo35300c() {
        return this.f81196c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29989b) {
            C29989b bVar = (C29989b) obj;
            C29820k kVar = this.f81194a;
            if (kVar != null ? kVar.equals(bVar.mo35299b()) : bVar.mo35299b() == null) {
                return this.f81195b == bVar.mo35298a() && C58597ky.m90218i(this.f81196c, bVar.mo35300c());
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f81194a);
        long j = this.f81195b;
        String obj = this.f81196c.toString();
        return "NotificationClick{account=" + valueOf + ", timestamp=" + j + ", threads=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        C29820k kVar = this.f81194a;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        long j = this.f81195b;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f81196c.hashCode();
    }
}
