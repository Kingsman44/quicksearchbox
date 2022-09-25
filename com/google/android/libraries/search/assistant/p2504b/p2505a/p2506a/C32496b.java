package com.google.android.libraries.search.assistant.p2504b.p2505a.p2506a;

import com.google.android.apps.p471d.p482b.p483a.C9041b;
import com.google.android.apps.p471d.p482b.p483a.C9042c;
import com.google.android.apps.p471d.p482b.p483a.C9043d;
import com.google.android.apps.p471d.p482b.p483a.C9044e;
import com.google.android.apps.p471d.p482b.p483a.C9045f;
import com.google.android.apps.p471d.p482b.p483a.C9046g;
import com.google.android.apps.p471d.p482b.p483a.C9050k;
import com.google.android.libraries.search.assistant.p2504b.p2505a.C32501f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51669ac;
import com.google.assistant.p3897e.p3921j.C52499u;
import com.google.assistant.p3897e.p3921j.C52634z;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.assistant.p3944g.p3945a.p3946a.C52924a;
import com.google.assistant.p3944g.p3945a.p3947b.C52926b;
import com.google.assistant.p3944g.p3945a.p3947b.C52928d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.assistant.b.a.a.b */
/* compiled from: PG */
public final class C32496b implements C32501f {

    /* renamed from: a */
    public static final C59071e f87073a = C59071e.m91332i("com.google.android.libraries.search.assistant.b.a.a.b");

    /* renamed from: b */
    private final C9041b f87074b;

    public C32496b(C9041b bVar) {
        this.f87074b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo38112a(C52499u uVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C52634z zVar;
        C51669ac acVar = uVar.f137819a;
        if (acVar == null) {
            acVar = C51669ac.f134786c;
        }
        if (acVar.f134788a == 1) {
            C51669ac acVar2 = uVar.f137819a;
            if (acVar2 == null) {
                acVar2 = C51669ac.f134786c;
            }
            if (acVar2.f134788a == 1) {
                zVar = (C52634z) acVar2.f134789b;
            } else {
                zVar = C52634z.f138199b;
            }
            if ((zVar.f138201a & 1) == 0) {
                throw new IllegalArgumentException("Automation args is not valid.");
            }
        }
        C62940bt r0 = C62942bv.checkIsLite(C52924a.f138766b);
        uVar.mo58887l(r0);
        Object l = uVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        if (((C52846w) obj).f138655a.size() != 0) {
            C62940bt r02 = C62942bv.checkIsLite(C52924a.f138765a);
            uVar.mo58887l(r02);
            if (uVar.f169962ag.mo58857o(r02.f169971d)) {
                C9041b bVar = this.f87074b;
                C62940bt r2 = C62942bv.checkIsLite(C52924a.f138766b);
                uVar.mo58887l(r2);
                Object l2 = uVar.f169962ag.mo58854l(r2.f169971d);
                if (l2 == null) {
                    obj2 = r2.f169969b;
                } else {
                    obj2 = r2.mo58889c(l2);
                }
                C52846w wVar = (C52846w) obj2;
                C62940bt r3 = C62942bv.checkIsLite(C52924a.f138765a);
                uVar.mo58887l(r3);
                Object l3 = uVar.f169962ag.mo58854l(r3.f169971d);
                if (l3 == null) {
                    obj3 = r3.f169969b;
                } else {
                    obj3 = r3.mo58889c(l3);
                }
                C52928d dVar = (C52928d) obj3;
                C62940bt r4 = C62942bv.checkIsLite(C52924a.f138767c);
                uVar.mo58887l(r4);
                Object l4 = uVar.f169962ag.mo58854l(r4.f169971d);
                if (l4 == null) {
                    obj4 = r4.f169969b;
                } else {
                    obj4 = r4.mo58889c(l4);
                }
                C52926b bVar2 = (C52926b) obj4;
                C9043d dVar2 = (C9043d) C9044e.f31248c.createBuilder();
                dVar2.copyOnWrite();
                C9044e eVar = (C9044e) dVar2.instance;
                wVar.getClass();
                eVar.f31251b = wVar;
                eVar.f31250a |= 2;
                C9044e eVar2 = (C9044e) dVar2.build();
                C9045f fVar = (C9045f) C9046g.f31252e.createBuilder();
                fVar.copyOnWrite();
                C9046g gVar = (C9046g) fVar.instance;
                eVar2.getClass();
                gVar.f31255b = eVar2;
                gVar.f31254a |= 1;
                if ((dVar.f138774a & 1) != 0) {
                    String str = dVar.f138775b;
                    fVar.copyOnWrite();
                    C9046g gVar2 = (C9046g) fVar.instance;
                    str.getClass();
                    gVar2.f31254a |= 4;
                    gVar2.f31256c = str;
                }
                if ((bVar2.f138770a & 1) != 0) {
                    boolean z = bVar2.f138771b;
                    fVar.copyOnWrite();
                    C9046g gVar3 = (C9046g) fVar.instance;
                    gVar3.f31254a |= 16;
                    gVar3.f31257d = z;
                }
                C9046g gVar4 = (C9046g) fVar.build();
                C70888j jVar = bVar.f189039a;
                C70338di diVar = C9042c.f31247a;
                if (diVar == null) {
                    synchronized (C9042c.class) {
                        diVar = C9042c.f31247a;
                        if (diVar == null) {
                            C70335df d = C70338di.m102603d();
                            d.f187487c = C70337dh.UNARY;
                            d.f187488d = C70338di.m102602c("intelligence.miphone.automation.AppAutomationService", "PerformAugmentedDirectAction");
                            d.f187489e = true;
                            d.f187485a = C70850d.m103697c(C9046g.f31252e);
                            d.f187486b = C70850d.m103697c(C9050k.f31264b);
                            C70338di a = d.mo62040a();
                            C9042c.f31247a = a;
                            diVar = a;
                        }
                    }
                }
                C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), gVar4);
                C60856cj.m92911t(a2, C47810es.m84974n(new C32495a()), C60826bg.f164896a);
                return a2;
            }
            throw new IllegalArgumentException("No target app specified.");
        }
        throw new IllegalArgumentException("No augmented BII specified.");
    }
}
