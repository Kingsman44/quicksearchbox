package com.google.android.apps.gsa.silentfeedback;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.silentfeedback.a */
/* compiled from: PG */
public final /* synthetic */ class C92008a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ CrashloopReceiver f256526a;

    /* renamed from: b */
    public final /* synthetic */ Context f256527b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f256528c;

    public /* synthetic */ C92008a(CrashloopReceiver crashloopReceiver, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f256526a = crashloopReceiver;
        this.f256527b = context;
        this.f256528c = pendingResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "StartupSettings.bin"
            java.lang.String r1 = "shared_prefs"
            com.google.android.apps.gsa.silentfeedback.CrashloopReceiver r2 = r12.f256526a
            android.content.Context r3 = r12.f256527b
            android.content.BroadcastReceiver$PendingResult r4 = r12.f256528c
            java.lang.String r5 = "current_configuration.bin"
            java.io.FileInputStream r5 = r3.openFileInput(r5)     // Catch:{ IOException -> 0x0035 }
            com.google.android.apps.gsa.silentfeedback.j r6 = com.google.android.apps.gsa.silentfeedback.C92017j.f256539d     // Catch:{ all -> 0x0026 }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ all -> 0x0026 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0026 }
            java.lang.Object r6 = r6.mo59013l(r5, r7)     // Catch:{ all -> 0x0026 }
            com.google.android.apps.gsa.silentfeedback.j r6 = (com.google.android.apps.gsa.silentfeedback.C92017j) r6     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x004c
        L_0x0026:
            r6 = move-exception
            if (r5 == 0) goto L_0x0031
            r5.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r5 = move-exception
            com.google.android.apps.gsa.silentfeedback.C92014g.m151027a(r6, r5)     // Catch:{ IOException -> 0x0035 }
        L_0x0031:
            throw r6     // Catch:{ IOException -> 0x0035 }
        L_0x0032:
            r0 = move-exception
            goto L_0x0173
        L_0x0035:
            r5 = move-exception
            com.google.common.f.e r6 = com.google.android.apps.gsa.silentfeedback.C92015h.f256538a     // Catch:{ all -> 0x0032 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0032 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0032 }
            java.lang.String r8 = "SilentFeedbackConfig"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "Could not read experiments from file."
            r8 = 11958(0x2eb6, float:1.6757E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)     // Catch:{ all -> 0x0032 }
            com.google.android.apps.gsa.silentfeedback.j r6 = com.google.android.apps.gsa.silentfeedback.C92017j.f256539d     // Catch:{ all -> 0x0032 }
        L_0x004c:
            boolean r5 = r6.f256542b     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x016f
            java.lang.String r5 = "consecutive_crash_stats"
            r7 = 4
            android.content.SharedPreferences r5 = r3.getSharedPreferences(r5, r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "consecutive_crash_count"
            r8 = 0
            int r5 = r5.getInt(r7, r8)     // Catch:{ all -> 0x0032 }
            long r9 = (long) r5     // Catch:{ all -> 0x0032 }
            long r5 = r6.f256543c     // Catch:{ all -> 0x0032 }
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x016f
            com.google.android.apps.gsa.silentfeedback.d r2 = r2.f256525c     // Catch:{ all -> 0x0032 }
            g.a.a r5 = r2.f256530b     // Catch:{ all -> 0x0163 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.d r5 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d) r5     // Catch:{ all -> 0x0163 }
            g.a.a r6 = r2.f256531c     // Catch:{ all -> 0x0163 }
            java.lang.Object r6 = r6.mo17428b()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.b r6 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b) r6     // Catch:{ all -> 0x0163 }
            r5.mo26980a(r6)     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.a.b r5 = r5.mo26989h()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.api.w r6 = r5.f59932a     // Catch:{ all -> 0x0163 }
            r6.mo119131f()     // Catch:{ all -> 0x0163 }
            g.a.a r6 = r2.f256532d     // Catch:{ all -> 0x0163 }
            java.lang.Object r6 = r6.mo17428b()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.w.a.k r6 = (com.google.android.libraries.gcoreclient.p1803w.p1804a.C21718k) r6     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.w.a.l r6 = new com.google.android.libraries.gcoreclient.w.a.l     // Catch:{ all -> 0x0163 }
            r6.<init>()     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = ""
            com.google.android.libraries.gcoreclient.h.a.b.g r6 = com.google.android.libraries.gcoreclient.p1803w.p1804a.C21711d.m40833b(r5, r6)     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.g r6 = r6.mo26994a()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.w.a.c r6 = (com.google.android.libraries.gcoreclient.p1803w.p1804a.C21710c) r6     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.h r7 = r6.mo26997c()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.b.k r7 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k) r7     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.api.Status r7 = r7.f59946b     // Catch:{ all -> 0x0163 }
            int r9 = r7.f389621g     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = r7.f389622h     // Catch:{ all -> 0x0163 }
            boolean r7 = r7.mo119097c()     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x0153
            com.google.android.libraries.gcoreclient.w.a.a r6 = r6.mo27074a()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.f.a r7 = r2.f256533e     // Catch:{ all -> 0x0163 }
            long r9 = r7.mo26871c()     // Catch:{ all -> 0x0163 }
            com.google.android.apps.gsa.search.core.i.g r7 = com.google.android.apps.gsa.silentfeedback.C92013f.m151026a(r6, r9)     // Catch:{ all -> 0x0163 }
            java.io.File r9 = r3.getDir(r1, r8)     // Catch:{ Exception -> 0x0137 }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0137 }
            r10.<init>(r9, r0)     // Catch:{ Exception -> 0x0137 }
            r9 = 0
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ all -> 0x0132 }
            r11.<init>(r10)     // Catch:{ all -> 0x0132 }
            com.google.android.apps.gsa.shared.aj.d r10 = com.google.android.apps.gsa.shared.p6986aj.C89185d.f241801b     // Catch:{ all -> 0x012f }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (java.io.InputStream) r11)     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.shared.aj.d r10 = (com.google.android.apps.gsa.shared.p6986aj.C89185d) r10     // Catch:{ all -> 0x012f }
            java.util.Map r10 = com.google.android.apps.gsa.shared.p6986aj.C89186e.m145058c(r10)     // Catch:{ all -> 0x012f }
            com.google.common.p4541l.C59337t.m92221a(r11)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r11 = "gsa_config_server"
            com.google.protobuf.z r7 = r7.toByteString()     // Catch:{ Exception -> 0x0137 }
            r10.put(r11, r7)     // Catch:{ Exception -> 0x0137 }
            java.io.File r1 = r3.getDir(r1, r8)     // Catch:{ Exception -> 0x0137 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0137 }
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x0137 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0137 }
            java.lang.String r7 = "alt_startup_preferences.bin"
            r0.<init>(r1, r7)     // Catch:{ Exception -> 0x0137 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x012a }
            r1.<init>(r0)     // Catch:{ all -> 0x012a }
            com.google.android.apps.gsa.shared.aj.d r7 = com.google.android.apps.gsa.shared.p6986aj.C89186e.m145057b(r10)     // Catch:{ all -> 0x0127 }
            r7.writeTo(r1)     // Catch:{ all -> 0x0127 }
            r1.flush()     // Catch:{ all -> 0x0127 }
            java.io.FileDescriptor r7 = r1.getFD()     // Catch:{ all -> 0x0127 }
            r7.sync()     // Catch:{ all -> 0x0127 }
            com.google.common.p4541l.C59317ae.m92163a(r1)     // Catch:{ Exception -> 0x0137 }
            boolean r0 = r0.renameTo(r3)     // Catch:{ Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0121
            com.google.android.gms.phenotype.Configurations r0 = r6.f60026a     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = r0.f393980a     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.b.g r0 = com.google.android.libraries.gcoreclient.p1803w.p1804a.C21711d.m40832a(r5, r0)     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.g r0 = r0.mo26994a()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.gcoreclient.h.a.h r0 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h) r0     // Catch:{ all -> 0x0163 }
            goto L_0x0153
        L_0x0121:
            com.google.android.apps.gsa.silentfeedback.c r0 = new com.google.android.apps.gsa.silentfeedback.c     // Catch:{ Exception -> 0x0137 }
            r0.<init>()     // Catch:{ Exception -> 0x0137 }
            throw r0     // Catch:{ Exception -> 0x0137 }
        L_0x0127:
            r0 = move-exception
            r9 = r1
            goto L_0x012b
        L_0x012a:
            r0 = move-exception
        L_0x012b:
            com.google.common.p4541l.C59317ae.m92163a(r9)     // Catch:{ Exception -> 0x0137 }
            throw r0     // Catch:{ Exception -> 0x0137 }
        L_0x012f:
            r0 = move-exception
            r9 = r11
            goto L_0x0133
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            com.google.common.p4541l.C59337t.m92221a(r9)     // Catch:{ Exception -> 0x0137 }
            throw r0     // Catch:{ Exception -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.silentfeedback.C92011d.f256529a     // Catch:{ all -> 0x0163 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0163 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0163 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0163 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0163 }
            r1 = 11955(0x2eb3, float:1.6753E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0163 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "Recovery failed because we failed to overwrite disk state."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0163 }
        L_0x0153:
            com.google.android.gms.common.api.w r0 = r5.f59932a     // Catch:{ all -> 0x0163 }
            r0.mo119132g()     // Catch:{ all -> 0x0163 }
            com.google.android.libraries.search.logging.d.kp r0 = r2.f256534f     // Catch:{ all -> 0x0032 }
            r0.mo41684R()     // Catch:{ all -> 0x0032 }
            com.google.android.libraries.search.logging.d.kp r0 = r2.f256534f     // Catch:{ all -> 0x0032 }
            r0.mo41691f()     // Catch:{ all -> 0x0032 }
            goto L_0x016f
        L_0x0163:
            r0 = move-exception
            com.google.android.libraries.search.logging.d.kp r1 = r2.f256534f     // Catch:{ all -> 0x0032 }
            r1.mo41684R()     // Catch:{ all -> 0x0032 }
            com.google.android.libraries.search.logging.d.kp r1 = r2.f256534f     // Catch:{ all -> 0x0032 }
            r1.mo41691f()     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x016f:
            r4.finish()
            return
        L_0x0173:
            com.google.common.f.e r1 = com.google.android.apps.gsa.silentfeedback.CrashloopReceiver.f256523a     // Catch:{ all -> 0x0192 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0192 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0192 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0192 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0192 }
            r1 = 11949(0x2ead, float:1.6744E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0192 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = "Error processing intent."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0192 }
            r4.finish()
            return
        L_0x0192:
            r0 = move-exception
            r4.finish()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.silentfeedback.C92008a.run():void");
    }
}
