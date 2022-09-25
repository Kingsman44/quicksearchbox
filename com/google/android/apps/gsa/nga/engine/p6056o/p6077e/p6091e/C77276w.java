package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4850an.p4853b.C63363g;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.w */
/* compiled from: PG */
public final class C77276w {

    /* renamed from: a */
    public static final /* synthetic */ int f213129a = 0;

    /* renamed from: b */
    private static final C58974d f213130b = C58974d.m91136j();

    /* renamed from: c */
    private static final C58528ij f213131c = C58528ij.m90011K(C63363g.HOUR_AMBIGUOUS_ORIGINAL, C63363g.HOUR_AMBIGUOUS_INFERRED);

    /* renamed from: d */
    private final C79402e f213132d;

    public C77276w(C79402e eVar) {
        this.f213132d = eVar;
    }

    /* renamed from: a */
    static Predicate m123998a(C51419h hVar) {
        return new C77262i(hVar);
    }

    /* renamed from: c */
    static Predicate m123999c(C76590bg bgVar) {
        Optional map = bgVar.mo72265g(C76564ah.f211801a, C77149ab.f212918b).filter(C77263j.f213113a).map(C77264k.f213114a);
        return !map.isPresent() ? C77265l.f213115a : new C77266m(map);
    }

    /* renamed from: d */
    static Predicate m124000d(C51419h hVar) {
        return new C77255e(hVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.function.Predicate mo72488b(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r6, p3186j$.time.ZonedDateTime r7, boolean r8) {
        /*
            r5 = this;
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            java.lang.String[] r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77149ab.f212917a
            com.google.common.b.gu r1 = r6.mo72263e(r1)
            r0.mo55396h(r1)
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "alarm_object"
            r4 = 0
            r2[r4] = r3
            j$.util.stream.Stream r2 = r6.mo72274q(r2)
            com.google.android.apps.gsa.nga.engine.o.c.bb r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76585bb.f211831a
            j$.util.stream.Stream r2 = r2.filter(r3)
            com.google.android.apps.gsa.nga.engine.o.c.bc r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76586bc.f211832a
            j$.util.stream.Stream r2 = r2.map(r3)
            com.google.android.apps.gsa.nga.engine.o.c.t r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76608t.f211855a
            j$.util.stream.Stream r2 = r2.flatMap(r3)
            com.google.android.apps.gsa.nga.engine.o.c.u r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76609u.f211856a
            j$.util.stream.Stream r2 = r2.filter(r3)
            com.google.android.apps.gsa.nga.engine.o.c.v r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76610v.f211857a
            j$.util.stream.Stream r2 = r2.flatMap(r3)
            com.google.android.apps.gsa.nga.engine.o.c.w r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76611w.f211858a
            j$.util.stream.Stream r2 = r2.filter(r3)
            com.google.android.apps.gsa.nga.engine.o.c.x r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76612x.f211859a
            j$.util.stream.Stream r2 = r2.map(r3)
            com.google.android.apps.gsa.nga.engine.o.c.m r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76601m.f211848a
            j$.util.stream.Stream r2 = r2.map(r3)
            com.google.android.apps.gsa.nga.engine.o.c.ax r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76580ax.f211820a
            j$.util.stream.Stream r2 = r2.flatMap(r3)
            com.google.android.apps.gsa.nga.engine.o.c.g r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76595g.f211842a
            j$.util.stream.Stream r2 = r2.map(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r3)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            r0.mo55396h(r2)
            com.google.common.b.gu r0 = r0.mo55394f()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0142
            r2 = r0
            com.google.common.b.pq r2 = (com.google.common.p4522b.C58724pq) r2
            int r2 = r2.f156474d
            if (r2 != r1) goto L_0x0102
            java.lang.Object r2 = r0.get(r4)
            com.google.assistant.e.j.qd r2 = (com.google.assistant.p3897e.p3921j.C52395qd) r2
            com.google.android.apps.gsa.nga.engine.w.e r3 = r5.f213132d
            java.lang.Object r0 = r0.get(r4)
            com.google.assistant.e.j.qd r0 = (com.google.assistant.p3897e.p3921j.C52395qd) r0
            j$.time.ZonedDateTime r0 = r3.mo74014f(r0)
            j$.time.ZoneId r3 = r7.getZone()
            j$.time.ZonedDateTime r0 = r0.withZoneSameInstant(r3)
            java.lang.String[] r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77149ab.f212917a
            j$.util.Optional r6 = r6.mo72264f(r3)
            com.google.android.apps.gsa.nga.engine.o.c.au r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76577au.f211817a
            j$.util.Optional r6 = r6.map(r3)
            com.google.protos.an.b.i r3 = com.google.protos.p4850an.p4853b.C63365i.f171246d
            java.lang.Object r6 = r6.orElse(r3)
            com.google.protos.an.b.i r6 = (com.google.protos.p4850an.p4853b.C63365i) r6
            if (r8 != 0) goto L_0x00be
            com.google.common.b.ij r8 = f213131c
            int r6 = r6.f171250c
            com.google.protos.an.b.g r6 = com.google.protos.p4850an.p4853b.C63363g.m96228a(r6)
            if (r6 != 0) goto L_0x00ad
            com.google.protos.an.b.g r6 = com.google.protos.p4850an.p4853b.C63363g.HOUR_NONE
        L_0x00ad:
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L_0x00b4
            goto L_0x00be
        L_0x00b4:
            com.google.common.base.ac r6 = com.google.common.base.C58812ac.f156604a
            com.google.android.apps.gsa.nga.engine.o.e.e.r r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77271r.f213124a
            com.google.common.base.ai r3 = new com.google.common.base.ai
            r3.<init>(r8, r6)
            goto L_0x00c7
        L_0x00be:
            com.google.common.base.ac r6 = com.google.common.base.C58812ac.f156604a
            com.google.android.apps.gsa.nga.engine.o.e.e.q r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77270q.f213123a
            com.google.common.base.ai r3 = new com.google.common.base.ai
            r3.<init>(r8, r6)
        L_0x00c7:
            int r6 = r2.f137487a
            r6 = r6 & 2
            if (r6 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            com.google.android.apps.gsa.nga.engine.o.e.e.o r6 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77268o.f213120a
            if (r1 == 0) goto L_0x00d8
            com.google.android.apps.gsa.nga.engine.o.e.e.p r6 = new com.google.android.apps.gsa.nga.engine.o.e.e.p
            r6.<init>(r3, r0)
        L_0x00d8:
            if (r1 == 0) goto L_0x00ec
            r1 = 1
            j$.time.Duration r8 = p3186j$.time.Duration.ofDays(r1)
            j$.time.ZonedDateTime r8 = r0.minus(r8)
            boolean r8 = r8.isBefore(r7)
            if (r8 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            return r6
        L_0x00ec:
            j$.time.LocalDate r8 = r0.toLocalDate()
            j$.time.DayOfWeek r0 = r8.getDayOfWeek()
            int r0 = com.google.android.apps.gsa.nga.engine.p6246w.C79402e.m127434a(r0)
            com.google.android.apps.gsa.nga.engine.o.e.e.n r1 = new com.google.android.apps.gsa.nga.engine.o.e.e.n
            r1.<init>(r0, r7, r8)
            j$.util.function.Predicate r6 = r6.and(r1)
            return r6
        L_0x0102:
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.nga.engine.o.e.e.t r7 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77273t.f213126a
            boolean r6 = r6.anyMatch(r7)
            if (r6 == 0) goto L_0x011e
            com.google.common.f.a.d r6 = f213130b
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Cannot filter alarms on multiple times"
            r8 = 3831(0xef7, float:5.368E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r8)).mo56386p(r7)
            com.google.android.apps.gsa.nga.engine.o.e.e.u r6 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77274u.f213127a
            return r6
        L_0x011e:
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.nga.engine.o.e.e.v r7 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77275v.f213128a
            j$.util.stream.Stream r6 = r6.map(r7)
            com.google.android.apps.gsa.nga.engine.o.e.e.f r7 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77259f.f213109a
            j$.util.stream.Stream r6 = r6.map(r7)
            com.google.android.apps.gsa.nga.engine.o.e.e.g r7 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77260g.f213110a
            j$.util.stream.Stream r6 = r6.map(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r6 = r6.collect(r7)
            com.google.common.b.ij r6 = (com.google.common.p4522b.C58528ij) r6
            com.google.android.apps.gsa.nga.engine.o.e.e.h r7 = new com.google.android.apps.gsa.nga.engine.o.e.e.h
            r7.<init>(r6)
            return r7
        L_0x0142:
            com.google.android.apps.gsa.nga.engine.o.e.e.s r6 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77272s.f213125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77276w.mo72488b(com.google.android.apps.gsa.nga.engine.o.c.bg, j$.time.ZonedDateTime, boolean):j$.util.function.Predicate");
    }
}
