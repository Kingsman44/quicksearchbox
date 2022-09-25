package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.assistant.p4016z.C53691ap;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.b */
/* compiled from: PG */
final class C130614b extends C130656o {

    /* renamed from: a */
    private final C53691ap f357727a;

    /* renamed from: b */
    private final String f357728b;

    public C130614b(C53691ap apVar, String str) {
        if (apVar != null) {
            this.f357727a = apVar;
            if (str != null) {
                this.f357728b = str;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final C53691ap mo109757a() {
        return this.f357727a;
    }

    /* renamed from: b */
    public final String mo109758b() {
        return this.f357728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130656o) {
            C130656o oVar = (C130656o) obj;
            return this.f357727a.equals(oVar.mo109757a()) && this.f357728b.equals(oVar.mo109758b());
        }
    }

    public final int hashCode() {
        return ((this.f357727a.hashCode() ^ 1000003) * 1000003) ^ this.f357728b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f357727a.f140936l);
        String str = this.f357728b;
        return "PlaceTypeAndName{type=" + num + ", name=" + str + "}";
    }
}
