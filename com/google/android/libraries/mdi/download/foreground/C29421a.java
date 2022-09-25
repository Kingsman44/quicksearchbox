package com.google.android.libraries.mdi.download.foreground;

/* renamed from: com.google.android.libraries.mdi.download.foreground.a */
/* compiled from: PG */
public final class C29421a extends C29422b {

    /* renamed from: a */
    public final String f79765a;

    /* renamed from: b */
    private final int f79766b;

    public C29421a(int i, String str) {
        this.f79766b = i;
        this.f79765a = str;
    }

    /* renamed from: a */
    public final String mo34726a() {
        return this.f79765a;
    }

    /* renamed from: b */
    public final int mo34727b() {
        return this.f79766b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29422b) {
            C29422b bVar = (C29422b) obj;
            return this.f79766b == bVar.mo34727b() && this.f79765a.equals(bVar.mo34726a());
        }
    }

    public final int hashCode() {
        return ((this.f79766b ^ 1000003) * 1000003) ^ this.f79765a.hashCode();
    }
}
