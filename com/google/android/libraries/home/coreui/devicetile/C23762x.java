package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23726aa;
import com.google.android.libraries.home.coreui.devicetile.model.C23728c;
import com.google.android.libraries.home.coreui.devicetile.model.C23730e;
import com.google.android.libraries.home.coreui.devicetile.model.C23731f;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.model.C23745t;
import com.google.android.libraries.home.coreui.devicetile.model.C23748w;
import com.google.android.libraries.home.coreui.devicetile.model.C23751z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.x */
/* compiled from: PG */
public final class C23762x {
    /* renamed from: a */
    public static final C23739n m44262a(C23739n nVar, C23730e eVar) {
        if (nVar instanceof C23728c) {
            C23728c cVar = (C23728c) nVar;
            String str = cVar.f64908a;
            boolean z = cVar.f64909b;
            C69664n.m101061g(str, "templateId");
            return new C23728c(str, z, eVar);
        } else if (nVar instanceof C23745t) {
            C23745t tVar = (C23745t) nVar;
            String str2 = tVar.f65095a;
            float f = tVar.f65096b;
            C69664n.m101061g(str2, "templateId");
            return new C23745t(str2, f, eVar);
        } else if (nVar instanceof C23731f) {
            String str3 = ((C23731f) nVar).f64912a;
            C69664n.m101061g(str3, "templateId");
            return new C23731f(str3, eVar);
        } else if (nVar instanceof C23748w) {
            C23748w wVar = (C23748w) nVar;
            throw null;
        } else if (!(nVar instanceof C23726aa)) {
            return nVar;
        } else {
            C23726aa aaVar = (C23726aa) nVar;
            String str4 = aaVar.f64903a;
            C23751z zVar = aaVar.f64904b;
            C69664n.m101061g(str4, "templateId");
            C69664n.m101061g(zVar, "actionType");
            return new C23726aa(str4, zVar, eVar);
        }
    }
}
