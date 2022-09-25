package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136419m;
import java.util.Map;
import p5462h.C69702k;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.l.a.l */
/* compiled from: PG */
final class C136393l extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C136396o f371324a;

    /* renamed from: b */
    final /* synthetic */ C136419m f371325b;

    /* renamed from: c */
    final /* synthetic */ Map f371326c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136393l(C136396o oVar, C136419m mVar, Map map) {
        super(0);
        this.f371324a = oVar;
        this.f371325b = mVar;
        this.f371326c = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        this.f371324a.mo112978f();
        this.f371324a.f371330a = this.f371325b;
        for (Map.Entry entry : this.f371326c.entrySet()) {
            Object obj = ((C69702k) entry.getValue()).f186073a;
            this.f371324a.mo112976d(String.valueOf((String) entry.getKey()).concat(": "));
            C136396o oVar = this.f371324a;
            oVar.mo112977e(new C136392k(oVar, obj));
        }
        C136396o oVar2 = this.f371324a;
        return new C136389h(oVar2.f371332c, oVar2.f371331b);
    }
}
