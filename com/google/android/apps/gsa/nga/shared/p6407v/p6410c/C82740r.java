package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.r */
/* compiled from: PG */
public final class C82740r extends C82518id {

    /* renamed from: a */
    private final String f225487a = "DID_EMPTY_PREVIOUS_QUERY_EVENT";

    /* renamed from: b */
    private final String f225488b;

    /* renamed from: c */
    private final boolean f225489c;

    public C82740r(String str, String str2, boolean z) {
        this.f225488b = str2;
        this.f225489c = z;
    }

    /* renamed from: b */
    public final String mo76558b() {
        return this.f225488b;
    }

    /* renamed from: c */
    public final boolean mo76559c() {
        return this.f225489c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225487a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82518id) {
            C82518id idVar = (C82518id) obj;
            return this.f225487a.equals(idVar.mo75583d()) && this.f225488b.equals(idVar.mo76558b()) && this.f225489c == idVar.mo76559c();
        }
    }

    public final int hashCode() {
        return ((((this.f225487a.hashCode() ^ 1000003) * 1000003) ^ this.f225488b.hashCode()) * 1000003) ^ (true != this.f225489c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225487a;
        String str2 = this.f225488b;
        boolean z = this.f225489c;
        return "DidEmptyPreviousQueryEvent{token=" + str + ", mode=" + str2 + ", previousQueryIsPresent=" + z + "}";
    }
}
