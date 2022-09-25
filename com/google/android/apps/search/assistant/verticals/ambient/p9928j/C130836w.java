package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.List;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.format.DateTimeFormatterBuilder;
import p3186j$.time.format.DateTimeParseException;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.w */
/* compiled from: PG */
public final class C130836w {

    /* renamed from: a */
    public static final /* synthetic */ int f358079a = 0;

    /* renamed from: b */
    private static final C58974d f358080b = C58974d.m91136j();

    /* renamed from: c */
    private static final DateTimeFormatter f358081c = new DateTimeFormatterBuilder().appendOptional(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HHMM", "+0000").optionalEnd().optionalStart().appendOffset("+HH", "Z").optionalEnd().optionalStart().appendOffset("+HH:MM", "+00:00").optionalEnd().toFormatter();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m213195a(com.google.p4500cm.p4501a.p4506b.p4507a.C58148f r19) {
        /*
            r0 = r19
            com.google.assistant.e.i.a.j r1 = com.google.assistant.p3897e.p3917i.p3918a.C51473j.f134090i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.i.a.i r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51446i) r1
            java.lang.String r2 = "message"
            j$.util.Optional r2 = m213199e(r0, r2)
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.search.assistant.verticals.ambient.j.o r3 = new com.google.android.apps.search.assistant.verticals.ambient.j.o
            r3.<init>(r1)
            r2.ifPresent(r3)
            com.google.android.apps.search.assistant.verticals.ambient.j.x r2 = new com.google.android.apps.search.assistant.verticals.ambient.j.x
            r2.<init>()
            java.lang.String r3 = "enabled"
            j$.util.Optional r3 = m213200f(r0, r3)
            com.google.android.apps.search.assistant.verticals.ambient.j.r r4 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130831r.f358076a
            j$.util.Optional r3 = r3.filter(r4)
            com.google.android.apps.search.assistant.verticals.ambient.j.s r4 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130832s.f358077a
            j$.util.Optional r3 = r3.map(r4)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r3 = r3.orElse(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r6 = "alarmInstances"
            r8 = 1
            if (r3 != 0) goto L_0x0054
            com.google.assistant.e.i.a.h r3 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.DISABLED
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358082a = r3
            com.google.android.apps.search.assistant.verticals.ambient.j.v r2 = r2.mo109830a()
            goto L_0x0185
        L_0x0054:
            j$.util.Optional r3 = m213200f(r0, r6)
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L_0x0173
            java.lang.Object r9 = r3.get()
            com.google.cm.a.b.a.d r9 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r9
            com.google.protobuf.cq r9 = r9.f155450f
            int r9 = r9.size()
            if (r9 > 0) goto L_0x006e
            goto L_0x0173
        L_0x006e:
            j$.util.Optional r9 = p3186j$.util.Optional.empty()
            java.lang.Object r3 = r3.get()
            com.google.cm.a.b.a.d r3 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r3
            com.google.protobuf.cq r3 = r3.f155450f
            java.util.Iterator r3 = r3.iterator()
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0086:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x0124
            java.lang.Object r15 = r3.next()
            com.google.cm.a.b.a.f r15 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r15
            j$.util.Optional r16 = m213197c(r15)
            j$.util.Optional r17 = m213198d(r15)
            boolean r18 = r16.isEmpty()
            if (r18 != 0) goto L_0x0111
            boolean r18 = r17.isEmpty()
            if (r18 == 0) goto L_0x00a8
            goto L_0x0111
        L_0x00a8:
            java.lang.Object r17 = r17.get()
            java.lang.Long r17 = (java.lang.Long) r17
            long r17 = r17.longValue()
            java.lang.Object r16 = r16.get()
            r5 = r16
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r5.hashCode()
            r7 = -391461090(0xffffffffe8aac71e, float:-6.451803E24)
            if (r4 == r7) goto L_0x00e2
            r7 = 67887310(0x40be0ce, float:1.6442597E-36)
            if (r4 == r7) goto L_0x00d8
            r7 = 1843257485(0x6ddde08d, float:8.5834566E27)
            if (r4 == r7) goto L_0x00ce
            goto L_0x00ec
        L_0x00ce:
            java.lang.String r4 = "Scheduled"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ec
            r4 = 2
            goto L_0x00ed
        L_0x00d8:
            java.lang.String r4 = "Fired"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ec
            r4 = 0
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r4 = "Snoozed"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ec
            r4 = 1
            goto L_0x00ed
        L_0x00ec:
            r4 = -1
        L_0x00ed:
            r5 = 2
            if (r4 == 0) goto L_0x00fb
            if (r4 == r8) goto L_0x00f8
            if (r4 == r5) goto L_0x00f5
            goto L_0x010e
        L_0x00f5:
            int r14 = r14 + 1
            goto L_0x010e
        L_0x00f8:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x00fb:
            int r4 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x010c
            int r4 = r15.f155454a
            r4 = r4 & r5
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r15.f155456c
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r4)
            r10 = r17
        L_0x010c:
            int r12 = r12 + 1
        L_0x010e:
            r4 = 0
            goto L_0x0086
        L_0x0111:
            com.google.common.f.a.d r3 = f358080b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Bad alarm instance, skipped the entire alarm"
            r5 = 38981(0x9845, float:5.4624E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.j.v r2 = r2.mo109830a()
            goto L_0x0185
        L_0x0124:
            if (r12 <= 0) goto L_0x0150
            com.google.assistant.e.i.a.h r3 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.FIRING
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358082a = r3
            boolean r3 = r9.isPresent()
            if (r3 == 0) goto L_0x0141
            java.lang.Object r3 = r9.get()
            java.lang.String r3 = (java.lang.String) r3
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358083b = r3
            goto L_0x016e
        L_0x0141:
            com.google.common.f.a.d r3 = f358080b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Bad data from clock app: Firing alarm instance doesn't have an ID."
            r5 = 38980(0x9844, float:5.4623E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x016e
        L_0x0150:
            if (r13 <= 0) goto L_0x015b
            com.google.assistant.e.i.a.h r3 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.SNOOZED
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358082a = r3
            goto L_0x016e
        L_0x015b:
            if (r14 <= 0) goto L_0x0166
            com.google.assistant.e.i.a.h r3 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.SCHEDULED
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358082a = r3
            goto L_0x016e
        L_0x0166:
            com.google.assistant.e.i.a.h r3 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r2.f358082a = r3
        L_0x016e:
            com.google.android.apps.search.assistant.verticals.ambient.j.v r2 = r2.mo109830a()
            goto L_0x0185
        L_0x0173:
            com.google.common.f.a.d r3 = f358080b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "alarmThing had no instances."
            r5 = 38979(0x9843, float:5.4621E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.j.v r2 = r2.mo109830a()
        L_0x0185:
            j$.util.Optional r3 = r2.mo109831a()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0194
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x0194:
            j$.util.Optional r3 = r2.mo109831a()
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.i.a.h r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51419h) r3
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.i.a.j r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r4
            int r3 = r3.f133932g
            r4.f134097f = r3
            int r3 = r4.f134092a
            r3 = r3 | 16
            r4.f134092a = r3
            j$.util.Optional r3 = r2.mo109831a()
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.i.a.h r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51419h) r3
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.DISABLED
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x01fa
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01fa
        L_0x01ca:
            j$.util.Optional r4 = m213200f(r0, r6)
            com.google.android.apps.search.assistant.verticals.ambient.j.t r5 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130833t.f358078a
            j$.util.Optional r4 = r4.map(r5)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r4 = r4.orElse(r5)
            java.util.List r4 = (java.util.List) r4
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.search.assistant.verticals.ambient.j.i r5 = new com.google.android.apps.search.assistant.verticals.ambient.j.i
            r5.<init>(r3)
            j$.util.stream.Stream r3 = r4.filter(r5)
            com.google.android.apps.search.assistant.verticals.ambient.j.j r4 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130823j.f358068a
            j$.util.stream.Stream r3 = r3.map(r4)
            java.util.Comparator r4 = p3186j$.util.Comparator.CC.naturalOrder()
            j$.util.Optional r3 = r3.min(r4)
            goto L_0x01fe
        L_0x01fa:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x01fe:
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.search.assistant.verticals.ambient.j.p r4 = new com.google.android.apps.search.assistant.verticals.ambient.j.p
            r4.<init>(r1)
            r3.ifPresent(r4)
            j$.util.Optional r3 = r2.mo109831a()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x023a
            j$.util.Optional r3 = r2.mo109831a()
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.i.a.h r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51419h) r3
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.FIRING
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x023a
            j$.util.Optional r3 = r2.mo109832b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x023a
            j$.util.Optional r2 = r2.mo109832b()
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x023c
        L_0x023a:
            java.lang.String r2 = r0.f155456c
        L_0x023c:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.i.a.j r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r3
            r2.getClass()
            int r4 = r3.f134092a
            r4 = r4 | r8
            r3.f134092a = r4
            r3.f134095d = r2
            com.google.assistant.e.j.ql r2 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.qk r2 = (com.google.assistant.p3897e.p3921j.C52402qk) r2
            java.lang.String r3 = "hour"
            j$.util.Optional r3 = m213199e(r0, r3)
            com.google.android.apps.search.assistant.verticals.ambient.j.h r4 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130821h.f358066a
            j$.util.Optional r3 = r3.map(r4)
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.search.assistant.verticals.ambient.j.l r4 = new com.google.android.apps.search.assistant.verticals.ambient.j.l
            r4.<init>(r2)
            r3.ifPresent(r4)
            java.lang.String r3 = "minute"
            j$.util.Optional r3 = m213199e(r0, r3)
            com.google.android.apps.search.assistant.verticals.ambient.j.h r4 = com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130821h.f358066a
            j$.util.Optional r3 = r3.map(r4)
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.search.assistant.verticals.ambient.j.m r4 = new com.google.android.apps.search.assistant.verticals.ambient.j.m
            r4.<init>(r2)
            r3.ifPresent(r4)
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.ql r2 = (com.google.assistant.p3897e.p3921j.C52403ql) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.i.a.j r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r3
            r2.getClass()
            r3.f134096e = r2
            int r2 = r3.f134092a
            r4 = 2
            r2 = r2 | r4
            r3.f134092a = r2
            java.lang.String r2 = "dayOfWeek"
            java.util.List r0 = m213201g(r0, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x02ad
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x035f
        L_0x02ad:
            com.google.assistant.e.j.qf r2 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.qe r2 = (com.google.assistant.p3897e.p3921j.C52396qe) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x02b9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0355
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r3)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 3
            r9 = 5
            r10 = 6
            switch(r5) {
                case -2114201671: goto L_0x0311;
                case -1266285217: goto L_0x0307;
                case -1068502768: goto L_0x02fd;
                case -977343923: goto L_0x02f3;
                case -891186736: goto L_0x02e9;
                case 1393530710: goto L_0x02df;
                case 1572055514: goto L_0x02d5;
                default: goto L_0x02d4;
            }
        L_0x02d4:
            goto L_0x031b
        L_0x02d5:
            java.lang.String r5 = "thursday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 4
            goto L_0x031c
        L_0x02df:
            java.lang.String r5 = "wednesday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 3
            goto L_0x031c
        L_0x02e9:
            java.lang.String r5 = "sunday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 0
            goto L_0x031c
        L_0x02f3:
            java.lang.String r5 = "tuesday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 2
            goto L_0x031c
        L_0x02fd:
            java.lang.String r5 = "monday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 1
            goto L_0x031c
        L_0x0307:
            java.lang.String r5 = "friday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 5
            goto L_0x031c
        L_0x0311:
            java.lang.String r5 = "saturday"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x031b
            r5 = 6
            goto L_0x031c
        L_0x031b:
            r5 = -1
        L_0x031c:
            switch(r5) {
                case 0: goto L_0x034e;
                case 1: goto L_0x0348;
                case 2: goto L_0x0342;
                case 3: goto L_0x033d;
                case 4: goto L_0x0338;
                case 5: goto L_0x0334;
                case 6: goto L_0x0330;
                default: goto L_0x031f;
            }
        L_0x031f:
            r4 = 2
            r5 = 0
            com.google.common.f.a.d r6 = f358080b
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "%s is not a day."
            r9 = 38982(0x9846, float:5.4625E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r9)).mo56389s(r7, r3)
            goto L_0x02b9
        L_0x0330:
            r2.mo53852c(r10)
            goto L_0x02b9
        L_0x0334:
            r2.mo53852c(r9)
            goto L_0x02b9
        L_0x0338:
            r2.mo53852c(r6)
            goto L_0x02b9
        L_0x033d:
            r2.mo53852c(r7)
            goto L_0x02b9
        L_0x0342:
            r4 = 2
            r2.mo53852c(r4)
            goto L_0x02b9
        L_0x0348:
            r4 = 2
            r2.mo53852c(r8)
            goto L_0x02b9
        L_0x034e:
            r4 = 2
            r5 = 0
            r2.mo53852c(r5)
            goto L_0x02b9
        L_0x0355:
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.e.j.qf r0 = (com.google.assistant.p3897e.p3921j.C52397qf) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x035f:
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.search.assistant.verticals.ambient.j.q r2 = new com.google.android.apps.search.assistant.verticals.ambient.j.q
            r2.<init>(r1)
            r0.ifPresent(r2)
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.i.a.j r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130836w.m213195a(com.google.cm.a.b.a.f):j$.util.Optional");
    }

    /* renamed from: b */
    static /* synthetic */ Optional m213196b(String str) {
        try {
            TemporalAccessor parse = f358081c.parse(str);
            return Optional.m71637of(Long.valueOf((parse.getLong(ChronoField.INSTANT_SECONDS) * 1000) + ((long) parse.get(ChronoField.MILLI_OF_SECOND))));
        } catch (DateTimeParseException unused) {
            return Optional.empty();
        }
    }

    /* renamed from: c */
    public static Optional m213197c(C58148f fVar) {
        List g = m213201g(fVar, "alarmStatus");
        if (g.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((String) g.get(0));
    }

    /* renamed from: d */
    public static Optional m213198d(C58148f fVar) {
        return m213199e(fVar, "scheduledTime").flatMap(C130827n.f358072a);
    }

    /* renamed from: e */
    private static Optional m213199e(C58148f fVar, String str) {
        List g = m213201g(fVar, str);
        if (g.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((String) g.get(0));
    }

    /* renamed from: f */
    private static Optional m213200f(C58148f fVar, String str) {
        return Optional.ofNullable((C58146d) C58557jl.m90144y(fVar.f155457d, new C130824k(str)));
    }

    /* renamed from: g */
    private static List m213201g(C58148f fVar, String str) {
        Optional f = m213200f(fVar, str);
        return f.isPresent() ? ((C58146d) f.get()).f155449e : C58485gu.m89845m();
    }
}
