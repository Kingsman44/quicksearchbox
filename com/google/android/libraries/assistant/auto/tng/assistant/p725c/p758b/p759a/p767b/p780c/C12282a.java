package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.a */
/* compiled from: PG */
public final class C12282a extends C12314c {

    /* renamed from: a */
    private final C60870cx f39064a;

    /* renamed from: b */
    private final C60870cx f39065b;

    /* renamed from: c */
    private final C12991i f39066c;

    public C12282a(C60870cx cxVar, C60870cx cxVar2, C12991i iVar) {
        this.f39064a = cxVar;
        this.f39065b = cxVar2;
        this.f39066c = iVar;
    }

    /* renamed from: a */
    public final C12991i mo20526a() {
        return this.f39066c;
    }

    /* renamed from: b */
    public final C60870cx mo20527b() {
        return this.f39065b;
    }

    /* renamed from: c */
    public final C60870cx mo20528c() {
        return this.f39064a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12314c) {
            C12314c cVar = (C12314c) obj;
            return this.f39064a.equals(cVar.mo20528c()) && this.f39065b.equals(cVar.mo20527b()) && this.f39066c.equals(cVar.mo20526a());
        }
    }

    public final int hashCode() {
        return ((((this.f39064a.hashCode() ^ 1000003) * 1000003) ^ this.f39065b.hashCode()) * 1000003) ^ this.f39066c.hashCode();
    }

    public final String toString() {
        String obj = this.f39064a.toString();
        String obj2 = this.f39065b.toString();
        String obj3 = this.f39066c.toString();
        return "OnlineTextRequestParams{queryTextData=" + obj + ", conversationDelta=" + obj2 + ", assistantRequestConfig=" + obj3 + "}";
    }
}
