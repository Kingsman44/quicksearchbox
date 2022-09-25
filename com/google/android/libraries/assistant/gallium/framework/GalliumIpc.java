package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.assistant.gallium.framework.ipc.internal.C18306g;
import com.google.android.libraries.assistant.gallium.framework.ipc.internal.CppBackedObjectImpl;
import com.google.android.libraries.assistant.gallium.framework.ipc.internal.CppToJavaLinkImpl;
import com.google.android.libraries.assistant.gallium.framework.ipc.internal.JavaToCppLinkImpl;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18296p;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65646aa;
import com.google.protos.p5127o.C65647ab;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65650ae;
import com.google.protos.p5127o.C65651af;
import com.google.protos.p5127o.C65669ax;
import com.google.protos.p5127o.C65677c;
import com.google.protos.p5127o.C65678d;
import com.google.protos.p5127o.C65680f;
import com.google.protos.p5127o.C65681g;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65684j;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65687m;
import com.google.protos.p5127o.C65688n;
import com.google.protos.p5127o.C65690p;
import com.google.protos.p5127o.C65691q;
import com.google.protos.p5127o.C65692r;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65695u;
import com.google.protos.p5127o.C65699y;
import com.google.protos.p5127o.C65700z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public class GalliumIpc extends C18309l {

    /* renamed from: h */
    public static final /* synthetic */ int f51688h = 0;

    /* renamed from: b */
    private final C18207ak f51689b;

    /* renamed from: c */
    public final C18208al f51690c;

    /* renamed from: d */
    public final long f51691d;

    /* renamed from: e */
    protected final C18306g f51692e;

    /* renamed from: f */
    public final C18307j f51693f;

    /* renamed from: g */
    public final Executor f51694g;

    /* renamed from: i */
    private final C18203ag f51695i = new C18203ag(new LinkedHashMap());

    /* renamed from: j */
    private final List f51696j;

    /* renamed from: k */
    private final AtomicLong f51697k;

    /* renamed from: l */
    private final ConcurrentHashMap f51698l;

    /* renamed from: m */
    private final ReentrantReadWriteLock f51699m;

    /* renamed from: n */
    private final ReentrantReadWriteLock f51700n;

    /* renamed from: o */
    private final Optional f51701o;

    /* renamed from: p */
    private final C58889cz f51702p;

    /* renamed from: q */
    private boolean f51703q;

    /* renamed from: r */
    private volatile boolean f51704r;

    public GalliumIpc(C18208al alVar, C18207ak akVar, long j, C18306g gVar, C18307j jVar, Executor executor, List list, Optional optional, C58889cz czVar) {
        new ConcurrentHashMap();
        this.f51697k = new AtomicLong(0);
        this.f51698l = new ConcurrentHashMap();
        this.f51699m = new ReentrantReadWriteLock();
        this.f51700n = new ReentrantReadWriteLock();
        this.f51703q = false;
        this.f51704r = false;
        this.f51690c = alVar;
        this.f51689b = akVar;
        this.f51691d = j;
        this.f51692e = gVar;
        this.f51693f = jVar;
        this.f51694g = executor;
        this.f51696j = list;
        this.f51701o = optional;
        this.f51702p = czVar;
    }

    /* renamed from: h */
    public static C60870cx m35422h(Iterator it, C65651af afVar, C18200ad adVar) {
        C60870cx cxVar;
        Long l;
        C18206aj ajVar;
        Object obj;
        if (it.hasNext()) {
            return ((C18201ae) it.next()).mo23678a(afVar, new C18321x(it, adVar));
        }
        GalliumIpc galliumIpc = ((C18314q) adVar).f51952a;
        C65678d dVar = afVar.f178391b;
        if (dVar == null) {
            dVar = C65678d.f178449e;
        }
        C65693s sVar = afVar.f178392c;
        if (sVar == null) {
            sVar = C65693s.f178486d;
        }
        C65682h hVar = dVar.f178452b;
        if (hVar == null) {
            hVar = C65682h.f178459f;
        }
        if ((hVar.f178461a & 8) != 0) {
            ConcurrentHashMap concurrentHashMap = galliumIpc.f51698l;
            C65682h hVar2 = dVar.f178452b;
            if (hVar2 == null) {
                hVar2 = C65682h.f178459f;
            }
            C65646aa aaVar = hVar2.f178465e;
            if (aaVar == null) {
                aaVar = C65646aa.f178376c;
            }
            C18297q qVar = (C18297q) concurrentHashMap.get(Long.valueOf(aaVar.f178379b));
            if (qVar == null) {
                throw C18218av.m35478a(5, "Invalid stream_endpoint_id for handle");
            } else if (qVar.f51916a.mo56113h()) {
                ((C18296p) qVar.f51916a.mo56107c()).mo23740a(sVar);
                cxVar = C60856cj.m92900i(C18214ar.m35470c(C62912at.f169862a, "type.googleapis.com/google.protobuf.Empty"));
            } else {
                throw C18218av.m35478a(13, "Missing handler for streaming message.");
            }
        } else {
            C65682h hVar3 = dVar.f178452b;
            if (((hVar3 == null ? C65682h.f178459f : hVar3).f178461a & 4) != 0) {
                C18203ag agVar = galliumIpc.f51695i;
                if (hVar3 == null) {
                    hVar3 = C65682h.f178459f;
                }
                if (agVar.f51727a.containsKey(hVar3)) {
                    C18202af afVar2 = (C18202af) agVar.f51727a.get(hVar3);
                    cxVar = afVar2.mo23681a().mo23683a(afVar2.mo23682b(), galliumIpc, dVar.f178453c, sVar);
                } else {
                    C65686l lVar = hVar3.f178462b;
                    if (lVar == null) {
                        lVar = C65686l.f178470d;
                    }
                    String d = C18214ar.m35471d(lVar);
                    C65684j jVar = hVar3.f178464d;
                    if (jVar == null) {
                        jVar = C65684j.f178466b;
                    }
                    long j = jVar.f178468a;
                    throw C18218av.m35478a(5, "Native interface instance not found for handle: " + d + " instance id:" + j);
                }
            } else {
                C65695u uVar = sVar.f178490c;
                if (uVar == null) {
                    uVar = C65695u.f178492a;
                }
                C62940bt r1 = C62942bv.checkIsLite(C65669ax.f178435d);
                uVar.mo58887l(r1);
                if (uVar.f169962ag.mo58857o(r1.f169971d)) {
                    C65695u uVar2 = sVar.f178490c;
                    if (uVar2 == null) {
                        uVar2 = C65695u.f178492a;
                    }
                    C62940bt r12 = C62942bv.checkIsLite(C65669ax.f178435d);
                    uVar2.mo58887l(r12);
                    Object l2 = uVar2.f169962ag.mo58854l(r12.f169971d);
                    if (l2 == null) {
                        obj = r12.f169969b;
                    } else {
                        obj = r12.mo58889c(l2);
                    }
                    l = Long.valueOf(((C65669ax) obj).f178438b);
                } else {
                    l = null;
                }
                C18207ak akVar = galliumIpc.f51689b;
                C65682h hVar4 = dVar.f178452b;
                if (hVar4 == null) {
                    hVar4 = C65682h.f178459f;
                }
                C65686l lVar2 = hVar4.f178462b;
                if (lVar2 == null) {
                    lVar2 = C65686l.f178470d;
                }
                if (akVar.f51728a.containsKey(lVar2)) {
                    ajVar = (C18206aj) akVar.f51728a.get(lVar2);
                } else if (akVar.f51729b.mo23700d(lVar2)) {
                    ajVar = akVar.f51729b.mo23696a(lVar2, l);
                } else {
                    String d2 = C18214ar.m35471d(lVar2);
                    throw C18218av.m35478a(3, "Native interface provider not found for interface " + d2 + ".");
                }
                cxVar = ajVar.mo23688a().mo23683a(ajVar.mo23689b().mo23694a(galliumIpc), galliumIpc, dVar.f178453c, sVar);
            }
        }
        return C60922j.m93044g(C60838bs.m92859i(cxVar), C18313p.f51951a, C60826bg.f164896a);
    }

    /* renamed from: i */
    public static C60870cx m35423i(Iterator it, C65651af afVar, C18200ad adVar) {
        if (it.hasNext()) {
            return ((C18201ae) it.next()).mo23679b(afVar, new C18317t(it, adVar));
        }
        C18306g gVar = ((C18197aa) adVar).f51722a;
        SettableFuture settableFuture = new SettableFuture();
        long andIncrement = gVar.f51941b.getAndIncrement();
        gVar.f51942c.put(Long.valueOf(andIncrement), settableFuture);
        C65647ab abVar = (C65647ab) C65648ac.f178380e.createBuilder();
        abVar.copyOnWrite();
        C65648ac acVar = (C65648ac) abVar.instance;
        acVar.f178382a |= 8;
        acVar.f178385d = andIncrement;
        abVar.copyOnWrite();
        C65648ac acVar2 = (C65648ac) abVar.instance;
        afVar.getClass();
        acVar2.f178384c = afVar;
        acVar2.f178383b = 1;
        try {
            gVar.f51946g.mo23766a((C65648ac) abVar.build());
        } catch (C18218av e) {
            SettableFuture settableFuture2 = (SettableFuture) gVar.f51942c.remove(Long.valueOf(andIncrement));
            if (settableFuture2 != null) {
                settableFuture2.mo57357o(e);
                return settableFuture;
            }
        }
        return settableFuture;
    }

    /* renamed from: k */
    public static C60870cx m35424k(byte[] bArr) {
        try {
            C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, bArr, C62921ba.m95368a());
            if (yVar.f178503b == 0) {
                return C60866ct.f164955a;
            }
            return C60856cj.m92899h(new C18218av(yVar));
        } catch (C62974ct | NullPointerException e) {
            return C60856cj.m92899h(e);
        }
    }

    private native byte[] nativeAddKeepRunning(long j, byte[] bArr);

    protected static native long nativeGetCppToJavaLinkPointer(long j);

    protected static native long nativeGetJavaToCppLinkPointer(long j);

    private native long nativeRegisterCppSpanScope(long j, long j2, long j3);

    private native byte[] nativeRemoveKeepRunning(long j, byte[] bArr);

    private native byte[] nativeRemoveKeepRunningTransitively(long j, byte[] bArr);

    public static native byte[] nativeSetupGalliumIpc(byte[] bArr, long j, byte[] bArr2, long j2, long j3, boolean z, boolean z2);

    private native void nativeShutDownGalliumIpcEnvironment(long j);

    private native void nativeTeardownGalliumIpc(long j);

    /* renamed from: o */
    private static C60870cx m35425o() {
        return C60856cj.m92899h(C18218av.m35478a(10, "Gallium Environment is disposed."));
    }

    /* renamed from: p */
    private static C60870cx m35426p() {
        return C60856cj.m92899h(C18218av.m35478a(10, "Gallium Environment is being disposed."));
    }

    /* renamed from: q */
    private static C65691q m35427q(C65680f fVar) {
        C65690p pVar = (C65690p) C65691q.f178480e.createBuilder();
        pVar.copyOnWrite();
        C65691q qVar = (C65691q) pVar.instance;
        fVar.getClass();
        qVar.f178484c = fVar;
        qVar.f178483b = 2;
        C65687m mVar = (C65687m) C65688n.f178475c.createBuilder();
        mVar.copyOnWrite();
        C65688n nVar = (C65688n) mVar.instance;
        nVar.f178478b = 2;
        nVar.f178477a |= 1;
        pVar.copyOnWrite();
        C65691q qVar2 = (C65691q) pVar.instance;
        C65688n nVar2 = (C65688n) mVar.build();
        nVar2.getClass();
        qVar2.f178485d = nVar2;
        qVar2.f178482a |= 4;
        return (C65691q) pVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23657a(C65680f fVar, C65682h hVar, String str, MessageLite messageLite, String str2, C63010eb ebVar, C18238f fVar2) {
        C58872ci d = C58872ci.m90947d(this.f51702p);
        C60870cx h = C60922j.m93045h(C60838bs.m92859i(mo23665m(fVar, hVar, str, messageLite.toByteString(), str2, fVar2.mo23735a())), new C18322y(ebVar), C60826bg.f164896a);
        this.f51701o.ifPresent(new C18320w(d.mo56158a(TimeUnit.MICROSECONDS)));
        return h;
    }

    /* renamed from: b */
    public final C65682h mo23658b(C65682h hVar, C18297q qVar) {
        long andIncrement = this.f51697k.getAndIncrement();
        this.f51698l.put(Long.valueOf(andIncrement), qVar);
        C65681g gVar = (C65681g) hVar.toBuilder();
        C65691q q = m35427q(f51786a);
        gVar.copyOnWrite();
        C65682h hVar2 = (C65682h) gVar.instance;
        q.getClass();
        hVar2.f178463c = q;
        hVar2.f178461a |= 2;
        C65700z zVar = (C65700z) C65646aa.f178376c.createBuilder();
        zVar.copyOnWrite();
        C65646aa aaVar = (C65646aa) zVar.instance;
        aaVar.f178378a |= 1;
        aaVar.f178379b = andIncrement;
        gVar.copyOnWrite();
        C65682h hVar3 = (C65682h) gVar.instance;
        C65646aa aaVar2 = (C65646aa) zVar.build();
        aaVar2.getClass();
        hVar3.f178465e = aaVar2;
        hVar3.f178461a |= 8;
        return (C65682h) gVar.build();
    }

    /* renamed from: c */
    public final Executor mo23659c() {
        return this.f51694g;
    }

    /* renamed from: d */
    public final void mo23660d(C65682h hVar) {
        ConcurrentHashMap concurrentHashMap = this.f51698l;
        C65646aa aaVar = hVar.f178465e;
        if (aaVar == null) {
            aaVar = C65646aa.f178376c;
        }
        concurrentHashMap.remove(Long.valueOf(aaVar.f178379b));
    }

    /* renamed from: e */
    public final C18208al mo23661e() {
        return this.f51690c;
    }

    /* renamed from: f */
    public final C18217au mo23662f(long j, C18207ak akVar, C18240h hVar) {
        if (this.f51699m.readLock().tryLock()) {
            try {
                if (!this.f51704r) {
                    long j2 = 0;
                    if (hVar != null) {
                        long nativeRegisterCppSpanScope = nativeRegisterCppSpanScope(this.f51691d, j, hVar.mo23737a());
                        if (nativeRegisterCppSpanScope != 0) {
                            j2 = nativeRegisterCppSpanScope;
                        } else {
                            throw C18218av.m35478a(13, "Failed to register C++ span-scoped interface.");
                        }
                    }
                    C18216at atVar = this.f51689b.f51729b;
                    HashMap hashMap = new HashMap(akVar.f51728a);
                    if (hashMap.keySet().equals(atVar.f51740b)) {
                        synchronized (atVar) {
                            Map map = atVar.f51739a;
                            Long valueOf = Long.valueOf(j);
                            if (!map.containsKey(valueOf)) {
                                atVar.f51739a.put(valueOf, hashMap);
                            } else {
                                throw C18218av.m35478a(3, String.format("Span %d is already registered.", new Object[]{valueOf}));
                            }
                        }
                        C18199ac acVar = new C18199ac(this, new C18215as(atVar, j), j2);
                        this.f51699m.readLock().unlock();
                        return acVar;
                    }
                    throw C18218av.m35478a(3, String.format("Expected interface ids: %s\nProvided interface ids: %s\n", new Object[]{atVar.f51740b, hashMap.keySet()}));
                }
                throw new IllegalStateException("Gallium Environment is disposed.");
            } catch (Exception e) {
                try {
                    throw C18218av.m35482e(e);
                } catch (Throwable th) {
                    this.f51699m.readLock().unlock();
                    throw th;
                }
            }
        } else {
            throw new IllegalStateException("Gallium Environment is being disposed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C60870cx mo23663j(C65651af afVar) {
        C60870cx h;
        ReentrantReadWriteLock reentrantReadWriteLock;
        if (!this.f51700n.readLock().tryLock()) {
            return m35426p();
        }
        try {
            if (this.f51704r) {
                h = m35425o();
                reentrantReadWriteLock = this.f51700n;
            } else {
                h = C60846c.m92878g(C60838bs.m92859i(m35422h(this.f51696j.iterator(), afVar, new C18314q(this))), Exception.class, C18315r.f51953a, C60826bg.f164896a);
                reentrantReadWriteLock = this.f51700n;
            }
        } catch (Exception e) {
            h = C60856cj.m92899h(C18218av.m35482e(e));
            reentrantReadWriteLock = this.f51700n;
        } catch (Throwable th) {
            this.f51700n.readLock().unlock();
            throw th;
        }
        reentrantReadWriteLock.readLock().unlock();
        return h;
    }

    /* renamed from: l */
    public final C60870cx mo23664l(C65678d dVar, C65693s sVar) {
        C60870cx h;
        ReentrantReadWriteLock reentrantReadWriteLock;
        if (!this.f51699m.readLock().tryLock()) {
            return m35426p();
        }
        try {
            if (this.f51704r) {
                h = m35425o();
                reentrantReadWriteLock = this.f51699m;
            } else {
                C65650ae aeVar = (C65650ae) C65651af.f178388d.createBuilder();
                aeVar.copyOnWrite();
                C65651af afVar = (C65651af) aeVar.instance;
                sVar.getClass();
                afVar.f178392c = sVar;
                afVar.f178390a |= 2;
                aeVar.copyOnWrite();
                C65651af afVar2 = (C65651af) aeVar.instance;
                dVar.getClass();
                afVar2.f178391b = dVar;
                afVar2.f178390a |= 1;
                Iterator it = this.f51696j.iterator();
                C18306g gVar = this.f51692e;
                Objects.requireNonNull(gVar);
                h = C60922j.m93044g(C60838bs.m92859i(m35423i(it, (C65651af) aeVar.build(), new C18197aa(gVar))), C18198ab.f51723a, C60826bg.f164896a);
                reentrantReadWriteLock = this.f51699m;
            }
        } catch (Exception e) {
            h = C60856cj.m92899h(C18218av.m35482e(e));
            reentrantReadWriteLock = this.f51699m;
        } catch (Throwable th) {
            this.f51699m.readLock().unlock();
            throw th;
        }
        reentrantReadWriteLock.readLock().unlock();
        return h;
    }

    /* renamed from: m */
    public final C60870cx mo23665m(C65680f fVar, C65682h hVar, String str, C63088z zVar, String str2, C65695u uVar) {
        C58872ci d = C58872ci.m90947d(this.f51702p);
        for (C18201ae c : this.f51696j) {
            uVar = c.mo23680c(uVar);
        }
        C65692r rVar = (C65692r) C65693s.f178486d.createBuilder();
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        zVar.getClass();
        ((C63070h) gVar.instance).f170218b = zVar;
        gVar.copyOnWrite();
        str2.getClass();
        ((C63070h) gVar.instance).f170217a = str2;
        rVar.copyOnWrite();
        C65693s sVar = (C65693s) rVar.instance;
        C63070h hVar2 = (C63070h) gVar.build();
        hVar2.getClass();
        sVar.f178489b = hVar2;
        sVar.f178488a |= 1;
        rVar.copyOnWrite();
        C65693s sVar2 = (C65693s) rVar.instance;
        uVar.getClass();
        sVar2.f178490c = uVar;
        sVar2.f178488a |= 2;
        C65677c cVar = (C65677c) C65678d.f178449e.createBuilder();
        cVar.copyOnWrite();
        C65678d dVar = (C65678d) cVar.instance;
        hVar.getClass();
        dVar.f178452b = hVar;
        dVar.f178451a |= 1;
        cVar.copyOnWrite();
        C65678d dVar2 = (C65678d) cVar.instance;
        str.getClass();
        dVar2.f178451a |= 2;
        dVar2.f178453c = str;
        C65691q q = m35427q(fVar);
        cVar.copyOnWrite();
        C65678d dVar3 = (C65678d) cVar.instance;
        q.getClass();
        dVar3.f178454d = q;
        dVar3.f178451a |= 4;
        C60870cx l = mo23664l((C65678d) cVar.build(), (C65693s) rVar.build());
        this.f51701o.ifPresent(new C18316s(d.mo56158a(TimeUnit.MICROSECONDS)));
        return l;
    }

    /* renamed from: n */
    public final void mo23666n() {
        JavaToCppLinkImpl javaToCppLinkImpl;
        this.f51699m.writeLock().lock();
        try {
            if (this.f51703q || this.f51704r) {
                throw new IllegalStateException("dispose() can only be called once!");
            }
            this.f51703q = true;
            nativeShutDownGalliumIpcEnvironment(this.f51691d);
            this.f51700n.writeLock().lock();
            try {
                this.f51704r = true;
                for (C18297q qVar : this.f51698l.values()) {
                    if (qVar.f51917b.mo56113h()) {
                        ((Runnable) qVar.f51917b.mo56107c()).run();
                    }
                }
                C18306g gVar = this.f51692e;
                if (gVar != null) {
                    if (!gVar.f51942c.isEmpty()) {
                        ((C59052c) ((C59052c) C18306g.f51940a.mo56226d()).mo56372aa(47082)).mo56387q("dispose() called with %s pending requests.", gVar.f51942c.size());
                    }
                    gVar.f51943d.mo23763a();
                    javaToCppLinkImpl = gVar.f51946g;
                    javaToCppLinkImpl.f51927a.writeLock().lock();
                    if (!javaToCppLinkImpl.f51928b) {
                        javaToCppLinkImpl.f51928b = true;
                        javaToCppLinkImpl.f51929c.mo23761b();
                        javaToCppLinkImpl.f51927a.writeLock().unlock();
                    } else {
                        throw new IllegalStateException("JavaToCppLinkImpl is already disposed!");
                    }
                }
                nativeTeardownGalliumIpc(this.f51691d);
                this.f51693f.mo23656c();
                this.f51700n.writeLock().unlock();
            } catch (Throwable th) {
                this.f51700n.writeLock().unlock();
                throw th;
            }
        } finally {
            this.f51699m.writeLock().unlock();
        }
    }

    public native byte[] nativeAddKeepRunningTransitively(long j, byte[] bArr);

    public native void nativeDestroyCppSpanScope(long j);

    public native byte[] nativePurge(long j);

    public native byte[] nativeStartAllAgents(long j);

    /* renamed from: g */
    public static C18306g m35421g(Runnable runnable, long j, Executor executor) {
        if (j != 0) {
            long nativeGetCppToJavaLinkPointer = nativeGetCppToJavaLinkPointer(j);
            long nativeGetJavaToCppLinkPointer = nativeGetJavaToCppLinkPointer(j);
            JavaToCppLinkImpl javaToCppLinkImpl = new JavaToCppLinkImpl(nativeGetJavaToCppLinkPointer, CppBackedObjectImpl.m35617a(JavaToCppLinkImpl.nativeGetJavaObjectBacker(nativeGetJavaToCppLinkPointer)));
            CppToJavaLinkImpl cppToJavaLinkImpl = new CppToJavaLinkImpl(runnable, nativeGetCppToJavaLinkPointer, CppBackedObjectImpl.m35617a(CppToJavaLinkImpl.nativeGetJavaObjectBacker(nativeGetCppToJavaLinkPointer)));
            cppToJavaLinkImpl.nativeRegisterJavaSide(nativeGetCppToJavaLinkPointer);
            return new C18306g(javaToCppLinkImpl, cppToJavaLinkImpl, executor);
        }
        throw C18218av.m35478a(13, "createJniBridge() called before initializing opaqueHandle.");
    }
}
