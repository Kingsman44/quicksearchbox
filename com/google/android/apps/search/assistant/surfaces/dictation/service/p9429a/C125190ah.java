package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.os.Bundle;
import android.speech.RecognitionListener;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ah */
/* compiled from: PG */
public final class C125190ah implements RecognitionListener {

    /* renamed from: a */
    final /* synthetic */ C125234by f345355a;

    public C125190ah(C125234by byVar) {
        this.f345355a = byVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBeginningOfSpeech() {
        /*
            r3 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = r3.f345355a
            java.lang.String r1 = "SD.AiAiListener.OnBeginningOfSpeech"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ai r0 = r0.f345455a     // Catch:{ all -> 0x0012 }
            r0.mo106840e()     // Catch:{ all -> 0x0012 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r0)
            return
        L_0x0012:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onBeginningOfSpeech():void");
    }

    public final void onBufferReceived(byte[] bArr) {
    }

    public final void onEndOfSegmentedSession() {
    }

    public final void onEndOfSpeech() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(int r6) {
        /*
            r5 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = r5.f345355a
            java.lang.String r1 = "SD.AiAiListener.OnError"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            kotlinx.coroutines.aw r2 = r0.f345462h     // Catch:{ all -> 0x0018 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ad r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ad     // Catch:{ all -> 0x0018 }
            r4 = 0
            r3.<init>(r0, r6, r4)     // Catch:{ all -> 0x0018 }
            r6 = 3
            kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r6)     // Catch:{ all -> 0x0018 }
            p5462h.p5472e.C69598b.m101013a(r1, r4)
            return
        L_0x0018:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onError(int):void");
    }

    public final void onEvent(int i, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPartialResults(android.os.Bundle r6) {
        /*
            r5 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = r5.f345355a
            java.lang.String r1 = "SD.AiAiListener.OnPartialResults"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            kotlinx.coroutines.aw r2 = r0.f345462h     // Catch:{ all -> 0x0018 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ae r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ae     // Catch:{ all -> 0x0018 }
            r4 = 0
            r3.<init>(r6, r0, r4)     // Catch:{ all -> 0x0018 }
            r6 = 3
            kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r6)     // Catch:{ all -> 0x0018 }
            p5462h.p5472e.C69598b.m101013a(r1, r4)
            return
        L_0x0018:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onPartialResults(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReadyForSpeech(android.os.Bundle r5) {
        /*
            r4 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = r4.f345355a
            java.lang.String r0 = "SD.AiAiListener.OnReadyForSpeech"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)
            kotlinx.coroutines.aw r1 = r5.f345462h     // Catch:{ all -> 0x0018 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.af r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.af     // Catch:{ all -> 0x0018 }
            r3 = 0
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0018 }
            r5 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r5)     // Catch:{ all -> 0x0018 }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x0018:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onReadyForSpeech(android.os.Bundle):void");
    }

    public final void onResults(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRmsChanged(float r3) {
        /*
            r2 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = r2.f345355a
            java.lang.String r1 = "SD.AiAiListener.OnRmsChanged"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ai r0 = r0.f345455a     // Catch:{ all -> 0x0012 }
            r0.mo106839d(r3)     // Catch:{ all -> 0x0012 }
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r3)
            return
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onRmsChanged(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSegmentResults(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "segmentResults"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = r5.f345355a
            java.lang.String r1 = "SD.AiAiListener.OnSegmentResults"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            kotlinx.coroutines.aw r2 = r0.f345462h     // Catch:{ all -> 0x001d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ag r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ag     // Catch:{ all -> 0x001d }
            r4 = 0
            r3.<init>(r0, r6, r4)     // Catch:{ all -> 0x001d }
            r6 = 3
            kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r6)     // Catch:{ all -> 0x001d }
            p5462h.p5472e.C69598b.m101013a(r1, r4)
            return
        L_0x001d:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125190ah.onSegmentResults(android.os.Bundle):void");
    }
}
