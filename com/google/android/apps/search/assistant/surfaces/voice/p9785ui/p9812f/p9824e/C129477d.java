package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9824e;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.e.d */
/* compiled from: PG */
final class C129477d implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129478e f355479a;

    /* renamed from: b */
    private final C129476c f355480b;

    public C129477d(C129478e eVar, C129476c cVar) {
        this.f355479a = eVar;
        this.f355480b = cVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C129478e.f355481a.mo56225c()).mo56382g(th)).mo56372aa(38564)).mo56386p("Failed to get  chips data from the data service.");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C65559q qVar = (C65559q) obj;
        if (qVar.equals(C65559q.f178162b)) {
            ((C59052c) ((C59052c) C129478e.f355481a.mo56226d()).mo56372aa(38565)).mo56386p("Received empty chip group. No chip rendered.");
            return;
        }
        C129478e eVar = this.f355479a;
        if (((C129430c) eVar.f355482b.getChildFragmentManager().f634a.mo670b(R.id.assistant_input_chips_group)) == null) {
            AccountId accountId = eVar.f355483c;
            C129442i iVar = (C129442i) C129443j.f355415c.createBuilder();
            iVar.copyOnWrite();
            C129443j jVar = (C129443j) iVar.instance;
            qVar.getClass();
            jVar.f355418b = qVar;
            jVar.f355417a |= 1;
            C129430c a = C129437d.m211329a(accountId, (C129443j) iVar.build());
            C0154a aVar = new C0154a(eVar.f355482b.getChildFragmentManager());
            aVar.mo511h(R.id.assistant_input_chips_group, a, (String) null, 1);
            aVar.mo509f();
        }
        View requireView = this.f355480b.requireView();
        requireView.findViewById(R.id.assistant_input_chips_group).setVisibility(0);
        requireView.findViewById(R.id.assistant_input_greeting_logo_next_to_text).setVisibility(0);
        requireView.findViewById(R.id.assistant_input_greeting_logo).setVisibility(8);
    }
}
