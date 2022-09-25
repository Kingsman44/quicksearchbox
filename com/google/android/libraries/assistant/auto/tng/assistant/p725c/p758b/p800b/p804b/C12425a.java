package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.b.a */
/* compiled from: PG */
public final class C12425a extends C12431e {

    /* renamed from: a */
    public final C12093d f39286a;

    /* renamed from: b */
    public final C12986d f39287b;

    /* renamed from: c */
    public final C60870cx f39288c;

    public C12425a(C12093d dVar, C12986d dVar2, C60870cx cxVar) {
        this.f39286a = dVar;
        this.f39287b = dVar2;
        this.f39288c = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20595a() {
        return this.f39286a;
    }

    /* renamed from: b */
    public final C12986d mo20596b() {
        return this.f39287b;
    }

    /* renamed from: c */
    public final C60870cx mo20597c() {
        return this.f39288c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12431e) {
            C12431e eVar = (C12431e) obj;
            return this.f39286a.equals(eVar.mo20595a()) && this.f39287b.equals(eVar.mo20596b()) && this.f39288c.equals(eVar.mo20597c());
        }
    }

    public final int hashCode() {
        return ((((this.f39286a.hashCode() ^ 1000003) * 1000003) ^ this.f39287b.hashCode()) * 1000003) ^ this.f39288c.hashCode();
    }

    public final String toString() {
        String obj = this.f39286a.toString();
        String obj2 = this.f39287b.toString();
        String obj3 = this.f39288c.toString();
        return "InteractionParams{audioClient=" + obj + ", request=" + obj2 + ", lastInteractionState=" + obj3 + "}";
    }
}
