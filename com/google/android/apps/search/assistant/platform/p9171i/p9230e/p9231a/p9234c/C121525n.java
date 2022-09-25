package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.n */
/* compiled from: PG */
public final class C121525n {

    /* renamed from: a */
    public static final C59071e f337238a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.e.a.c.n");

    /* renamed from: b */
    public final ScheduledExecutorService f337239b;

    /* renamed from: c */
    public final Executor f337240c;

    /* renamed from: d */
    private final BroadcastReceiver f337241d = new C121519h(this);

    /* renamed from: e */
    private final BroadcastReceiver f337242e = new C121521j(this);

    /* renamed from: f */
    private final BroadcastReceiver f337243f = new C121523l(this);

    /* renamed from: g */
    private final Context f337244g;

    /* renamed from: h */
    private boolean f337245h;

    /* renamed from: i */
    private C121516e f337246i;

    public C121525n(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f337244g = context;
        this.f337239b = scheduledExecutorService;
        this.f337240c = executor;
    }

    /* renamed from: a */
    public final synchronized void mo105222a(long j) {
        C121516e eVar = this.f337246i;
        if (eVar == null) {
            C59071e eVar2 = f337238a;
            ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(35868)).mo56386p("Unable to disable profiler since there is no active instance.");
            ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(35869)).mo56388r("disabling failed, id=%d", j);
            return;
        }
        C121499g.m200778d(eVar);
        this.f337246i.mo105214l();
        this.f337246i = null;
        C59071e eVar3 = f337238a;
        ((C59052c) ((C59052c) eVar3.mo56224b()).mo56372aa(35866)).mo56386p("Profiler disabled.");
        ((C59052c) ((C59052c) eVar3.mo56224b()).mo56372aa(35867)).mo56388r("disabling ok, id=%d", j);
    }

    /* renamed from: b */
    public final synchronized void mo105223b(long j, String str, Duration duration) {
        if (duration.isNegative()) {
            C59071e eVar = f337238a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35875)).mo56389s("Ignoring request to enable profiling for negative duration: %s", duration);
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(35876)).mo56388r("enabling failed, id=%d", j);
        } else if (this.f337246i != null) {
            C59071e eVar2 = f337238a;
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(35873)).mo56386p("Unable to enable profiler since other instance is already running.");
            ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(35874)).mo56388r("enabling failed, id=%d", j);
        } else {
            C59071e eVar3 = f337238a;
            ((C59052c) ((C59052c) eVar3.mo56224b()).mo56372aa(35870)).mo56354G("Enabling profiler for %s seconds targeting %s.", duration, str);
            try {
                C121516e b = C121516e.m200808b(new File(str), this.f337239b);
                this.f337246i = b;
                C121499g.m200776b(b);
                ((C59052c) ((C59052c) eVar3.mo56224b()).mo56372aa(35871)).mo56388r("enabling ok, id=%d", j);
            } catch (FileNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f337238a.mo56226d()).mo56382g(e)).mo56372aa(35872)).mo56389s("Unable to open profile target file '%s' for logging", str);
            }
            this.f337239b.schedule(new C121517f(this, j), duration.toMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public final synchronized void mo105224c() {
        if (!this.f337245h) {
            this.f337244g.registerReceiver(this.f337241d, new IntentFilter("com.google.android.apps.search.assistant.platform.tapas.tool.monitoring.profile.ENABLE"));
            this.f337244g.registerReceiver(this.f337242e, new IntentFilter("com.google.android.apps.search.assistant.platform.tapas.tool.monitoring.profile.DISABLE"));
            this.f337244g.registerReceiver(this.f337243f, new IntentFilter("com.google.android.apps.search.assistant.platform.tapas.tool.monitoring.profile.CALL_BACK"));
            this.f337245h = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        if (r6 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f337238a.mo56224b()).mo56372aa(35860)).mo56386p("Removing hanging profiler backend.");
        com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r6);
        r6.mo105214l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r9 == 1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f337238a.mo56225c()).mo56372aa(35856)).mo56389s("Received unknown command: '%s'", r8);
        r4.write("ER");
        r4.write("Unknown command.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (r6 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r7 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r6);
        r6.mo105214l();
        r4.write("OK");
        r4.flush();
        r7.size();
        r7.writeTo(r1.getOutputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c.C121524m.m200822a("No active profiler session.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0156 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128 A[SYNTHETIC, Splitter:B:55:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0088 A[EDGE_INSN: B:72:0x0088->B:28:0x0088 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105225d(int r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Removing hanging profiler backend."
            java.net.Socket r1 = new java.net.Socket     // Catch:{ UnknownHostException -> 0x0173, IOException -> 0x0157 }
            java.lang.String r2 = "localhost"
            r1.<init>(r2, r13)     // Catch:{ UnknownHostException -> 0x0173, IOException -> 0x0157 }
            r13 = 0
            r2 = 1
            com.google.common.f.e r3 = f337238a     // Catch:{ all -> 0x013b }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x013b }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x013b }
            r4 = 35879(0x8c27, float:5.0277E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x013b }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x013b }
            java.lang.String r4 = "connection established"
            r3.mo56386p(r4)     // Catch:{ all -> 0x013b }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x013b }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x013b }
            java.io.InputStream r5 = r1.getInputStream()     // Catch:{ all -> 0x013b }
            java.nio.charset.Charset r6 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x013b }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x013b }
            r3.<init>(r4)     // Catch:{ all -> 0x013b }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ all -> 0x013b }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x013b }
            java.io.OutputStream r6 = r1.getOutputStream()     // Catch:{ all -> 0x013b }
            java.nio.charset.Charset r7 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x013b }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x013b }
            r4.<init>(r5)     // Catch:{ all -> 0x013b }
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0044:
            java.lang.String r8 = r3.readLine()     // Catch:{ all -> 0x0125 }
            if (r8 != 0) goto L_0x0060
            if (r6 == 0) goto L_0x00e9
            com.google.common.f.e r3 = f337238a     // Catch:{ all -> 0x013b }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x013b }
            r4 = 35860(0x8c14, float:5.025E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56386p(r0)     // Catch:{ all -> 0x013b }
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r6)     // Catch:{ all -> 0x013b }
            r6.mo105214l()     // Catch:{ all -> 0x013b }
            goto L_0x00e9
        L_0x0060:
            int r9 = r8.hashCode()     // Catch:{ all -> 0x0125 }
            r10 = 831245385(0x318bcc49, float:4.068657E-9)
            if (r9 == r10) goto L_0x0079
            r10 = 1067223426(0x3f9c8982, float:1.2229464)
            if (r9 == r10) goto L_0x006f
            goto L_0x0083
        L_0x006f:
            java.lang.String r9 = "END_PROFILING"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0083
            r9 = 1
            goto L_0x0084
        L_0x0079:
            java.lang.String r9 = "START_PROFILING"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0083
            r9 = 0
            goto L_0x0084
        L_0x0083:
            r9 = -1
        L_0x0084:
            java.lang.String r10 = "OK"
            if (r9 == 0) goto L_0x00cd
            if (r9 == r2) goto L_0x00ab
            com.google.common.f.e r3 = f337238a     // Catch:{ all -> 0x0125 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0125 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0125 }
            r5 = 35856(0x8c10, float:5.0245E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x0125 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "Received unknown command: '%s'"
            r3.mo56389s(r5, r8)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "ER"
            r4.write(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "Unknown command."
            r4.write(r3)     // Catch:{ all -> 0x0125 }
            goto L_0x00d4
        L_0x00ab:
            if (r6 == 0) goto L_0x00c7
            if (r7 != 0) goto L_0x00b0
            goto L_0x00c7
        L_0x00b0:
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r6)     // Catch:{ all -> 0x0125 }
            r6.mo105214l()     // Catch:{ all -> 0x0125 }
            r4.write(r10)     // Catch:{ all -> 0x0125 }
            r4.flush()     // Catch:{ all -> 0x0125 }
            r7.size()     // Catch:{ all -> 0x0125 }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ all -> 0x0125 }
            r7.writeTo(r3)     // Catch:{ all -> 0x0125 }
            goto L_0x00d5
        L_0x00c7:
            java.lang.String r3 = "No active profiler session."
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c.C121524m.m200822a(r3, r4)     // Catch:{ all -> 0x0125 }
            goto L_0x00d4
        L_0x00cd:
            if (r6 == 0) goto L_0x0103
            java.lang.String r3 = "Profiling session already active."
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c.C121524m.m200822a(r3, r4)     // Catch:{ all -> 0x0125 }
        L_0x00d4:
            r5 = r6
        L_0x00d5:
            if (r5 == 0) goto L_0x00e9
            com.google.common.f.e r3 = f337238a     // Catch:{ all -> 0x013b }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x013b }
            r4 = 35857(0x8c11, float:5.0246E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56386p(r0)     // Catch:{ all -> 0x013b }
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r5)     // Catch:{ all -> 0x013b }
            r5.mo105214l()     // Catch:{ all -> 0x013b }
        L_0x00e9:
            com.google.common.f.e r0 = f337238a     // Catch:{ all -> 0x013b }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x013b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013b }
            r3 = 35880(0x8c28, float:5.0279E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x013b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "Closing connection."
            r0.mo56386p(r3)     // Catch:{ all -> 0x013b }
            r1.close()     // Catch:{ UnknownHostException -> 0x0173, IOException -> 0x0157 }
            return
        L_0x0103:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0125 }
            r8 = 1048576(0x100000, float:1.469368E-39)
            r7.<init>(r8)     // Catch:{ all -> 0x0125 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0125 }
            r8.<init>(r7)     // Catch:{ all -> 0x0125 }
            java.util.concurrent.ScheduledExecutorService r9 = r12.f337239b     // Catch:{ all -> 0x0125 }
            com.google.android.apps.search.assistant.platform.i.e.a.c.e r11 = new com.google.android.apps.search.assistant.platform.i.e.a.c.e     // Catch:{ all -> 0x0125 }
            r11.<init>(r8, r9)     // Catch:{ all -> 0x0125 }
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200776b(r11)     // Catch:{ all -> 0x0122 }
            r4.write(r10)     // Catch:{ all -> 0x0122 }
            r4.flush()     // Catch:{ all -> 0x0122 }
            r6 = r11
            goto L_0x0044
        L_0x0122:
            r3 = move-exception
            r6 = r11
            goto L_0x0126
        L_0x0125:
            r3 = move-exception
        L_0x0126:
            if (r6 == 0) goto L_0x013a
            com.google.common.f.e r4 = f337238a     // Catch:{ all -> 0x013b }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x013b }
            r5 = 35858(0x8c12, float:5.0248E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r5)).mo56386p(r0)     // Catch:{ all -> 0x013b }
            com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200778d(r6)     // Catch:{ all -> 0x013b }
            r6.mo105214l()     // Catch:{ all -> 0x013b }
        L_0x013a:
            throw r3     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0140 }
            goto L_0x0156
        L_0x0140:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0156 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r13] = r4     // Catch:{ Exception -> 0x0156 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0156 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0156 }
            r2[r13] = r1     // Catch:{ Exception -> 0x0156 }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x0156 }
        L_0x0156:
            throw r0     // Catch:{ UnknownHostException -> 0x0173, IOException -> 0x0157 }
        L_0x0157:
            r13 = move-exception
            com.google.common.f.e r0 = f337238a
            com.google.common.f.x r1 = r0.mo56225c()
            java.lang.String r2 = "error during callback handling"
            r3 = 35883(0x8c2b, float:5.0283E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r13)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Encountered IO issue."
            r2 = 35884(0x8c2c, float:5.0284E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x0173:
            r13 = move-exception
            com.google.common.f.e r0 = f337238a
            com.google.common.f.x r1 = r0.mo56225c()
            java.lang.String r2 = "connection establishment failed"
            r3 = 35881(0x8c29, float:5.028E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r13)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Unknown callback host."
            r2 = 35882(0x8c2a, float:5.0281E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c.C121525n.mo105225d(int):void");
    }
}
