package com.google.android.libraries.p576aq;

/* renamed from: com.google.android.libraries.aq.u */
/* compiled from: PG */
public final class C10558u extends C10563z {

    /* renamed from: a */
    private Object f35330a;

    public C10558u(Object obj) {
        if (obj != null) {
            this.f35330a = obj;
            return;
        }
        throw new IllegalArgumentException("initial value cannot be null");
    }

    /* renamed from: a */
    public final Object mo18594a() {
        return this.f35330a;
    }

    public final boolean equals(Object obj) {
        if (m25522r(this.f35330a)) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f35330a.equals(((C10558u) obj).f35330a);
    }

    /* renamed from: f */
    public final void mo18619f(Object obj) {
        m25521q();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot set a null value");
        } else if (!m25522r(obj) || !obj.equals(this.f35330a)) {
            this.f35330a = obj;
            mo18625p();
        }
    }

    public final int hashCode() {
        if (m25522r(this.f35330a)) {
            return super.hashCode();
        }
        return this.f35330a.hashCode();
    }
}
