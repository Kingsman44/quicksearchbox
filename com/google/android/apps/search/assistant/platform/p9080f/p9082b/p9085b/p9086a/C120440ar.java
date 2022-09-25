package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ar */
/* compiled from: PG */
public final class C120440ar {

    /* renamed from: a */
    public final C71389v f334985a = C71392y.m104158a(0, (C71387t) null, 6);

    /* renamed from: b */
    private final C120441as f334986b;

    public C120440ar(C120441as asVar, C33447g gVar) {
        C69664n.m101061g(asVar, "runner");
        C69664n.m101061g(gVar, "shutdownHookRegistry");
        this.f334986b = asVar;
        gVar.mo38849b(new C120436an(this));
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [kotlinx.coroutines.i.g, kotlinx.coroutines.be] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7.mo63021x(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        throw new com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120465m("Unable to send request to focus policy", com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5090b.p5091a.p5092a.C65490b.UNABLE_TO_SEND_UTTERANCE_REQUEST, r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0023, B:17:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104751a(com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120454bd r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120437ao
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.f.b.b.a.ao r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120437ao) r0
            int r1 = r0.f334984c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f334984c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.b.b.a.ao r0 = new com.google.android.apps.search.assistant.platform.f.b.b.a.ao
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f334982a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f334984c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0071
        L_0x0027:
            r6 = move-exception
            goto L_0x0074
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.platform.f.b.b.a.as r7 = r5.f334986b
            kotlinx.coroutines.be r7 = r7.f334989c
            r7.mo62876y()
            r0.f334984c = r3     // Catch:{ all -> 0x0027 }
            kotlinx.coroutines.i.f r7 = new kotlinx.coroutines.i.f     // Catch:{ all -> 0x0027 }
            r7.<init>(r0)     // Catch:{ all -> 0x0027 }
            kotlinx.coroutines.a.v r0 = r5.f334985a     // Catch:{ all -> 0x0066 }
            kotlinx.coroutines.i.h r0 = r0.mo62725B()     // Catch:{ all -> 0x0066 }
            com.google.android.apps.search.assistant.platform.f.b.b.a.ap r2 = new com.google.android.apps.search.assistant.platform.f.b.b.a.ap     // Catch:{ all -> 0x0066 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)     // Catch:{ all -> 0x0066 }
            r0.mo62744a(r7, r6, r2)     // Catch:{ all -> 0x0066 }
            com.google.android.apps.search.assistant.platform.f.b.b.a.as r6 = r5.f334986b     // Catch:{ all -> 0x0066 }
            kotlinx.coroutines.be r6 = r6.f334989c     // Catch:{ all -> 0x0066 }
            r6.mo62827g()     // Catch:{ all -> 0x0066 }
            com.google.android.apps.search.assistant.platform.f.b.b.a.aq r0 = new com.google.android.apps.search.assistant.platform.f.b.b.a.aq     // Catch:{ all -> 0x0066 }
            r0.<init>(r3)     // Catch:{ all -> 0x0066 }
            r7.mo63014a(r6, r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r6 = move-exception
            r7.mo63021x(r6)     // Catch:{ all -> 0x0027 }
        L_0x006a:
            java.lang.Object r6 = r7.mo63016f()     // Catch:{ all -> 0x0027 }
            if (r6 != r1) goto L_0x0071
            return r1
        L_0x0071:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0074:
            com.google.android.apps.search.assistant.platform.f.b.b.a.m r7 = new com.google.android.apps.search.assistant.platform.f.b.b.a.m
            java.lang.String r0 = "Unable to send request to focus policy"
            com.google.protos.j.a.a.a.b.a.a.c.a.b.a.a.b r1 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5090b.p5091a.p5092a.C65490b.UNABLE_TO_SEND_UTTERANCE_REQUEST
            r7.<init>(r0, r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120440ar.mo104751a(com.google.android.apps.search.assistant.platform.f.b.b.a.bd, h.c.g):java.lang.Object");
    }
}
