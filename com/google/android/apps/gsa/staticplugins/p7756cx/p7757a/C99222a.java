package com.google.android.apps.gsa.staticplugins.p7756cx.p7757a;

import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.a.a */
/* compiled from: PG */
public final class C99222a {

    /* renamed from: a */
    private static final C59071e f277584a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cx.a.a");

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x032a, code lost:
        if (r3.mo56642a() >= r9.mo56642a()) goto L_0x032c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0449  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.reminders.model.C145822ab m164535a(com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument r29, com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument r30, com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r31) {
        /*
            r0 = r29
            r1 = r30
            com.google.android.gms.reminders.model.ab r2 = new com.google.android.gms.reminders.model.ab
            r2.<init>()
            r3 = 3
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x01a1
            boolean r9 = r29.mo81263C()
            if (r9 == 0) goto L_0x0176
            boolean r9 = r29.mo81341O()
            if (r9 != 0) goto L_0x001e
            goto L_0x0176
        L_0x001e:
            java.lang.Object r9 = r0.f236203n
            com.google.bb.a.nc r9 = (com.google.p4152bb.p4153a.C55296nc) r9
            if (r9 != 0) goto L_0x0026
            goto L_0x0176
        L_0x0026:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument r10 = r29.mo81339M()
            java.util.Calendar r10 = r10.mo81293a()
            java.lang.Object r0 = r0.f236203n
            com.google.bb.a.nc r0 = (com.google.p4152bb.p4153a.C55296nc) r0
            if (r0 == 0) goto L_0x005e
            int r11 = r0.f145665a
            r11 = r11 & r5
            if (r11 == 0) goto L_0x005e
            int r0 = r0.f145667c
            int r0 = com.google.p4152bb.p4153a.C55417t.m87684a(r0)
            if (r0 != 0) goto L_0x0042
            r0 = 1
        L_0x0042:
            int r0 = r0 + -1
            com.google.android.apps.gsa.search.shared.actions.util.t[] r11 = com.google.android.apps.gsa.search.shared.actions.util.C87498t.values()
            int r12 = r11.length
            r13 = 0
        L_0x004a:
            if (r13 >= r12) goto L_0x005b
            r14 = r11[r13]
            int r15 = r14.f236330g
            int r4 = r15 + -1
            if (r15 == 0) goto L_0x005a
            if (r4 != r0) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            int r13 = r13 + 1
            goto L_0x004a
        L_0x005a:
            throw r7
        L_0x005b:
            com.google.android.apps.gsa.search.shared.actions.util.t r14 = com.google.android.apps.gsa.search.shared.actions.util.C87498t.TIME_UNSPECIFIED
            goto L_0x005f
        L_0x005e:
            r14 = r7
        L_0x005f:
            int r0 = r9.f145665a
            r0 = r0 & r8
            if (r0 == 0) goto L_0x007d
            com.google.bb.a.r r0 = r9.f145666b
            if (r0 != 0) goto L_0x006a
            com.google.bb.a.r r0 = com.google.p4152bb.p4153a.C55401r.f145976e
        L_0x006a:
            int r0 = r0.f145979b
            com.google.bb.a.r r4 = r9.f145666b
            if (r4 != 0) goto L_0x0073
            com.google.bb.a.r r9 = com.google.p4152bb.p4153a.C55401r.f145976e
            goto L_0x0074
        L_0x0073:
            r9 = r4
        L_0x0074:
            int r9 = r9.f145980c
            if (r4 != 0) goto L_0x007a
            com.google.bb.a.r r4 = com.google.p4152bb.p4153a.C55401r.f145976e
        L_0x007a:
            int r4 = r4.f145981d
            goto L_0x009e
        L_0x007d:
            if (r14 == 0) goto L_0x0082
            int r0 = r14.f236329f
            goto L_0x009c
        L_0x0082:
            com.google.common.f.e r0 = f277584a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "ModularArgumentsConv"
            r0.mo56378ag(r4, r9)
            java.lang.String r4 = "Both localTime and symbolicTime are null"
            r9 = 31685(0x7bc5, float:4.44E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            com.google.android.apps.gsa.search.shared.actions.util.t r0 = com.google.android.apps.gsa.search.shared.actions.util.C87498t.TIME_UNSPECIFIED
            int r0 = r0.f236329f
        L_0x009c:
            r4 = 0
            r9 = 0
        L_0x009e:
            com.google.android.apps.gsa.search.shared.actions.util.t r11 = com.google.android.apps.gsa.search.shared.actions.util.C87498t.TIME_UNSPECIFIED
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x00a9
            r11 = r7
            r12 = 1
            goto L_0x00d8
        L_0x00a9:
            if (r14 == 0) goto L_0x00d6
            int r11 = r14.f236330g
            int r12 = r11 + -1
            if (r11 == 0) goto L_0x00d5
            if (r12 == 0) goto L_0x00cf
            if (r12 == r8) goto L_0x00cd
            if (r12 == r5) goto L_0x00cb
            if (r12 != r3) goto L_0x00bb
            r11 = 4
            goto L_0x00d0
        L_0x00bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid symbolic time:"
            java.lang.String r2 = java.lang.Integer.toString(r12)
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x00cb:
            r11 = 3
            goto L_0x00d0
        L_0x00cd:
            r11 = 2
            goto L_0x00d0
        L_0x00cf:
            r11 = 1
        L_0x00d0:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00d7
        L_0x00d5:
            throw r7
        L_0x00d6:
            r11 = r7
        L_0x00d7:
            r12 = 0
        L_0x00d8:
            r13 = 11
            r10.set(r13, r0)
            r0 = 12
            r10.set(r0, r9)
            r9 = 13
            r10.set(r9, r4)
            com.google.android.gms.reminders.model.f r4 = new com.google.android.gms.reminders.model.f
            r4.<init>()
            int r14 = r10.get(r8)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.f394367a = r14
            int r14 = r10.get(r5)
            int r14 = r14 + r8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.f394368b = r14
            r14 = 5
            int r14 = r10.get(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.f394369c = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            r4.f394373g = r14
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r4.f394374h = r12
            int r12 = r10.get(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r0 = r10.get(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r9 = r10.get(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.gms.reminders.model.TimeEntity r13 = new com.google.android.gms.reminders.model.TimeEntity
            r13.<init>(r12, r0, r9)
            r4.f394370d = r13
            if (r11 == 0) goto L_0x015d
            int r0 = r11.intValue()
            if (r0 == r8) goto L_0x0155
            int r0 = r11.intValue()
            if (r0 == r5) goto L_0x0155
            int r0 = r11.intValue()
            if (r0 == r3) goto L_0x0155
            int r0 = r11.intValue()
            r9 = 4
            if (r0 != r9) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            r0 = 0
            goto L_0x0156
        L_0x0155:
            r0 = 1
        L_0x0156:
            java.lang.String r9 = "Invalid constant for Period. Use value in ModelConstants"
            com.google.android.gms.common.internal.C143919bh.m233960c(r0, r9)
            r4.f394371e = r11
        L_0x015d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = com.google.android.libraries.p11024al.p11025a.C147754j.m240816d(r0)
            if (r0 == 0) goto L_0x0171
            long r9 = r10.getTimeInMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r4.f394372f = r0
        L_0x0171:
            com.google.android.gms.reminders.model.DateTime r0 = r4.mo122198a()
            goto L_0x0177
        L_0x0176:
            r0 = r7
        L_0x0177:
            if (r0 == 0) goto L_0x01a1
            r2.mo122170b(r0)
            if (r1 == 0) goto L_0x01a1
            java.lang.Object r1 = r1.f236203n
            com.android.b.s r1 = (com.android.p256b.C5033s) r1
            if (r1 != 0) goto L_0x0186
            r0 = r7
            goto L_0x019c
        L_0x0186:
            com.google.android.gms.reminders.model.s r4 = new com.google.android.gms.reminders.model.s
            r4.<init>()
            com.google.android.gms.reminders.model.Recurrence r0 = com.google.android.libraries.p11024al.p11025a.C147755k.m240817a(r1, r0)
            r4.mo122223b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r4.f394395b = r0
            com.google.android.gms.reminders.model.RecurrenceInfo r0 = r4.mo122222a()
        L_0x019c:
            if (r0 == 0) goto L_0x01a1
            r2.mo122173e(r0)
        L_0x01a1:
            if (r31 == 0) goto L_0x044c
            com.google.bb.a.gh r0 = r31.mo81312g()
            if (r0 != 0) goto L_0x01ac
            r1 = r7
            goto L_0x03b1
        L_0x01ac:
            com.google.android.gms.reminders.model.j r1 = new com.google.android.gms.reminders.model.j
            r1.<init>()
            int r4 = r0.f145019a
            r9 = r4 & 1
            if (r9 == 0) goto L_0x01bb
            java.lang.String r9 = r0.f145021c
            r1.f394378c = r9
        L_0x01bb:
            r9 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01ce
            double r3 = r0.f145025g
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1.f394379d = r3
            goto L_0x034d
        L_0x01ce:
            r9 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r9
            if (r4 == 0) goto L_0x034d
            com.google.common.g.au r4 = new com.google.common.g.au
            com.google.bb.a.gn r9 = r0.f145026h
            if (r9 != 0) goto L_0x01dc
            com.google.bb.a.gn r9 = com.google.p4152bb.p4153a.C55118gn.f145047e
        L_0x01dc:
            int r9 = r9.f145049a
            com.google.bb.a.gn r10 = r0.f145026h
            if (r10 != 0) goto L_0x01e5
            com.google.bb.a.gn r11 = com.google.p4152bb.p4153a.C55118gn.f145047e
            goto L_0x01e6
        L_0x01e5:
            r11 = r10
        L_0x01e6:
            int r11 = r11.f145050b
            com.google.common.g.at r9 = com.google.common.p4535g.C59127at.m91611c(r9, r11)
            if (r10 != 0) goto L_0x01f1
            com.google.bb.a.gn r11 = com.google.p4152bb.p4153a.C55118gn.f145047e
            goto L_0x01f2
        L_0x01f1:
            r11 = r10
        L_0x01f2:
            int r11 = r11.f145051c
            if (r10 != 0) goto L_0x01f8
            com.google.bb.a.gn r10 = com.google.p4152bb.p4153a.C55118gn.f145047e
        L_0x01f8:
            int r10 = r10.f145052d
            com.google.common.g.at r10 = com.google.common.p4535g.C59127at.m91611c(r11, r10)
            r4.<init>((com.google.common.p4535g.C59127at) r9, (com.google.common.p4535g.C59127at) r10)
            com.google.common.g.av r4 = r4.mo56461d()
            com.google.common.g.h r9 = r4.f157134a
            boolean r10 = r9.mo56592h()
            if (r10 == 0) goto L_0x0213
            com.google.common.g.r r3 = com.google.common.p4535g.C59224r.m91904b()
            goto L_0x032d
        L_0x0213:
            double r10 = r9.f157289a
            double r12 = r9.f157290b
            double r14 = r10 + r12
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            r20 = 0
            int r9 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x022d
            double r12 = r12 + r18
            r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r27 = r9
            goto L_0x0231
        L_0x022d:
            double r12 = r18 - r10
            r27 = r16
        L_0x0231:
            com.google.common.g.bb r9 = new com.google.common.g.bb
            r23 = 0
            r25 = 0
            r22 = r9
            r22.<init>(r23, r25, r27)
            double r10 = com.google.common.p4535g.C59222p.f157311c
            com.google.common.g.l r14 = new com.google.common.g.l
            double r10 = r10 + r10
            double r10 = r10 + r16
            double r10 = r10 * r12
            r14.<init>(r10)
            com.google.common.g.r r9 = com.google.common.p4535g.C59224r.m91905c(r9, r14)
            com.google.common.g.n r10 = r4.f157135b
            double r11 = r10.mo56625a()
            r13 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x032c
            com.google.common.g.h r11 = r4.f157134a
            double r12 = r11.f157289a
            double r14 = r11.f157290b
            double r12 = r12 + r14
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r14
            double r6 = r10.f157306a
            r29 = r4
            double r3 = r10.f157307b
            double r6 = r6 + r3
            double r6 = r6 * r14
            boolean r3 = r10.mo56637n()
            if (r3 != 0) goto L_0x0276
            goto L_0x0286
        L_0x0276:
            int r3 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r3 > 0) goto L_0x0280
            r3 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            goto L_0x0285
        L_0x0280:
            r3 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
        L_0x0285:
            double r6 = r6 + r3
        L_0x0286:
            com.google.common.g.at r3 = new com.google.common.g.at
            r3.<init>((double) r12, (double) r6)
            com.google.common.g.bb r3 = r3.mo56453d()
            com.google.common.g.l r4 = com.google.common.p4535g.C59218l.f157298b
            com.google.common.g.r r3 = com.google.common.p4535g.C59224r.m91905c(r3, r4)
            r4 = 4
            r6 = 0
        L_0x0297:
            if (r6 >= r4) goto L_0x0320
            if (r6 == 0) goto L_0x02dc
            if (r6 == r8) goto L_0x02cb
            if (r6 == r5) goto L_0x02ba
            r4 = 3
            if (r6 != r4) goto L_0x02b2
            r7 = r29
            com.google.common.g.h r10 = r7.f157134a
            double r12 = r10.f157290b
            com.google.common.g.n r10 = r7.f157135b
            double r14 = r10.f157306a
            com.google.common.g.at r10 = new com.google.common.g.at
            r10.<init>((double) r12, (double) r14)
            goto L_0x02ec
        L_0x02b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid vertex index."
            r0.<init>(r1)
            throw r0
        L_0x02ba:
            r4 = 3
            r7 = r29
            com.google.common.g.h r10 = r7.f157134a
            double r12 = r10.f157290b
            com.google.common.g.n r10 = r7.f157135b
            double r14 = r10.f157307b
            com.google.common.g.at r10 = new com.google.common.g.at
            r10.<init>((double) r12, (double) r14)
            goto L_0x02ec
        L_0x02cb:
            r4 = 3
            r7 = r29
            com.google.common.g.h r10 = r7.f157134a
            double r12 = r10.f157289a
            com.google.common.g.n r10 = r7.f157135b
            double r14 = r10.f157307b
            com.google.common.g.at r10 = new com.google.common.g.at
            r10.<init>((double) r12, (double) r14)
            goto L_0x02ec
        L_0x02dc:
            r4 = 3
            r7 = r29
            com.google.common.g.h r10 = r7.f157134a
            double r12 = r10.f157289a
            com.google.common.g.n r10 = r7.f157135b
            double r14 = r10.f157306a
            com.google.common.g.at r10 = new com.google.common.g.at
            r10.<init>((double) r12, (double) r14)
        L_0x02ec:
            com.google.common.g.bb r10 = r10.mo56453d()
            com.google.common.g.m r12 = r3.f157320b
            boolean r12 = r12.mo56621g()
            if (r12 == 0) goto L_0x0300
            com.google.common.g.r r3 = new com.google.common.g.r
            com.google.common.g.m r12 = com.google.common.p4535g.C59219m.f157300a
            r3.<init>(r10, r12)
            goto L_0x0318
        L_0x0300:
            com.google.common.g.r r12 = new com.google.common.g.r
            com.google.common.g.bb r13 = r3.f157319a
            com.google.common.g.m r3 = r3.f157320b
            double r14 = r3.f157305f
            double r4 = r13.mo56500d(r10)
            double r3 = java.lang.Math.max(r14, r4)
            com.google.common.g.m r3 = com.google.common.p4535g.C59219m.m91873d(r3)
            r12.<init>(r13, r3)
            r3 = r12
        L_0x0318:
            int r6 = r6 + 1
            r29 = r7
            r4 = 4
            r5 = 2
            goto L_0x0297
        L_0x0320:
            double r4 = r3.mo56642a()
            double r6 = r9.mo56642a()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x032d
        L_0x032c:
            r3 = r9
        L_0x032d:
            com.google.common.g.m r3 = r3.f157320b
            com.google.common.g.l r3 = r3.mo56617c()
            double r3 = r3.f157299c
            r5 = 4708594525168205824(0x415849c600000000, double:6367000.0)
            double r3 = r3 * r5
            r5 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x034d
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1.f394379d = r3
        L_0x034d:
            com.google.bb.a.cg r3 = r0.f145030l
            if (r3 != 0) goto L_0x0353
            com.google.bb.a.cg r3 = com.google.p4152bb.p4153a.C55003cg.f144710c
        L_0x0353:
            int r4 = r3.f144712a
            r4 = r4 & r8
            if (r4 == 0) goto L_0x0374
            int r3 = r3.f144713b
            int r3 = com.google.p4152bb.p4153a.C55001ce.m87556a(r3)
            if (r3 != 0) goto L_0x0361
            r3 = 1
        L_0x0361:
            int r3 = r3 + -1
            if (r3 == 0) goto L_0x0367
            r3 = 2
            goto L_0x0368
        L_0x0367:
            r3 = 1
        L_0x0368:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo122206b(r3)
            com.google.android.gms.reminders.model.Location r1 = r1.mo122205a()
            goto L_0x03b1
        L_0x0374:
            int r3 = r0.f145019a
            r4 = r3 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0382
            double r4 = r0.f145023e
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1.f394376a = r4
        L_0x0382:
            r4 = r3 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x038e
            double r4 = r0.f145024f
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1.f394377b = r4
        L_0x038e:
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0397
            java.lang.String r3 = r0.f145028j
            r1.f394381f = r3
        L_0x0397:
            int r3 = r0.f145020b
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x03ad
            com.google.bb.a.gl r3 = r0.f145031m
            if (r3 != 0) goto L_0x03a3
            com.google.bb.a.gl r3 = com.google.p4152bb.p4153a.C55116gl.f145042c
        L_0x03a3:
            long r4 = r3.f145044a
            long r6 = r3.f145045b
            com.google.android.gms.reminders.model.FeatureIdProto r3 = m164536b(r4, r6)
            r1.f394380e = r3
        L_0x03ad:
            com.google.android.gms.reminders.model.Location r1 = r1.mo122205a()
        L_0x03b1:
            if (r1 == 0) goto L_0x03b6
            r2.mo122171c(r1)
        L_0x03b6:
            if (r0 != 0) goto L_0x03bb
        L_0x03b8:
            r7 = 0
            goto L_0x0447
        L_0x03bb:
            int r1 = r0.f145020b
            r3 = r1 & 16
            if (r3 == 0) goto L_0x03c2
            goto L_0x03c7
        L_0x03c2:
            r1 = r1 & 32
            if (r1 != 0) goto L_0x03c7
            goto L_0x03b8
        L_0x03c7:
            com.google.bb.a.gd r1 = r0.f145032n
            if (r1 != 0) goto L_0x03cd
            com.google.bb.a.gd r1 = com.google.p4152bb.p4153a.C55108gd.f145008d
        L_0x03cd:
            com.google.bb.a.gf r3 = r1.f145011b
            if (r3 != 0) goto L_0x03d3
            com.google.bb.a.gf r3 = com.google.p4152bb.p4153a.C55110gf.f145013c
        L_0x03d3:
            int r3 = r3.f145015a
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x040b
            com.google.bb.a.gf r3 = r1.f145011b
            if (r3 != 0) goto L_0x03df
            com.google.bb.a.gf r3 = com.google.p4152bb.p4153a.C55110gf.f145013c
        L_0x03df:
            com.google.bb.a.gl r3 = r3.f145016b
            if (r3 != 0) goto L_0x03e5
            com.google.bb.a.gl r3 = com.google.p4152bb.p4153a.C55116gl.f145042c
        L_0x03e5:
            long r3 = r3.f145044a
            com.google.bb.a.gf r5 = r1.f145011b
            if (r5 != 0) goto L_0x03ed
            com.google.bb.a.gf r5 = com.google.p4152bb.p4153a.C55110gf.f145013c
        L_0x03ed:
            com.google.bb.a.gl r5 = r5.f145016b
            if (r5 != 0) goto L_0x03f3
            com.google.bb.a.gl r5 = com.google.p4152bb.p4153a.C55116gl.f145042c
        L_0x03f3:
            long r5 = r5.f145045b
            com.google.android.gms.reminders.model.FeatureIdProto r3 = m164536b(r3, r5)
            int r4 = r1.f145010a
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0402
            java.lang.String r1 = r1.f145012c
            goto L_0x0403
        L_0x0402:
            r1 = 0
        L_0x0403:
            com.google.android.gms.reminders.model.ChainInfoEntity r4 = new com.google.android.gms.reminders.model.ChainInfoEntity
            r4.<init>(r1, r3, r8)
            r20 = r4
            goto L_0x040d
        L_0x040b:
            r20 = 0
        L_0x040d:
            int r1 = r0.f145020b
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0438
            com.google.bb.a.gb r0 = r0.f145033o
            if (r0 != 0) goto L_0x0419
            com.google.bb.a.gb r0 = com.google.p4152bb.p4153a.C55106gb.f145002e
        L_0x0419:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.f145004a
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0427
            java.lang.String r4 = r0.f145005b
            goto L_0x0428
        L_0x0427:
            r4 = 0
        L_0x0428:
            r5 = 2
            r3 = r3 & r5
            if (r3 == 0) goto L_0x042f
            java.lang.String r7 = r0.f145006c
            goto L_0x0430
        L_0x042f:
            r7 = 0
        L_0x0430:
            com.google.android.gms.reminders.model.CategoryInfoEntity r0 = new com.google.android.gms.reminders.model.CategoryInfoEntity
            r0.<init>(r4, r1, r7)
            r21 = r0
            goto L_0x043a
        L_0x0438:
            r21 = 0
        L_0x043a:
            com.google.android.gms.reminders.model.LocationGroupEntity r7 = new com.google.android.gms.reminders.model.LocationGroupEntity
            r18 = 0
            r19 = 0
            r22 = 1
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x0447:
            if (r7 == 0) goto L_0x044c
            r2.mo122172d(r7)
        L_0x044c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7756cx.p7757a.C99222a.m164535a(com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument, com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument, com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument):com.google.android.gms.reminders.model.ab");
    }

    /* renamed from: b */
    private static FeatureIdProto m164536b(long j, long j2) {
        return new FeatureIdProtoEntity(Long.valueOf(j), Long.valueOf(j2));
    }
}
