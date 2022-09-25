package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.android.libraries.search.assistant.p2497ab.C32371am;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37149e;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.assistant.p3897e.p3917i.p3918a.C51596no;
import com.google.assistant.p3897e.p3917i.p3918a.C51598nq;
import com.google.assistant.p3897e.p3917i.p3918a.C51601nt;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3917i.p3918a.C51603nv;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.o */
/* compiled from: PG */
public final class C37134o implements C37149e {

    /* renamed from: a */
    private final C38469m f96729a;

    /* renamed from: b */
    private final C71422aw f96730b;

    public C37134o(C38469m mVar, C71422aw awVar) {
        C69664n.m101061g(mVar, "gellerAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f96729a = mVar;
        this.f96730b = awVar;
    }

    /* renamed from: c */
    private static final C51606ny m65897c(C51605nx nxVar, List list) {
        C51603nv nvVar = (C51603nv) C51606ny.f134497d.createBuilder();
        C69664n.m101060f(nvVar, "newBuilder()");
        C51598nq a = C69664n.m101061g(nvVar, "builder");
        a.mo53655b(nxVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32371am amVar = (C32371am) it.next();
            a.mo53657d();
            C51601nt ntVar = (C51601nt) C51602nu.f134484e.createBuilder();
            C69664n.m101060f(ntVar, "newBuilder()");
            C51596no a2 = C69664n.m101061g(ntVar, "builder");
            String str = amVar.f86784c;
            C69664n.m101060f(str, "contact.name");
            a2.mo53653b(str);
            double d = amVar.f86785d;
            C51601nt ntVar2 = a2.f134481a;
            ntVar2.copyOnWrite();
            C51602nu nuVar = (C51602nu) ntVar2.instance;
            nuVar.f134486a |= 2;
            nuVar.f134488c = (float) d;
            a.mo53656c(a2.mo53652a());
        }
        return a.mo53654a();
    }

    /* renamed from: a */
    public final C60870cx mo40647a(C37148d dVar) {
        C69664n.m101061g(dVar, "configuration");
        return C71663i.m104692e(this.f96730b, (C71424ay) null, new C37132m(this, dVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40649b(com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37133n
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.y.s.a.n r0 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37133n) r0
            int r1 = r0.f96728d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96728d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.y.s.a.n r0 = new com.google.android.libraries.search.assistant.y.s.a.n
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f96726b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f96728d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r11 = r0.f96725a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.search.i.m r4 = r10.f96729a
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.TNG_ASSISTANT_TOP_CONTACTS
            r6 = 0
            com.google.protos.ap.a.a.ac r7 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a
            r8 = 1
            com.google.android.libraries.search.assistant.ab.ar r9 = com.google.android.libraries.search.assistant.p2497ab.C32376ar.f86796d
            com.google.common.util.concurrent.cx r12 = r4.mo41433d(r5, r6, r7, r8, r9)
            java.lang.String r2 = "gellerAccessor\n        .…faultInstance()\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            r0.f96725a = r11
            r0.f96728d = r3
            java.lang.Object r12 = kotlinx.coroutines.p5578d.C71663i.m104690c(r12, r0)
            if (r12 == r1) goto L_0x00e0
        L_0x0051:
            com.google.common.b.gu r12 = (com.google.common.p4522b.C58485gu) r12
            java.lang.String r0 = "newBuilder()"
            if (r12 == 0) goto L_0x00cc
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x005e
            goto L_0x00cc
        L_0x005e:
            r1 = 0
            java.lang.Object r12 = r12.get(r1)
            com.google.android.libraries.search.assistant.ab.ar r12 = (com.google.android.libraries.search.assistant.p2497ab.C32376ar) r12
            com.google.assistant.e.i.a.oa r1 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.i.a.nz r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51607nz) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            com.google.assistant.e.i.a.ns r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.assistant.y.s.d r11 = (com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d) r11
            boolean r1 = r11.mo40660a()
            if (r1 == 0) goto L_0x0095
            boolean r1 = r11.mo40661b()
            if (r1 == 0) goto L_0x0095
            r0.mo53660c()
            com.google.assistant.e.i.a.nx r1 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.AGGREGATED
            com.google.protobuf.cq r2 = r12.f86800c
            java.lang.String r3 = "topContactResponse.topAggregateContactsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.assistant.e.i.a.ny r1 = m65897c(r1, r2)
            r0.mo53659b(r1)
        L_0x0095:
            boolean r1 = r11.mo40661b()
            if (r1 == 0) goto L_0x00ae
            r0.mo53660c()
            com.google.assistant.e.i.a.nx r1 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.TEXT
            com.google.protobuf.cq r2 = r12.f86799b
            java.lang.String r3 = "topContactResponse.topTextContactsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.assistant.e.i.a.ny r1 = m65897c(r1, r2)
            r0.mo53659b(r1)
        L_0x00ae:
            boolean r11 = r11.mo40660a()
            if (r11 == 0) goto L_0x00c7
            r0.mo53660c()
            com.google.assistant.e.i.a.nx r11 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.CALL
            com.google.protobuf.cq r12 = r12.f86798a
            java.lang.String r1 = "topContactResponse.topCallContactsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            com.google.assistant.e.i.a.ny r11 = m65897c(r11, r12)
            r0.mo53659b(r11)
        L_0x00c7:
            com.google.assistant.e.i.a.oa r11 = r0.mo53658a()
            return r11
        L_0x00cc:
            com.google.assistant.e.i.a.oa r11 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.i.a.nz r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51607nz) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.assistant.e.i.a.ns r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.assistant.e.i.a.oa r11 = r11.mo53658a()
            return r11
        L_0x00e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37134o.mo40649b(com.google.android.libraries.search.assistant.y.s.d, h.c.g):java.lang.Object");
    }
}
