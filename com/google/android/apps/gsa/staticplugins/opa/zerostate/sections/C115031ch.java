package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114656bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114693s;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114694t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114696v;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114697w;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ch */
/* compiled from: PG */
public final class C115031ch implements C114757k {

    /* renamed from: a */
    public static final C59071e f319293a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ch");

    /* renamed from: b */
    public final Context f319294b;

    /* renamed from: c */
    public final C58485gu f319295c;

    /* renamed from: d */
    public final List f319296d = new ArrayList();

    /* renamed from: e */
    public C28293k f319297e;

    /* renamed from: f */
    private final Activity f319298f;

    /* renamed from: g */
    private final C108226ax f319299g;

    /* renamed from: h */
    private final C114694t f319300h;

    /* renamed from: i */
    private final C114697w f319301i;

    /* renamed from: j */
    private final C58881cr f319302j;

    /* renamed from: k */
    private final C91097g f319303k;

    /* renamed from: l */
    private final C58833ax f319304l;

    public C115031ch(Context context, Activity activity, C114694t tVar, C114697w wVar, C58833ax axVar, C108226ax axVar2, C58485gu guVar, C91097g gVar) {
        this.f319294b = context;
        this.f319298f = activity;
        this.f319295c = guVar;
        this.f319300h = tVar;
        this.f319301i = wVar;
        this.f319304l = axVar;
        this.f319299g = axVar2;
        this.f319303k = gVar;
        this.f319302j = C58886cw.m90973a(new C115030cg(this));
    }

    /* renamed from: j */
    private static final int m190710j(int i) {
        return i == 1 ? R.id.zero_state_horizontal_left_card : i == 2 ? R.id.zero_state_horizontal_right_card : R.id.zero_state_horizontal_one_card;
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f319302j.mo6453a();
    }

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        if (this.f319297e == null) {
            View view = (View) this.f319302j.mo6453a();
        }
        return this.f319297e;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo101581e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101582f() {
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
    }

    /* renamed from: h */
    public final void mo101820h(C114758l lVar, int i, LinearLayout linearLayout) {
        if (lVar instanceof C115004bh) {
            C114694t tVar = this.f319300h;
            C53350kq kqVar = ((C115004bh) lVar).f319203a;
            Context context = (Context) tVar.f318253a.mo17428b();
            context.getClass();
            kqVar.getClass();
            C58847bk bkVar = (C58847bk) C58833ax.m90834k(new C114693s(context, kqVar));
            View b = ((C114693s) bkVar.f156646a).mo101464b();
            ((ViewGroup) linearLayout.findViewById(m190710j(i))).addView(b);
            ArrayList arrayList = new ArrayList();
            C58833ax axVar = ((C114693s) bkVar.f156646a).f318250f;
            if (axVar.mo56113h()) {
                C114874f.m190411k(b, (C53354ku) axVar.mo56107c(), this.f319303k, this.f319298f, this.f319304l, arrayList, C53306j.MAIN_APP);
            }
            C28293k c = ((C114693s) bkVar.f156646a).mo101465c();
            if (c != null) {
                this.f319296d.add(C28293k.m52907d(((C28257a) c).f76908a, arrayList));
            }
        } else if (lVar instanceof C115006bj) {
            C114697w wVar = this.f319301i;
            C58833ax axVar2 = ((C115006bj) lVar).f319204a;
            C108226ax axVar3 = this.f319299g;
            boolean z = i != 3;
            C91097g gVar = this.f319303k;
            axVar3.getClass();
            gVar.getClass();
            C114656bm bmVar = (C114656bm) wVar.f318257a.mo17428b();
            bmVar.getClass();
            C58847bk bkVar2 = (C58847bk) C58833ax.m90834k(new C114696v(axVar2, axVar3, z, gVar, bmVar));
            ((ViewGroup) linearLayout.findViewById(m190710j(i))).addView(((C114696v) bkVar2.f156646a).mo101464b());
            C28293k kVar = ((C114696v) bkVar2.f156646a).f318255a.f317941j;
            if (kVar != null) {
                this.f319296d.add(kVar);
            }
        } else {
            C59104x d = f319293a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HorizontalStackCardsSC");
            ((C59052c) ((C59052c) d).mo56372aa(29507)).mo56389s("No supported ZeroStateSectionData for HorizontalStackedCardSection: %s", lVar);
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }
}
