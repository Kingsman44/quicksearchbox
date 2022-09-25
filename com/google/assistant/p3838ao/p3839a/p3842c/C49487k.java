package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49520ad;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.assistant.ao.a.c.k */
/* compiled from: PG */
public final class C49487k implements C49485i {

    /* renamed from: a */
    private static final C58974d f127706a = C58974d.m91136j();

    /* renamed from: b */
    private final C62917ay f127707b;

    /* renamed from: c */
    private final C49486j f127708c;

    public C49487k(C49486j jVar, C62917ay ayVar) {
        this.f127707b = ayVar;
        this.f127708c = jVar;
    }

    /* renamed from: a */
    public final C58485gu mo53272a(C49692r rVar, C49520ad adVar) {
        Object obj;
        this.f127708c.getClass().getSimpleName();
        try {
            C49486j jVar = this.f127708c;
            C62940bt r1 = C62942bv.checkIsLite(this.f127707b);
            adVar.mo58887l(r1);
            Object l = adVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            return jVar.mo53273a(rVar, obj);
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f127706a.mo56225c()).mo56382g(e)).mo56372aa(54841)).mo56389s("An error occurred when generating suggestions: %s", this.f127708c.getClass().getSimpleName());
            return C58485gu.m89845m();
        }
    }
}
