package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.a */
/* compiled from: PG */
final class C124029a extends C124038j {

    /* renamed from: b */
    private final C53306j f342577b;

    /* renamed from: c */
    private final int f342578c;

    /* renamed from: d */
    private final String f342579d;

    public C124029a(C53306j jVar, int i, String str) {
        this.f342577b = jVar;
        this.f342578c = i;
        if (str != null) {
            this.f342579d = str;
            return;
        }
        throw new NullPointerException("Null dataId");
    }

    /* renamed from: a */
    public final int mo106235a() {
        return this.f342578c;
    }

    /* renamed from: b */
    public final C53306j mo106236b() {
        return this.f342577b;
    }

    /* renamed from: c */
    public final String mo106237c() {
        return this.f342579d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124038j) {
            C124038j jVar = (C124038j) obj;
            return this.f342577b.equals(jVar.mo106236b()) && this.f342578c == jVar.mo106235a() && this.f342579d.equals(jVar.mo106237c());
        }
    }

    public final int hashCode() {
        return ((((this.f342577b.hashCode() ^ 1000003) * 1000003) ^ this.f342578c) * 1000003) ^ this.f342579d.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f342577b.f139793X);
        int i = this.f342578c;
        String str = this.f342579d;
        return "ParsedTriggerId{clientType=" + num + ", dataType=" + i + ", dataId=" + str + "}";
    }
}
