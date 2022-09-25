package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.f */
/* compiled from: PG */
final class C104146f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ PrimaryAccountFixActivity f289701a;

    public C104146f(PrimaryAccountFixActivity primaryAccountFixActivity) {
        this.f289701a = primaryAccountFixActivity;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56382g(th)).mo56372aa(21823)).mo56386p("Failed to get token details.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Intent intent = ((C86053n) obj).f232634c;
        if (intent == null) {
            ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56226d()).mo56372aa(21825)).mo56386p("Recovery intent is null.");
            return;
        }
        ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56372aa(21824)).mo56389s("Starting recovery intent: %s", intent);
        this.f289701a.startActivity(intent);
    }
}
