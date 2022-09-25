package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124920q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4591e.p4592a.p4594b.p4595a.C61017a;
import com.google.p4591e.p4592a.p4594b.p4596b.C61022a;
import com.google.p4591e.p4592a.p4594b.p4596b.C61023b;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import com.google.p4591e.p4592a.p4594b.p4596b.C61026e;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba */
/* compiled from: PG */
public final class C124955ba {

    /* renamed from: a */
    public static final C46691ai f344775a = new C46885y("Bisto.VerifyJwtFragmentPeer.VERIFY_JWT");

    /* renamed from: i */
    private static final C59071e f344776i = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ba");

    /* renamed from: b */
    public final C124940am f344777b;

    /* renamed from: c */
    public final C46855i f344778c;

    /* renamed from: d */
    public final OobeActivityViewModel f344779d;

    /* renamed from: e */
    public final C124953az f344780e = new C124953az(this);

    /* renamed from: f */
    public final C124952ay f344781f = new C124952ay(this);

    /* renamed from: g */
    public final C61024c f344782g;

    /* renamed from: h */
    public final boolean f344783h;

    /* renamed from: j */
    private final VerifyJwtFragment f344784j;

    /* renamed from: k */
    private final C124848bs f344785k;

    /* renamed from: l */
    private final C46485f f344786l;

    public C124955ba(VerifyJwtFragment verifyJwtFragment, C124848bs bsVar, C124940am amVar, C46485f fVar, C46855i iVar) {
        this.f344784j = verifyJwtFragment;
        this.f344785k = bsVar;
        this.f344777b = amVar;
        this.f344786l = fVar;
        this.f344778c = iVar;
        this.f344779d = (OobeActivityViewModel) new C2368bp(verifyJwtFragment.requireActivity()).mo5770a(OobeActivityViewModel.class);
        C124844bo boVar = bsVar.f344439b;
        String str = (boVar == null ? C124844bo.f344417m : boVar).f344426h;
        C61024c cVar = null;
        if (!str.isEmpty()) {
            try {
                cVar = C61023b.m93323a(str, C61017a.f165234a, C61022a.class, C61026e.class);
            } catch (IOException | IllegalArgumentException e) {
                C59104x c = C124937aj.f344726a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "JwtParser");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36390)).mo56386p("Couldn't parse JWT");
            }
        }
        this.f344782g = cVar;
        this.f344783h = str.isEmpty();
    }

    /* renamed from: a */
    public final void mo106752a(Throwable th, String str) {
        C59104x d = f344776i.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VerifyJwtFragment");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36399)).mo56386p(str);
        C47393f.m84237h(new C124920q(str), this.f344784j.requireView());
    }

    /* renamed from: b */
    public final void mo106753b() {
        this.f344786l.mo50482c(this.f344784j).mo50509e(R.id.assistant_bisto_oobe_next, this.f344785k);
    }
}
