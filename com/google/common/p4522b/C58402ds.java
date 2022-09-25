package com.google.common.p4522b;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.common.b.ds */
/* compiled from: PG */
final class C58402ds extends C58406dw {

    /* renamed from: a */
    public static final C58402ds f156002a = new C58402ds();
    private static final long serialVersionUID = 0;

    private C58402ds() {
        super(BuildConfig.FLAVOR);
    }

    private Object readResolve() {
        return f156002a;
    }

    /* renamed from: a */
    public final int mo55175a(C58406dw dwVar) {
        return dwVar == this ? 0 : 1;
    }

    /* renamed from: b */
    public final Comparable mo55176b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    /* renamed from: c */
    public final Comparable mo55177c(C58419ei eiVar) {
        return Integer.MAX_VALUE;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((C58406dw) obj);
    }

    /* renamed from: d */
    public final Comparable mo55179d(C58419ei eiVar) {
        throw new AssertionError();
    }

    /* renamed from: e */
    public final void mo55180e(StringBuilder sb) {
        throw new AssertionError();
    }

    /* renamed from: f */
    public final void mo55181f(StringBuilder sb) {
        sb.append("+∞)");
    }

    /* renamed from: g */
    public final boolean mo55182g(Comparable comparable) {
        return false;
    }

    /* renamed from: h */
    public final C58406dw mo55183h(C58419ei eiVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* renamed from: i */
    public final C58406dw mo55185i(C58419ei eiVar) {
        throw new IllegalStateException();
    }

    public final String toString() {
        return "+∞";
    }
}
