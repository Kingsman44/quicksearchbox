package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136414h;
import com.google.android.apps.search.googleapp.p10338l.C136417k;
import java.util.Map;
import p5462h.C69702k;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.l.a.i */
/* compiled from: PG */
final class C136390i extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C136417k f371318a;

    /* renamed from: b */
    final /* synthetic */ C136396o f371319b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136390i(C136417k kVar, C136396o oVar) {
        super(0);
        this.f371318a = kVar;
        this.f371319b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        for (Map.Entry entry : ((C136414h) this.f371318a).f371383a.entrySet()) {
            Object obj = ((C69702k) entry.getValue()).f186073a;
            this.f371319b.mo112976d(String.valueOf((String) entry.getKey()).concat(": "));
            this.f371319b.mo112974b(obj);
        }
        return C69788q.f186170a;
    }
}
