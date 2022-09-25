package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.x */
/* compiled from: PG */
final class C12061x extends C12047j {

    /* renamed from: a */
    private final C12060w f38615a;

    /* renamed from: b */
    private final C60870cx f38616b;

    public C12061x(C12060w wVar, C60870cx cxVar) {
        this.f38615a = wVar;
        this.f38616b = cxVar;
    }

    /* renamed from: a */
    public final C12060w mo20385a() {
        return this.f38615a;
    }

    /* renamed from: b */
    public final C60870cx mo20386b() {
        return this.f38616b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12047j) {
            C12047j jVar = (C12047j) obj;
            return this.f38615a.equals(jVar.mo20385a()) && this.f38616b.equals(jVar.mo20386b());
        }
    }

    public final int hashCode() {
        return ((this.f38615a.hashCode() ^ 1000003) * 1000003) ^ this.f38616b.hashCode();
    }

    public final String toString() {
        String obj = this.f38615a.toString();
        String obj2 = this.f38616b.toString();
        return "AudioChannelInfo{audioStreamChannel=" + obj + ", micOpenTimestamp=" + obj2 + "}";
    }
}
