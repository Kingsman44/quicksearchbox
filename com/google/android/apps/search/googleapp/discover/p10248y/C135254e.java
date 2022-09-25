package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10214s.C134544ai;
import com.google.common.p4552o.p4566l.C60220t;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.e */
/* compiled from: PG */
public final class C135254e extends C135268s {

    /* renamed from: a */
    public final C134544ai f368466a;

    /* renamed from: b */
    public final String f368467b;

    /* renamed from: c */
    public final int f368468c;

    /* renamed from: d */
    public final C60220t f368469d;

    /* renamed from: e */
    public final String f368470e;

    public C135254e(C134544ai aiVar, String str, int i, C60220t tVar, String str2) {
        C69664n.m101061g(aiVar, "content");
        C69664n.m101061g(str, "topLevelContentId");
        C69664n.m101061g(tVar, "eventId");
        C69664n.m101061g(str2, "sessionId");
        this.f368466a = aiVar;
        this.f368467b = str;
        this.f368468c = i;
        this.f368469d = tVar;
        this.f368470e = str2;
    }

    /* renamed from: a */
    public final boolean mo112198a(C135268s sVar) {
        C69664n.m101061g(sVar, "other");
        return (sVar instanceof C135254e) && C69664n.m101066l(this.f368466a.f366399e, ((C135254e) sVar).f368466a.f366399e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135254e)) {
            return false;
        }
        C135254e eVar = (C135254e) obj;
        return C69664n.m101066l(this.f368466a, eVar.f368466a) && C69664n.m101066l(this.f368467b, eVar.f368467b) && this.f368468c == eVar.f368468c && C69664n.m101066l(this.f368469d, eVar.f368469d) && C69664n.m101066l(this.f368470e, eVar.f368470e);
    }

    public final int hashCode() {
        return (((((((this.f368466a.hashCode() * 31) + this.f368467b.hashCode()) * 31) + this.f368468c) * 31) + this.f368469d.hashCode()) * 31) + this.f368470e.hashCode();
    }

    public final String toString() {
        C134544ai aiVar = this.f368466a;
        String str = this.f368467b;
        int i = this.f368468c;
        C60220t tVar = this.f368469d;
        String str2 = this.f368470e;
        return "ContentRenderableSlice(content=" + aiVar + ", topLevelContentId=" + str + ", topLevelIndex=" + i + ", eventId=" + tVar + ", sessionId=" + str2 + ")";
    }
}
