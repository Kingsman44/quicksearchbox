package com.google.android.apps.search.googleapp.p10338l.p10339a;

import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.l.a.m */
/* compiled from: PG */
final class C136394m extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Throwable f371327a;

    /* renamed from: b */
    final /* synthetic */ C136396o f371328b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136394m(Throwable th, C136396o oVar) {
        super(0);
        this.f371327a = th;
        this.f371328b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        StackTraceElement[] stackTrace = this.f371327a.getStackTrace();
        C69664n.m101060f(stackTrace, "exception.stackTrace");
        C136396o oVar = this.f371328b;
        for (Object obj : (Object[]) stackTrace) {
            String stackTraceElement = ((StackTraceElement) obj).toString();
            C69664n.m101060f(stackTraceElement, "it.toString()");
            oVar.mo112975c(stackTraceElement);
        }
        return C69788q.f186170a;
    }
}
