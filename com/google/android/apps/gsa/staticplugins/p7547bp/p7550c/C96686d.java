package com.google.android.apps.gsa.staticplugins.p7547bp.p7550c;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90185a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.C90189b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90186a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90188c;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.C99430a;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99432b;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1911d.C23180a;
import com.google.android.libraries.p576aq.C10547j;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10562y;
import com.google.android.libraries.p576aq.C10563z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bp.c.d */
/* compiled from: PG */
public final class C96686d implements C90189b {

    /* renamed from: a */
    public final C23180a f270492a;

    /* renamed from: b */
    public final Map f270493b = new HashMap();

    /* renamed from: c */
    public final Map f270494c = new HashMap();

    /* renamed from: d */
    public final Enum[] f270495d;

    /* renamed from: e */
    public final C10562y f270496e;

    /* renamed from: f */
    public final C10558u f270497f = C10563z.m25518j(C58836b.f156633a);

    /* renamed from: g */
    public final List f270498g = new ArrayList();

    /* renamed from: h */
    public final Map f270499h = new HashMap();

    /* renamed from: i */
    List f270500i = new ArrayList();

    /* renamed from: j */
    private int f270501j;

    /* renamed from: k */
    private int f270502k;

    public C96686d(C22945j jVar, C23180a aVar, Class cls) {
        this.f270492a = aVar;
        Enum[] enumArr = (Enum[]) C58893dc.m90996a((Enum[]) cls.getEnumConstants());
        this.f270495d = enumArr;
        this.f270496e = new C10562y();
        for (Enum enumR : enumArr) {
            if (C99430a.m164910c((C99432b) enumR)) {
                this.f270499h.put(enumR, new C96684b(new C23219p(C90185a.m146756b(enumR), jVar, false), new C96685c(this, enumR)));
            }
        }
    }

    /* renamed from: a */
    public final C10563z mo83933a(C90188c cVar) {
        C58838bb.m90868c(this.f270494c.containsKey(cVar));
        return mo90314e(cVar).f270508e;
    }

    /* renamed from: b */
    public final void mo83934b(C90188c cVar, Object obj) {
        Map map = this.f270494c;
        String str = cVar.f251956a;
        C96688f fVar = new C96688f(obj, C58836b.f156633a, "LayerOperatorImpl_TYPE_SEARCHNOW_" + str);
        C10562y yVar = this.f270496e;
        new C10547j(yVar.f35335b, fVar.f270507d).mo18604b(this.f270497f);
        map.put(cVar, fVar);
    }

    /* renamed from: c */
    public final void mo83935c(int i, int i2) {
        this.f270501j = i;
        this.f270502k = i2;
        mo90316g();
    }

    /* renamed from: d */
    public final int mo90313d() {
        for (int size = this.f270500i.size() - 1; size >= 0; size--) {
            if (((C58833ax) this.f270500i.get(size)).mo56113h()) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final C96688f mo90314e(C90188c cVar) {
        C96688f fVar = (C96688f) this.f270494c.get(cVar);
        fVar.getClass();
        return fVar;
    }

    /* renamed from: f */
    public final void mo90315f(int i, C58833ax axVar) {
        ChildStub childStub = (ChildStub) this.f270498g.get(i);
        if (axVar.mo56113h()) {
            View il = ((C22939d) axVar.mo56107c()).mo28297il();
            if (il != null) {
                childStub.mo28718c(il);
                childStub.f63703a = 0;
                childStub.mo28716a();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) il.getLayoutParams();
                if (marginLayoutParams == null) {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                }
                if (axVar.mo56107c() instanceof C90186a) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    marginLayoutParams.topMargin = this.f270501j;
                }
                marginLayoutParams.bottomMargin = this.f270502k;
                il.setLayoutParams(marginLayoutParams);
                if (mo90313d() != i) {
                    il.setImportantForAccessibility(4);
                } else {
                    il.setImportantForAccessibility(0);
                }
            }
        } else {
            if (childStub.mo28719d()) {
                childStub.mo28717b();
            }
            childStub.f63703a = 8;
            childStub.mo28716a();
        }
    }

    /* renamed from: g */
    public final void mo90316g() {
        if (!this.f270493b.isEmpty()) {
            for (int i = 0; i < this.f270500i.size(); i++) {
                if (!((C58833ax) this.f270500i.get(i)).mo56113h() || !C99430a.m164910c((C99432b) ((Enum) ((C58833ax) this.f270500i.get(i)).mo56107c()))) {
                    mo90315f(i, C58836b.f156633a);
                } else {
                    C22939d dVar = (C22939d) this.f270493b.get(((C58833ax) this.f270500i.get(i)).mo56107c());
                    if (dVar != null) {
                        mo90315f(i, C58833ax.m90834k(dVar));
                    }
                }
            }
        }
    }
}
