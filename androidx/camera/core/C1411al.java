package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1329bp;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.camera.core.al */
/* compiled from: PG */
final class C1411al implements C1303aq {

    /* renamed from: a */
    public final C1303aq f3958a;

    /* renamed from: b */
    final Executor f3959b;

    /* renamed from: c */
    public C1472br f3960c = null;

    /* renamed from: d */
    public final Object f3961d = new Object();

    /* renamed from: e */
    public boolean f3962e = false;

    /* renamed from: f */
    public boolean f3963f = false;

    /* renamed from: g */
    C2164c f3964g;

    /* renamed from: h */
    private final C1303aq f3965h;

    /* renamed from: i */
    private final C60870cx f3966i;

    /* renamed from: j */
    private final int f3967j;

    /* renamed from: k */
    private C1331br f3968k = null;

    /* renamed from: l */
    private C60870cx f3969l;

    public C1411al(C1303aq aqVar, int i, C1303aq aqVar2, Executor executor) {
        this.f3965h = aqVar;
        this.f3958a = aqVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(aqVar.mo4163a());
        arrayList.add(aqVar2.mo4163a());
        this.f3966i = C1263l.m3429a(arrayList);
        this.f3959b = executor;
        this.f3967j = i;
    }

    /* renamed from: b */
    public final void mo4164b() {
        synchronized (this.f3961d) {
            if (!this.f3962e) {
                this.f3962e = true;
                this.f3965h.mo4164b();
                this.f3958a.mo4164b();
                mo4297c();
            }
        }
    }

    /* renamed from: c */
    public final void mo4297c() {
        boolean z;
        boolean z2;
        C2164c cVar;
        synchronized (this.f3961d) {
            z = this.f3962e;
            z2 = this.f3963f;
            cVar = this.f3964g;
            if (z && !z2) {
                this.f3968k.mo4206i();
            }
        }
        if (z && !z2 && cVar != null) {
            this.f3966i.mo4106b(new C1410ak(cVar), C1238a.m3410a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo4298d(C1331br brVar) {
        C1473bs g = brVar.mo4204g();
        try {
            this.f3959b.execute(new C1409aj(this, g));
        } catch (RejectedExecutionException unused) {
            C1477bw.m3980c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            g.close();
        }
    }

    /* renamed from: e */
    public final void mo4165e(Surface surface, int i) {
        this.f3958a.mo4165e(surface, i);
    }

    /* renamed from: f */
    public final void mo4166f(Size size) {
        C1550e eVar = new C1550e(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f3967j));
        this.f3968k = eVar;
        this.f3965h.mo4165e(eVar.mo4202e(), 35);
        this.f3965h.mo4166f(size);
        this.f3958a.mo4166f(size);
        this.f3968k.mo4207j(new C1406ag(this), C1238a.m3410a());
    }

    /* renamed from: g */
    public final void mo4167g(C1329bp bpVar) {
        synchronized (this.f3961d) {
            if (!this.f3962e) {
                this.f3963f = true;
                C60870cx a = bpVar.mo4196a(((Integer) bpVar.mo4197b().get(0)).intValue());
                C1974i.m5313a(a.isDone());
                try {
                    this.f3960c = ((C1473bs) a.get()).mo4305e();
                    this.f3965h.mo4167g(bpVar);
                } catch (InterruptedException | ExecutionException unused) {
                    throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
                }
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo4163a() {
        C60870cx cxVar;
        synchronized (this.f3961d) {
            if (!this.f3962e || this.f3963f) {
                if (this.f3969l == null) {
                    this.f3969l = C2169h.m6027a(new C1408ai(this));
                }
                cxVar = C1263l.m3431c(this.f3969l);
            } else {
                cxVar = C1263l.m3433e(this.f3966i, C1407ah.f3953a, C1238a.m3410a());
            }
        }
        return cxVar;
    }
}
