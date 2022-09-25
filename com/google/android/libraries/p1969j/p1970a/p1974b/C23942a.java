package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.libraries.j.a.b.a */
/* compiled from: PG */
final class C23942a extends C23945ac {

    /* renamed from: a */
    private final String f65479a;

    /* renamed from: b */
    private final C55912b f65480b;

    /* renamed from: c */
    private final String f65481c;

    public C23942a(String str, C55912b bVar, String str2) {
        if (str != null) {
            this.f65479a = str;
            if (bVar != null) {
                this.f65480b = bVar;
                if (str2 != null) {
                    this.f65481c = str2;
                    return;
                }
                throw new NullPointerException("Null languageCode");
            }
            throw new NullPointerException("Null setting");
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: a */
    public final C55912b mo29356a() {
        return this.f65480b;
    }

    /* renamed from: b */
    public final String mo29357b() {
        return this.f65479a;
    }

    /* renamed from: c */
    public final String mo29358c() {
        return this.f65481c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23945ac) {
            C23945ac acVar = (C23945ac) obj;
            return this.f65479a.equals(acVar.mo29357b()) && this.f65480b.equals(acVar.mo29356a()) && this.f65481c.equals(acVar.mo29358c());
        }
    }

    public final int hashCode() {
        return ((((this.f65479a.hashCode() ^ 1000003) * 1000003) ^ this.f65480b.hashCode()) * 1000003) ^ this.f65481c.hashCode();
    }

    public final String toString() {
        String str = this.f65479a;
        String num = Integer.toString(this.f65480b.f148826V);
        String str2 = this.f65481c;
        return "CacheKey{accountName=" + str + ", setting=" + num + ", languageCode=" + str2 + "}";
    }
}
