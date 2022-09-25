package com.google.android.libraries.search.assistant.p2566g;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.search.assistant.g.j */
/* compiled from: PG */
public final class C33415j implements Serializable, C33428w {
    private static final long serialVersionUID = -3571883037101935863L;

    /* renamed from: a */
    private final C33425t[] f89498a;

    public C33415j(C33425t[] tVarArr) {
        this.f89498a = (C33425t[]) tVarArr.clone();
    }

    /* renamed from: a */
    public final C33425t[] mo38832a() {
        return (C33425t[]) this.f89498a.clone();
    }

    public final Class annotationType() {
        return C33428w.class;
    }

    public final boolean equals(Object obj) {
        C33425t[] tVarArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33428w)) {
            return false;
        }
        C33428w wVar = (C33428w) obj;
        C33425t[] tVarArr2 = this.f89498a;
        if (wVar instanceof C33415j) {
            tVarArr = ((C33415j) wVar).f89498a;
        } else {
            tVarArr = wVar.mo38832a();
        }
        return Arrays.equals(tVarArr2, tVarArr);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f89498a) ^ 1335633679;
    }

    public final String toString() {
        return "@com.google.android.libraries.search.assistant.contextdebug.EntryProviderKey(" + Arrays.toString(this.f89498a) + ')';
    }
}
