package com.google.android.apps.gsa.search.core.service.p6848e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7184t.C91094d;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.service.e.l */
/* compiled from: PG */
public final class C86690l implements C91097g {

    /* renamed from: a */
    private static final C59071e f234180a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.e.l");

    /* renamed from: b */
    private final C86683e f234181b;

    /* renamed from: c */
    private final C91097g f234182c;

    public C86690l(C91097g gVar, C86683e eVar) {
        this.f234182c = gVar;
        this.f234181b = eVar;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        C87682aj ajVar = this.f234181b.f234157a;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.START_ACTIVITY);
            alVar.mo81966c(intent);
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
            return true;
        }
        ((C59052c) ((C59052c) f234180a.mo56226d()).mo56372aa(8494)).mo56386p("No client: starting activity from SearchService context");
        return this.f234182c.mo65089a(intent);
    }

    /* renamed from: b */
    public final boolean mo65090b(Intent intent, C91096f fVar) {
        return this.f234182c.mo65090b(intent, fVar);
    }

    /* renamed from: c */
    public final boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        return this.f234182c.mo65091c(intentSender, fVar);
    }

    /* renamed from: d */
    public final boolean mo65092d() {
        return this.f234182c.mo65092d();
    }

    /* renamed from: e */
    public final boolean mo65093e() {
        return this.f234182c.mo65093e();
    }

    /* renamed from: f */
    public final /* synthetic */ void mo65094f(Intent intent, Bundle bundle) {
        C91094d.m148838a(this, intent, bundle);
    }
}
