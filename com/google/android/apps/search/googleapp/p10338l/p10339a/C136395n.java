package com.google.android.apps.search.googleapp.p10338l.p10339a;

import java.util.Map;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.l.a.n */
/* compiled from: PG */
final class C136395n extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C136396o f371329a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136395n(C136396o oVar) {
        super(0);
        this.f371329a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Map map = this.f371329a.f371333d;
        if (true == map.isEmpty()) {
            map = null;
        }
        if (map == null) {
            return null;
        }
        C136396o oVar = this.f371329a;
        oVar.mo112978f();
        for (Map.Entry entry : oVar.f371333d.entrySet()) {
            Throwable th = (Throwable) entry.getValue();
            oVar.mo112975c(((String) entry.getKey()) + ": " + th);
            oVar.mo112977e(new C136394m(th, oVar));
        }
        return oVar.f371331b;
    }
}
