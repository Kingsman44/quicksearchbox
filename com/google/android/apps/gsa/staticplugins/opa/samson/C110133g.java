package com.google.android.apps.gsa.staticplugins.opa.samson;

import android.os.Bundle;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.g */
/* compiled from: PG */
final class C110133g implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C58833ax f306898a;

    /* renamed from: b */
    final /* synthetic */ C110187j f306899b;

    /* renamed from: c */
    final /* synthetic */ C110229k f306900c;

    public C110133g(C110229k kVar, C58833ax axVar, C110187j jVar) {
        this.f306900c = kVar;
        this.f306898a = axVar;
        this.f306899b = jVar;
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        if (((z) obj) == z.a) {
            C59104x b = C110229k.f307144a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "IDModeServ");
            ((C59052c) ((C59052c) b).mo56372aa(25524)).mo56386p("dstatus observer -- cs nc, removing observer");
            C110229k kVar = this.f306900c;
            C87673aa aaVar = kVar.f307158m;
            if (aaVar != null) {
                aaVar.mo81934f();
                kVar.f307158m = null;
            }
            kVar.f307156k.f307024a.mo5679j(kVar.f307154i);
            ((C73798aa) this.f306898a.mo56107c()).mo65278b().mo5679j(this);
        } else if (this.f306900c.f307160o != null) {
            C59104x b2 = C110229k.f307144a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "IDModeServ");
            ((C59052c) ((C59052c) b2).mo56372aa(25522)).mo56386p("dstatus observer -- cs c, updating");
            this.f306900c.mo98490f();
            if (this.f306900c.mo98491g() && this.f306899b.f307024a.f6494c.f2977e <= 0) {
                C110229k kVar2 = this.f306900c;
                if (kVar2.f307158m == null) {
                    C87677ae aeVar = kVar2.f307155j;
                    C110187j jVar = kVar2.f307156k;
                    C88486g gVar = new C88486g();
                    gVar.f239199a = 0;
                    gVar.f239201c = amo.OPA_AMBIENT;
                    gVar.f239204f = "opa_ambient";
                    kVar2.f307158m = aeVar.mo81958a(jVar, (C90757ba) null, new ClientConfig(gVar));
                }
                if (!kVar2.f307158m.mo81951w()) {
                    kVar2.f307158m.mo81932c();
                }
                if (!kVar2.f307158m.mo81953y()) {
                    kVar2.f307158m.mo81947s((Bundle) null);
                }
                C2332ag agVar = this.f306899b.f307024a;
                C2333ah ahVar = this.f306900c.f307154i;
                ahVar.getClass();
                agVar.mo5705f(ahVar);
                this.f306900c.mo98489e();
            }
        }
    }
}
