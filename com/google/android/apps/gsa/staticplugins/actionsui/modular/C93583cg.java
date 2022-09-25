package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cg */
/* compiled from: PG */
public final class C93583cg extends C88508b implements C93601cy, C93545aw {

    /* renamed from: e */
    private static final C59071e f261278e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.cg");

    /* renamed from: c */
    public int f261279c;

    /* renamed from: d */
    public int f261280d = 0;

    /* renamed from: f */
    private final ModularActionCardHeader f261281f;

    /* renamed from: g */
    private final ModularActionCardMenuIcon f261282g;

    /* renamed from: h */
    private final ModularActionCardUnlabeledFooter f261283h;

    /* renamed from: i */
    private final ModularActionCardLabeledFooter f261284i;

    /* renamed from: j */
    private final C93584ch[] f261285j;

    /* renamed from: k */
    private final C68214a f261286k;

    /* renamed from: l */
    private ArgumentContainerView f261287l;

    /* renamed from: m */
    private C93584ch f261288m;

    /* renamed from: n */
    private C93584ch f261289n;

    /* renamed from: o */
    private C93584ch f261290o;

    /* renamed from: p */
    private C93584ch f261291p;

    /* renamed from: q */
    private View f261292q;

    /* renamed from: r */
    private Runnable f261293r;

    /* renamed from: s */
    private DialogFragment f261294s;

    /* renamed from: t */
    private C93660q f261295t;

    /* renamed from: u */
    private final C88511e f261296u = new C88511e(new C93575bz(this));

    public C93583cg(Context context, C68214a aVar) {
        super(context, "ModularActionCard");
        inflate(getContext(), R.layout.action_editor, this);
        setAccessibilityLiveRegion(1);
        this.f261286k = aVar;
        ModularActionCardHeader modularActionCardHeader = (ModularActionCardHeader) findViewById(R.id.action_card_header);
        modularActionCardHeader.getClass();
        this.f261281f = modularActionCardHeader;
        ModularActionCardMenuIcon modularActionCardMenuIcon = (ModularActionCardMenuIcon) findViewById(R.id.action_card_menu_icon);
        modularActionCardMenuIcon.getClass();
        this.f261282g = modularActionCardMenuIcon;
        View findViewById = findViewById(R.id.action_card_unlabeled_footer);
        findViewById.getClass();
        ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter = (ModularActionCardUnlabeledFooter) findViewById;
        this.f261283h = modularActionCardUnlabeledFooter;
        View findViewById2 = findViewById(R.id.action_card_labeled_footer);
        findViewById2.getClass();
        ModularActionCardLabeledFooter modularActionCardLabeledFooter = (ModularActionCardLabeledFooter) findViewById2;
        this.f261284i = modularActionCardLabeledFooter;
        ArgumentContainerView argumentContainerView = (ArgumentContainerView) findViewById(R.id.argument_container);
        argumentContainerView.getClass();
        this.f261287l = argumentContainerView;
        DisambiguationContent disambiguationContent = (DisambiguationContent) findViewById(R.id.disambiguation_content);
        disambiguationContent.getClass();
        this.f261289n = disambiguationContent;
        this.f261288m = (AppPickerGridView) findViewById(R.id.app_picker);
        ExecutedStateView executedStateView = (ExecutedStateView) findViewById(R.id.executed_state);
        executedStateView.getClass();
        this.f261290o = executedStateView;
        ModalStateView modalStateView = (ModalStateView) findViewById(R.id.modal_state_view);
        modalStateView.getClass();
        this.f261291p = modalStateView;
        View findViewById3 = findViewById(R.id.scrim);
        findViewById3.getClass();
        this.f261292q = findViewById3;
        this.f261285j = new C93584ch[]{modularActionCardHeader, modularActionCardMenuIcon, modularActionCardUnlabeledFooter, modularActionCardLabeledFooter, this.f261287l, this.f261289n, this.f261288m, this.f261290o, this.f261291p};
        C89941l.m146512c(this, 11162);
        C89941l.m146512c(findViewById(R.id.action_editor), 8047);
        C93577ca caVar = new C93577ca(this);
        modularActionCardHeader.setOnClickListener(caVar);
        modularActionCardMenuIcon.setOnClickListener(caVar);
        setOnClickListener(new C93578cb(this));
        addOnAttachStateChangeListener(new C93579cc(this));
        this.f261287l.f260987e = this;
        modularActionCardLabeledFooter.f261076f = this;
        C90638an anVar = new C90638an(0);
        anVar.f253473b = false;
        anVar.f253474c = false;
        setLayoutParams(anVar);
    }

    /* renamed from: a */
    public final void mo87995a() {
        Runnable runnable = this.f261293r;
        if (runnable != null) {
            runnable.run();
            this.f261293r = null;
        }
    }

    /* renamed from: b */
    public final List mo82064b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final FragmentManager mo87959c() {
        Context context = getContext();
        context.setTheme(2132150729);
        if (context instanceof C0395p) {
            return ((C0395p) context).getFragmentManager();
        }
        C59104x d = f261278e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ModularActionCard");
        ((C59052c) ((C59052c) d).mo56372aa(13751)).mo56386p("Actions UI should not be used outside an AppCompatActivity");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return ((Activity) context).getFragmentManager();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo87960d(DialogFragment dialogFragment, String str) {
        FragmentManager c = mo87959c();
        if (c != null) {
            this.f261294s = dialogFragment;
            dialogFragment.show(c, str);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* renamed from: e */
    public final void mo82065e() {
        C89932c.f246391b.mo83778h(this, 34);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo82067g(C88507a aVar) {
        C93602cz czVar = (C93602cz) aVar;
        super.mo82067g(czVar);
        C93584ch[] chVarArr = this.f261285j;
        int length = chVarArr.length;
        for (int i = 0; i < 9; i++) {
            chVarArr[i].mo87841d(czVar);
        }
        C88507a aVar2 = this.f239232a;
        aVar2.getClass();
        this.f261295t = new C93660q((C93602cz) aVar2, getContext(), this);
    }

    /* renamed from: h */
    public final boolean mo82068h(Runnable runnable) {
        if (this.f261293r != null) {
            C59104x d = f261278e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModularActionCard");
            ((C59052c) ((C59052c) d).mo56372aa(13756)).mo56386p("Multiple pending updateUiFinishedCallback");
            ((C89911f) this.f261286k.mo27525b()).mo83755a((Throwable) null, 17065162, 29).mo83721a();
        }
        this.f261293r = runnable;
        return true;
    }

    /* renamed from: i */
    public final void mo87961i(Argument argument, String str) {
        mo87960d((DialogFragment) argument.mo81281p(this.f261295t), str);
    }

    /* renamed from: j */
    public final void mo87997j(Argument argument) {
        C93666w g = this.f261287l.mo87846g(argument);
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
        ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter = this.f261283h;
        modularActionCardUnlabeledFooter.f261083b.setVisibility(0);
        ProgressBar progressBar = modularActionCardUnlabeledFooter.f261083b;
        modularActionCardUnlabeledFooter.f261085d = ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, progressBar.getMax()});
        modularActionCardUnlabeledFooter.f261085d.setDuration(j);
        modularActionCardUnlabeledFooter.f261085d.start();
        mo88000m(false);
    }

    /* renamed from: l */
    public final void mo87999l() {
        mo88000m(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r0 != r3) goto L_0x0137;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88000m(boolean r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.getContext()
            boolean r0 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r0)
            r13 = r13 & r0
            android.content.Context r0 = r12.getContext()
            boolean r0 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r12.isLaidOut()
            if (r0 != 0) goto L_0x002f
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.view.ViewTreeObserver r13 = r12.getViewTreeObserver()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cd r0 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.cd
            r0.<init>(r12)
            r13.addOnGlobalLayoutListener(r0)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ModularActionCardHeader r13 = r12.f261281f
            r13.f261065a = r1
            r13 = 0
            goto L_0x0033
        L_0x002f:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ModularActionCardHeader r0 = r12.f261281f
            r0.f261065a = r2
        L_0x0033:
            r0 = 2
            if (r13 == 0) goto L_0x0040
            int r3 = r12.f261279c
            if (r3 != 0) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.f261279c = r0
            return
        L_0x0040:
            r12.f261279c = r1
            int r3 = r12.f261280d
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r12.f239232a
            r4.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r4
            int r4 = r4.mo88009D()
            r12.f261280d = r4
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r12.f239232a
            r4.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r4
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r4.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r5 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r5
            int r6 = r5.f236108n
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r12, r6)
            int r6 = r12.f261280d
            if (r3 == r6) goto L_0x0069
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            r4.mo88037af(r7, r6)
            int r6 = r12.f261280d
            com.google.android.apps.gsa.search.shared.ui.actions.e r7 = r12.f261296u
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch[] r8 = r12.f261285j
            int r9 = r8.length
            r9 = 0
        L_0x0075:
            r10 = 9
            if (r9 >= r10) goto L_0x0081
            r10 = r8[r9]
            r10.mo87840c(r3, r6, r7)
            int r9 = r9 + 1
            goto L_0x0075
        L_0x0081:
            if (r13 == 0) goto L_0x00ed
            android.content.Context r6 = r12.getContext()
            boolean r6 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r6)
            if (r6 == 0) goto L_0x00ed
            android.content.Context r13 = r12.getContext()
            boolean r13 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r13)
            if (r13 == 0) goto L_0x00eb
            android.transition.TransitionSet r13 = new android.transition.TransitionSet
            r13.<init>()
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r6 = new android.transition.TransitionSet
            r6.<init>()
            r13.addTransition(r0)
            r13.addTransition(r6)
            r6.setOrdering(r2)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cf r7 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.cf
            r7.<init>(r12)
            r6.addListener(r7)
            android.transition.ChangeBounds r7 = new android.transition.ChangeBounds
            r7.<init>()
            r8 = 2131427508(0x7f0b00b4, float:1.8476634E38)
            r7.addTarget(r8)
            r8 = 2131427509(0x7f0b00b5, float:1.8476636E38)
            r7.addTarget(r8)
            r8 = 2131433348(0x7f0b1784, float:1.848848E38)
            r7.addTarget(r8)
            r8 = 500(0x1f4, double:2.47E-321)
            r7.setDuration(r8)
            r6.addTransition(r7)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch[] r7 = r12.f261285j
            int r8 = r7.length
            r8 = 0
        L_0x00da:
            if (r8 >= r10) goto L_0x00e6
            r9 = r7[r8]
            int r11 = r12.f261280d
            com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154492g(r3, r11, r9, r6, r0)
            int r8 = r8 + 1
            goto L_0x00da
        L_0x00e6:
            android.transition.TransitionManager.beginDelayedTransition(r12, r13)
            r13 = 1
            goto L_0x00f3
        L_0x00eb:
            r13 = 0
            goto L_0x00f3
        L_0x00ed:
            int r6 = r12.f261279c
            if (r6 != r0) goto L_0x00f3
            r12.f261279c = r2
        L_0x00f3:
            int r0 = r12.f261280d
            com.google.android.apps.gsa.search.shared.ui.actions.e r6 = r12.f261296u
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch[] r7 = r12.f261285j
            int r8 = r7.length
            r8 = 0
        L_0x00fb:
            if (r8 >= r10) goto L_0x0105
            r9 = r7[r8]
            r9.mo87842e(r0, r6)
            int r8 = r8 + 1
            goto L_0x00fb
        L_0x0105:
            android.view.View r0 = r12.f261292q
            int r6 = r12.f261280d
            r7 = 8
            if (r6 != r1) goto L_0x011f
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r6 = r5.f235985a
            boolean r6 = r6.mo81118g()
            if (r6 != 0) goto L_0x011d
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r5 = r5.f235985a
            boolean r5 = r5.mo81121i()
            if (r5 == 0) goto L_0x011f
        L_0x011d:
            r5 = 0
            goto L_0x0121
        L_0x011f:
            r5 = 8
        L_0x0121:
            r0.setVisibility(r5)
            com.google.android.apps.gsa.search.shared.ui.actions.f r0 = r4.f239225a
            boolean r0 = r0.mo82085L()
            r5 = 4
            if (r0 != 0) goto L_0x0137
            int r0 = r12.f261280d
            if (r0 == r5) goto L_0x0135
            r6 = 5
            if (r0 != r6) goto L_0x013e
            r0 = 5
        L_0x0135:
            if (r0 == r3) goto L_0x013e
        L_0x0137:
            java.lang.Runnable r0 = r12.f261293r
            if (r0 != 0) goto L_0x013e
            r4.mo88025T()
        L_0x013e:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r4.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            boolean r0 = r0.mo81133M()
            if (r0 == 0) goto L_0x0172
            com.google.android.apps.gsa.search.shared.ui.actions.f r0 = r4.f239225a
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82089P()
            boolean r0 = r0.f236255i
            if (r0 == 0) goto L_0x0172
            com.google.android.apps.gsa.search.shared.ui.actions.f r0 = r4.f239225a
            boolean r0 = r0.mo82080G()
            if (r0 != 0) goto L_0x0172
            com.google.android.apps.gsa.search.shared.ui.actions.f r0 = r4.f239225a
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r4.f239226b
            long r8 = r0.mo82093a(r6)
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0172
            com.google.android.apps.gsa.search.shared.ui.actions.c r0 = r4.f239227c
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cy r0 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93601cy) r0
            r0.mo87998k(r8)
        L_0x0172:
            com.google.android.apps.gsa.shared.logger.j.c r0 = com.google.android.apps.gsa.shared.logger.p7065j.C89932c.f246391b
            r4 = 0
            r0.f246399i = r4
            if (r13 != 0) goto L_0x017e
            r12.f261279c = r2
            r12.mo87995a()
        L_0x017e:
            int r13 = r12.f261280d
            if (r3 == r13) goto L_0x018d
            if (r3 == 0) goto L_0x0188
            if (r3 == r7) goto L_0x0188
            if (r13 != r5) goto L_0x018d
        L_0x0188:
            r13 = 32
            r12.sendAccessibilityEvent(r13)
        L_0x018d:
            com.google.android.apps.gsa.search.shared.ui.actions.a r13 = r12.f239232a
            r13.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r13 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r13
            int r13 = r13.mo88009D()
            r0 = 7
            if (r13 != r0) goto L_0x01d6
            com.google.android.apps.gsa.search.shared.ui.actions.a r13 = r12.f239232a
            r13.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r13 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r13
            java.util.List r13 = r13.mo88023R()
            if (r13 == 0) goto L_0x01d6
            com.google.android.apps.gsa.search.shared.ui.actions.a r13 = r12.f239232a
            r13.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r13 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r13
            java.util.List r13 = r13.mo88023R()
            int r13 = r13.size()
            if (r13 != r1) goto L_0x01d6
            r13 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r13 = r12.findViewById(r13)
            r13.getClass()
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r0 = 2131231264(0x7f080220, float:1.8078604E38)
            r13.setBackgroundResource(r0)
            r13.setClickable(r1)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ce r0 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.ce
            r0.<init>(r12)
            r13.setOnClickListener(r0)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93583cg.mo88000m(boolean):void");
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String str;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            int i = this.f261280d;
            if (i == 2 || i == 4 || i == 7 || i == 8) {
                C88507a aVar = this.f239232a;
                aVar.getClass();
                str = ((C93602cz) aVar).mo82039ao().f236249c;
            } else {
                C88507a aVar2 = this.f239232a;
                aVar2.getClass();
                str = ((C93602cz) aVar2).mo88021P();
            }
            if (str != null) {
                accessibilityEvent.getText().add(str);
            }
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        DialogFragment dialogFragment;
        if (i != 0 && (dialogFragment = this.f261294s) != null) {
            Dialog dialog = dialogFragment.getDialog();
            if (dialog != null && dialog.isShowing()) {
                dialog.cancel();
            }
            this.f261294s = null;
        }
    }
}
