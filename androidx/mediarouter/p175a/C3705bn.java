package androidx.mediarouter.p175a;

import android.util.Log;

/* renamed from: androidx.mediarouter.a.bn */
/* compiled from: PG */
final class C3705bn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3706bo f11903a;

    public C3705bn(C3706bo boVar) {
        this.f11903a = boVar;
    }

    public final void run() {
        C3706bo boVar = this.f11903a;
        C3713bv bvVar = boVar.f11911h;
        if (bvVar.f11935n == boVar) {
            if (C3713bv.f11930a) {
                new StringBuilder().append(bvVar);
                Log.d("MediaRouteProviderProxy", bvVar.toString().concat(": Service connection died"));
            }
            bvVar.mo7828g();
        }
    }
}
