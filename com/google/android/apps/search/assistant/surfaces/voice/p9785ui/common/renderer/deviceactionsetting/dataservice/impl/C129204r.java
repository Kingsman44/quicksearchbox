package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.net.Uri;
import androidx.slice.Slice;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129185c;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.r */
/* compiled from: PG */
final class C129204r implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ Uri f354908a;

    /* renamed from: b */
    final /* synthetic */ C129205s f354909b;

    public C129204r(C129205s sVar, Uri uri) {
        this.f354909b = sVar;
        this.f354908a = uri;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C46688af afVar;
        C59104x b = C129205s.f354910b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
        ((C59052c) ((C59052c) b).mo56372aa(38177)).mo56386p("#loadData.");
        C129205s sVar = this.f354909b;
        Uri uri = this.f354908a;
        Optional ofNullable = Optional.ofNullable((Slice) sVar.f354914f.get(uri));
        if (!ofNullable.isEmpty() || sVar.f354915g.get(uri) != null) {
            C59104x b2 = C129205s.f354910b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
            ((C59052c) ((C59052c) b2).mo56372aa(38180)).mo56389s("Slice data cache hit, slice: %s.", ofNullable.orElse(null));
            afVar = C46688af.m83205b(ofNullable, sVar.f354913e.mo26870b());
        } else {
            C59104x b3 = C129205s.f354910b.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
            ((C59052c) ((C59052c) b3).mo56372aa(38181)).mo56386p("Slice data cache miss.");
            afVar = C46688af.f121976a;
        }
        return new C46463o(new C60817ay(C60856cj.m92900i(afVar)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C59104x b = C129205s.f354910b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
        ((C59052c) ((C59052c) b).mo56372aa(38179)).mo56386p("#fetchAndStoreData.");
        C129205s sVar = this.f354909b;
        Uri uri = this.f354908a;
        C60870cx e = sVar.mo108904e(uri, 0);
        C129203q qVar = new C129203q(sVar, uri);
        return C60922j.m93044g(e, C47810es.m84963c(qVar), sVar.f354912d);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        C59071e eVar = C129205s.f354910b;
        C58976aa aaVar = C58975e.f156826a;
        return C129185c.f354868a;
    }
}
