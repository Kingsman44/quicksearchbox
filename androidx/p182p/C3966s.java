package androidx.p182p;

import androidx.p186q.p187a.C4057l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.s */
/* compiled from: PG */
public abstract class C3966s extends C3933ap {
    public C3966s(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public abstract void mo8306a(C4057l lVar, Object obj);

    /* renamed from: b */
    public final void mo8307b(Iterable iterable) {
        C69664n.m101061g(iterable, "entities");
        C4057l d = mo8212d();
        try {
            for (Object a : iterable) {
                mo8306a(d, a);
                d.mo8257b();
            }
        } finally {
            mo8215g(d);
        }
    }

    /* renamed from: c */
    public final void mo8308c(Object obj) {
        C4057l d = mo8212d();
        try {
            mo8306a(d, obj);
            d.mo8257b();
        } finally {
            mo8215g(d);
        }
    }
}
