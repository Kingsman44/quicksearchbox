package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.b */
/* compiled from: PG */
final class C12476b extends C12479e {

    /* renamed from: a */
    public final C12093d f39371a;

    /* renamed from: b */
    public final C12991i f39372b;

    /* renamed from: c */
    public final C13068n f39373c;

    /* renamed from: d */
    public final C60870cx f39374d;

    public C12476b(C12093d dVar, C12991i iVar, C13068n nVar, C60870cx cxVar) {
        this.f39371a = dVar;
        this.f39372b = iVar;
        this.f39373c = nVar;
        this.f39374d = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20621a() {
        return this.f39371a;
    }

    /* renamed from: b */
    public final C12478d mo20622b() {
        return new C12435a(this);
    }

    /* renamed from: c */
    public final C12991i mo20623c() {
        return this.f39372b;
    }

    /* renamed from: d */
    public final C13068n mo20624d() {
        return this.f39373c;
    }

    /* renamed from: e */
    public final C60870cx mo20625e() {
        return this.f39374d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12479e) {
            C12479e eVar = (C12479e) obj;
            return this.f39371a.equals(eVar.mo20621a()) && this.f39372b.equals(eVar.mo20623c()) && this.f39373c.equals(eVar.mo20624d()) && this.f39374d.equals(eVar.mo20625e());
        }
    }

    public final int hashCode() {
        return ((((((this.f39371a.hashCode() ^ 1000003) * 1000003) ^ this.f39372b.hashCode()) * 1000003) ^ this.f39373c.hashCode()) * 1000003) ^ this.f39374d.hashCode();
    }

    public final String toString() {
        String obj = this.f39371a.toString();
        String obj2 = this.f39372b.toString();
        String obj3 = this.f39373c.toString();
        String obj4 = this.f39374d.toString();
        return "MessageInteractionParams{audioClient=" + obj + ", assistantRequestConfig=" + obj2 + ", messageInputParams=" + obj3 + ", lastInteractionState=" + obj4 + "}";
    }
}
