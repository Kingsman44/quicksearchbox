package androidx.lifecycle;

import androidx.savedstate.C4086b;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4091g;

/* renamed from: androidx.lifecycle.l */
/* compiled from: PG */
final class C2381l implements C4086b {
    C2381l() {
    }

    /* renamed from: f */
    public final void mo5786f(C4091g gVar) {
        if (gVar instanceof C2371bs) {
            C2370br viewModelStore = ((C2371bs) gVar).getViewModelStore();
            C4088d savedStateRegistry = gVar.getSavedStateRegistry();
            for (String a : viewModelStore.mo5773b()) {
                LegacySavedStateHandleController.m6270b(viewModelStore.mo5772a(a), savedStateRegistry, gVar.getLifecycle());
            }
            if (!viewModelStore.mo5773b().isEmpty()) {
                savedStateRegistry.mo8586c(C2381l.class);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
