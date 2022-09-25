package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import java.util.Iterator;
import p5462h.C69613f;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.r */
/* compiled from: PG */
final class C126510r extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C69644aa f348419a;

    /* renamed from: b */
    final /* synthetic */ C126513u f348420b;

    /* renamed from: c */
    final /* synthetic */ C69613f f348421c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126510r(C69644aa aaVar, C126513u uVar, C69613f fVar) {
        super(0);
        this.f348419a = aaVar;
        this.f348420b = uVar;
        this.f348421c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Object obj;
        if (this.f348419a.f186023a) {
            Iterator it = C126512t.m206856e(this.f348421c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C69764m.m101234m((String) obj, "Content-Type")) {
                    break;
                }
            }
            if (obj == null) {
                throw new IllegalStateException("Content-Type was not received");
            } else if (C69764m.m101233l((String) obj, "text/html", 14)) {
                return new C126504l();
            } else {
                Object b = this.f348420b.f348428a.mo17428b();
                C69664n.m101060f(b, "{\n          protoParser.get()\n        }");
                return (C126505m) b;
            }
        } else {
            throw new IllegalStateException("Received GWS body without headers being complete");
        }
    }
}
