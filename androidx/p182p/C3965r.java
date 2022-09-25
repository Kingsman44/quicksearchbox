package androidx.p182p;

import androidx.p186q.p187a.C4057l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.r */
/* compiled from: PG */
public abstract class C3965r extends C3933ap {
    public C3965r(C3925ah ahVar) {
        super(ahVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8303a(C4057l lVar, Object obj);

    /* renamed from: b */
    public final void mo8304b(Object obj) {
        C4057l d = mo8212d();
        try {
            mo8303a(d, obj);
            d.mo8256a();
        } finally {
            mo8215g(d);
        }
    }

    /* renamed from: c */
    public final void mo8305c(Iterable iterable) {
        C69664n.m101061g(iterable, "entities");
        C4057l d = mo8212d();
        try {
            for (Object a : iterable) {
                mo8303a(d, a);
                d.mo8256a();
            }
        } finally {
            mo8215g(d);
        }
    }
}
