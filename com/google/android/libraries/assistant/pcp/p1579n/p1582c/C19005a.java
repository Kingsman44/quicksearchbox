package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.assistant.p3897e.p3921j.C52567wn;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.a */
/* compiled from: PG */
final class C19005a extends C19014j {

    /* renamed from: a */
    private final C52567wn f53378a;

    /* renamed from: b */
    private final int f53379b;

    public C19005a(C52567wn wnVar, int i) {
        if (wnVar != null) {
            this.f53378a = wnVar;
            this.f53379b = i;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    /* renamed from: a */
    public final int mo24248a() {
        return this.f53379b;
    }

    /* renamed from: b */
    public final C52567wn mo24249b() {
        return this.f53378a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19014j) {
            C19014j jVar = (C19014j) obj;
            return this.f53378a.equals(jVar.mo24249b()) && this.f53379b == jVar.mo24248a();
        }
    }

    public final int hashCode() {
        return ((this.f53378a.hashCode() ^ 1000003) * 1000003) ^ this.f53379b;
    }

    public final String toString() {
        String num = Integer.toString(this.f53378a.f137991y);
        int i = this.f53379b;
        return "ContentConfig{mediaType=" + num + ", contentCount=" + i + "}";
    }
}
