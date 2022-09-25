package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.a */
/* compiled from: PG */
final class C17604a extends C17610g {

    /* renamed from: a */
    private final C48919u f50715a;

    /* renamed from: b */
    private final C48888ac f50716b;

    public C17604a(C48919u uVar, C48888ac acVar) {
        if (uVar != null) {
            this.f50715a = uVar;
            if (acVar != null) {
                this.f50716b = acVar;
                return;
            }
            throw new NullPointerException("Null contextTriggerNode");
        }
        throw new NullPointerException("Null contextTriggerRequestContext");
    }

    /* renamed from: a */
    public final C48919u mo23407a() {
        return this.f50715a;
    }

    /* renamed from: b */
    public final C48888ac mo23408b() {
        return this.f50716b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17610g) {
            C17610g gVar = (C17610g) obj;
            return this.f50715a.equals(gVar.mo23407a()) && this.f50716b.equals(gVar.mo23408b());
        }
    }

    public final int hashCode() {
        return ((this.f50715a.hashCode() ^ 1000003) * 1000003) ^ this.f50716b.hashCode();
    }

    public final String toString() {
        String obj = this.f50715a.toString();
        String obj2 = this.f50716b.toString();
        return "AwarenessRegistration{contextTriggerRequestContext=" + obj + ", contextTriggerNode=" + obj2 + "}";
    }
}
