package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49621l;
import com.google.assistant.p3838ao.p3839a.p3845e.C49623n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.assistant.ao.a.a.c */
/* compiled from: PG */
final class C49400c implements C49399b {

    /* renamed from: a */
    private static final C58974d f127655a = C58974d.m91136j();

    /* renamed from: b */
    private final C62917ay f127656b;

    /* renamed from: c */
    private final C49382a f127657c;

    public C49400c(C49382a aVar, C62917ay ayVar) {
        this.f127656b = ayVar;
        this.f127657c = aVar;
    }

    /* renamed from: a */
    public final boolean mo53260a(C49692r rVar, C49621l lVar) {
        Object obj;
        try {
            C49382a aVar = this.f127657c;
            C62940bt r1 = C62942bv.checkIsLite(this.f127656b);
            lVar.mo58887l(r1);
            Object l = lVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            return aVar.mo53258a(rVar, obj);
        } catch (Exception e) {
            C58970a aVar2 = (C58970a) ((C58970a) ((C58970a) f127655a.mo56225c()).mo56382g(e)).mo56372aa(54835);
            int b = C49623n.m85588b(lVar.f128064a);
            if (b == 0) {
                b = 2;
            }
            aVar2.mo56389s("Evaluating rule condition failed: %s", C49623n.m85587a(b));
            return false;
        }
    }
}
