package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b */
/* compiled from: PG */
final class C12196b extends C12223e {

    /* renamed from: a */
    private final C60870cx f38909a;

    /* renamed from: b */
    private final C13023ak f38910b;

    /* renamed from: c */
    private final C60870cx f38911c;

    /* renamed from: d */
    private final C12991i f38912d;

    public C12196b(C60870cx cxVar, C13023ak akVar, C60870cx cxVar2, C12991i iVar) {
        this.f38909a = cxVar;
        this.f38910b = akVar;
        this.f38911c = cxVar2;
        this.f38912d = iVar;
    }

    /* renamed from: a */
    public final C12991i mo20486a() {
        return this.f38912d;
    }

    /* renamed from: b */
    public final C13023ak mo20487b() {
        return this.f38910b;
    }

    /* renamed from: c */
    public final C60870cx mo20488c() {
        return this.f38911c;
    }

    /* renamed from: d */
    public final C60870cx mo20489d() {
        return this.f38909a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12223e) {
            C12223e eVar = (C12223e) obj;
            return this.f38909a.equals(eVar.mo20489d()) && this.f38910b.equals(eVar.mo20487b()) && this.f38911c.equals(eVar.mo20488c()) && this.f38912d.equals(eVar.mo20486a());
        }
    }

    public final int hashCode() {
        return ((((((this.f38909a.hashCode() ^ 1000003) * 1000003) ^ this.f38910b.hashCode()) * 1000003) ^ this.f38911c.hashCode()) * 1000003) ^ this.f38912d.hashCode();
    }

    public final String toString() {
        String obj = this.f38909a.toString();
        String obj2 = this.f38910b.toString();
        String obj3 = this.f38911c.toString();
        String obj4 = this.f38912d.toString();
        return "HybridTextRequestParams{queryTextData=" + obj + ", textInputParams=" + obj2 + ", conversationDelta=" + obj3 + ", assistantRequestConfig=" + obj4 + "}";
    }
}
