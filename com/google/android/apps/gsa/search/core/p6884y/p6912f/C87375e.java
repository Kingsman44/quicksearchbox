package com.google.android.apps.gsa.search.core.p6884y.p6912f;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6884y.p6888d.C87294b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88022mg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88023mh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88024mi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88033mr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88034ms;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88035mt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88036mu;
import com.google.android.libraries.gsa.monet.internal.service.C23004aa;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23037d;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23099b;
import com.google.android.libraries.gsa.util.ParcelableList;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.y.f.e */
/* compiled from: PG */
public final class C87375e implements C23004aa {

    /* renamed from: a */
    private final C87294b f235947a;

    /* renamed from: b */
    private boolean f235948b = false;

    public C87375e(C87294b bVar) {
        this.f235947a = bVar;
    }

    /* renamed from: a */
    public final void mo28405a(C23088b bVar) {
        if (!this.f235948b) {
            C58976aa aaVar = C58975e.f156826a;
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            C88022mg mgVar = C88022mg.f238025a;
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            mgVar.getClass();
            muVar.f238060b = mgVar;
            muVar.f238059a = 1;
            this.f235947a.mo80939a((C88036mu) mtVar.build(), C58833ax.m90834k(new ParcelableList(C58485gu.m89841i(bVar))));
        }
    }

    /* renamed from: b */
    public final void mo28406b() {
        this.f235948b = true;
    }

    /* renamed from: c */
    public final void mo28407c(Bundle bundle, String str, String str2) {
        if (!this.f235948b) {
            C58976aa aaVar = C58975e.f156826a;
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            C88023mh mhVar = (C88023mh) C88024mi.f238027d.createBuilder();
            mhVar.copyOnWrite();
            C88024mi miVar = (C88024mi) mhVar.instance;
            str.getClass();
            miVar.f238029a |= 1;
            miVar.f238030b = str;
            mhVar.copyOnWrite();
            C88024mi miVar2 = (C88024mi) mhVar.instance;
            str2.getClass();
            miVar2.f238029a |= 2;
            miVar2.f238031c = str2;
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            C88024mi miVar3 = (C88024mi) mhVar.build();
            miVar3.getClass();
            muVar.f238060b = miVar3;
            muVar.f238059a = 2;
            this.f235947a.mo80939a((C88036mu) mtVar.build(), C58833ax.m90834k(bundle));
        }
    }

    /* renamed from: d */
    public final void mo28408d(C23037d dVar) {
        if (!this.f235948b) {
            C58976aa aaVar = C58975e.f156826a;
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            dVar.getClass();
            muVar.f238060b = dVar;
            muVar.f238059a = 3;
            this.f235947a.mo80939a((C88036mu) mtVar.build(), C58836b.f156633a);
        }
    }

    /* renamed from: e */
    public final void mo28409e(String str, String str2) {
        if (!this.f235948b) {
            C58976aa aaVar = C58975e.f156826a;
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            C88033mr mrVar = (C88033mr) C88034ms.f238052d.createBuilder();
            mrVar.copyOnWrite();
            C88034ms msVar = (C88034ms) mrVar.instance;
            str.getClass();
            msVar.f238054a |= 1;
            msVar.f238055b = str;
            mrVar.copyOnWrite();
            C88034ms msVar2 = (C88034ms) mrVar.instance;
            msVar2.f238054a |= 2;
            msVar2.f238056c = str2;
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            C88034ms msVar3 = (C88034ms) mrVar.build();
            msVar3.getClass();
            muVar.f238060b = msVar3;
            muVar.f238059a = 13;
            this.f235947a.mo80939a((C88036mu) mtVar.build(), C58836b.f156633a);
        }
    }

    /* renamed from: f */
    public final void mo28410f(C23099b bVar) {
        if (!this.f235948b) {
            C58976aa aaVar = C58975e.f156826a;
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            bVar.getClass();
            muVar.f238060b = bVar;
            muVar.f238059a = 10;
            this.f235947a.mo80939a((C88036mu) mtVar.build(), C58836b.f156633a);
        }
    }
}
