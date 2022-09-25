package androidx.p054b.p055a.p057b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.b.a.b.e */
/* compiled from: PG */
public final class C0891e extends C0893g implements Iterator {

    /* renamed from: a */
    final /* synthetic */ C0894h f2969a;

    /* renamed from: b */
    private C0890d f2970b;

    /* renamed from: c */
    private boolean f2971c = true;

    public C0891e(C0894h hVar) {
        this.f2969a = hVar;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        C0890d dVar;
        if (this.f2971c) {
            this.f2971c = false;
            dVar = this.f2969a.f2974b;
        } else {
            C0890d dVar2 = this.f2970b;
            dVar = dVar2 != null ? dVar2.f2967c : null;
        }
        this.f2970b = dVar;
        return this.f2970b;
    }

    /* renamed from: eK */
    public final void mo3508eK(C0890d dVar) {
        C0890d dVar2 = this.f2970b;
        if (dVar == dVar2) {
            C0890d dVar3 = dVar2.f2968d;
            this.f2970b = dVar3;
            this.f2971c = dVar3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.f2971c) {
            return this.f2969a.f2974b != null;
        }
        C0890d dVar = this.f2970b;
        return (dVar == null || dVar.f2967c == null) ? false : true;
    }
}
