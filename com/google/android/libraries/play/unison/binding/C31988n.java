package com.google.android.libraries.play.unison.binding;

import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.n */
/* compiled from: PG */
public final class C31988n {

    /* renamed from: a */
    private final C31982h f85987a;

    /* renamed from: b */
    private final C31987m f85988b = new C31987m();

    public C31988n(C31982h hVar) {
        this.f85987a = hVar;
    }

    /* renamed from: a */
    public final void mo37759a(C31978d dVar, Object obj, Object obj2, BindableStateStore bindableStateStore) {
        C69664n.m101061g(dVar, "childBindable");
        C69664n.m101061g(obj, "viewData");
        C69664n.m101061g(bindableStateStore, "bindableStateStore");
        boolean z = false;
        Parcelable parcelable = null;
        if (dVar.mo37747j()) {
            if (obj2 != null) {
                C31977c cVar = dVar.f85979h;
                if (C69664n.m101066l(obj2, cVar != null ? cVar.f85975a : null)) {
                    z = true;
                }
            }
            dVar.mo37746h();
        }
        C31987m mVar = this.f85988b;
        C31982h hVar = this.f85987a;
        if (hVar == null) {
            hVar = bindableStateStore;
        }
        if (!z && obj2 != null) {
            parcelable = hVar.mo37720b(obj2);
        }
        mVar.f85986b = parcelable;
        C31987m mVar2 = this.f85988b;
        C69664n.m101061g(obj, "viewData");
        C69664n.m101061g(bindableStateStore, "bindableStateStore");
        C69664n.m101061g(hVar, "selectedBindableStateManager");
        dVar.f85978g = bindableStateStore;
        dVar.mo37735a(obj, mVar2);
        dVar.f85979h = new C31977c(obj2, hVar);
        dVar.f85980i = true;
    }

    /* renamed from: b */
    public final boolean mo37760b(Object obj) {
        C31987m mVar = this.f85988b;
        if (mVar.f85985a == obj) {
            return false;
        }
        mVar.f85985a = obj;
        return true;
    }
}
