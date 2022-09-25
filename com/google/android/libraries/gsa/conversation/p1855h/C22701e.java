package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.libraries.gsa.conversation.h.e */
/* compiled from: PG */
final class C22701e extends C22703g {

    /* renamed from: a */
    private final C60218r f62491a;

    public C22701e(C60218r rVar) {
        this.f62491a = rVar;
    }

    /* renamed from: a */
    public final C60218r mo27831a() {
        return this.f62491a;
    }

    /* renamed from: b */
    public final int mo27832b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22717u) {
            C22717u uVar = (C22717u) obj;
            if (uVar.mo27832b() != 2 || !this.f62491a.equals(uVar.mo27831a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f62491a.hashCode();
    }

    public final String toString() {
        String obj = this.f62491a.toString();
        return "ConversationEventId{clientEventId=" + obj + "}";
    }
}
