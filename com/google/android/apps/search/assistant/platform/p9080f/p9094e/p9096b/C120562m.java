package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C63088z;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.m */
/* compiled from: PG */
final class C120562m {

    /* renamed from: a */
    public final List f335314a;

    /* renamed from: b */
    public final List f335315b;

    /* renamed from: c */
    public final C51183n f335316c;

    /* renamed from: d */
    public final C52091ex f335317d;

    /* renamed from: e */
    public final C63088z f335318e;

    public C120562m(List list, List list2, C51183n nVar, C52091ex exVar, C63088z zVar) {
        C69664n.m101061g(nVar, "executionPlan");
        C69664n.m101061g(exVar, "conversationParams");
        C69664n.m101061g(zVar, "opaqueToken");
        this.f335314a = list;
        this.f335315b = list2;
        this.f335316c = nVar;
        this.f335317d = exVar;
        this.f335318e = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C120562m)) {
            return false;
        }
        C120562m mVar = (C120562m) obj;
        return C69664n.m101066l(this.f335314a, mVar.f335314a) && C69664n.m101066l(this.f335315b, mVar.f335315b) && C69664n.m101066l(this.f335316c, mVar.f335316c) && C69664n.m101066l(this.f335317d, mVar.f335317d) && C69664n.m101066l(this.f335318e, mVar.f335318e);
    }

    public final int hashCode() {
        return (((((((this.f335314a.hashCode() * 31) + this.f335315b.hashCode()) * 31) + this.f335316c.hashCode()) * 31) + this.f335317d.hashCode()) * 31) + this.f335318e.hashCode();
    }

    public final String toString() {
        List list = this.f335314a;
        List list2 = this.f335315b;
        C51183n nVar = this.f335316c;
        C52091ex exVar = this.f335317d;
        C63088z zVar = this.f335318e;
        return "DeltaSessionWithExecutionPlan(apaGeneratedSessions=" + list + ", regularSessions=" + list2 + ", executionPlan=" + nVar + ", conversationParams=" + exVar + ", opaqueToken=" + zVar + ")";
    }
}
