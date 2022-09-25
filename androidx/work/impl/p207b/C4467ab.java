package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;
import androidx.p186q.p187a.C4057l;

/* renamed from: androidx.work.impl.b.ab */
/* compiled from: PG */
public final class C4467ab implements C4515x {

    /* renamed from: a */
    private final C3925ah f14204a;

    /* renamed from: b */
    private final C3933ap f14205b;

    /* renamed from: c */
    private final C3933ap f14206c;

    public C4467ab(C3925ah ahVar) {
        this.f14204a = ahVar;
        new C4516y(ahVar);
        this.f14205b = new C4517z(ahVar);
        this.f14206c = new C4466aa(ahVar);
    }

    /* renamed from: a */
    public final void mo9405a(String str) {
        this.f14204a.mo8175S();
        C4057l d = this.f14205b.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14204a.mo8181p();
        try {
            d.mo8256a();
            this.f14204a.mo8188w();
        } finally {
            this.f14204a.mo8183r();
            this.f14205b.mo8215g(d);
        }
    }

    /* renamed from: b */
    public final void mo9406b() {
        this.f14204a.mo8175S();
        C4057l d = this.f14206c.mo8212d();
        this.f14204a.mo8181p();
        try {
            d.mo8256a();
            this.f14204a.mo8188w();
        } finally {
            this.f14204a.mo8183r();
            this.f14206c.mo8215g(d);
        }
    }
}
