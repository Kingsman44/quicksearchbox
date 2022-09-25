package com.google.android.libraries.lens.view.textoverlay;

import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24157b;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24158c;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24160e;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24161f;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.w */
/* compiled from: PG */
public final class C28090w {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76445a;

    public C28090w(C28093z zVar) {
        this.f76445a = zVar;
    }

    /* renamed from: a */
    public final void mo33547a() {
        C24158c cVar = this.f76445a.f76464q;
        if (cVar != null) {
            C24157b bVar = cVar.f65997c;
            C24161f fVar = bVar.f65980a;
            if (fVar.f66008g) {
                fVar.f66008g = false;
                fVar.mo29595a(0.0f, new C24160e(fVar));
            }
            bVar.f65981b.cancel();
            bVar.f65982c = false;
        }
        this.f76445a.f76450c.f76427o = false;
    }
}
