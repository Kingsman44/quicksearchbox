package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.h.a.a.a.a.d */
/* compiled from: PG */
final class C119079d extends C119086k {

    /* renamed from: a */
    private final C58485gu f332183a;

    /* renamed from: b */
    private final C58485gu f332184b;

    /* renamed from: c */
    private final String f332185c;

    /* renamed from: d */
    private final C119084i f332186d;

    public C119079d(C58485gu guVar, C58485gu guVar2, String str, C119084i iVar) {
        this.f332183a = guVar;
        this.f332184b = guVar2;
        this.f332185c = str;
        this.f332186d = iVar;
    }

    /* renamed from: a */
    public final C119084i mo104140a() {
        return this.f332186d;
    }

    /* renamed from: b */
    public final C58485gu mo104141b() {
        return this.f332183a;
    }

    /* renamed from: c */
    public final C58485gu mo104142c() {
        return this.f332184b;
    }

    /* renamed from: d */
    public final String mo104143d() {
        return this.f332185c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119086k) {
            C119086k kVar = (C119086k) obj;
            return C58597ky.m90218i(this.f332183a, kVar.mo104141b()) && C58597ky.m90218i(this.f332184b, kVar.mo104142c()) && this.f332185c.equals(kVar.mo104143d()) && this.f332186d.equals(kVar.mo104140a());
        }
    }

    public final int hashCode() {
        return ((((((this.f332183a.hashCode() ^ 1000003) * 1000003) ^ this.f332184b.hashCode()) * 1000003) ^ this.f332185c.hashCode()) * 1000003) ^ this.f332186d.hashCode();
    }

    public final String toString() {
        String obj = this.f332183a.toString();
        String obj2 = this.f332184b.toString();
        String str = this.f332185c;
        String obj3 = this.f332186d.toString();
        return "ParagraphData{timepoints=" + obj + ", words=" + obj2 + ", paragraphText=" + str + ", audio=" + obj3 + "}";
    }
}
