package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35733aa;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protos.p5127o.p5128a.C65632m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.ap */
/* compiled from: PG */
public final class C34942ap implements C65632m {

    /* renamed from: a */
    public static final C59071e f92610a = C59071e.m91332i("com.google.android.libraries.search.assistant.p.c.a.a.ap");

    /* renamed from: b */
    public final C60887da f92611b;

    /* renamed from: c */
    public final C35733aa f92612c;

    /* renamed from: d */
    public final Context f92613d;

    public C34942ap(Context context, C35733aa aaVar, C60887da daVar) {
        this.f92613d = context;
        this.f92612c = aaVar;
        this.f92611b = daVar;
    }

    /* renamed from: c */
    public static Object m63795c(Future future, Object obj) {
        try {
            return C60856cj.m92909r(future);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f92610a.mo56226d()).mo56382g(e)).mo56372aa(51208)).mo56386p("Failed to get the furure result!");
            return obj;
        }
    }

    /* renamed from: a */
    public final C60870cx mo39644a(String str, C58485gu guVar, C58485gu guVar2, boolean z) {
        if (guVar.isEmpty()) {
            ((C59052c) ((C59052c) f92610a.mo56226d()).mo56372aa(51204)).mo56386p("Contact ids is empty!");
            return C60856cj.m92900i(C55093fp.f144965l);
        } else if (!z) {
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar).map(new C34948b(this, guVar2)).collect(C58370cn.f155946a);
            return C47638k.m84750a(guVar3).mo51520a(new C34959m(guVar3, str), this.f92611b);
        } else {
            C58485gu guVar4 = (C58485gu) Collection.EL.stream(guVar).map(new C34970x(this, guVar2)).collect(C58370cn.f155946a);
            return C47638k.m84750a(guVar4).mo51520a(new C34934ah(guVar4, str), this.f92611b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo39645b(com.google.android.libraries.assistant.gallium.framework.C18237e r18, com.google.protos.p5127o.p5128a.C65625f r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            int r0 = r2.f178334a
            r0 = r0 & 16
            r3 = 1
            if (r0 == 0) goto L_0x022a
            int r0 = r2.f178337d
            int r0 = com.google.protos.p5127o.p5128a.C65621b.m96758a(r0)
            r4 = 4
            if (r0 != 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            if (r0 != r4) goto L_0x0019
            goto L_0x022a
        L_0x0019:
            int r0 = r2.f178335b
            if (r0 != r3) goto L_0x0022
            java.lang.Object r0 = r2.f178336c
            com.google.bb.a.fp r0 = (com.google.p4152bb.p4153a.C55093fp) r0
            goto L_0x0024
        L_0x0022:
            com.google.bb.a.fp r0 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0024:
            java.lang.String r5 = r0.f144968b
            boolean r6 = r5.isEmpty()
            r7 = 0
            if (r6 != 0) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            com.google.bb.a.fl r0 = r0.f144970d
            if (r0 != 0) goto L_0x0034
            com.google.bb.a.fl r0 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x0034:
            com.google.protobuf.cq r5 = r0.f144957b
            int r5 = r5.size()
            if (r5 != r3) goto L_0x0046
            com.google.protobuf.cq r0 = r0.f144957b
            java.lang.Object r0 = r0.get(r7)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0048
        L_0x0046:
            java.lang.String r5 = ""
        L_0x0048:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r2.f178335b
            if (r0 != r3) goto L_0x0056
            java.lang.Object r0 = r2.f178336c
            com.google.bb.a.fp r0 = (com.google.p4152bb.p4153a.C55093fp) r0
            goto L_0x0058
        L_0x0056:
            com.google.bb.a.fp r0 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0058:
            com.google.protobuf.cq r0 = r0.f144969c
            java.util.Iterator r8 = r0.iterator()
        L_0x005e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r8.next()
            r9 = r0
            com.google.bb.a.fe r9 = (com.google.p4152bb.p4153a.C55082fe) r9
            java.lang.String r0 = r9.f144920g     // Catch:{ NumberFormatException -> 0x0079 }
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0079 }
            r6.add(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            goto L_0x005e
        L_0x0079:
            r0 = move-exception
            com.google.common.f.e r10 = f92610a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.x r0 = r10.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r10 = 51202(0xc802, float:7.1749E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r10)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r10 = "Could not parse contact ID: %s"
            java.lang.String r9 = r9.f144920g
            r0.mo56389s(r10, r9)
            goto L_0x005e
        L_0x0099:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r6)
            int r6 = r2.f178337d
            int r6 = com.google.protos.p5127o.p5128a.C65621b.m96758a(r6)
            if (r6 != 0) goto L_0x00a6
            r6 = 1
        L_0x00a6:
            r8 = 3
            if (r6 == r8) goto L_0x00ab
            r9 = 0
            goto L_0x00ac
        L_0x00ab:
            r9 = 1
        L_0x00ac:
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            int r11 = r2.f178335b
            if (r11 != r3) goto L_0x00ba
            java.lang.Object r11 = r2.f178336c
            com.google.bb.a.fp r11 = (com.google.p4152bb.p4153a.C55093fp) r11
            goto L_0x00bc
        L_0x00ba:
            com.google.bb.a.fp r11 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x00bc:
            com.google.bb.a.fl r11 = r11.f144970d
            if (r11 != 0) goto L_0x00c2
            com.google.bb.a.fl r11 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x00c2:
            com.google.protobuf.cj r12 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r11.f144960e
            com.google.protobuf.ci r13 = com.google.p4152bb.p4153a.C55089fl.f144953f
            r12.<init>(r11, r13)
            java.util.Iterator r11 = r12.iterator()
        L_0x00cf:
            boolean r12 = r11.hasNext()
            r13 = 2
            if (r12 == 0) goto L_0x013e
            java.lang.Object r12 = r11.next()
            com.google.bb.a.fg r12 = (com.google.p4152bb.p4153a.C55084fg) r12
            com.google.bb.a.fg r14 = com.google.p4152bb.p4153a.C55084fg.UNKNOWN_CONTACT_METHOD
            int r14 = r12.ordinal()
            if (r14 == r3) goto L_0x0130
            if (r14 == r13) goto L_0x0117
            if (r14 == r8) goto L_0x0117
            if (r14 == r4) goto L_0x0117
            r12 = 5
            if (r14 == r12) goto L_0x00ee
            goto L_0x00cf
        L_0x00ee:
            int r12 = r2.f178335b
            if (r12 != r3) goto L_0x00f7
            java.lang.Object r12 = r2.f178336c
            com.google.bb.a.fp r12 = (com.google.p4152bb.p4153a.C55093fp) r12
            goto L_0x00f9
        L_0x00f7:
            com.google.bb.a.fp r12 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x00f9:
            com.google.bb.a.fl r12 = r12.f144970d
            if (r12 != 0) goto L_0x00ff
            com.google.bb.a.fl r12 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x00ff:
            com.google.protobuf.cq r12 = r12.f144962h
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.libraries.search.assistant.p.c.a.a.u r13 = com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a.C34967u.f92651a
            j$.util.stream.Stream r12 = r12.map(r13)
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.libraries.search.assistant.p.c.a.a.v r13 = new com.google.android.libraries.search.assistant.p.c.a.a.v
            r13.<init>(r10)
            r12.forEach(r13)
            goto L_0x00cf
        L_0x0117:
            com.google.common.f.e r13 = f92610a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r14 = 51203(0xc803, float:7.175E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            java.lang.String r14 = "Not supported contact method %d"
            int r12 = r12.f144948h
            r13.mo56387q(r14, r12)
            goto L_0x00cf
        L_0x0130:
            if (r6 != r8) goto L_0x0138
            java.lang.String r12 = "com.google.android.dialer"
            r10.add(r12)
            goto L_0x00cf
        L_0x0138:
            java.lang.String r12 = "com.google.android.apps.messaging"
            r10.add(r12)
            goto L_0x00cf
        L_0x013e:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89842j(r10)
            com.google.common.base.ar r10 = new com.google.common.base.ar
            java.lang.String r11 = "|"
            r10.<init>((java.lang.String) r11)
            r10.mo56097d(r6)
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x017a
            int r10 = r2.f178335b
            if (r10 != r3) goto L_0x015b
            java.lang.Object r2 = r2.f178336c
            com.google.bb.a.fp r2 = (com.google.p4152bb.p4153a.C55093fp) r2
            goto L_0x015d
        L_0x015b:
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x015d:
            com.google.bb.a.fl r2 = r2.f144970d
            if (r2 != 0) goto L_0x0163
            com.google.bb.a.fl r2 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x0163:
            int r2 = r2.f144956a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0169
            goto L_0x017a
        L_0x0169:
            com.google.common.util.concurrent.cx r0 = r1.mo39644a(r5, r0, r6, r9)
            com.google.android.libraries.search.assistant.p.c.a.a.h r2 = com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a.C34954h.f92637a
            com.google.common.util.concurrent.da r3 = r1.f92611b
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r2, r3)
            return r0
        L_0x017a:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0196
            com.google.common.f.e r0 = f92610a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Empty name in contact lookup"
            r3 = 51206(0xc806, float:7.1755E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.bb.a.fp r0 = com.google.p4152bb.p4153a.C55093fp.f144965l
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x021d
        L_0x0196:
            com.google.android.libraries.search.assistant.performer.communication.f.aa r0 = r1.f92612c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x01a7
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x020e
        L_0x01a7:
            java.lang.String[] r14 = new java.lang.String[r8]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "%"
            r2.<init>(r4)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r14[r7] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r14[r3] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r14[r13] = r2
            com.google.android.libraries.search.assistant.performer.communication.f.c r10 = r0.f93652c
            android.net.Uri r11 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String[] r12 = com.google.android.libraries.search.assistant.performer.communication.p2741f.C35733aa.f93649a
            java.lang.String r13 = "display_name LIKE ? OR display_name_alt LIKE ? OR phonetic_name LIKE ?"
            java.lang.String r15 = "starred DESC"
            com.google.android.libraries.search.m.b.b r16 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_SERVICES_CO
            com.google.apps.tiktok.concurrent.o r2 = r10.mo39825a(r11, r12, r13, r14, r15, r16)
            if (r2 != 0) goto L_0x01f9
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x020e
        L_0x01f9:
            com.google.common.util.concurrent.ay r2 = r2.f121591a
            com.google.android.libraries.search.assistant.performer.communication.f.u r3 = new com.google.android.libraries.search.assistant.performer.communication.f.u
            r3.<init>(r5)
            com.google.common.util.concurrent.al r3 = com.google.apps.tiktok.tracing.C47810es.m84970j(r3)
            com.google.common.util.concurrent.da r0 = r0.f93653d
            com.google.common.util.concurrent.ay r0 = r2.mo57272e(r3, r0)
            com.google.common.util.concurrent.bs r0 = r0.mo57275g()
        L_0x020e:
            com.google.android.libraries.search.assistant.p.c.a.a.ab r2 = new com.google.android.libraries.search.assistant.p.c.a.a.ab
            r2.<init>(r1, r5, r6, r9)
            com.google.common.util.concurrent.da r3 = r1.f92611b
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r3)
        L_0x021d:
            com.google.android.libraries.search.assistant.p.c.a.a.h r2 = com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a.C34954h.f92637a
            com.google.common.util.concurrent.da r3 = r1.f92611b
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r2, r3)
            return r0
        L_0x022a:
            com.google.protos.o.a.j r0 = com.google.protos.p5127o.p5128a.C65629j.f178340d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.o.a.g r0 = (com.google.protos.p5127o.p5128a.C65626g) r0
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.protos.o.a.j r4 = (com.google.protos.p5127o.p5128a.C65629j) r4
            r2.getClass()
            r4.f178343b = r2
            int r2 = r4.f178342a
            r2 = r2 | r3
            r4.f178342a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.o.a.j r0 = (com.google.protos.p5127o.p5128a.C65629j) r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a.C34942ap.mo39645b(com.google.android.libraries.assistant.gallium.framework.e, com.google.protos.o.a.f):com.google.common.util.concurrent.cx");
    }
}
