package com.android.p275j;

import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.j.e */
/* compiled from: PG */
public final class C5193e extends Thread {

    /* renamed from: b */
    private static final boolean f16484b = C5188ab.f16468b;

    /* renamed from: a */
    public final BlockingQueue f16485a;

    /* renamed from: c */
    private final BlockingQueue f16486c;

    /* renamed from: d */
    private final C5191c f16487d;

    /* renamed from: e */
    private volatile boolean f16488e = false;

    /* renamed from: f */
    private final C5189ac f16489f;

    /* renamed from: g */
    private final C5198j f16490g;

    public C5193e(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, C5191c cVar, C5198j jVar) {
        this.f16486c = blockingQueue;
        this.f16485a = blockingQueue2;
        this.f16487d = cVar;
        this.f16490g = jVar;
        this.f16489f = new C5189ac(this, blockingQueue2, jVar);
    }

    /* renamed from: b */
    private void m14158b() {
        List list;
        List arrayList;
        C5206r rVar = (C5206r) this.f16486c.take();
        rVar.mo10293c("cache-queue-take");
        rVar.mo10300j();
        try {
            if (rVar.mo10298h()) {
                rVar.mo10295e("cache-discard-canceled");
                return;
            }
            C5190b a = this.f16487d.mo10260a(rVar.f16514b);
            if (a == null) {
                rVar.mo10293c("cache-miss");
                if (!this.f16489f.mo10278b(rVar)) {
                    this.f16485a.put(rVar);
                }
                rVar.mo10300j();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a.mo10279a(currentTimeMillis)) {
                rVar.mo10293c("cache-hit-expired");
                rVar.f16522j = a;
                if (!this.f16489f.mo10278b(rVar)) {
                    this.f16485a.put(rVar);
                }
                rVar.mo10300j();
                return;
            }
            rVar.mo10293c("cache-hit");
            byte[] bArr = a.f16474a;
            Map map = a.f16480g;
            if (map == null) {
                list = null;
            } else {
                if (map.isEmpty()) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new C5199k((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                list = arrayList;
            }
            C5210v a2 = rVar.mo10267a(new C5202n(200, bArr, map, list, false));
            rVar.mo10293c("cache-hit-parsed");
            if (!a2.mo10305a()) {
                rVar.mo10293c("cache-parsing-failed");
                this.f16487d.mo10263d(rVar.f16514b);
                rVar.f16522j = null;
                if (!this.f16489f.mo10278b(rVar)) {
                    this.f16485a.put(rVar);
                }
                rVar.mo10300j();
                return;
            }
            if (a.f16479f < currentTimeMillis) {
                rVar.mo10293c("cache-hit-refresh-needed");
                rVar.f16522j = a;
                a2.f16540d = true;
                if (!this.f16489f.mo10278b(rVar)) {
                    this.f16490g.mo10286b(rVar, a2, new C5192d(this, rVar));
                } else {
                    this.f16490g.mo10286b(rVar, a2, (Runnable) null);
                }
            } else {
                this.f16490g.mo10286b(rVar, a2, (Runnable) null);
            }
            rVar.mo10300j();
        } finally {
            rVar.mo10300j();
        }
    }

    /* renamed from: a */
    public final void mo10281a() {
        this.f16488e = true;
        interrupt();
    }

    public final void run() {
        if (f16484b) {
            C5188ab.m14150e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f16487d.mo10261b();
        while (true) {
            try {
                m14158b();
            } catch (InterruptedException unused) {
                if (this.f16488e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C5188ab.m14148c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
