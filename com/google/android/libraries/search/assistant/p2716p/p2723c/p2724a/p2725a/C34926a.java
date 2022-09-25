package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.a */
/* compiled from: PG */
final class C34926a extends C34941ao {

    /* renamed from: a */
    private final String f92586a;

    /* renamed from: b */
    private final C58485gu f92587b;

    public C34926a(String str, C58485gu guVar) {
        if (str != null) {
            this.f92586a = str;
            if (guVar != null) {
                this.f92587b = guVar;
                return;
            }
            throw new NullPointerException("Null convList");
        }
        throw new NullPointerException("Null provider");
    }

    /* renamed from: a */
    public final C58485gu mo39637a() {
        return this.f92587b;
    }

    /* renamed from: b */
    public final String mo39638b() {
        return this.f92586a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34941ao) {
            C34941ao aoVar = (C34941ao) obj;
            return this.f92586a.equals(aoVar.mo39638b()) && C58597ky.m90218i(this.f92587b, aoVar.mo39637a());
        }
    }

    public final int hashCode() {
        return ((this.f92586a.hashCode() ^ 1000003) * 1000003) ^ this.f92587b.hashCode();
    }

    public final String toString() {
        String str = this.f92586a;
        String obj = this.f92587b.toString();
        return "ProviderToConversationIdList{provider=" + str + ", convList=" + obj + "}";
    }
}
