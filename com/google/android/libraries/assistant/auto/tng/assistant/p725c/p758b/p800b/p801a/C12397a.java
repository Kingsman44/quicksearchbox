package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p801a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13058d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.a.a */
/* compiled from: PG */
public final class C12397a extends C12424c {

    /* renamed from: a */
    public final C12991i f39252a;

    /* renamed from: b */
    private final C12093d f39253b;

    /* renamed from: c */
    private final C13058d f39254c;

    /* renamed from: d */
    private final C60870cx f39255d;

    public C12397a(C12093d dVar, C12991i iVar, C13058d dVar2, C60870cx cxVar) {
        this.f39253b = dVar;
        this.f39252a = iVar;
        this.f39254c = dVar2;
        this.f39255d = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20578a() {
        return this.f39253b;
    }

    /* renamed from: b */
    public final C12991i mo20579b() {
        return this.f39252a;
    }

    /* renamed from: c */
    public final C13058d mo20580c() {
        return this.f39254c;
    }

    /* renamed from: d */
    public final C60870cx mo20581d() {
        return this.f39255d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12424c) {
            C12424c cVar = (C12424c) obj;
            return this.f39253b.equals(cVar.mo20578a()) && this.f39252a.equals(cVar.mo20579b()) && this.f39254c.equals(cVar.mo20580c()) && this.f39255d.equals(cVar.mo20581d());
        }
    }

    public final int hashCode() {
        return ((((((this.f39253b.hashCode() ^ 1000003) * 1000003) ^ this.f39252a.hashCode()) * 1000003) ^ this.f39254c.hashCode()) * 1000003) ^ this.f39255d.hashCode();
    }

    public final String toString() {
        String obj = this.f39253b.toString();
        String obj2 = this.f39252a.toString();
        String obj3 = this.f39254c.toString();
        String obj4 = this.f39255d.toString();
        return "CallInteractionParams{audioClient=" + obj + ", assistantRequestConfig=" + obj2 + ", callInputParams=" + obj3 + ", lastInteractionState=" + obj4 + "}";
    }
}
