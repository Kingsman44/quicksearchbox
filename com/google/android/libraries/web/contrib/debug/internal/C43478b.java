package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.base.C43271v;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.b */
/* compiled from: PG */
final class C43478b extends C43475a {

    /* renamed from: a */
    public final C43271v f113577a;

    public C43478b(C43271v vVar) {
        if (vVar != null) {
            this.f113577a = vVar;
            return;
        }
        throw new NullPointerException("Null webImplementation");
    }

    /* renamed from: a */
    public final C43271v mo46557a() {
        return this.f113577a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43475a) {
            return this.f113577a.equals(((C43475a) obj).mo46557a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f113577a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f113577a.toString();
        return "AdditionalWebDebugData{webImplementation=" + obj + "}";
    }
}
