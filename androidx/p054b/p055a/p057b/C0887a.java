package androidx.p054b.p055a.p057b;

import java.util.HashMap;

/* renamed from: androidx.b.a.b.a */
/* compiled from: PG */
public final class C0887a extends C0894h {

    /* renamed from: a */
    public final HashMap f2964a = new HashMap();

    /* renamed from: a */
    public final C0890d mo3497a(Object obj) {
        return (C0890d) this.f2964a.get(obj);
    }

    /* renamed from: b */
    public final Object mo3498b(Object obj) {
        Object b = super.mo3498b(obj);
        this.f2964a.remove(obj);
        return b;
    }
}
