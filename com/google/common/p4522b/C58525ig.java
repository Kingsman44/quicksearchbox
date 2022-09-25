package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* renamed from: com.google.common.b.ig */
/* compiled from: PG */
public final class C58525ig extends C58320ar implements Serializable {

    /* renamed from: a */
    public static final C58525ig f156172a = new C58525ig(C58485gu.m89845m());

    /* renamed from: b */
    public static final C58525ig f156173b = new C58525ig(C58485gu.m89846n(C58714pg.f156455a));

    /* renamed from: c */
    public final transient C58485gu f156174c;

    public C58525ig(C58485gu guVar) {
        this.f156174c = guVar;
    }

    /* renamed from: c */
    public static C58523ie m89992c() {
        return new C58523ie();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo54980a(C58714pg pgVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo54981b() {
        return this.f156174c.isEmpty();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Set mo55484d() {
        if (this.f156174c.isEmpty()) {
            return C58733pz.f156496a;
        }
        return new C58735qa(this.f156174c, C58714pg.m90501d());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58524if(this.f156174c);
    }
}
