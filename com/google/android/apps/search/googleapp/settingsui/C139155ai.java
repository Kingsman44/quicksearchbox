package com.google.android.apps.search.googleapp.settingsui;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139146j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.logging.p3046g.C39196b;
import com.google.android.libraries.social.populous.android.C42181t;
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
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.amk;
import com.google.common.p4552o.aml;
import com.google.protobuf.C62940bt;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ai */
/* compiled from: PG */
public final class C139155ai implements C45987ay {

    /* renamed from: e */
    private static final C59071e f378464e = C59071e.m91331h();

    /* renamed from: a */
    public final SettingsActivity f378465a;

    /* renamed from: b */
    public final C133148g f378466b;

    /* renamed from: c */
    public final boolean f378467c;

    /* renamed from: d */
    public final boolean f378468d;

    /* renamed from: f */
    private final C136226a f378469f;

    /* renamed from: g */
    private final C28310af f378470g;

    /* renamed from: h */
    private final C28306ab f378471h;

    /* renamed from: i */
    private final C139695b f378472i;

    /* renamed from: j */
    private final C139146j f378473j;

    public C139155ai(SettingsActivity settingsActivity, C136226a aVar, C28310af afVar, C28306ab abVar, C139695b bVar, C133155c cVar, C45989b bVar2, C139146j jVar, C133148g gVar, boolean z, boolean z2) {
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(bVar, "sourceReader");
        C69664n.m101061g(bVar2, "accountController");
        this.f378465a = settingsActivity;
        this.f378469f = aVar;
        this.f378470g = afVar;
        this.f378471h = abVar;
        this.f378472i = bVar;
        this.f378473j = jVar;
        this.f378466b = gVar;
        this.f378467c = z;
        this.f378468d = z2;
        cVar.mo110998a(settingsActivity, this, bVar2);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C139143g gVar;
        this.f378469f.mo112853b(awVar);
        Intent intent = this.f378465a.getIntent();
        C139146j jVar = this.f378473j;
        C69664n.m101060f(intent, "intent");
        C69664n.m101061g(intent, "intent");
        if (!intent.hasExtra("SETTINGS_INTENT_OPTIONS")) {
            gVar = C139143g.f378433c;
            C69664n.m101060f(gVar, "getDefaultInstance()");
        } else {
            MessageLite b = ProtoParsers.m95519b(intent, "SETTINGS_INTENT_OPTIONS", C139143g.f378433c, jVar.f378442a);
            C69664n.m101060f(b, "get(\n      intent,\n     …tensionRegistryLite\n    )");
            gVar = (C139143g) b;
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C139164ar arVar = new C139164ar();
        C68324h.m98669f(arVar);
        C47247a.m84047b(arVar, accountId);
        C47243l.m84039a(arVar, gVar);
        C0154a aVar = new C0154a(this.f378465a.f727a.f739a.f744e);
        aVar.mo689v(R.id.googleapp_settings_content, arVar, (String) null);
        aVar.mo518o(arVar);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) f378464e.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41355));
        cVar.mo56386p("#onAccountError");
        this.f378465a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28423g a = C45954d.m82060a(axVar.f120816a);
        C28313c a2 = this.f378470g.mo33805a(C28427h.m53115a(146412));
        Optional a3 = this.f378472i.mo115169a();
        if (a3.isPresent()) {
            C62940bt btVar = C39196b.f103148a;
            amk amk = (amk) aml.f159155c.createBuilder();
            String str = (String) a3.get();
            amk.copyOnWrite();
            aml aml = (aml) amk.instance;
            str.getClass();
            aml.f159157a |= 1;
            aml.f159158b = str;
            a2.mo33858f(new C28353e(btVar, amk.build()));
        }
        C28306ab abVar = this.f378471h;
        SettingsActivity settingsActivity = this.f378465a;
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(146413));
        a2.mo33859g(a);
        int i = C28485y.f77298f;
        abVar.mo33801b(settingsActivity.mo1322k().mo1177e(16908290), a2);
    }
}
