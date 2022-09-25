package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114732b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.AmbientMediaSectionController;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C114976ag;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C114980ak;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115050d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115077v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.f */
/* compiled from: PG */
public final class C114730f extends C114966q {

    /* renamed from: a */
    public static final C59071e f318373a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.f");

    /* renamed from: F */
    private final Activity f318374F;

    /* renamed from: G */
    private ViewGroup f318375G;

    /* renamed from: H */
    private ViewGroup f318376H;

    /* renamed from: I */
    private ViewGroup f318377I;

    /* renamed from: J */
    private ViewGroup f318378J;

    /* renamed from: K */
    private ViewGroup f318379K;

    /* renamed from: L */
    private ViewGroup f318380L;

    /* renamed from: M */
    private ViewGroup f318381M;

    /* renamed from: N */
    private TextView f318382N;

    /* renamed from: b */
    public final List f318383b = new ArrayList();

    /* renamed from: c */
    C28292j f318384c;

    /* renamed from: d */
    boolean f318385d = true;

    public C114730f(Context context, Activity activity, C114709cj cjVar, C114604by byVar, C114712cm cmVar, C114742l lVar, C68214a aVar, C22871g gVar, C114732b bVar, C114748b bVar2, C114839ci ciVar, C114796at atVar, C68214a aVar2, C114865dh dhVar, C108226ax axVar, boolean z, C114119ax axVar2) {
        super(context, cjVar, byVar, cmVar, lVar, aVar, gVar, bVar, bVar2, ciVar, atVar, aVar2, dhVar, axVar, z, axVar2);
        this.f318374F = activity;
        this.f318384c = new C28292j(75838);
    }

    /* renamed from: B */
    private final void m190176B(ViewGroup viewGroup, C114757k kVar) {
        C28293k c;
        if (viewGroup != null) {
            View a = kVar.mo101577a();
            viewGroup.addView(a);
            if (kVar instanceof C114976ag) {
                this.f318382N = (TextView) ((C114976ag) kVar).mo101577a().findViewById(R.id.ambient_summary_update_text);
            } else if (kVar instanceof C114980ak) {
                this.f318380L = (ViewGroup) a;
                this.f318385d = a.getVisibility() != 0;
            } else if (kVar instanceof AmbientMediaSectionController) {
                this.f318381M = (ViewGroup) a;
            }
            if (a.getVisibility() == 0 && (c = kVar.mo101579c()) != null) {
                this.f318383b.add(c);
                this.f319051p.mo101569d(c, this.f318384c);
            }
        }
    }

    /* renamed from: a */
    public final ViewGroup mo101411a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319058w == null) {
            this.f319058w = (ViewGroup) LayoutInflater.from(this.f318374F).inflate(R.layout.ambient_main_view, (ViewGroup) null);
            this.f318375G = (ViewGroup) this.f319058w.findViewById(R.id.ambient_scroll_view);
            this.f318376H = (ViewGroup) this.f319058w.findViewById(R.id.ambient_header_view);
            this.f318377I = (ViewGroup) this.f319058w.findViewById(R.id.ambient_summary_view);
            this.f318378J = (ViewGroup) this.f319058w.findViewById(R.id.ambient_card_view);
            this.f318379K = (ViewGroup) this.f319058w.findViewById(R.id.ambient_shortcut_view);
            ViewGroup viewGroup = this.f319058w;
            viewGroup.getClass();
            mo101548d(viewGroup);
            mo101549e();
            mo101758o();
        }
        ViewGroup viewGroup2 = this.f319058w;
        viewGroup2.getClass();
        return viewGroup2;
    }

    /* renamed from: b */
    public final C28293k mo101412b() {
        return C28293k.m52907d(this.f318384c, this.f318383b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo101547c(C58485gu guVar, C87546b bVar) {
        ViewGroup viewGroup;
        C58976aa aaVar = C58975e.f156826a;
        ViewGroup viewGroup2 = this.f318376H;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        ViewGroup viewGroup3 = this.f318377I;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        ViewGroup viewGroup4 = this.f318378J;
        if (viewGroup4 != null) {
            viewGroup4.removeAllViews();
        }
        ViewGroup viewGroup5 = this.f318379K;
        if (viewGroup5 != null) {
            viewGroup5.removeAllViews();
        }
        if (guVar.isEmpty()) {
            C59104x d = f318373a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSAmbientController");
            ((C59052c) ((C59052c) d).mo56372aa(29104)).mo56386p("#initializeSections(): received empty section data list.");
            return;
        }
        int i = 1;
        this.f318385d = true;
        C114976ag agVar = null;
        for (int i2 = 0; i2 < guVar.size(); i2++) {
            C58833ax a = this.f319043h.mo101449a((C114758l) guVar.get(i2), (C58485gu) null, this.f319046k, bVar, this.f319054s, C53306j.AMBIENT, this.f319047l, false, (AnimatorListenerAdapter) null);
            if (a.mo56113h()) {
                C114757k kVar = (C114757k) a.mo56107c();
                if (kVar instanceof C115050d) {
                    m190176B(this.f318376H, kVar);
                } else if (kVar instanceof C114976ag) {
                    agVar = (C114976ag) kVar;
                } else if (kVar instanceof C114980ak) {
                    m190176B(this.f318378J, kVar);
                } else if (kVar instanceof AmbientMediaSectionController) {
                    m190176B(this.f318378J, kVar);
                } else if (kVar instanceof C115077v) {
                    ((C115077v) kVar).f319425e = new C114577b(this, kVar);
                    m190176B(this.f318379K, kVar);
                }
            }
        }
        if (agVar != null) {
            agVar.f319103n = this.f318385d;
            m190176B(this.f318377I, agVar);
        }
        if (this.f318380L != null && (viewGroup = this.f318381M) != null) {
            if (viewGroup.getVisibility() == 8) {
                ViewGroup viewGroup6 = this.f318380L;
                viewGroup6.getClass();
                if (viewGroup6.getChildCount() == 0) {
                    ViewGroup viewGroup7 = this.f318375G;
                    viewGroup7.getClass();
                    viewGroup7.setVisibility(8);
                    i = 0;
                } else {
                    ViewGroup viewGroup8 = this.f318380L;
                    viewGroup8.getClass();
                    i = viewGroup8.getChildCount();
                }
            } else {
                ViewGroup viewGroup9 = this.f318380L;
                viewGroup9.getClass();
                if (viewGroup9.getChildCount() > 0) {
                    ViewGroup viewGroup10 = this.f318380L;
                    viewGroup10.getClass();
                    if (viewGroup10.getChildCount() == 2) {
                        ViewGroup viewGroup11 = this.f318380L;
                        viewGroup11.getClass();
                        viewGroup11.getChildAt(1).setVisibility(8);
                    }
                    i = 2;
                }
            }
            ViewGroup viewGroup12 = this.f318379K;
            if (viewGroup12 != null && viewGroup12.getChildCount() > 0 && this.f318379K.getChildAt(0).getVisibility() == 0) {
                i++;
            }
            TextView textView = this.f318382N;
            if (textView != null) {
                textView.setTextAppearance(i < 2 ? R.style.AmbientEmptyStateHeaderUpdateText : R.style.AmbientHeaderUpdateText);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo101548d(ViewGroup viewGroup) {
        int dimensionPixelSize = this.f319041f.getResources().getDimensionPixelSize(R.dimen.ambient_zero_state_side_padding);
        viewGroup.getClass();
        viewGroup.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo101549e() {
        C114708ci ciVar = this.f319042g;
        C114720e eVar = new C114720e(this);
        C58976aa aaVar = C58975e.f156826a;
        ciVar.f318282c = eVar;
    }

    /* renamed from: f */
    public final boolean mo101416f(int i) {
        ViewGroup viewGroup = this.f318375G;
        return viewGroup != null && viewGroup.canScrollVertically(i);
    }
}
