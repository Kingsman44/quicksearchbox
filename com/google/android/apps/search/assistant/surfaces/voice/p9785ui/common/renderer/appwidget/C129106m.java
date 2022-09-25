package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.TtsPlayerViewModel$startTtsSession$previousJob$1", mo61344c = "TtsPlayerViewModel.kt", mo61345d = "invokeSuspend", mo61346e = {53, 80, 82})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.m */
/* compiled from: PG */
final class C129106m extends C69572j implements C69630p {

    /* renamed from: a */
    Object f354681a;

    /* renamed from: b */
    int f354682b;

    /* renamed from: c */
    final /* synthetic */ TtsPlayerViewModel f354683c;

    /* renamed from: d */
    final /* synthetic */ String f354684d;

    /* renamed from: e */
    final /* synthetic */ String f354685e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129106m(TtsPlayerViewModel ttsPlayerViewModel, String str, String str2, C69577g gVar) {
        super(2, gVar);
        this.f354683c = ttsPlayerViewModel;
        this.f354684d = str;
        this.f354685e = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129106m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.libraries.assistant.c.g.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0111 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f354682b
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x0022
            if (r1 == r2) goto L_0x0017
            java.lang.Object r0 = r12.f354681a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0014 }
            goto L_0x012b
        L_0x0014:
            r13 = move-exception
            goto L_0x013b
        L_0x0017:
            java.lang.Object r1 = r12.f354681a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x001e }
            goto L_0x010b
        L_0x001e:
            r13 = move-exception
            r0 = r1
            goto L_0x013b
        L_0x0022:
            p5462h.C69714l.m101134b(r13)
            goto L_0x0035
        L_0x0026:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.TtsPlayerViewModel r13 = r12.f354683c
            com.google.common.util.concurrent.cx r13 = r13.f354636c
            r12.f354682b = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r12)
            if (r13 == r0) goto L_0x0144
        L_0x0035:
            com.google.android.apps.search.assistant.platform.h.k.a.c r13 = (com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c) r13
            com.google.android.apps.search.assistant.platform.h.k.a.c r1 = com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c.HANDS_FREE_ONLY
            if (r13 == r1) goto L_0x0141
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.TtsPlayerViewModel r13 = r12.f354683c     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.b.a.a r13 = r13.f354638e     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.bh r1 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh.f50509e     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.bf r1 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17497bf) r1     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.ao r5 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao.f50468d     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.an r5 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17478an) r5     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.au r6 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au.f50481h     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.ar r6 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17482ar) r6     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.at r7 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at.SERVER     // Catch:{ all -> 0x0139 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.au r8 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au) r8     // Catch:{ all -> 0x0139 }
            int r7 = r7.f50480d     // Catch:{ all -> 0x0139 }
            r8.f50486d = r7     // Catch:{ all -> 0x0139 }
            int r7 = r8.f50483a     // Catch:{ all -> 0x0139 }
            r7 = r7 | 8
            r8.f50483a = r7     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ah r7 = com.google.speech.p5224k.p5225a.C67190ah.f182619q     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ae r7 = (com.google.speech.p5224k.p5225a.C67187ae) r7     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = r12.f354684d     // Catch:{ all -> 0x0139 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ah r9 = (com.google.speech.p5224k.p5225a.C67190ah) r9     // Catch:{ all -> 0x0139 }
            r8.getClass()     // Catch:{ all -> 0x0139 }
            int r10 = r9.f182622a     // Catch:{ all -> 0x0139 }
            r10 = r10 | r4
            r9.f182622a = r10     // Catch:{ all -> 0x0139 }
            r9.f182625d = r8     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = r12.f354685e     // Catch:{ all -> 0x0139 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ah r9 = (com.google.speech.p5224k.p5225a.C67190ah) r9     // Catch:{ all -> 0x0139 }
            r8.getClass()     // Catch:{ all -> 0x0139 }
            int r10 = r9.f182622a     // Catch:{ all -> 0x0139 }
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r9.f182622a = r10     // Catch:{ all -> 0x0139 }
            r9.f182632k = r8     // Catch:{ all -> 0x0139 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ah r8 = (com.google.speech.p5224k.p5225a.C67190ah) r8     // Catch:{ all -> 0x0139 }
            int r9 = r8.f182622a     // Catch:{ all -> 0x0139 }
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.f182622a = r9     // Catch:{ all -> 0x0139 }
            r8.f182629h = r4     // Catch:{ all -> 0x0139 }
            r6.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.au r8 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au) r8     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x0139 }
            com.google.speech.k.a.ah r7 = (com.google.speech.p5224k.p5225a.C67190ah) r7     // Catch:{ all -> 0x0139 }
            r7.getClass()     // Catch:{ all -> 0x0139 }
            r8.f50485c = r7     // Catch:{ all -> 0x0139 }
            r8.f50484b = r3     // Catch:{ all -> 0x0139 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.ao r7 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao) r7     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.au r6 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au) r6     // Catch:{ all -> 0x0139 }
            r6.getClass()     // Catch:{ all -> 0x0139 }
            r7.f50471b = r6     // Catch:{ all -> 0x0139 }
            int r6 = r7.f50470a     // Catch:{ all -> 0x0139 }
            r6 = r6 | r4
            r7.f50470a = r6     // Catch:{ all -> 0x0139 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r6 = r1.instance     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.bh r6 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh) r6     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.ao r5 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao) r5     // Catch:{ all -> 0x0139 }
            r5.getClass()     // Catch:{ all -> 0x0139 }
            r6.f50513c = r5     // Catch:{ all -> 0x0139 }
            r6.f50512b = r3     // Catch:{ all -> 0x0139 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.k.bh r1 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh) r1     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.b r13 = r13.mo23306a(r1)     // Catch:{ all -> 0x0139 }
            com.google.android.libraries.assistant.c.g.a r1 = r13.mo23302a()     // Catch:{ all -> 0x0134 }
            com.google.common.util.concurrent.cx r1 = r1.mo23277c()     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = "ttsSession.sessionStatus.synthesisStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ all -> 0x0134 }
            r12.f354681a = r13     // Catch:{ all -> 0x0134 }
            r12.f354682b = r2     // Catch:{ all -> 0x0134 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r12)     // Catch:{ all -> 0x0134 }
            if (r1 == r0) goto L_0x0133
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x010b:
            com.google.android.libraries.assistant.c.g.k.aw r13 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw) r13     // Catch:{ all -> 0x001e }
            int r13 = r13.f50493a     // Catch:{ all -> 0x001e }
            if (r13 != r4) goto L_0x012a
            com.google.android.libraries.assistant.c.g.a r13 = r1.mo23302a()     // Catch:{ all -> 0x001e }
            com.google.common.util.concurrent.cx r13 = r13.mo23275a()     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "ttsSession.sessionStatus.playbackEndStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)     // Catch:{ all -> 0x001e }
            r12.f354681a = r1     // Catch:{ all -> 0x001e }
            r12.f354682b = r3     // Catch:{ all -> 0x001e }
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r12)     // Catch:{ all -> 0x001e }
            if (r13 == r0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            return r0
        L_0x012a:
            r0 = r1
        L_0x012b:
            if (r0 == 0) goto L_0x0130
            r0.close()
        L_0x0130:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        L_0x0133:
            return r0
        L_0x0134:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x013b
        L_0x0139:
            r13 = move-exception
            r0 = 0
        L_0x013b:
            if (r0 == 0) goto L_0x0140
            r0.close()
        L_0x0140:
            throw r13
        L_0x0141:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        L_0x0144:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget.C129106m.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129106m(this.f354683c, this.f354684d, this.f354685e, gVar);
    }
}
