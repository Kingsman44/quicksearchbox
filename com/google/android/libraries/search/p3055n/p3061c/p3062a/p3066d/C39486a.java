package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.hotword.service.HotwordService;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C39486a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39493h f104000a;

    public /* synthetic */ C39486a(C39493h hVar) {
        this.f104000a = hVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39493h hVar = this.f104000a;
        C39489d dVar = new C39489d(hVar, cVar);
        Intent b = HotwordService.m238802b(hVar.f104013b.getPackageName());
        hVar.f104018g = new C39492g(dVar, hVar.f104017f);
        hVar.f104013b.bindService(b, hVar.f104018g, 1);
        C59104x b2 = C39493h.f104012a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) b2).mo56372aa(53681)).mo56386p("#getHotwordInformation bindService");
        return "getHotwordInformation";
    }
}
