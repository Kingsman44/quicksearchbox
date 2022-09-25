package com.google.android.apps.search.assistant.verticals.newsplayer.media;

import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.media.f */
/* compiled from: PG */
public final class C132451f implements C47102r {

    /* renamed from: a */
    private static final C59071e f361516a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.media.f");

    /* renamed from: b */
    private final C132416a f361517b;

    public C132451f(C132416a aVar) {
        this.f361517b = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r7, int r8) {
        /*
            r6 = this;
            com.google.android.apps.search.assistant.verticals.newsplayer.e.a r8 = r6.f361517b
            com.google.android.apps.search.assistant.verticals.newsplayer.media.a r8 = r8.mo110715q()
            if (r8 != 0) goto L_0x0019
            com.google.common.f.e r7 = f361516a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "MediaController unavailable."
            r0 = 39633(0x9ad1, float:5.5538E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a
            return r7
        L_0x0019:
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L_0x0022
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a
            return r7
        L_0x0022:
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -2100888498: goto L_0x0061;
                case -1666071486: goto L_0x0057;
                case 261838851: goto L_0x004d;
                case 1417416294: goto L_0x0043;
                case 1839109631: goto L_0x0039;
                case 2010449340: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x006b
        L_0x002f:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.PLAY"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 0
            goto L_0x006c
        L_0x0039:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_NEXT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 2
            goto L_0x006c
        L_0x0043:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_FORWARD"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 4
            goto L_0x006c
        L_0x004d:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.SKIP_TO_PREVIOUS"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 3
            goto L_0x006c
        L_0x0057:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.SEEK_BACKWARD"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 5
            goto L_0x006c
        L_0x0061:
            java.lang.String r0 = "com.google.android.apps.search.assistant.verticals.newsplayer.PAUSE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x006b
            r7 = 1
            goto L_0x006c
        L_0x006b:
            r7 = -1
        L_0x006c:
            if (r7 == 0) goto L_0x00a7
            if (r7 == r5) goto L_0x009d
            if (r7 == r4) goto L_0x0093
            if (r7 == r3) goto L_0x0089
            if (r7 == r2) goto L_0x0081
            if (r7 == r1) goto L_0x0079
            goto L_0x00b0
        L_0x0079:
            com.google.android.apps.search.assistant.verticals.newsplayer.e.a r7 = r6.f361517b
            com.google.protobuf.ar r8 = com.google.android.apps.search.assistant.verticals.newsplayer.p10064a.C132407a.f361405b
            r7.mo110705g(r8)
            goto L_0x00b0
        L_0x0081:
            com.google.android.apps.search.assistant.verticals.newsplayer.e.a r7 = r6.f361517b
            com.google.protobuf.ar r8 = com.google.android.apps.search.assistant.verticals.newsplayer.p10064a.C132407a.f361404a
            r7.mo110705g(r8)
            goto L_0x00b0
        L_0x0089:
            android.support.v4.media.session.v r7 = r8.f361493a
            android.support.v4.media.session.q r7 = r7.mo1037e()
            r7.mo1030o()
            goto L_0x00b0
        L_0x0093:
            android.support.v4.media.session.v r7 = r8.f361493a
            android.support.v4.media.session.q r7 = r7.mo1037e()
            r7.mo1029n()
            goto L_0x00b0
        L_0x009d:
            android.support.v4.media.session.v r7 = r8.f361493a
            android.support.v4.media.session.q r7 = r7.mo1037e()
            r7.mo1017b()
            goto L_0x00b0
        L_0x00a7:
            android.support.v4.media.session.v r7 = r8.f361493a
            android.support.v4.media.session.q r7 = r7.mo1037e()
            r7.mo1018c()
        L_0x00b0:
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.newsplayer.media.C132451f.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
