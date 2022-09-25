package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139387f;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.f */
/* compiled from: PG */
final class C139427f implements GatewayHandler {

    /* renamed from: a */
    private final boolean f379113a;

    /* renamed from: b */
    private final boolean f379114b;

    /* renamed from: c */
    private final C139432j f379115c;

    /* renamed from: d */
    private final C139387f f379116d;

    public C139427f(boolean z, boolean z2, C139432j jVar, C139387f fVar) {
        this.f379113a = z;
        this.f379114b = z2;
        this.f379115c = jVar;
        this.f379116d = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.tiktok.nav.gateway.C47506l mo20007a(com.google.apps.tiktok.nav.gateway.C47507m r12) {
        /*
            r11 = this;
            boolean r0 = r11.f379113a
            r1 = 0
            if (r0 == 0) goto L_0x0105
            android.content.Intent r12 = r12.f123337a
            android.net.Uri r12 = r12.getData()
            if (r12 != 0) goto L_0x0015
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.NO_SHARE_INTENT_DATA
            r12.mo114942b(r0, r1)
            return r1
        L_0x0015:
            java.lang.String r0 = "https"
            java.lang.String r2 = r12.getScheme()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0029
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.INSECURE_URL
            r12.mo114942b(r0, r1)
            return r1
        L_0x0029:
            java.lang.String r0 = "www.google.com"
            java.lang.String r2 = r12.getHost()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003d
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.NOT_A_GOOGLE_URL
            r12.mo114942b(r0, r1)
            return r1
        L_0x003d:
            java.lang.String r0 = "/story"
            java.lang.String r2 = r12.getPath()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "/stories"
            java.lang.String r2 = r12.getPath()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.NOT_A_SHARE_URL
            r12.mo114942b(r0, r1)
            return r1
        L_0x005e:
            boolean r0 = r11.f379114b
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "sdp"
            java.lang.String r12 = r12.getQueryParameter(r0)
            boolean r0 = com.google.common.base.C58837ba.m90859h(r12)
            if (r0 == 0) goto L_0x0077
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.CANNOT_PARSE_DEEPLINK_DATA
            r12.mo114942b(r0, r1)
        L_0x0075:
            r10 = r1
            goto L_0x009d
        L_0x0077:
            com.google.common.l.i r0 = com.google.common.p4541l.C59326i.f157517e     // Catch:{ IllegalArgumentException -> 0x0094 }
            byte[] r12 = r0.mo56836k(r12)     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x008b }
            com.google.bp.e.a.r r2 = com.google.p4242bp.p4253e.p4254a.C56198r.f149726e     // Catch:{ ct -> 0x008b }
            com.google.protobuf.bv r12 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r12, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x008b }
            com.google.bp.e.a.r r12 = (com.google.p4242bp.p4253e.p4254a.C56198r) r12     // Catch:{ ct -> 0x008b }
            r10 = r12
            goto L_0x009d
        L_0x008b:
            r12 = move-exception
            com.google.android.apps.search.googleapp.stampviewer.e.f r0 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r2 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.CANNOT_PARSE_DEEPLINK_DATA
            r0.mo114942b(r2, r12)
            goto L_0x0075
        L_0x0094:
            r12 = move-exception
            com.google.android.apps.search.googleapp.stampviewer.e.f r0 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r2 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.CANNOT_PARSE_DEEPLINK_DATA
            r0.mo114942b(r2, r12)
            goto L_0x0075
        L_0x009d:
            if (r10 != 0) goto L_0x00a0
            return r1
        L_0x00a0:
            com.google.android.apps.search.googleapp.stampviewer.i.j r12 = r11.f379115c
            com.google.android.apps.search.googleapp.stampviewer.i.i r0 = new com.google.android.apps.search.googleapp.stampviewer.i.i
            g.a.a r1 = r12.f379126a
            java.lang.Object r1 = r1.mo17428b()
            r4 = r1
            com.google.android.libraries.search.a.a.h r4 = (com.google.android.libraries.search.p2476a.p2477a.C32158h) r4
            r4.getClass()
            g.a.a r1 = r12.f379127b
            java.lang.Object r1 = r1.mo17428b()
            r5 = r1
            com.google.android.apps.search.googleapp.stampviewer.b.t r5 = (com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t) r5
            r5.getClass()
            g.a.a r1 = r12.f379128c
            java.lang.Object r1 = r1.mo17428b()
            r6 = r1
            com.google.android.apps.search.googleapp.stampviewer.e.f r6 = (com.google.android.apps.search.googleapp.stampviewer.p10493e.C139387f) r6
            r6.getClass()
            g.a.a r1 = r12.f379129d
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.search.googleapp.amp.a.i r1 = (com.google.android.apps.search.googleapp.amp.p10138a.C133460i) r1
            r1.getClass()
            g.a.a r1 = r12.f379130e
            java.lang.Object r1 = r1.mo17428b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            boolean r7 = r1.booleanValue()
            g.a.a r1 = r12.f379131f
            java.lang.Object r1 = r1.mo17428b()
            r8 = r1
            android.content.Context r8 = (android.content.Context) r8
            r8.getClass()
            g.a.a r12 = r12.f379132g
            java.lang.Object r12 = r12.mo17428b()
            r9 = r12
            java.util.concurrent.Executor r9 = (java.util.concurrent.Executor) r9
            r9.getClass()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x00ff:
            com.google.android.apps.search.googleapp.stampviewer.i.e r12 = new com.google.android.apps.search.googleapp.stampviewer.i.e
            r12.<init>()
            return r12
        L_0x0105:
            com.google.android.apps.search.googleapp.stampviewer.e.f r12 = r11.f379116d
            com.google.android.apps.search.googleapp.stampviewer.i.b r0 = com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b.DISABLED
            r12.mo114942b(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.stampviewer.p10497i.C139427f.mo20007a(com.google.apps.tiktok.nav.gateway.m):com.google.apps.tiktok.nav.gateway.l");
    }
}
