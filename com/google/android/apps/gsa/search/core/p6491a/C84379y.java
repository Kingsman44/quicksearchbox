package com.google.android.apps.gsa.search.core.p6491a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.a.y */
/* compiled from: PG */
public final class C84379y extends C22695ah {

    /* renamed from: b */
    private static final C59071e f229635b = C59071e.m91332i("com.google.android.apps.gsa.search.core.a.y");

    /* renamed from: c */
    private final C86610af f229636c;

    /* renamed from: d */
    private final C91093c f229637d;

    public C84379y(C86610af afVar, C91093c cVar) {
        this.f229636c = afVar;
        this.f229637d = cVar;
    }

    /* renamed from: a */
    public final boolean mo27807a(Intent intent) {
        intent.putExtra("extra_accl_intent", true);
        if (!this.f229636c.mo80227h()) {
            return this.f229637d.mo65089a(intent);
        }
        C87684al alVar = new C87684al(C88244um.START_ACTIVITY);
        alVar.mo81966c(intent);
        this.f229636c.mo80228i(alVar.mo81964a());
        return true;
    }

    /* renamed from: d */
    public final boolean mo27810d(Intent intent, C22694ag agVar) {
        if (agVar != C22695ah.f62473a) {
            ((C59052c) ((C59052c) f229635b.mo56226d()).mo56372aa(7534)).mo56386p("startActivityForResult currently only supports NO_OP_RESULT_CALLBACK.");
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
