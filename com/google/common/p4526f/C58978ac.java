package com.google.common.p4526f;

/* renamed from: com.google.common.f.ac */
/* compiled from: PG */
public final class C58978ac extends C59095o {

    /* renamed from: b */
    private final StackTraceElement f156834b;

    public C58978ac(StackTraceElement stackTraceElement) {
        this.f156834b = stackTraceElement;
    }

    /* renamed from: a */
    public final int mo56238a() {
        return Math.max(this.f156834b.getLineNumber(), 0);
    }

    /* renamed from: b */
    public final String mo56239b() {
        return this.f156834b.getClassName();
    }

    /* renamed from: c */
    public final String mo56240c() {
        return this.f156834b.getFileName();
    }

    /* renamed from: d */
    public final String mo56241d() {
        return this.f156834b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C58978ac) && this.f156834b.equals(((C58978ac) obj).f156834b);
    }

    public final int hashCode() {
        return this.f156834b.hashCode();
    }
}
