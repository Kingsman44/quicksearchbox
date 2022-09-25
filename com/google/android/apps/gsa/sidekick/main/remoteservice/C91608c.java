package com.google.android.apps.gsa.sidekick.main.remoteservice;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6841s.C86589h;
import com.google.android.apps.gsa.search.core.p6841s.C86590i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.sidekick.main.actions.C91257p;
import com.google.android.apps.gsa.sidekick.main.actions.C91258q;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91322b;
import com.google.android.apps.gsa.sidekick.main.entry.C91341bs;
import com.google.android.apps.gsa.sidekick.main.notifications.C91486aa;
import com.google.android.apps.gsa.sidekick.main.notifications.C91528bm;
import com.google.android.apps.gsa.sidekick.main.p7216k.C91454h;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91598e;
import com.google.android.apps.gsa.sidekick.main.p7226r.C91602c;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91906d;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91910h;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.staticplugins.p7686co.p7693g.C98313a;
import com.google.android.apps.gsa.staticplugins.p7686co.p7693g.C98316d;
import com.google.common.base.C58819aj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7912oo;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.remoteservice.c */
/* compiled from: PG */
public final class C91608c extends C91906d {

    /* renamed from: a */
    private final C68214a f255505a;

    /* renamed from: b */
    private final C68214a f255506b;

    /* renamed from: c */
    private final C68214a f255507c;

    /* renamed from: d */
    private final C91610e f255508d;

    /* renamed from: e */
    private final C68214a f255509e;

    public C91608c(C91610e eVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f255508d = eVar;
        this.f255505a = aVar;
        this.f255506b = aVar2;
        this.f255507c = aVar3;
        this.f255509e = aVar4;
    }

    /* renamed from: q */
    private static C8142xb m149857q(int i) {
        C8142xb a = C8142xb.m22954a(i);
        return a == null ? C8142xb.UNKNOWN_SURFACE : a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.sidekick.shared.remoteapi.TrainingQuestion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.ai.b.ou} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.sidekick.shared.remoteapi.TrainingQuestion mo85972a(com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.sidekick.main.remoteservice.e r0 = r10.f255508d
            com.google.ai.b.ou r1 = com.google.p375ai.p378b.C7918ou.f27824h
            com.google.protobuf.MessageLite r11 = r11.mo84190c(r1)
            com.google.ai.b.ou r11 = (com.google.p375ai.p378b.C7918ou) r11
            dagger.a r0 = r0.f255517g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.sidekick.main.q.e r0 = (com.google.android.apps.gsa.sidekick.main.p7225q.C91598e) r0
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            java.lang.Object r1 = r0.f255469g
            monitor-enter(r1)
            java.util.Map r2 = r0.f255470h     // Catch:{ all -> 0x0114 }
            r3 = 0
            if (r2 == 0) goto L_0x0029
            java.util.Map r2 = r0.f255471i     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0029
            java.util.Map r2 = r0.f255472j     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0029
            r3 = 1
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x0114 }
            if (r3 != 0) goto L_0x0037
            com.google.android.apps.gsa.k.d r1 = r0.f255464b
            com.google.protobuf.MessageLite r1 = r1.a()
            com.google.android.apps.g.e.d r1 = (com.google.android.apps.p489g.p495e.C9287d) r1
            r0.mo85963e(r1)
        L_0x0037:
            java.lang.Object r2 = r0.f255469g
            monitor-enter(r2)
            int r1 = r11.f27826a     // Catch:{ all -> 0x0111 }
            r1 = r1 & 16
            r3 = 0
            if (r1 == 0) goto L_0x00f8
            java.util.Map r1 = r0.f255471i     // Catch:{ all -> 0x0111 }
            long r4 = r11.f27827b     // Catch:{ all -> 0x0111 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0111 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0111 }
            com.google.ai.b.pc r1 = (com.google.p375ai.p378b.C7927pc) r1     // Catch:{ all -> 0x0111 }
            if (r1 != 0) goto L_0x006a
            com.google.common.f.e r0 = com.google.android.apps.gsa.sidekick.main.p7225q.C91598e.f255463a     // Catch:{ all -> 0x0111 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0111 }
            r1 = 11771(0x2dfb, float:1.6495E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = "Missing question template: %d"
            long r4 = r11.f27827b     // Catch:{ all -> 0x0111 }
            r0.mo56388r(r1, r4)     // Catch:{ all -> 0x0111 }
            goto L_0x010f
        L_0x006a:
            com.google.android.apps.gsa.sidekick.shared.training.QuestionKey r4 = new com.google.android.apps.gsa.sidekick.shared.training.QuestionKey     // Catch:{ all -> 0x0111 }
            r4.<init>(r11)     // Catch:{ all -> 0x0111 }
            java.util.Map r5 = r0.f255474l     // Catch:{ all -> 0x0111 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0111 }
            com.google.android.apps.g.e.b r5 = (com.google.android.apps.p489g.p495e.C9285b) r5     // Catch:{ all -> 0x0111 }
            if (r5 != 0) goto L_0x0084
            r0.mo85962d()     // Catch:{ all -> 0x0111 }
            java.util.Map r5 = r0.f255473k     // Catch:{ all -> 0x0111 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0111 }
            com.google.android.apps.g.e.b r5 = (com.google.android.apps.p489g.p495e.C9285b) r5     // Catch:{ all -> 0x0111 }
        L_0x0084:
            if (r5 == 0) goto L_0x008d
            com.google.ai.b.ou r5 = r5.f32230b     // Catch:{ all -> 0x0111 }
            if (r5 != 0) goto L_0x008e
            com.google.ai.b.ou r5 = com.google.p375ai.p378b.C7918ou.f27824h     // Catch:{ all -> 0x0111 }
            goto L_0x008e
        L_0x008d:
            r5 = r3
        L_0x008e:
            if (r5 != 0) goto L_0x00b2
            java.util.Map r5 = r0.f255472j     // Catch:{ all -> 0x0111 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0111 }
            com.google.ai.b.ou r4 = (com.google.p375ai.p378b.C7918ou) r4     // Catch:{ all -> 0x0111 }
            if (r4 == 0) goto L_0x00b0
            int r5 = r4.f27826a     // Catch:{ all -> 0x0111 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x00b0
            com.google.android.libraries.f.a r5 = r0.f255468f     // Catch:{ all -> 0x0111 }
            long r5 = r5.mo26870b()     // Catch:{ all -> 0x0111 }
            long r7 = r4.f27830e     // Catch:{ all -> 0x0111 }
            long r5 = r5 - r7
            long r7 = r4.f27831f     // Catch:{ all -> 0x0111 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            r3 = r4
            goto L_0x00b3
        L_0x00b2:
            r3 = r5
        L_0x00b3:
            if (r3 == 0) goto L_0x00f0
            com.google.protobuf.bn r11 = r11.toBuilder()     // Catch:{ all -> 0x0111 }
            com.google.ai.b.op r11 = (com.google.p375ai.p378b.C7913op) r11     // Catch:{ all -> 0x0111 }
            com.google.ai.b.oo r4 = r3.f27829d     // Catch:{ all -> 0x0111 }
            if (r4 != 0) goto L_0x00c1
            com.google.ai.b.oo r4 = com.google.p375ai.p378b.C7912oo.f27797d     // Catch:{ all -> 0x0111 }
        L_0x00c1:
            r11.copyOnWrite()     // Catch:{ all -> 0x0111 }
            com.google.protobuf.bv r5 = r11.instance     // Catch:{ all -> 0x0111 }
            com.google.ai.b.ou r5 = (com.google.p375ai.p378b.C7918ou) r5     // Catch:{ all -> 0x0111 }
            r4.getClass()     // Catch:{ all -> 0x0111 }
            r5.f27829d = r4     // Catch:{ all -> 0x0111 }
            int r4 = r5.f27826a     // Catch:{ all -> 0x0111 }
            r4 = r4 | 2
            r5.f27826a = r4     // Catch:{ all -> 0x0111 }
            int r4 = r3.f27826a     // Catch:{ all -> 0x0111 }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x00ea
            long r3 = r3.f27830e     // Catch:{ all -> 0x0111 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0111 }
            com.google.protobuf.bv r5 = r11.instance     // Catch:{ all -> 0x0111 }
            com.google.ai.b.ou r5 = (com.google.p375ai.p378b.C7918ou) r5     // Catch:{ all -> 0x0111 }
            int r6 = r5.f27826a     // Catch:{ all -> 0x0111 }
            r6 = r6 | 4
            r5.f27826a = r6     // Catch:{ all -> 0x0111 }
            r5.f27830e = r3     // Catch:{ all -> 0x0111 }
        L_0x00ea:
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x0111 }
            com.google.ai.b.ou r11 = (com.google.p375ai.p378b.C7918ou) r11     // Catch:{ all -> 0x0111 }
        L_0x00f0:
            com.google.android.sidekick.shared.remoteapi.TrainingQuestion r3 = new com.google.android.sidekick.shared.remoteapi.TrainingQuestion     // Catch:{ all -> 0x0111 }
            java.util.Map r0 = r0.f255470h     // Catch:{ all -> 0x0111 }
            r3.<init>(r0, r1, r11)     // Catch:{ all -> 0x0111 }
            goto L_0x010f
        L_0x00f8:
            com.google.common.f.e r0 = com.google.android.apps.gsa.sidekick.main.p7225q.C91598e.f255463a     // Catch:{ all -> 0x0111 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0111 }
            r1 = 11772(0x2dfc, float:1.6496E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0111 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = "Question missing fingerprint: %d"
            long r4 = r11.f27827b     // Catch:{ all -> 0x0111 }
            r0.mo56388r(r1, r4)     // Catch:{ all -> 0x0111 }
        L_0x010f:
            monitor-exit(r2)     // Catch:{ all -> 0x0111 }
            return r3
        L_0x0111:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0111 }
            throw r11
        L_0x0114:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0114 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.remoteservice.C91608c.mo85972a(com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable):com.google.android.sidekick.shared.remoteapi.TrainingQuestion");
    }

    /* renamed from: b */
    public final String mo85973b(String str) {
        C60870cx h = C60922j.m93045h(((C98316d) this.f255509e.mo27525b()).f274447b.mo88347a(), new C98313a(str), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return (String) C60856cj.m92910s(h);
    }

    /* renamed from: c */
    public final void mo85974c(ProtoLiteParcelable protoLiteParcelable, boolean z) {
        ((C90929bz) this.f255507c.mo27525b()).mo85142g(((C91341bs) this.f255508d.f255523m.mo27525b()).mo85660a((C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af), z), new C90952r("NowService", "dismissEntry", "failure"));
    }

    /* renamed from: d */
    public final void mo85975d(int i, int i2) {
        ((C91454h) this.f255506b.mo27525b()).mo85808a(i, m149857q(i2));
    }

    /* renamed from: e */
    public final void mo85976e() {
        C91610e eVar = this.f255508d;
        eVar.mo85990b(((C91306ak) eVar.f255521k.mo27525b()).mo85594g(), "invalidateIfConnectedAsync");
    }

    /* renamed from: f */
    public final void mo85977f(List list) {
        C60870cx a = ((C91528bm) this.f255508d.f255516f.mo27525b()).mo85867a(list);
        C91018d.m148680c();
        C60856cj.m92910s(a);
    }

    /* renamed from: g */
    public final void mo85978g(ProtoLiteParcelable protoLiteParcelable, boolean z) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C91610e eVar = this.f255508d;
        C7718hj hjVar = (C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af);
        if (z) {
            C91528bm bmVar = (C91528bm) eVar.f255516f.mo27525b();
            C7708h b = C91528bm.m149706b(hjVar, C7681g.DISMISS);
            if (b == null) {
                cxVar = C60856cj.m92900i(false);
            } else {
                cxVar = bmVar.f255285a.mo85688i(hjVar, b);
            }
        } else {
            C91528bm bmVar2 = (C91528bm) eVar.f255516f.mo27525b();
            C7708h b2 = C91528bm.m149706b(hjVar, C7681g.DISMISS);
            if (b2 == null) {
                cxVar2 = C118826c.f331423b;
            } else {
                cxVar2 = bmVar2.f255285a.mo85681a(hjVar, b2);
            }
            cxVar = C60922j.m93044g(cxVar2, new C58819aj(true), C60826bg.f164896a);
        }
        C91018d.m148680c();
        C60856cj.m92910s(cxVar);
    }

    /* renamed from: h */
    public final void mo85979h(List list) {
        ((C91602c) this.f255508d.f255524n.mo27525b()).mo85965a(list);
    }

    /* renamed from: i */
    public final void mo85980i(ProtoLiteParcelable protoLiteParcelable, int i, int i2) {
        C91610e eVar = this.f255508d;
        C7718hj hjVar = (C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af);
        C7681g a = C7681g.m22802a(i);
        C8142xb q = m149857q(i2);
        if (C91978bb.m150937c(hjVar, a, new C7681g[0]) == null) {
            C59104x d = C91610e.f255511a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RemoteServiceHelper");
            ((C59052c) ((C59052c) d).mo56372aa(11737)).mo56386p("Cannot find action in entry");
            C60856cj.m92900i(false);
            return;
        }
        C91909g b = ((C91910h) eVar.f255525o.mo27525b()).mo86565b(hjVar, a);
        b.mo86548l(q);
        b.mo86545i(true);
        ((C91528bm) eVar.f255516f.mo27525b()).mo85867a(C58485gu.m89846n(b.mo86537a()));
    }

    /* renamed from: j */
    public final void mo85981j(int i) {
        C7642eo a = C7642eo.m22791a(i);
        if (a != null) {
            C91610e eVar = this.f255508d;
            eVar.mo85990b(((C84160c) eVar.f255515e.mo27525b()).mo77602c(a, false), "sendUserRefresh");
        }
    }

    /* renamed from: k */
    public final void mo85982k(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2) {
        C7718hj hjVar = (C7718hj) protoLiteParcelable2.mo84190c(C7718hj.f26927af);
        C91610e eVar = this.f255508d;
        C60870cx c = ((C91528bm) eVar.f255516f.mo27525b()).mo85868c(hjVar, C7681g.DISMISS);
        C60870cx i = ((C91306ak) eVar.f255521k.mo27525b()).mo85596i((C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af), new C58759qy(hjVar));
        eVar.mo85990b(i, "removeGroupChildEntries");
        C60870cx a = C60856cj.m92893b(c, i).mo57334a(new C60934v(C118826c.f331422a), C60826bg.f164896a);
        C91018d.m148680c();
        C60856cj.m92910s(a);
    }

    /* renamed from: l */
    public final void mo85983l(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2, ProtoLiteParcelable protoLiteParcelable3) {
        C7708h hVar = (C7708h) protoLiteParcelable3.mo84190c(C7708h.f26894n);
        C91598e eVar = (C91598e) this.f255508d.f255517g.mo27525b();
        new C91257p(eVar.f255467e, (C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af), hVar, eVar.f255468f, (C7918ou) protoLiteParcelable2.mo84190c(C7918ou.f27824h)).execute(new Void[0]);
    }

    /* renamed from: m */
    public final void mo85984m(ProtoLiteParcelable protoLiteParcelable, ProtoLiteParcelable protoLiteParcelable2, ProtoLiteParcelable protoLiteParcelable3) {
        C60870cx a = this.f255508d.mo85989a((C7918ou) protoLiteParcelable.mo84190c(C7918ou.f27824h), (C7912oo) protoLiteParcelable2.mo84190c(C7912oo.f27797d), (C7718hj) protoLiteParcelable3.mo84190c(C7718hj.f26927af));
        C91018d.m148680c();
        C60856cj.m92910s(a);
    }

    /* renamed from: n */
    public final void mo85985n(ProtoLiteParcelable protoLiteParcelable) {
        C91610e eVar = this.f255508d;
        C7718hj hjVar = (C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af);
        if (C91978bb.m150937c(hjVar, C7681g.SNOOZE_REMINDER, new C7681g[0]) != null) {
            new C91258q(eVar.f255512b, hjVar, (C91755a) eVar.f255520j.mo27525b(), (C90929bz) eVar.f255514d.mo27525b(), (C91486aa) eVar.f255522l.mo27525b()).mo85242e(new Void[0]);
        }
    }

    /* renamed from: o */
    public final void mo85986o(ProtoLiteParcelable protoLiteParcelable) {
        ((C91322b) this.f255505a.mo27525b()).mo85625a((C7718hj) protoLiteParcelable.mo84190c(C7718hj.f26927af));
    }

    /* renamed from: p */
    public final boolean mo85987p() {
        C91610e eVar = this.f255508d;
        Account a = ((C86054o) eVar.f255518h.mo27525b()).mo79668a();
        if (a != null) {
            return ((C86590i) eVar.f255519i.mo27525b()).mo80208d(a, C86589h.WEB, true);
        }
        C59104x d = C91610e.f255511a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RemoteServiceHelper");
        ((C59052c) ((C59052c) d).mo56372aa(11740)).mo56386p("No active account");
        return false;
    }
}
