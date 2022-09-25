package com.google.android.libraries.p1963i.p1968d;

import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.i.d.j */
/* compiled from: PG */
public final class C23897j implements C23896i {

    /* renamed from: b */
    private final Map f65371b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C23894g f65372c;

    /* renamed from: d */
    private final AtomicInteger f65373d;

    /* renamed from: e */
    private final AtomicInteger f65374e;

    /* renamed from: f */
    private volatile C23892e f65375f;

    public C23897j(C23894g gVar) {
        new ConcurrentHashMap();
        this.f65373d = new AtomicInteger();
        this.f65374e = new AtomicInteger();
        this.f65372c = gVar;
        this.f65375f = C23892e.f65369d;
    }

    /* renamed from: a */
    public final void mo29305a() {
        this.f65374e.getAndIncrement();
    }

    /* renamed from: b */
    public final void mo29306b() {
        this.f65373d.getAndIncrement();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo29307c(long j) {
        C23893f fVar = (C23893f) this.f65371b.remove(Long.valueOf(j));
        if (fVar != null) {
            int a = fVar.mo29289a();
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                C23892e a2 = C23891d.m44463a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", new Object[]{Integer.valueOf(a)})));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a2 != C23892e.f65369d) {
                    C23888a aVar = (C23888a) this.f65375f;
                    C23888a aVar2 = (C23888a) a2;
                    this.f65375f = new C23888a(aVar.f65358a + aVar2.f65358a, aVar.f65359b + aVar2.f65359b, aVar.f65360c + aVar2.f65360c);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo29308d(long j) {
        Map map = this.f65371b;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            long j2 = j;
            this.f65371b.put(valueOf, new C23889b(Process.myTid(), j2, Thread.currentThread().getName(), ((C23890c) this.f65372c).f65365a));
        }
    }
}
