package com.google.android.apps.search.googleapp.silkpane;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.e */
/* compiled from: PG */
public final class C139283e extends C139284f implements C45987ay {

    /* renamed from: a */
    public static final C59071e f378839a = C59071e.m91332i("com.google.android.apps.search.googleapp.silkpane.e");

    /* renamed from: b */
    public final SilkPaneActivity f378840b;

    /* renamed from: d */
    private final C139272a f378841d;

    /* renamed from: e */
    private final C28310af f378842e;

    /* renamed from: f */
    private final C136226a f378843f;

    public C139283e(SilkPaneActivity silkPaneActivity, C45989b bVar, C139272a aVar, C28310af afVar, C136226a aVar2, C133155c cVar) {
        this.f378840b = silkPaneActivity;
        this.f378841d = aVar;
        this.f378842e = afVar;
        this.f378843f = aVar2;
        cVar.mo110998a(silkPaneActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        ((C59052c) ((C59052c) f378839a.mo56224b()).mo56372aa(41359)).mo56386p("onAccountChanged");
        this.f378843f.mo112853b(awVar);
        C139280b bVar = C139280b.f378830g;
        try {
            C139272a aVar = this.f378841d;
            Intent intent = this.f378840b.getIntent();
            if (!intent.hasExtra("EXTRA_OPEN_SILK_PANE_PARAMS")) {
                bVar = C139280b.f378830g;
            } else {
                bVar = (C139280b) ProtoParsers.m95519b(intent, "EXTRA_OPEN_SILK_PANE_PARAMS", C139280b.f378830g, aVar.f378804a);
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f378839a.mo56225c()).mo56382g(e)).mo56372aa(41360)).mo56386p("Failed to get params proto");
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C139303y yVar = new C139303y();
        C68324h.m98669f(yVar);
        C47247a.m84047b(yVar, accountId);
        C47243l.m84039a(yVar, bVar);
        C0154a aVar2 = new C0154a(this.f378840b.f727a.f739a.f744e);
        aVar2.mo689v(R.id.googleapp_silk_pane_activity_container, yVar, "silk_fragment_tag");
        aVar2.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f378839a.mo56226d()).mo56382g(th)).mo56372aa(41361)).mo56386p("onAccountError");
        this.f378840b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f378842e.f76997b.mo33800a(C28427h.m53115a(106879));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(120898));
        a.mo33810c(this.f378840b);
    }
}
