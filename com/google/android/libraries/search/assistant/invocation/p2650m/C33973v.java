package com.google.android.libraries.search.assistant.invocation.p2650m;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.v */
/* compiled from: PG */
public final class C33973v implements C33970s {

    /* renamed from: a */
    private final List f90588a;

    /* renamed from: b */
    private final String f90589b = "OnReady";

    public C33973v(List list) {
        this.f90588a = list;
    }

    /* renamed from: a */
    public final String mo39161a() {
        return this.f90589b;
    }

    /* renamed from: b */
    public final List mo39165b() {
        return this.f90588a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33973v) && C69664n.m101066l(this.f90588a, ((C33973v) obj).f90588a);
    }

    public final int hashCode() {
        return this.f90588a.hashCode();
    }

    public final String toString() {
        List list = this.f90588a;
        return "OnReadyDebugEvent(features=" + list + ")";
    }
}
