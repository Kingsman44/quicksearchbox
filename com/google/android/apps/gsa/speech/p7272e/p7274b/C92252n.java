package com.google.android.apps.gsa.speech.p7272e.p7274b;

import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.e.b.n */
/* compiled from: PG */
public enum C92252n {
    DICTATION,
    ENDPOINTER_VOICESEARCH,
    ENDPOINTER_DICTATION,
    HOTWORD,
    COMPILER,
    GRAMMAR,
    VOICE_ACTIONS,
    VOICE_ACTIONS_COMPILER;
    

    /* renamed from: i */
    private static Map f257223i;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n m151478a(java.io.File r4) {
        /*
            java.lang.Class<com.google.android.apps.gsa.speech.e.b.n> r0 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.class
            monitor-enter(r0)
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x005b
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            f257223i = r1     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "dictation"
            com.google.android.apps.gsa.speech.e.b.n r3 = DICTATION     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "endpointer_voicesearch"
            com.google.android.apps.gsa.speech.e.b.n r3 = ENDPOINTER_VOICESEARCH     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "endpointer_dictation"
            com.google.android.apps.gsa.speech.e.b.n r3 = ENDPOINTER_DICTATION     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "google_hotword"
            com.google.android.apps.gsa.speech.e.b.n r3 = HOTWORD     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "hotword"
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "compile_grammar"
            com.google.android.apps.gsa.speech.e.b.n r3 = COMPILER     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "grammar"
            com.google.android.apps.gsa.speech.e.b.n r3 = GRAMMAR     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "voice_actions"
            com.google.android.apps.gsa.speech.e.b.n r3 = VOICE_ACTIONS     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "voice_actions_compiler"
            com.google.android.apps.gsa.speech.e.b.n r3 = VOICE_ACTIONS_COMPILER     // Catch:{ all -> 0x00ab }
            r1.put(r2, r3)     // Catch:{ all -> 0x00ab }
        L_0x005b:
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "."
            int r2 = r1.indexOf(r2)     // Catch:{ all -> 0x00ab }
            if (r2 <= 0) goto L_0x006c
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)     // Catch:{ all -> 0x00ab }
        L_0x006c:
            java.util.Map r2 = f257223i     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00ab }
            com.google.android.apps.gsa.speech.e.b.n r2 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n) r2     // Catch:{ all -> 0x00ab }
            if (r2 != 0) goto L_0x00a9
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = com.google.common.p4541l.C59316ad.m92161a(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "config"
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00a9
            java.lang.String r4 = "compiler"
            boolean r4 = r1.contains(r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0091
            com.google.android.apps.gsa.speech.e.b.n r2 = VOICE_ACTIONS_COMPILER     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x0091:
            java.lang.String r4 = "CONTINUOUS"
            boolean r4 = r1.contains(r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x009c
            com.google.android.apps.gsa.speech.e.b.n r2 = DICTATION     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x009c:
            java.lang.String r4 = "SHORT"
            boolean r4 = r1.contains(r4)     // Catch:{ all -> 0x00ab }
            if (r4 != 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            com.google.android.apps.gsa.speech.e.b.n r4 = VOICE_ACTIONS     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)
            return r4
        L_0x00a9:
            monitor-exit(r0)
            return r2
        L_0x00ab:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.m151478a(java.io.File):com.google.android.apps.gsa.speech.e.b.n");
    }

    /* renamed from: b */
    public final boolean mo86935b() {
        return this == ENDPOINTER_DICTATION || this == ENDPOINTER_VOICESEARCH;
    }
}
