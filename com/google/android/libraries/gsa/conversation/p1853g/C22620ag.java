package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.C22346b;
import com.google.android.libraries.gsa.conversation.C22353c;
import com.google.android.libraries.gsa.conversation.C22727l;
import com.google.android.libraries.gsa.conversation.clientop.C22401b;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22495g;
import com.google.android.libraries.gsa.conversation.clientop.C22528i;
import com.google.android.libraries.gsa.conversation.clientop.C22537n;
import com.google.android.libraries.gsa.conversation.p1839c.C22363j;
import com.google.android.libraries.gsa.conversation.p1839c.C22364k;
import com.google.android.libraries.gsa.conversation.p1839c.C22365l;
import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.android.libraries.gsa.conversation.p1855h.p1856a.C22686b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ag */
/* compiled from: PG */
final class C22620ag implements C22669m {

    /* renamed from: a */
    private final C22618ae f62316a;

    public C22620ag(C22618ae aeVar) {
        this.f62316a = aeVar;
    }

    /* renamed from: a */
    public final C60870cx mo27742a(C52083ep epVar, C58833ax axVar, int i) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C52076ei eiVar3;
        byte[] bArr;
        C60870cx cxVar;
        C52076ei eiVar4;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        if ((eiVar.f136666a & 32) != 0) {
            C22618ae aeVar = this.f62316a;
            int i2 = epVar.f136694d;
            if (epVar.f136692b == 4) {
                eiVar2 = (C52076ei) epVar.f136693c;
            } else {
                eiVar2 = C52076ei.f136664f;
            }
            C51809dy dyVar = eiVar2.f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            C51809dy dyVar2 = dyVar;
            int i3 = epVar.f136692b;
            if (i3 == 4) {
                eiVar3 = (C52076ei) epVar.f136693c;
            } else {
                eiVar3 = C52076ei.f136664f;
            }
            if ((eiVar3.f136666a & 128) != 0) {
                if (i3 == 4) {
                    eiVar4 = (C52076ei) epVar.f136693c;
                } else {
                    eiVar4 = C52076ei.f136664f;
                }
                bArr = eiVar4.f136669d.mo59174N();
            } else {
                bArr = new byte[0];
            }
            C22727l lVar = (C22727l) aeVar;
            C22365l lVar2 = lVar.f62549c;
            C22571j jVar = lVar.f62548b;
            C22571j jVar2 = new C22571j(jVar.f62205a.mo27655a(String.format("client_op: %s\n%s", new Object[]{dyVar2.f135936b, jVar.mo27660c()}), "(Performer)"), jVar.f62206b);
            C22363j a = lVar2.mo27585a();
            a.f61757a = jVar2;
            C22537n a2 = a.mo27584a();
            C22401b g = C22434e.m41866g();
            g.mo27590c(lVar2.f61850a.f62550a.mo56113h());
            C58833ax b = lVar2.mo27586b().f62229c.mo56106b(C22346b.f61687a);
            if (b != null) {
                g.f61886a = b;
                g.mo27589b(bArr);
                g.f61887b = C58833ax.m90834k(lVar2.mo27586b());
                if (axVar.mo56113h()) {
                    g.f61888c = C58833ax.m90834k((C22686b) axVar.mo56107c());
                }
                C22528i iVar = (C22528i) ((C22364k) a2).f61786a.mo17428b();
                C22434e a3 = g.mo27588a();
                C68214a aVar = (C68214a) iVar.f62131b.get(dyVar2.f135936b);
                if (aVar == null) {
                    ((C59052c) ((C59052c) C22528i.f62130a.mo56225c()).mo56372aa(48240)).mo56389s("Performer %s not found", dyVar2.f135936b);
                    cxVar = C60856cj.m92899h(new IllegalArgumentException("Couldn't dispatch ClientOp: ".concat(String.valueOf(dyVar2.f135936b))));
                } else {
                    ((C59052c) ((C59052c) C22528i.f62130a.mo56224b()).mo56372aa(48239)).mo56389s("dispatch client op %s", dyVar2.f135936b);
                    cxVar = C60856cj.m92905n(C47810es.m84965e(new C22495g(iVar, aVar, i, dyVar2, a3)), iVar.f62132c);
                }
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C22353c(jVar2)), C60826bg.f164896a);
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C22619af()), C60826bg.f164896a);
                if (epVar.f136692b == 4) {
                    C52076ei eiVar5 = (C52076ei) epVar.f136693c;
                    if ((eiVar5.f136666a & 32) != 0) {
                        C51809dy dyVar3 = eiVar5.f136668c;
                        if (dyVar3 == null) {
                            dyVar3 = C51809dy.f135933f;
                        }
                        if (dyVar3.f135939e) {
                            return C60856cj.m92901j(cxVar);
                        }
                    }
                }
                return cxVar;
            }
            throw new NullPointerException("Null eventId");
        }
        int i4 = epVar.f136694d;
        return C60856cj.m92899h(new Throwable("No ClientOp from Interaction, id " + i4));
    }
}
