package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.common.b.si */
/* compiled from: PG */
public final class C58797si extends C58324av implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient C58795sg header;
    public final transient C58447fj range;
    public final transient C58796sh rootReference;

    public C58797si(C58796sh shVar, C58447fj fjVar, C58795sg sgVar) {
        super(fjVar.f156047a);
        this.rootReference = shVar;
        this.range = fjVar;
        this.header = sgVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C58742qh.m90622a(C58324av.class, "comparator").mo55857b(this, comparator);
        Class<C58797si> cls = C58797si.class;
        C58742qh.m90622a(cls, "range").mo55857b(this, C58447fj.m89717a(comparator));
        C58742qh.m90622a(cls, "rootReference").mo55857b(this, new C58796sh());
        C58795sg sgVar = new C58795sg();
        C58742qh.m90622a(cls, "header").mo55857b(this, sgVar);
        sgVar.f156583h = sgVar;
        sgVar.f156582g = sgVar;
        C58742qh.m90625d(this, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: u */
    static int m90763u(C58795sg sgVar) {
        if (sgVar == null) {
            return 0;
        }
        return sgVar.f156578c;
    }

    /* renamed from: v */
    private final long m90764v(int i, C58795sg sgVar) {
        long b;
        long v;
        if (sgVar == null) {
            return 0;
        }
        int compare = this.comparator.compare(this.range.f156051e, sgVar.f156576a);
        if (compare > 0) {
            return m90764v(i, sgVar.f156581f);
        }
        if (compare != 0) {
            b = C58794sf.m90741b(i, sgVar.f156581f) + ((long) C58794sf.m90740a(i, sgVar));
            v = m90764v(i, sgVar.f156580e);
        } else if (this.range.f156053g - 1 != 0) {
            return C58794sf.m90741b(i, sgVar.f156581f);
        } else {
            b = (long) C58794sf.m90740a(i, sgVar);
            v = C58794sf.m90741b(i, sgVar.f156581f);
        }
        return b + v;
    }

    /* renamed from: w */
    private final long m90765w(int i, C58795sg sgVar) {
        long b;
        long w;
        if (sgVar == null) {
            return 0;
        }
        int compare = this.comparator.compare(this.range.f156049c, sgVar.f156576a);
        if (compare < 0) {
            return m90765w(i, sgVar.f156580e);
        }
        if (compare != 0) {
            b = C58794sf.m90741b(i, sgVar.f156580e) + ((long) C58794sf.m90740a(i, sgVar));
            w = m90765w(i, sgVar.f156581f);
        } else if (this.range.f156052f - 1 != 0) {
            return C58794sf.m90741b(i, sgVar.f156580e);
        } else {
            b = (long) C58794sf.m90740a(i, sgVar);
            w = C58794sf.m90741b(i, sgVar.f156580e);
        }
        return b + w;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo54997s().comparator());
        C58742qh.m90628g(this, objectOutputStream);
    }

    /* renamed from: x */
    private final long m90766x(int i) {
        C58795sg sgVar = (C58795sg) this.rootReference.f156585a;
        long b = C58794sf.m90741b(i, sgVar);
        if (this.range.f156048b) {
            b -= m90765w(i, sgVar);
        }
        return this.range.f156050d ? b - m90764v(i, sgVar) : b;
    }

    /* renamed from: c */
    public final int mo54922c() {
        return C60757n.m92748i(m90766x(2));
    }

    /* renamed from: d */
    public final int mo54924d(Object obj, int i) {
        Object obj2 = this.rootReference.f156585a;
        int[] iArr = new int[1];
        try {
            if (this.range.mo55303c(obj) && obj2 != null) {
                this.rootReference.mo56018a(obj2, ((C58795sg) obj2).mo56013f(this.comparator, obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* renamed from: e */
    public final Iterator mo54925e() {
        return new C58693om(new C58792sd(this));
    }

    /* renamed from: f */
    public final Iterator mo54926f() {
        return new C58792sd(this);
    }

    /* renamed from: h */
    public final void mo54928h(Object obj, int i) {
        Object obj2;
        if (this.range.mo55303c(obj) && (obj2 = this.rootReference.f156585a) != null) {
            C58795sg sgVar = (C58795sg) obj2;
            this.rootReference.mo56018a(obj2, sgVar.mo56016i(this.comparator, obj, new int[1]));
        }
    }

    /* renamed from: i */
    public final boolean mo54929i(Object obj, int i) {
        C58371co.m89408c(i, "oldCount");
        C58838bb.m90868c(this.range.mo55303c(obj));
        Object obj2 = this.rootReference.f156585a;
        if (obj2 == null) {
            return i == 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo56018a(obj2, ((C58795sg) obj2).mo56015h(this.comparator, obj, i, iArr));
        return iArr[0] == i;
    }

    public final Iterator iterator() {
        return C58700ot.m90437a(this);
    }

    /* renamed from: lF */
    public final int mo54931lF(Object obj, int i) {
        C58371co.m89408c(i, "occurrences");
        if (i == 0) {
            return mo54932lv(obj);
        }
        C58838bb.m90868c(this.range.mo55303c(obj));
        Object obj2 = this.rootReference.f156585a;
        if (obj2 == null) {
            this.comparator.compare(obj, obj);
            C58795sg sgVar = new C58795sg(obj, i);
            C58795sg sgVar2 = this.header;
            sgVar2.f156583h = sgVar;
            sgVar.f156582g = sgVar2;
            sgVar.f156583h = sgVar2;
            sgVar2.f156582g = sgVar;
            this.rootReference.mo56018a((Object) null, sgVar);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo56018a(obj2, ((C58795sg) obj2).mo56009b(this.comparator, obj, i, iArr));
        return iArr[0];
    }

    /* renamed from: lv */
    public final int mo54932lv(Object obj) {
        try {
            Object obj2 = this.rootReference.f156585a;
            if (this.range.mo55303c(obj) && obj2 != null) {
                return ((C58795sg) obj2).mo56008a(this.comparator, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* renamed from: lw */
    public final C58765rd mo55218lw(Object obj, int i) {
        return new C58797si(this.rootReference, this.range.mo55302b(new C58447fj(this.comparator, false, (Object) null, 1, true, obj, i)), this.header);
    }

    /* renamed from: lx */
    public final C58765rd mo55219lx(Object obj, int i) {
        return new C58797si(this.rootReference, this.range.mo55302b(new C58447fj(this.comparator, true, obj, i, false, (Object) null, 1)), this.header);
    }

    /* renamed from: r */
    public final Iterator mo54996r() {
        return new C58793se(this);
    }

    public final int size() {
        return C60757n.m92748i(m90766x(1));
    }

    public C58797si(Comparator comparator) {
        super(comparator);
        this.range = C58447fj.m89717a(comparator);
        C58795sg sgVar = new C58795sg();
        this.header = sgVar;
        sgVar.f156583h = sgVar;
        sgVar.f156582g = sgVar;
        this.rootReference = new C58796sh();
    }

    public final void clear() {
        C58447fj fjVar = this.range;
        if (fjVar.f156048b || fjVar.f156050d) {
            C58570jy.m90162n(new C58792sd(this));
            return;
        }
        C58795sg g = this.header.mo56014g();
        while (true) {
            C58795sg sgVar = this.header;
            if (g != sgVar) {
                C58795sg g2 = g.mo56014g();
                g.f156577b = 0;
                g.f156580e = null;
                g.f156581f = null;
                g.f156582g = null;
                g.f156583h = null;
                g = g2;
            } else {
                sgVar.f156583h = sgVar;
                sgVar.f156582g = sgVar;
                this.rootReference.f156585a = null;
                return;
            }
        }
    }
}
