package androidx.work.impl.p204a.p206b;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.C4380ad;
import androidx.work.impl.utils.C4606m;
import androidx.work.impl.utils.C4608o;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.l */
/* compiled from: PG */
public final class C4437l extends C4434i {

    /* renamed from: e */
    public final ConnectivityManager f14122e;

    /* renamed from: f */
    private final C4436k f14123f = new C4436k(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4437l(Context context, C4595b bVar) {
        super(context, bVar);
        C69664n.m101061g(context, "context");
        Object systemService = this.f14115a.getSystemService("connectivity");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f14122e = (ConnectivityManager) systemService;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo9377b() {
        return C4438m.m12664a(this.f14122e);
    }

    /* renamed from: d */
    public final void mo9380d() {
        try {
            C4380ad.m12560h().mo9309a(C4438m.f14124a, "Registering network callback");
            C4608o.m13003a(this.f14122e, this.f14123f);
        } catch (IllegalArgumentException e) {
            C4380ad.m12560h().mo9312d(C4438m.f14124a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C4380ad.m12560h().mo9312d(C4438m.f14124a, "Received exception while registering network callback", e2);
        }
    }

    /* renamed from: e */
    public final void mo9381e() {
        try {
            C4380ad.m12560h().mo9309a(C4438m.f14124a, "Unregistering network callback");
            C4606m.m13000b(this.f14122e, this.f14123f);
        } catch (IllegalArgumentException e) {
            C4380ad.m12560h().mo9312d(C4438m.f14124a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C4380ad.m12560h().mo9312d(C4438m.f14124a, "Received exception while unregistering network callback", e2);
        }
    }
}
