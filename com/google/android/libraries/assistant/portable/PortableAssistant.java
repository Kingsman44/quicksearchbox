package com.google.android.libraries.assistant.portable;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123533g;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a.C123102ap;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a.C123103aq;
import com.google.android.libraries.assistant.gallium.framework.AndroidSystraceCppTracerProvider;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.C18307j;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18221a;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18227e;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18228f;
import com.google.android.libraries.assistant.gallium.framework.p1511d.C18236e;
import com.google.android.libraries.assistant.gallium.p1503a.p1504a.C18193d;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3989p.p3990a.C53048j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5003f.p5004a.C64845a;
import com.google.protos.p4985f.p5003f.p5004a.C64849e;
import com.google.protos.p4985f.p5003f.p5004a.C64852h;
import com.google.protos.p4985f.p5003f.p5004a.C64853i;
import com.google.protos.p4985f.p5030q.C65157dr;
import com.google.protos.p4985f.p5030q.C65180en;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65221ga;
import com.google.protos.p4985f.p5030q.C65222gb;
import com.google.protos.p4985f.p5030q.C65234gn;
import com.google.protos.p4985f.p5030q.C65249hb;
import com.google.protos.p4985f.p5030q.C65250hc;
import com.google.protos.p4985f.p5030q.C65255hh;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65699y;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.BiFunction;

/* compiled from: PG */
public class PortableAssistant implements C46675m {

    /* renamed from: a */
    public static final C59071e f53431a = C59071e.m91332i("com.google.android.libraries.assistant.portable.PortableAssistant");

    /* renamed from: b */
    public final ReentrantReadWriteLock f53432b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public long f53433c;

    /* renamed from: d */
    public final boolean f53434d;

    /* renamed from: e */
    public C18217au f53435e = null;

    /* renamed from: f */
    public long f53436f = 0;

    /* renamed from: g */
    public final Executor f53437g;

    /* renamed from: h */
    public final Map f53438h = new ConcurrentHashMap();

    /* renamed from: i */
    public final AtomicInteger f53439i = new AtomicInteger();

    /* renamed from: j */
    public Optional f53440j = Optional.empty();

    public PortableAssistant(C18307j jVar, C123102ap apVar, Executor executor) {
        C58485gu guVar;
        this.f53437g = executor;
        this.f53434d = false;
        this.f53433c = m36466j(jVar);
        C19097e eVar = new C19097e(this);
        C123103aq aqVar = apVar.f340726a;
        C18226d dVar = apVar.f340727b;
        C123533g gVar = aqVar.f340729b;
        try {
            C18227e l = C18228f.m35519l();
            l.mo23710e(gVar.f341356a.mo105904a());
            ((C18221a) l).f51758c = new PopCppDeploymentConfigProvider(jVar);
            ((C18221a) l).f51757b = eVar;
            if (jVar != null) {
                ((C18221a) l).f51759d = jVar;
                l.mo23708c(gVar.f341362g);
                l.mo23709d(gVar.f341357b);
                ((C18221a) l).f51756a = new AndroidSystraceCppTracerProvider();
                ((C18221a) l).f51763h = Optional.m71637of(gVar.f341359d);
                l.mo23707b(gVar.f341360e);
                if (gVar.f341361f) {
                    guVar = C58485gu.m89846n(new C18236e(gVar.f341358c));
                } else {
                    guVar = C58485gu.m89845m();
                }
                ((C18221a) l).f51761f = C58485gu.m89842j(guVar);
                GalliumIpc galliumIpc = (GalliumIpc) dVar.mo23711a(l.mo23706a());
                if (galliumIpc != null) {
                    byte[] nativeStartAllAgents = galliumIpc.nativeStartAllAgents(galliumIpc.f51691d);
                    C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, nativeStartAllAgents, C62921ba.m95368a());
                    int i = yVar.f178503b;
                    if (i != 0) {
                        throw C18218av.m35478a(i, yVar.f178504c);
                    }
                }
                this.f53440j = Optional.m71637of(galliumIpc);
                return;
            }
            throw new NullPointerException("Null cppResourceLoader");
        } catch (C62974ct | NullPointerException e) {
            throw C18218av.m35482e(e);
        } catch (C18218av e2) {
            C39141kp kpVar = gVar.f341359d;
            ((C19567d) kpVar.f103046r.mo6453a()).mo24822a(1, gVar.f341360e, Integer.valueOf(e2.f51741a.f178503b));
            throw e2;
        }
    }

    /* renamed from: i */
    public static C64853i m36465i(C53048j jVar, GalliumIpc galliumIpc) {
        C64852h hVar = (C64852h) C64853i.f175746e.createBuilder();
        hVar.copyOnWrite();
        C64853i iVar = (C64853i) hVar.instance;
        iVar.f175749a |= 4;
        iVar.f175752d = false;
        hVar.copyOnWrite();
        C64853i iVar2 = (C64853i) hVar.instance;
        jVar.getClass();
        iVar2.f175751c = jVar;
        iVar2.f175749a |= 2;
        try {
            C64849e eVar = (C64849e) galliumIpc.f51690c.mo23693b(C64845a.f175734b);
            hVar.copyOnWrite();
            C64853i iVar3 = (C64853i) hVar.instance;
            eVar.getClass();
            iVar3.f175750b = eVar;
            iVar3.f175749a |= 1;
        } catch (C18218av e) {
            C59104x b = f53431a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "POP");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(47528)).mo56386p("Fail to resolve DebugLogSinkService");
        }
        return (C64853i) hVar.build();
    }

    /* renamed from: j */
    private static long m36466j(C18307j jVar) {
        try {
            C65157dr drVar = (C65157dr) C62942bv.parseFrom((C62942bv) C65157dr.f176335c, nativeCreate(jVar.mo23655a()), C62921ba.m95368a());
            int i = drVar.f176337a;
            if (i == 1) {
                C56488d dVar = (C56488d) drVar.f176338b;
                throw C18218av.m35478a(dVar.f150878a, dVar.f150879b);
            } else if (i == 2) {
                return ((Long) drVar.f176338b).longValue();
            } else {
                return 0;
            }
        } catch (C62974ct e) {
            throw C18218av.m35482e(e);
        }
    }

    private static native byte[] nativeCreate(long j);

    public static native void nativeDestroy(long j);

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(f121943k);
        }
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.TEXT);
        aVar.mo50684b(oVar.mo50699c());
        C60870cx f = mo24260f(new C19103k(oVar));
        C19104l lVar = new C19104l(aVar);
        return C60922j.m93044g(f, C47810es.m84963c(lVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C18238f mo24256b() {
        C18238f fVar = new C18238f();
        C19053ab e = mo24259e();
        try {
            C18217au auVar = this.f53435e;
            if (auVar != null) {
                fVar.mo23736b(auVar);
            }
            e.close();
            return fVar;
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final GalliumIpc mo24257c() {
        C19053ab e = mo24259e();
        try {
            if (this.f53433c != 0) {
                GalliumIpc galliumIpc = (GalliumIpc) this.f53440j.orElseThrow(C19098f.f53559a);
                e.close();
                return galliumIpc;
            }
            throw new C19052aa("PortableAssistant is destroyed.");
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C18217au mo24258d(C65191ey eyVar, C18207ak akVar, GalliumIpc galliumIpc) {
        C65180en enVar = eyVar.f176437l;
        if (enVar == null) {
            enVar = C65180en.f176389b;
        }
        C18217au f = galliumIpc.mo23662f(enVar.f176391a, akVar, new C19101i(this, eyVar));
        this.f53439i.incrementAndGet();
        return new C19054ac(f, this.f53439i);
    }

    /* renamed from: e */
    public final C19053ab mo24259e() {
        return new C19053ab(this.f53432b.readLock());
    }

    /* renamed from: f */
    public final C60870cx mo24260f(BiFunction biFunction) {
        try {
            GalliumIpc c = mo24257c();
            C65682h hVar = ((C65234gn) c.f51690c.mo23693b(C65221ga.f176505a)).f176525b;
            if (hVar == null) {
                hVar = C65682h.f178459f;
            }
            return (C60870cx) biFunction.apply(new C65222gb(c, hVar), mo24256b());
        } catch (C18218av | C19052aa e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: g */
    public final C60870cx mo24261g(C65191ey eyVar, C18207ak akVar, C53048j jVar, BiFunction biFunction) {
        C19053ab e;
        try {
            e = mo24259e();
            GalliumIpc c = mo24257c();
            C65682h hVar = ((C65255hh) c.f51690c.mo23693b(C65249hb.f176552a)).f176561b;
            if (hVar == null) {
                hVar = C65682h.f178459f;
            }
            C65250hc hcVar = new C65250hc(c, hVar);
            C18217au d = mo24258d(eyVar, akVar, c);
            C18238f fVar = new C18238f();
            fVar.mo23736b(d);
            C62940bt btVar = C64853i.f175747f;
            C58976aa aaVar = C58975e.f156826a;
            fVar.f51797a.mo58885m(btVar, m36465i(jVar, c));
            C60870cx cxVar = (C60870cx) biFunction.apply(hcVar, fVar);
            C18193d.m35416a(cxVar, new C19113u(d), new C19114v(d), this.f53437g);
            e.close();
            return cxVar;
        } catch (C18218av | C19052aa e2) {
            return C60856cj.m92899h(e2);
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final Optional mo24262h() {
        C19053ab e = mo24259e();
        try {
            Optional optional = this.f53440j;
            e.close();
            return optional;
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }

    public PortableAssistant(C18307j jVar, Executor executor, GalliumIpc galliumIpc, C18207ak akVar) {
        this.f53437g = executor;
        this.f53440j = Optional.m71637of(galliumIpc);
        this.f53434d = true;
        long j = m36466j(jVar);
        this.f53433c = j;
        this.f53436f = PopBaseCppRegistry.nativeSetupPopNativeInterfaces(j);
        this.f53435e = galliumIpc.mo23662f(Long.MAX_VALUE, akVar, new C19106n(this));
    }
}
