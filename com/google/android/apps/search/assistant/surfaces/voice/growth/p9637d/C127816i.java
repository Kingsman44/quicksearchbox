package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129430c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129437d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129442i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129443j;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65559q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.i */
/* compiled from: PG */
final class C127816i implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C127817j f351795a;

    /* renamed from: b */
    private final C127815h f351796b;

    public C127816i(C127817j jVar, C127815h hVar) {
        this.f351795a = jVar;
        this.f351796b = hVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C127817j.f351797a.mo56225c()).mo56382g(th)).mo56372aa(37663)).mo56386p("Failed to get  chips data from the data service.");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C65559q qVar = (C65559q) obj;
        if (qVar.equals(C65559q.f178162b)) {
            ((C59052c) ((C59052c) C127817j.f351797a.mo56226d()).mo56372aa(37664)).mo56386p("Received empty chip group. No chip rendered.");
            return;
        }
        C127817j jVar = this.f351795a;
        if (((C129430c) jVar.f351799c.getChildFragmentManager().f634a.mo670b(R.id.assistant_input_trysaying_chips_group)) == null) {
            AccountId accountId = jVar.f351800d;
            C129442i iVar = (C129442i) C129443j.f355415c.createBuilder();
            iVar.copyOnWrite();
            C129443j jVar2 = (C129443j) iVar.instance;
            qVar.getClass();
            jVar2.f355418b = qVar;
            jVar2.f355417a |= 1;
            C129430c a = C129437d.m211329a(accountId, (C129443j) iVar.build());
            C0154a aVar = new C0154a(jVar.f351799c.getChildFragmentManager());
            aVar.mo511h(R.id.assistant_input_trysaying_chips_group, a, (String) null, 1);
            aVar.mo509f();
        }
        View requireView = this.f351796b.requireView();
        requireView.findViewById(R.id.assistant_input_trysaying_chips_group).setVisibility(0);
        requireView.findViewById(R.id.assistant_input_trysaying_top_space).setVisibility(8);
    }
}
