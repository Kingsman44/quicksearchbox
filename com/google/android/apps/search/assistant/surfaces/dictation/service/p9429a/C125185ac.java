package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Context;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.protobuf.C62910ar;
import java.util.concurrent.Executor;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ac */
/* compiled from: PG */
public final class C125185ac {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f345338a = C59071e.m91331h();

    /* renamed from: b */
    public final C125244ch f345339b;

    /* renamed from: c */
    public final Context f345340c;

    /* renamed from: d */
    private final C62910ar f345341d;

    /* renamed from: e */
    private final Executor f345342e;

    /* renamed from: f */
    private final C69626l f345343f = new C59425c(new C125184ab(this, (C69577g) null));

    public C125185ac(C125244ch chVar, Context context, C62910ar arVar, Executor executor) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f345339b = chVar;
        this.f345340c = context;
        this.f345341d = arVar;
        this.f345342e = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106823a(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125269y
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.y r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125269y) r0
            int r1 = r0.f345589f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345589f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.y r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.y
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f345587d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345589f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r11)     // Catch:{ dx -> 0x002b }
            goto L_0x00f0
        L_0x002b:
            r11 = move-exception
            goto L_0x00f4
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0036:
            java.lang.Object r2 = r0.f345586c
            java.lang.Object r4 = r0.f345585b
            java.lang.Object r5 = r0.f345584a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x0040 }
            goto L_0x0089
        L_0x0040:
            r11 = move-exception
            goto L_0x00a1
        L_0x0042:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.e r11 = f345338a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 36448(0x8e60, float:5.1075E-41)
            r2.<init>(r5)
            r11.mo56379ah(r2)
            java.lang.String r2 = "Starting AiAi status check using Android T API [SD]"
            r11.mo56386p(r2)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r2 = "android.speech.action.RECOGNIZE_SPEECH"
            r11.<init>(r2)
            java.lang.String r2 = "android.speech.extra.MASK_OFFENSIVE_WORDS"
            r5 = 0
            android.content.Intent r11 = r11.putExtra(r2, r5)
            java.lang.String r2 = "Intent(RecognizerIntent.…K_OFFENSIVE_WORDS, false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            kotlinx.coroutines.z r2 = new kotlinx.coroutines.z
            r2.<init>()
            h.f.a.l r5 = r10.f345343f     // Catch:{ all -> 0x009f }
            r0.f345584a = r10     // Catch:{ all -> 0x009f }
            r0.f345585b = r11     // Catch:{ all -> 0x009f }
            r0.f345586c = r2     // Catch:{ all -> 0x009f }
            r0.f345589f = r4     // Catch:{ all -> 0x009f }
            java.lang.Object r4 = r5.mo5761a(r0)     // Catch:{ all -> 0x009f }
            if (r4 == r1) goto L_0x009e
            r5 = r10
            r9 = r4
            r4 = r11
            r11 = r9
        L_0x0089:
            android.speech.SpeechRecognizer r11 = (android.speech.SpeechRecognizer) r11     // Catch:{ all -> 0x0040 }
            r6 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ac r6 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125185ac) r6     // Catch:{ all -> 0x0040 }
            java.util.concurrent.Executor r6 = r6.f345342e     // Catch:{ all -> 0x0040 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.x r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.x     // Catch:{ all -> 0x0040 }
            r8 = r2
            kotlinx.coroutines.z r8 = (kotlinx.coroutines.C71816z) r8     // Catch:{ all -> 0x0040 }
            r7.<init>(r8)     // Catch:{ all -> 0x0040 }
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ all -> 0x0040 }
            r11.checkRecognitionSupport(r4, r6, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x00ce
        L_0x009e:
            return r1
        L_0x009f:
            r11 = move-exception
            r5 = r10
        L_0x00a1:
            com.google.common.f.e r4 = f345338a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r11 = r4.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r4 = new com.google.common.f.n
            r6 = 36450(0x8e62, float:5.1077E-41)
            r4.<init>(r6)
            r11.mo56379ah(r4)
            java.lang.String r4 = "Error when trying to get AiAiStatus. [SD]"
            r11.mo56386p(r4)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc r11 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cb r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125238cb.RECOGNITION_SERVICE_MISSING
            h.a.ao r6 = p5462h.p5463a.C69498ao.f185920a
            r11.<init>(r4, r6, r6, r6)
            r4 = r2
            kotlinx.coroutines.da r4 = (kotlinx.coroutines.C71665da) r4
            r4.mo62909P(r11)
        L_0x00ce:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ac r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125185ac) r5     // Catch:{ dx -> 0x002b }
            com.google.protobuf.ar r11 = r5.f345341d     // Catch:{ dx -> 0x002b }
            j$.time.Duration r11 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r11)     // Catch:{ dx -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.z r4 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.z     // Catch:{ dx -> 0x002b }
            kotlinx.coroutines.z r2 = (kotlinx.coroutines.C71816z) r2     // Catch:{ dx -> 0x002b }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ dx -> 0x002b }
            r0.f345584a = r5     // Catch:{ dx -> 0x002b }
            r0.f345585b = r5     // Catch:{ dx -> 0x002b }
            r0.f345586c = r5     // Catch:{ dx -> 0x002b }
            r0.f345589f = r3     // Catch:{ dx -> 0x002b }
            long r2 = com.google.common.p4580v.p4582b.C60942a.m93083a(r11)     // Catch:{ dx -> 0x002b }
            java.lang.Object r11 = kotlinx.coroutines.C71745ea.m104929a(r2, r4, r0)     // Catch:{ dx -> 0x002b }
            if (r11 == r1) goto L_0x00f3
        L_0x00f0:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125239cc) r11     // Catch:{ dx -> 0x002b }
            goto L_0x011b
        L_0x00f3:
            return r1
        L_0x00f4:
            com.google.common.f.e r0 = f345338a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r11 = r0.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36449(0x8e61, float:5.1076E-41)
            r0.<init>(r1)
            r11.mo56379ah(r0)
            java.lang.String r0 = "Getting AiAi status timed out [SD]"
            r11.mo56386p(r0)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc r11 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.cc
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cb r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125238cb.TIMEOUT
            h.a.ao r1 = p5462h.p5463a.C69498ao.f185920a
            r11.<init>(r0, r1, r1, r1)
        L_0x011b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125185ac.mo106823a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106824b(java.lang.String r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125183aa
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.aa r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125183aa) r0
            int r1 = r0.f345335d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345335d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.aa r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.aa
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f345333b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345335d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r9 = r0.f345332a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0076 }
            goto L_0x006d
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0031:
            p5462h.C69714l.m101134b(r10)
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r2 = "android.speech.action.RECOGNIZE_SPEECH"
            r10.<init>(r2)
            java.lang.String r2 = "android.speech.extra.LANGUAGE"
            android.content.Intent r10 = r10.putExtra(r2, r9)
            java.lang.String r2 = "Intent(RecognizerIntent.…RA_LANGUAGE, languageTag)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.common.f.e r2 = f345338a     // Catch:{ all -> 0x0076 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0076 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "Triggering AiAi model download for %s. [SD]"
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0076 }
            r6 = 36451(0x8e63, float:5.1079E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0076 }
            r2.mo56379ah(r5)     // Catch:{ all -> 0x0076 }
            r2.mo56389s(r4, r9)     // Catch:{ all -> 0x0076 }
            h.f.a.l r9 = r8.f345343f     // Catch:{ all -> 0x0076 }
            r0.f345332a = r10     // Catch:{ all -> 0x0076 }
            r0.f345335d = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r9 = r9.mo5761a(r0)     // Catch:{ all -> 0x0076 }
            if (r9 == r1) goto L_0x0075
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006d:
            android.speech.SpeechRecognizer r10 = (android.speech.SpeechRecognizer) r10     // Catch:{ all -> 0x0076 }
            android.content.Intent r9 = (android.content.Intent) r9     // Catch:{ all -> 0x0076 }
            r10.triggerModelDownload(r9)     // Catch:{ all -> 0x0076 }
            goto L_0x0096
        L_0x0075:
            return r1
        L_0x0076:
            r9 = move-exception
            com.google.common.f.e r10 = f345338a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.x r9 = r10.mo56382g(r9)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r0 = 36452(0x8e64, float:5.108E-41)
            r10.<init>(r0)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Error when trying to trigger language download. [SD]"
            r9.mo56386p(r10)
            r3 = 0
        L_0x0096:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125185ac.mo106824b(java.lang.String, h.c.g):java.lang.Object");
    }
}
