package com.google.android.apps.gsa.nga.engine.viss;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.apps.gsa.nga.api.C74741y;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p6056o.C76537ae;
import com.google.android.apps.gsa.nga.engine.p6056o.C76538b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78261k;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1484g.p1502d.C18164ap;
import com.google.android.libraries.assistant.p1484g.p1502d.C18185v;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.e */
/* compiled from: PG */
public final class C79375e extends C74741y {

    /* renamed from: a */
    private final C68214a f217989a;

    /* renamed from: b */
    private final C68214a f217990b;

    /* renamed from: c */
    private final C68214a f217991c;

    /* renamed from: d */
    private final C68214a f217992d;

    /* renamed from: e */
    private final C68214a f217993e;

    /* renamed from: f */
    private final C68214a f217994f;

    /* renamed from: g */
    private final C91142g f217995g;

    static {
        C58974d.m91134h("VisEventsCallback");
    }

    public C79375e(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C91142g gVar) {
        this.f217989a = aVar;
        this.f217990b = aVar2;
        this.f217991c = aVar3;
        this.f217992d = aVar4;
        this.f217993e = aVar5;
        this.f217994f = aVar6;
        this.f217995g = gVar;
    }

    /* renamed from: e */
    public final void mo71119e() {
        ((C74946b) this.f217992d.mo27525b()).mo71314d();
    }

    /* renamed from: f */
    public final void mo71120f() {
        ((C74946b) this.f217992d.mo27525b()).mo71315e();
    }

    /* renamed from: g */
    public final void mo71121g(int i) {
        C18164ap a = ((C18185v) this.f217993e.mo27525b()).mo23651a(i);
        if (a != null) {
            a.mo23650h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71122h(android.os.Bundle r7, android.app.assist.AssistStructure r8, android.app.assist.AssistContent r9, int r10, com.google.android.libraries.assistant.p1484g.p1502d.C18155ag r11) {
        /*
            r6 = this;
            if (r11 != 0) goto L_0x0016
            dagger.a r10 = r6.f217991c
            java.lang.Object r10 = r10.mo27525b()
            r0 = r10
            com.google.android.apps.gsa.nga.engine.o.b r0 = (com.google.android.apps.gsa.nga.engine.p6056o.C76538b) r0
            com.google.android.libraries.assistant.g.d.w r4 = com.google.android.libraries.assistant.p1484g.p1502d.C18186w.f51682a
            com.google.android.libraries.search.assistant.b.a.e r5 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32500e.f87078a
            r1 = r7
            r2 = r8
            r3 = r9
            r0.mo72230c(r1, r2, r3, r4, r5)
            return
        L_0x0016:
            dagger.a r0 = r6.f217993e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.assistant.g.d.v r0 = (com.google.android.libraries.assistant.p1484g.p1502d.C18185v) r0
            r0.f51681b = r11
            android.util.SparseArray r11 = r0.f51680a
            r11.clear()
            dagger.a r11 = r6.f217993e
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.libraries.assistant.g.d.v r11 = (com.google.android.libraries.assistant.p1484g.p1502d.C18185v) r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r10)
            com.google.android.libraries.assistant.g.d.ag r1 = r11.f51681b
            if (r1 != 0) goto L_0x003e
            com.google.android.libraries.assistant.g.d.w r11 = com.google.android.libraries.assistant.p1484g.p1502d.C18186w.f51682a
        L_0x003b:
            r4 = r11
            goto L_0x00e5
        L_0x003e:
            android.content.ComponentName r2 = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33511e.m62106a(r8, r9)
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r0.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.libraries.assistant.g.d.ap r3 = r11.mo23651a(r3)
            if (r3 != 0) goto L_0x007f
            com.google.android.libraries.assistant.g.d.ap r3 = new com.google.android.libraries.assistant.g.d.ap
            java.lang.Object r4 = r0.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.<init>(r2, r4, r1)
            android.util.SparseArray r11 = r11.f51680a
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r11.put(r0, r1)
        L_0x007f:
            r4 = r3
            goto L_0x00e5
        L_0x0081:
            if (r7 != 0) goto L_0x0088
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x00db
        L_0x0088:
            java.lang.String r11 = "android.intent.extra.ASSIST_CONTEXT"
            android.os.Bundle r11 = r7.getBundle(r11)
            if (r11 != 0) goto L_0x0095
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x00db
        L_0x0095:
            java.lang.String r0 = "com.google.android.libraries.assistant.directactions.highcommand.DIRECT_ACTIONS_SERVICE"
            android.os.IBinder r0 = r11.getBinder(r0)
            java.lang.String r1 = "com.google.android.libraries.assistant.directactions.highcommand.ACTIVITY_ID"
            java.lang.String r11 = r11.getString(r1)
            if (r0 == 0) goto L_0x00d7
            if (r11 != 0) goto L_0x00a6
            goto L_0x00d7
        L_0x00a6:
            java.lang.String r1 = "com.google.android.libraries.assistant.directactions.highcommand.backport.IDirectActionsSessionService"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.libraries.assistant.p1484g.p1490c.p1496c.C18104a
            if (r3 == 0) goto L_0x00b3
            com.google.android.libraries.assistant.g.c.c.a r1 = (com.google.android.libraries.assistant.p1484g.p1490c.p1496c.C18104a) r1
            goto L_0x00b8
        L_0x00b3:
            com.google.android.libraries.assistant.g.c.c.a r1 = new com.google.android.libraries.assistant.g.c.c.a
            r1.<init>(r0)
        L_0x00b8:
            if (r1 != 0) goto L_0x00cd
            com.google.common.f.a.d r11 = com.google.android.libraries.assistant.p1484g.p1502d.C18173j.f51666a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r0 = "Found service binder in AssistData, but could not create IDirectActionsSessionService from it"
            r1 = 47062(0xb7d6, float:6.5948E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x00db
        L_0x00cd:
            com.google.android.libraries.assistant.g.d.j r0 = new com.google.android.libraries.assistant.g.d.j
            r0.<init>(r2, r11, r1)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00db
        L_0x00d7:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
        L_0x00db:
            com.google.android.libraries.assistant.g.d.w r0 = com.google.android.libraries.assistant.p1484g.p1502d.C18186w.f51682a
            java.lang.Object r11 = r11.orElse(r0)
            com.google.android.libraries.assistant.g.d.r r11 = (com.google.android.libraries.assistant.p1484g.p1502d.C18181r) r11
            goto L_0x003b
        L_0x00e5:
            com.google.android.libraries.search.assistant.b.a.e r11 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32500e.f87078a
            com.google.android.apps.gsa.shared.util.v.g r0 = r6.f217995g
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251032bE
            boolean r0 = r0.mo85405j(r1)
            if (r0 == 0) goto L_0x0166
            dagger.a r11 = r6.f217994f
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.libraries.search.assistant.b.a.c r11 = (com.google.android.libraries.search.assistant.p2504b.p2505a.C32498c) r11
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)
            com.google.android.apps.d.b.a.b r0 = r11.f87077c
            if (r0 != 0) goto L_0x0113
            com.google.common.f.e r10 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32498c.f87075a
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.String r11 = "AppAutomationService was empty"
            r0 = 50556(0xc57c, float:7.0844E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r11)
            com.google.android.libraries.search.assistant.b.a.e r10 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32500e.f87078a
        L_0x0111:
            r5 = r10
            goto L_0x0167
        L_0x0113:
            android.content.ComponentName r0 = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33511e.m62106a(r8, r9)
            p3186j$.util.Optional.ofNullable(r0)
            boolean r0 = r10.isPresent()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r10.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r1 = r11.f87076b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.libraries.search.assistant.b.a.a r0 = (com.google.android.libraries.search.assistant.p2504b.p2505a.C32494a) r0
            if (r0 != 0) goto L_0x0153
            com.google.android.libraries.search.assistant.b.a.b r0 = new com.google.android.libraries.search.assistant.b.a.b
            java.lang.Object r1 = r10.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            com.google.android.apps.d.b.a.b r1 = r11.f87077c
            r0.<init>()
            java.util.Map r11 = r11.f87076b
            java.lang.Object r10 = r10.get()
            java.lang.Integer r10 = (java.lang.Integer) r10
            r11.put(r10, r0)
        L_0x0153:
            r5 = r0
            goto L_0x0167
        L_0x0155:
            com.google.common.f.e r10 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32498c.f87075a
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.String r11 = "No activity Id hash code"
            r0 = 50555(0xc57b, float:7.0843E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r11)
            com.google.android.libraries.search.assistant.b.a.e r10 = com.google.android.libraries.search.assistant.p2504b.p2505a.C32500e.f87078a
            goto L_0x0111
        L_0x0166:
            r5 = r11
        L_0x0167:
            dagger.a r10 = r6.f217991c
            java.lang.Object r10 = r10.mo27525b()
            r0 = r10
            com.google.android.apps.gsa.nga.engine.o.b r0 = (com.google.android.apps.gsa.nga.engine.p6056o.C76538b) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r0.mo72230c(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.C79375e.mo71122h(android.os.Bundle, android.app.assist.AssistStructure, android.app.assist.AssistContent, int, com.google.android.libraries.assistant.g.d.ag):void");
    }

    /* renamed from: i */
    public final void mo71123i(Bitmap bitmap) {
        ((C76538b) this.f217991c.mo27525b()).mo72231d(bitmap);
    }

    /* renamed from: j */
    public final void mo71124j(C74737q qVar) {
        if (qVar != null) {
            ((C78261k) this.f217989a.mo27525b()).mo73246b(qVar);
        } else {
            ((C78261k) this.f217989a.mo27525b()).mo73245a();
        }
    }

    /* renamed from: k */
    public final void mo71125k(Bundle bundle, int i) {
        ((C76537ae) this.f217990b.mo27525b()).mo72229a(bundle, i);
    }
}
