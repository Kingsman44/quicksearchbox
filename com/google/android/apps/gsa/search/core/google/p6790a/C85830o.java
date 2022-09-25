package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.o */
/* compiled from: PG */
final class C85830o extends C85814bf {

    /* renamed from: a */
    public final C51331dt f232077a;

    /* renamed from: b */
    public final Long f232078b;

    public C85830o(C51331dt dtVar, Long l) {
        this.f232077a = dtVar;
        this.f232078b = l;
    }

    /* renamed from: a */
    public final C51331dt mo79461a() {
        return this.f232077a;
    }

    /* renamed from: b */
    public final Long mo79462b() {
        return this.f232078b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C85814bf) {
            C85814bf bfVar = (C85814bf) obj;
            return this.f232077a.equals(bfVar.mo79461a()) && this.f232078b.equals(bfVar.mo79462b());
        }
    }

    public final int hashCode() {
        return ((this.f232077a.hashCode() ^ 1000003) * 1000003) ^ this.f232078b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f232077a.f133647e);
        Long l = this.f232078b;
        return "SavedTriggerTrustLevel{triggerTrustLevel=" + num + ", triggerTrustLevelTime=" + l + "}";
    }
}
