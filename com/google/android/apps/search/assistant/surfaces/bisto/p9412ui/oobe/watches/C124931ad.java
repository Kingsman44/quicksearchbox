package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ad */
/* compiled from: PG */
public final class C124931ad implements C46852f, C46851e {

    /* renamed from: h */
    private static final C59071e f344702h = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ad");

    /* renamed from: a */
    public final C124848bs f344703a;

    /* renamed from: b */
    public final GacsConnectFragment f344704b;

    /* renamed from: c */
    public final C46855i f344705c;

    /* renamed from: d */
    public final AccountId f344706d;

    /* renamed from: e */
    public final C60950i f344707e;

    /* renamed from: f */
    public Instant f344708f;

    /* renamed from: g */
    public C46854h f344709g;

    /* renamed from: i */
    private final C124729a f344710i;

    /* renamed from: j */
    private final C46485f f344711j;

    /* renamed from: k */
    private final C47770dh f344712k;

    /* renamed from: l */
    private final AtomicBoolean f344713l = new AtomicBoolean(true);

    public C124931ad(C124729a aVar, C124848bs bsVar, GacsConnectFragment gacsConnectFragment, C46855i iVar, AccountId accountId, C46485f fVar, C47770dh dhVar, C60950i iVar2) {
        this.f344703a = bsVar;
        this.f344704b = gacsConnectFragment;
        this.f344705c = iVar;
        this.f344710i = aVar;
        this.f344706d = accountId;
        this.f344711j = fVar;
        this.f344712k = dhVar;
        this.f344707e = iVar2;
        this.f344708f = iVar2.mo57444a();
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return new C46885y("assistant.bisto.GacsConnectFragment");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C124979z zVar = ((OobeActivityViewModel) new C2368bp(this.f344704b.requireActivity()).mo5770a(OobeActivityViewModel.class)).f344277d;
        if ((zVar.f344849a & 1) != 0) {
            C124729a aVar = this.f344710i;
            C124844bo boVar = this.f344703a.f344439b;
            if (boVar == null) {
                boVar = C124844bo.f344417m;
            }
            return aVar.mo106599e(boVar.f344420b, this.f344713l.getAndSet(false), zVar);
        }
        throw new IllegalStateException("gacsPsk is null");
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = f344702h.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsConnectFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36386)).mo56386p("Failed");
        C124825a a = ((OobeActivityViewModel) new C2368bp(this.f344704b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a();
        a.mo106662b("GacsConnectFragment-Failed");
        Instant instant = this.f344708f;
        instant.getClass();
        Duration between = Duration.between(instant, this.f344707e.mo57444a());
        C60103kw kwVar = ((C124827c) a).f344386b;
        long millis = between.toMillis();
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162533a |= 32768;
        kzVar.f162545m = (int) millis;
        C44581b b = C124849bt.m204631b(this.f344704b.requireContext());
        b.mo47604w(R.string.assistant_bisto_connect_error_title);
        b.mo47597p(R.string.assistant_bisto_connect_error_message);
        b.mo47601t(R.string.assistant_bisto_try_again_button, new C47752cq(this.f344712k, "retry", new C124929ab(this)));
        b.mo47598q(R.string.assistant_bisto_generic_cancel_button, new C47752cq(this.f344712k, "cancel", new C124930ac(this)));
        b.create().show();
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C124679cr crVar = (C124679cr) obj;
        C58976aa aaVar = C58975e.f156826a;
        C124825a a = ((OobeActivityViewModel) new C2368bp(this.f344704b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a();
        a.mo106662b("GacsConnectFragment-Success");
        Instant instant = this.f344708f;
        instant.getClass();
        Duration between = Duration.between(instant, this.f344707e.mo57444a());
        C60103kw kwVar = ((C124827c) a).f344386b;
        long millis = between.toMillis();
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162533a |= 16384;
        kzVar.f162544l = (int) millis;
        this.f344711j.mo50482c(this.f344704b).mo50509e(R.id.assistant_bisto_oobe_next, this.f344703a);
    }
}
