package com.google.android.libraries.search.assistant.invocation.p2650m;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.t */
/* compiled from: PG */
public final class C33971t implements C33970s {

    /* renamed from: a */
    private final List f90585a;

    /* renamed from: b */
    private final String f90586b = "OnAccountChanged";

    public C33971t(List list) {
        this.f90585a = list;
    }

    /* renamed from: a */
    public final String mo39161a() {
        return this.f90586b;
    }

    /* renamed from: b */
    public final List mo39165b() {
        return this.f90585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33971t) && C69664n.m101066l(this.f90585a, ((C33971t) obj).f90585a);
    }

    public final int hashCode() {
        return this.f90585a.hashCode();
    }

    public final String toString() {
        List list = this.f90585a;
        return "OnAccountChangedDebugEvent(features=" + list + ")";
    }
}
