package androidx.camera.lifecycle;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f4315a = new Object();

    /* renamed from: b */
    public final Map f4316b = new HashMap();

    /* renamed from: c */
    public final Map f4317c = new HashMap();

    /* renamed from: d */
    private final ArrayDeque f4318d = new ArrayDeque();

    /* compiled from: PG */
    public class LifecycleCameraRepositoryObserver implements C2390u {

        /* renamed from: a */
        public final C2391v f4319a;

        /* renamed from: b */
        private final LifecycleCameraRepository f4320b;

        public LifecycleCameraRepositoryObserver(C2391v vVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f4319a = vVar;
            this.f4320b = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(mo5713a = C2382m.ON_DESTROY)
        public void onDestroy(C2391v vVar) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f4320b;
            synchronized (lifecycleCameraRepository.f4315a) {
                LifecycleCameraRepositoryObserver a = lifecycleCameraRepository.mo4462a(vVar);
                if (a != null) {
                    lifecycleCameraRepository.mo4464c(vVar);
                    for (C1578b remove : (Set) lifecycleCameraRepository.f4317c.get(a)) {
                        lifecycleCameraRepository.f4316b.remove(remove);
                    }
                    lifecycleCameraRepository.f4317c.remove(a);
                    a.f4319a.getLifecycle().mo5791c(a);
                }
            }
        }

        @OnLifecycleEvent(mo5713a = C2382m.ON_START)
        public void onStart(C2391v vVar) {
            this.f4320b.mo4463b(vVar);
        }

        @OnLifecycleEvent(mo5713a = C2382m.ON_STOP)
        public void onStop(C2391v vVar) {
            this.f4320b.mo4464c(vVar);
        }
    }

    /* renamed from: d */
    private final void m4183d(C2391v vVar) {
        synchronized (this.f4315a) {
            LifecycleCameraRepositoryObserver a = mo4462a(vVar);
            if (a != null) {
                for (C1578b bVar : (Set) this.f4317c.get(a)) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f4316b.get(bVar);
                    lifecycleCamera.getClass();
                    lifecycleCamera.mo4456c();
                }
            }
        }
    }

    /* renamed from: e */
    private final void m4184e(C2391v vVar) {
        synchronized (this.f4315a) {
            for (C1578b bVar : (Set) this.f4317c.get(mo4462a(vVar))) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f4316b.get(bVar);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.mo4455b().isEmpty()) {
                    synchronized (lifecycleCamera.f4310a) {
                        if (lifecycleCamera.f4313d) {
                            lifecycleCamera.f4313d = false;
                            if (lifecycleCamera.f4311b.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
                                lifecycleCamera.onStart(lifecycleCamera.f4311b);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final LifecycleCameraRepositoryObserver mo4462a(C2391v vVar) {
        synchronized (this.f4315a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f4317c.keySet()) {
                if (vVar.equals(lifecycleCameraRepositoryObserver.f4319a)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r5.f4318d.isEmpty() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r5.f4318d.push(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r1 = (androidx.lifecycle.C2391v) r5.f4318d.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r6.equals(r1) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        m4183d(r1);
        r5.f4318d.remove(r6);
        r5.f4318d.push(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        m4184e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4463b(androidx.lifecycle.C2391v r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4315a
            monitor-enter(r0)
            java.lang.Object r1 = r5.f4315a     // Catch:{ all -> 0x0070 }
            monitor-enter(r1)     // Catch:{ all -> 0x0070 }
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r2 = r5.mo4462a(r6)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x000e:
            java.util.Map r3 = r5.f4317c     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x006d }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x006d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006d }
        L_0x001a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x006a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006d }
            androidx.camera.lifecycle.b r3 = (androidx.camera.lifecycle.C1578b) r3     // Catch:{ all -> 0x006d }
            java.util.Map r4 = r5.f4316b     // Catch:{ all -> 0x006d }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x006d }
            androidx.camera.lifecycle.LifecycleCamera r3 = (androidx.camera.lifecycle.LifecycleCamera) r3     // Catch:{ all -> 0x006d }
            r3.getClass()
            java.util.List r3 = r3.mo4455b()     // Catch:{ all -> 0x006d }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x006d }
            if (r3 != 0) goto L_0x001a
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque r1 = r5.f4318d     // Catch:{ all -> 0x0070 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x004a
            java.util.ArrayDeque r1 = r5.f4318d     // Catch:{ all -> 0x0070 }
            r1.push(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0065
        L_0x004a:
            java.util.ArrayDeque r1 = r5.f4318d     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r1.peek()     // Catch:{ all -> 0x0070 }
            androidx.lifecycle.v r1 = (androidx.lifecycle.C2391v) r1     // Catch:{ all -> 0x0070 }
            boolean r2 = r6.equals(r1)     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x0065
            r5.m4183d(r1)     // Catch:{ all -> 0x0070 }
            java.util.ArrayDeque r1 = r5.f4318d     // Catch:{ all -> 0x0070 }
            r1.remove(r6)     // Catch:{ all -> 0x0070 }
            java.util.ArrayDeque r1 = r5.f4318d     // Catch:{ all -> 0x0070 }
            r1.push(r6)     // Catch:{ all -> 0x0070 }
        L_0x0065:
            r5.m4184e(r6)     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x006a:
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0073:
            throw r6
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCameraRepository.mo4463b(androidx.lifecycle.v):void");
    }

    /* renamed from: c */
    public final void mo4464c(C2391v vVar) {
        synchronized (this.f4315a) {
            this.f4318d.remove(vVar);
            m4183d(vVar);
            if (!this.f4318d.isEmpty()) {
                m4184e((C2391v) this.f4318d.peek());
            }
        }
    }
}
