package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.camera.camera2.p063b.C1094aq;
import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1304ar;
import androidx.camera.core.p069a.C1305as;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1325bl;
import androidx.camera.core.p069a.C1326bm;
import androidx.camera.core.p069a.C1328bo;
import androidx.camera.core.p069a.C1345ce;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1351ck;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p078c.C1482a;
import androidx.camera.core.p078c.C1487f;
import androidx.camera.core.p078c.C1488g;
import androidx.camera.core.p078c.C1490i;
import androidx.camera.core.p078c.C1492k;
import androidx.camera.core.p078c.C1493l;
import androidx.camera.core.p078c.C1494m;
import androidx.core.p097i.C1974i;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.core.cj */
/* compiled from: PG */
public final class C1506cj extends C1551ea {

    /* renamed from: a */
    public static final Executor f4143a = C1247j.m3414a();

    /* renamed from: b */
    C1547dx f4144b;

    /* renamed from: c */
    public C1490i f4145c;

    /* renamed from: d */
    private C1505ci f4146d;

    /* renamed from: e */
    private Executor f4147e = f4143a;

    /* renamed from: f */
    private C1314ba f4148f;

    /* renamed from: g */
    private Size f4149g;

    /* renamed from: h */
    private C1494m f4150h;

    static {
        C1345ce ceVar = C1504ch.f4142a;
    }

    public C1506cj(C1345ce ceVar) {
        super(ceVar);
    }

    /* renamed from: A */
    private static final Rect m4028A(Size size) {
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: i */
    private final void m4029i(C1351ck ckVar, String str, C1345ce ceVar, Size size) {
        if (this.f4146d != null) {
            ckVar.mo4232g(this.f4148f);
        }
        ckVar.mo4230e(new C1500cd(this, str, ceVar, size));
    }

    /* renamed from: j */
    private final void m4030j() {
        C1314ba baVar = this.f4148f;
        if (baVar != null) {
            baVar.mo4177c();
            this.f4148f = null;
        }
        C1494m mVar = this.f4150h;
        if (mVar != null) {
            mVar.f4106a.mo4371c();
            C1247j.m3414a().execute(new C1492k(mVar));
            this.f4150h = null;
        }
        this.f4144b = null;
    }

    /* renamed from: m */
    private final void m4031m() {
        C1505ci ciVar = this.f4146d;
        ciVar.getClass();
        C1547dx dxVar = this.f4144b;
        dxVar.getClass();
        this.f4147e.execute(new C1499cc(ciVar, dxVar));
        C1292af r = mo4416r();
        C1505ci ciVar2 = this.f4146d;
        Rect A = m4028A(this.f4149g);
        C1547dx dxVar2 = this.f4144b;
        if (r != null && ciVar2 != null && A != null && dxVar2 != null) {
            dxVar2.mo4410b(new C1561k(A, mo4414p(r), ((C1328bo) this.f4267t).mo4187u()));
        }
    }

    /* renamed from: n */
    private final void m4032n(String str, C1345ce ceVar, Size size) {
        mo4422x(mo4381g(str, ceVar, size).mo4227b());
    }

    /* renamed from: a */
    public final Size mo4309a(Size size) {
        this.f4149g = size;
        m4032n(mo4417s(), (C1345ce) this.f4267t, this.f4149g);
        return size;
    }

    /* renamed from: b */
    public final C1372de mo4310b(C1308av avVar) {
        return C1503cg.m4021a(avVar);
    }

    /* renamed from: c */
    public final C1373df mo4311c(boolean z, C1376di diVar) {
        C1308av a = diVar.mo3876a(2, 1);
        if (z) {
            a = C1305as.m3501a(a, C1504ch.f4142a);
        }
        if (a == null) {
            return null;
        }
        return C1503cg.m4021a(a).mo4273c();
    }

    /* renamed from: e */
    public final void mo4313e() {
        m4030j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C1373df mo4314f(C1094aq aqVar, C1372de deVar) {
        if (deVar.mo3737b().mo3954F(C1345ce.f3827b, (Object) null) != null) {
            deVar.mo3737b().mo4215a(C1326bm.f3806w, 35);
        } else {
            deVar.mo3737b().mo4215a(C1326bm.f3806w, 34);
        }
        return deVar.mo4273c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C1351ck mo4381g(String str, C1345ce ceVar, Size size) {
        C1384k kVar;
        String str2 = str;
        C1345ce ceVar2 = ceVar;
        Size size2 = size;
        if (this.f4145c != null) {
            C1285p.m3462a();
            this.f4145c.getClass();
            C1292af r = mo4416r();
            r.getClass();
            m4030j();
            this.f4150h = new C1494m(r, this.f4145c);
            C1488g gVar = new C1488g(1, size, 34, new Matrix(), (Rect) Objects.requireNonNull(m4028A(size)), mo4414p(r));
            C1482a aVar = new C1482a(Collections.singletonList(gVar));
            C1494m mVar = this.f4150h;
            C1285p.m3462a();
            C1974i.m5314b(aVar.f4078a.size() == 1, "Multiple input stream not supported yet.");
            C1488g gVar2 = (C1488g) aVar.f4078a.get(0);
            int i = mVar.f4109d;
            int i2 = gVar2.f4091e;
            Size size3 = gVar2.f3778q;
            int i3 = gVar2.f3779r;
            Matrix matrix = gVar2.f4088b;
            Rect rect = gVar2.f4089c;
            int i4 = gVar2.f4092f;
            boolean z = gVar2.f4090d;
            C1488g gVar3 = new C1488g(i2, size3, i3, matrix, rect, i4);
            C1292af afVar = mVar.f4107b;
            C1547dx h = gVar2.mo4370h();
            int i5 = mVar.f4109d;
            Size size4 = gVar2.f3778q;
            Rect rect2 = gVar2.f4089c;
            int i6 = gVar2.f4092f;
            boolean z2 = gVar2.f4090d;
            C1285p.m3462a();
            C1974i.m5315c(!gVar3.f4094h, "Consumer can only be linked once.");
            gVar3.f4094h = true;
            C1263l.m3436h(C1263l.m3434f(gVar3.mo4176b(), new C1487f(gVar3, rect2), C1247j.m3414a()), new C1493l(mVar, h, gVar2, gVar3), C1247j.m3414a());
            mVar.f4108c = new C1482a(Collections.singletonList(gVar3));
            this.f4148f = gVar;
            this.f4144b = ((C1488g) ((C1482a) mVar.f4108c).f4078a.get(0)).mo4370h();
            if (this.f4146d != null) {
                m4031m();
            }
            C1351ck a = C1351ck.m3687a(ceVar);
            m4029i(a, str2, ceVar2, size2);
            return a;
        }
        C1285p.m3462a();
        C1351ck a2 = C1351ck.m3687a(ceVar);
        C1303aq aqVar = (C1303aq) C1348ch.m3675c(ceVar2, C1345ce.f3827b, (Object) null);
        m4030j();
        ((Boolean) C1348ch.m3675c(ceVar2, C1345ce.f3828c, false)).booleanValue();
        mo4416r();
        C1547dx dxVar = new C1547dx(size2);
        this.f4144b = dxVar;
        if (this.f4146d != null) {
            m4031m();
        }
        if (aqVar != null) {
            C1304ar arVar = new C1304ar();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(arVar.hashCode());
            C1522cz czVar = new C1522cz(size.getWidth(), size.getHeight(), ceVar.mo3956a(), new Handler(handlerThread.getLooper()), aqVar, dxVar.f4254e, num);
            synchronized (czVar.f4191a) {
                if (!czVar.f4192b) {
                    kVar = czVar.f4196f;
                } else {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
            }
            a2.mo4228c(kVar);
            C60870cx c = C1263l.m3431c(czVar.f3777p);
            Objects.requireNonNull(handlerThread);
            c.mo4106b(new C1501ce(handlerThread), C1238a.m3410a());
            this.f4148f = czVar;
            a2.f3832b.f3744e.mo4220b(num, 0);
        } else {
            C1325bl blVar = (C1325bl) C1348ch.m3675c(ceVar2, C1345ce.f3826a, (Object) null);
            if (blVar != null) {
                a2.mo4228c(new C1502cf(this, blVar));
            }
            this.f4148f = dxVar.f4254e;
        }
        m4029i(a2, str2, ceVar2, size2);
        return a2;
    }

    /* renamed from: h */
    public final void mo4382h(Executor executor, C1505ci ciVar) {
        C1285p.m3462a();
        if (ciVar == null) {
            this.f4146d = null;
            this.f4273z = 2;
            mo4421w();
            return;
        }
        this.f4146d = ciVar;
        this.f4147e = executor;
        mo4419u();
        if (this.f4268u != null) {
            m4032n(mo4417s(), (C1345ce) this.f4267t, this.f4268u);
            mo4420v();
        }
    }

    public final String toString() {
        return "Preview:".concat(String.valueOf(mo4418t()));
    }
}
