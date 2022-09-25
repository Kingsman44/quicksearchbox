package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ck */
/* compiled from: PG */
public final class C125247ck implements C125244ch {

    /* renamed from: a */
    private final Executor f345509a;

    public C125247ck(Executor executor) {
        C69664n.m101061g(executor, "uiThreadExecutor");
        this.f345509a = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106877a(android.content.Context r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125245ci
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ci r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125245ci) r0
            int r1 = r0.f345507d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345507d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ci r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ci
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f345505b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345507d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f345504a
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0058
        L_0x0029:
            r7 = move-exception
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            java.lang.String r7 = "SD.createOnDeviceSpeechRecognizer"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r7)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.cj r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.cj     // Catch:{ all -> 0x0063 }
            r2.<init>(r6)     // Catch:{ all -> 0x0063 }
            java.util.concurrent.Executor r6 = r5.f345509a     // Catch:{ all -> 0x0063 }
            java.util.concurrent.Callable r2 = com.google.apps.tiktok.tracing.C47810es.m84978r(r2)     // Catch:{ all -> 0x0063 }
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92904m(r2, r6)     // Catch:{ all -> 0x0063 }
            r0.f345504a = r7     // Catch:{ all -> 0x0063 }
            r0.f345507d = r3     // Catch:{ all -> 0x0063 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ all -> 0x0063 }
            if (r6 == r1) goto L_0x0062
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0058:
            java.lang.String r0 = "context: Context): Speec…       )\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ all -> 0x0029 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            return r7
        L_0x0062:
            return r1
        L_0x0063:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0067:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125247ck.mo106877a(android.content.Context, h.c.g):java.lang.Object");
    }
}
