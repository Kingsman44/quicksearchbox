package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129455b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128614c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128615d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128616e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128617f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b */
/* compiled from: PG */
public final class C129409b {

    /* renamed from: a */
    public final C129469d f355346a;

    /* renamed from: b */
    public final C129455b f355347b;

    /* renamed from: c */
    private final AccountId f355348c;

    public C129409b(C129469d dVar, AccountId accountId, C129455b bVar) {
        C69664n.m101061g(accountId, "accountId");
        this.f355346a = dVar;
        this.f355348c = accountId;
        this.f355347b = bVar;
    }

    /* renamed from: b */
    public static final Fragment m211277b(Fragment fragment) {
        return fragment.getChildFragmentManager().f634a.mo670b(R.id.assistant_feature_container);
    }

    /* renamed from: c */
    public static final void m211278c(Fragment fragment, Fragment fragment2) {
        C129400a aVar = new C129400a(fragment2, fragment);
        C0154a aVar2 = new C0154a(fragment.getChildFragmentManager());
        aVar.mo5761a(aVar2);
        aVar2.mo509f();
    }

    /* renamed from: a */
    public final C128614c mo109026a(int i) {
        if (i == 0) {
            return C128617f.m209910b(this.f355348c);
        }
        AccountId accountId = this.f355348c;
        C128615d dVar = (C128615d) C128616e.f353611c.createBuilder();
        dVar.copyOnWrite();
        C128616e eVar = (C128616e) dVar.instance;
        eVar.f353613a |= 1;
        eVar.f353614b = i;
        C62942bv build = dVar.build();
        C69664n.m101060f(build, "newBuilder().setFragment…tFeatureHeightPx).build()");
        return C128617f.m209909a(accountId, (C128616e) build);
    }
}
