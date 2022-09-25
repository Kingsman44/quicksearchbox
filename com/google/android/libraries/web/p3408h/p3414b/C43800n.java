package com.google.android.libraries.web.p3408h.p3414b;

import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.h.b.n */
/* compiled from: PG */
final class C43800n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C43795i f114206a;

    /* renamed from: b */
    final /* synthetic */ C43804r f114207b;

    /* renamed from: c */
    final /* synthetic */ C43790d f114208c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43800n(C43795i iVar, C43804r rVar, C43790d dVar) {
        super(1);
        this.f114206a = iVar;
        this.f114207b = rVar;
        this.f114208c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C43795i iVar = this.f114206a;
            iVar.f114197h = true;
            this.f114207b.f114215b.mo62807f(new C43886d(iVar));
            C43790d dVar = this.f114208c;
            dVar.f114180c.mo46896b(new C43799m(dVar, this.f114207b, this.f114206a));
            this.f114207b.f114217d = this.f114206a;
        } else {
            C43804r rVar = this.f114207b;
            if (rVar.f114217d == this.f114206a) {
                rVar.mo46819c();
            }
        }
        return C69788q.f186170a;
    }
}
