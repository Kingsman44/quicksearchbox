package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.gsa.p8889z.p8890a.C118849l;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.y */
/* compiled from: PG */
public final class C84598y extends UtteranceProgressListener {

    /* renamed from: a */
    public static final C59071e f230232a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ak.a.y");

    /* renamed from: b */
    static C84598y f230233b = null;

    /* renamed from: c */
    public static final Object f230234c = new Object();

    /* renamed from: d */
    public C84574ae f230235d;

    /* renamed from: e */
    public Bundle f230236e;

    /* renamed from: f */
    public TextToSpeech f230237f;

    /* renamed from: g */
    public C118849l f230238g;

    /* renamed from: h */
    public UtteranceProgressListener f230239h;

    /* renamed from: i */
    public Context f230240i;

    /* renamed from: j */
    public boolean f230241j;

    /* renamed from: k */
    public String f230242k;

    /* renamed from: l */
    public C90931ca f230243l;

    /* renamed from: m */
    public C22871g f230244m;

    /* renamed from: n */
    public boolean f230245n;

    /* renamed from: o */
    public long f230246o;

    /* renamed from: p */
    public final Timer f230247p = new Timer("Synthesizer soft timeout");

    /* renamed from: q */
    private final Object f230248q = new Object();

    /* renamed from: r */
    private File f230249r;

    /* renamed from: s */
    private final Object f230250s = new Object();

    /* renamed from: t */
    private boolean f230251t = false;

    /* renamed from: u */
    private boolean f230252u = false;

    /* renamed from: v */
    private boolean f230253v = false;

    /* renamed from: w */
    private final AtomicBoolean f230254w = new AtomicBoolean(false);

    /* renamed from: d */
    public static void m135331d() {
        synchronized (f230234c) {
            C84598y yVar = f230233b;
            if (yVar != null) {
                yVar.mo78361b();
                f230233b = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = r3.f230239h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0.onError(r3.f230242k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m135332e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f230250s
            monitor-enter(r0)
            boolean r1 = r3.f230252u     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x001e
            com.google.common.f.e r1 = f230232a     // Catch:{ all -> 0x002c }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x002c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x002c }
            r2 = 9506(0x2522, float:1.3321E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x002c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "Double calling external onError() and/or onDone()!"
            r1.mo56386p(r2)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x001e:
            r1 = 1
            r3.f230252u = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            android.speech.tts.UtteranceProgressListener r0 = r3.f230239h
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r3.f230242k
            r0.onError(r1)
        L_0x002b:
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.m135332e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r0 = r2.f230239h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        r0.onStart(r2.f230242k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m135333f() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f230250s
            monitor-enter(r0)
            boolean r1 = r2.f230251t     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r2.f230252u     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x000c
            goto L_0x001a
        L_0x000c:
            r1 = 1
            r2.f230251t = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            android.speech.tts.UtteranceProgressListener r0 = r2.f230239h
            if (r0 == 0) goto L_0x0019
            java.lang.String r1 = r2.f230242k
            r0.onStart(r1)
        L_0x0019:
            return
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.m135333f():void");
    }

    /* renamed from: g */
    private final void m135334g(String str, C90908be beVar) {
        if (this.f230245n) {
            this.f230244m.mo28212l(str, new C84593t(beVar));
        } else {
            this.f230243l.mo85139d(beVar);
        }
    }

    /* renamed from: h */
    private final boolean m135335h() {
        return this.f230254w.getAndSet(true);
    }

    /* renamed from: a */
    public final File mo78360a() {
        synchronized (this.f230248q) {
            File file = this.f230249r;
            if (file != null) {
                return file;
            }
            File createTempFile = File.createTempFile("gsa-tts-", ".wav", this.f230240i.getCacheDir());
            createTempFile.deleteOnExit();
            synchronized (this.f230248q) {
                this.f230249r = createTempFile;
            }
            return createTempFile;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r3.f230249r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r3.f230249r = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        m135334g("Delete temporary synthesized TTS file.", new com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84595v(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3.f230247p.cancel();
        r3.f230238g.mo104044e();
        r3.f230237f.stop();
        r0 = r3.f230248q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        monitor-enter(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78361b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f230253v     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0007:
            r0 = 1
            r3.f230253v = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            java.util.Timer r0 = r3.f230247p
            r0.cancel()
            com.google.android.apps.gsa.z.a.l r0 = r3.f230238g
            r0.mo104044e()
            android.speech.tts.TextToSpeech r0 = r3.f230237f
            r0.stop()
            java.lang.Object r0 = r3.f230248q
            monitor-enter(r0)
            java.io.File r1 = r3.f230249r     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0023:
            r2 = 0
            r3.f230249r = r2     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            com.google.android.apps.gsa.search.core.ak.a.v r0 = new com.google.android.apps.gsa.search.core.ak.a.v
            r0.<init>(r1)
            java.lang.String r1 = "Delete temporary synthesized TTS file."
            r3.m135334g(r1, r0)
            return
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.mo78361b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r0 = r3.f230239h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r1 = r3.f230242k;
        r2 = com.google.common.p4526f.p4527a.C58975e.f156826a;
        ((com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84583j) r0).f230183a.mo78350b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78362c() {
        /*
            r3 = this;
            r3.m135333f()
            java.lang.Object r0 = r3.f230250s
            monitor-enter(r0)
            boolean r1 = r3.f230252u     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0021
            com.google.common.f.e r1 = f230232a     // Catch:{ all -> 0x0035 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0035 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0035 }
            r2 = 9505(0x2521, float:1.332E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0035 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "Double calling external onDone() and/or onError()!"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0021:
            r1 = 1
            r3.f230252u = r1     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            android.speech.tts.UtteranceProgressListener r0 = r3.f230239h
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r3.f230242k
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.ak.a.j r0 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84583j) r0
            com.google.android.apps.gsa.search.core.ak.a.r r0 = r0.f230183a
            r0.mo78350b(r1)
        L_0x0034:
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.mo78362c():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDone(java.lang.String r2) {
        /*
            r1 = this;
            boolean r2 = r1.m135335h()
            if (r2 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Timer r2 = r1.f230247p
            r2.cancel()
            monitor-enter(r1)
            boolean r2 = r1.f230253v     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = "Clean up playback"
            com.google.android.apps.gsa.search.core.ak.a.w r0 = new com.google.android.apps.gsa.search.core.ak.a.w     // Catch:{ all -> 0x004d }
            r0.<init>(r1)     // Catch:{ all -> 0x004d }
            r1.m135334g(r2, r0)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x001c:
            java.io.File r2 = r1.mo78360a()     // Catch:{ IOException -> 0x0030 }
            com.google.android.apps.gsa.z.a.l r0 = r1.f230238g     // Catch:{ IOException -> 0x0030 }
            r0.mo104049j(r2)     // Catch:{ IOException -> 0x0030 }
            com.google.android.apps.gsa.z.a.l r2 = r1.f230238g     // Catch:{ IOException -> 0x0030 }
            com.google.android.apps.gsa.search.core.ak.a.x r0 = new com.google.android.apps.gsa.search.core.ak.a.x     // Catch:{ IOException -> 0x0030 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0030 }
            r2.mo104040a(r0)     // Catch:{ IOException -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            com.google.common.f.e r2 = f230232a     // Catch:{ all -> 0x004d }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            r0 = 9507(0x2523, float:1.3322E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r0)     // Catch:{ all -> 0x004d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Cannot open temporary file."
            r2.mo56386p(r0)     // Catch:{ all -> 0x004d }
            r1.mo78361b()     // Catch:{ all -> 0x004d }
            r1.m135332e()     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.onDone(java.lang.String):void");
    }

    public final void onError(String str) {
        if (!m135335h()) {
            ((C59052c) ((C59052c) f230232a.mo56225c()).mo56372aa(9509)).mo56386p("Cannot synthesize TTS to file.");
            mo78361b();
            m135332e();
        }
    }

    public final void onStart(String str) {
        m135333f();
    }
}
