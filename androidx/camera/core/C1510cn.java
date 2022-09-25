package androidx.camera.core;

import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;

/* renamed from: androidx.camera.core.cn */
/* compiled from: PG */
final class C1510cn implements C1330bq {

    /* renamed from: a */
    final /* synthetic */ C1517cu f4155a;

    public C1510cn(C1517cu cuVar) {
        this.f4155a = cuVar;
    }

    /* renamed from: a */
    public final void mo4018a(C1331br brVar) {
        C1517cu cuVar = this.f4155a;
        synchronized (cuVar.f4166a) {
            if (!cuVar.f4167b) {
                try {
                    C1473bs g = brVar.mo4204g();
                    if (g != null) {
                        Integer num = (Integer) g.mo4305e().mo4333d().mo4257d(cuVar.f4178m);
                        if (!cuVar.f4180o.contains(num)) {
                            C1477bw.m3983f("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                            g.close();
                        } else {
                            cuVar.f4179n.mo4394c(g);
                        }
                    }
                } catch (IllegalStateException e) {
                    C1477bw.m3981d("ProcessingImageReader", "Failed to acquire latest image.", e);
                }
                return;
            }
            return;
        }
    }
}
