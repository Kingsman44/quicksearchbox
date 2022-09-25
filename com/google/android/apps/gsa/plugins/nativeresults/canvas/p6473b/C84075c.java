package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import com.google.android.libraries.componentview.services.application.C20546a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.c */
/* compiled from: PG */
public abstract class C84075c implements C20546a {

    /* renamed from: a */
    private C84074b f228980a;

    /* renamed from: a */
    public final void mo25476a() {
        C84074b bVar = this.f228980a;
        if (bVar != null) {
            mo77528c(((C84072a) bVar).f228978b);
            this.f228980a = null;
        }
    }

    /* renamed from: b */
    public final void mo25477b(String str, List list) {
        if (this.f228980a == null) {
            this.f228980a = new C84072a(str, list);
        }
    }

    /* renamed from: c */
    public abstract void mo77528c(List list);
}
