package com.bumptech.glide.load.p293a.p295b;

import android.util.Log;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p280a.C5504c;
import com.bumptech.glide.p280a.C5505d;
import com.bumptech.glide.p280a.C5506e;
import com.bumptech.glide.p280a.C5507f;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.load.a.b.h */
/* compiled from: PG */
public final class C5692h implements C5686b {

    /* renamed from: a */
    private final C5702r f17157a;

    /* renamed from: b */
    private final File f17158b;

    /* renamed from: c */
    private final long f17159c;

    /* renamed from: d */
    private final C5690f f17160d = new C5690f();

    /* renamed from: e */
    private C5507f f17161e;

    @Deprecated
    protected C5692h(File file, long j) {
        this.f17158b = file;
        this.f17159c = j;
        this.f17157a = new C5702r();
    }

    /* renamed from: e */
    private final synchronized C5507f m14768e() {
        if (this.f17161e == null) {
            File file = this.f17158b;
            long j = this.f17159c;
            if (j > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        C5507f.m14235g(file2, file3, false);
                    }
                }
                C5507f fVar = new C5507f(file, j);
                if (fVar.f16664b.exists()) {
                    try {
                        fVar.mo11849e();
                        C5507f.m14234d(fVar.f16665c);
                        Iterator it = fVar.f16669g.values().iterator();
                        while (it.hasNext()) {
                            C5505d dVar = (C5505d) it.next();
                            if (dVar.f16660f == null) {
                                for (int i = 0; i < fVar.f16666d; i = 1) {
                                    fVar.f16667e += dVar.f16656b[0];
                                }
                            } else {
                                dVar.f16660f = null;
                                for (int i2 = 0; i2 < fVar.f16666d; i2 = 1) {
                                    C5507f.m14234d(dVar.f16657c[0]);
                                    C5507f.m14234d(dVar.f16658d[0]);
                                }
                                it.remove();
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                        fVar.mo11847c();
                    }
                    this.f17161e = fVar;
                }
                file.mkdirs();
                fVar = new C5507f(file, j);
                fVar.mo11850f();
                this.f17161e = fVar;
            } else {
                throw new IllegalArgumentException("maxSize <= 0");
            }
        }
        return this.f17161e;
    }

    /* renamed from: f */
    private final synchronized void m14769f() {
        this.f17161e = null;
    }

    /* renamed from: a */
    public final File mo12190a(C5955n nVar) {
        String a = this.f17157a.mo12198a(nVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String valueOf = String.valueOf(nVar);
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + valueOf);
        }
        try {
            C5506e a2 = m14768e().mo11845a(a);
            if (a2 != null) {
                return a2.f16662a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo12191b() {
        try {
            m14768e().mo11847c();
            m14769f();
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
                m14769f();
            } catch (Throwable th) {
                m14769f();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo12192c(C5955n nVar) {
        try {
            m14768e().mo11854k(this.f17157a.mo12198a(nVar));
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo12193d(C5955n nVar, C5685a aVar) {
        C5688d dVar;
        C5690f fVar;
        File file;
        String a = this.f17157a.mo12198a(nVar);
        C5690f fVar2 = this.f17160d;
        synchronized (fVar2) {
            dVar = (C5688d) fVar2.f17153a.get(a);
            if (dVar == null) {
                C5689e eVar = fVar2.f17154b;
                synchronized (eVar.f17152a) {
                    dVar = (C5688d) eVar.f17152a.poll();
                }
                if (dVar == null) {
                    dVar = new C5688d();
                }
                fVar2.f17153a.put(a, dVar);
            }
            dVar.f17151b++;
        }
        dVar.f17150a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a + " for for Key: " + String.valueOf(nVar));
            }
            try {
                C5507f e = m14768e();
                if (e.mo11845a(a) == null) {
                    C5504c j = e.mo11853j(a);
                    if (j != null) {
                        try {
                            synchronized (j.f16654d) {
                                C5505d dVar2 = j.f16651a;
                                if (dVar2.f16660f == j) {
                                    if (!dVar2.f16659e) {
                                        j.f16652b[0] = true;
                                    }
                                    file = dVar2.f16658d[0];
                                    j.f16654d.f16663a.mkdirs();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            if (aVar.mo12189a(file)) {
                                j.f16654d.mo11846b(j, true);
                                j.f16653c = true;
                            }
                            j.mo11843b();
                            fVar = this.f17160d;
                            fVar.mo12194a(a);
                        } catch (Throwable th) {
                            j.mo11843b();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a);
                    }
                } else {
                    fVar = this.f17160d;
                    fVar.mo12194a(a);
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } catch (Throwable th2) {
            this.f17160d.mo12194a(a);
            throw th2;
        }
    }
}
