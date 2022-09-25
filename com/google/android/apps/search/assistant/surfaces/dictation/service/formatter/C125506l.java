package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.l */
/* compiled from: PG */
final class C125506l extends C125512r {

    /* renamed from: a */
    private final boolean f346090a;

    /* renamed from: b */
    private final String f346091b;

    /* renamed from: c */
    private final String f346092c;

    /* renamed from: d */
    private final int f346093d;

    /* renamed from: e */
    private final int f346094e;

    /* renamed from: f */
    private final int f346095f;

    public C125506l(boolean z, String str, String str2, int i, int i2, int i3) {
        this.f346090a = z;
        if (str != null) {
            this.f346091b = str;
            if (str2 != null) {
                this.f346092c = str2;
                this.f346093d = i;
                this.f346094e = i2;
                this.f346095f = i3;
                return;
            }
            throw new NullPointerException("Null composingText");
        }
        throw new NullPointerException("Null textToCommit");
    }

    /* renamed from: a */
    public final int mo107008a() {
        return this.f346095f;
    }

    /* renamed from: b */
    public final int mo107009b() {
        return this.f346094e;
    }

    /* renamed from: c */
    public final int mo107010c() {
        return this.f346093d;
    }

    /* renamed from: d */
    public final String mo107011d() {
        return this.f346092c;
    }

    /* renamed from: e */
    public final String mo107012e() {
        return this.f346091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125512r) {
            C125512r rVar = (C125512r) obj;
            return this.f346090a == rVar.mo107014f() && this.f346091b.equals(rVar.mo107012e()) && this.f346092c.equals(rVar.mo107011d()) && this.f346093d == rVar.mo107010c() && this.f346094e == rVar.mo107009b() && this.f346095f == rVar.mo107008a();
        }
    }

    /* renamed from: f */
    public final boolean mo107014f() {
        return this.f346090a;
    }

    public final int hashCode() {
        return (((((((((((true != this.f346090a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f346091b.hashCode()) * 1000003) ^ this.f346092c.hashCode()) * 1000003) ^ this.f346093d) * 1000003) ^ this.f346094e) * 1000003) ^ this.f346095f;
    }

    public final String toString() {
        boolean z = this.f346090a;
        String str = this.f346091b;
        String str2 = this.f346092c;
        int i = this.f346093d;
        int i2 = this.f346094e;
        int i3 = this.f346095f;
        return "FormattingStabilityInfo{isCommit=" + z + ", textToCommit=" + str + ", composingText=" + str2 + ", numUnstableTokens=" + i + ", numUnstableChanges=" + i2 + ", numRequests=" + i3 + "}";
    }
}
