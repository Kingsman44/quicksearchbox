package com.google.android.libraries.gsa.monet.tools.recycling.p1926b;

import android.util.Log;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23188h;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23310c;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.b.g */
/* compiled from: PG */
public final class C23283g {

    /* renamed from: a */
    public final C23188h f63757a;

    /* renamed from: b */
    public final Set f63758b = new HashSet();

    /* renamed from: c */
    public final Map f63759c = new HashMap();

    public C23283g(C23052c cVar, C23310c cVar2) {
        this.f63757a = new C23188h(cVar, cVar2, new C23281e(this), new C23282f(this));
    }

    /* renamed from: a */
    public final void mo28757a(C23028x xVar) {
        if (!this.f63758b.isEmpty()) {
            C23188h hVar = this.f63757a;
            Set set = this.f63758b;
            C23067b.m43233f(hVar.f63590f == 2, "restoreChildren can only be called in or after onRestore, but before creating any children.");
            hVar.f63587c.retainAll(set);
            hVar.mo28645j(xVar);
        }
    }

    /* renamed from: b */
    public final void mo28758b(C23028x xVar, String str, C23284h hVar) {
        if (this.f63757a.f63590f == 3) {
            Log.w("CRChildManagerHelper", "Trying to restore children after changes have been made to the child manager");
            if (hVar != null) {
                hVar.mo28759a();
                return;
            }
            return;
        }
        if (hVar != null) {
            Set set = (Set) this.f63759c.get(str);
            if (set == null) {
                set = new HashSet();
                this.f63759c.put(str, set);
            }
            set.add(hVar);
        }
        for (RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData : this.f63757a.f63587c) {
            if (recyclingChildCoordinator$RecyclingChildData.f63674a.equals(str)) {
                this.f63758b.add(recyclingChildCoordinator$RecyclingChildData);
            }
        }
        if (this.f63758b.size() == this.f63757a.f63587c.size()) {
            C23188h hVar2 = this.f63757a;
            C23067b.m43233f(hVar2.f63590f == 2, "restoreChildren can only be called in or after onRestore, but before creating any children.");
            hVar2.mo28645j(xVar);
        }
    }
}
