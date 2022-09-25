package com.google.p386ak;

import com.google.p386ak.p388b.C8337ak;

/* renamed from: com.google.ak.q */
/* compiled from: PG */
public final class C8401q extends C8398n {

    /* renamed from: a */
    public final C8337ak f29255a = new C8337ak(C8337ak.f29161a, false);

    /* renamed from: a */
    public final C8398n mo17166a(String str) {
        return (C8398n) this.f29255a.get(str);
    }

    /* renamed from: c */
    public final void mo17167c(String str, Boolean bool) {
        this.f29255a.put(str, new C8404t(bool));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C8401q) && ((C8401q) obj).f29255a.equals(this.f29255a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f29255a.hashCode();
    }

    /* renamed from: i */
    public final void mo17170i(String str, Number number) {
        this.f29255a.put(str, new C8404t(number));
    }

    /* renamed from: k */
    public final C8396l mo17172k() {
        return (C8396l) this.f29255a.get("key");
    }

    /* renamed from: j */
    public final void mo17171j(String str, String str2) {
        Object obj;
        if (str2 == null) {
            obj = C8400p.f29254a;
        } else {
            obj = new C8404t(str2);
        }
        this.f29255a.put(str, obj);
    }
}
