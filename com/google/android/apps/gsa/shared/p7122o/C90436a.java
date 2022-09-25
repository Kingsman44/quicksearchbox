package com.google.android.apps.gsa.shared.p7122o;

import com.google.protos.youtube.elements.p5165a.C66038z;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.gsa.shared.o.a */
/* compiled from: PG */
public final /* synthetic */ class C90436a implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C90438b f252647a;

    /* renamed from: b */
    public final /* synthetic */ C66038z f252648b;

    public /* synthetic */ C90436a(C90438b bVar, C66038z zVar) {
        this.f252647a = bVar;
        this.f252648b = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (r0.f252650b.getApplicationInfo(r4, 0).enabled == false) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25795a() {
        /*
            r6 = this;
            com.google.android.apps.gsa.shared.o.b r0 = r6.f252647a
            com.google.protos.youtube.elements.a.z r1 = r6.f252648b
            java.lang.String r2 = r1.f179601b
            r3 = 0
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)
            java.lang.String r4 = r2.getPackage()
            if (r4 == 0) goto L_0x002f
            android.content.pm.PackageManager r5 = r0.f252650b     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x001c }
            boolean r5 = r5.enabled     // Catch:{ NameNotFoundException -> 0x001c }
            if (r5 != 0) goto L_0x002f
            goto L_0x001d
        L_0x001c:
        L_0x001d:
            java.lang.String r5 = r1.f179602c
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x002f
            java.lang.String r1 = r1.f179602c
            android.content.Intent r2 = android.content.Intent.parseUri(r1, r3)
            java.lang.String r4 = r2.getPackage()
        L_0x002f:
            if (r4 != 0) goto L_0x0041
            android.content.ComponentName r1 = r2.getComponent()
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            r2.addCategory(r1)
            java.lang.String r1 = "com.google.android.apps.gsa.customtabs.EXTRA_LAUNCH_NEW_TASK_OVERRIDE"
            r2.putExtra(r1, r3)
        L_0x0041:
            com.google.android.apps.gsa.search.shared.service.ah r0 = r0.f252649a
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r3)
            r1.mo82015c(r2)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r1.mo82013a()
            r0.mo81961c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7122o.C90436a.mo25795a():void");
    }
}
