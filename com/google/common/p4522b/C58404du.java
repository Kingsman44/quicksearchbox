package com.google.common.p4522b;

import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.common.b.du */
/* compiled from: PG */
final class C58404du extends C58406dw {

    /* renamed from: a */
    public static final C58404du f156003a = new C58404du();
    private static final long serialVersionUID = 0;

    private C58404du() {
        super(BuildConfig.FLAVOR);
    }

    private Object readResolve() {
        return f156003a;
    }

    /* renamed from: a */
    public final int mo55175a(C58406dw dwVar) {
        return dwVar == this ? 0 : -1;
    }

    /* renamed from: b */
    public final Comparable mo55176b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    /* renamed from: c */
    public final Comparable mo55177c(C58419ei eiVar) {
        throw new AssertionError();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((C58406dw) obj);
    }

    /* renamed from: d */
    public final Comparable mo55179d(C58419ei eiVar) {
        return Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
    }

    /* renamed from: e */
    public final void mo55180e(StringBuilder sb) {
        sb.append("(-∞");
    }

    /* renamed from: f */
    public final void mo55181f(StringBuilder sb) {
        throw new AssertionError();
    }

    /* renamed from: g */
    public final boolean mo55182g(Comparable comparable) {
        return true;
    }

    /* renamed from: h */
    public final C58406dw mo55183h(C58419ei eiVar) {
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* renamed from: i */
    public final C58406dw mo55185i(C58419ei eiVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    public final String toString() {
        return "-∞";
    }
}
