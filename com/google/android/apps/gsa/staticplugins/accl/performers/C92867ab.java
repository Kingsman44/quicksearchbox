package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ab */
/* compiled from: PG */
public final class C92867ab extends C22538o {

    /* renamed from: a */
    private final C92866aa f259090a;

    public C92867ab(C92866aa aaVar) {
        this.f259090a = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("gacs_accessory.TTS_OUTPUT")) {
            C92866aa aaVar = this.f259090a;
            C59104x b = C92866aa.f259086a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsTtsPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13067)).mo56386p("Received client op");
            C22407c cVar = (C22407c) eVar;
            if (!cVar.f61902d.mo56113h() || !((Boolean) ((C58833ax) aaVar.f259088c.mo27525b()).mo56106b(C93235y.f259994a).mo56109e(false)).booleanValue() || !((C58833ax) aaVar.f259087b.mo27525b()).mo56113h()) {
                return C60856cj.m92900i(C22402a.f61894b);
            }
            return aaVar.f259089d.mo28210j(((C22585l) cVar.f61902d.mo56107c()).f62230d, "gacs-tts-future", new C93236z(aaVar));
        }
        throw new C22428d(dyVar);
    }
}
