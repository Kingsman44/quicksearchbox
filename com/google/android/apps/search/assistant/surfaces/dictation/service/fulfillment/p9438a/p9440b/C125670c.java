package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.c */
/* compiled from: PG */
public final class C125670c extends C125693z {

    /* renamed from: a */
    public final C125666as f346347a;

    /* renamed from: b */
    public final String f346348b;

    public C125670c(C125666as asVar, String str) {
        this.f346347a = asVar;
        this.f346348b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125670c)) {
            return false;
        }
        C125670c cVar = (C125670c) obj;
        return this.f346347a == cVar.f346347a && C69664n.m101066l(this.f346348b, cVar.f346348b);
    }

    public final int hashCode() {
        return (this.f346347a.hashCode() * 31) + this.f346348b.hashCode();
    }

    public final String toString() {
        C125666as asVar = this.f346347a;
        String str = this.f346348b;
        return "AppendToField(field=" + asVar + ", value=" + str + ")";
    }
}
