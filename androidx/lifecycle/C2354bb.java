package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4091g;
import java.lang.reflect.Constructor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.bb */
/* compiled from: PG */
public final class C2354bb extends C2367bo implements C2363bk {

    /* renamed from: a */
    private Application f6560a;

    /* renamed from: b */
    private final C2363bk f6561b;

    /* renamed from: c */
    private Bundle f6562c;

    /* renamed from: d */
    private C2384o f6563d;

    /* renamed from: e */
    private C4088d f6564e;

    public C2354bb() {
        this.f6561b = new C2361bi((byte[]) null);
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo5763d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public final C2358bf mo635b(Class cls, C2322c cVar) {
        Constructor constructor;
        C69664n.m101061g(cls, "modelClass");
        String str = (String) cVar.mo5723a(C2366bn.f6586d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (cVar.mo5723a(C2349ax.f6550a) != null && cVar.mo5723a(C2349ax.f6551b) != null) {
            Application application = (Application) cVar.mo5723a(C2361bi.f6582b);
            boolean isAssignableFrom = C2352b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = C2355bc.m6349b(cls, C2355bc.f6566b);
            } else {
                constructor = C2355bc.m6349b(cls, C2355bc.f6565a);
            }
            if (constructor == null) {
                return this.f6561b.mo635b(cls, cVar);
            }
            if (!isAssignableFrom || application == null) {
                return C2355bc.m6348a(cls, constructor, C2349ax.m6338a(cVar));
            }
            return C2355bc.m6348a(cls, constructor, application, C2349ax.m6338a(cVar));
        } else if (this.f6563d != null) {
            return mo5763d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* renamed from: c */
    public final void mo5721c(C2358bf bfVar) {
        C69664n.m101061g(bfVar, "viewModel");
        C2384o oVar = this.f6563d;
        if (oVar != null) {
            LegacySavedStateHandleController.m6270b(bfVar, this.f6564e, oVar);
        }
    }

    /* renamed from: d */
    public final C2358bf mo5763d(String str, Class cls) {
        Constructor constructor;
        C2358bf bfVar;
        Application application;
        C69664n.m101061g(cls, "modelClass");
        if (this.f6563d != null) {
            boolean isAssignableFrom = C2352b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f6560a == null) {
                constructor = C2355bc.m6349b(cls, C2355bc.f6566b);
            } else {
                constructor = C2355bc.m6349b(cls, C2355bc.f6565a);
            }
            if (constructor != null) {
                SavedStateHandleController a = LegacySavedStateHandleController.m6269a(this.f6564e, this.f6563d, str, this.f6562c);
                if (!isAssignableFrom || (application = this.f6560a) == null) {
                    bfVar = C2355bc.m6348a(cls, constructor, a.f6509b);
                } else {
                    bfVar = C2355bc.m6348a(cls, constructor, application, a.f6509b);
                }
                bfVar.mo5767s("androidx.lifecycle.savedstate.vm.tag", a);
                return bfVar;
            } else if (this.f6560a != null) {
                return this.f6561b.mo634a(cls);
            } else {
                return C2365bm.m6363a().mo634a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public C2354bb(Application application, C4091g gVar, Bundle bundle) {
        C2361bi biVar;
        C69664n.m101061g(gVar, "owner");
        this.f6564e = gVar.getSavedStateRegistry();
        this.f6563d = gVar.getLifecycle();
        this.f6562c = bundle;
        this.f6560a = application;
        if (application != null) {
            if (C2361bi.f6581a == null) {
                C2361bi.f6581a = new C2361bi(application);
            }
            biVar = C2361bi.f6581a;
            C69664n.m101058d(biVar);
        } else {
            biVar = new C2361bi((byte[]) null);
        }
        this.f6561b = biVar;
    }
}
