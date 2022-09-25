package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.media.AudioRecord;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.t */
/* compiled from: PG */
public final class C96500t implements C96502v {

    /* renamed from: a */
    public static final C59071e f269974a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.t");

    /* renamed from: b */
    public final AudioRecord f269975b = new AudioRecord(6, 16000, 16, 2, 3200);

    /* renamed from: c */
    public volatile boolean f269976c = false;

    /* renamed from: d */
    public volatile boolean f269977d = false;

    /* renamed from: e */
    private final short[] f269978e = new short[1600];

    /* renamed from: f */
    private final byte[] f269979f = new byte[3200];

    /* renamed from: g */
    private C96503w f269980g;

    /* renamed from: h */
    private final String f269981h;

    /* renamed from: i */
    private final C22871g f269982i;

    /* renamed from: j */
    private final C96502v f269983j;

    /* renamed from: k */
    private final C96504x f269984k;

    /* renamed from: l */
    private volatile boolean f269985l = false;

    public C96500t(C22871g gVar, C96504x xVar, String str, C96502v vVar) {
        this.f269982i = gVar;
        this.f269981h = str;
        this.f269983j = vVar;
        this.f269984k = xVar;
    }

    /* renamed from: a */
    public final void mo88859a(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (this.f269976c) {
            if (z) {
                mo90183d();
            }
            this.f269983j.mo88859a(byteBuffer, i, i2, z);
        }
    }

    /* renamed from: b */
    public final C96503w mo90181b() {
        if (this.f269980g == null) {
            C96504x xVar = this.f269984k;
            String str = this.f269981h;
            C68214a a = C68219e.m98518a(((C68226l) xVar.f269995a).f184585a);
            a.getClass();
            str.getClass();
            this.f269980g = new C96503w(a, str, this);
        }
        return this.f269980g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo90182c() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f269976c     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0048
            boolean r0 = r5.f269985l     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x000a
            goto L_0x0048
        L_0x000a:
            android.media.AudioRecord r0 = r5.f269975b     // Catch:{ all -> 0x004a }
            int r0 = r0.getState()     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == r1) goto L_0x0033
            com.google.common.f.e r0 = f269974a     // Catch:{ all -> 0x004a }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x004a }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "BufferRecorder"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "AudioRecord is not initialized %d"
            android.media.AudioRecord r3 = r5.f269975b     // Catch:{ all -> 0x004a }
            int r3 = r3.getState()     // Catch:{ all -> 0x004a }
            r4 = 17123(0x42e3, float:2.3994E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56387q(r2, r3)     // Catch:{ all -> 0x004a }
            r5.f269985l = r1     // Catch:{ all -> 0x004a }
            r5.f269977d = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return
        L_0x0033:
            android.media.AudioRecord r0 = r5.f269975b     // Catch:{ all -> 0x004a }
            r0.startRecording()     // Catch:{ all -> 0x004a }
            r5.f269976c = r1     // Catch:{ all -> 0x004a }
            com.google.android.libraries.gsa.k.g r0 = r5.f269982i     // Catch:{ all -> 0x004a }
            com.google.android.apps.gsa.staticplugins.bisto.util.s r1 = new com.google.android.apps.gsa.staticplugins.bisto.util.s     // Catch:{ all -> 0x004a }
            r1.<init>(r5)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "record"
            r0.mo28212l(r2, r1)     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            return
        L_0x0048:
            monitor-exit(r5)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.util.C96500t.mo90182c():void");
    }

    /* renamed from: d */
    public final synchronized void mo90183d() {
        if (!this.f269976c) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f269985l = true;
        this.f269976c = false;
        synchronized (this.f269975b) {
            if (this.f269975b.getState() != 0) {
                this.f269975b.stop();
                this.f269975b.release();
            }
        }
        mo90181b().mo90187b();
        C58976aa aaVar2 = C58975e.f156826a;
        mo90181b().mo90186a();
    }

    /* renamed from: e */
    public final int mo90184e() {
        int i;
        synchronized (this.f269975b) {
            if (this.f269975b.getState() == 0) {
                i = -1;
            } else {
                int read = this.f269975b.read(this.f269978e, 0, 1600);
                i = read;
            }
        }
        if (i < 0) {
            C58976aa aaVar = C58975e.f156826a;
            return 2;
        } else if (i == 0 || !this.f269976c) {
            return 1;
        } else {
            ByteBuffer.wrap(this.f269979f).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(this.f269978e);
            try {
                if (!mo90181b().mo90188c(this.f269979f, i + i)) {
                    return 2;
                }
                return 1;
            } catch (BufferOverflowException unused) {
                C58976aa aaVar2 = C58975e.f156826a;
                mo90181b().mo90187b();
                return 3;
            }
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = this.f269981h;
        boolean d = mo90181b().mo90189d();
        boolean z = this.f269976c;
        boolean z2 = this.f269985l;
        boolean z3 = this.f269977d;
        return "BufferRecorder 0x" + hexString + ": \"" + str + "\". CBisComplete? " + d + "; listening? " + z + "; haveRan? " + z2 + "; endedInError? " + z3;
    }
}
