package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a */
/* compiled from: PG */
public final class C12324a extends C12391c {

    /* renamed from: a */
    private final C60870cx f39131a;

    /* renamed from: b */
    private final C60870cx f39132b;

    /* renamed from: c */
    private final C12991i f39133c;

    public C12324a(C60870cx cxVar, C60870cx cxVar2, C12991i iVar) {
        this.f39131a = cxVar;
        this.f39132b = cxVar2;
        this.f39133c = iVar;
    }

    /* renamed from: a */
    public final C12991i mo20549a() {
        return this.f39133c;
    }

    /* renamed from: b */
    public final C60870cx mo20550b() {
        return this.f39131a;
    }

    /* renamed from: c */
    public final C60870cx mo20551c() {
        return this.f39132b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12391c) {
            C12391c cVar = (C12391c) obj;
            return this.f39131a.equals(cVar.mo20550b()) && this.f39132b.equals(cVar.mo20551c()) && this.f39133c.equals(cVar.mo20549a());
        }
    }

    public final int hashCode() {
        return ((((this.f39131a.hashCode() ^ 1000003) * 1000003) ^ this.f39132b.hashCode()) * 1000003) ^ this.f39133c.hashCode();
    }

    public final String toString() {
        String obj = this.f39131a.toString();
        String obj2 = this.f39132b.toString();
        String obj3 = this.f39133c.toString();
        return "OnlineVoiceRequestParams{audioInputData=" + obj + ", conversationDelta=" + obj2 + ", assistantRequestConfig=" + obj3 + "}";
    }
}
