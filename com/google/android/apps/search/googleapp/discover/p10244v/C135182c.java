package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.c */
/* compiled from: PG */
public final class C135182c {

    /* renamed from: a */
    public final String f368222a;

    /* renamed from: b */
    public final C134755f f368223b;

    /* renamed from: c */
    public final C58485gu f368224c;

    public C135182c(String str, C134755f fVar, C58485gu guVar) {
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(fVar, "streamStorageKey");
        C69664n.m101061g(guVar, "changes");
        this.f368222a = str;
        this.f368223b = fVar;
        this.f368224c = guVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135182c)) {
            return false;
        }
        C135182c cVar = (C135182c) obj;
        return C69664n.m101066l(this.f368222a, cVar.f368222a) && C69664n.m101066l(this.f368223b, cVar.f368223b) && C69664n.m101066l(this.f368224c, cVar.f368224c);
    }

    public final int hashCode() {
        return (((this.f368222a.hashCode() * 31) + this.f368223b.hashCode()) * 31) + this.f368224c.hashCode();
    }

    public final String toString() {
        String str = this.f368222a;
        C134755f fVar = this.f368223b;
        C58485gu guVar = this.f368224c;
        return "EphemeralSessionChange(sessionId=" + str + ", streamStorageKey=" + fVar + ", changes=" + guVar + ")";
    }
}
