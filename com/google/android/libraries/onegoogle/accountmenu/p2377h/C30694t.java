package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.app.Dialog;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.android.libraries.onegoogle.account.particle.C30234h;
import com.google.android.libraries.onegoogle.account.particle.C30237k;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2370f.C30603a;
import com.google.android.libraries.onegoogle.common.p2384a.C30900a;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.onegoogle.popovercontainer.C31026aa;
import com.google.android.libraries.onegoogle.popovercontainer.C31027ab;
import com.google.android.libraries.onegoogle.popovercontainer.C31028ac;
import com.google.android.libraries.onegoogle.popovercontainer.C31029ad;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.onegoogle.popovercontainer.C31033ah;
import com.google.android.libraries.onegoogle.popovercontainer.C31034ai;
import com.google.android.libraries.onegoogle.popovercontainer.C31035aj;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.libraries.onegoogle.popovercontainer.C31040b;
import com.google.android.libraries.onegoogle.popovercontainer.C31041c;
import com.google.android.libraries.onegoogle.popovercontainer.C31042d;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.t */
/* compiled from: PG */
public final class C30694t {

    /* renamed from: a */
    public final C30305n f82847a;

    /* renamed from: b */
    public final C30282k f82848b;

    /* renamed from: c */
    private final C31036ak f82849c;

    /* renamed from: d */
    private final C31032ag f82850d;

    /* renamed from: e */
    private final C31032ag f82851e;

    /* renamed from: f */
    private final C31032ag f82852f;

    /* renamed from: g */
    private final C31032ag f82853g;

    /* renamed from: h */
    private final C31032ag f82854h;

    /* renamed from: i */
    private final C31032ag f82855i;

    /* renamed from: j */
    private final C31032ag f82856j;

    /* renamed from: k */
    private final C31032ag f82857k;

    /* renamed from: l */
    private final C31032ag f82858l = C30681g.f82820a;

    /* renamed from: m */
    private int f82859m;

    public C30694t(C30305n nVar, C31036ak akVar, C63644b bVar) {
        C31035aj ajVar;
        C31034ai aiVar;
        C31033ah ahVar;
        C30897z zVar;
        int i;
        C30900a aVar;
        C58838bb.m90869d(nVar.mo35859j().mo36091c().isEmpty(), "Custom actions should be set using CollapsibleAccountManagementFeature and common actions using setCommonActions.");
        this.f82847a = nVar;
        this.f82849c = akVar;
        C30693s sVar = new C30693s(akVar);
        C31040b bVar2 = new C31040b();
        bVar2.f83611a = C31026aa.f83594a;
        bVar2.f83612b = C31027ab.f83595a;
        bVar2.f83613c = C31028ac.f83596a;
        boolean z = false;
        bVar2.mo36719a(false);
        bVar2.mo36720b(1);
        bVar2.f83614d = new C31029ad();
        bVar2.f83611a = new C30678d(this, akVar, sVar);
        bVar2.f83612b = new C30679e(this);
        bVar2.f83613c = new C30680f(this, akVar, sVar);
        C30897z o = nVar.mo35864o();
        if (o != null) {
            bVar2.f83614d = o;
            bVar2.mo36719a(nVar.mo35860k().mo36186s());
            bVar2.mo36720b(nVar.mo35860k().mo36188u());
            C30603a f = nVar.mo35860k().mo36173f();
            if (f != null) {
                bVar2.f83616f = f;
                if (bVar2.f83617g != 1 || (ajVar = bVar2.f83611a) == null || (aiVar = bVar2.f83612b) == null || (ahVar = bVar2.f83613c) == null || (zVar = bVar2.f83614d) == null || (i = bVar2.f83618h) == 0 || (aVar = bVar2.f83616f) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (bVar2.f83611a == null) {
                        sb.append(" onViewCreatedCallback");
                    }
                    if (bVar2.f83612b == null) {
                        sb.append(" onDismissCallback");
                    }
                    if (bVar2.f83613c == null) {
                        sb.append(" onDestroyCallback");
                    }
                    if (bVar2.f83614d == null) {
                        sb.append(" visualElements");
                    }
                    if (bVar2.f83617g == 0) {
                        sb.append(" isExperimental");
                    }
                    if (bVar2.f83618h == 0) {
                        sb.append(" largeScreenDialogAlignment");
                    }
                    if (bVar2.f83616f == null) {
                        sb.append(" materialVersion");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                C31041c cVar = new C31041c(ajVar, aiVar, ahVar, zVar, bVar2.f83615e, i, aVar);
                if (akVar.f83605i == null) {
                    C58838bb.m90884s(akVar.f83603g == null ? true : z, "initialize() must be called before setViewProviders()");
                    akVar.f83605i = cVar;
                    akVar.f83606j.mo36609b();
                }
                C30689o oVar = new C30689o(akVar);
                this.f82850d = new C30656ae(nVar, oVar, bVar);
                this.f82851e = C30671at.f82807a;
                this.f82852f = C30670as.f82806a;
                this.f82853g = new C30682h(akVar, nVar, oVar, bVar);
                this.f82854h = new C30683i(akVar, nVar, oVar, bVar);
                this.f82855i = new C30684j(akVar, nVar, oVar, bVar);
                this.f82856j = new C30685k(nVar, oVar, bVar, akVar);
                this.f82857k = C30686l.f82837a;
                this.f82848b = new C30690p(this);
                C30692r rVar = new C30692r(this, nVar);
                akVar.f83607k = rVar;
                if (akVar.f83601e) {
                    rVar.mo36376a();
                    return;
                }
                return;
            }
            throw new NullPointerException("Null materialVersion");
        }
        throw new NullPointerException("Null visualElements");
    }

    /* renamed from: a */
    public static void m57350a(View view) {
        C30669ar arVar = (C30669ar) view.findViewById(R.id.og_has_selected_content);
        if (arVar != null) {
            C19559g.m37304c();
            C58838bb.m90884s(!arVar.f82798m.mo56113h(), "View can be expanded only if account switching is enabled");
            if (arVar.f82801p.mo36153b().mo56113h()) {
                arVar.mo36364c(false);
            }
        }
    }

    /* renamed from: c */
    public static final C30233g m57351c(C30305n nVar, C2391v vVar) {
        C30234h hVar = new C30234h();
        if (vVar != null) {
            hVar.f81729a = vVar;
            if (nVar.mo35860k().mo36176i().mo56113h()) {
                hVar.f81730b = C58833ax.m90834k((C30237k) nVar.mo35860k().mo36176i().mo56107c());
            }
            C58833ax j = nVar.mo35860k().mo36177j();
            if (j != null) {
                hVar.f81731c = j;
                C58833ax g = nVar.mo35860k().mo36174g();
                if (g != null) {
                    hVar.f81732d = g;
                    return hVar.mo35704a();
                }
                throw new NullPointerException("Null accountCapabilitiesRetriever");
            }
            throw new NullPointerException("Null criticalAlertFeature");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    /* renamed from: d */
    static /* synthetic */ View m57352d(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    /* renamed from: b */
    public final void mo36378b() {
        int i;
        ExpandableDialogView expandableDialogView;
        C31032ag agVar;
        C31032ag agVar2;
        C31032ag agVar3;
        int i2;
        if (!this.f82847a.mo35858i().f81934a.f81882c) {
            i = 1;
        } else if (!this.f82847a.mo35866q().mo56113h() || !((C30313v) this.f82847a.mo35866q().mo56107c()).f81976b) {
            i = this.f82847a.mo35858i().f81934a.mo35794b().isEmpty() ? 3 : C30281j.m56319c(this.f82847a.mo35858i().f81934a.f81883d) != null ? 5 : 4;
        } else {
            i = 2;
        }
        int i3 = this.f82859m;
        if (i != i3) {
            this.f82859m = i;
            int i4 = i - 1;
            if (i4 != 0) {
                agVar = i4 != 3 ? this.f82851e : this.f82852f;
            } else {
                agVar = this.f82858l;
            }
            if (agVar != null) {
                if (i4 != 0) {
                    agVar2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? this.f82855i : this.f82854h : this.f82853g : this.f82856j;
                } else {
                    agVar2 = this.f82857k;
                }
                if (agVar2 != null) {
                    if (i == 1) {
                        agVar3 = this.f82858l;
                    } else {
                        agVar3 = this.f82850d;
                    }
                    if (agVar3 != null) {
                        if (i4 != 1) {
                            i2 = i4 != 2 ? i4 != 3 ? R.string.og_account_and_settings : R.string.og_choose_an_account_title : R.string.og_sign_in_;
                        } else {
                            C30545a aVar = (C30545a) this.f82847a.mo35860k().mo36181n().mo56107c();
                            i2 = R.string.og_incognito_menu;
                        }
                        C31036ak akVar = this.f82849c;
                        C31042d dVar = new C31042d(agVar, agVar2, agVar3, i2);
                        C19559g.m37304c();
                        akVar.f83603g = dVar;
                        ExpandableDialogView expandableDialogView2 = akVar.f83604h;
                        if (expandableDialogView2 != null) {
                            akVar.mo36728a(dVar, expandableDialogView2);
                        }
                        Dialog dialog = akVar.getDialog();
                        if (dialog != null) {
                            dialog.setTitle(dVar.f83629d);
                        }
                    } else {
                        throw new NullPointerException("Null footerViewProvider");
                    }
                } else {
                    throw new NullPointerException("Null contentViewProvider");
                }
            } else {
                throw new NullPointerException("Null headerViewProvider");
            }
        }
        if (i3 == 0) {
            C31036ak akVar2 = this.f82849c;
            C19559g.m37304c();
            SparseArray sparseArray = akVar2.f83602f;
            if (sparseArray != null && (expandableDialogView = akVar2.f83604h) != null) {
                expandableDialogView.restoreHierarchyState(sparseArray);
            }
        }
    }

    /* renamed from: e */
    public final void mo36379e(int i) {
        C30860b m = this.f82847a.mo35862m();
        Object c = C30281j.m56319c(this.f82847a.mo35858i().f81934a.f81883d);
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 1;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        aVar.copyOnWrite();
        C63644b bVar4 = (C63644b) aVar.instance;
        bVar4.f172122b = i - 1;
        bVar4.f172121a |= 1;
        m.mo35875a(c, (C63644b) aVar.build());
    }
}
