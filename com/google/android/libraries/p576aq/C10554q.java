package com.google.android.libraries.p576aq;

/* renamed from: com.google.android.libraries.aq.q */
/* compiled from: PG */
public final class C10554q extends C10563z {

    /* renamed from: a */
    private final Object f35319a;

    public C10554q(Object obj) {
        if (obj != null) {
            this.f35319a = obj;
            return;
        }
        throw new IllegalArgumentException("Cannot create a constant with a null value");
    }

    /* renamed from: a */
    public final Object mo18594a() {
        return this.f35319a;
    }

    public final boolean equals(Object obj) {
        if (m25522r(this.f35319a)) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f35319a.equals(((C10554q) obj).f35319a);
    }

    public final int hashCode() {
        if (m25522r(this.f35319a)) {
            return super.hashCode();
        }
        return this.f35319a.hashCode();
    }
}
