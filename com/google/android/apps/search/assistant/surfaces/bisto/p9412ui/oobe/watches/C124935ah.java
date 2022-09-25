package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124843bn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124847br;
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
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ah */
/* compiled from: PG */
public final class C124935ah implements C46851e, C46852f {

    /* renamed from: f */
    private static final C59071e f344716f = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ah");

    /* renamed from: a */
    public final GacsDataLayerInitFragment f344717a;

    /* renamed from: b */
    public final C46855i f344718b;

    /* renamed from: c */
    public final C124844bo f344719c;

    /* renamed from: d */
    public final C124848bs f344720d;

    /* renamed from: e */
    public C46854h f344721e;

    /* renamed from: g */
    private final AccountId f344722g;

    /* renamed from: h */
    private final C46485f f344723h;

    /* renamed from: i */
    private final C124977x f344724i;

    /* renamed from: j */
    private final C47770dh f344725j;

    public C124935ah(AccountId accountId, C124848bs bsVar, GacsDataLayerInitFragment gacsDataLayerInitFragment, C124977x xVar, C46855i iVar, C47770dh dhVar, C46485f fVar) {
        this.f344722g = accountId;
        this.f344720d = bsVar;
        this.f344717a = gacsDataLayerInitFragment;
        this.f344718b = iVar;
        this.f344723h = fVar;
        C124844bo boVar = bsVar.f344439b;
        this.f344719c = boVar == null ? C124844bo.f344417m : boVar;
        this.f344724i = xVar;
        this.f344725j = dhVar;
    }

    /* renamed from: d */
    private final void m204825d() {
        ((OobeActivityViewModel) new C2368bp(this.f344717a.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("GacsDataLayerInit-Failed");
        C44581b b = C124849bt.m204631b(this.f344717a.requireContext());
        b.mo47604w(R.string.assistant_bisto_connect_error_title);
        b.mo47597p(R.string.assistant_bisto_connect_error_message);
        b.mo47601t(R.string.assistant_bisto_try_again_button, new C47752cq(this.f344725j, "retry", new C124933af(this)));
        b.mo47598q(R.string.assistant_bisto_generic_cancel_button, new C47752cq(this.f344725j, "cancel", new C124934ag(this)));
        b.create().show();
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return new C46885y("assistant.bisto.GacsDataLayerInit");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C124977x xVar = this.f344724i;
        C124844bo boVar = this.f344720d.f344439b;
        if (boVar == null) {
            boVar = C124844bo.f344417m;
        }
        String str = boVar.f344420b;
        C124844bo boVar2 = this.f344720d.f344439b;
        if (boVar2 == null) {
            boVar2 = C124844bo.f344417m;
        }
        return C47633f.m84733g(((OobeActivityViewModel) new C2368bp(this.f344717a.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106638b(this.f344722g)).mo51516i(new C124974u(xVar, str, boVar2.f344422d), xVar.f344840d);
    }

    /* renamed from: c */
    public final void mo106737c(C124848bs bsVar) {
        this.f344723h.mo50482c(this.f344717a).mo50509e(R.id.assistant_bisto_oobe_next, bsVar);
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = f344716f.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsDataLayerInitFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36388)).mo56384n();
        m204825d();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        String str;
        C124979z zVar = (C124979z) obj;
        C59104x b = f344716f.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsDataLayerInitFrag");
        ((C59052c) ((C59052c) b).mo56372aa(36389)).mo56386p("Received DataLayerInfo");
        if (zVar.f344852d) {
            OobeActivityViewModel oobeActivityViewModel = (OobeActivityViewModel) new C2368bp(this.f344717a.requireActivity()).mo5770a(OobeActivityViewModel.class);
            C63138d dVar = zVar.f344851c;
            if (dVar == null) {
                dVar = C63138d.f170494j;
            }
            if (dVar.f170504i) {
                oobeActivityViewModel.mo106637a().mo106662b("GacsDataLayerInit-GacslessOobeSupported");
            }
            oobeActivityViewModel.f344277d = zVar;
            C63138d dVar2 = zVar.f344851c;
            if (dVar2 == null) {
                dVar2 = C63138d.f170494j;
            }
            C124825a a = oobeActivityViewModel.mo106637a();
            String str2 = dVar2.f170497b;
            C124827c cVar = (C124827c) a;
            if (cVar.f344388d) {
                C59104x d = C124827c.f344384a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                ((C59052c) ((C59052c) d).mo56372aa(36370)).mo56386p("session ended already");
            }
            cVar.f344390f = true;
            cVar.mo106664d(cVar.mo106663c(str2, (C124679cr) null));
            if ((dVar2.f170496a & 32) != 0) {
                String str3 = dVar2.f170503h;
                if (cVar.f344388d) {
                    C59104x d2 = C124827c.f344384a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                    ((C59052c) ((C59052c) d2).mo56372aa(36368)).mo56386p("session ended already");
                }
                C60291nd ndVar = (C60291nd) C60292ne.f163113l.createBuilder();
                ndVar.copyOnWrite();
                C60292ne neVar = (C60292ne) ndVar.instance;
                str3.getClass();
                neVar.f163115a |= 2048;
                neVar.f163124j = str3;
                cVar.mo106664d(ndVar);
            }
            if ((dVar2.f170496a & 16) != 0) {
                String str4 = dVar2.f170502g;
                if (cVar.f344388d) {
                    C59104x d3 = C124827c.f344384a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                    ((C59052c) ((C59052c) d3).mo56372aa(36369)).mo56386p("session ended already");
                }
                C60291nd ndVar2 = (C60291nd) C60292ne.f163113l.createBuilder();
                ndVar2.copyOnWrite();
                C60292ne neVar2 = (C60292ne) ndVar2.instance;
                str4.getClass();
                neVar2.f163115a |= 4096;
                neVar2.f163125k = str4;
                cVar.mo106664d(ndVar2);
            }
            if ((dVar2.f170496a & 1) != 0) {
                str = dVar2.f170497b;
            } else {
                str = this.f344719c.f344421c;
            }
            C124847br brVar = (C124847br) this.f344720d.toBuilder();
            C124843bn bnVar = (C124843bn) this.f344719c.toBuilder();
            bnVar.copyOnWrite();
            C124844bo boVar = (C124844bo) bnVar.instance;
            str.getClass();
            boVar.f344419a |= 2;
            boVar.f344421c = str;
            brVar.copyOnWrite();
            C124848bs bsVar = (C124848bs) brVar.instance;
            C124844bo boVar2 = (C124844bo) bnVar.build();
            boVar2.getClass();
            bsVar.f344439b = boVar2;
            bsVar.f344438a |= 1;
            mo106737c((C124848bs) brVar.build());
            return;
        }
        m204825d();
    }
}
