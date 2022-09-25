package com.google.android.libraries.gsa.conversation.p1851e;

/* renamed from: com.google.android.libraries.gsa.conversation.e.a */
/* compiled from: PG */
final class C22562a extends C22564c {

    /* renamed from: a */
    private final String f62195a;

    /* renamed from: b */
    private final Object f62196b;

    public C22562a(String str, Object obj) {
        this.f62195a = str;
        this.f62196b = obj;
    }

    /* renamed from: a */
    public final Object mo27650a() {
        return this.f62196b;
    }

    /* renamed from: b */
    public final String mo27651b() {
        return this.f62195a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22564c) {
            C22564c cVar = (C22564c) obj;
            String str = this.f62195a;
            if (str != null ? str.equals(cVar.mo27651b()) : cVar.mo27651b() == null) {
                if (this.f62196b.equals(cVar.mo27650a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f62195a;
        Object obj = this.f62196b;
        return "Node{id=" + str + ", value=" + ((String) obj) + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f62195a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f62196b.hashCode();
    }
}
