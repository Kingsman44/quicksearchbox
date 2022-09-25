package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.b */
/* compiled from: PG */
final class C12609b extends C12612e {

    /* renamed from: a */
    private final C12093d f39581a;

    /* renamed from: b */
    private final C12991i f39582b;

    /* renamed from: c */
    private final C13023ak f39583c;

    /* renamed from: d */
    private final C60870cx f39584d;

    public C12609b(C12093d dVar, C12991i iVar, C13023ak akVar, C60870cx cxVar) {
        this.f39581a = dVar;
        this.f39582b = iVar;
        this.f39583c = akVar;
        this.f39584d = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20675a() {
        return this.f39581a;
    }

    /* renamed from: b */
    public final C12991i mo20676b() {
        return this.f39582b;
    }

    /* renamed from: c */
    public final C13023ak mo20677c() {
        return this.f39583c;
    }

    /* renamed from: d */
    public final C60870cx mo20678d() {
        return this.f39584d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12612e) {
            C12612e eVar = (C12612e) obj;
            return this.f39581a.equals(eVar.mo20675a()) && this.f39582b.equals(eVar.mo20676b()) && this.f39583c.equals(eVar.mo20677c()) && this.f39584d.equals(eVar.mo20678d());
        }
    }

    public final int hashCode() {
        return ((((((this.f39581a.hashCode() ^ 1000003) * 1000003) ^ this.f39582b.hashCode()) * 1000003) ^ this.f39583c.hashCode()) * 1000003) ^ this.f39584d.hashCode();
    }

    public final String toString() {
        String obj = this.f39581a.toString();
        String obj2 = this.f39582b.toString();
        String obj3 = this.f39583c.toString();
        String obj4 = this.f39584d.toString();
        return "TextInteractionParams{audioClient=" + obj + ", assistantRequestConfig=" + obj2 + ", textInputParams=" + obj3 + ", lastInteractionState=" + obj4 + "}";
    }
}
