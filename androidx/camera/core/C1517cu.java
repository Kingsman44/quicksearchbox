package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.p069a.C1299am;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1304ar;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.cu */
/* compiled from: PG */
final class C1517cu implements C1331br {

    /* renamed from: a */
    final Object f4166a = new Object();

    /* renamed from: b */
    boolean f4167b = false;

    /* renamed from: c */
    boolean f4168c = false;

    /* renamed from: d */
    final C1331br f4169d;

    /* renamed from: e */
    final C1331br f4170e;

    /* renamed from: f */
    C1330bq f4171f;

    /* renamed from: g */
    Executor f4172g;

    /* renamed from: h */
    C2164c f4173h;

    /* renamed from: i */
    public C60870cx f4174i;

    /* renamed from: j */
    final Executor f4175j;

    /* renamed from: k */
    final C1303aq f4176k;

    /* renamed from: l */
    public final C60870cx f4177l;

    /* renamed from: m */
    public String f4178m = new String();

    /* renamed from: n */
    C1529df f4179n = new C1529df(Collections.emptyList(), this.f4178m);

    /* renamed from: o */
    public final List f4180o = new ArrayList();

    /* renamed from: p */
    Executor f4181p;

    /* renamed from: q */
    C1459be f4182q;

    /* renamed from: r */
    private final C1330bq f4183r = new C1510cn(this);

    /* renamed from: s */
    private final C1330bq f4184s = new C1512cp(this);

    /* renamed from: t */
    private final C1255d f4185t = new C1514cr(this);

    /* renamed from: u */
    private C60870cx f4186u = C1263l.m3430b(new ArrayList());

    public C1517cu(C1516ct ctVar) {
        if (ctVar.f4161a.mo4200c() >= ((C1404ae) ctVar.f4162b).f3951a.size()) {
            C1331br brVar = ctVar.f4161a;
            this.f4169d = brVar;
            int d = brVar.mo4201d();
            int a = brVar.mo4198a();
            int i = ctVar.f4164d;
            if (i == 256) {
                d = ((int) (((float) (d * a)) * 1.5f)) + 64000;
                a = 1;
                i = 256;
            }
            C1550e eVar = new C1550e(ImageReader.newInstance(d, a, i, brVar.mo4200c()));
            this.f4170e = eVar;
            this.f4175j = ctVar.f4165e;
            C1303aq aqVar = ctVar.f4163c;
            this.f4176k = aqVar;
            aqVar.mo4165e(eVar.mo4202e(), ctVar.f4164d);
            aqVar.mo4166f(new Size(brVar.mo4201d(), brVar.mo4198a()));
            this.f4177l = aqVar.mo4163a();
            mo4389m(ctVar.f4162b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    /* renamed from: a */
    public final int mo4198a() {
        int a;
        synchronized (this.f4166a) {
            a = this.f4169d.mo4198a();
        }
        return a;
    }

    /* renamed from: b */
    public final int mo4199b() {
        int b;
        synchronized (this.f4166a) {
            b = this.f4170e.mo4199b();
        }
        return b;
    }

    /* renamed from: c */
    public final int mo4200c() {
        int c;
        synchronized (this.f4166a) {
            c = this.f4169d.mo4200c();
        }
        return c;
    }

    /* renamed from: d */
    public final int mo4201d() {
        int d;
        synchronized (this.f4166a) {
            d = this.f4169d.mo4201d();
        }
        return d;
    }

    /* renamed from: e */
    public final Surface mo4202e() {
        Surface e;
        synchronized (this.f4166a) {
            e = this.f4169d.mo4202e();
        }
        return e;
    }

    /* renamed from: f */
    public final C1473bs mo4203f() {
        C1473bs f;
        synchronized (this.f4166a) {
            f = this.f4170e.mo4203f();
        }
        return f;
    }

    /* renamed from: g */
    public final C1473bs mo4204g() {
        C1473bs g;
        synchronized (this.f4166a) {
            g = this.f4170e.mo4204g();
        }
        return g;
    }

    /* renamed from: h */
    public final void mo4205h() {
        synchronized (this.f4166a) {
            this.f4171f = null;
            this.f4172g = null;
            this.f4169d.mo4205h();
            this.f4170e.mo4205h();
            if (!this.f4168c) {
                this.f4179n.mo4395d();
            }
        }
    }

    /* renamed from: i */
    public final void mo4206i() {
        synchronized (this.f4166a) {
            if (!this.f4167b) {
                this.f4169d.mo4205h();
                this.f4170e.mo4205h();
                this.f4167b = true;
                this.f4176k.mo4164b();
                mo4388l();
            }
        }
    }

    /* renamed from: k */
    public final void mo4387k() {
        synchronized (this.f4166a) {
            if (!this.f4186u.isDone()) {
                this.f4186u.cancel(true);
            }
            this.f4179n.mo4396e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo4388l() {
        boolean z;
        boolean z2;
        C2164c cVar;
        synchronized (this.f4166a) {
            z = this.f4167b;
            z2 = this.f4168c;
            cVar = this.f4173h;
            if (z && !z2) {
                this.f4169d.mo4206i();
                this.f4179n.mo4395d();
                this.f4170e.mo4206i();
            }
        }
        if (z && !z2) {
            this.f4177l.mo4106b(new C1509cm(this, cVar), C1238a.m3410a());
        }
    }

    /* renamed from: m */
    public final void mo4389m(C1299am amVar) {
        synchronized (this.f4166a) {
            if (!this.f4167b) {
                mo4387k();
                if (((C1404ae) amVar).f3951a != null) {
                    if (this.f4169d.mo4200c() >= ((C1404ae) amVar).f3951a.size()) {
                        this.f4180o.clear();
                        for (C1304ar arVar : ((C1404ae) amVar).f3951a) {
                            if (arVar != null) {
                                this.f4180o.add(0);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                }
                this.f4178m = Integer.toString(amVar.hashCode());
                this.f4179n = new C1529df(this.f4180o, this.f4178m);
                mo4390n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo4390n() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.f4180o) {
            arrayList.add(this.f4179n.mo4196a(intValue.intValue()));
        }
        this.f4186u = C1263l.m3429a(arrayList);
        C1263l.m3436h(C1263l.m3429a(arrayList), this.f4185t, this.f4175j);
    }

    /* renamed from: j */
    public final void mo4207j(C1330bq bqVar, Executor executor) {
        synchronized (this.f4166a) {
            bqVar.getClass();
            this.f4171f = bqVar;
            executor.getClass();
            this.f4172g = executor;
            this.f4169d.mo4207j(this.f4183r, executor);
            this.f4170e.mo4207j(this.f4184s, executor);
        }
    }
}
