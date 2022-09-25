package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110656v;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.k */
/* compiled from: PG */
public final class C110886k {

    /* renamed from: a */
    public final C83794j f308905a;

    /* renamed from: b */
    public final C110656v f308906b;

    /* renamed from: c */
    public final C83783a f308907c;

    /* renamed from: d */
    public final C130895ag f308908d;

    /* renamed from: e */
    public final C58974d f308909e;

    /* renamed from: f */
    private final C21370a f308910f;

    /* renamed from: g */
    private final C92122r f308911g;

    /* renamed from: h */
    private final C42876ab f308912h;

    /* renamed from: i */
    private final C42876ab f308913i;

    public C110886k(C21370a aVar, C83794j jVar, C92122r rVar, C110656v vVar, C83783a aVar2, C130895ag agVar, C42876ab abVar, C42876ab abVar2, C83564a aVar3) {
        this.f308910f = aVar;
        this.f308905a = jVar;
        this.f308911g = rVar;
        this.f308906b = vVar;
        this.f308907c = aVar2;
        this.f308908d = agVar;
        this.f308912h = abVar;
        this.f308913i = abVar2;
        this.f308909e = aVar3.mo76900a("CardMergingUtil");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x013f A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008c A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0092 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00af A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b4 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00db A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e0 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0113 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0133 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0138 A[Catch:{ DateTimeParseException -> 0x0160 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m184624b(com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131233b r13, java.util.List r14, com.google.common.util.concurrent.C60870cx r15) {
        /*
            r12 = this;
            java.util.Iterator r0 = r14.iterator()
            r1 = 0
            r8 = 0
        L_0x0006:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x017f
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.opa.smartspace.am r2 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r2
            int r3 = r2.f228250a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0006
            com.google.android.apps.gsa.opa.smartspace.ak r3 = r2.f228251b
            if (r3 != 0) goto L_0x001e
            com.google.android.apps.gsa.opa.smartspace.ak r3 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x001e:
            com.google.android.apps.gsa.opa.smartspace.aj r3 = r3.f228233b
            if (r3 != 0) goto L_0x0024
            com.google.android.apps.gsa.opa.smartspace.aj r3 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x0024:
            int r3 = r3.f228228a
            r4 = 4
            if (r3 != r4) goto L_0x0006
            com.google.android.apps.gsa.opa.smartspace.ak r2 = r2.f228251b
            if (r2 != 0) goto L_0x002f
            com.google.android.apps.gsa.opa.smartspace.ak r2 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x002f:
            com.google.android.apps.gsa.opa.smartspace.aj r2 = r2.f228233b
            if (r2 != 0) goto L_0x0035
            com.google.android.apps.gsa.opa.smartspace.aj r2 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x0035:
            int r3 = r2.f228228a
            if (r3 != r4) goto L_0x003e
            java.lang.Object r2 = r2.f228229b
            com.google.assistant.s.a.es r2 = (com.google.assistant.p3994s.p3995a.C53190es) r2
            goto L_0x0040
        L_0x003e:
            com.google.assistant.s.a.es r2 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x0040:
            com.google.assistant.s.a.el r3 = r2.f139403h
            if (r3 != 0) goto L_0x0046
            com.google.assistant.s.a.el r3 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0046:
            int r3 = r3.f139375a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0170
            com.google.assistant.s.a.el r3 = r2.f139404i
            if (r3 != 0) goto L_0x0052
            com.google.assistant.s.a.el r3 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0052:
            int r3 = r3.f139375a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0170
            r3 = r13
            com.google.android.apps.search.assistant.verticals.ambient.q.e.a r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a) r3     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r3 = r3.f358864b     // Catch:{ DateTimeParseException -> 0x0160 }
            r5 = r13
            com.google.android.apps.search.assistant.verticals.ambient.q.e.a r5 = (com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a) r5     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r5 = r5.f358865c     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r6 = r2.f139403h     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r6 != 0) goto L_0x0068
            com.google.assistant.s.a.el r7 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x0069
        L_0x0068:
            r7 = r6
        L_0x0069:
            int r7 = r7.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r7 = r7 & r4
            if (r7 == 0) goto L_0x0084
            if (r6 != 0) goto L_0x0072
            com.google.assistant.s.a.el r6 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x0072:
            java.lang.String r6 = r6.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r6 = p3186j$.time.OffsetDateTime.parse(r6)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r6 = r6.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r6 = r6.equals(r3)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r6 == 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            com.google.assistant.s.a.el r7 = r2.f139404i     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r7 != 0) goto L_0x008c
            com.google.assistant.s.a.el r9 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x008d
        L_0x008c:
            r9 = r7
        L_0x008d:
            int r9 = r9.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r9 = r9 & r4
            if (r9 == 0) goto L_0x00a8
            if (r7 != 0) goto L_0x0096
            com.google.assistant.s.a.el r7 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x0096:
            java.lang.String r7 = r7.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r7 = p3186j$.time.OffsetDateTime.parse(r7)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r7 = r7.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r7 = r7.equals(r5)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r7 == 0) goto L_0x00a8
            r7 = 1
            goto L_0x00a9
        L_0x00a8:
            r7 = 0
        L_0x00a9:
            int r9 = r2.f139397b     // Catch:{ DateTimeParseException -> 0x0160 }
            r10 = 11
            if (r9 != r10) goto L_0x00b4
            java.lang.Object r11 = r2.f139398c     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r11 = (com.google.assistant.p3994s.p3995a.C53183el) r11     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x00b6
        L_0x00b4:
            com.google.assistant.s.a.el r11 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x00b6:
            int r11 = r11.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r11 = r11 & r4
            if (r11 == 0) goto L_0x00d5
            if (r9 != r10) goto L_0x00c2
            java.lang.Object r9 = r2.f139398c     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r9 = (com.google.assistant.p3994s.p3995a.C53183el) r9     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x00c4
        L_0x00c2:
            com.google.assistant.s.a.el r9 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x00c4:
            java.lang.String r9 = r9.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r9 = p3186j$.time.OffsetDateTime.parse(r9)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r9 = r9.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r9 = r9.equals(r3)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r9 == 0) goto L_0x00d5
            r6 = 1
        L_0x00d5:
            int r9 = r2.f139399d     // Catch:{ DateTimeParseException -> 0x0160 }
            r10 = 14
            if (r9 != r10) goto L_0x00e0
            java.lang.Object r11 = r2.f139400e     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r11 = (com.google.assistant.p3994s.p3995a.C53183el) r11     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x00e2
        L_0x00e0:
            com.google.assistant.s.a.el r11 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x00e2:
            int r11 = r11.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r11 = r11 & r4
            if (r11 == 0) goto L_0x0101
            if (r9 != r10) goto L_0x00ee
            java.lang.Object r9 = r2.f139400e     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r9 = (com.google.assistant.p3994s.p3995a.C53183el) r9     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x00f0
        L_0x00ee:
            com.google.assistant.s.a.el r9 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x00f0:
            java.lang.String r9 = r9.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r9 = p3186j$.time.OffsetDateTime.parse(r9)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r9 = r9.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r9 = r9.equals(r5)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r9 == 0) goto L_0x0101
            r7 = 1
        L_0x0101:
            int r9 = r2.f139397b     // Catch:{ DateTimeParseException -> 0x0160 }
            r10 = 10
            if (r9 != r10) goto L_0x010c
            java.lang.Object r11 = r2.f139398c     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r11 = (com.google.assistant.p3994s.p3995a.C53183el) r11     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x010e
        L_0x010c:
            com.google.assistant.s.a.el r11 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x010e:
            int r11 = r11.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r11 = r11 & r4
            if (r11 == 0) goto L_0x012d
            if (r9 != r10) goto L_0x011a
            java.lang.Object r9 = r2.f139398c     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r9 = (com.google.assistant.p3994s.p3995a.C53183el) r9     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x011c
        L_0x011a:
            com.google.assistant.s.a.el r9 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x011c:
            java.lang.String r9 = r9.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r9 = p3186j$.time.OffsetDateTime.parse(r9)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r9 = r9.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r3 = r9.equals(r3)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r3 == 0) goto L_0x012d
            r6 = 1
        L_0x012d:
            int r3 = r2.f139399d     // Catch:{ DateTimeParseException -> 0x0160 }
            r9 = 13
            if (r3 != r9) goto L_0x0138
            java.lang.Object r10 = r2.f139400e     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r10 = (com.google.assistant.p3994s.p3995a.C53183el) r10     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x013a
        L_0x0138:
            com.google.assistant.s.a.el r10 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x013a:
            int r10 = r10.f139375a     // Catch:{ DateTimeParseException -> 0x0160 }
            r10 = r10 & r4
            if (r10 == 0) goto L_0x0159
            if (r3 != r9) goto L_0x0146
            java.lang.Object r2 = r2.f139400e     // Catch:{ DateTimeParseException -> 0x0160 }
            com.google.assistant.s.a.el r2 = (com.google.assistant.p3994s.p3995a.C53183el) r2     // Catch:{ DateTimeParseException -> 0x0160 }
            goto L_0x0148
        L_0x0146:
            com.google.assistant.s.a.el r2 = com.google.assistant.p3994s.p3995a.C53183el.f139373c     // Catch:{ DateTimeParseException -> 0x0160 }
        L_0x0148:
            java.lang.String r2 = r2.f139376b     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.OffsetDateTime r2 = p3186j$.time.OffsetDateTime.parse(r2)     // Catch:{ DateTimeParseException -> 0x0160 }
            j$.time.Instant r2 = r2.toInstant()     // Catch:{ DateTimeParseException -> 0x0160 }
            boolean r2 = r2.equals(r5)     // Catch:{ DateTimeParseException -> 0x0160 }
            if (r2 == 0) goto L_0x0159
            r7 = 1
        L_0x0159:
            if (r6 == 0) goto L_0x0006
            if (r7 == 0) goto L_0x0006
            r8 = 1
            goto L_0x0006
        L_0x0160:
            r2 = move-exception
            com.google.common.f.a.d r3 = r12.f308909e
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Not able to parse the time stamp from flight card."
            r5 = 26823(0x68c7, float:3.7587E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0006
        L_0x0170:
            com.google.common.f.a.d r2 = r12.f308909e
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Flight card does not have time stamps to dedup calendar."
            r4 = 26822(0x68c6, float:3.7586E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0006
        L_0x017f:
            com.google.android.apps.search.assistant.verticals.ambient.q.e.a r13 = (com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a) r13
            long r4 = r13.f358863a
            java.lang.String r13 = r13.f358866d
            java.lang.String r0 = "Flight to"
            boolean r13 = r13.startsWith(r0)
            if (r13 == 0) goto L_0x01a5
            com.google.android.apps.gsa.smartspace.r r13 = r12.f308911g
            com.google.android.apps.gsa.smartspace.o r13 = r13.f256848d
            boolean r13 = r13.mo86757m()
            if (r13 == 0) goto L_0x01a5
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.h r13 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.h
            r2 = r13
            r3 = r12
            r6 = r8
            r7 = r14
            r2.<init>(r3, r4, r6, r7)
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r15, r13, r14)
        L_0x01a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110886k.m184624b(com.google.android.apps.search.assistant.verticals.ambient.q.e.b, java.util.List, com.google.common.util.concurrent.cx):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo98915a(java.util.List r28) {
        /*
            r27 = this;
            r0 = r27
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r28.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            r7 = 2
            r8 = 4
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5.next()
            com.google.android.apps.gsa.opa.smartspace.am r6 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r6
            com.google.assistant.c.cr r9 = com.google.assistant.p3886c.C50794cr.UNDEFINED
            com.google.assistant.c.do r9 = r6.f228252c
            if (r9 != 0) goto L_0x0030
            com.google.assistant.c.do r9 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0030:
            int r9 = r9.f132315l
            com.google.assistant.c.cr r9 = com.google.assistant.p3886c.C50794cr.m85938a(r9)
            if (r9 != 0) goto L_0x003a
            com.google.assistant.c.cr r9 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x003a:
            int r9 = r9.ordinal()
            if (r9 == r7) goto L_0x0055
            if (r9 == r8) goto L_0x004e
            r7 = 24
            if (r9 == r7) goto L_0x004a
            r1.add(r6)
            goto L_0x001a
        L_0x004a:
            r3.add(r6)
            goto L_0x001a
        L_0x004e:
            r2.add(r6)
            r1.add(r6)
            goto L_0x001a
        L_0x0055:
            r4.add(r6)
            goto L_0x001a
        L_0x0059:
            boolean r5 = r2.isEmpty()
            r6 = 0
            if (r5 == 0) goto L_0x0062
            goto L_0x020f
        L_0x0062:
            com.google.android.libraries.storage.protostore.ab r5 = r0.f308913i
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.libraries.f.a r12 = r0.f308910f
            long r12 = r12.mo26870b()
            j$.time.Instant r12 = p3186j$.time.Instant.ofEpochMilli(r12)
            java.util.Iterator r13 = r2.iterator()
        L_0x0080:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01f8
            java.lang.Object r14 = r13.next()
            com.google.android.apps.gsa.opa.smartspace.am r14 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r14
            com.google.assistant.c.do r15 = r14.f228252c
            if (r15 != 0) goto L_0x0092
            com.google.assistant.c.do r15 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0092:
            int r15 = r15.f132307d
            r16 = r10
            long r9 = (long) r15
            int r15 = r14.f228250a
            r15 = r15 & r7
            if (r15 == 0) goto L_0x00da
            com.google.android.apps.gsa.opa.smartspace.ak r15 = r14.f228251b
            if (r15 != 0) goto L_0x00a2
            com.google.android.apps.gsa.opa.smartspace.ak r15 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x00a2:
            com.google.android.apps.gsa.opa.smartspace.aj r15 = r15.f228233b
            if (r15 != 0) goto L_0x00a8
            com.google.android.apps.gsa.opa.smartspace.aj r15 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x00a8:
            int r15 = r15.f228228a
            if (r15 != r8) goto L_0x00da
            com.google.android.apps.gsa.opa.smartspace.ak r15 = r14.f228251b
            if (r15 != 0) goto L_0x00b2
            com.google.android.apps.gsa.opa.smartspace.ak r15 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x00b2:
            com.google.android.apps.gsa.opa.smartspace.aj r15 = r15.f228233b
            if (r15 != 0) goto L_0x00b8
            com.google.android.apps.gsa.opa.smartspace.aj r15 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x00b8:
            int r7 = r15.f228228a
            if (r7 != r8) goto L_0x00c1
            java.lang.Object r7 = r15.f228229b
            com.google.assistant.s.a.es r7 = (com.google.assistant.p3994s.p3995a.C53190es) r7
            goto L_0x00c3
        L_0x00c1:
            com.google.assistant.s.a.es r7 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x00c3:
            com.google.protobuf.cq r15 = r7.f139407l
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x00da
            com.google.protobuf.cq r7 = r7.f139407l
            java.lang.Object r7 = r7.get(r6)
            com.google.assistant.s.a.en r7 = (com.google.assistant.p3994s.p3995a.C53185en) r7
            int r7 = r7.f139379a
            r7 = r7 & r8
            if (r7 == 0) goto L_0x00da
            r7 = 1
            goto L_0x00db
        L_0x00da:
            r7 = 0
        L_0x00db:
            int r15 = r14.f228250a
            r17 = 2
            r15 = r15 & 2
            if (r15 == 0) goto L_0x0187
            com.google.android.apps.gsa.opa.smartspace.ak r15 = r14.f228251b
            if (r15 != 0) goto L_0x00e9
            com.google.android.apps.gsa.opa.smartspace.ak r15 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x00e9:
            com.google.android.apps.gsa.opa.smartspace.aj r15 = r15.f228233b
            if (r15 != 0) goto L_0x00ef
            com.google.android.apps.gsa.opa.smartspace.aj r15 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x00ef:
            int r15 = r15.f228228a
            if (r15 != r8) goto L_0x0187
            com.google.android.apps.gsa.opa.smartspace.ak r14 = r14.f228251b
            if (r14 != 0) goto L_0x00f9
            com.google.android.apps.gsa.opa.smartspace.ak r14 = com.google.android.apps.gsa.opa.smartspace.C83739ak.f228230q
        L_0x00f9:
            com.google.android.apps.gsa.opa.smartspace.aj r14 = r14.f228233b
            if (r14 != 0) goto L_0x00ff
            com.google.android.apps.gsa.opa.smartspace.aj r14 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x00ff:
            int r15 = r14.f228228a
            if (r15 != r8) goto L_0x0108
            java.lang.Object r14 = r14.f228229b
            com.google.assistant.s.a.es r14 = (com.google.assistant.p3994s.p3995a.C53190es) r14
            goto L_0x010a
        L_0x0108:
            com.google.assistant.s.a.es r14 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x010a:
            int r15 = r14.f139397b
            r6 = 11
            if (r15 != r6) goto L_0x0115
            java.lang.Object r15 = r14.f139398c
            com.google.assistant.s.a.el r15 = (com.google.assistant.p3994s.p3995a.C53183el) r15
            goto L_0x0117
        L_0x0115:
            com.google.assistant.s.a.el r15 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0117:
            int r15 = r15.f139375a
            r19 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x0139
            int r15 = r14.f139397b
            if (r15 != r6) goto L_0x0128
            java.lang.Object r6 = r14.f139398c
            com.google.assistant.s.a.el r6 = (com.google.assistant.p3994s.p3995a.C53183el) r6
            goto L_0x012a
        L_0x0128:
            com.google.assistant.s.a.el r6 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x012a:
            java.lang.String r6 = r6.f139376b
            j$.time.OffsetDateTime r6 = p3186j$.time.OffsetDateTime.parse(r6)
            j$.time.Instant r6 = r6.toInstant()
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x018b
        L_0x0139:
            int r6 = r14.f139397b
            r15 = 10
            if (r6 != r15) goto L_0x0144
            java.lang.Object r8 = r14.f139398c
            com.google.assistant.s.a.el r8 = (com.google.assistant.p3994s.p3995a.C53183el) r8
            goto L_0x0146
        L_0x0144:
            com.google.assistant.s.a.el r8 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0146:
            int r8 = r8.f139375a
            r20 = 1
            r8 = r8 & 1
            if (r8 == 0) goto L_0x0166
            if (r6 != r15) goto L_0x0155
            java.lang.Object r6 = r14.f139398c
            com.google.assistant.s.a.el r6 = (com.google.assistant.p3994s.p3995a.C53183el) r6
            goto L_0x0157
        L_0x0155:
            com.google.assistant.s.a.el r6 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0157:
            java.lang.String r6 = r6.f139376b
            j$.time.OffsetDateTime r6 = p3186j$.time.OffsetDateTime.parse(r6)
            j$.time.Instant r6 = r6.toInstant()
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x018b
        L_0x0166:
            com.google.assistant.s.a.el r6 = r14.f139403h
            if (r6 != 0) goto L_0x016d
            com.google.assistant.s.a.el r8 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
            goto L_0x016e
        L_0x016d:
            r8 = r6
        L_0x016e:
            int r8 = r8.f139375a
            r14 = 1
            r8 = r8 & r14
            if (r8 == 0) goto L_0x0187
            if (r6 != 0) goto L_0x0178
            com.google.assistant.s.a.el r6 = com.google.assistant.p3994s.p3995a.C53183el.f139373c
        L_0x0178:
            java.lang.String r6 = r6.f139376b
            j$.time.OffsetDateTime r6 = p3186j$.time.OffsetDateTime.parse(r6)
            j$.time.Instant r6 = r6.toInstant()
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x018b
        L_0x0187:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
        L_0x018b:
            com.google.android.apps.gsa.opa.smartspace.d.l r8 = com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l.f228317f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.d.k r8 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83768k) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.android.apps.gsa.opa.smartspace.d.l r14 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l) r14
            int r15 = r14.f228319a
            r20 = 1
            r15 = r15 | 1
            r14.f228319a = r15
            r14.f228320b = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.opa.smartspace.d.l r9 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l) r9
            int r10 = r9.f228319a
            r14 = 4
            r10 = r10 | r14
            r9.f228319a = r10
            r9.f228322d = r7
            long r9 = r12.toEpochMilli()
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.apps.gsa.opa.smartspace.d.l r7 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l) r7
            int r15 = r7.f228319a
            r17 = 2
            r15 = r15 | 2
            r7.f228319a = r15
            r7.f228321c = r9
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto L_0x01e7
            java.lang.Object r6 = r6.get()
            j$.time.Instant r6 = (p3186j$.time.Instant) r6
            long r6 = r6.toEpochMilli()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.opa.smartspace.d.l r9 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l) r9
            int r10 = r9.f228319a
            r10 = r10 | 8
            r9.f228319a = r10
            r9.f228323e = r6
        L_0x01e7:
            com.google.protobuf.bv r6 = r8.build()
            com.google.android.apps.gsa.opa.smartspace.d.l r6 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l) r6
            r7 = r16
            r7.add(r6)
            r10 = r7
            r6 = 0
            r7 = 2
            r8 = 4
            goto L_0x0080
        L_0x01f8:
            r7 = r10
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.j r6 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.j
            r6.<init>(r0, r7, r11, r12)
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r5, r6, r7)
            com.google.android.libraries.storage.protostore.ab r5 = r0.f308913i
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.b r6 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.b
            r6.<init>(r11)
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            r5.mo46039a(r6, r7)
        L_0x020f:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            com.google.android.libraries.storage.protostore.ab r8 = r0.f308912h
            com.google.common.util.concurrent.cx r8 = r8.mo46042d()
            int r9 = r4.size()
            r10 = 0
        L_0x0229:
            if (r10 >= r9) goto L_0x0420
            java.lang.Object r11 = r4.get(r10)
            com.google.android.apps.gsa.opa.smartspace.am r11 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r11
            com.google.assistant.c.do r12 = r11.f228252c
            if (r12 != 0) goto L_0x0237
            com.google.assistant.c.do r12 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x0237:
            com.google.assistant.c.dj r13 = r12.f132329z
            if (r13 != 0) goto L_0x023d
            com.google.assistant.c.dj r13 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x023d:
            com.google.protobuf.bt r14 = com.google.assistant.p3886c.C50749bn.f132064d
            com.google.protobuf.bt r14 = com.google.protobuf.C62942bv.checkIsLite(r14)
            r13.mo58887l(r14)
            com.google.protobuf.bf r13 = r13.f169962ag
            com.google.protobuf.bs r15 = r14.f169971d
            java.lang.Object r13 = r13.mo58854l(r15)
            if (r13 != 0) goto L_0x0253
            java.lang.Object r13 = r14.f169969b
            goto L_0x0257
        L_0x0253:
            java.lang.Object r13 = r14.mo58889c(r13)
        L_0x0257:
            com.google.assistant.c.bn r13 = (com.google.assistant.p3886c.C50749bn) r13
            com.google.android.apps.search.assistant.verticals.ambient.q.e.b r13 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131233b.m213726d(r13)
            boolean r14 = r5.add(r13)
            if (r14 != 0) goto L_0x026f
            r19 = r3
            r18 = r4
            r17 = r5
            r20 = r9
            r5 = r10
        L_0x026c:
            r13 = 1
            goto L_0x0414
        L_0x026f:
            com.google.android.apps.gsa.opa.smartspace.j r14 = r0.f308905a
            com.google.android.apps.gsa.search.core.i.t r14 = r14.f228394e
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246730m
            boolean r14 = r14.mo79746e(r15)
            if (r14 == 0) goto L_0x0345
            r14 = r13
            com.google.android.apps.search.assistant.verticals.ambient.q.e.a r14 = (com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a) r14
            j$.time.Instant r15 = r14.f358864b
            java.util.Iterator r16 = r3.iterator()
        L_0x0284:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x031e
            java.lang.Object r17 = r16.next()
            r18 = r4
            r4 = r17
            com.google.android.apps.gsa.opa.smartspace.am r4 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r4
            r17 = r5
            com.google.assistant.c.do r5 = r4.f228252c
            if (r5 != 0) goto L_0x029c
            com.google.assistant.c.do r5 = com.google.assistant.p3886c.C50818do.f132293H
        L_0x029c:
            com.google.assistant.c.dj r5 = r5.f132329z
            if (r5 != 0) goto L_0x02a2
            com.google.assistant.c.dj r5 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x02a2:
            com.google.protobuf.bt r19 = com.google.assistant.p3886c.C50784ch.f132156d
            r20 = r9
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r19)
            r5.mo58887l(r9)
            com.google.protobuf.bf r5 = r5.f169962ag
            r19 = r3
            com.google.protobuf.bs r3 = r9.f169971d
            java.lang.Object r3 = r5.mo58854l(r3)
            if (r3 != 0) goto L_0x02bc
            java.lang.Object r3 = r9.f169969b
            goto L_0x02c0
        L_0x02bc:
            java.lang.Object r3 = r9.mo58889c(r3)
        L_0x02c0:
            com.google.assistant.c.ch r3 = (com.google.assistant.p3886c.C50784ch) r3
            int r5 = r3.f132158a
            r9 = 1
            r5 = r5 & r9
            if (r5 == 0) goto L_0x0314
            com.google.android.apps.search.assistant.platform.pcp.f.bx r3 = r3.f132159b
            if (r3 != 0) goto L_0x02ce
            com.google.android.apps.search.assistant.platform.pcp.f.bx r3 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx.f341854l
        L_0x02ce:
            int r5 = r3.f341856a
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0314
            r5 = r10
            long r9 = r3.f341866k
            j$.time.Instant r9 = p3186j$.time.Instant.ofEpochSecond(r9)
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x0313
            java.lang.String r3 = r3.f341859d
            java.lang.String r9 = r14.f358866d
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L_0x02fd
            com.google.common.f.a.d r3 = r0.f308909e
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r9 = "Calendar event has same start time and overlapped title with TTL. The TTL card is considered as a duplicate of calendar event."
            r10 = 26820(0x68c4, float:3.7583E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r10)).mo56386p(r9)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x032b
        L_0x02fd:
            boolean r3 = r14.f358867e
            if (r3 == 0) goto L_0x0313
            com.google.common.f.a.d r3 = r0.f308909e
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r9 = "GI-inferred calendar event has same start time with TTL. The TTL card is considered as a duplicate of calendar event."
            r10 = 26819(0x68c3, float:3.7581E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r10)).mo56386p(r9)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x032b
        L_0x0313:
            r10 = r5
        L_0x0314:
            r5 = r17
            r4 = r18
            r3 = r19
            r9 = r20
            goto L_0x0284
        L_0x031e:
            r19 = r3
            r18 = r4
            r17 = r5
            r20 = r9
            r5 = r10
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x032b:
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x034e
            java.lang.Object r3 = r3.get()
            com.google.android.apps.gsa.opa.smartspace.am r3 = (com.google.android.apps.gsa.opa.smartspace.C83741am) r3
            r7.add(r3)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.f r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.f
            r3.<init>(r0, r13)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r3, r4)
            goto L_0x034e
        L_0x0345:
            r19 = r3
            r18 = r4
            r17 = r5
            r20 = r9
            r5 = r10
        L_0x034e:
            r3 = r13
            com.google.android.apps.search.assistant.verticals.ambient.q.e.a r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131232a) r3
            boolean r4 = r3.f358867e
            if (r4 == 0) goto L_0x03ef
            boolean r4 = r0.m184624b(r13, r2, r8)
            if (r4 == 0) goto L_0x03ef
            com.google.common.f.a.d r3 = r0.f308909e
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Exclude a calendar event which is duplicate with a flight card."
            r9 = 26821(0x68c5, float:3.7584E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r9)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r3 = r0.f308908d
            java.lang.String r4 = "DUPLICATE_CALENDAR_CARD"
            r3.mo109917ao(r4)
            com.google.assistant.c.ct r3 = r12.f132320q
            if (r3 != 0) goto L_0x0375
            com.google.assistant.c.ct r3 = com.google.assistant.p3886c.C50796ct.f132223c
        L_0x0375:
            long r3 = r3.f132226b
            com.google.android.libraries.f.a r9 = r0.f308910f
            long r9 = r9.mo26870b()
            long r3 = r3 - r9
            int r9 = r12.f132307d
            java.lang.String r9 = java.lang.Integer.toString(r9)
            com.google.assistant.c.cr r10 = com.google.assistant.p3886c.C50794cr.CALENDAR
            boolean r11 = r12.f132322s
            com.google.android.apps.gsa.opa.smartspace.y r12 = com.google.android.apps.gsa.opa.smartspace.C83809y.f228409d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.x r12 = (com.google.android.apps.gsa.opa.smartspace.C83808x) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.apps.gsa.opa.smartspace.y r13 = (com.google.android.apps.gsa.opa.smartspace.C83809y) r13
            int r14 = r10.f132222T
            r13.f228412b = r14
            int r14 = r13.f228411a
            r15 = 1
            r14 = r14 | r15
            r13.f228411a = r14
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.apps.gsa.opa.smartspace.y r12 = (com.google.android.apps.gsa.opa.smartspace.C83809y) r12
            com.google.common.f.a.d r13 = r0.f308909e
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            r14 = 26817(0x68c1, float:3.7579E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            java.lang.String r10 = r10.name()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)
            java.lang.String r15 = "Dismiss card id: %s, type: %s, is Work profile: %b"
            r13.mo56359L(r15, r9, r10, r14)
            com.google.android.apps.gsa.opa.smartspace.j r10 = r0.f308905a
            boolean r10 = r10.mo77183v()
            if (r10 == 0) goto L_0x03dd
            com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.v r10 = r0.f308906b
            r21 = r10
            r22 = r9
            r23 = r12
            r24 = r3
            r26 = r11
            com.google.common.util.concurrent.cx r3 = r21.mo98833d(r22, r23, r24, r26)
            goto L_0x03e3
        L_0x03dd:
            com.google.android.apps.gsa.opa.smartspace.e.a r10 = r0.f308907c
            com.google.common.util.concurrent.cx r3 = r10.mo77112k(r9, r12, r3)
        L_0x03e3:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.a r4 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.a
            r4.<init>(r0, r9)
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60922j.m93045h(r3, r4, r9)
            goto L_0x026c
        L_0x03ef:
            com.google.android.apps.gsa.opa.smartspace.d.f r4 = com.google.android.apps.gsa.opa.smartspace.p6455d.C83763f.f228305d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.opa.smartspace.d.e r4 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83762e) r4
            long r9 = r3.f358863a
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.gsa.opa.smartspace.d.f r3 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83763f) r3
            int r12 = r3.f228307a
            r13 = 1
            r12 = r12 | r13
            r3.f228307a = r12
            r3.f228308b = r9
            com.google.protobuf.bv r3 = r4.build()
            com.google.android.apps.gsa.opa.smartspace.d.f r3 = (com.google.android.apps.gsa.opa.smartspace.p6455d.C83763f) r3
            r6.add(r3)
            r1.add(r11)
        L_0x0414:
            int r10 = r5 + 1
            r5 = r17
            r4 = r18
            r3 = r19
            r9 = r20
            goto L_0x0229
        L_0x0420:
            r19 = r3
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r19)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.c r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.c
            r3.<init>(r7)
            j$.util.stream.Stream r2 = r2.filter(r3)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toSet()
            java.lang.Object r2 = r2.collect(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            com.google.android.libraries.storage.protostore.ab r2 = r0.f308912h
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.d r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.p.d
            r3.<init>(r6)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            r2.mo46039a(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110886k.mo98915a(java.util.List):java.util.List");
    }
}
