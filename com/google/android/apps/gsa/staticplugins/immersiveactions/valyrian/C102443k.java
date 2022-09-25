package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7187ui.C91113l;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91937m;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93545aw;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93569bt;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93601cy;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93660q;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93666w;
import com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsArgumentContainerView;
import com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsDisambiguationContent;
import com.google.android.apps.gsa.staticplugins.immersiveactions.ValyrianImmersiveActionsLabeledFooter;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55419v;
import com.google.p4152bb.p4153a.C55421x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.k */
/* compiled from: PG */
public final class C102443k extends C88508b implements C93601cy, C93545aw {

    /* renamed from: c */
    public final ImmersiveActionsArgumentContainerView f285906c;

    /* renamed from: d */
    public final ValyrianImmersiveActionsLabeledFooter f285907d;

    /* renamed from: e */
    public C88511e f285908e;

    /* renamed from: f */
    public int f285909f;

    /* renamed from: g */
    final C91113l f285910g;

    /* renamed from: h */
    final C91937m f285911h;

    /* renamed from: i */
    private List f285912i;

    /* renamed from: j */
    private ValyrianImmersiveActionsUiFooter f285913j;

    /* renamed from: k */
    private final ImmersiveActionsDisambiguationContent f285914k;

    /* renamed from: l */
    private final C93584ch f285915l;

    /* renamed from: m */
    private View f285916m;

    /* renamed from: n */
    private C93660q f285917n;

    /* renamed from: o */
    private int f285918o = 0;

    public C102443k(Context context) {
        super(context, "ValyrianUI");
        C102439g gVar = new C102439g(this);
        this.f285910g = gVar;
        this.f285911h = new C91937m(false, gVar);
        inflate(getContext(), R.layout.valyrian_immersive_actions_ui, this);
        ValyrianImmersiveActionsUiFooter valyrianImmersiveActionsUiFooter = (ValyrianImmersiveActionsUiFooter) findViewById(R.id.immersive_actions_footer_editor);
        valyrianImmersiveActionsUiFooter.getClass();
        this.f285913j = valyrianImmersiveActionsUiFooter;
        ImmersiveActionsArgumentContainerView immersiveActionsArgumentContainerView = (ImmersiveActionsArgumentContainerView) findViewById(R.id.immersive_actions_ui);
        immersiveActionsArgumentContainerView.getClass();
        this.f285906c = immersiveActionsArgumentContainerView;
        ImmersiveActionsDisambiguationContent immersiveActionsDisambiguationContent = (ImmersiveActionsDisambiguationContent) findViewById(R.id.immersive_actions_disambiguation_content);
        immersiveActionsDisambiguationContent.getClass();
        this.f285914k = immersiveActionsDisambiguationContent;
        C93584ch chVar = (C93584ch) findViewById(R.id.immersive_actions_confirmation_card);
        chVar.getClass();
        this.f285915l = chVar;
        View findViewById = findViewById(R.id.immersive_actions_arguments_disabled_ui);
        findViewById.getClass();
        this.f285916m = findViewById;
        ValyrianImmersiveActionsLabeledFooter valyrianImmersiveActionsLabeledFooter = (ValyrianImmersiveActionsLabeledFooter) findViewById(R.id.valyrian_immersive_actions_labeled_footer);
        valyrianImmersiveActionsLabeledFooter.getClass();
        this.f285907d = valyrianImmersiveActionsLabeledFooter;
        this.f285918o = 0;
        ArrayList arrayList = new ArrayList();
        this.f285912i = arrayList;
        arrayList.addAll(Arrays.asList(new C93584ch[]{immersiveActionsArgumentContainerView, immersiveActionsDisambiguationContent, chVar, valyrianImmersiveActionsLabeledFooter, this.f285913j}));
    }

    /* renamed from: b */
    public final List mo82064b() {
        ArrayList arrayList = new ArrayList();
        for (C93584ch b : this.f285912i) {
            arrayList.addAll(b.mo87839b());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final FragmentManager mo87959c() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getFragmentManager();
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo87960d(DialogFragment dialogFragment, String str) {
        FragmentManager c = mo87959c();
        if (c != null) {
            dialogFragment.show(c, str);
        }
    }

    /* renamed from: e */
    public final void mo82065e() {
    }

    /* renamed from: f */
    public final void mo82066f(String str, String str2) {
        this.f285906c.mo93184n(String.valueOf(str).concat(String.valueOf(str2)));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo82067g(C88507a aVar) {
        C93602cz czVar = (C93602cz) aVar;
        super.mo82067g(czVar);
        this.f285917n = new C93660q(czVar, getContext(), this);
        this.f285913j.f285885b = czVar;
        for (C93584ch d : this.f285912i) {
            d.mo87841d(czVar);
        }
    }

    /* renamed from: i */
    public final void mo87961i(Argument argument, String str) {
        mo87960d((DialogFragment) argument.mo81281p(this.f285917n), str);
    }

    /* renamed from: j */
    public final void mo87997j(Argument argument) {
        C93666w g = this.f285906c.mo87846g(argument);
        if (!(g instanceof C93569bt)) {
            C88507a aVar = this.f239232a;
            aVar.getClass();
            ((ModularAction) ((C93602cz) aVar).f239226b).mo81210Q().mo81395a("Unable to show UI to pick location alias address for argument", argument.mo81268H(false), (Throwable) null);
            return;
        }
        ((C93569bt) g).mo87962b();
    }

    /* renamed from: k */
    public final void mo87998k(long j) {
    }

    /* renamed from: l */
    public final void mo87999l() {
        int i;
        int a;
        C58976aa aaVar = C58975e.f156826a;
        if (!((C93602cz) this.f239232a).mo82036A()) {
            ValyrianImmersiveActionsUiFooter valyrianImmersiveActionsUiFooter = this.f285913j;
            C88507a aVar = this.f239232a;
            aVar.getClass();
            valyrianImmersiveActionsUiFooter.f285886c = ((C93602cz) aVar).mo82062y();
            boolean z = true;
            boolean z2 = C93632eb.m154491f(getContext()) && isLaidOut();
            if (!z2 || this.f285909f == 0) {
                this.f285909f = 1;
                int i2 = this.f285918o;
                C88507a aVar2 = this.f239232a;
                aVar2.getClass();
                int D = ((C93602cz) aVar2).mo88009D();
                this.f285918o = D;
                if (i2 == D) {
                    z = false;
                }
                C88507a aVar3 = this.f239232a;
                aVar3.getClass();
                ((C93602cz) aVar3).mo88037af(z, D);
                int i3 = this.f285918o;
                C88511e eVar = this.f285908e;
                for (C93584ch c : this.f285912i) {
                    c.mo87840c(i2, i3, eVar);
                }
                if (z2) {
                    if (C93632eb.m154491f(getContext())) {
                        TransitionSet transitionSet = new TransitionSet();
                        TransitionSet transitionSet2 = new TransitionSet();
                        TransitionSet transitionSet3 = new TransitionSet();
                        transitionSet.addTransition(transitionSet2);
                        transitionSet.addTransition(transitionSet3);
                        transitionSet3.setOrdering(0);
                        transitionSet3.addListener(new C102442j(this));
                        for (C93584ch g : this.f285912i) {
                            C93632eb.m154492g(i2, this.f285918o, g, transitionSet3, transitionSet2);
                        }
                        TransitionManager.beginDelayedTransition(this, transitionSet);
                    }
                } else if (this.f285909f == 2) {
                    this.f285909f = 0;
                }
                int i4 = this.f285918o;
                C88511e eVar2 = this.f285908e;
                for (C93584ch e : this.f285912i) {
                    e.mo87842e(i4, eVar2);
                }
                C93602cz czVar = (C93602cz) this.f239232a;
                ModularAction modularAction = (ModularAction) czVar.f239226b;
                C55361pn I = czVar.mo88014I();
                if (i4 != 4) {
                    if (I == null || ((ModularActionMatchingProviderInfo) modularAction.f235986b).mo81436f()) {
                        if (i4 == 9 || modularAction.f236107m == C55421x.ADD_RELATIONSHIP) {
                            i = getResources().getColor(R.color.immersive_actions_relationship_header);
                        } else if ((I == null || (a = C55419v.m87685a(I.f145872e)) == 0 || a != 13) && modularAction.f236107m != C55421x.ADD_REMINDER) {
                            i = getResources().getColor(R.color.immersive_actions_default_header);
                        } else {
                            i = getResources().getColor(R.color.immersive_actions_sms_reminders_header);
                        }
                        setBackgroundColor(i);
                    } else {
                        this.f285911h.mo76758a(this.f285908e.mo82072a(I, getContext()));
                    }
                }
                C88507a aVar4 = this.f239232a;
                aVar4.getClass();
                ModularAction modularAction2 = (ModularAction) ((C93602cz) aVar4).f239226b;
                if (modularAction2.f235985a.mo81118g() || modularAction2.f235985a.mo81121i()) {
                    this.f285916m.setVisibility(0);
                } else {
                    this.f285916m.setVisibility(8);
                }
                if (!z2) {
                    this.f285909f = 0;
                }
                int i5 = this.f285918o;
                if (i2 == i5) {
                    return;
                }
                if (i2 == 0 || i2 == 8 || i5 == 4) {
                    sendAccessibilityEvent(32);
                    return;
                }
                return;
            }
            this.f285909f = 2;
        }
    }

    public final void setBackgroundColor(int i) {
        if (i != 0) {
            ValyrianImmersiveActionsExecuteButtonContainer valyrianImmersiveActionsExecuteButtonContainer = this.f285913j.f285884a;
        }
    }
}
