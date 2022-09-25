package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aup */
/* compiled from: PG */
public abstract class aup implements Map.Entry, Comparable, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: c */
    public static aup m19684c(Object obj, Object obj2) {
        return new auo(obj, obj2);
    }

    /* renamed from: a */
    public abstract Object mo15464a();

    /* renamed from: b */
    public abstract Object mo15465b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aup aup = (aup) obj;
        aui aui = new aui();
        aui.mo15452a(mo15464a(), aup.mo15464a());
        aui.mo15452a(mo15465b(), aup.mo15465b());
        return aui.mo15453b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(mo15464a(), entry.getKey()) && Objects.equals(mo15465b(), entry.getValue());
        }
    }

    public final Object getKey() {
        return mo15464a();
    }

    public final Object getValue() {
        return mo15465b();
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (mo15464a() == null) {
            i = 0;
        } else {
            i = mo15464a().hashCode();
        }
        if (mo15465b() != null) {
            i2 = mo15465b().hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "(" + mo15464a() + ',' + mo15465b() + ')';
    }
}
