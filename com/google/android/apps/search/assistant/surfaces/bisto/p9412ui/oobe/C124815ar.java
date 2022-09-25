package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ar */
/* compiled from: PG */
public final class C124815ar {

    /* renamed from: a */
    public static final C59071e f344353a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ar");

    /* renamed from: k */
    private static final Duration f344354k = Duration.ofSeconds(10);

    /* renamed from: b */
    public final C124848bs f344355b;

    /* renamed from: c */
    public final InitSetupFragment f344356c;

    /* renamed from: d */
    public final C124729a f344357d;

    /* renamed from: e */
    public final C46801dp f344358e;

    /* renamed from: f */
    public final AccountId f344359f;

    /* renamed from: g */
    public final C46439e f344360g;

    /* renamed from: h */
    public final OobeActivityViewModel f344361h;

    /* renamed from: i */
    public C46440f f344362i;

    /* renamed from: j */
    public Optional f344363j = Optional.empty();

    /* renamed from: l */
    private final C46485f f344364l;

    /* renamed from: m */
    private final C60888db f344365m;

    public C124815ar(InitSetupFragment initSetupFragment, C124848bs bsVar, C124729a aVar, C46801dp dpVar, C46439e eVar, C60888db dbVar, C46485f fVar, AccountId accountId) {
        this.f344356c = initSetupFragment;
        this.f344355b = bsVar;
        this.f344357d = aVar;
        this.f344358e = dpVar;
        this.f344360g = eVar;
        this.f344365m = dbVar;
        this.f344364l = fVar;
        this.f344359f = accountId;
        this.f344361h = (OobeActivityViewModel) new C2368bp(initSetupFragment.requireActivity()).mo5770a(OobeActivityViewModel.class);
    }

    /* renamed from: a */
    public final void mo106652a() {
        C58976aa aaVar = C58975e.f156826a;
        OobeActivityViewModel oobeActivityViewModel = this.f344361h;
        C124844bo boVar = this.f344355b.f344439b;
        if (boVar == null) {
            boVar = C124844bo.f344417m;
        }
        Optional optional = this.f344363j;
        if (oobeActivityViewModel.f344278e != null) {
            ((C59052c) ((C59052c) OobeActivityViewModel.f344274a.mo56224b()).mo56372aa(36345)).mo56386p("overwrite OOBE logger");
        }
        oobeActivityViewModel.f344278e = oobeActivityViewModel.f344280g.a(Optional.empty(), Optional.m71637of(boVar), optional);
        C124825a aVar = oobeActivityViewModel.f344278e;
        this.f344361h.mo106637a().mo106662b("start-tng-oobe");
        this.f344364l.mo50482c(this.f344356c).mo50509e(R.id.assistant_bisto_oobe_next, this.f344355b);
    }

    /* renamed from: b */
    public final void mo106653b() {
        C46439e eVar = this.f344360g;
        C46438d dVar = new C46438d(C60856cj.m92908q(this.f344361h.mo106638b(this.f344359f), f344354k.getSeconds(), TimeUnit.SECONDS, this.f344365m));
        C46440f fVar = this.f344362i;
        fVar.getClass();
        eVar.mo50428h(dVar.f121541a, (Object) null, fVar);
    }
}
