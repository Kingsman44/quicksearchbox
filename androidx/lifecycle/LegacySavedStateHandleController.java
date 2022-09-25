package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C4088d;

/* compiled from: PG */
final class LegacySavedStateHandleController {
    /* renamed from: a */
    static SavedStateHandleController m6269a(C4088d dVar, C2384o oVar, String str, Bundle bundle) {
        Bundle a = dVar.mo8584a(str);
        Class[] clsArr = C2344as.f6543a;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C2342aq.m6328a(a, bundle));
        savedStateHandleController.mo5720b(dVar, oVar);
        m6271c(dVar, oVar);
        return savedStateHandleController;
    }

    /* renamed from: b */
    static void m6270b(C2358bf bfVar, C4088d dVar, C2384o oVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) bfVar.mo5766r("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f6508a) {
            savedStateHandleController.mo5720b(dVar, oVar);
            m6271c(dVar, oVar);
        }
    }

    /* renamed from: c */
    private static void m6271c(final C4088d dVar, final C2384o oVar) {
        C2383n a = oVar.mo5789a();
        if (a == C2383n.INITIALIZED || a.mo5788a(C2383n.STARTED)) {
            dVar.mo8586c(C2381l.class);
        } else {
            oVar.mo5790b(new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    if (mVar == C2382m.ON_START) {
                        C2384o.this.mo5791c(this);
                        dVar.mo8586c(C2381l.class);
                    }
                }
            });
        }
    }
}
