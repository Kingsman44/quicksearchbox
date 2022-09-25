package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.common.b.hz */
/* compiled from: PG */
public abstract class C58517hz extends C58519ia implements C58692ol {

    /* renamed from: a */
    private transient C58485gu f156162a;

    /* renamed from: b */
    private transient C58528ij f156163b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: c */
    public abstract C58528ij mo55460c();

    public boolean contains(Object obj) {
        return mo54932lv(obj) > 0;
    }

    @Deprecated
    /* renamed from: d */
    public final int mo54924d(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract C58691ok mo55461e(int i);

    public final boolean equals(Object obj) {
        return C58700ot.m90438b(this, obj);
    }

    /* renamed from: f */
    public final C58528ij mo54975m() {
        C58528ij ijVar = this.f156163b;
        if (ijVar == null) {
            if (isEmpty()) {
                ijVar = C58733pz.f156496a;
            } else {
                ijVar = new C58515hx(this);
            }
            this.f156163b = ijVar;
        }
        return ijVar;
    }

    @Deprecated
    /* renamed from: h */
    public final void mo54928h(Object obj, int i) {
        throw null;
    }

    public final int hashCode() {
        return C58758qx.m90643a(mo54975m());
    }

    @Deprecated
    /* renamed from: i */
    public final boolean mo54929i(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ Set mo54974l() {
        throw null;
    }

    /* renamed from: lA */
    public final C58800sl iterator() {
        return new C58513hv(mo54975m().iterator());
    }

    @Deprecated
    /* renamed from: lF */
    public final int mo54931lF(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return mo54975m().toString();
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        C58485gu guVar = this.f156162a;
        if (guVar != null) {
            return guVar;
        }
        C58485gu u = super.mo55229u();
        this.f156162a = u;
        return u;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        C58800sl lA = mo54975m().iterator();
        while (lA.hasNext()) {
            C58691ok okVar = (C58691ok) lA.next();
            Arrays.fill(objArr, i, okVar.mo55767a() + i, okVar.mo55768b());
            i += okVar.mo55767a();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public abstract Object writeReplace();
}
