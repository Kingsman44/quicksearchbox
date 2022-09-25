package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4091g;

/* renamed from: androidx.lifecycle.a */
/* compiled from: PG */
public abstract class C2319a extends C2367bo implements C2363bk {

    /* renamed from: a */
    private final C4088d f6512a;

    /* renamed from: b */
    private final C2384o f6513b;

    /* renamed from: c */
    private final Bundle f6514c;

    public C2319a(C4091g gVar, Bundle bundle) {
        this.f6512a = gVar.getSavedStateRegistry();
        this.f6513b = gVar.getLifecycle();
        this.f6514c = bundle;
    }

    /* renamed from: e */
    private final C2358bf m6298e(String str, Class cls) {
        SavedStateHandleController a = LegacySavedStateHandleController.m6269a(this.f6512a, this.f6513b, str, this.f6514c);
        C2358bf d = mo5722d(cls, a.f6509b);
        d.mo5767s("androidx.lifecycle.savedstate.vm.tag", a);
        return d;
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f6513b != null) {
            return m6298e(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* renamed from: b */
    public final C2358bf mo635b(Class cls, C2322c cVar) {
        String str = (String) cVar.mo5723a(C2366bn.f6586d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f6512a != null) {
            return m6298e(str, cls);
        } else {
            return mo5722d(cls, C2349ax.m6338a(cVar));
        }
    }

    /* renamed from: c */
    public final void mo5721c(C2358bf bfVar) {
        C4088d dVar = this.f6512a;
        if (dVar != null) {
            LegacySavedStateHandleController.m6270b(bfVar, dVar, this.f6513b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C2358bf mo5722d(Class cls, C2344as asVar);
}
