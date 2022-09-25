package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.a.a */
/* compiled from: PG */
public final class C12316a extends C12323c {

    /* renamed from: a */
    private final C60870cx f39118a;

    /* renamed from: b */
    private final C60870cx f39119b;

    /* renamed from: c */
    private final C12991i f39120c;

    public C12316a(C60870cx cxVar, C60870cx cxVar2, C12991i iVar) {
        this.f39118a = cxVar;
        this.f39119b = cxVar2;
        this.f39120c = iVar;
    }

    /* renamed from: a */
    public final C12991i mo20542a() {
        return this.f39120c;
    }

    /* renamed from: b */
    public final C60870cx mo20543b() {
        return this.f39118a;
    }

    /* renamed from: c */
    public final C60870cx mo20544c() {
        return this.f39119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12323c) {
            C12323c cVar = (C12323c) obj;
            return this.f39118a.equals(cVar.mo20543b()) && this.f39119b.equals(cVar.mo20544c()) && this.f39120c.equals(cVar.mo20542a());
        }
    }

    public final int hashCode() {
        return ((((this.f39118a.hashCode() ^ 1000003) * 1000003) ^ this.f39119b.hashCode()) * 1000003) ^ this.f39120c.hashCode();
    }

    public final String toString() {
        String obj = this.f39118a.toString();
        String obj2 = this.f39119b.toString();
        String obj3 = this.f39120c.toString();
        return "HybridVoiceRequestParams{audioInputData=" + obj + ", conversationDelta=" + obj2 + ", assistantRequestConfig=" + obj3 + "}";
    }
}
