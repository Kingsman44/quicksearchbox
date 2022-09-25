package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.e */
/* compiled from: PG */
final class C121416e extends C121422k {

    /* renamed from: a */
    private final Object f337068a;

    /* renamed from: b */
    private final Integer f337069b;

    public C121416e(Object obj, Integer num) {
        if (obj != null) {
            this.f337068a = obj;
            this.f337069b = num;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final Integer mo105130a() {
        return this.f337069b;
    }

    /* renamed from: b */
    public final Object mo105131b() {
        return this.f337068a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121422k) {
            C121422k kVar = (C121422k) obj;
            return this.f337068a.equals(kVar.mo105131b()) && this.f337069b.equals(kVar.mo105130a());
        }
    }

    public final int hashCode() {
        return ((this.f337068a.hashCode() ^ 1000003) * 1000003) ^ this.f337069b.hashCode();
    }

    public final String toString() {
        String obj = this.f337068a.toString();
        Integer num = this.f337069b;
        return "TypeMax{type=" + obj + ", maxValue=" + num + "}";
    }
}
