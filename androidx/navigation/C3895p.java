package androidx.navigation;

import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.p5463a.C69530n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.p */
/* compiled from: PG */
final class C3895p extends C3871cl {

    /* renamed from: a */
    final /* synthetic */ C3807af f12490a;

    /* renamed from: h */
    private final C3868ci f12491h;

    public C3895p(C3807af afVar, C3868ci ciVar) {
        C69664n.m101061g(ciVar, "navigator");
        this.f12490a = afVar;
        this.f12491h = ciVar;
    }

    /* renamed from: a */
    public final C3892m mo8125a(C3825ax axVar, Bundle bundle) {
        C3807af afVar = this.f12490a;
        return C3887h.m11190b(afVar.f12287a, axVar, bundle, afVar.mo8041a(), this.f12490a.f12298l);
    }

    /* renamed from: c */
    public final void mo8139c(C3892m mVar) {
        C69664n.m101061g(mVar, "backStackEntry");
        C69664n.m101061g(mVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f12432b;
        reentrantLock.lock();
        try {
            C71548cy cyVar = this.f12433c;
            cyVar.mo62807f(C69540x.m100832N((Collection) cyVar.mo62784e(), mVar));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final void mo8126d(C3892m mVar, boolean z) {
        C69664n.m101061g(mVar, "popUpTo");
        C3868ci a = this.f12490a.f12303q.mo8077a(mVar.f12477b.f12354c);
        if (C69664n.m101066l(a, this.f12491h)) {
            C3807af afVar = this.f12490a;
            C69626l lVar = afVar.f12306t;
            if (lVar != null) {
                lVar.mo5761a(mVar);
                super.mo8126d(mVar, z);
                return;
            }
            C3894o oVar = new C3894o(this, mVar, z);
            C69664n.m101061g(mVar, "popUpTo");
            int indexOf = afVar.f12292f.indexOf(mVar);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + mVar + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            C69530n nVar = afVar.f12292f;
            if (i != nVar.f185946a) {
                afVar.mo8063w(((C3892m) nVar.get(i)).f12477b.f12360i, true, false);
            }
            afVar.mo8053m(mVar, false, new C69530n());
            oVar.mo5672a();
            afVar.mo8057q();
            afVar.mo8059s();
            return;
        }
        Object obj = this.f12490a.f12304r.get(a);
        C69664n.m101058d(obj);
        ((C3895p) obj).mo8126d(mVar, z);
    }

    /* renamed from: e */
    public final void mo8127e(C3892m mVar) {
        C69664n.m101061g(mVar, "backStackEntry");
        C3868ci a = this.f12490a.f12303q.mo8077a(mVar.f12477b.f12354c);
        if (C69664n.m101066l(a, this.f12491h)) {
            C69626l lVar = this.f12490a.f12305s;
            if (lVar != null) {
                lVar.mo5761a(mVar);
                mo8139c(mVar);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + mVar.f12477b + " outside of the call to navigate(). ");
            return;
        }
        Object obj = this.f12490a.f12304r.get(a);
        if (obj != null) {
            ((C3895p) obj).mo8127e(mVar);
            return;
        }
        throw new IllegalStateException("NavigatorBackStack for " + mVar.f12477b.f12354c + " should already be created");
    }
}
