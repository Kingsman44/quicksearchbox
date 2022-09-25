package androidx.camera.core;

import android.util.Size;
import java.util.Collections;

/* renamed from: androidx.camera.core.aj */
/* compiled from: PG */
public final /* synthetic */ class C1409aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1411al f3955a;

    /* renamed from: b */
    public final /* synthetic */ C1473bs f3956b;

    public /* synthetic */ C1409aj(C1411al alVar, C1473bs bsVar) {
        this.f3955a = alVar;
        this.f3956b = bsVar;
    }

    public final void run() {
        boolean z;
        C1411al alVar = this.f3955a;
        C1473bs bsVar = this.f3956b;
        synchronized (alVar.f3961d) {
            z = alVar.f3962e;
        }
        if (!z) {
            Size size = new Size(bsVar.mo4302c(), bsVar.mo4301b());
            C1472br brVar = alVar.f3960c;
            brVar.getClass();
            String str = (String) brVar.mo4333d().mo4258e().iterator().next();
            int intValue = ((Integer) alVar.f3960c.mo4333d().mo4257d(str)).intValue();
            C1527dd ddVar = new C1527dd(bsVar, size, alVar.f3960c);
            alVar.f3960c = null;
            C1529df dfVar = new C1529df(Collections.singletonList(Integer.valueOf(intValue)), str);
            dfVar.mo4394c(ddVar);
            try {
                alVar.f3958a.mo4167g(dfVar);
            } catch (Exception e) {
                C1477bw.m3980c("CaptureProcessorPipeline", "Post processing image failed! ".concat(String.valueOf(e.getMessage())));
            }
        }
        synchronized (alVar.f3961d) {
            alVar.f3963f = false;
        }
        alVar.mo4297c();
    }
}
