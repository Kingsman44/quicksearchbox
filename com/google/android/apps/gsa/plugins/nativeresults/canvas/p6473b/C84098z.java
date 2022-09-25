package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import android.net.Uri;
import com.google.android.apps.gsa.plugins.p6468a.p6469a.C84055a;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88148qy;
import com.google.common.p4575r.C60757n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.z */
/* compiled from: PG */
public final class C84098z extends C84075c {

    /* renamed from: a */
    private final C84055a f229011a;

    public C84098z(C87680ah ahVar) {
        this.f229011a = new C84055a(ahVar);
    }

    /* renamed from: c */
    public final void mo77528c(List list) {
        if (!list.isEmpty() && list.get(0) != null && Uri.parse((String) list.get(0)).isAbsolute()) {
            this.f229011a.mo77509b((String) list.get(0), (String) null);
        }
    }

    /* renamed from: d */
    public final void mo25478d(List list, int i) {
        this.f229011a.mo77508a((String) list.get(C60757n.m92742c(i, 0, list.size() - 1)), (String) null, (String) null, false, (C88148qy) null);
    }
}
