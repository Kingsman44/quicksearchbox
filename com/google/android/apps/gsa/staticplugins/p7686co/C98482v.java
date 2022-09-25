package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.proactive.C84175k;
import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.gsa.proactive.C84181q;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.v */
/* compiled from: PG */
public final class C98482v implements C84175k {

    /* renamed from: b */
    private static final C59071e f275007b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.v");

    /* renamed from: c */
    private static final long f275008c = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    public final C68214a f275009a;

    /* renamed from: d */
    private final C68214a f275010d;

    /* renamed from: e */
    private final C68214a f275011e;

    /* renamed from: f */
    private final C68214a f275012f;

    /* renamed from: g */
    private final C68214a f275013g;

    public C98482v(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f275009a = aVar;
        this.f275010d = aVar2;
        this.f275011e = aVar3;
        this.f275012f = aVar4;
        this.f275013g = aVar5;
    }

    /* renamed from: a */
    public final C84179o mo77638a(C118476ak akVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C98159ao.f274111a);
        akVar.mo58887l(r0);
        if (!akVar.f169962ag.mo58857o(r0.f169971d)) {
            return null;
        }
        C62940bt r02 = C62942bv.checkIsLite(C98159ao.f274111a);
        akVar.mo58887l(r02);
        Object l = akVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return (C84179o) obj;
    }

    /* renamed from: b */
    public final C84181q mo77639b(C118476ak akVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C98155ak.f274088a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return (C84181q) obj;
    }

    /* renamed from: c */
    public final void mo77640c(boolean z) {
        C118522by byVar = z ? C118522by.REQUEST_SCHEDULE_RESET_WITH_RESTART : C118522by.REQUEST_SCHEDULE_RESET_WITHOUT_RESTART;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long j = f275008c;
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = j;
        ((C118561t) this.f275009a.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
    }

    /* JADX WARNING: type inference failed for: r9v20, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo77641d(android.content.Intent r9) {
        /*
            r8 = this;
            dagger.a r0 = r8.f275011e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.gcoreclient.f.a.v r0 = (com.google.android.libraries.gcoreclient.p1759f.p1760a.C21520v) r0
            com.google.android.gms.awareness.fence.FenceState r9 = com.google.android.gms.contextmanager.fence.internal.FenceStateImpl.m234223a(r9)
            com.google.android.gms.contextmanager.fence.internal.FenceStateImpl r9 = (com.google.android.gms.contextmanager.fence.internal.FenceStateImpl) r9
            java.lang.String r0 = r9.f390279c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1 = 8
            r2 = 2
            r3 = 0
            java.lang.String r4 = "RequestSchedEvalClient"
            if (r0 != 0) goto L_0x002e
            com.google.common.f.e r9 = f275007b
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r0, r4)
            java.lang.String r0 = "Trigger info key was null"
            r4 = 30418(0x76d2, float:4.2625E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r4)).mo56386p(r0)
            goto L_0x00c2
        L_0x002e:
            java.lang.String r5 = "KATO_REQ_SCHED_"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x004a
            com.google.common.f.e r9 = f275007b
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r5, r4)
            java.lang.String r4 = "Invalid registration ID: %s"
            r5 = 30417(0x76d1, float:4.2623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r5)).mo56389s(r4, r0)
            goto L_0x00c2
        L_0x004a:
            r5 = 15
            java.lang.String r5 = r0.substring(r5)     // Catch:{ NumberFormatException -> 0x00b0 }
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x00b0 }
            com.google.android.apps.gsa.proactive.o r4 = com.google.android.apps.gsa.proactive.C84179o.f229121f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.proactive.n r4 = (com.google.android.apps.gsa.proactive.C84178n) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.proactive.o r5 = (com.google.android.apps.gsa.proactive.C84179o) r5
            int r6 = r5.f229123a
            r7 = 1
            r6 = r6 | r7
            r5.f229123a = r6
            r5.f229124b = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.apps.gsa.proactive.o r0 = (com.google.android.apps.gsa.proactive.C84179o) r0
            int r5 = r0.f229123a
            r5 = r5 | r2
            r0.f229123a = r5
            r0.f229125c = r3
            int r9 = r9.f390277a
            if (r9 != r2) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.android.apps.gsa.proactive.o r9 = (com.google.android.apps.gsa.proactive.C84179o) r9
            int r0 = r9.f229123a
            r0 = r0 | 4
            r9.f229123a = r0
            r9.f229126d = r7
            dagger.a r9 = r8.f275010d
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.libraries.f.a r9 = (com.google.android.libraries.p1730f.C21370a) r9
            long r5 = r9.mo26871c()
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.android.apps.gsa.proactive.o r9 = (com.google.android.apps.gsa.proactive.C84179o) r9
            int r0 = r9.f229123a
            r0 = r0 | r1
            r9.f229123a = r0
            r9.f229127e = r5
            com.google.protobuf.bv r9 = r4.build()
            r3 = r9
            com.google.android.apps.gsa.proactive.o r3 = (com.google.android.apps.gsa.proactive.C84179o) r3
            goto L_0x00c2
        L_0x00b0:
            com.google.common.f.e r9 = f275007b
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r5, r4)
            java.lang.String r4 = "Failed to parse registration ID: %s"
            r5 = 30416(0x76d0, float:4.2622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r5)).mo56389s(r4, r0)
        L_0x00c2:
            if (r3 != 0) goto L_0x00c7
            com.google.common.util.concurrent.cx r9 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r9
        L_0x00c7:
            dagger.a r9 = r8.f275012f
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.proactive.a.a r9 = (com.google.android.apps.gsa.proactive.p6474a.C84156a) r9
            com.google.common.util.concurrent.cx r9 = r9.mo77587f(r3)
            boolean r0 = r3.f229126d
            if (r0 != 0) goto L_0x00dc
            com.google.common.util.concurrent.cx r9 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r9)
            return r9
        L_0x00dc:
            dagger.a r0 = r8.f275013g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.c.bz r0 = (com.google.android.apps.gsa.shared.util.p7159c.C90929bz) r0
            com.google.android.apps.gsa.staticplugins.co.u r3 = new com.google.android.apps.gsa.staticplugins.co.u
            r3.<init>(r8)
            com.google.android.apps.gsa.shared.util.c.ao r4 = new com.google.android.apps.gsa.shared.util.c.ao
            java.lang.String r5 = "scheduleTransition"
            r4.<init>(r5, r2, r1, r3)
            com.google.common.util.concurrent.cx r9 = r0.mo85141f(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.C98482v.mo77641d(android.content.Intent):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final void mo77642e() {
        C118522by byVar = C118522by.REQUEST_SCHEDULE_UNREGISTER;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long j = f275008c;
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = j;
        ((C118561t) this.f275009a.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
    }
}
