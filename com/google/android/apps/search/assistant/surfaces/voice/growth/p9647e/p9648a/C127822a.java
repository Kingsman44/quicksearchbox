package com.google.android.apps.search.assistant.surfaces.voice.growth.p9647e.p9648a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.a */
/* compiled from: PG */
public final class C127822a implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C127823b f351807a;

    public C127822a(C127823b bVar) {
        this.f351807a = bVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return C46786dc.m83350a(C58528ij.m90012L(C127120a.f350023e, C127120a.f350020b, C127120a.f350022d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20331b() {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.b r0 = r10.f351807a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.g r0 = r0.f351810c
            com.google.android.apps.search.assistant.platform.b.a.d.w r0 = r0.mo107985a()
            int r0 = r0.f333911a
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x002e
            com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.b r0 = r10.f351807a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.g r0 = r0.f351810c
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.a r0 = r0.f350120b
            java.util.concurrent.atomic.AtomicReference r0 = r0.f350103b
            java.lang.Object r0 = r0.get()
            com.google.android.apps.search.assistant.platform.b.a.d.cl r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl) r0
            int r3 = r0.f333790a
            r4 = 2
            if (r3 != r4) goto L_0x0026
            java.lang.Object r0 = r0.f333791b
            com.google.android.apps.search.assistant.platform.b.a.d.ck r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck) r0
            goto L_0x0028
        L_0x0026:
            com.google.android.apps.search.assistant.platform.b.a.d.ck r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck.f333783d
        L_0x0028:
            boolean r0 = r0.f333786b
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.b r3 = r10.f351807a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.g r3 = r3.f351810c
            com.google.android.apps.search.assistant.platform.b.a.d.w r3 = r3.mo107985a()
            int r3 = r3.f333911a
            if (r3 != r2) goto L_0x004b
            com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.b r3 = r10.f351807a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.b.a r3 = r3.f351811d
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.i r3 = r3.mo107955a()
            int r3 = r3.f349674d
            r4 = 10
            if (r3 != r4) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            com.google.android.apps.search.assistant.surfaces.voice.growth.e.a.b r4 = r10.f351807a
            android.app.KeyguardManager r4 = r4.f351809b
            boolean r4 = r4.isDeviceLocked()
            r4 = r4 ^ r2
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.voice.growth.p9647e.p9648a.C127823b.f351808a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "WWDataService"
            r5.mo56378ag(r6, r7)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r6 = 37713(0x9351, float:5.2847E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            java.lang.String r9 = "speechNotRecognized %b, warmerWelcomeError %b, screenNotLocked %b"
            r5.mo56359L(r9, r6, r7, r8)
            if (r0 != 0) goto L_0x0082
            if (r3 == 0) goto L_0x0085
        L_0x0082:
            if (r4 == 0) goto L_0x0085
            r1 = 1
        L_0x0085:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.growth.p9647e.p9648a.C127822a.mo20331b():com.google.common.util.concurrent.cx");
    }
}
