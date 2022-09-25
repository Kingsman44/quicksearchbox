package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: com.google.common.b.ai */
/* compiled from: PG */
public abstract class C58311ai extends C58319aq implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public transient C58706oz f155881a = mo54927g();

    /* renamed from: b */
    transient long f155882b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.f155881a = mo54927g();
        C58742qh.m90625d(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58742qh.m90628g(this, objectOutputStream);
    }

    /* renamed from: c */
    public final int mo54922c() {
        return this.f155881a.f156439c;
    }

    public final void clear() {
        this.f155881a.mo55803l();
        this.f155882b = 0;
    }

    /* renamed from: d */
    public final int mo54924d(Object obj, int i) {
        int d = this.f155881a.mo55795d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.f155881a.mo55794c(d);
        if (c > i) {
            this.f155881a.mo55808q(d, c - i);
        } else {
            this.f155881a.mo55800i(d);
            i = c;
        }
        this.f155882b -= (long) i;
        return c;
    }

    /* renamed from: e */
    public final Iterator mo54925e() {
        return new C58308af(this);
    }

    /* renamed from: f */
    public final Iterator mo54926f() {
        return new C58309ag(this);
    }

    /* renamed from: g */
    public abstract C58706oz mo54927g();

    /* renamed from: h */
    public final void mo54928h(Object obj, int i) {
        C58371co.m89408c(i, "count");
        this.f155882b += (long) (i - (i == 0 ? this.f155881a.mo55799h(obj, C58462fy.m89758b(obj)) : this.f155881a.mo55798g(obj, i)));
    }

    /* renamed from: i */
    public final boolean mo54929i(Object obj, int i) {
        C58371co.m89408c(i, "oldCount");
        int d = this.f155881a.mo55795d(obj);
        if (d == -1) {
            return i == 0;
        }
        if (this.f155881a.mo55794c(d) != i) {
            return false;
        }
        this.f155881a.mo55800i(d);
        this.f155882b -= (long) i;
        return true;
    }

    public final Iterator iterator() {
        return C58700ot.m90437a(this);
    }

    /* renamed from: lF */
    public final int mo54931lF(Object obj, int i) {
        if (i == 0) {
            return this.f155881a.mo55793b(obj);
        }
        boolean z = true;
        C58838bb.m90871f(i > 0, "occurrences cannot be negative: %s", i);
        int d = this.f155881a.mo55795d(obj);
        if (d == -1) {
            this.f155881a.mo55798g(obj, i);
            this.f155882b += (long) i;
            return 0;
        }
        int c = this.f155881a.mo55794c(d);
        long j = (long) i;
        long j2 = ((long) c) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        C58838bb.m90872g(z, "too many occurrences: %s", j2);
        this.f155881a.mo55808q(d, (int) j2);
        this.f155882b += j;
        return c;
    }

    /* renamed from: lv */
    public final int mo54932lv(Object obj) {
        return this.f155881a.mo55793b(obj);
    }

    public final int size() {
        return C60757n.m92748i(this.f155882b);
    }
}
