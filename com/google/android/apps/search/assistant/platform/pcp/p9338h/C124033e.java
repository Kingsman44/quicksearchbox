package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48956bc;
import com.google.assistant.p3803ag.p3809c.C49015dh;
import com.google.assistant.p3803ag.p3809c.C49016di;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import java.util.concurrent.TimeUnit;
import p3186j$.time.DateTimeException;
import p3186j$.time.DayOfWeek;
import p3186j$.time.Instant;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.ZonedDateTime;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.e */
/* compiled from: PG */
public final class C124033e implements C124032d {

    /* renamed from: a */
    private static final C59071e f342591a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.h.e");

    /* renamed from: b */
    private static double m203431b(C48956bc bcVar) {
        int i = bcVar.f126664a;
        if (i == 1) {
            return (double) ((Long) bcVar.f126665b).longValue();
        }
        return i == 2 ? ((Double) bcVar.f126665b).doubleValue() : C59203do.f157270a;
    }

    /* renamed from: c */
    private static long m203432c(C63042fg fgVar) {
        return TimeUnit.SECONDS.toMillis(fgVar.f170154a) + TimeUnit.NANOSECONDS.toMillis((long) fgVar.f170155b);
    }

    /* renamed from: d */
    private static C58833ax m203433d(C49156z zVar, C124031c cVar) {
        C58833ax e = cVar.mo22562e();
        if (!e.mo56113h()) {
            return C58836b.f156633a;
        }
        long epochMilli = ((Instant) e.mo56107c()).toEpochMilli();
        C63042fg fgVar = zVar.f127114b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long c = m203432c(fgVar);
        C63042fg fgVar2 = zVar.f127115c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        long c2 = m203432c(fgVar2);
        boolean z = false;
        if (c <= epochMilli && epochMilli < c2) {
            z = true;
        }
        return C58833ax.m90834k(Boolean.valueOf(z));
    }

    /* renamed from: f */
    private static C58833ax m203435f(C49016di diVar, C124031c cVar) {
        C58833ax e = cVar.mo22562e();
        if (!e.mo56113h()) {
            return C58836b.f156633a;
        }
        try {
            ZoneId zoneId = ZoneOffset.UTC;
            int i = diVar.f126782a;
            if (i == 4) {
                zoneId = ZoneId.m71280of((String) diVar.f126783b);
            } else if (i == 5 && ((Boolean) diVar.f126783b).booleanValue()) {
                zoneId = ZoneId.systemDefault();
            }
            ZonedDateTime atZone = ((Instant) e.mo56107c()).atZone(zoneId);
            LocalTime ofSecondOfDay = LocalTime.ofSecondOfDay(TimeUnit.MILLISECONDS.toSeconds(diVar.f126785d));
            LocalTime ofSecondOfDay2 = LocalTime.ofSecondOfDay(TimeUnit.MILLISECONDS.toSeconds(diVar.f126786e) - 1);
            LocalTime from = LocalTime.from(atZone);
            boolean z = false;
            if (!from.isBefore(ofSecondOfDay)) {
                if (!from.isAfter(ofSecondOfDay2)) {
                    DayOfWeek from2 = DayOfWeek.from(atZone);
                    int a = C49015dh.m85343a(diVar.f126784c);
                    if (a == 0) {
                        a = 1;
                    }
                    switch (a - 1) {
                        case 1:
                            return C58833ax.m90834k(true);
                        case 2:
                            if (!(from2 == DayOfWeek.SATURDAY || from2 == DayOfWeek.SUNDAY)) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 3:
                            if (from2 == DayOfWeek.SATURDAY || from2 == DayOfWeek.SUNDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 4:
                            if (from2 == DayOfWeek.MONDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 5:
                            if (from2 == DayOfWeek.TUESDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 6:
                            if (from2 == DayOfWeek.WEDNESDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 7:
                            if (from2 == DayOfWeek.THURSDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 8:
                            if (from2 == DayOfWeek.FRIDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 9:
                            if (from2 == DayOfWeek.SATURDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        case 10:
                            if (from2 == DayOfWeek.SUNDAY) {
                                z = true;
                            }
                            return C58833ax.m90834k(Boolean.valueOf(z));
                        default:
                            return C58836b.f156633a;
                    }
                }
            }
            return C58833ax.m90834k(false);
        } catch (DateTimeException e2) {
            C59104x c = f342591a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.ContextTriggerEvaluator");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(35376)).mo56386p("Failed to evaluate WithinDayInterval trigger condition");
            return C58836b.f156633a;
        }
    }

    /* renamed from: g */
    private static C63042fg m203436g(long j) {
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = seconds;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j % 1000);
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = (int) nanos;
        return (C63042fg) ffVar.build();
    }

    /* renamed from: h */
    private static boolean m203437h(C48956bc bcVar) {
        int i = bcVar.f126664a;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m203438i(int r13, com.google.assistant.p3803ag.p3809c.C48956bc r14, com.google.assistant.p3803ag.p3809c.C48956bc r15) {
        /*
            int r0 = r14.f126664a
            int r0 = com.google.assistant.p3803ag.p3809c.C48955bb.m85324a(r0)
            int r1 = r15.f126664a
            int r1 = com.google.assistant.p3803ag.p3809c.C48955bb.m85324a(r1)
            if (r0 == r1) goto L_0x001a
            boolean r0 = m203437h(r14)
            if (r0 == 0) goto L_0x0028
            boolean r0 = m203437h(r15)
            if (r0 == 0) goto L_0x0028
        L_0x001a:
            boolean r0 = m203437h(r14)
            r1 = 2
            r2 = 3
            if (r0 != 0) goto L_0x002b
            if (r13 == r1) goto L_0x002b
            if (r13 != r2) goto L_0x0028
            r13 = 3
            goto L_0x002b
        L_0x0028:
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            return r13
        L_0x002b:
            int r0 = r14.f126664a
            int r3 = com.google.assistant.p3803ag.p3809c.C48955bb.m85324a(r0)
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x00e6
            r3 = -1
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0080
            if (r4 == r5) goto L_0x0080
            if (r4 == r1) goto L_0x005c
            if (r4 == r2) goto L_0x0043
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            return r13
        L_0x0043:
            java.lang.String r1 = ""
            r2 = 4
            if (r0 != r2) goto L_0x004d
            java.lang.Object r14 = r14.f126665b
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x004e
        L_0x004d:
            r14 = r1
        L_0x004e:
            int r0 = r15.f126664a
            if (r0 != r2) goto L_0x0057
            java.lang.Object r15 = r15.f126665b
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1
        L_0x0057:
            int r14 = r14.compareTo(r1)
            goto L_0x0091
        L_0x005c:
            if (r0 != r2) goto L_0x0067
            java.lang.Object r14 = r14.f126665b
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            goto L_0x0068
        L_0x0067:
            r14 = 0
        L_0x0068:
            int r0 = r15.f126664a
            if (r0 != r2) goto L_0x0075
            java.lang.Object r15 = r15.f126665b
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            goto L_0x0076
        L_0x0075:
            r15 = 0
        L_0x0076:
            if (r14 != r15) goto L_0x007a
            r14 = 0
            goto L_0x0091
        L_0x007a:
            if (r14 == 0) goto L_0x007e
            r14 = 1
            goto L_0x0091
        L_0x007e:
            r14 = -1
            goto L_0x0091
        L_0x0080:
            double r7 = m203431b(r14)
            double r9 = m203431b(r15)
            r11 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r14 = com.google.common.p4573p.C60713c.m92639a(r7, r9, r11)
        L_0x0091:
            int r13 = r13 + r3
            switch(r13) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00a5;
                case 6: goto L_0x0098;
                default: goto L_0x0095;
            }
        L_0x0095:
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            return r13
        L_0x0098:
            if (r14 < 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r5 = 0
        L_0x009c:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00a5:
            if (r14 <= 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00b2:
            if (r14 > 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r5 = 0
        L_0x00b6:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00bf:
            if (r14 >= 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00cc:
            if (r14 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00d9:
            if (r14 != 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00e6:
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9338h.C124033e.m203438i(int, com.google.assistant.ag.c.bc, com.google.assistant.ag.c.bc):com.google.common.base.ax");
    }

    /* renamed from: a */
    public final boolean mo106244a(C48952az azVar, C124031c cVar) {
        return ((Boolean) m203434e(azVar, cVar).mo56109e(false)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b5, code lost:
        if (r13 == r2) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cf, code lost:
        if (true != ((com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t) r13.mo56107c()).f341981b.equals(r0.f126612a == 1 ? (java.lang.String) r0.f126613b : com.evernote.android.state.BuildConfig.FLAVOR)) goto L_0x01d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m203434e(com.google.assistant.p3803ag.p3809c.C48952az r12, com.google.android.apps.search.assistant.platform.pcp.p9338h.C124031c r13) {
        /*
            int r0 = r12.f126659a
            int r1 = com.google.assistant.p3803ag.p3809c.C48949aw.m85320b(r0)
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x05e5
            java.lang.String r1 = "PCP.ContextTriggerEvaluator"
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0142
            if (r2 == r8) goto L_0x00de
            if (r2 == r7) goto L_0x007a
            if (r2 == r5) goto L_0x0050
            if (r2 == r4) goto L_0x0047
            com.google.common.f.e r13 = f342591a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r1)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r0 = 35372(0x8a2c, float:4.9567E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r0)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            int r12 = r12.f126659a
            int r12 = com.google.assistant.p3803ag.p3809c.C48949aw.m85320b(r12)
            java.lang.String r0 = com.google.assistant.p3803ag.p3809c.C48949aw.m85319a(r12)
            if (r12 == 0) goto L_0x0046
            java.lang.String r12 = "Unknown context trigger condition: %s"
            r13.mo56389s(r12, r0)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            return r12
        L_0x0046:
            throw r3
        L_0x0047:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            return r12
        L_0x0050:
            if (r0 != r4) goto L_0x0057
            java.lang.Object r12 = r12.f126660b
            com.google.assistant.ag.c.az r12 = (com.google.assistant.p3803ag.p3809c.C48952az) r12
            goto L_0x0059
        L_0x0057:
            com.google.assistant.ag.c.az r12 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0059:
            com.google.common.base.ax r12 = m203434e(r12, r13)
            boolean r13 = r12.mo56113h()
            if (r13 != 0) goto L_0x0066
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x0079
        L_0x0066:
            java.lang.Object r12 = r12.mo56107c()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r12 = r12 ^ r8
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
        L_0x0079:
            return r12
        L_0x007a:
            if (r0 != r5) goto L_0x0081
            java.lang.Object r12 = r12.f126660b
            com.google.assistant.ag.c.ay r12 = (com.google.assistant.p3803ag.p3809c.C48951ay) r12
            goto L_0x0083
        L_0x0081:
            com.google.assistant.ag.c.ay r12 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x0083:
            com.google.protobuf.cq r0 = r12.f126656a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a1
            com.google.common.f.e r12 = f342591a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r1)
            java.lang.String r13 = "Failed to evaluate empty OR trigger condition"
            r0 = 35374(0x8a2e, float:4.957E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56386p(r13)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x00dd
        L_0x00a1:
            com.google.protobuf.cq r12 = r12.f126656a
            java.util.Iterator r12 = r12.iterator()
        L_0x00a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r12.next()
            com.google.assistant.ag.c.az r0 = (com.google.assistant.p3803ag.p3809c.C48952az) r0
            com.google.common.base.ax r0 = m203434e(r0, r13)
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x00c0
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x00dd
        L_0x00c0:
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a7
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x00dd
        L_0x00d5:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
        L_0x00dd:
            return r12
        L_0x00de:
            if (r0 != r7) goto L_0x00e5
            java.lang.Object r12 = r12.f126660b
            com.google.assistant.ag.c.ay r12 = (com.google.assistant.p3803ag.p3809c.C48951ay) r12
            goto L_0x00e7
        L_0x00e5:
            com.google.assistant.ag.c.ay r12 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
        L_0x00e7:
            com.google.protobuf.cq r0 = r12.f126656a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0105
            com.google.common.f.e r12 = f342591a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r1)
            java.lang.String r13 = "Failed to evaluate empty AND trigger condition"
            r0 = 35371(0x8a2b, float:4.9565E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56386p(r13)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x0141
        L_0x0105:
            com.google.protobuf.cq r12 = r12.f126656a
            java.util.Iterator r12 = r12.iterator()
        L_0x010b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r12.next()
            com.google.assistant.ag.c.az r0 = (com.google.assistant.p3803ag.p3809c.C48952az) r0
            com.google.common.base.ax r0 = m203434e(r0, r13)
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x0124
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x0141
        L_0x0124:
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x010b
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x0141
        L_0x0139:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
        L_0x0141:
            return r12
        L_0x0142:
            if (r0 != r8) goto L_0x0149
            java.lang.Object r12 = r12.f126660b
            com.google.assistant.ag.c.br r12 = (com.google.assistant.p3803ag.p3809c.C48971br) r12
            goto L_0x014b
        L_0x0149:
            com.google.assistant.ag.c.br r12 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x014b:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            int r2 = r12.f126691a
            int r9 = com.google.assistant.p3803ag.p3809c.C48966bm.m85328a(r2)
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x05e4
            r9 = 8
            switch(r10) {
                case 0: goto L_0x0560;
                case 1: goto L_0x04b0;
                case 2: goto L_0x0431;
                case 3: goto L_0x03fd;
                case 4: goto L_0x03c9;
                case 5: goto L_0x0396;
                case 6: goto L_0x0361;
                case 7: goto L_0x015c;
                case 8: goto L_0x032c;
                case 9: goto L_0x0288;
                case 10: goto L_0x01f8;
                case 11: goto L_0x015e;
                default: goto L_0x015c;
            }
        L_0x015c:
            goto L_0x056d
        L_0x015e:
            r0 = 14
            if (r2 != r0) goto L_0x0167
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.af r0 = (com.google.assistant.p3803ag.p3809c.C48932af) r0
            goto L_0x0169
        L_0x0167:
            com.google.assistant.ag.c.af r0 = com.google.assistant.p3803ag.p3809c.C48932af.f126610e
        L_0x0169:
            int r2 = r0.f126614c
            int r2 = com.google.assistant.p3803ag.p3809c.C48927aa.m85308a(r2)
            int r9 = r2 + -1
            if (r2 == 0) goto L_0x01f7
            if (r9 == 0) goto L_0x01f3
            if (r9 == r8) goto L_0x017b
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x017b:
            com.google.common.base.ax r13 = r13.mo22564g()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x0187
        L_0x0185:
            r7 = 1
            goto L_0x01d2
        L_0x0187:
            int r2 = r0.f126612a
            if (r2 == 0) goto L_0x0195
            if (r2 == r8) goto L_0x0193
            if (r2 == r7) goto L_0x0191
            r2 = 0
            goto L_0x0196
        L_0x0191:
            r2 = 2
            goto L_0x0196
        L_0x0193:
            r2 = 1
            goto L_0x0196
        L_0x0195:
            r2 = 3
        L_0x0196:
            int r9 = r2 + -1
            if (r2 == 0) goto L_0x01f2
            if (r9 == 0) goto L_0x01b8
            if (r9 == r8) goto L_0x019f
            goto L_0x0185
        L_0x019f:
            java.lang.Object r13 = r13.mo56107c()
            com.google.android.apps.search.assistant.platform.pcp.f.t r13 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t) r13
            boolean r13 = r13.f341982c
            int r2 = r0.f126612a
            if (r2 != r7) goto L_0x01b4
            java.lang.Object r2 = r0.f126613b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x01b5
        L_0x01b4:
            r2 = 0
        L_0x01b5:
            if (r13 != r2) goto L_0x01d1
            goto L_0x01d2
        L_0x01b8:
            java.lang.Object r13 = r13.mo56107c()
            com.google.android.apps.search.assistant.platform.pcp.f.t r13 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t) r13
            java.lang.String r13 = r13.f341981b
            int r2 = r0.f126612a
            if (r2 != r8) goto L_0x01c9
            java.lang.Object r2 = r0.f126613b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01cb
        L_0x01c9:
            java.lang.String r2 = ""
        L_0x01cb:
            boolean r13 = r13.equals(r2)
            if (r8 == r13) goto L_0x01d2
        L_0x01d1:
            r7 = 3
        L_0x01d2:
            int r13 = r0.f126614c
            if (r13 != r4) goto L_0x01e4
            java.lang.Object r13 = r0.f126615d
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r13 = com.google.assistant.p3803ag.p3809c.C48930ad.m85309a(r13)
            if (r13 != 0) goto L_0x01e5
        L_0x01e4:
            r13 = 1
        L_0x01e5:
            if (r7 == r13) goto L_0x01e8
            r8 = 0
        L_0x01e8:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x01f2:
            throw r3
        L_0x01f3:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x01f7:
            throw r3
        L_0x01f8:
            r0 = 13
            if (r2 != r0) goto L_0x0201
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.am r0 = (com.google.assistant.p3803ag.p3809c.C48939am) r0
            goto L_0x0203
        L_0x0201:
            com.google.assistant.ag.c.am r0 = com.google.assistant.p3803ag.p3809c.C48939am.f126628c
        L_0x0203:
            int r2 = r0.f126630a
            int r2 = com.google.assistant.p3803ag.p3809c.C48933ag.m85310a(r2)
            int r4 = r2 + -1
            if (r2 == 0) goto L_0x0287
            if (r4 == 0) goto L_0x024e
            if (r4 == r8) goto L_0x0215
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x0215:
            com.google.common.base.ax r13 = r13.mo22559b()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x0223
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x0223:
            java.lang.Object r13 = r13.mo56107c()
            com.google.assistant.ag.c.ai r13 = (com.google.assistant.p3803ag.p3809c.C48935ai) r13
            int r2 = r0.f126630a
            if (r2 != r7) goto L_0x023e
            java.lang.Object r0 = r0.f126631b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.assistant.ag.c.ai r0 = com.google.assistant.p3803ag.p3809c.C48935ai.m85311a(r0)
            if (r0 != 0) goto L_0x0240
            com.google.assistant.ag.c.ai r0 = com.google.assistant.p3803ag.p3809c.C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS
            goto L_0x0240
        L_0x023e:
            com.google.assistant.ag.c.ai r0 = com.google.assistant.p3803ag.p3809c.C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS
        L_0x0240:
            boolean r13 = r13.equals(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x024e:
            com.google.common.base.ax r13 = r13.mo22568k()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x025c
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x025c:
            java.lang.Object r13 = r13.mo56107c()
            com.google.assistant.ag.c.al r13 = (com.google.assistant.p3803ag.p3809c.C48938al) r13
            int r2 = r0.f126630a
            if (r2 != r8) goto L_0x0277
            java.lang.Object r0 = r0.f126631b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.assistant.ag.c.al r0 = com.google.assistant.p3803ag.p3809c.C48938al.m85313a(r0)
            if (r0 != 0) goto L_0x0279
            com.google.assistant.ag.c.al r0 = com.google.assistant.p3803ag.p3809c.C48938al.UNKNOWN_WIRED_HEADPHONE_STATUS
            goto L_0x0279
        L_0x0277:
            com.google.assistant.ag.c.al r0 = com.google.assistant.p3803ag.p3809c.C48938al.UNKNOWN_WIRED_HEADPHONE_STATUS
        L_0x0279:
            boolean r13 = r13.equals(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x0287:
            throw r3
        L_0x0288:
            r0 = 12
            if (r2 != r0) goto L_0x0291
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.bg r0 = (com.google.assistant.p3803ag.p3809c.C48960bg) r0
            goto L_0x0293
        L_0x0291:
            com.google.assistant.ag.c.bg r0 = com.google.assistant.p3803ag.p3809c.C48960bg.f126667d
        L_0x0293:
            com.google.common.base.ax r13 = r13.mo22563f()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x02a1
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x02a1:
            java.lang.Object r13 = r13.mo56107c()
            com.google.common.b.hd r13 = (com.google.common.p4522b.C58495hd) r13
            java.lang.String r2 = r0.f126669a
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r13 = r13.getOrDefault(r2, r4)
            com.google.common.b.gu r13 = (com.google.common.p4522b.C58485gu) r13
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0328
            int r2 = r13.size()
            if (r2 <= r8) goto L_0x02ca
            int r2 = r0.f126670b
            int r2 = com.google.assistant.p3803ag.p3809c.C48959bf.m85325a(r2)
            if (r2 != 0) goto L_0x02c8
            goto L_0x0328
        L_0x02c8:
            if (r2 != r9) goto L_0x0328
        L_0x02ca:
            int r2 = r0.f126670b
            int r4 = com.google.assistant.p3803ag.p3809c.C48959bf.m85325a(r2)
            if (r4 != 0) goto L_0x02d3
            goto L_0x030e
        L_0x02d3:
            if (r4 != r9) goto L_0x030e
            com.google.assistant.ag.c.bc r0 = r0.f126671c
            if (r0 != 0) goto L_0x02db
            com.google.assistant.ag.c.bc r0 = com.google.assistant.p3803ag.p3809c.C48956bc.f126662c
        L_0x02db:
            int r2 = r13.size()
            r4 = 0
            r8 = 0
        L_0x02e1:
            if (r4 >= r2) goto L_0x0304
            java.lang.Object r9 = r13.get(r4)
            com.google.assistant.ag.c.bc r9 = (com.google.assistant.p3803ag.p3809c.C48956bc) r9
            com.google.common.base.ax r9 = m203438i(r7, r9, r0)
            boolean r10 = r9.mo56113h()
            if (r10 != 0) goto L_0x02f6
            r0 = r9
            goto L_0x056d
        L_0x02f6:
            java.lang.Object r9 = r9.mo56107c()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r8 = r8 | r9
            int r4 = r4 + 1
            goto L_0x02e1
        L_0x0304:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x030e:
            int r2 = com.google.assistant.p3803ag.p3809c.C48959bf.m85325a(r2)
            if (r2 != 0) goto L_0x0315
            goto L_0x0316
        L_0x0315:
            r8 = r2
        L_0x0316:
            java.lang.Object r13 = r13.get(r6)
            com.google.assistant.ag.c.bc r13 = (com.google.assistant.p3803ag.p3809c.C48956bc) r13
            com.google.assistant.ag.c.bc r0 = r0.f126671c
            if (r0 != 0) goto L_0x0322
            com.google.assistant.ag.c.bc r0 = com.google.assistant.p3803ag.p3809c.C48956bc.f126662c
        L_0x0322:
            com.google.common.base.ax r0 = m203438i(r8, r13, r0)
            goto L_0x056d
        L_0x0328:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x032c:
            r0 = 11
            if (r2 != r0) goto L_0x0335
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.cq r0 = (com.google.assistant.p3803ag.p3809c.C48997cq) r0
            goto L_0x0337
        L_0x0335:
            com.google.assistant.ag.c.cq r0 = com.google.assistant.p3803ag.p3809c.C48997cq.f126747e
        L_0x0337:
            com.google.common.base.ax r13 = r13.mo22567j()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x0345
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x0345:
            int r0 = r0.f126750b
            com.google.assistant.ag.c.cn r0 = com.google.assistant.p3803ag.p3809c.C48994cn.m85336a(r0)
            if (r0 != 0) goto L_0x034f
            com.google.assistant.ag.c.cn r0 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
        L_0x034f:
            java.lang.Object r13 = r13.mo56107c()
            boolean r13 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x0361:
            r0 = 9
            if (r2 != r0) goto L_0x036a
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.bk r0 = (com.google.assistant.p3803ag.p3809c.C48964bk) r0
            goto L_0x036c
        L_0x036a:
            com.google.assistant.ag.c.bk r0 = com.google.assistant.p3803ag.p3809c.C48964bk.f126680b
        L_0x036c:
            com.google.common.base.ax r13 = r13.mo22565h()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x037a
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x037a:
            int r0 = r0.f126682a
            com.google.assistant.ag.c.bj r0 = com.google.assistant.p3803ag.p3809c.C48963bj.m85326a(r0)
            if (r0 != 0) goto L_0x0384
            com.google.assistant.ag.c.bj r0 = com.google.assistant.p3803ag.p3809c.C48963bj.UNSPECIFIED
        L_0x0384:
            java.lang.Object r13 = r13.mo56107c()
            boolean r13 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x0396:
            if (r2 != r9) goto L_0x039d
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.aq r0 = (com.google.assistant.p3803ag.p3809c.C48943aq) r0
            goto L_0x039f
        L_0x039d:
            com.google.assistant.ag.c.aq r0 = com.google.assistant.p3803ag.p3809c.C48943aq.f126640b
        L_0x039f:
            com.google.common.base.ax r13 = r13.mo22558a()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x03ad
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x03ad:
            int r0 = r0.f126642a
            com.google.assistant.ag.c.ap r0 = com.google.assistant.p3803ag.p3809c.C48942ap.m85315a(r0)
            if (r0 != 0) goto L_0x03b7
            com.google.assistant.ag.c.ap r0 = com.google.assistant.p3803ag.p3809c.C48942ap.UNSPECIFIED
        L_0x03b7:
            java.lang.Object r13 = r13.mo56107c()
            boolean r13 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x03c9:
            r0 = 7
            if (r2 != r0) goto L_0x03d1
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.au r0 = (com.google.assistant.p3803ag.p3809c.C48947au) r0
            goto L_0x03d3
        L_0x03d1:
            com.google.assistant.ag.c.au r0 = com.google.assistant.p3803ag.p3809c.C48947au.f126650b
        L_0x03d3:
            com.google.common.base.ax r13 = r13.mo22560c()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x03e1
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x03e1:
            int r0 = r0.f126652a
            com.google.assistant.ag.c.at r0 = com.google.assistant.p3803ag.p3809c.C48946at.m85317a(r0)
            if (r0 != 0) goto L_0x03eb
            com.google.assistant.ag.c.at r0 = com.google.assistant.p3803ag.p3809c.C48946at.UNSPECIFIED
        L_0x03eb:
            java.lang.Object r13 = r13.mo56107c()
            boolean r13 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x03fd:
            r0 = 6
            if (r2 != r0) goto L_0x0405
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.ck r0 = (com.google.assistant.p3803ag.p3809c.C48991ck) r0
            goto L_0x0407
        L_0x0405:
            com.google.assistant.ag.c.ck r0 = com.google.assistant.p3803ag.p3809c.C48991ck.f126736b
        L_0x0407:
            com.google.common.base.ax r13 = r13.mo22566i()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x0415
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x0415:
            int r0 = r0.f126738a
            com.google.assistant.ag.c.cj r0 = com.google.assistant.p3803ag.p3809c.C48990cj.m85334a(r0)
            if (r0 != 0) goto L_0x041f
            com.google.assistant.ag.c.cj r0 = com.google.assistant.p3803ag.p3809c.C48990cj.UNSPECIFIED
        L_0x041f:
            java.lang.Object r13 = r13.mo56107c()
            boolean r13 = r0.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x0431:
            r0 = 5
            if (r2 != r0) goto L_0x0439
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.ce r0 = (com.google.assistant.p3803ag.p3809c.C48985ce) r0
            goto L_0x043b
        L_0x0439:
            com.google.assistant.ag.c.ce r0 = com.google.assistant.p3803ag.p3809c.C48985ce.f126722e
        L_0x043b:
            int r2 = r0.f126724a
            if (r2 != r4) goto L_0x04ac
            com.google.common.base.ax r13 = r13.mo22561d()
            boolean r2 = r13.mo56113h()
            if (r2 != 0) goto L_0x044d
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x044d:
            android.location.Location r2 = new android.location.Location
            java.lang.String r7 = "ContextTriggerInstantE"
            r2.<init>(r7)
            java.lang.Object r9 = r13.mo56107c()
            com.google.cg.k r9 = (com.google.p4479cg.C58079k) r9
            double r9 = r9.f155252a
            r2.setLatitude(r9)
            java.lang.Object r13 = r13.mo56107c()
            com.google.cg.k r13 = (com.google.p4479cg.C58079k) r13
            double r9 = r13.f155253b
            r2.setLongitude(r9)
            int r13 = r0.f126724a
            if (r13 != r4) goto L_0x0473
            java.lang.Object r13 = r0.f126725b
            com.google.assistant.ag.c.bu r13 = (com.google.assistant.p3803ag.p3809c.C48974bu) r13
            goto L_0x0475
        L_0x0473:
            com.google.assistant.ag.c.bu r13 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x0475:
            com.google.cg.k r13 = r13.f126698b
            if (r13 != 0) goto L_0x047b
            com.google.cg.k r13 = com.google.p4479cg.C58079k.f155250c
        L_0x047b:
            android.location.Location r9 = new android.location.Location
            r9.<init>(r7)
            double r10 = r13.f155252a
            r9.setLatitude(r10)
            double r10 = r13.f155253b
            r9.setLongitude(r10)
            int r13 = r0.f126724a
            if (r13 != r4) goto L_0x0493
            java.lang.Object r13 = r0.f126725b
            com.google.assistant.ag.c.bu r13 = (com.google.assistant.p3803ag.p3809c.C48974bu) r13
            goto L_0x0495
        L_0x0493:
            com.google.assistant.ag.c.bu r13 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
        L_0x0495:
            long r10 = r13.f126699c
            float r13 = r2.distanceTo(r9)
            float r0 = (float) r10
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x04a1
            goto L_0x04a2
        L_0x04a1:
            r8 = 0
        L_0x04a2:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x056d
        L_0x04ac:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x04b0:
            if (r2 != r7) goto L_0x04b7
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.dj r0 = (com.google.assistant.p3803ag.p3809c.C49017dj) r0
            goto L_0x04b9
        L_0x04b7:
            com.google.assistant.ag.c.dj r0 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x04b9:
            int r2 = r0.f126790a
            int r9 = com.google.assistant.p3803ag.p3809c.C49008da.m85342b(r2)
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x055f
            if (r10 == 0) goto L_0x0508
            if (r10 == r8) goto L_0x04fa
            if (r10 == r7) goto L_0x04f6
            if (r10 == r5) goto L_0x04f6
            if (r10 == r4) goto L_0x04f6
            com.google.common.f.e r13 = f342591a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r2, r1)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r2 = 35375(0x8a2f, float:4.9571E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r2)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            int r0 = r0.f126790a
            int r0 = com.google.assistant.p3803ag.p3809c.C49008da.m85342b(r0)
            java.lang.String r2 = com.google.assistant.p3803ag.p3809c.C49008da.m85341a(r0)
            if (r0 == 0) goto L_0x04f5
            java.lang.String r0 = "Unknown TimeContext trigger condition: %s"
            r13.mo56389s(r0, r2)
            goto L_0x04f6
        L_0x04f5:
            throw r3
        L_0x04f6:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x056d
        L_0x04fa:
            if (r2 != r7) goto L_0x0501
            java.lang.Object r0 = r0.f126791b
            com.google.assistant.ag.c.di r0 = (com.google.assistant.p3803ag.p3809c.C49016di) r0
            goto L_0x0503
        L_0x0501:
            com.google.assistant.ag.c.di r0 = com.google.assistant.p3803ag.p3809c.C49016di.f126780f
        L_0x0503:
            com.google.common.base.ax r0 = m203435f(r0, r13)
            goto L_0x056d
        L_0x0508:
            com.google.assistant.ag.c.z r2 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.ag.c.y r2 = (com.google.assistant.p3803ag.p3809c.C49155y) r2
            int r4 = r0.f126790a
            if (r4 != r8) goto L_0x0519
            java.lang.Object r4 = r0.f126791b
            com.google.assistant.ag.c.cy r4 = (com.google.assistant.p3803ag.p3809c.C49005cy) r4
            goto L_0x051b
        L_0x0519:
            com.google.assistant.ag.c.cy r4 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x051b:
            long r9 = r4.f126764b
            com.google.protobuf.fg r4 = m203436g(r9)
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.assistant.ag.c.z r9 = (com.google.assistant.p3803ag.p3809c.C49156z) r9
            r4.getClass()
            r9.f127114b = r4
            int r4 = r9.f127113a
            r4 = r4 | r8
            r9.f127113a = r4
            int r4 = r0.f126790a
            if (r4 != r8) goto L_0x053b
            java.lang.Object r0 = r0.f126791b
            com.google.assistant.ag.c.cy r0 = (com.google.assistant.p3803ag.p3809c.C49005cy) r0
            goto L_0x053d
        L_0x053b:
            com.google.assistant.ag.c.cy r0 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x053d:
            long r8 = r0.f126765c
            com.google.protobuf.fg r0 = m203436g(r8)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.ag.c.z r4 = (com.google.assistant.p3803ag.p3809c.C49156z) r4
            r0.getClass()
            r4.f127115c = r0
            int r0 = r4.f127113a
            r0 = r0 | r7
            r4.f127113a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
            com.google.common.base.ax r0 = m203433d(r0, r13)
            goto L_0x056d
        L_0x055f:
            throw r3
        L_0x0560:
            if (r2 != r8) goto L_0x0567
            java.lang.Object r0 = r12.f126692b
            com.google.assistant.ag.c.z r0 = (com.google.assistant.p3803ag.p3809c.C49156z) r0
            goto L_0x0569
        L_0x0567:
            com.google.assistant.ag.c.z r0 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0569:
            com.google.common.base.ax r0 = m203433d(r0, r13)
        L_0x056d:
            boolean r13 = r0.mo56113h()
            if (r13 != 0) goto L_0x05e3
            com.google.common.f.e r13 = f342591a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r1)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r0 = 35373(0x8a2d, float:4.9568E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r0)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            int r0 = r12.f126691a
            int r0 = com.google.assistant.p3803ag.p3809c.C48966bm.m85328a(r0)
            switch(r0) {
                case 1: goto L_0x05bc;
                case 2: goto L_0x05b9;
                case 3: goto L_0x05b6;
                case 4: goto L_0x05b3;
                case 5: goto L_0x05b0;
                case 6: goto L_0x05ad;
                case 7: goto L_0x05aa;
                case 8: goto L_0x05a7;
                case 9: goto L_0x05a4;
                case 10: goto L_0x05a1;
                case 11: goto L_0x059e;
                case 12: goto L_0x059b;
                case 13: goto L_0x0598;
                case 14: goto L_0x0595;
                default: goto L_0x0592;
            }
        L_0x0592:
            java.lang.String r1 = "null"
            goto L_0x05be
        L_0x0595:
            java.lang.String r1 = "LEAFCONDITION_NOT_SET"
            goto L_0x05be
        L_0x0598:
            java.lang.String r1 = "MEDIA_CONTEXT"
            goto L_0x05be
        L_0x059b:
            java.lang.String r1 = "APP_STATE_CONTEXT"
            goto L_0x05be
        L_0x059e:
            java.lang.String r1 = "AUDIO_STATE_CONTEXT"
            goto L_0x05be
        L_0x05a1:
            java.lang.String r1 = "CUSTOM_DEVICE_CONTEXT"
            goto L_0x05be
        L_0x05a4:
            java.lang.String r1 = "PHONE_LOCK_CONTEXT"
            goto L_0x05be
        L_0x05a7:
            java.lang.String r1 = "SCREEN_CONTEXT"
            goto L_0x05be
        L_0x05aa:
            java.lang.String r1 = "GMM_NAVIGATION_CONTEXT"
            goto L_0x05be
        L_0x05ad:
            java.lang.String r1 = "AUTO_DRIVING_CONTEXT"
            goto L_0x05be
        L_0x05b0:
            java.lang.String r1 = "CONNECTED_PHONE_CONTEXT"
            goto L_0x05be
        L_0x05b3:
            java.lang.String r1 = "NETWORK_CONTEXT"
            goto L_0x05be
        L_0x05b6:
            java.lang.String r1 = "LOCATION_CONTEXT"
            goto L_0x05be
        L_0x05b9:
            java.lang.String r1 = "TIME_CONTEXT"
            goto L_0x05be
        L_0x05bc:
            java.lang.String r1 = "ABSOLUTE_TIME_INTERVAL"
        L_0x05be:
            if (r0 == 0) goto L_0x05e2
            java.lang.String r0 = "Failed to evaluate leaf trigger condition: %s"
            r13.mo56389s(r0, r1)
            com.google.assistant.ag.c.bq r12 = r12.f126693c
            if (r12 != 0) goto L_0x05cb
            com.google.assistant.ag.c.bq r12 = com.google.assistant.p3803ag.p3809c.C48970bq.f126685b
        L_0x05cb:
            int r12 = r12.f126687a
            int r12 = com.google.assistant.p3803ag.p3809c.C48969bp.m85329a(r12)
            if (r12 != 0) goto L_0x05d4
            goto L_0x05d9
        L_0x05d4:
            if (r12 != r5) goto L_0x05d9
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x05e3
        L_0x05d9:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x05e3
        L_0x05e2:
            throw r3
        L_0x05e3:
            return r0
        L_0x05e4:
            throw r3
        L_0x05e5:
            goto L_0x05e7
        L_0x05e6:
            throw r3
        L_0x05e7:
            goto L_0x05e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9338h.C124033e.m203434e(com.google.assistant.ag.c.az, com.google.android.apps.search.assistant.platform.pcp.h.c):com.google.common.base.ax");
    }
}
