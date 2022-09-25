package androidx.p054b.p055a.p057b;

import java.util.Iterator;

/* renamed from: androidx.b.a.b.f */
/* compiled from: PG */
abstract class C0892f extends C0893g implements Iterator {

    /* renamed from: a */
    C0890d f2972a;

    /* renamed from: b */
    C0890d f2973b;

    public C0892f(C0890d dVar, C0890d dVar2) {
        this.f2972a = dVar2;
        this.f2973b = dVar;
    }

    /* renamed from: c */
    private final C0890d m2780c() {
        C0890d dVar = this.f2973b;
        C0890d dVar2 = this.f2972a;
        if (dVar == dVar2 || dVar2 == null) {
            return null;
        }
        return mo3500b(dVar);
    }

    /* renamed from: a */
    public abstract C0890d mo3499a(C0890d dVar);

    /* renamed from: b */
    public abstract C0890d mo3500b(C0890d dVar);

    /* renamed from: eK */
    public final void mo3508eK(C0890d dVar) {
        if (this.f2972a == dVar && dVar == this.f2973b) {
            this.f2973b = null;
            this.f2972a = null;
        }
        C0890d dVar2 = this.f2972a;
        if (dVar2 == dVar) {
            this.f2972a = mo3499a(dVar2);
        }
        if (this.f2973b == dVar) {
            this.f2973b = m2780c();
        }
    }

    public final boolean hasNext() {
        return this.f2973b != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C0890d dVar = this.f2973b;
        this.f2973b = m2780c();
        return dVar;
    }
}
