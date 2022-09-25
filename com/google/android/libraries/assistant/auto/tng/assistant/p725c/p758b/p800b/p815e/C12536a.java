package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a */
/* compiled from: PG */
public final class C12536a extends C12581c {

    /* renamed from: a */
    private final C12093d f39470a;

    /* renamed from: b */
    private final C12991i f39471b;

    /* renamed from: c */
    private final C16330ad f39472c;

    /* renamed from: d */
    private final C60870cx f39473d;

    public C12536a(C12093d dVar, C12991i iVar, C16330ad adVar, C60870cx cxVar) {
        this.f39470a = dVar;
        this.f39471b = iVar;
        this.f39472c = adVar;
        this.f39473d = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20648a() {
        return this.f39470a;
    }

    /* renamed from: b */
    public final C12991i mo20649b() {
        return this.f39471b;
    }

    /* renamed from: c */
    public final C16330ad mo20650c() {
        return this.f39472c;
    }

    /* renamed from: d */
    public final C60870cx mo20651d() {
        return this.f39473d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12581c) {
            C12581c cVar = (C12581c) obj;
            return this.f39470a.equals(cVar.mo20648a()) && this.f39471b.equals(cVar.mo20649b()) && this.f39472c.equals(cVar.mo20650c()) && this.f39473d.equals(cVar.mo20651d());
        }
    }

    public final int hashCode() {
        return ((((((this.f39470a.hashCode() ^ 1000003) * 1000003) ^ this.f39471b.hashCode()) * 1000003) ^ this.f39472c.hashCode()) * 1000003) ^ this.f39473d.hashCode();
    }

    public final String toString() {
        String obj = this.f39470a.toString();
        String obj2 = this.f39471b.toString();
        String obj3 = this.f39472c.toString();
        String obj4 = this.f39473d.toString();
        return "SuggestionInteractionParams{audioClient=" + obj + ", assistantRequestConfig=" + obj2 + ", actionFulfillmentData=" + obj3 + ", lastInteractionState=" + obj4 + "}";
    }
}
