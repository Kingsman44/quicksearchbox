package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.f */
/* compiled from: PG */
public final class C89856f {

    /* renamed from: a */
    public C89849ae f246201a;

    /* renamed from: b */
    public C58528ij f246202b;

    /* renamed from: c */
    public C59687cb f246203c;

    /* renamed from: d */
    public long f246204d;

    /* renamed from: e */
    private C58490gz f246205e;

    /* renamed from: a */
    public final C89857g mo83699a() {
        if (this.f246201a != null) {
            C58490gz gzVar = this.f246205e;
            return new C89857g(this.f246201a, this.f246202b, gzVar != null ? gzVar.mo55427f(false) : null, this.f246203c, this.f246204d);
        }
        throw new IllegalStateException("eventId must be initialized");
    }

    /* renamed from: b */
    public final void mo83700b(C89857g gVar) {
        this.f246201a = gVar.f246206a;
        this.f246203c = gVar.f246209d;
        this.f246204d = gVar.f246210e;
        this.f246202b = gVar.f246207b;
        C58495hd hdVar = gVar.f246208c;
        if (hdVar != null) {
            C58800sl lA = hdVar.keySet().iterator();
            while (lA.hasNext()) {
                String str = (String) lA.next();
                mo83701c(str, (String) hdVar.get(str));
            }
        }
    }

    /* renamed from: c */
    public final void mo83701c(String str, String str2) {
        if (this.f246205e == null) {
            this.f246205e = new C58490gz(4);
        }
        this.f246205e.mo55429h(str, str2);
    }
}
