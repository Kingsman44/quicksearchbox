package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.a */
/* compiled from: PG */
final class C17694a extends C17696ab {

    /* renamed from: a */
    public final C48899an f50872a;

    /* renamed from: b */
    public final C58495hd f50873b;

    /* renamed from: c */
    private final Optional f50874c;

    public C17694a(C48899an anVar, C58495hd hdVar, Optional optional) {
        if (anVar != null) {
            this.f50872a = anVar;
            if (hdVar != null) {
                this.f50873b = hdVar;
                if (optional != null) {
                    this.f50874c = optional;
                    return;
                }
                throw new NullPointerException("Null expirationTimeTrigger");
            }
            throw new NullPointerException("Null contextTriggerNodeMap");
        }
        throw new NullPointerException("Null internalContextTriggerRequest");
    }

    /* renamed from: a */
    public final C48899an mo23433a() {
        return this.f50872a;
    }

    /* renamed from: b */
    public final C58495hd mo23434b() {
        return this.f50873b;
    }

    /* renamed from: c */
    public final Optional mo23435c() {
        return this.f50874c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17696ab) {
            C17696ab abVar = (C17696ab) obj;
            return this.f50872a.equals(abVar.mo23433a()) && this.f50873b.equals(abVar.mo23434b()) && this.f50874c.equals(abVar.mo23435c());
        }
    }

    public final int hashCode() {
        return ((((this.f50872a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f50873b.entrySet())) * 1000003) ^ this.f50874c.hashCode();
    }

    public final String toString() {
        String obj = this.f50872a.toString();
        String obj2 = this.f50873b.toString();
        String obj3 = this.f50874c.toString();
        return "ContextTriggerRegistry{internalContextTriggerRequest=" + obj + ", contextTriggerNodeMap=" + obj2 + ", expirationTimeTrigger=" + obj3 + "}";
    }
}
