package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a;

import com.google.android.apps.gsa.contacts.ap;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127199c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.p9716a.p9717a.C128388a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51596no;
import com.google.assistant.p3897e.p3917i.p3918a.C51598nq;
import com.google.assistant.p3897e.p3917i.p3918a.C51601nt;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3917i.p3918a.C51603nv;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d */
/* compiled from: PG */
public final class C128391d implements C127369n {

    /* renamed from: a */
    public static final C33476a f353121a = new C33476a("assistant.api.params.TopContactParams", C51609oa.f134502b);

    /* renamed from: b */
    public static final C32836cd f353122b;

    /* renamed from: c */
    private final long f353123c;

    /* renamed from: d */
    private final long f353124d;

    /* renamed from: e */
    private final C127199c f353125e;

    /* renamed from: f */
    private final C37215b f353126f;

    /* renamed from: g */
    private final ScheduledExecutorService f353127g;

    /* renamed from: h */
    private final C71422aw f353128h;

    /* renamed from: i */
    private final C128388a f353129i;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.communication.top_contact");
        a.mo38319b(a2.mo38298a());
        f353122b = a.mo38318a();
    }

    public C128391d(long j, long j2, C127199c cVar, C37215b bVar, C128388a aVar, ScheduledExecutorService scheduledExecutorService, C71422aw awVar) {
        C69664n.m101061g(cVar, "deviceContactsGuard");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(scheduledExecutorService, "lightweightExecutor");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f353123c = j;
        this.f353124d = j2;
        this.f353125e = cVar;
        this.f353126f = bVar;
        this.f353129i = aVar;
        this.f353127g = scheduledExecutorService;
        this.f353128h = awVar;
    }

    /* renamed from: c */
    private final C51606ny m209511c(C51605nx nxVar, List list) {
        C51603nv nvVar = (C51603nv) C51606ny.f134497d.createBuilder();
        C69664n.m101060f(nvVar, "newBuilder()");
        C51598nq a = C69664n.m101061g(nvVar, "builder");
        a.mo53655b(nxVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ap apVar = (ap) it.next();
            a.mo53657d();
            C51601nt ntVar = (C51601nt) C51602nu.f134484e.createBuilder();
            C69664n.m101060f(ntVar, "newBuilder()");
            C51596no a2 = C69664n.m101061g(ntVar, "builder");
            String str = apVar.c;
            C69664n.m101060f(str, "contact.name");
            a2.mo53653b(str);
            double d = apVar.d;
            C51601nt ntVar2 = a2.f134481a;
            ntVar2.copyOnWrite();
            C51602nu nuVar = (C51602nu) ntVar2.instance;
            nuVar.f134486a |= 2;
            nuVar.f134488c = (float) d;
            a.mo53656c(a2.mo53652a());
        }
        return a.mo53654a();
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C37215b bVar = this.f353126f;
        C37258g gVar = C37176a.f97038dx;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_TOP_CONTACTS_FETCH_STARTED");
        String str = iVar.f350564b;
        C69664n.m101060f(str, "queryContext.requestId");
        C128239a.m209322b(bVar, gVar, str);
        return C47633f.m84733g(C71663i.m104692e(this.f353128h, (C71424ay) null, new C128389b(this, iVar, (C69577g) null), 3)).mo51517j(this.f353124d, TimeUnit.MILLISECONDS, this.f353127g).mo51513e(TimeoutException.class, C128387a.f353105a, this.f353127g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fd, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fe, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0101, code lost:
        throw r11;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.apps.search.assistant.surfaces.voice.d.d.i, code=java.lang.Object, for r10v0, types: [com.google.android.apps.search.assistant.surfaces.voice.d.d.i, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108407b(java.lang.Object r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128390c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128390c) r0
            int r1 = r0.f353120f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353120f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.c
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f353118d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353120f
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r10 = r0.f353117c
            java.lang.Object r1 = r0.f353116b
            java.lang.Object r0 = r0.f353115a
            p5462h.C69714l.m101134b(r11)
            r8 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r8
            goto L_0x0064
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            p5462h.C69714l.m101134b(r11)
            h.f.b.ae r11 = new h.f.b.ae
            r11.<init>()
            com.google.assistant.e.i.a.oa r2 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b
            java.lang.String r4 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r11.f186027a = r2
            long r4 = r9.f353123c
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.c r2 = r9.f353125e
            r0.f353115a = r9
            r0.f353116b = r10
            r0.f353117c = r11
            r0.f353120f = r3
            java.lang.Object r0 = r2.mo107993a(r0)
            if (r0 == r1) goto L_0x0102
            r1 = r9
        L_0x0064:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0104
            com.google.android.libraries.search.m.b.b r0 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_ASSISTANT_VOICE
            java.lang.String r0 = com.google.android.libraries.search.p3047m.p3050b.C39227c.m68658b(r0)
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.p3624b.C46356a.m82648a(r0)
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r2     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.a.a.a r2 = r2.f353129i     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.ci r3 = com.google.android.apps.gsa.contacts.ci.a     // Catch:{ all -> 0x00fb }
            r4 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r4     // Catch:{ all -> 0x00fb }
            long r4 = r4.f353123c     // Catch:{ all -> 0x00fb }
            int r5 = (int) r4     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.bz r2 = r2.f353106a     // Catch:{ all -> 0x00fb }
            java.util.List r2 = r2.d(r3, r5)     // Catch:{ all -> 0x00fb }
            r3 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r3     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.a.a.a r3 = r3.f353129i     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.ci r4 = com.google.android.apps.gsa.contacts.ci.b     // Catch:{ all -> 0x00fb }
            r5 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r5     // Catch:{ all -> 0x00fb }
            long r5 = r5.f353123c     // Catch:{ all -> 0x00fb }
            int r6 = (int) r5     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.bz r3 = r3.f353106a     // Catch:{ all -> 0x00fb }
            java.util.List r3 = r3.d(r4, r6)     // Catch:{ all -> 0x00fb }
            r4 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r4     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.a.a.a r4 = r4.f353129i     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.ci r5 = com.google.android.apps.gsa.contacts.ci.c     // Catch:{ all -> 0x00fb }
            r6 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r6     // Catch:{ all -> 0x00fb }
            long r6 = r6.f353123c     // Catch:{ all -> 0x00fb }
            int r7 = (int) r6     // Catch:{ all -> 0x00fb }
            com.google.android.apps.gsa.contacts.bz r4 = r4.f353106a     // Catch:{ all -> 0x00fb }
            java.util.List r4 = r4.d(r5, r7)     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.oa r5 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b     // Catch:{ all -> 0x00fb }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.nz r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51607nz) r5     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.ns r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ all -> 0x00fb }
            r5.mo53660c()     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.nx r6 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.AGGREGATED     // Catch:{ all -> 0x00fb }
            r7 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r7     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.ny r2 = r7.m209511c(r6, r2)     // Catch:{ all -> 0x00fb }
            r5.mo53659b(r2)     // Catch:{ all -> 0x00fb }
            r5.mo53660c()     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.nx r2 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.CALL     // Catch:{ all -> 0x00fb }
            r6 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r6     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.ny r2 = r6.m209511c(r2, r3)     // Catch:{ all -> 0x00fb }
            r5.mo53659b(r2)     // Catch:{ all -> 0x00fb }
            r5.mo53660c()     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.nx r2 = com.google.assistant.p3897e.p3917i.p3918a.C51605nx.TEXT     // Catch:{ all -> 0x00fb }
            r3 = r1
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r3     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.ny r2 = r3.m209511c(r2, r4)     // Catch:{ all -> 0x00fb }
            r5.mo53659b(r2)     // Catch:{ all -> 0x00fb }
            com.google.assistant.e.i.a.oa r2 = r5.mo53658a()     // Catch:{ all -> 0x00fb }
            r3 = r11
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3     // Catch:{ all -> 0x00fb }
            r3.f186027a = r2     // Catch:{ all -> 0x00fb }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r2)
            goto L_0x0104
        L_0x00fb:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r11 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r10)
            throw r11
        L_0x0102:
            return r1
        L_0x0103:
            r1 = r9
        L_0x0104:
            com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.d r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d) r1
            com.google.android.libraries.search.b.b r0 = r1.f353126f
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97039dy
            java.lang.String r2 = "MAIN_ASSISTANT_TOP_CONTACTS_FETCH_FINISHED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i) r10
            java.lang.String r10 = r10.f350564b
            java.lang.String r2 = "queryContext.requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a.m209322b(r0, r1, r10)
            h.f.b.ae r11 = (p5462h.p5473f.p5475b.C69648ae) r11
            java.lang.Object r10 = r11.f186027a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a.C128391d.mo108407b(com.google.android.apps.search.assistant.surfaces.voice.d.d.i, h.c.g):java.lang.Object");
    }
}
