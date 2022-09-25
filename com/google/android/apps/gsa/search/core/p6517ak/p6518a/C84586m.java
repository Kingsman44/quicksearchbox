package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.m */
/* compiled from: PG */
final class C84586m extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C84589p f230190a;

    /* renamed from: b */
    final /* synthetic */ String f230191b;

    /* renamed from: c */
    final /* synthetic */ C84591r f230192c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84586m(C84591r rVar, C84589p pVar, String str) {
        super("Utterance Playback", 1, 8);
        this.f230192c = rVar;
        this.f230190a = pVar;
        this.f230191b = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230232a.mo56225c()).mo56372aa(9502)).mo56386p("Cannot create temporary file");
        r0 = r2.f230242k;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0145 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            com.google.android.apps.gsa.search.core.ak.a.r r0 = r1.f230192c
            com.google.android.apps.gsa.z.a.f r0 = r0.f230207e
            boolean r0 = r0.mo71758s()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.ak.a.p r2 = r1.f230190a
            com.google.android.apps.gsa.shared.util.c.be r2 = r2.f230198c
            if (r2 == 0) goto L_0x0019
            com.google.android.apps.gsa.search.core.ak.a.r r3 = r1.f230192c
            java.lang.String r4 = "startedCallback"
            r3.mo78352d(r4, r2)
        L_0x0019:
            com.google.android.apps.gsa.search.core.ak.a.r r2 = r1.f230192c
            android.speech.tts.TextToSpeech r3 = r2.f230217o
            if (r3 != 0) goto L_0x0025
            java.lang.String r0 = r1.f230191b
            r2.mo78350b(r0)
            return
        L_0x0025:
            r4 = 1
            r2.f230218p = r4
            android.content.Context r5 = r2.f230204b
            com.google.android.apps.gsa.z.a.l r6 = r2.f230208f
            android.speech.tts.UtteranceProgressListener r2 = r2.f230222t
            com.google.android.apps.gsa.search.core.ak.a.p r7 = r1.f230190a
            com.google.android.apps.gsa.search.core.ak.a.ae r8 = r7.f230196a
            java.lang.String r9 = r1.f230191b
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r11 = "utteranceId"
            r10.putCharSequence(r11, r9)
            java.lang.String r9 = "streamType"
            int r11 = r7.f230197b
            r10.putInt(r9, r11)
            int r7 = r7.f230200e
            r9 = 2
            if (r7 == r4) goto L_0x0056
            if (r7 != r9) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            r11 = 3
            if (r7 != r11) goto L_0x005b
            java.lang.String r7 = "embeddedTts"
            r10.putBoolean(r7, r4)
            goto L_0x005b
        L_0x0056:
            java.lang.String r7 = "networkTts"
            r10.putBoolean(r7, r4)
        L_0x005b:
            java.lang.String r7 = "com.google.android.tts:UseGoogleOnlyVoice"
            java.lang.String r11 = "hol"
            r10.putCharSequence(r7, r11)
            com.google.android.apps.gsa.search.core.ak.a.r r7 = r1.f230192c
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f230209g
            com.google.android.apps.gsa.shared.m.f r11 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250804aQ
            long r11 = r7.mo79743a(r11)
            int r7 = (int) r11
            long r11 = (long) r7
            com.google.android.apps.gsa.search.core.ak.a.r r7 = r1.f230192c
            com.google.android.apps.gsa.shared.util.c.bz r13 = r7.f230205c
            com.google.android.libraries.gsa.k.g r14 = r7.f230206d
            boolean r7 = r7.f230221s
            com.google.common.f.e r15 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230232a
            java.lang.String r15 = "utteranceId"
            java.lang.CharSequence r15 = r10.getCharSequence(r15)
            if (r15 != 0) goto L_0x0082
            goto L_0x01ee
        L_0x0082:
            java.lang.Object r16 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230234c
            monitor-enter(r16)
            com.google.android.apps.gsa.search.core.ak.a.y r17 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230233b     // Catch:{ all -> 0x01f6 }
            if (r17 == 0) goto L_0x008c
            r17.mo78361b()     // Catch:{ all -> 0x01f6 }
        L_0x008c:
            com.google.android.apps.gsa.search.core.ak.a.y r17 = new com.google.android.apps.gsa.search.core.ak.a.y     // Catch:{ all -> 0x01f6 }
            r17.<init>()     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230233b = r17     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.y r9 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230233b     // Catch:{ all -> 0x01f6 }
            r9.f230240i = r5     // Catch:{ all -> 0x01f6 }
            r9.f230237f = r3     // Catch:{ all -> 0x01f6 }
            r9.f230238g = r6     // Catch:{ all -> 0x01f6 }
            r9.f230239h = r2     // Catch:{ all -> 0x01f6 }
            r9.f230235d = r8     // Catch:{ all -> 0x01f6 }
            r9.f230236e = r10     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = r15.toString()     // Catch:{ all -> 0x01f6 }
            r9.f230242k = r2     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.y r2 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230233b     // Catch:{ all -> 0x01f6 }
            r2.f230241j = r0     // Catch:{ all -> 0x01f6 }
            r2.f230246o = r11     // Catch:{ all -> 0x01f6 }
            r2.f230243l = r13     // Catch:{ all -> 0x01f6 }
            r2.f230244m = r14     // Catch:{ all -> 0x01f6 }
            r2.f230245n = r7     // Catch:{ all -> 0x01f6 }
            r3 = -1
            if (r0 == 0) goto L_0x0159
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ IOException -> 0x0145 }
            r0.setOnUtteranceProgressListener(r2)     // Catch:{ IOException -> 0x0145 }
            android.os.Bundle r0 = r2.f230236e     // Catch:{ IOException -> 0x0145 }
            java.lang.String r5 = "networkTts"
            boolean r0 = r0.containsKey(r5)     // Catch:{ IOException -> 0x0145 }
            if (r0 == 0) goto L_0x00db
            android.os.Bundle r0 = r2.f230236e     // Catch:{ IOException -> 0x0145 }
            java.lang.String r5 = "networkTts"
            boolean r0 = r0.getBoolean(r5)     // Catch:{ IOException -> 0x0145 }
            if (r0 == 0) goto L_0x00db
            java.util.Timer r0 = r2.f230247p     // Catch:{ IOException -> 0x0145 }
            com.google.android.apps.gsa.search.core.ak.a.u r5 = new com.google.android.apps.gsa.search.core.ak.a.u     // Catch:{ IOException -> 0x0145 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0145 }
            long r6 = r2.f230246o     // Catch:{ IOException -> 0x0145 }
            r0.schedule(r5, r6)     // Catch:{ IOException -> 0x0145 }
        L_0x00db:
            com.google.android.apps.gsa.search.core.ak.a.ad r0 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84573ad.EARCON     // Catch:{ IOException -> 0x0145 }
            com.google.android.apps.gsa.search.core.ak.a.ae r0 = r2.f230235d     // Catch:{ IOException -> 0x0145 }
            com.google.android.apps.gsa.search.core.ak.a.ad r0 = r0.mo78324b()     // Catch:{ IOException -> 0x0145 }
            int r0 = r0.ordinal()     // Catch:{ IOException -> 0x0145 }
            if (r0 == 0) goto L_0x0129
            if (r0 == r4) goto L_0x0113
            r4 = 2
            if (r0 == r4) goto L_0x00f0
            goto L_0x0174
        L_0x00f0:
            android.os.Bundle r0 = r2.f230236e     // Catch:{ IOException -> 0x0145 }
            java.lang.String r4 = "com.google.android.tts:TextProto"
            com.google.android.apps.gsa.search.core.ak.a.ae r5 = r2.f230235d     // Catch:{ IOException -> 0x0145 }
            com.google.speech.n.b.ar r5 = r5.mo78331d()     // Catch:{ IOException -> 0x0145 }
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0145 }
            r0.putByteArray(r4, r5)     // Catch:{ IOException -> 0x0145 }
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ IOException -> 0x0145 }
            java.lang.String r4 = ""
            android.os.Bundle r5 = r2.f230236e     // Catch:{ IOException -> 0x0145 }
            java.io.File r6 = r2.mo78360a()     // Catch:{ IOException -> 0x0145 }
            java.lang.String r7 = r2.f230242k     // Catch:{ IOException -> 0x0145 }
            int r3 = r0.synthesizeToFile(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0145 }
            goto L_0x01ea
        L_0x0113:
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ IOException -> 0x0145 }
            com.google.android.apps.gsa.search.core.ak.a.ae r4 = r2.f230235d     // Catch:{ IOException -> 0x0145 }
            java.lang.String r4 = r4.mo78330c()     // Catch:{ IOException -> 0x0145 }
            android.os.Bundle r5 = r2.f230236e     // Catch:{ IOException -> 0x0145 }
            java.io.File r6 = r2.mo78360a()     // Catch:{ IOException -> 0x0145 }
            java.lang.String r7 = r2.f230242k     // Catch:{ IOException -> 0x0145 }
            int r3 = r0.synthesizeToFile(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0145 }
            goto L_0x01ea
        L_0x0129:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230232a     // Catch:{ IOException -> 0x0145 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IOException -> 0x0145 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0145 }
            r4 = 9503(0x251f, float:1.3317E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ IOException -> 0x0145 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0145 }
            java.lang.String r4 = "Earcon playback does not support proxy through file"
            r0.mo56386p(r4)     // Catch:{ IOException -> 0x0145 }
            java.lang.String r0 = r2.f230242k     // Catch:{ IOException -> 0x0145 }
            r2.onError(r0)     // Catch:{ IOException -> 0x0145 }
            goto L_0x01ea
        L_0x0145:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230232a     // Catch:{ all -> 0x01f6 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = "Cannot create temporary file"
            r5 = 9502(0x251e, float:1.3315E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r2.f230242k     // Catch:{ all -> 0x01f6 }
        L_0x0154:
            r2.onError(r0)     // Catch:{ all -> 0x01f6 }
            goto L_0x01ea
        L_0x0159:
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            android.speech.tts.UtteranceProgressListener r5 = r2.f230239h     // Catch:{ all -> 0x01f6 }
            r0.setOnUtteranceProgressListener(r5)     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.ad r0 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84573ad.EARCON     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.ae r0 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.ad r0 = r0.mo78324b()     // Catch:{ all -> 0x01f6 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x01f6 }
            r5 = 0
            if (r0 == 0) goto L_0x01b9
            if (r0 == r4) goto L_0x01a8
            r4 = 2
            if (r0 == r4) goto L_0x018a
        L_0x0174:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.f230232a     // Catch:{ all -> 0x01f6 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = "Unsupported utterance type: %s"
            com.google.android.apps.gsa.search.core.ak.a.ae r5 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.ad r5 = r5.mo78324b()     // Catch:{ all -> 0x01f6 }
            r6 = 9501(0x251d, float:1.3314E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56389s(r4, r5)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r2.f230242k     // Catch:{ all -> 0x01f6 }
            goto L_0x0154
        L_0x018a:
            android.os.Bundle r0 = r2.f230236e     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "com.google.android.tts:TextProto"
            com.google.android.apps.gsa.search.core.ak.a.ae r4 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            com.google.speech.n.b.ar r4 = r4.mo78331d()     // Catch:{ all -> 0x01f6 }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x01f6 }
            r0.putByteArray(r3, r4)     // Catch:{ all -> 0x01f6 }
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = ""
            android.os.Bundle r4 = r2.f230236e     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = r2.f230242k     // Catch:{ all -> 0x01f6 }
            int r3 = r0.speak(r3, r5, r4, r2)     // Catch:{ all -> 0x01f6 }
            goto L_0x01ea
        L_0x01a8:
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            com.google.android.apps.gsa.search.core.ak.a.ae r3 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = r3.mo78330c()     // Catch:{ all -> 0x01f6 }
            android.os.Bundle r4 = r2.f230236e     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = r2.f230242k     // Catch:{ all -> 0x01f6 }
            int r3 = r0.speak(r3, r5, r4, r2)     // Catch:{ all -> 0x01f6 }
            goto L_0x01ea
        L_0x01b9:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01f6 }
            r3 = 31
            if (r0 < r3) goto L_0x01cd
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "earcon"
            com.google.android.apps.gsa.search.core.ak.a.ae r4 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            android.net.Uri r4 = r4.mo78323a()     // Catch:{ all -> 0x01f6 }
            r0.addEarcon(r3, r4)     // Catch:{ all -> 0x01f6 }
            goto L_0x01de
        L_0x01cd:
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "earcon"
            com.google.android.apps.gsa.search.core.ak.a.ae r4 = r2.f230235d     // Catch:{ all -> 0x01f6 }
            android.net.Uri r4 = r4.mo78323a()     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01f6 }
            r0.addEarcon(r3, r4)     // Catch:{ all -> 0x01f6 }
        L_0x01de:
            android.speech.tts.TextToSpeech r0 = r2.f230237f     // Catch:{ all -> 0x01f6 }
            java.lang.String r3 = "earcon"
            android.os.Bundle r4 = r2.f230236e     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = r2.f230242k     // Catch:{ all -> 0x01f6 }
            int r3 = r0.playEarcon(r3, r5, r4, r2)     // Catch:{ all -> 0x01f6 }
        L_0x01ea:
            monitor-exit(r16)     // Catch:{ all -> 0x01f6 }
            if (r3 != 0) goto L_0x01ee
            return
        L_0x01ee:
            com.google.android.apps.gsa.search.core.ak.a.r r0 = r1.f230192c
            java.lang.String r2 = r1.f230191b
            r0.mo78350b(r2)
            return
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01f6 }
            goto L_0x01fa
        L_0x01f9:
            throw r0
        L_0x01fa:
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84586m.run():void");
    }
}
