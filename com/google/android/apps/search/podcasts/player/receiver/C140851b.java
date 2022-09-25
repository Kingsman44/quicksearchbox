package com.google.android.apps.search.podcasts.player.receiver;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.receiver.b */
/* compiled from: PG */
public final class C140851b implements C47102r {

    /* renamed from: a */
    public final C140790h f382486a;

    /* renamed from: b */
    private final C139958c f382487b;

    /* renamed from: c */
    private final C140459au f382488c;

    /* renamed from: d */
    private final AccountId f382489d;

    /* renamed from: e */
    private final C140498j f382490e;

    /* renamed from: f */
    private final boolean f382491f;

    /* renamed from: g */
    private final C59071e f382492g = C59071e.m91331h();

    public C140851b(C140790h hVar, C139958c cVar, C140459au auVar, AccountId accountId, C140498j jVar, boolean z) {
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(jVar, "devicePreferencesManager");
        this.f382486a = hVar;
        this.f382487b = cVar;
        this.f382488c = auVar;
        this.f382489d = accountId;
        this.f382490e = jVar;
        this.f382491f = z;
    }

    /* JADX WARNING: type inference failed for: r6v17, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r5, int r6) {
        /*
            r4 = this;
            java.lang.String r6 = "intent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            boolean r6 = r4.f382491f
            if (r6 == 0) goto L_0x0010
            com.google.android.apps.search.podcasts.l.j r6 = r4.f382490e
            com.google.apps.tiktok.account.AccountId r0 = r4.f382489d
            r6.mo115698b(r0)
        L_0x0010:
            java.lang.String r6 = "play_episode_in_background"
            byte[] r5 = r5.getByteArrayExtra(r6)
            if (r5 != 0) goto L_0x001b
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60866ct.f164955a
            return r5
        L_0x001b:
            com.google.android.apps.search.podcasts.e.b r6 = com.google.android.apps.search.podcasts.p10561e.C140201b.f380906e
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r5)
            com.google.android.apps.search.podcasts.e.b r5 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r5
            java.lang.String r6 = "parseFrom(protoByteArray)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.protos.ac.a.h r6 = r5.f380909b
            if (r6 != 0) goto L_0x002e
            com.google.protos.ac.a.h r6 = com.google.protos.p4757ac.p4758a.C63109h.f170342e
        L_0x002e:
            com.google.protobuf.cq r6 = r6.f170346c
            java.lang.String r0 = "request.playerData.episodeDataList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0039:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r6.next()
            r2 = r0
            com.google.protos.ac.a.j r2 = (com.google.protos.p4757ac.p4758a.C63111j) r2
            java.lang.String r2 = r2.f170356g
            java.lang.String r3 = r5.f380910c
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r3)
            if (r2 == 0) goto L_0x0039
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            com.google.protos.ac.a.j r0 = (com.google.protos.p4757ac.p4758a.C63111j) r0
            if (r0 == 0) goto L_0x005e
            int r6 = r0.f170350a
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x005e
            goto L_0x009e
        L_0x005e:
            if (r0 == 0) goto L_0x009d
            com.google.protobuf.bn r6 = r0.toBuilder()
            com.google.protos.ac.a.i r6 = (com.google.protos.p4757ac.p4758a.C63110i) r6
            if (r6 == 0) goto L_0x009d
            com.google.protos.ac.a.h r0 = r5.f380909b
            if (r0 != 0) goto L_0x006e
            com.google.protos.ac.a.h r0 = com.google.protos.p4757ac.p4758a.C63109h.f170342e
        L_0x006e:
            com.google.protos.ac.a.l r0 = r0.f170345b
            if (r0 != 0) goto L_0x0074
            com.google.protos.ac.a.l r0 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0074:
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.protos.ac.a.j r2 = (com.google.protos.p4757ac.p4758a.C63111j) r2
            r0.getClass()
            r2.f170360k = r0
            int r0 = r2.f170350a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r2.f170350a = r0
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.protos.ac.a.j r0 = (com.google.protos.p4757ac.p4758a.C63111j) r0
            r0.f170359j = r1
            int r2 = r0.f170350a
            r2 = r2 & -257(0xfffffffffffffeff, float:NaN)
            r0.f170350a = r2
            com.google.protobuf.bv r6 = r6.build()
            r0 = r6
            com.google.protos.ac.a.j r0 = (com.google.protos.p4757ac.p4758a.C63111j) r0
            goto L_0x009e
        L_0x009d:
            r0 = r1
        L_0x009e:
            com.google.common.f.e r6 = r4.f382492g
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = r0.f170353d
        L_0x00aa:
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 41636(0xa2a4, float:5.8344E-41)
            r2.<init>(r3)
            r6.mo56379ah(r2)
            java.lang.String r2 = "onReceive mediaUrl: %s"
            r6.mo56389s(r2, r1)
            if (r0 != 0) goto L_0x00bf
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60866ct.f164955a
            return r5
        L_0x00bf:
            com.google.android.apps.search.podcasts.a.c r6 = r4.f382487b
            com.google.common.util.concurrent.cx r6 = r6.mo115361a(r0)
            com.google.android.apps.search.podcasts.l.au r0 = r4.f382488c
            com.google.common.util.concurrent.cx r0 = r0.mo115678c()
            r1 = 2
            com.google.common.util.concurrent.cx[] r1 = new com.google.common.util.concurrent.C60870cx[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            r1[r2] = r0
            com.google.apps.tiktok.tracing.contrib.b.j r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84753d(r1)
            com.google.android.apps.search.podcasts.player.receiver.a r2 = new com.google.android.apps.search.podcasts.player.receiver.a
            r2.<init>(r0, r4, r6, r5)
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r5 = r1.mo51521b(r2, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.receiver.C140851b.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
