package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;
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
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93660q;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93666w;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.ExecutedStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ah */
/* compiled from: PG */
public final class C102401ah extends C88508b implements C93601cy, C93545aw {

    /* renamed from: k */
    private static final C59071e f285795k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.immersiveactions.ah");

    /* renamed from: c */
    public ImmersiveActionsArgumentContainerView f285796c;

    /* renamed from: d */
    public ImmersiveActionsLabeledFooter f285797d;

    /* renamed from: e */
    public ImmersiveActionsListenableScrollView f285798e;

    /* renamed from: f */
    public C102395ab f285799f;

    /* renamed from: g */
    public C88511e f285800g;

    /* renamed from: h */
    public int f285801h;

    /* renamed from: i */
    final C91113l f285802i;

    /* renamed from: j */
    final C91937m f285803j;

    /* renamed from: l */
    private List f285804l;

    /* renamed from: m */
    private ImmersiveActionsDisambiguationContent f285805m;

    /* renamed from: n */
    private C93584ch f285806n;

    /* renamed from: o */
    private ImmersiveActionsMinHeightLayout f285807o;

    /* renamed from: p */
    private ImmersiveActionsHeader f285808p;

    /* renamed from: q */
    private View f285809q;

    /* renamed from: r */
    private C93660q f285810r;

    /* renamed from: s */
    private int f285811s = 0;

    /* renamed from: t */
    private final C58833ax f285812t;

    public C102401ah(Context context, C58833ax axVar) {
        super(context, "ImmersiveActionsUI");
        C102397ad adVar = new C102397ad(this);
        this.f285802i = adVar;
        this.f285803j = new C91937m(false, adVar);
        this.f285812t = axVar;
        inflate(getContext(), R.layout.immersive_actions_ui, this);
        ImmersiveActionsHeader immersiveActionsHeader = (ImmersiveActionsHeader) findViewById(R.id.immersive_actions_header_editor);
        immersiveActionsHeader.getClass();
        this.f285808p = immersiveActionsHeader;
        View findViewById = findViewById(R.id.immersive_actions_ui);
        findViewById.getClass();
        this.f285796c = (ImmersiveActionsArgumentContainerView) findViewById;
        View findViewById2 = findViewById(R.id.immersive_actions_disambiguation_content);
        findViewById2.getClass();
        this.f285805m = (ImmersiveActionsDisambiguationContent) findViewById2;
        ExecutedStateView executedStateView = (ExecutedStateView) findViewById(R.id.immersive_actions_confirmation_card);
        executedStateView.getClass();
        this.f285806n = executedStateView;
        View findViewById3 = findViewById(R.id.immersive_actions_arguments_scrollview);
        findViewById3.getClass();
        this.f285798e = (ImmersiveActionsListenableScrollView) findViewById3;
        ImmersiveActionsMinHeightLayout immersiveActionsMinHeightLayout = (ImmersiveActionsMinHeightLayout) findViewById(R.id.immersive_actions_arguments_layout);
        immersiveActionsMinHeightLayout.getClass();
        this.f285807o = immersiveActionsMinHeightLayout;
        ImmersiveActionsLabeledFooter immersiveActionsLabeledFooter = (ImmersiveActionsLabeledFooter) findViewById(R.id.immersive_actions_labeled_footer);
        immersiveActionsLabeledFooter.getClass();
        this.f285797d = immersiveActionsLabeledFooter;
        C93584ch chVar = (C93584ch) findViewById(R.id.small_print);
        chVar.getClass();
        View findViewById4 = findViewById(R.id.immersive_actions_arguments_disabled_ui);
        findViewById4.getClass();
        this.f285809q = findViewById4;
        this.f285799f = new C102395ab(getContext(), this.f285808p, this.f285798e, this.f285807o, this.f285796c, this.f285805m);
        this.f285811s = 0;
        ArrayList arrayList = new ArrayList();
        this.f285804l = arrayList;
        arrayList.addAll(Arrays.asList(new C93584ch[]{this.f285796c, this.f285805m, this.f285806n, this.f285797d, chVar, this.f285808p}));
    }

    /* renamed from: b */
    public final List mo82064b() {
        ArrayList arrayList = new ArrayList();
        for (C93584ch b : this.f285804l) {
            arrayList.addAll(b.mo87839b());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final FragmentManager mo87959c() {
        Context context = getContext();
        context.setTheme(2132150729);
        if (context instanceof C0395p) {
            return ((C0395p) context).getFragmentManager();
        }
        C59104x d = f285795k.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ImmersiveActionsUI");
        ((C59052c) ((C59052c) d).mo56372aa(20772)).mo56386p("Actions UI should not be used outside an AppCompatActivity");
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
            dialogFragment.show(c, str);
        }
    }

    /* renamed from: e */
    public final void mo82065e() {
    }

    /* renamed from: f */
    public final void mo82066f(String str, String str2) {
        this.f285796c.mo93184n(String.valueOf(str).concat(String.valueOf(str2)));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo82067g(C88507a aVar) {
        C93602cz czVar = (C93602cz) aVar;
        super.mo82067g(czVar);
        C88507a aVar2 = this.f239232a;
        aVar2.getClass();
        this.f285810r = new C93660q((C93602cz) aVar2, getContext(), this);
        ImmersiveActionsHeader immersiveActionsHeader = this.f285808p;
        C88507a aVar3 = this.f239232a;
        aVar3.getClass();
        immersiveActionsHeader.f285733e = (C93602cz) aVar3;
        for (C93584ch d : this.f285804l) {
            d.mo87841d(czVar);
        }
    }

    /* renamed from: i */
    public final void mo87961i(Argument argument, String str) {
        mo87960d((DialogFragment) argument.mo81281p(this.f285810r), str);
    }

    /* renamed from: j */
    public final void mo87997j(Argument argument) {
        C93666w g = this.f285796c.mo87846g(argument);
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

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r7 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130 A[LOOP:2: B:53:0x012a->B:55:0x0130, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0209  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87999l() {
        /*
            r13 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.ui.actions.a r0 = r13.f239232a
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r0
            boolean r0 = r0.mo82036A()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsHeader r0 = r13.f285808p
            com.google.android.apps.gsa.search.shared.ui.actions.a r1 = r13.f239232a
            r1.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r1 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r1
            boolean r1 = r1.mo82062y()
            r0.f285734f = r1
            android.content.Context r0 = r13.getContext()
            boolean r0 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r13.isLaidOut()
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r3 = 2
            if (r0 == 0) goto L_0x003c
            int r4 = r13.f285801h
            if (r4 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r13.f285801h = r3
            return
        L_0x003c:
            r13.f285801h = r1
            int r4 = r13.f285811s
            com.google.android.apps.gsa.search.shared.ui.actions.a r5 = r13.f239232a
            r5.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r5
            int r5 = r5.mo88009D()
            r13.f285811s = r5
            if (r4 == r5) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            com.google.android.apps.gsa.search.shared.ui.actions.a r7 = r13.f239232a
            r7.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r7 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r7
            r7.mo88037af(r6, r5)
            int r5 = r13.f285811s
            com.google.android.apps.gsa.search.shared.ui.actions.e r6 = r13.f285800g
            java.util.List r7 = r13.f285804l
            java.util.Iterator r7 = r7.iterator()
        L_0x0066:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r7.next()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch r8 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch) r8
            r8.mo87840c(r4, r5, r6)
            goto L_0x0066
        L_0x0076:
            com.google.android.apps.gsa.staticplugins.immersiveactions.ab r5 = r13.f285799f
            int r6 = r13.f285811s
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsHeader r7 = r5.f285782e
            int r7 = r7.getVisibility()
            r8 = 9
            if (r7 != 0) goto L_0x00a3
            if (r6 == r1) goto L_0x008c
            if (r6 != r8) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            int r7 = r5.f285778a
            goto L_0x00a4
        L_0x008c:
            int r7 = r5.f285779b
            if (r4 != r6) goto L_0x00a4
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsMinHeightLayout r9 = r5.f285781d
            int r9 = r9.getPaddingTop()
            int r10 = r5.f285778a
            if (r9 != r10) goto L_0x00a4
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsListenableScrollView r9 = r5.f285780c
            int r11 = r5.f285779b
            int r11 = r11 - r10
            r9.setScrollY(r11)
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsMinHeightLayout r9 = r5.f285781d
            int r10 = r9.getPaddingLeft()
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsMinHeightLayout r11 = r5.f285781d
            int r11 = r11.getPaddingRight()
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsMinHeightLayout r12 = r5.f285781d
            int r12 = r12.getPaddingBottom()
            r9.setPadding(r10, r7, r11, r12)
            r5.f285786i = r6
            if (r4 != r6) goto L_0x00cd
            if (r6 != r3) goto L_0x00c8
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsDisambiguationContent r6 = r5.f285784g
            boolean r7 = r6.f285722j
            r6.f285722j = r2
            if (r7 == 0) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsListenableScrollView r5 = r5.f285780c
            r5.f285746a = r2
            goto L_0x00d1
        L_0x00cd:
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsListenableScrollView r5 = r5.f285780c
            r5.f285746a = r1
        L_0x00d1:
            if (r0 == 0) goto L_0x011a
            android.content.Context r3 = r13.getContext()
            boolean r3 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154491f(r3)
            if (r3 != 0) goto L_0x00de
            goto L_0x0120
        L_0x00de:
            android.transition.TransitionSet r3 = new android.transition.TransitionSet
            r3.<init>()
            android.transition.TransitionSet r5 = new android.transition.TransitionSet
            r5.<init>()
            android.transition.TransitionSet r6 = new android.transition.TransitionSet
            r6.<init>()
            r3.addTransition(r5)
            r3.addTransition(r6)
            r6.setOrdering(r2)
            com.google.android.apps.gsa.staticplugins.immersiveactions.ag r7 = new com.google.android.apps.gsa.staticplugins.immersiveactions.ag
            r7.<init>(r13)
            r6.addListener(r7)
            java.util.List r7 = r13.f285804l
            java.util.Iterator r7 = r7.iterator()
        L_0x0104:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0116
            java.lang.Object r9 = r7.next()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch r9 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch) r9
            int r10 = r13.f285811s
            com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154492g(r4, r10, r9, r6, r5)
            goto L_0x0104
        L_0x0116:
            android.transition.TransitionManager.beginDelayedTransition(r13, r3)
            goto L_0x0120
        L_0x011a:
            int r5 = r13.f285801h
            if (r5 != r3) goto L_0x0120
            r13.f285801h = r2
        L_0x0120:
            int r3 = r13.f285811s
            com.google.android.apps.gsa.search.shared.ui.actions.e r5 = r13.f285800g
            java.util.List r6 = r13.f285804l
            java.util.Iterator r6 = r6.iterator()
        L_0x012a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.ch r7 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch) r7
            r7.mo87842e(r3, r5)
            goto L_0x012a
        L_0x013a:
            com.google.android.apps.gsa.search.shared.ui.actions.a r5 = r13.f239232a
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r5
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r5.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.bb.a.pn r5 = r5.mo88014I()
            r7 = 4
            if (r3 != r7) goto L_0x014a
            goto L_0x01aa
        L_0x014a:
            if (r5 == 0) goto L_0x0166
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r9 = r6.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r9 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r9
            boolean r9 = r9.mo81436f()
            if (r9 != 0) goto L_0x0166
            com.google.android.apps.gsa.sidekick.shared.ui.m r3 = r13.f285803j
            com.google.android.apps.gsa.search.shared.ui.actions.e r6 = r13.f285800g
            android.content.Context r8 = r13.getContext()
            android.graphics.drawable.Drawable r5 = r6.mo82072a(r5, r8)
            r3.mo76758a(r5)
            goto L_0x01aa
        L_0x0166:
            if (r3 == r8) goto L_0x019c
            com.google.bb.a.x r3 = r6.f236107m
            com.google.bb.a.x r8 = com.google.p4152bb.p4153a.C55421x.ADD_RELATIONSHIP
            if (r3 != r8) goto L_0x016f
            goto L_0x019c
        L_0x016f:
            if (r5 == 0) goto L_0x017e
            int r3 = r5.f145872e
            int r3 = com.google.p4152bb.p4153a.C55419v.m87685a(r3)
            if (r3 != 0) goto L_0x017a
            goto L_0x017e
        L_0x017a:
            r5 = 13
            if (r3 == r5) goto L_0x0184
        L_0x017e:
            com.google.bb.a.x r3 = r6.f236107m
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.ADD_REMINDER
            if (r3 != r5) goto L_0x0190
        L_0x0184:
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131102394(0x7f060aba, float:1.7817225E38)
            int r3 = r3.getColor(r5)
            goto L_0x01a7
        L_0x0190:
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131102386(0x7f060ab2, float:1.7817208E38)
            int r3 = r3.getColor(r5)
            goto L_0x01a7
        L_0x019c:
            android.content.res.Resources r3 = r13.getResources()
            r5 = 2131102393(0x7f060ab9, float:1.7817223E38)
            int r3 = r3.getColor(r5)
        L_0x01a7:
            r13.setBackgroundColor(r3)
        L_0x01aa:
            com.google.android.apps.gsa.search.shared.ui.actions.a r3 = r13.f239232a
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r3 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r3
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r3 = r3.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r3 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r3
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsHeader r5 = r13.f285808p
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r3 = r3.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r3 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r3
            if (r3 == 0) goto L_0x01c2
            boolean r3 = r3.mo81436f()
            if (r3 == 0) goto L_0x01c2
            r3 = 1
            goto L_0x01c3
        L_0x01c2:
            r3 = 0
        L_0x01c3:
            android.content.res.Resources r6 = r5.getResources()
            r8 = 2131169138(0x7f070f72, float:1.7952598E38)
            int r6 = r6.getDimensionPixelSize(r8)
            float r6 = (float) r6
            if (r1 == r3) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            r6 = 0
        L_0x01d3:
            android.view.View r1 = r5.f285730b
            r1.setElevation(r6)
            com.google.android.apps.gsa.search.shared.ui.actions.a r1 = r13.f239232a
            r1.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r1 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz) r1
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r1.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r1 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r1
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r3 = r1.f235985a
            boolean r3 = r3.mo81118g()
            r5 = 8
            if (r3 != 0) goto L_0x01fc
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r1 = r1.f235985a
            boolean r1 = r1.mo81121i()
            if (r1 == 0) goto L_0x01f6
            goto L_0x01fc
        L_0x01f6:
            android.view.View r1 = r13.f285809q
            r1.setVisibility(r5)
            goto L_0x0201
        L_0x01fc:
            android.view.View r1 = r13.f285809q
            r1.setVisibility(r2)
        L_0x0201:
            if (r0 != 0) goto L_0x0205
            r13.f285801h = r2
        L_0x0205:
            int r0 = r13.f285811s
            if (r4 == r0) goto L_0x0214
            if (r4 == 0) goto L_0x020f
            if (r4 == r5) goto L_0x020f
            if (r0 != r7) goto L_0x0214
        L_0x020f:
            r0 = 32
            r13.sendAccessibilityEvent(r0)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.C102401ah.mo87999l():void");
    }

    public final void setBackgroundColor(int i) {
        Window window;
        if (i != 0) {
            ImmersiveActionsExecuteButtonContainer immersiveActionsExecuteButtonContainer = this.f285808p.f285731c;
            immersiveActionsExecuteButtonContainer.f285727e = i;
            if (immersiveActionsExecuteButtonContainer.f285728f) {
                immersiveActionsExecuteButtonContainer.mo93185a();
            }
            if (!this.f285812t.mo56113h()) {
                Context context = getContext();
                while (true) {
                    window = null;
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof C102420j) {
                        Context baseContext = ((C102420j) context).getBaseContext();
                        while (true) {
                            if (!(baseContext instanceof ContextWrapper)) {
                                break;
                            } else if (baseContext instanceof Activity) {
                                window = ((Activity) baseContext).getWindow();
                                break;
                            } else {
                                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            }
                        }
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (window != null) {
                    window.clearFlags(67108864);
                    window.setStatusBarColor(i);
                    return;
                }
                return;
            }
            ((C88522b) this.f285812t.mo56107c()).mo82144f(i);
        }
    }
}
