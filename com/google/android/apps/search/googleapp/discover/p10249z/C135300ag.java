package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.ag */
/* compiled from: PG */
public final class C135300ag {

    /* renamed from: a */
    public final String f368579a;

    /* renamed from: b */
    public final C58485gu f368580b;

    /* renamed from: c */
    public final C134560ay f368581c;

    public C135300ag(String str, C58485gu guVar, C134560ay ayVar) {
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(guVar, "children");
        this.f368579a = str;
        this.f368580b = guVar;
        this.f368581c = ayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135300ag)) {
            return false;
        }
        C135300ag agVar = (C135300ag) obj;
        return C69664n.m101066l(this.f368579a, agVar.f368579a) && C69664n.m101066l(this.f368580b, agVar.f368580b) && C69664n.m101066l(this.f368581c, agVar.f368581c);
    }

    public final int hashCode() {
        return (((this.f368579a.hashCode() * 31) + this.f368580b.hashCode()) * 31) + this.f368581c.hashCode();
    }

    public final String toString() {
        String str = this.f368579a;
        C58485gu guVar = this.f368580b;
        C134560ay ayVar = this.f368581c;
        return "StreamNode(contentId=" + str + ", children=" + guVar + ", content=" + ayVar + ")";
    }
}
