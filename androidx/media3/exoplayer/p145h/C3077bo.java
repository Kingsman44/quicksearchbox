package androidx.media3.exoplayer.p145h;

import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3364bb;

/* renamed from: androidx.media3.exoplayer.h.bo */
/* compiled from: PG */
public final /* synthetic */ class C3077bo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3083bu f8936a;

    /* renamed from: b */
    public final /* synthetic */ C3364bb f8937b;

    public /* synthetic */ C3077bo(C3083bu buVar, C3364bb bbVar) {
        this.f8936a = buVar;
        this.f8937b = bbVar;
    }

    public final void run() {
        C3364bb bbVar;
        C3083bu buVar = this.f8936a;
        C3364bb bbVar2 = this.f8937b;
        if (buVar.f8980i == null) {
            bbVar = bbVar2;
        } else {
            bbVar = new C3363ba(-9223372036854775807L, 0);
        }
        buVar.f8983l = bbVar;
        buVar.f8984m = bbVar2.mo7325r();
        boolean z = false;
        int i = 1;
        if (!buVar.f8987p && bbVar2.mo7325r() == -9223372036854775807L) {
            z = true;
        }
        buVar.f8985n = z;
        if (true == z) {
            i = 7;
        }
        buVar.f8986o = i;
        buVar.f8974c.mo7049b(buVar.f8984m, bbVar2.mo7326t(), buVar.f8985n);
        if (!buVar.f8982k) {
            buVar.mo7054r();
        }
    }
}
