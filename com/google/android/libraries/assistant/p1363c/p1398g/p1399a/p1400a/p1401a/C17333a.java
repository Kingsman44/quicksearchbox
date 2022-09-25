package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import android.net.Uri;
import androidx.media3.p132b.C2499c;
import androidx.media3.p132b.C2510n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.a */
/* compiled from: PG */
public final class C17333a extends C2499c {

    /* renamed from: a */
    private static final C59071e f50166a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.a.a.a.a");

    /* renamed from: b */
    private final ReentrantLock f50167b;

    /* renamed from: c */
    private final Condition f50168c;

    /* renamed from: d */
    private Uri f50169d = null;

    /* renamed from: e */
    private int f50170e = 0;

    /* renamed from: f */
    private boolean f50171f = false;

    /* renamed from: g */
    private C63088z f50172g = C63088z.f170246b;

    public C17333a() {
        super(false);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f50167b = reentrantLock;
        this.f50168c = reentrantLock.newCondition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r6.f50171f != false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5879a(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.f50167b
            r0.lock()
            r0 = 0
            r1 = -1
            if (r9 == 0) goto L_0x0061
        L_0x0009:
            boolean r2 = r6.f50171f     // Catch:{ InterruptedException -> 0x0020 }
            if (r2 != 0) goto L_0x003d
            com.google.protobuf.z r2 = r6.f50172g     // Catch:{ InterruptedException -> 0x0020 }
            int r2 = r2.mo59031d()     // Catch:{ InterruptedException -> 0x0020 }
            int r3 = r6.f50170e     // Catch:{ InterruptedException -> 0x0020 }
            int r3 = r3 + r9
            if (r2 >= r3) goto L_0x003d
            java.util.concurrent.locks.Condition r2 = r6.f50168c     // Catch:{ InterruptedException -> 0x0020 }
            r2.await()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0009
        L_0x001e:
            r7 = move-exception
            goto L_0x0071
        L_0x0020:
            r2 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001e }
            r3.interrupt()     // Catch:{ all -> 0x001e }
            com.google.common.f.e r3 = f50166a     // Catch:{ all -> 0x001e }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x001e }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "TTS"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x001e }
            java.lang.String r4 = "Interrupted while waiting for write."
            r5 = 42667(0xa6ab, float:5.9789E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x001e }
        L_0x003d:
            com.google.protobuf.z r2 = r6.f50172g     // Catch:{ all -> 0x001e }
            int r2 = r2.mo59031d()     // Catch:{ all -> 0x001e }
            int r3 = r6.f50170e     // Catch:{ all -> 0x001e }
            int r3 = r3 + r9
            int r9 = java.lang.Math.min(r2, r3)     // Catch:{ all -> 0x001e }
            int r2 = r6.f50170e     // Catch:{ all -> 0x001e }
            if (r9 != r2) goto L_0x0053
            boolean r7 = r6.f50171f     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x0066
            goto L_0x0065
        L_0x0053:
            int r0 = r9 - r2
            com.google.protobuf.z r3 = r6.f50172g     // Catch:{ all -> 0x001e }
            com.google.protobuf.z r2 = r3.mo59039k(r2, r9)     // Catch:{ all -> 0x001e }
            r2.mo59171K(r7, r8)     // Catch:{ all -> 0x001e }
            r6.f50170e = r9     // Catch:{ all -> 0x001e }
            goto L_0x0066
        L_0x0061:
            boolean r7 = r6.f50171f     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x0066
        L_0x0065:
            r0 = -1
        L_0x0066:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f50167b
            r7.unlock()
            if (r0 == r1) goto L_0x0070
            r6.mo5927g(r0)
        L_0x0070:
            return r0
        L_0x0071:
            java.util.concurrent.locks.ReentrantLock r8 = r6.f50167b
            r8.unlock()
            goto L_0x0078
        L_0x0077:
            throw r7
        L_0x0078:
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a.C17333a.mo5879a(byte[], int, int):int");
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        mo5929i(nVar);
        this.f50169d = nVar.f6891a;
        mo5930j(nVar);
        return -1;
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        Uri uri = this.f50169d;
        uri.getClass();
        return uri;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f50169d = null;
        mo5928h();
    }

    /* renamed from: k */
    public final void mo23279k() {
        this.f50167b.lock();
        try {
            C59104x b = f50166a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) b).mo56372aa(42668)).mo56387q("#end, pushed %d bytes into the data source.", this.f50172g.mo59031d());
            this.f50171f = true;
            this.f50168c.signal();
        } finally {
            this.f50167b.unlock();
        }
    }

    /* renamed from: l */
    public final void mo23280l(C63088z zVar) {
        ReentrantLock reentrantLock;
        this.f50167b.lock();
        try {
            if (this.f50171f) {
                C59104x d = f50166a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TTS");
                ((C59052c) ((C59052c) d).mo56372aa(42669)).mo56386p("#write is called after #end.");
                reentrantLock = this.f50167b;
            } else {
                this.f50172g = this.f50172g.mo59177x(zVar);
                this.f50168c.signal();
                reentrantLock = this.f50167b;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f50167b.unlock();
            throw th;
        }
    }
}
