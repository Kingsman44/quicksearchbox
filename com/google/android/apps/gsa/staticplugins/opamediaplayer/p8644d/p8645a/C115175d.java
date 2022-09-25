package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115461e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115463g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C115175d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115179h f319646a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f319647b;

    public /* synthetic */ C115175d(C115179h hVar, C58833ax axVar) {
        this.f319646a = hVar;
        this.f319647b = axVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115463g gVar;
        C115179h hVar = this.f319646a;
        C58833ax axVar = this.f319647b;
        C89062r rVar = (C89062r) obj;
        C58833ax axVar2 = (C58833ax) ((C23251a) hVar.f319655c.mo101874e()).f63720e;
        if (!hVar.f63405W.mo28420E() && axVar2.mo56113h() && ((C115466j) axVar2.mo56107c()).f320308c && !((C58833ax) ((C23251a) hVar.f319655c.mo101872c()).f63720e).mo56113h()) {
            C115461e eVar = (C115461e) C115464h.f320300c.createBuilder();
            if (!rVar.mo83040a()) {
                C115463g gVar2 = C115463g.NETWORK_ERROR;
                eVar.copyOnWrite();
                C115464h hVar2 = (C115464h) eVar.instance;
                hVar2.f320303b = gVar2.f320299d;
                hVar2.f320302a |= 1;
            } else {
                if (!axVar.mo56113h() || ((Integer) axVar.mo56107c()).intValue() != 11) {
                    gVar = C115463g.UNKNOWN_ERROR;
                } else {
                    gVar = C115463g.END_OF_QUEUE_ERROR;
                }
                eVar.copyOnWrite();
                C115464h hVar3 = (C115464h) eVar.instance;
                hVar3.f320303b = gVar.f320299d;
                hVar3.f320302a |= 1;
            }
            ((C23251a) hVar.f319655c.mo101872c()).mo28730f(C58833ax.m90834k((C115464h) eVar.build()), false);
        }
    }
}
