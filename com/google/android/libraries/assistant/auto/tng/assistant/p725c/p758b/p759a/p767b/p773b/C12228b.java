package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b */
/* compiled from: PG */
final class C12228b extends C12280e {

    /* renamed from: a */
    private final C60870cx f38965a;

    /* renamed from: b */
    private final C60870cx f38966b;

    /* renamed from: c */
    private final C12991i f38967c;

    public C12228b(C60870cx cxVar, C60870cx cxVar2, C12991i iVar) {
        this.f38965a = cxVar;
        this.f38966b = cxVar2;
        this.f38967c = iVar;
    }

    /* renamed from: a */
    public final C12991i mo20503a() {
        return this.f38967c;
    }

    /* renamed from: b */
    public final C60870cx mo20504b() {
        return this.f38966b;
    }

    /* renamed from: c */
    public final C60870cx mo20505c() {
        return this.f38965a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12280e) {
            C12280e eVar = (C12280e) obj;
            return this.f38965a.equals(eVar.mo20505c()) && this.f38966b.equals(eVar.mo20504b()) && this.f38967c.equals(eVar.mo20503a());
        }
    }

    public final int hashCode() {
        return ((((this.f38965a.hashCode() ^ 1000003) * 1000003) ^ this.f38966b.hashCode()) * 1000003) ^ this.f38967c.hashCode();
    }

    public final String toString() {
        String obj = this.f38965a.toString();
        String obj2 = this.f38966b.toString();
        String obj3 = this.f38967c.toString();
        return "OfflineTextRequestParams{queryTextData=" + obj + ", conversationDelta=" + obj2 + ", assistantRequestConfig=" + obj3 + "}";
    }
}
