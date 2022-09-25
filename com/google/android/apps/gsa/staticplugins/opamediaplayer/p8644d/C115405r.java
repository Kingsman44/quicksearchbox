package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115461e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115463g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.r */
/* compiled from: PG */
public final /* synthetic */ class C115405r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115408u f320205a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f320206b;

    public /* synthetic */ C115405r(C115408u uVar, C58833ax axVar) {
        this.f320205a = uVar;
        this.f320206b = axVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115463g gVar;
        C115408u uVar = this.f320205a;
        C58833ax axVar = this.f320206b;
        C89062r rVar = (C89062r) obj;
        if (!uVar.f63405W.mo28420E() && ((C115466j) ((C23251a) uVar.f320212c.mo102037f()).f63720e).f320308c && !((C58833ax) ((C23251a) uVar.f320212c.mo102034c()).f63720e).mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            C115461e eVar = (C115461e) C115464h.f320300c.createBuilder();
            if (!rVar.mo83040a()) {
                C115463g gVar2 = C115463g.NETWORK_ERROR;
                eVar.copyOnWrite();
                C115464h hVar = (C115464h) eVar.instance;
                hVar.f320303b = gVar2.f320299d;
                hVar.f320302a |= 1;
            } else {
                if (!axVar.mo56113h() || ((Integer) axVar.mo56107c()).intValue() != 11) {
                    gVar = C115463g.UNKNOWN_ERROR;
                } else {
                    gVar = C115463g.END_OF_QUEUE_ERROR;
                }
                eVar.copyOnWrite();
                C115464h hVar2 = (C115464h) eVar.instance;
                hVar2.f320303b = gVar.f320299d;
                hVar2.f320302a |= 1;
            }
            ((C23251a) uVar.f320212c.mo102034c()).mo28730f(C58833ax.m90834k((C115464h) eVar.build()), false);
        }
    }
}
