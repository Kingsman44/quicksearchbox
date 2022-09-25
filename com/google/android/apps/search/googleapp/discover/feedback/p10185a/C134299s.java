package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.s */
/* compiled from: PG */
public final class C134299s extends C134295o {

    /* renamed from: a */
    public final Instant f365818a;

    /* renamed from: b */
    private final String f365819b;

    /* renamed from: c */
    private final C134296p f365820c;

    public C134299s(String str, C134296p pVar, Instant instant) {
        C69664n.m101061g(pVar, "sensitivity");
        C69664n.m101061g(instant, "value");
        this.f365819b = str;
        this.f365820c = pVar;
        this.f365818a = instant;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365820c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365819b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134299s)) {
            return false;
        }
        C134299s sVar = (C134299s) obj;
        return C69664n.m101066l(this.f365819b, sVar.f365819b) && this.f365820c == sVar.f365820c && C69664n.m101066l(this.f365818a, sVar.f365818a);
    }

    public final int hashCode() {
        return (((this.f365819b.hashCode() * 31) + this.f365820c.hashCode()) * 31) + this.f365818a.hashCode();
    }

    public final String toString() {
        String str = this.f365819b;
        C134296p pVar = this.f365820c;
        Instant instant = this.f365818a;
        return "TimestampFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + instant + ")";
    }
}
