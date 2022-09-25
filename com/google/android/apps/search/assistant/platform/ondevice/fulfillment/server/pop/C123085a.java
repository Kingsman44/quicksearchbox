package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a */
/* compiled from: PG */
public final class C123085a extends C123166f {

    /* renamed from: a */
    public final String f340675a;

    /* renamed from: b */
    public final C122859d f340676b;

    /* renamed from: c */
    public final int f340677c;

    /* renamed from: d */
    public final C122561k f340678d;

    public C123085a(String str, int i, C122561k kVar, C122859d dVar) {
        if (str != null) {
            this.f340675a = str;
            this.f340677c = i;
            this.f340678d = kVar;
            this.f340676b = dVar;
            return;
        }
        throw new NullPointerException("Null loggingStreamId");
    }

    /* renamed from: a */
    public final C122859d mo105864a() {
        return this.f340676b;
    }

    /* renamed from: b */
    public final String mo105865b() {
        return this.f340675a;
    }

    /* renamed from: c */
    public final int mo105866c() {
        return this.f340677c;
    }

    /* renamed from: d */
    public final C122561k mo105867d() {
        return this.f340678d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123166f) {
            C123166f fVar = (C123166f) obj;
            return this.f340675a.equals(fVar.mo105865b()) && this.f340677c == fVar.mo105866c() && this.f340678d.equals(fVar.mo105867d()) && this.f340676b.equals(fVar.mo105864a());
        }
    }

    public final int hashCode() {
        return ((((((this.f340675a.hashCode() ^ 1000003) * 1000003) ^ this.f340677c) * 1000003) ^ this.f340678d.hashCode()) * 1000003) ^ this.f340676b.hashCode();
    }

    public final String toString() {
        String str = this.f340675a;
        String num = Integer.toString(C64802b.m96463a(this.f340677c));
        String obj = this.f340678d.toString();
        String obj2 = this.f340676b.toString();
        return "RequestContext{loggingStreamId=" + str + ", interactionType=" + num + ", contextFetcher=" + obj + ", componentLogger=" + obj2 + "}";
    }
}
