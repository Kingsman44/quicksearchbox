package androidx.mediarouter.p175a;

import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.mediarouter.a.bs */
/* compiled from: PG */
final class C3710bs extends C3667ac {

    /* renamed from: a */
    final /* synthetic */ C3711bt f11914a;

    public C3710bs(C3711bt btVar) {
        this.f11914a = btVar;
    }

    /* renamed from: a */
    public final void mo7721a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    /* renamed from: b */
    public final void mo7722b(Bundle bundle) {
        bundle.getString("groupableTitle");
        bundle.getString("transferableTitle");
    }
}
