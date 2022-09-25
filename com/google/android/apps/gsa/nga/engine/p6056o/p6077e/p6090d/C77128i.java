package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.i */
/* compiled from: PG */
final class C77128i extends C77141v {

    /* renamed from: a */
    private final String f212871a;

    /* renamed from: b */
    private final af f212872b;

    public C77128i(String str, af afVar) {
        if (str != null) {
            this.f212871a = str;
            if (afVar != null) {
                this.f212872b = afVar;
                return;
            }
            throw new NullPointerException("Null messagingApp");
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final af mo72439a() {
        return this.f212872b;
    }

    /* renamed from: b */
    public final String mo72440b() {
        return this.f212871a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77141v) {
            C77141v vVar = (C77141v) obj;
            return this.f212871a.equals(vVar.mo72440b()) && this.f212872b.equals(vVar.mo72439a());
        }
    }

    public final int hashCode() {
        return ((this.f212871a.hashCode() ^ 1000003) * 1000003) ^ this.f212872b.hashCode();
    }

    public final String toString() {
        String str = this.f212871a;
        String obj = this.f212872b.toString();
        return "ForegroundConversation{conversationId=" + str + ", messagingApp=" + obj + "}";
    }
}
