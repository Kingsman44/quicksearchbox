package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90249d;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105434d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.at */
/* compiled from: PG */
public final /* synthetic */ class C105198at implements C90249d {

    /* renamed from: a */
    public final /* synthetic */ boolean f293406a;

    /* renamed from: b */
    public final /* synthetic */ C105435e f293407b;

    public /* synthetic */ C105198at(boolean z, C105435e eVar) {
        this.f293406a = z;
        this.f293407b = eVar;
    }

    /* renamed from: a */
    public final void mo83967a(C58833ax axVar) {
        int i;
        C105434d dVar;
        boolean z = this.f293406a;
        C105435e eVar = this.f293407b;
        if (axVar.mo56113h()) {
            if (z) {
                i = ((DoodleData) axVar.mo56107c()).f252934O;
            } else {
                i = ((DoodleData) axVar.mo56107c()).f252932M;
            }
            C23251a aVar = ((C105309z) eVar).f293827b;
            if (i == 3) {
                dVar = C105434d.ALWAYS_LIGHT;
            } else {
                dVar = C105434d.ALWAYS_DARK;
            }
            aVar.mo28730f(C58833ax.m90834k(dVar), false);
            return;
        }
        ((C105309z) eVar).f293827b.mo28730f(C58836b.f156633a, false);
    }
}
