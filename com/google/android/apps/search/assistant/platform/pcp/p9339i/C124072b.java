package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.b */
/* compiled from: PG */
final class C124072b extends C124055aj {

    /* renamed from: a */
    private final C53306j f342682a;

    /* renamed from: b */
    private final int f342683b;

    /* renamed from: c */
    private final String f342684c;

    public C124072b(C53306j jVar, int i, String str) {
        this.f342682a = jVar;
        this.f342683b = i;
        this.f342684c = str;
    }

    /* renamed from: a */
    public final int mo106258a() {
        return this.f342683b;
    }

    /* renamed from: b */
    public final C53306j mo106259b() {
        return this.f342682a;
    }

    /* renamed from: c */
    public final String mo106260c() {
        return this.f342684c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124055aj) {
            C124055aj ajVar = (C124055aj) obj;
            return this.f342682a.equals(ajVar.mo106259b()) && this.f342683b == ajVar.mo106258a() && this.f342684c.equals(ajVar.mo106260c());
        }
    }

    public final int hashCode() {
        return ((((this.f342682a.hashCode() ^ 1000003) * 1000003) ^ this.f342683b) * 1000003) ^ this.f342684c.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f342682a.f139793X);
        int i = this.f342683b;
        String str = this.f342684c;
        return "PcpClientDataKey{clientType=" + num + ", dataType=" + i + ", dataId=" + str + "}";
    }
}
