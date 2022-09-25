package com.google.android.apps.gsa.sidekick.main.p7205h;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23188h;
import com.google.android.libraries.gsa.monet.tools.children.shared.ChildData;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.h.f */
/* compiled from: PG */
public final class C91421f extends C23278b {

    /* renamed from: c */
    private static final C59071e f255044c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.h.f");

    /* renamed from: a */
    public final HashSet f255045a;

    /* renamed from: d */
    private final C23052c f255046d;

    /* renamed from: e */
    private RecyclingChildCoordinator$RecyclingChildData f255047e;

    /* renamed from: f */
    private C23056g f255048f;

    /* renamed from: g */
    private int f255049g = -1;

    public C91421f(C91428j jVar, C23052c cVar) {
        super(jVar, cVar);
        this.f255046d = cVar;
        this.f255045a = new HashSet();
    }

    /* renamed from: g */
    private final void m149529g() {
        this.f255047e = null;
        this.f255048f = null;
        this.f255049g = -1;
    }

    /* renamed from: a */
    public final void mo85772a() {
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = this.f255047e;
        if (recyclingChildCoordinator$RecyclingChildData == null) {
            C59104x c = f255044c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CTRL_DISMISS_CHILD_MGR");
            ((C59052c) ((C59052c) c).mo56372aa(11575)).mo56386p("Calling commitDismiss when there is not child pending dismissal.");
            return;
        }
        this.f255046d.mo28365x(recyclingChildCoordinator$RecyclingChildData.f63675b);
        m149529g();
    }

    /* renamed from: b */
    public final void mo85773b(C23056g gVar) {
        C23188h hVar = this.f63752b.f63757a;
        ChildData childData = (ChildData) hVar.f63586b.get(gVar);
        int indexOf = childData != null ? hVar.f63585a.f63698d.indexOf(childData) : -1;
        this.f255049g = indexOf;
        if (indexOf < 0) {
            C59104x d = f255044c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CTRL_DISMISS_CHILD_MGR");
            ((C59052c) ((C59052c) d).mo56372aa(11576)).mo56386p("Trying to remove a child that does not belong to this child manager");
            int i = C90755l.f253831a;
            return;
        }
        if (this.f255047e != null) {
            mo85772a();
        }
        this.f255047e = (RecyclingChildCoordinator$RecyclingChildData) this.f63752b.f63757a.mo28638c(gVar);
        this.f255048f = gVar;
        Iterator it = this.f255045a.iterator();
        while (it.hasNext()) {
            ((C91419e) it.next()).mo85766c(gVar);
        }
    }

    /* renamed from: c */
    public final void mo28753c(C23056g gVar) {
        if (gVar.equals(this.f255048f)) {
            mo85772a();
        } else {
            this.f63752b.f63757a.mo28642g(gVar);
        }
    }

    /* renamed from: d */
    public final void mo85774d() {
        C23056g gVar;
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = this.f255047e;
        if (recyclingChildCoordinator$RecyclingChildData == null || (gVar = this.f255048f) == null) {
            C59104x d = f255044c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CTRL_DISMISS_CHILD_MGR");
            ((C59052c) ((C59052c) d).mo56372aa(11577)).mo56386p("Cannot undo dismiss when there is no child pending removal.");
            int i = C90755l.f253831a;
            return;
        }
        C91427i iVar = (C91427i) this.f63752b.f63757a.f63585a;
        int i2 = this.f255049g;
        if (!recyclingChildCoordinator$RecyclingChildData.equals(iVar.f255055b)) {
            C59104x c = C91427i.f255054a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DismissChildCoordinator");
            ((C59052c) ((C59052c) c).mo56372aa(11578)).mo56386p("You cannot insert a child that was not made by this coordinator.");
        } else {
            iVar.mo28709h(recyclingChildCoordinator$RecyclingChildData, i2);
            iVar.f255055b = null;
        }
        C23188h hVar = this.f63752b.f63757a;
        hVar.mo28640e(recyclingChildCoordinator$RecyclingChildData, gVar, hVar.f63585a.mo28704b());
        Iterator it = this.f255045a.iterator();
        while (it.hasNext()) {
            ((C91419e) it.next()).mo85767d(gVar);
        }
        m149529g();
    }
}
