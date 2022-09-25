package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.android.libraries.mdi.C29690f;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.a */
/* compiled from: PG */
public final class C122892a extends C122925b {

    /* renamed from: a */
    private final C29690f f340358a;

    /* renamed from: b */
    private final String f340359b;

    public C122892a(C29690f fVar, String str) {
        if (fVar != null) {
            this.f340358a = fVar;
            if (str != null) {
                this.f340359b = str;
                return;
            }
            throw new NullPointerException("Null resourceGroupName");
        }
        throw new NullPointerException("Null clientFileGroup");
    }

    /* renamed from: a */
    public final C29690f mo105775a() {
        return this.f340358a;
    }

    /* renamed from: b */
    public final String mo105776b() {
        return this.f340359b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122925b) {
            C122925b bVar = (C122925b) obj;
            return this.f340358a.equals(bVar.mo105775a()) && this.f340359b.equals(bVar.mo105776b());
        }
    }

    public final int hashCode() {
        return ((this.f340358a.hashCode() ^ 1000003) * 1000003) ^ this.f340359b.hashCode();
    }

    public final String toString() {
        String obj = this.f340358a.toString();
        String str = this.f340359b;
        return "Response{clientFileGroup=" + obj + ", resourceGroupName=" + str + "}";
    }
}
