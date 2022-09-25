package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ou */
/* compiled from: PG */
public final class C58701ou extends C58710pc implements Serializable {

    /* renamed from: a */
    public static final C58701ou f156429a = new C58701ou();
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private transient C58710pc f156430b;

    /* renamed from: c */
    private transient C58710pc f156431c;

    private C58701ou() {
    }

    private Object readResolve() {
        return f156429a;
    }

    /* renamed from: b */
    public final C58710pc mo55782b() {
        C58710pc pcVar = this.f156431c;
        if (pcVar != null) {
            return pcVar;
        }
        C58703ow owVar = new C58703ow(this);
        this.f156431c = owVar;
        return owVar;
    }

    /* renamed from: c */
    public final C58710pc mo55783c() {
        return C58739qe.f156510a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    /* renamed from: lC */
    public final C58710pc mo55784lC() {
        C58710pc pcVar = this.f156430b;
        if (pcVar != null) {
            return pcVar;
        }
        C58702ov ovVar = new C58702ov(this);
        this.f156430b = ovVar;
        return ovVar;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
