package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b */
/* compiled from: PG */
public final class C33080b {

    /* renamed from: a */
    public final C52490tr f88559a;

    /* renamed from: b */
    public final C51953ff f88560b;

    /* renamed from: c */
    public final C51950fc f88561c;

    /* renamed from: d */
    public final Context f88562d;

    /* renamed from: e */
    public final C52091ex f88563e;

    public C33080b(C52490tr trVar, C51953ff ffVar, C51950fc fcVar, Context context, C52091ex exVar) {
        C69664n.m101061g(trVar, "fieldContent");
        C69664n.m101061g(ffVar, "showNativeFormArgs");
        C69664n.m101061g(fcVar, "theme");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(exVar, "conversationParams");
        this.f88559a = trVar;
        this.f88560b = ffVar;
        this.f88561c = fcVar;
        this.f88562d = context;
        this.f88563e = exVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33080b)) {
            return false;
        }
        C33080b bVar = (C33080b) obj;
        return C69664n.m101066l(this.f88559a, bVar.f88559a) && C69664n.m101066l(this.f88560b, bVar.f88560b) && this.f88561c == bVar.f88561c && C69664n.m101066l(this.f88562d, bVar.f88562d) && C69664n.m101066l(this.f88563e, bVar.f88563e);
    }

    public final int hashCode() {
        return (((((((this.f88559a.hashCode() * 31) + this.f88560b.hashCode()) * 31) + this.f88561c.hashCode()) * 31) + this.f88562d.hashCode()) * 31) + this.f88563e.hashCode();
    }

    public final String toString() {
        C52490tr trVar = this.f88559a;
        C51953ff ffVar = this.f88560b;
        C51950fc fcVar = this.f88561c;
        Context context = this.f88562d;
        C52091ex exVar = this.f88563e;
        return "FormState(fieldContent=" + trVar + ", showNativeFormArgs=" + ffVar + ", theme=" + fcVar + ", context=" + context + ", conversationParams=" + exVar + ")";
    }
}
