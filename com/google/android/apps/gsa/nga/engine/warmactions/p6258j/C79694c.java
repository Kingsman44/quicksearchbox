package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.am.c.ay;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.c */
/* compiled from: PG */
public final class C79694c extends C79708q {

    /* renamed from: e */
    private static final C58974d f218552e = C58974d.m91136j();

    public C79694c(C79646ab abVar, C75113bn bnVar, ay ayVar, C74886bd bdVar, C76087c cVar) {
        super(abVar, bnVar, ayVar, bdVar, cVar);
    }

    /* renamed from: e */
    private final C58485gu m127775e() {
        return (C58485gu) Collection.EL.stream(this.f218599a.b().mo71273a()).filter(C79671b.f218493a).collect(C58370cn.f155946a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo74188a(com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79690bs r10) {
        /*
            r9 = this;
            r10.mo74199g()
            r10.mo74198f()
            com.google.android.apps.gsa.nga.engine.am.c.bd r0 = r9.f218600b
            com.google.android.apps.gsa.nga.engine.am.c.a.y r0 = (com.google.android.apps.gsa.nga.engine.am.c.a.y) r0
            com.google.android.apps.gsa.nga.engine.am.c.a.k r0 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0026
            com.google.common.f.a.d r10 = f218552e
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r0 = "#MWW There is no alarm firing."
            r1 = 5724(0x165c, float:8.021E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            return r10
        L_0x0026:
            com.google.android.apps.gsa.nga.shared.aa.e.l r0 = m127802d()
            java.lang.String r1 = r10.mo74198f()
            int r2 = r1.hashCode()
            r3 = -897610266(0xffffffffca7f8de6, float:-4187001.5)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0049
            r3 = 3540994(0x360802, float:4.96199E-39)
            if (r2 == r3) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            java.lang.String r2 = "stop"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r1 = 0
            goto L_0x0054
        L_0x0049:
            java.lang.String r2 = "snooze"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = -1
        L_0x0054:
            java.lang.String r2 = "#MWW No firing alarm found in Icing. Fallback to legacy intent."
            if (r1 == 0) goto L_0x00d4
            if (r1 == r5) goto L_0x007c
            com.google.common.f.a.d r0 = f218552e
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 5723(0x165b, float:8.02E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = r10.mo74199g()
            java.lang.String r10 = r10.mo74198f()
            java.lang.String r2 = "#MWW Unsupported alarm query: %s [command: %s]."
            r0.mo56354G(r2, r1, r10)
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            return r10
        L_0x007c:
            r1 = 23236(0x5ac4, float:3.256E-41)
            r0.mo74319k(r1)
            boolean r1 = r9.mo74211c()
            if (r1 == 0) goto L_0x00b8
            com.google.common.b.gu r1 = r9.m127775e()
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x00ad
            com.google.assistant.e.i.a.l r10 = com.google.assistant.p3897e.p3917i.p3918a.C51527l.f134273f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.i.a.k r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51500k) r10
            r10.mo53630b(r1)
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.e.i.a.l r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51527l) r10
            java.lang.String r1 = "alarm.SNOOZE_ALARM"
            com.google.assistant.e.j.dy r10 = com.google.android.apps.gsa.nga.engine.am.t.i(r1, r10)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r0, r10)
            goto L_0x01a1
        L_0x00ad:
            com.google.common.f.a.d r1 = f218552e
            com.google.common.f.x r1 = r1.mo56226d()
            r3 = 5725(0x165d, float:8.022E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x00b8:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SNOOZE_ALARM"
            r1.<init>(r2)
            com.google.android.apps.gsa.nga.engine.b.c.j r10 = r10.mo74193a()
            com.google.android.apps.gsa.nga.engine.b.g.ac r10 = r10.b()
            com.google.android.apps.gsa.nga.shared.v.io r10 = r10.b()
            com.google.assistant.e.j.dy r10 = com.google.android.apps.gsa.nga.engine.am.t.u(r1, r5, r10, r4, r4)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r0, r10)
            goto L_0x01a1
        L_0x00d4:
            r1 = 24443(0x5f7b, float:3.4252E-41)
            r0.mo74319k(r1)
            boolean r1 = r9.mo74211c()
            if (r1 == 0) goto L_0x017f
            com.google.common.b.gu r1 = r9.m127775e()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.nga.engine.warmactions.j.a r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79644a.f218461a
            j$.util.stream.Stream r1 = r1.map(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r3)
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0174
            int r10 = r1.size()
        L_0x00ff:
            if (r4 >= r10) goto L_0x01a1
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            com.google.assistant.e.b.b.j r3 = com.google.assistant.p3897e.p3899b.p3901b.C50883j.f132484b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.b.b.i r3 = (com.google.assistant.p3897e.p3899b.p3901b.C50882i) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.b.b.j r6 = (com.google.assistant.p3897e.p3899b.p3901b.C50883j) r6
            r2.getClass()
            com.google.protobuf.cq r7 = r6.f132486a
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x0127
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f132486a = r7
        L_0x0127:
            com.google.protobuf.cq r6 = r6.f132486a
            r6.add(r2)
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.b.b.j r2 = (com.google.assistant.p3897e.p3899b.p3901b.C50883j) r2
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.jz r3 = (com.google.assistant.p3897e.p3921j.C52228jz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6
            int r7 = r6.f137059a
            r7 = r7 | r5
            r6.f137059a = r7
            java.lang.String r7 = "assistant.api.params.AlarmStopAlarmArgs"
            r6.f137060b = r7
            com.google.protobuf.z r2 = r2.toByteString()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6
            r2.getClass()
            int r7 = r6.f137059a
            r7 = r7 | 2
            r6.f137059a = r7
            r6.f137061c = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            java.lang.String r3 = "alarm.STOP_ALARM"
            java.lang.String r6 = "alarm_stop_alarm_args"
            com.google.assistant.e.j.dy r2 = com.google.android.apps.gsa.nga.engine.am.t.a(r3, r6, r2)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r0, r2)
            int r4 = r4 + 1
            goto L_0x00ff
        L_0x0174:
            com.google.common.f.a.d r1 = f218552e
            com.google.common.f.x r1 = r1.mo56226d()
            r3 = 5726(0x165e, float:8.024E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x017f:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.DISMISS_ALARM"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.extra.alarm.SEARCH_MODE"
            java.lang.String r3 = "android.next"
            android.content.Intent r1 = r1.putExtra(r2, r3)
            com.google.android.apps.gsa.nga.engine.b.c.j r10 = r10.mo74193a()
            com.google.android.apps.gsa.nga.engine.b.g.ac r10 = r10.b()
            com.google.android.apps.gsa.nga.shared.v.io r10 = r10.b()
            com.google.assistant.e.j.dy r10 = com.google.android.apps.gsa.nga.engine.am.t.u(r1, r5, r10, r4, r4)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r0, r10)
        L_0x01a1:
            com.google.protobuf.bv r10 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r10 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r10
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79694c.mo74188a(com.google.android.apps.gsa.nga.engine.warmactions.j.bs):j$.util.Optional");
    }
}
