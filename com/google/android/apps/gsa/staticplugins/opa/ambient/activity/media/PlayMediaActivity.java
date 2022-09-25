package com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media;

import com.google.android.apps.gsa.p8839t.p8840a.C118340b;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class PlayMediaActivity extends C106417b {

    /* renamed from: k */
    public static final C59071e f296849k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media.PlayMediaActivity");

    /* renamed from: l */
    public C118340b f296850l;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.e.f r0 = com.google.android.apps.gsa.e.f.an
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r0)
            super.onCreate(r11)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = r11.getAction()
            com.google.common.f.e r1 = f296849k
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "PMediaAct"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "received action %s"
            r5 = 23057(0x5a11, float:3.231E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r0)
            if (r0 != 0) goto L_0x002a
            r10.finish()
            return
        L_0x002a:
            int r2 = r0.hashCode()
            r3 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r2) {
                case -2025178539: goto L_0x005f;
                case -2025107051: goto L_0x0055;
                case -528853325: goto L_0x004b;
                case -528827491: goto L_0x0041;
                case 785908365: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0069
        L_0x0037:
            java.lang.String r2 = "ACTION_PAUSE"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0069
            r2 = 3
            goto L_0x006a
        L_0x0041:
            java.lang.String r2 = "ACTION_PLAY"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0069
            r2 = 0
            goto L_0x006a
        L_0x004b:
            java.lang.String r2 = "ACTION_OPEN"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0069
            r2 = 4
            goto L_0x006a
        L_0x0055:
            java.lang.String r2 = "ACTION_PLAY_PREV"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0069
            r2 = 2
            goto L_0x006a
        L_0x005f:
            java.lang.String r2 = "ACTION_PLAY_NEXT"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = -1
        L_0x006a:
            if (r2 == 0) goto L_0x0116
            java.lang.String r8 = "attempting action %s on package %s"
            java.lang.String r9 = "KEY_PACKAGE_NAME"
            if (r2 == r7) goto L_0x00ef
            if (r2 == r6) goto L_0x00c8
            if (r2 == r5) goto L_0x00a1
            if (r2 == r3) goto L_0x007a
            goto L_0x019d
        L_0x007a:
            java.lang.String r11 = r11.getStringExtra(r9)
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 23065(0x5a19, float:3.2321E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r1.mo56354G(r8, r0, r11)
            if (r11 == 0) goto L_0x019d
            com.google.android.apps.gsa.t.a.b r0 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r0.mo90824a(r11, r1)
            goto L_0x019d
        L_0x00a1:
            java.lang.String r11 = r11.getStringExtra(r9)
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 23064(0x5a18, float:3.232E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r1.mo56354G(r8, r0, r11)
            if (r11 == 0) goto L_0x019d
            com.google.android.apps.gsa.t.a.b r0 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r0.mo90825b(r11, r1)
            goto L_0x019d
        L_0x00c8:
            java.lang.String r11 = r11.getStringExtra(r9)
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 23063(0x5a17, float:3.2318E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r1.mo56354G(r8, r0, r11)
            if (r11 == 0) goto L_0x019d
            com.google.android.apps.gsa.t.a.b r0 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r0.mo90830g(r11, r1)
            goto L_0x019d
        L_0x00ef:
            java.lang.String r11 = r11.getStringExtra(r9)
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 23062(0x5a16, float:3.2317E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r1.mo56354G(r8, r0, r11)
            if (r11 == 0) goto L_0x019d
            com.google.android.apps.gsa.t.a.b r0 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r0.mo90826c(r11, r1)
            goto L_0x019d
        L_0x0116:
            java.lang.String r0 = "KEY_MEDIA_ITEM"
            java.lang.String r0 = r11.getStringExtra(r0)
            com.google.common.f.x r2 = r1.mo56224b()     // Catch:{ ct -> 0x018a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x018a }
            r2.mo56378ag(r3, r4)     // Catch:{ ct -> 0x018a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x018a }
            r3 = 23058(0x5a12, float:3.2311E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ ct -> 0x018a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x018a }
            java.lang.String r3 = "read media item %s"
            r2.mo56389s(r3, r0)     // Catch:{ ct -> 0x018a }
            if (r0 == 0) goto L_0x019d
            byte[] r0 = android.util.Base64.decode(r0, r8)     // Catch:{ ct -> 0x018a }
            com.google.common.f.x r2 = r1.mo56224b()     // Catch:{ ct -> 0x018a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x018a }
            r2.mo56378ag(r3, r4)     // Catch:{ ct -> 0x018a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x018a }
            r3 = 23059(0x5a13, float:3.2313E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ ct -> 0x018a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x018a }
            java.lang.String r3 = "copied to byte string %s"
            r2.mo56389s(r3, r0)     // Catch:{ ct -> 0x018a }
            com.google.assistant.e.j.wg r2 = com.google.assistant.p3897e.p3921j.C52560wg.f137943j     // Catch:{ ct -> 0x018a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0)     // Catch:{ ct -> 0x018a }
            com.google.assistant.e.j.wg r0 = (com.google.assistant.p3897e.p3921j.C52560wg) r0     // Catch:{ ct -> 0x018a }
            java.lang.String r2 = "KEY_OPEN_IN_FOREGROUND"
            boolean r11 = r11.getBooleanExtra(r2, r8)
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r3 = 23060(0x5a14, float:3.2314E-41)
            java.lang.String r4 = "attempting to play mediaItem in foreground? %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r4, r2)
            if (r11 == 0) goto L_0x0180
            com.google.android.apps.gsa.t.a.b r11 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r11.mo90828e(r0, r1)
            goto L_0x019d
        L_0x0180:
            com.google.android.apps.gsa.t.a.b r11 = r10.f296850l
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            r11.mo90827d(r0, r1)
            goto L_0x019d
        L_0x018a:
            r11 = move-exception
            com.google.common.f.e r0 = f296849k
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "unable to read media item. no-op."
            r2 = 23061(0x5a15, float:3.2315E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r11)).mo56372aa(r2)).mo56386p(r1)
        L_0x019d:
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media.PlayMediaActivity.onCreate(android.os.Bundle):void");
    }
}
