package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.PopupWindow;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b.C137099a;
import com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b.C137100b;
import com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b.C137105g;
import com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b.C137106h;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4880aq.C63732au;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63742bd;
import com.google.protos.p4880aq.C63744bf;
import com.google.protos.p4880aq.C63745bg;
import com.google.protos.p4880aq.C63750g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63933bt;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ap */
/* compiled from: PG */
public final class C137087ap {

    /* renamed from: b */
    private static final C59071e f373041b = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.ap");

    /* renamed from: a */
    public final C136969bx f373042a;

    /* renamed from: c */
    private C137105g f373043c;

    /* renamed from: d */
    private int f373044d = 0;

    /* renamed from: e */
    private C137007dh f373045e = C137007dh.f372869h;

    /* renamed from: f */
    private final Context f373046f;

    /* renamed from: g */
    private final C137106h f373047g;

    public C137087ap(Fragment fragment, C136969bx bxVar, C137106h hVar) {
        this.f373046f = fragment.getContext();
        this.f373042a = bxVar;
        this.f373047g = hVar;
    }

    /* renamed from: a */
    public final void mo113503a() {
        this.f373044d = 0;
        C137105g gVar = this.f373043c;
        if (gVar != null) {
            gVar.mo113525c((PopupWindow.OnDismissListener) null);
        }
    }

    /* renamed from: b */
    public final void mo113504b(int i, View view, C137007dh dhVar) {
        C63959w wVar;
        C63733av avVar;
        C63744bf bfVar;
        C63733av avVar2;
        C63733av avVar3;
        C63959w wVar2;
        Object obj;
        int i2 = this.f373044d;
        int i3 = 0;
        if (i2 == i) {
            this.f373044d = 0;
            C137105g gVar = this.f373043c;
            if (gVar != null) {
                gVar.mo113524b();
            }
        } else if (i2 != 0) {
            return;
        }
        C63933bt btVar = C63933bt.f172892d;
        C63745bg bgVar = C63745bg.f172450e;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C62940bt r5 = C62942bv.checkIsLite(C63933bt.f172893e);
        wVar.mo58887l(r5);
        if (wVar.f169962ag.mo58857o(r5.f169971d)) {
            if (dhVar.f372872b == 2) {
                wVar2 = (C63959w) dhVar.f372873c;
            } else {
                wVar2 = C63959w.f172981b;
            }
            C62940bt r1 = C62942bv.checkIsLite(C63933bt.f172893e);
            wVar2.mo58887l(r1);
            Object l = wVar2.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            btVar = (C63933bt) obj;
            i3 = btVar.f172895a;
        } else {
            C63732au auVar = C63732au.TOUT;
            if (dhVar.f372872b == 1) {
                avVar = (C63733av) dhVar.f372873c;
            } else {
                avVar = C63733av.f172308c;
            }
            int ordinal = C63732au.m96291a(avVar.f172310a).ordinal();
            int i4 = 3;
            if (ordinal == 3) {
                if (dhVar.f372872b == 1) {
                    avVar2 = (C63733av) dhVar.f372873c;
                } else {
                    avVar2 = C63733av.f172308c;
                }
                bgVar = avVar2.f172310a == 4 ? (C63745bg) avVar2.f172311b : C63745bg.f172450e;
            } else if (ordinal == 5) {
                if (dhVar.f372872b == 1) {
                    avVar3 = (C63733av) dhVar.f372873c;
                } else {
                    avVar3 = C63733av.f172308c;
                }
                bgVar = avVar3.f172310a == 6 ? (C63745bg) avVar3.f172311b : C63745bg.f172450e;
            } else {
                return;
            }
            int i5 = bgVar.f172452a;
            if (i5 != 0) {
                i4 = i5 != 1 ? i5 != 5 ? 0 : 2 : 1;
            }
            int i6 = i4 - 1;
            if (i4 == 0) {
                throw null;
            } else if (i6 == 0) {
                if (i5 == 1) {
                    bfVar = C63744bf.m96298a(((Integer) bgVar.f172453b).intValue());
                    if (bfVar == null) {
                        bfVar = C63744bf.TARGET_UNKNOWN;
                    }
                } else {
                    bfVar = C63744bf.TARGET_UNKNOWN;
                }
                i3 = bfVar.f172449g;
            } else if (i6 != 1) {
                if (i6 == 2) {
                    return;
                }
            } else if (i5 == 5) {
                i3 = ((Integer) bgVar.f172453b).intValue();
            }
        }
        if (i3 == i && !dhVar.equals(this.f373045e) && view.getVisibility() == 0) {
            this.f373045e = dhVar;
            if (!C137121o.m222844k(dhVar)) {
                this.f373042a.mo113456m(dhVar);
                return;
            }
            this.f373042a.mo113458o(dhVar);
            if (!dhVar.f372876f) {
                if (!btVar.equals(C63933bt.f172892d)) {
                    C137106h hVar = this.f373047g;
                    C63961y yVar = btVar.f172896b;
                    if (yVar == null) {
                        yVar = C63961y.f172986c;
                    }
                    String str = yVar.f172988a == 2 ? (String) yVar.f172989b : BuildConfig.FLAVOR;
                    C63932bs a = C63932bs.m96320a(btVar.f172897c);
                    if (a == null) {
                        a = C63932bs.GRAVITY_UNSPECIFIED;
                    }
                    this.f373043c = hVar.mo113527a(view, str, a);
                } else if (!bgVar.equals(C63745bg.f172450e)) {
                    C137106h hVar2 = this.f373047g;
                    Context context = this.f373046f;
                    C63750g gVar2 = bgVar.f172454c;
                    if (gVar2 == null) {
                        gVar2 = C63750g.f172461c;
                    }
                    String a2 = C137121o.m222834a(context, gVar2);
                    C63742bd a3 = C63742bd.m96296a(bgVar.f172455d);
                    if (a3 == null) {
                        a3 = C63742bd.GRAVITY_UNKNOWN;
                    }
                    this.f373043c = hVar2.mo113527a(view, a2, (C63932bs) C137121o.f373132a.getOrDefault(a3, C63932bs.GRAVITY_UNSPECIFIED));
                } else {
                    ((C59052c) ((C59052c) f373041b.mo56225c()).mo56372aa(40914)).mo56386p("No valid configuration. This should not happen as promo validation happens before this step. ");
                    this.f373042a.mo113456m(dhVar);
                    return;
                }
                C137105g gVar3 = this.f373043c;
                C137084am amVar = new C137084am(this, dhVar);
                C47770dh dhVar2 = gVar3.f373087b;
                gVar3.f373091f = new C47591co(dhVar2, "tooltipView clicked", new C137100b(gVar3, amVar));
                gVar3.f373092g = new C47591co(dhVar2, "anchorView clicked", new C137099a(new C137085an(this, dhVar)));
                gVar3.mo113525c(new C137086ao(this, dhVar));
                this.f373044d = i;
                this.f373043c.mo113526d();
            }
        }
    }
}
