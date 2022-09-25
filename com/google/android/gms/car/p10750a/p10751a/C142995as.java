package com.google.android.gms.car.p10750a.p10751a;

import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.C143093ae;
import com.google.android.gms.car.C143094af;
import com.google.android.gms.car.C143101am;
import com.google.android.gms.car.C143107as;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143110av;
import com.google.android.gms.car.C143113ay;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.C143159co;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.p10758a.C143184a;
import com.google.android.gms.car.p10750a.C142974a;
import com.google.android.gms.car.p10750a.C143082b;
import com.google.android.gms.car.p10753b.p10754a.C143116a;
import com.google.android.gms.car.p10755c.p10756a.C143144a;
import com.google.android.gms.car.p10760f.C143270bd;
import com.google.android.gms.car.p10760f.C143271be;
import com.google.android.gms.car.p10760f.C143272bf;
import com.google.android.gms.car.p10760f.C143273bg;
import com.google.android.gms.car.p10760f.C143274bh;
import com.google.android.gms.car.p10760f.C143277bk;
import com.google.android.gms.car.p10760f.C143278bl;
import com.google.android.gms.car.p10760f.C143279bm;
import com.google.android.gms.car.p10760f.C143282bp;
import com.google.android.gms.car.p10760f.p10761a.C143235a;
import com.google.android.gms.car.p10760f.p10761a.C143236b;
import com.google.android.gms.car.p10760f.p10762b.C143264a;
import com.google.android.gms.car.p10760f.p10762b.C143266c;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.car.p10771l.C143327a;
import com.google.common.base.C58854br;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* renamed from: com.google.android.gms.car.a.a.as */
/* compiled from: PG */
public abstract class C142995as implements C142974a, C143266c {

    /* renamed from: a */
    public final C143041ck f388026a = new C143041ck();

    /* renamed from: b */
    final C143082b f388027b;

    /* renamed from: c */
    public final Looper f388028c;

    /* renamed from: d */
    public final C143002az f388029d;

    /* renamed from: e */
    public final AtomicMarkableReference f388030e;

    /* renamed from: f */
    public C143235a f388031f;

    /* renamed from: g */
    private final C143056cz f388032g = new C143056cz(new C142986aj(this), new C142987ak());

    /* renamed from: h */
    private final C143056cz f388033h = new C143056cz(new C142988al(this), new C142989am());

    /* renamed from: i */
    private final C143056cz f388034i = new C143056cz(new C142990an(this), C142991ao.f388022a);

    /* renamed from: j */
    private final C143056cz f388035j = new C143056cz(new C142992ap(this), C142975a.f388004a);

    protected C142995as(Looper looper) {
        C143002az azVar = new C143002az();
        UUID.randomUUID();
        this.f388030e = new AtomicMarkableReference((Object) null, false);
        this.f388031f = new C143235a(C58854br.f156652a);
        this.f388028c = looper;
        this.f388029d = azVar;
        this.f388027b = new C142994ar(this);
    }

    /* renamed from: t */
    private final C61301b mo117940t() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return C61301b.m93812a(name + "@" + hexString);
    }

    /* renamed from: a */
    public final CarInfo mo117914a() {
        return (CarInfo) this.f388031f.mo118275a(new C142981ae(this));
    }

    @Deprecated
    /* renamed from: b */
    public final CarUiInfo mo117915b() {
        return mo117926h(CarDisplayId.f388291a).mo117970a();
    }

    /* renamed from: c */
    public final C143274bh mo117916c() {
        return (C143274bh) this.f388029d.mo117944c(C143274bh.class, new C143061f(this));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.car.C143118bb mo117917d() {
        /*
            r3 = this;
            com.google.android.gms.car.f.a.a r0 = r3.f388031f
            com.google.android.gms.car.a.a.h r1 = new com.google.android.gms.car.a.a.h
            r1.<init>(r3)
            java.lang.Object r0 = r1.call()     // Catch:{ RemoteException -> 0x0010, IllegalStateException -> 0x000e }
            com.google.android.gms.car.bb r0 = (com.google.android.gms.car.C143118bb) r0
            return r0
        L_0x000e:
            r1 = move-exception
            goto L_0x0011
        L_0x0010:
            r1 = move-exception
        L_0x0011:
            boolean r2 = r1 instanceof android.os.RemoteException
            if (r2 == 0) goto L_0x001e
            r2 = r1
            android.os.RemoteException r2 = (android.os.RemoteException) r2
            r0.mo118280f(r2)
            com.google.android.gms.car.p10760f.p10761a.C143236b.m232385c(r2)
        L_0x001e:
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 != 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            r0 = r1
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            com.google.android.gms.car.p10760f.p10761a.C143236b.m232384b(r0)
        L_0x0029:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception"
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C142995as.mo117917d():com.google.android.gms.car.bb");
    }

    /* renamed from: e */
    public final void mo117918e(Intent intent) {
        for (C143093ae aeVar : C143094af.f388168a.values()) {
        }
        this.f388031f.mo118278d(new C143064i(this, intent));
    }

    /* renamed from: g */
    public final int mo117925g(String str, int i) {
        return ((Integer) this.f388031f.mo118277c(new C143062g(this, str, i))).intValue();
    }

    /* renamed from: h */
    public final C143273bg mo117926h(CarDisplayId carDisplayId) {
        return (C143273bg) this.f388031f.mo118275a(new C142979ac(this, carDisplayId));
    }

    /* renamed from: i */
    public final /* synthetic */ C58528ij mo117927i() {
        return C58528ij.m90006F(mo117937s().mo118073p(C58485gu.m89845m()));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo117928j() {
        mo117937s().mo118066i(this.f388026a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo117929k() {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "onClientConnected() %s, registering localCarConnectionListener %s with multiplex listener %s", mo117940t(), C61301b.m93812a(this.f388027b), C61301b.m93812a(this.f388026a));
        }
        this.f388026a.mo117979e(this.f388027b);
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "Registering multiplex listener %s with car service", C61301b.m93812a(this.f388026a));
        }
        C143235a aVar = this.f388031f;
        try {
            new C143003b(this).f388043a.mo117928j();
        } catch (RemoteException e) {
            aVar.mo118280f(e);
        }
    }

    /* renamed from: l */
    public final void mo117930l(C143082b bVar) {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "Registering CarConnectionListener %s with multiplex listener %s", C61301b.m93812a(bVar), C61301b.m93812a(this.f388026a));
        }
        this.f388026a.mo117979e(bVar);
    }

    /* renamed from: m */
    public void mo117931m() {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "tearDown() %s", mo117940t());
        }
        this.f388026a.mo117980f(this.f388027b);
        this.f388026a.mo117976b();
        this.f388026a.mo117978d();
        mo117933o();
        try {
            mo117937s().mo118068k(this.f388026a);
        } catch (RemoteException | IllegalStateException unused) {
        }
        this.f388030e.set((Object) null, false);
        this.f388029d.mo117946e(C143107as.class, C142980ad.f388010a);
        this.f388029d.mo117945d(C143144a.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo117932n() {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "tearDownCarManagers() %s", mo117940t());
        }
        this.f388029d.mo117946e(C143270bd.class, C143066k.f388150a);
        this.f388029d.mo117946e(C143116a.class, C143070o.f388154a);
        this.f388029d.mo117946e(C143271be.class, C143071p.f388155a);
        this.f388029d.mo117946e(C143101am.class, C143072q.f388156a);
        this.f388029d.mo117946e(C143110av.class, C143073r.f388157a);
        this.f388029d.mo117946e(C143277bk.class, C143074s.f388158a);
        this.f388029d.mo117946e(C143278bl.class, C143075t.f388159a);
        this.f388029d.mo117946e(C143113ay.class, C143076u.f388160a);
        this.f388029d.mo117946e(C143279bm.class, C143077v.f388161a);
        this.f388029d.mo117946e(C143184a.class, C143078w.f388162a);
        this.f388029d.mo117946e(C143026bw.class, C143067l.f388151a);
        this.f388029d.mo117948g(C143327a.class, C143068m.f388152a);
        this.f388029d.mo117947f(C143282bp.class);
        this.f388029d.mo117948g(C143038ch.class, C143069n.f388153a);
        try {
            this.f388029d.mo117947f(C143272bf.class);
        } catch (NoClassDefFoundError e) {
            C143316a.m232514d(5, "CAR.CLIENT", e, "Couldn't clear CarDisplayInfoManagerImpl cache as class not loaded from SDK.", new Object[0]);
        }
    }

    /* renamed from: o */
    public final void mo117933o() {
        if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "tearDownProjectionSessionState() %s", mo117940t());
        }
        mo117932n();
        this.f388033h.mo118005a();
        this.f388032g.mo118005a();
        this.f388034i.mo118005a();
        this.f388035j.mo118005a();
        this.f388030e.compareAndSet((Object) null, (Object) null, true, false);
    }

    /* renamed from: p */
    public final boolean mo117934p(C143264a aVar) {
        C143235a aVar2 = this.f388031f;
        C143057d dVar = new C143057d(this, aVar);
        boolean z = aVar.f388421g;
        return ((Boolean) aVar2.mo118276b(dVar, false)).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo117935q(int i) {
        C58528ij ijVar = (C58528ij) this.f388030e.getReference();
        if (ijVar == null) {
            C143316a.m232513c("CAR.CLIENT", (Throwable) null, "carModuleFeaturesCache empty, retrieving from car service.");
            C143235a aVar = this.f388031f;
            try {
                ijVar = new C143030c(this).f388096a.mo117927i();
            } catch (RemoteException e) {
                aVar.mo118280f(e);
                ijVar = null;
            }
            if (ijVar == null) {
                C143316a.m232514d(5, "CAR.CLIENT", (Throwable) null, "Failed to get module features from car service. Returning false for hasCarModuleFeature(%s).", C61301b.m93812a(C143159co.m232263a(i)));
                return false;
            }
            if (ijVar.isEmpty()) {
                C143316a.m232514d(5, "CAR.CLIENT", (Throwable) null, "Module features are empty!", new Object[0]);
            }
            if (this.f388030e.compareAndSet((Object) null, ijVar, true, true)) {
                C143316a.m232514d(4, "CAR.CLIENT", (Throwable) null, "Set carModuleFeaturesCache: %s", C61301b.m93812a(ijVar));
            }
        }
        return ijVar.contains(C143159co.m232263a(i));
    }

    /* renamed from: r */
    public final boolean mo117936r(String str) {
        return ((Boolean) this.f388031f.mo118277c(new C142978ab(this, str))).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract C143134br mo117937s();

    /* renamed from: f */
    public final void mo117919f(byte[] bArr) {
        C143235a aVar = this.f388031f;
        try {
            new C143065j(this, bArr).mo117950a();
        } catch (RemoteException e) {
            aVar.mo118280f(e);
            C143236b.m232385c(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }
}
