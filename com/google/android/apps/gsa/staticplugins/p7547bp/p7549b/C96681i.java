package com.google.android.apps.gsa.staticplugins.p7547bp.p7549b;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.C87365b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87362c;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87363d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87364e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.monet.service.C23051b;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bp.b.i */
/* compiled from: PG */
public final class C96681i implements C96682j {

    /* renamed from: a */
    private static final C59071e f270481a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bp.b.i");

    /* renamed from: b */
    private final C87365b f270482b;

    /* renamed from: c */
    private final C23186f f270483c;

    /* renamed from: d */
    private int f270484d = 2;

    /* renamed from: e */
    private int f270485e = 2;

    public C96681i(C87365b bVar, C23186f fVar) {
        this.f270482b = bVar;
        this.f270483c = fVar;
        fVar.mo28630k(new C96679g(this));
    }

    /* renamed from: e */
    private final C58833ax m160205e(Class cls) {
        C23056g a = this.f270483c.mo28620a();
        return cls.isInstance(a) ? C58833ax.m90834k(cls.cast(a)) : C58836b.f156633a;
    }

    /* renamed from: f */
    private final void m160206f(Class cls, C23109a aVar) {
        C58833ax e = m160205e(cls);
        if (e.mo56113h()) {
            aVar.mo28347a(e.mo56107c());
        }
    }

    /* renamed from: a */
    public final void mo90309a() {
        if (this.f270485e != 3) {
            C59104x d = f270481a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MCSurfaceProxy");
            ((C59052c) ((C59052c) d).mo56372aa(20847)).mo56386p("Received reactivate event while not in an active state.");
            int i = C90755l.f253831a;
        }
        if (this.f270484d == this.f270485e) {
            m160206f(C87363d.class, C96680h.f270480a);
        }
    }

    /* renamed from: b */
    public final void mo90310b() {
        if (!this.f270483c.mo28632m()) {
            C59104x d = f270481a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MCSurfaceProxy");
            ((C59052c) ((C59052c) d).mo56372aa(20848)).mo56386p("Cannot send state changes while controller is not ready.");
            int i = C90755l.f253831a;
            return;
        }
        int i2 = this.f270484d;
        int i3 = this.f270485e;
        if (i2 != i3) {
            if (i2 == 2 && i3 == 4) {
                m160206f(C87360a.class, C96675c.f270475a);
                m160206f(C87362c.class, C96676d.f270476a);
            } else {
                if (i2 == 2) {
                    if (i3 == 3) {
                        m160206f(C87360a.class, C96675c.f270475a);
                    } else {
                        i2 = 2;
                    }
                }
                if (i3 == 2) {
                    m160206f(C87361b.class, C96677e.f270477a);
                } else if (i2 == 3 && i3 == 4) {
                    m160206f(C87362c.class, C96676d.f270476a);
                } else if (i2 == 4 && i3 == 3) {
                    m160206f(C87364e.class, C96678f.f270478a);
                } else {
                    String valueOf = String.valueOf(this.f270482b.f235926a);
                    int i4 = this.f270484d;
                    String str = "null";
                    String num = i4 != 0 ? Integer.toString(i4 - 1) : str;
                    int i5 = this.f270485e;
                    if (i5 != 0) {
                        str = Integer.toString(i5 - 1);
                    }
                    throw new IllegalStateException(valueOf + " invalid state transition: " + num + " -> " + str);
                }
            }
            this.f270484d = this.f270485e;
        }
    }

    /* renamed from: c */
    public final boolean mo90311c() {
        if (this.f270485e != 3) {
            C59104x d = f270481a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MCSurfaceProxy");
            ((C59052c) ((C59052c) d).mo56372aa(20849)).mo56386p("Received back event while not in an active state.");
            int i = C90755l.f253831a;
        }
        if (this.f270484d != this.f270485e) {
            return false;
        }
        C58833ax e = m160205e(C23051b.class);
        if (e.mo56113h()) {
            return ((C23051b) e.mo56107c()).mo28488iF();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo90312d(int i) {
        this.f270485e = i;
        if (this.f270484d != i) {
            if (!this.f270483c.mo28631l()) {
                C23186f fVar = this.f270483c;
                C87365b bVar = this.f270482b;
                fVar.mo28623d(bVar.f235926a, bVar.f235927b);
            }
            if (this.f270483c.mo28632m()) {
                mo90310b();
            }
        }
    }
}
