package com.google.android.libraries.assistant.p1528m.p1529a;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.assistant.m.a.l */
/* compiled from: PG */
public final class C18427l {

    /* renamed from: a */
    public final String f52287a;

    /* renamed from: b */
    final String f52288b;

    /* renamed from: c */
    public final SettableFuture f52289c = new SettableFuture();

    /* renamed from: d */
    final /* synthetic */ C18431p f52290d;

    /* renamed from: e */
    int f52291e = 1;

    public C18427l(C18431p pVar, String str) {
        this.f52290d = pVar;
        this.f52287a = Long.toHexString(pVar.f52317i.nextLong());
        this.f52288b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23947a(boolean z) {
        C18422g gVar = C18422g.NO_CONTENT;
        int i = this.f52291e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0 || i2 == 1) {
            this.f52291e = 3;
            this.f52289c.mo57356n((Object) null);
            this.f52290d.f52311c.removeCallbacksAndMessages(this);
            if (z) {
                this.f52290d.f52312d.mo23931g(C18425j.TIMEOUT_ON_UPDATE);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23948b() {
        /*
            r7 = this;
            com.google.android.libraries.assistant.m.a.g r0 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.NO_CONTENT
            int r0 = r7.f52291e
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 2
            r7.f52291e = r0
            java.lang.String r1 = r7.f52288b
            com.google.ak.i r3 = new com.google.ak.i     // Catch:{ v -> 0x003c }
            r3.<init>()     // Catch:{ v -> 0x003c }
            java.lang.Class<com.google.ak.n> r4 = com.google.p386ak.C8398n.class
            java.lang.Object r3 = r3.mo17146d(r1, r4)     // Catch:{ v -> 0x003c }
            com.google.ak.n r3 = (com.google.p386ak.C8398n) r3     // Catch:{ v -> 0x003c }
            if (r3 != 0) goto L_0x0037
            com.google.common.f.e r3 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.f52308a     // Catch:{ v -> 0x003c }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ v -> 0x003c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ v -> 0x003c }
            r4 = 47306(0xb8ca, float:6.629E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ v -> 0x003c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ v -> 0x003c }
            java.lang.String r4 = "Null JSON element."
            r3.mo56386p(r4)     // Catch:{ v -> 0x003c }
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = r3.toString()     // Catch:{ v -> 0x003c }
            goto L_0x004c
        L_0x003c:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.f52308a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Invalid Json: %s"
            r6 = 47305(0xb8c9, float:6.6288E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r6)).mo56389s(r5, r1)
        L_0x004b:
            r1 = r2
        L_0x004c:
            r3 = 0
            if (r1 != 0) goto L_0x005c
            r7.mo23947a(r3)
            com.google.android.libraries.assistant.m.a.p r0 = r7.f52290d
            java.util.Map r0 = r0.f52316h
            java.lang.String r1 = r7.f52287a
            r0.remove(r1)
            return
        L_0x005c:
            com.google.android.libraries.assistant.m.a.p r4 = r7.f52290d
            android.webkit.WebView r5 = r4.f52310b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = r7.f52287a
            java.lang.String r6 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r6)
            r0[r3] = r6
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "update"
            java.lang.String r0 = r4.mo23953c(r1, r0)
            r5.evaluateJavascript(r0, r2)
            com.google.android.libraries.assistant.m.a.p r0 = r7.f52290d
            android.os.Handler r0 = r0.f52311c
            com.google.android.libraries.assistant.m.a.k r1 = new com.google.android.libraries.assistant.m.a.k
            r1.<init>(r7)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 + r4
            r0.postAtTime(r1, r7, r2)
            return
        L_0x008a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1528m.p1529a.C18427l.mo23948b():void");
    }
}
