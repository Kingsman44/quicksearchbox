package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.n */
/* compiled from: PG */
public final class C116318n {

    /* renamed from: a */
    private static final C59071e f322474a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s3request.a.n");

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r6.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90082eg.f250050dg) != false) goto L_0x006b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.speech.p7298l.C92460b m192915a(com.google.android.apps.gsa.shared.p7066m.C90021c r6, com.google.android.apps.gsa.shared.p6968aa.C89037bh r7, com.google.android.apps.gsa.speech.p7298l.C92473f r8, android.content.SharedPreferences r9, com.google.common.base.C58833ax r10) {
        /*
            boolean r0 = r10.mo56113h()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r8 = r10.mo56107c()
            com.google.android.apps.gsa.c.f.k r8 = (com.google.android.apps.gsa.p5836c.p5843f.C74458k) r8
            com.google.android.apps.gsa.speech.l.b r8 = r8.mo70774a()
            goto L_0x0022
        L_0x0011:
            com.google.common.f.e r10 = f322474a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r0 = "AudioListeningSessionAdapterOptional is not present"
            r1 = 31747(0x7c03, float:4.4487E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            int r10 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            com.google.android.apps.gsa.speech.l.b r8 = r8.f258015c
        L_0x0022:
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249938bA
            boolean r10 = r6.mo79746e(r10)
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L_0x003e
            com.google.android.apps.gsa.shared.aa.r r10 = r7.mo27377b()
            int r10 = r10.f241373e
            if (r10 == r0) goto L_0x003e
            com.google.android.apps.gsa.shared.aa.r r7 = r7.mo27377b()
            int r7 = r7.f241373e
            r10 = 9
            if (r7 != r10) goto L_0x00b4
        L_0x003e:
            int r7 = r8.mo87190a()
            int r7 = java.lang.Integer.bitCount(r7)
            int r10 = r8.mo87195f()
            com.google.speech.recognizer.a.at r2 = r8.mo87202n()
            com.google.speech.recognizer.a.at r3 = com.google.speech.recognizer.p5233a.C67451at.AMR_WB
            if (r2 != r3) goto L_0x00b4
            if (r7 != r0) goto L_0x0060
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250051dh
            boolean r7 = r6.mo79746e(r7)
            if (r7 != 0) goto L_0x005e
            r7 = 1
            goto L_0x0060
        L_0x005e:
            r7 = 1
            goto L_0x006b
        L_0x0060:
            r2 = 2
            if (r7 != r2) goto L_0x00b4
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250050dg
            boolean r2 = r6.mo79746e(r2)
            if (r2 == 0) goto L_0x00b4
        L_0x006b:
            java.lang.String r2 = "flac_encoder_support"
            boolean r3 = r9.contains(r2)
            if (r3 == 0) goto L_0x0078
            boolean r1 = r9.getBoolean(r2, r1)
            goto L_0x00b4
        L_0x0078:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r4 = "mime"
            java.lang.String r5 = "audio/flac"
            r3.setString(r4, r5)
            java.lang.String r4 = "sample-rate"
            r3.setInteger(r4, r10)
            java.lang.String r10 = "bitrate"
            r4 = 30000(0x7530, float:4.2039E-41)
            r3.setInteger(r10, r4)
            java.lang.String r10 = "channel-count"
            r3.setInteger(r10, r7)
            java.lang.String r7 = "flac-compression-level"
            r10 = 5
            r3.setInteger(r7, r10)
            android.media.MediaCodecList r7 = new android.media.MediaCodecList
            r7.<init>(r1)
            java.lang.String r7 = r7.findEncoderForFormat(r3)
            if (r7 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            android.content.SharedPreferences$Editor r7 = r9.edit()
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r2, r0)
            r7.apply()
            r1 = r0
        L_0x00b4:
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250053dj
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x00cf
            com.google.android.apps.gsa.speech.l.a r6 = r8.mo87201m()
            com.google.speech.recognizer.a.at r7 = com.google.speech.recognizer.p5233a.C67451at.OGG_OPUS
            r6.mo87166j(r7)
            com.google.speech.recognizer.a.at r7 = com.google.speech.recognizer.p5233a.C67451at.OGG_OPUS
            r6.mo87162f(r7)
            com.google.android.apps.gsa.speech.l.b r8 = r6.mo87157a()
            goto L_0x00d1
        L_0x00cf:
            if (r1 != 0) goto L_0x00d2
        L_0x00d1:
            return r8
        L_0x00d2:
            com.google.android.apps.gsa.speech.l.a r6 = r8.mo87201m()
            com.google.speech.recognizer.a.at r7 = com.google.speech.recognizer.p5233a.C67451at.FLAC
            r6.mo87166j(r7)
            com.google.speech.recognizer.a.at r7 = com.google.speech.recognizer.p5233a.C67451at.FLAC
            r6.mo87162f(r7)
            com.google.android.apps.gsa.speech.l.b r6 = r6.mo87157a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.s3request.p8690a.C116318n.m192915a(com.google.android.apps.gsa.shared.m.c, com.google.android.apps.gsa.shared.aa.bh, com.google.android.apps.gsa.speech.l.f, android.content.SharedPreferences, com.google.common.base.ax):com.google.android.apps.gsa.speech.l.b");
    }
}
