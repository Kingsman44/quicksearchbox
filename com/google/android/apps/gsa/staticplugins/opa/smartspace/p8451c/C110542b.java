package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.b */
/* compiled from: PG */
public final /* synthetic */ class C110542b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110547g f308179a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308180b;

    public /* synthetic */ C110542b(C110547g gVar, SettableFuture settableFuture) {
        this.f308179a = gVar;
        this.f308180b = settableFuture;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.apps.gsa.shared.h.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17870a(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.g r0 = r11.f308179a
            com.google.common.util.concurrent.SettableFuture r1 = r11.f308180b
            com.google.common.base.ax r12 = (com.google.common.base.C58833ax) r12
            com.google.common.f.a.d r2 = r0.f308197j
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#onCalendarEventLoadSuccess()"
            r4 = 26532(0x67a4, float:3.7179E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.f.a.d r2 = r0.f308197j
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#maybeSendNextCalendarUpdate()"
            r4 = 26523(0x679b, float:3.7167E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r3 = r0.f308192e
            long r3 = r3.mo26870b()
            long r2 = r2.toSeconds(r3)
            com.google.android.apps.gsa.shared.h.h r4 = com.google.android.apps.gsa.shared.p7041h.C89776h.f242979p
            long r5 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110547g.f308188a
            long r2 = r2 + r5
            boolean r5 = r12.mo56113h()
            if (r5 == 0) goto L_0x009e
            java.lang.Object r12 = r12.mo56107c()
            r4 = r12
            com.google.android.apps.gsa.shared.h.h r4 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r4
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            r2 = 26526(0x679e, float:3.7171E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r2)
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            java.lang.String r2 = r4.f242984d
            java.lang.String r3 = r4.f242993m
            java.lang.String r5 = "SortedEventSet has top item: %s; sync_id: %s"
            r12.mo56354G(r5, r2, r3)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r2 = r0.f308192e
            long r2 = r2.mo26870b()
            long r2 = r12.toSeconds(r2)
            long r5 = r4.f242985e
            com.google.android.apps.gsa.opa.smartspace.j r12 = r0.f308196i
            boolean r12 = r12.mo77176n()
            if (r12 == 0) goto L_0x007a
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES
            com.google.android.apps.gsa.opa.smartspace.j r7 = r0.f308196i
            long r7 = r7.mo77166b()
            long r7 = r12.toSeconds(r7)
            goto L_0x007c
        L_0x007a:
            long r7 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110547g.f308189b
        L_0x007c:
            com.google.android.apps.gsa.opa.smartspace.j r12 = r0.f308196i
            boolean r12 = r12.mo77176n()
            if (r12 == 0) goto L_0x0091
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES
            com.google.android.apps.gsa.opa.smartspace.j r9 = r0.f308196i
            long r9 = r9.mo77165a()
            long r9 = r12.toSeconds(r9)
            goto L_0x0093
        L_0x0091:
            long r9 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110547g.f308190c
        L_0x0093:
            long r2 = r5 - r2
            int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x009b
            long r5 = r5 - r7
            goto L_0x009c
        L_0x009b:
            long r5 = r5 + r9
        L_0x009c:
            r2 = r5
            goto L_0x00ab
        L_0x009e:
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r5 = "Next event is empty."
            r6 = 26524(0x679c, float:3.7168E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r12).mo56372aa(r6)).mo56386p(r5)
        L_0x00ab:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r12.toMillis(r2)
            com.google.android.apps.gsa.opa.smartspace.j r12 = r0.f308196i
            boolean r12 = r12.mo77171i()
            if (r12 == 0) goto L_0x00df
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            r5 = 26539(0x67ab, float:3.7189E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r5)
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            java.lang.String r5 = "Schedule calendar update using alarm manager. Next alarm time: %s"
            r12.mo56388r(r5, r2)
            com.google.android.libraries.storage.protostore.ab r12 = r0.f308200m
            com.google.common.util.concurrent.cx r12 = r12.mo46042d()
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.e r5 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.c.e
            r5.<init>(r0, r2)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r12, r5, r2)
            goto L_0x014b
        L_0x00df:
            com.google.android.libraries.f.a r12 = r0.f308192e
            long r5 = r12.mo26870b()
            long r2 = r2 - r5
            r5 = 0
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0102
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            r5 = 26538(0x67aa, float:3.7188E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r5)
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            java.lang.String r5 = "OneOffTask delay cannot be negative: %d"
            r12.mo56388r(r5, r2)
            goto L_0x014b
        L_0x0102:
            com.google.android.apps.gsa.tasks.t r12 = r0.f308193f
            com.google.android.apps.gsa.tasks.by r5 = com.google.android.apps.gsa.tasks.C118522by.SMARTSPACE_CALENDAR_UPDATE
            r12.mo103752c(r5)
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r5 = "Scheduling calendar update task"
            r6 = 26537(0x67a9, float:3.7186E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r12).mo56372aa(r6)).mo56386p(r5)
            com.google.android.apps.gsa.tasks.t r12 = r0.f308193f
            com.google.android.apps.gsa.tasks.by r5 = com.google.android.apps.gsa.tasks.C118522by.SMARTSPACE_CALENDAR_UPDATE
            com.google.android.apps.gsa.tasks.ag r6 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.tasks.af r6 = (com.google.android.apps.gsa.tasks.C118471af) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            int r8 = r7.f328821a
            r8 = r8 | 1
            r7.f328821a = r8
            r7.f328822b = r2
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            int r3 = r2.f328821a
            r3 = r3 | 2
            r2.f328821a = r3
            r7 = 2000(0x7d0, double:9.88E-321)
            r2.f328823c = r7
            com.google.protobuf.bv r2 = r6.build()
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            r12.mo103754e(r5, r2)
        L_0x014b:
            com.google.common.f.a.d r12 = r0.f308197j
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r2 = "Send next event to Android Smartspace."
            r3 = 26525(0x679d, float:3.717E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r12).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.core.al.db.b r12 = r0.f308194g
            com.google.common.util.concurrent.cx r12 = r12.mo78853f(r4)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a r0 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a
            r0.<init>(r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            r12.mo4106b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110542b.mo17870a(java.lang.Object):void");
    }
}
