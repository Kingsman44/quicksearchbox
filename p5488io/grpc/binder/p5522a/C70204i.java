package p5488io.grpc.binder.p5522a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p5488io.grpc.C70132a;
import p5488io.grpc.C70163b;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70700ee;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70444df;
import p5488io.grpc.p5525e.C70452dn;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70555hi;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.binder.a.i */
/* compiled from: PG */
public final class C70204i extends C70206k implements C70387bc, C70176a {

    /* renamed from: a */
    public final Executor f187106a;

    /* renamed from: b */
    public final C70235o f187107b;

    /* renamed from: c */
    public final C70197b f187108c;

    /* renamed from: d */
    public C70555hi f187109d;

    /* renamed from: n */
    private final C70567hu f187110n;

    /* renamed from: o */
    private final AtomicInteger f187111o;

    /* renamed from: p */
    private final C70190an f187112p;

    /* renamed from: q */
    private int f187113q = 1001;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70204i(android.content.Context r4, p5488io.grpc.binder.C70175a r5, java.util.concurrent.Executor r6, p5488io.grpc.p5525e.C70567hu r7, p5488io.grpc.p5525e.C70567hu r8, p5488io.grpc.binder.C70235o r9, p5488io.grpc.binder.C70229i r10, p5488io.grpc.C70256c r11) {
        /*
            r3 = this;
            io.grpc.a r0 = p5488io.grpc.C70256c.m102407a()
            io.grpc.b r1 = p5488io.grpc.p5525e.C70452dn.f187762a
            io.grpc.ee r2 = p5488io.grpc.C70700ee.NONE
            r0.mo61688b(r1, r2)
            io.grpc.b r1 = p5488io.grpc.p5525e.C70452dn.f187763b
            r0.mo61688b(r1, r11)
            io.grpc.b r11 = p5488io.grpc.C70172bg.f187020b
            java.lang.Class r1 = r4.getClass()
            io.grpc.binder.a r1 = p5488io.grpc.binder.C70175a.m102187b(r4, r1)
            r0.mo61688b(r11, r1)
            io.grpc.b r11 = p5488io.grpc.C70172bg.f187019a
            r0.mo61688b(r11, r5)
            io.grpc.b r11 = f187119h
            r0.mo61688b(r11, r10)
            io.grpc.c r10 = r0.mo61687a()
            java.lang.Class r11 = r4.getClass()
            java.lang.String r11 = r11.getSimpleName()
            android.content.Intent r0 = r5.f187028a
            android.content.ComponentName r0 = r0.getComponent()
            java.lang.String r0 = r0.toShortString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = "->"
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            java.lang.Class<io.grpc.binder.a.i> r0 = p5488io.grpc.binder.p5522a.C70204i.class
            java.lang.String r0 = p5488io.grpc.C70248bs.m102396b(r0)
            io.grpc.bs r11 = p5488io.grpc.C70248bs.m102395a(r0, r11)
            r3.<init>(r7, r10, r11)
            r7 = 1001(0x3e9, float:1.403E-42)
            r3.f187113q = r7
            r3.f187110n = r8
            r3.f187107b = r9
            java.lang.Object r7 = r8.mo62162a()
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            r3.f187106a = r7
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>()
            r3.f187111o = r7
            io.grpc.binder.a.an r7 = new io.grpc.binder.a.an
            r7.<init>()
            r3.f187112p = r7
            io.grpc.binder.a.aq r7 = new io.grpc.binder.a.aq
            android.content.Intent r5 = r5.f187028a
            android.content.Intent r5 = r5.cloneFilter()
            r7.<init>(r6, r4, r5, r3)
            r3.f187108c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70204i.<init>(android.content.Context, io.grpc.binder.a, java.util.concurrent.Executor, io.grpc.e.hu, io.grpc.e.hu, io.grpc.binder.o, io.grpc.binder.i, io.grpc.c):void");
    }

    /* renamed from: z */
    private static C70372ao m102290z(Status status, C70256c cVar, C70906u[] uVarArr) {
        C70670lp.m103313l(uVarArr, cVar).mo62413b();
        return new C70444df(status, C70373ap.PROCESSED, uVarArr);
    }

    /* renamed from: a */
    public final synchronized void mo61751a(IBinder iBinder) {
        mo61843q(C70184ah.m102228b(iBinder, this.f187106a));
    }

    /* renamed from: b */
    public final synchronized void mo61752b(Status status) {
        mo61845s(status, true);
    }

    /* renamed from: f */
    public final synchronized Runnable mo61825f(C70555hi hiVar) {
        this.f187109d = hiVar;
        return new C70203h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo61826g(Parcel parcel) {
        C70190an anVar = this.f187112p;
        parcel.readInt();
        anVar.mo61803a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo61827h(Parcel parcel) {
        C70700ee eeVar;
        C70256c cVar = this.f187126k;
        int callingUid = Binder.getCallingUid();
        C70132a aVar = new C70132a(cVar);
        aVar.mo61688b(f187117f, Integer.valueOf(callingUid));
        C70163b bVar = C70452dn.f187762a;
        if (callingUid == Process.myUid()) {
            eeVar = C70700ee.PRIVACY_AND_INTEGRITY;
        } else {
            eeVar = C70700ee.INTEGRITY;
        }
        aVar.mo61688b(bVar, eeVar);
        this.f187126k = aVar.mo61687a();
        if (mo61851y(2)) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                mo61845s(Status.f186916n.withDescription("Wire format version mismatch"), true);
            } else if (readStrongBinder == null) {
                mo61845s(Status.f186916n.withDescription("Malformed SETUP_TRANSPORT data"), true);
            } else {
                this.f187106a.execute(new C70202g(this, readStrongBinder));
            }
        }
    }

    /* renamed from: i */
    public final void mo61828i(Status status) {
        this.f187109d.mo62207c(status);
    }

    /* renamed from: j */
    public final void mo61829j() {
        if (this.f187111o.getAndSet(0) > 0) {
            this.f187109d.mo62205a(false);
        }
        ((C70193aq) this.f187108c).mo61808c(Status.f186904b);
        this.f187109d.mo62208d();
    }

    /* renamed from: k */
    public final void mo61830k() {
        super.mo61830k();
        this.f187110n.mo62163b(this.f187106a);
    }

    /* renamed from: l */
    public final synchronized void mo61831l(Status status) {
        C58838bb.m90866a(status, "reason");
        mo61845s(status, false);
    }

    /* renamed from: m */
    public final synchronized void mo61832m(Status status) {
        C58838bb.m90866a(status, "reason");
        mo61845s(status, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo61833n(C70219x xVar) {
        if (xVar.mo61865e() && this.f187111o.decrementAndGet() == 0) {
            this.f187109d.mo62205a(false);
        }
        mo61846t(xVar.f187167d);
    }

    /* renamed from: e */
    public final synchronized C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        Status status;
        if (!mo61851y(3)) {
            if (mo61848v()) {
                status = this.f187127l;
            } else {
                status = Status.f186915m.withDescription("newStream() before transportReady()");
            }
            return m102290z(status, this.f187126k, uVarArr);
        }
        int i = this.f187113q;
        int i2 = i + 1;
        this.f187113q = i2;
        if (i2 == 16777215) {
            this.f187113q = 1001;
        }
        C70670lp l = C70670lp.m103313l(uVarArr, this.f187126k);
        C70215t tVar = new C70215t(this, this.f187126k, i, C70460dv.m102883k(iVar));
        if (this.f187125j.putIfAbsent(Integer.valueOf(i), tVar) == null) {
            if (tVar.f187149a && this.f187111o.getAndIncrement() == 0) {
                this.f187109d.mo62205a(true);
            }
            C70185ai aiVar = new C70185ai(this, i, diVar, deVar, l);
            if (diVar.f187496a.mo62041a()) {
                return new C70194ar(tVar, aiVar, this.f187126k);
            }
            return new C70179ac(tVar, aiVar, this.f187126k);
        }
        Status withDescription = Status.f186915m.withDescription("Clashing call IDs");
        mo61845s(withDescription, true);
        return m102290z(withDescription, this.f187126k, uVarArr);
    }
}
