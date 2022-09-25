package com.google.common.p4526f;

/* renamed from: com.google.common.f.o */
/* compiled from: PG */
public abstract class C59095o implements C59096p {

    /* renamed from: a */
    public static final C59095o f157068a = new C59093m();

    /* renamed from: a */
    public abstract int mo56238a();

    /* renamed from: b */
    public abstract String mo56239b();

    /* renamed from: c */
    public abstract String mo56240c();

    /* renamed from: d */
    public abstract String mo56241d();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(mo56239b());
        sb.append(", method=");
        sb.append(mo56241d());
        sb.append(", line=");
        sb.append(mo56238a());
        if (mo56240c() != null) {
            sb.append(", file=");
            sb.append(mo56240c());
        }
        sb.append(" }");
        return sb.toString();
    }
}
