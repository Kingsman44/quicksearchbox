package com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10266b;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.b.a */
/* compiled from: PG */
public final class C135575a {

    /* renamed from: a */
    private final C28443m f369295a;

    /* renamed from: b */
    private final C43262m f369296b;

    /* renamed from: c */
    private final boolean f369297c;

    public C135575a(C28443m mVar, C43262m mVar2, boolean z) {
        this.f369295a = mVar;
        this.f369296b = mVar2;
        this.f369297c = z;
    }

    /* renamed from: a */
    public final void mo112392a(int i) {
        if (this.f369297c) {
            WebCoordinatorInternal a = C43756o.m77265a(((C43251d) this.f369296b).f113024a);
            View view = a.f114092a.getView();
            if (view == null || a.f114093b.mo46384b().f112976o == 0) {
                view = null;
            }
            view.getClass();
            C28443m mVar = this.f369295a;
            C28440j f = C28442l.m53140f();
            f.mo33895b(C28375ak.m53063e(i));
            mVar.mo33853c(f.mo33894a(), C28485y.m53234a(view));
        }
    }
}
