package com.google.android.libraries.assistant.gallium.framework.ipc.p1513b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65670ay;
import com.google.protos.p5127o.C65673ba;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65695u;
import com.google.protos.p5127o.C65699y;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.b.n */
/* compiled from: PG */
public abstract class C18294n implements C18287g {

    /* renamed from: a */
    private final ReentrantReadWriteLock f51901a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private C58833ax f51902b = C58836b.f156633a;

    /* renamed from: c */
    public final ReentrantReadWriteLock f51903c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public C58833ax f51904d = C58836b.f156633a;

    /* renamed from: e */
    public C60870cx f51905e = C60866ct.f164955a;

    /* renamed from: f */
    public final AtomicBoolean f51906f = new AtomicBoolean(true);

    /* renamed from: g */
    public final ArrayDeque f51907g = new ArrayDeque();

    /* renamed from: h */
    public final C18231d f51908h;

    /* renamed from: i */
    public final String f51909i;

    /* renamed from: j */
    public final C18238f f51910j;

    /* renamed from: k */
    public final String f51911k;

    /* renamed from: l */
    public final C63010eb f51912l;

    /* renamed from: m */
    private final ArrayDeque f51913m = new ArrayDeque();

    public C18294n(C18231d dVar, String str, C18238f fVar, String str2, C63010eb ebVar) {
        this.f51908h = dVar;
        this.f51909i = str;
        this.f51910j = fVar;
        this.f51911k = str2;
        this.f51912l = ebVar;
    }

    /* renamed from: b */
    public abstract void mo23751b(C65699y yVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo23753c(C65682h hVar, C65699y yVar) {
        C18238f fVar = this.f51910j;
        C62940bt btVar = C65674bb.f178443d;
        C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
        ayVar.copyOnWrite();
        C65674bb bbVar = (C65674bb) ayVar.instance;
        bbVar.f178446b = 3;
        bbVar.f178445a |= 1;
        fVar.f51797a.mo58885m(btVar, (C65674bb) ayVar.build());
        return C60922j.m93045h(this.f51908h.mo23657a(C18231d.f51786a, hVar, this.f51909i, yVar, "type.googleapis.com/gallium.Status", C63070h.f170215c.getParserForType(), this.f51910j), C47810es.m84966f(C18293m.f51900a), this.f51908h.mo23659c());
    }

    public void close() {
    }

    /* renamed from: d */
    public final C60870cx mo23754d() {
        return mo23750a(C18219aw.m35484b());
    }

    /* renamed from: e */
    public final C60870cx mo23755e(C58817ah ahVar) {
        C60870cx a;
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.f51901a.writeLock().lock();
        try {
            if (!this.f51913m.isEmpty()) {
                a = C60856cj.m92900i((MessageLite) this.f51913m.remove());
                reentrantReadWriteLock = this.f51901a;
            } else if (this.f51902b.mo56113h()) {
                a = C60856cj.m92899h(C18218av.m35478a(11, "Stream is no longer readable."));
                reentrantReadWriteLock = this.f51901a;
            } else {
                a = C2169h.m6027a(new C18288h(this));
                reentrantReadWriteLock = this.f51901a;
            }
            reentrantReadWriteLock.writeLock().unlock();
            C18291k kVar = new C18291k(this, ahVar);
            return C60922j.m93045h(a, C47810es.m84966f(kVar), this.f51908h.mo23659c());
        } catch (Throwable th) {
            this.f51901a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final C60870cx mo23756f(MessageLite messageLite) {
        C60870cx h;
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.f51903c.writeLock().lock();
        try {
            if (!this.f51906f.get()) {
                h = C60856cj.m92899h(C18218av.m35478a(9, "The stream is not writeable."));
                reentrantReadWriteLock = this.f51903c;
            } else {
                C60870cx cxVar = this.f51905e;
                C18292l lVar = new C18292l(this, messageLite);
                h = C60922j.m93045h(cxVar, C47810es.m84966f(lVar), this.f51908h.mo23659c());
                this.f51905e = h;
                reentrantReadWriteLock = this.f51903c;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return h;
        } catch (Throwable th) {
            this.f51903c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo23757g() {
        this.f51906f.set(false);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo23758h(C65693s sVar) {
        Object obj;
        this.f51901a.readLock().lock();
        try {
            if (!this.f51902b.mo56113h()) {
                this.f51901a.readLock().unlock();
                C65695u uVar = sVar.f178490c;
                if (uVar == null) {
                    uVar = C65695u.f178492a;
                }
                C62940bt r1 = C62942bv.checkIsLite(C65674bb.f178443d);
                uVar.mo58887l(r1);
                Object l = uVar.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                int a = C65673ba.m96777a(((C65674bb) obj).f178446b);
                if (a != 0 && a == 4) {
                    mo23751b((C65699y) C18214ar.m35469b(sVar, C65699y.f178500e.getParserForType()));
                    return;
                }
                MessageLite b = C18214ar.m35469b(sVar, this.f51912l);
                this.f51901a.writeLock().lock();
                try {
                    if (!this.f51907g.isEmpty()) {
                        ((C2164c) this.f51907g.remove()).mo5437b(b);
                        return;
                    }
                    this.f51913m.add(b);
                    this.f51901a.writeLock().unlock();
                } finally {
                    this.f51901a.writeLock().unlock();
                }
            } else {
                throw C18218av.m35478a(9, "New message after stream close is not allowed.");
            }
        } catch (Throwable th) {
            this.f51901a.readLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo23759i(C65682h hVar) {
        this.f51903c.writeLock().lock();
        try {
            this.f51904d = C58833ax.m90834k(hVar);
        } finally {
            this.f51903c.writeLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        throw r3;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23760j(com.google.protos.p5127o.C65699y r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f51901a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x005b }
            r2.f51902b = r3     // Catch:{ all -> 0x005b }
        L_0x000f:
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.f51901a     // Catch:{ all -> 0x005b }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()     // Catch:{ all -> 0x005b }
            r3.lock()     // Catch:{ all -> 0x005b }
            java.util.ArrayDeque r3 = r2.f51907g     // Catch:{ all -> 0x0050 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0033
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.f51901a     // Catch:{ all -> 0x005b }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()     // Catch:{ all -> 0x005b }
            r3.unlock()     // Catch:{ all -> 0x005b }
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.f51901a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.unlock()
            return
        L_0x0033:
            java.util.ArrayDeque r3 = r2.f51907g     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.remove()     // Catch:{ all -> 0x0050 }
            androidx.d.a.c r3 = (androidx.p104d.p105a.C2164c) r3     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Stream is no longer readable."
            r1 = 11
            com.google.android.libraries.assistant.gallium.framework.av r0 = com.google.android.libraries.assistant.gallium.framework.C18218av.m35478a(r1, r0)     // Catch:{ all -> 0x0050 }
            r3.mo5439d(r0)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.f51901a     // Catch:{ all -> 0x005b }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()     // Catch:{ all -> 0x005b }
            r3.unlock()     // Catch:{ all -> 0x005b }
            goto L_0x000f
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f51901a     // Catch:{ all -> 0x005b }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch:{ all -> 0x005b }
            r0.unlock()     // Catch:{ all -> 0x005b }
            throw r3     // Catch:{ all -> 0x005b }
        L_0x005b:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f51901a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            goto L_0x0067
        L_0x0066:
            throw r3
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18294n.mo23760j(com.google.protos.o.y):void");
    }
}
