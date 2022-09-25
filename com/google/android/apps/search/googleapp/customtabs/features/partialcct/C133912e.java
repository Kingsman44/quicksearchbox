package com.google.android.apps.search.googleapp.customtabs.features.partialcct;

import android.content.Context;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.partialcct.e */
/* compiled from: PG */
public final class C133912e extends C133913f implements C45987ay {

    /* renamed from: a */
    public static final C59071e f364733a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.partialcct.e");

    /* renamed from: b */
    public final Context f364734b;

    /* renamed from: c */
    public final PartialCctScrimActivity f364735c;

    /* renamed from: d */
    public final C133148g f364736d;

    /* renamed from: f */
    private final C28306ab f364737f;

    public C133912e(Context context, PartialCctScrimActivity partialCctScrimActivity, C45989b bVar, C133155c cVar, C133148g gVar, C28306ab abVar) {
        this.f364734b = context;
        this.f364735c = partialCctScrimActivity;
        this.f364736d = gVar;
        this.f364737f = abVar;
        cVar.mo110998a(partialCctScrimActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f364735c.mo1322k().mo1177e(R.id.googleapp_partial_cct_background).setOnClickListener(new C133911d(this, awVar));
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364733a.mo56226d()).mo56382g(th)).mo56372aa(40181)).mo56386p("#onAccountError");
        this.f364735c.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f364737f;
        PartialCctScrimActivity partialCctScrimActivity = this.f364735c;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(158938));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(158937));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(partialCctScrimActivity.mo1322k().mo1177e(16908290), a);
    }
}
