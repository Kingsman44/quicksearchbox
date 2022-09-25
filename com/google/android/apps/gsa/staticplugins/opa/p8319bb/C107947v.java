package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.v */
/* compiled from: PG */
public final class C107947v extends C22695ah {

    /* renamed from: b */
    private static final C59071e f300373b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.v");

    /* renamed from: c */
    private final C68214a f300374c;

    /* renamed from: d */
    private final C108100a f300375d;

    /* renamed from: e */
    private final C91093c f300376e;

    /* renamed from: f */
    private final C68214a f300377f;

    /* renamed from: g */
    private final Optional f300378g;

    public C107947v(C68214a aVar, Context context, C68214a aVar2, C108100a aVar3, Optional optional) {
        this.f300374c = aVar;
        this.f300376e = new C91093c(context);
        this.f300375d = aVar3;
        this.f300377f = aVar2;
        this.f300378g = optional;
    }

    /* renamed from: a */
    public final boolean mo27807a(Intent intent) {
        if ((!((C86124t) this.f300377f.mo27525b()).mo79746e(C90014bt.f247382gB) || !((C86124t) this.f300377f.mo27525b()).mo79746e(C90014bt.f247182cN) || !this.f300375d.mo96448m()) && !this.f300375d.mo96449n() && this.f300378g.isPresent() && ((C74720bx) this.f300378g.get()).mo71089f().a()) {
            if (((C86124t) this.f300377f.mo27525b()).mo79746e(C90066dr.f249697t)) {
                intent.putExtra("extra_accl_intent", true);
            }
            return this.f300376e.mo65089a(intent);
        }
        intent.putExtra("extra_accl_intent", true);
        C87684al alVar = new C87684al(C88244um.START_ACTIVITY);
        alVar.mo81966c(intent);
        ((C107932g) this.f300374c.mo27525b()).mo96337a(alVar.mo81964a());
        return true;
    }

    /* renamed from: b */
    public final boolean mo27808b(Intent intent) {
        intent.putExtra("com.google.opa.USE_VIS_INTENT_STARTER", true);
        return mo27807a(intent);
    }

    /* renamed from: c */
    public final boolean mo27809c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo27810d(Intent intent, C22694ag agVar) {
        if (agVar != C22695ah.f62473a) {
            ((C59052c) ((C59052c) f300373b.mo56226d()).mo56372aa(26112)).mo56386p("startActivityForResult currently only supports NO_OP_RESULT_CALLBACK.");
            int i = C90755l.f253831a;
            return false;
        }
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", true);
        return mo27807a(intent);
    }

    /* renamed from: e */
    public final boolean mo27811e() {
        return true;
    }
}
