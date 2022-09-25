package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49621l;
import com.google.assistant.p3838ao.p3839a.p3845e.C49623n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.assistant.ao.a.a.d */
/* compiled from: PG */
final class C49401d implements C49399b {

    /* renamed from: a */
    private static final C58974d f127658a = C58974d.m91136j();

    /* renamed from: b */
    private final C49404g f127659b;

    public C49401d(C49404g gVar) {
        this.f127659b = gVar;
    }

    /* renamed from: a */
    public final boolean mo53260a(C49692r rVar, C49621l lVar) {
        try {
            return this.f127659b.mo53259a(rVar);
        } catch (Exception e) {
            C58970a aVar = (C58970a) ((C58970a) ((C58970a) f127658a.mo56225c()).mo56382g(e)).mo56372aa(54836);
            int b = C49623n.m85588b(lVar.f128064a);
            if (b == 0) {
                b = 2;
            }
            aVar.mo56389s("Evaluating rule condition failed: %s", C49623n.m85587a(b));
            return false;
        }
    }
}
