package com.google.android.apps.gsa.staticplugins.opa.p8188aj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108235bf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108327ep;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108328eq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108339fa;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108424ie;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.apps.gsa.staticplugins.opa.p8311aw.C107623a;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.MoveUpwardBehavior;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113986e;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aj.e */
/* compiled from: PG */
public final class C106184e implements C108230ba, C113986e {

    /* renamed from: j */
    public final Context f296331j;

    /* renamed from: k */
    public final FrameLayout f296332k;

    /* renamed from: l */
    final C108423id f296333l;

    /* renamed from: m */
    public int f296334m;

    /* renamed from: n */
    private final LayoutInflater f296335n;

    /* renamed from: o */
    private final C108226ax f296336o;

    /* renamed from: p */
    private final ViewGroup f296337p;

    /* renamed from: q */
    private final C108327ep f296338q;

    /* renamed from: r */
    private final C108436iq f296339r;

    /* renamed from: s */
    private final RecyclerView f296340s;

    /* renamed from: t */
    private C108237bh f296341t;

    public C106184e(C108226ax axVar, C108237bh bhVar, Activity activity, Context context, C108424ie ieVar, C108328eq eqVar) {
        this.f296331j = context;
        this.f296336o = axVar;
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.f296334m = C87566i.m142307f(intent.getExtras());
        }
        this.f296341t = bhVar;
        this.f296338q = eqVar.mo96788a();
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(context, 2132148450));
        this.f296335n = from;
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.opa_mini_plate_v2, (ViewGroup) null);
        this.f296337p = viewGroup;
        C106186g gVar = new C106186g(from, bhVar);
        this.f296339r = gVar;
        C106186g gVar2 = gVar;
        ((FrameLayout) viewGroup.findViewById(R.id.third_party_header_container)).addView(gVar.f296346a);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.opa_main_view_inner);
        this.f296332k = frameLayout;
        frameLayout.setClickable(true);
        frameLayout.addOnAttachStateChangeListener(new C106180a(this));
        this.f296333l = ieVar.mo96870a(this.f296341t, axVar, viewGroup);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.opa_fab_container);
        frameLayout2.addOnAttachStateChangeListener(new C106181b(frameLayout2));
        this.f296340s = new RecyclerView(context);
    }

    /* renamed from: a */
    public static final void m176855a(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof C1773f) {
            ((C1773f) layoutParams).mo4974a(new MoveUpwardBehavior());
        }
    }

    /* renamed from: A */
    public final /* synthetic */ void mo95359A(Context context, C51656n nVar) {
    }

    /* renamed from: B */
    public final void mo95360B() {
    }

    /* renamed from: C */
    public final void mo95361C(List list) {
    }

    /* renamed from: D */
    public final /* synthetic */ void mo95362D() {
    }

    /* renamed from: E */
    public final void mo95363E() {
    }

    /* renamed from: F */
    public final void mo95364F(boolean z) {
    }

    /* renamed from: G */
    public final void mo95365G() {
    }

    /* renamed from: H */
    public final void mo95366H() {
    }

    /* renamed from: I */
    public final /* synthetic */ void mo95367I() {
    }

    /* renamed from: J */
    public final void mo95368J(long j, String str, String str2) {
        this.f296336o.mo96409v(j, str2);
    }

    /* renamed from: K */
    public final void mo95369K(boolean z, long j, C58833ax axVar) {
    }

    /* renamed from: L */
    public final /* synthetic */ void mo95370L() {
    }

    /* renamed from: M */
    public final void mo95371M(C2333ah ahVar) {
    }

    /* renamed from: N */
    public final void mo95372N(C108232bc bcVar) {
    }

    /* renamed from: O */
    public final void mo95373O(List list) {
    }

    /* renamed from: P */
    public final void mo95374P() {
    }

    /* renamed from: Q */
    public final void mo95375Q(boolean z) {
    }

    /* renamed from: R */
    public final /* synthetic */ void mo95376R(boolean z) {
    }

    /* renamed from: S */
    public final void mo95377S() {
    }

    /* renamed from: T */
    public final void mo95378T() {
    }

    /* renamed from: U */
    public final void mo95379U(C108303dt dtVar) {
    }

    /* renamed from: V */
    public final void mo95380V(boolean z) {
    }

    /* renamed from: W */
    public final /* synthetic */ void mo95381W(C58485gu guVar) {
    }

    /* renamed from: X */
    public final /* synthetic */ void mo95382X(boolean z) {
    }

    /* renamed from: Y */
    public final /* synthetic */ void mo95383Y(boolean z) {
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo95384Z(boolean z) {
    }

    /* renamed from: aA */
    public final void mo95385aA() {
    }

    /* renamed from: aB */
    public final void mo95386aB() {
    }

    /* renamed from: aC */
    public final void mo95387aC() {
    }

    /* renamed from: aD */
    public final void mo95388aD() {
    }

    /* renamed from: aE */
    public final /* synthetic */ void mo95389aE() {
    }

    /* renamed from: aa */
    public final /* synthetic */ void mo95390aa(boolean z) {
    }

    /* renamed from: ab */
    public final void mo95391ab(C108237bh bhVar) {
        this.f296341t = bhVar;
    }

    /* renamed from: ac */
    public final void mo95392ac(C108228az azVar) {
    }

    /* renamed from: ad */
    public final /* synthetic */ void mo95393ad() {
    }

    /* renamed from: ae */
    public final /* synthetic */ void mo95394ae(String str) {
    }

    /* renamed from: af */
    public final /* synthetic */ void mo95395af() {
    }

    /* renamed from: ag */
    public final void mo95396ag() {
    }

    /* renamed from: ah */
    public final /* synthetic */ void mo95397ah(long j, String str) {
    }

    /* renamed from: ai */
    public final /* synthetic */ boolean mo95398ai() {
        return false;
    }

    /* renamed from: aj */
    public final boolean mo95399aj() {
        return this.f296332k.getLayoutParams().height == -1;
    }

    /* renamed from: ak */
    public final boolean mo95400ak() {
        return false;
    }

    /* renamed from: al */
    public final boolean mo95401al() {
        return false;
    }

    /* renamed from: am */
    public final boolean mo95402am() {
        return false;
    }

    /* renamed from: an */
    public final /* synthetic */ boolean mo95403an(C108262cf cfVar) {
        return false;
    }

    /* renamed from: ao */
    public final /* synthetic */ boolean mo95404ao() {
        return false;
    }

    /* renamed from: ap */
    public final boolean mo95405ap() {
        return false;
    }

    /* renamed from: aq */
    public final C108412ht mo95406aq(List list, boolean z, int i, boolean z2) {
        return null;
    }

    /* renamed from: ar */
    public final void mo95407ar() {
    }

    /* renamed from: as */
    public final void mo95408as(List list) {
    }

    /* renamed from: at */
    public final C108232bc mo95409at() {
        return null;
    }

    /* renamed from: au */
    public final /* synthetic */ void mo95410au() {
    }

    /* renamed from: av */
    public final void mo95411av() {
    }

    /* renamed from: aw */
    public final void mo95412aw() {
    }

    /* renamed from: ax */
    public final void mo95413ax() {
    }

    /* renamed from: ay */
    public final void mo95414ay() {
    }

    /* renamed from: az */
    public final void mo95415az() {
    }

    /* renamed from: e */
    public final /* synthetic */ int mo95416e() {
        return 0;
    }

    /* renamed from: f */
    public final int mo95417f() {
        return 0;
    }

    /* renamed from: g */
    public final /* synthetic */ ViewGroup mo95418g() {
        return this.f296340s;
    }

    /* renamed from: h */
    public final ViewGroup mo95419h() {
        return this.f296337p;
    }

    /* renamed from: i */
    public final FrameLayout mo95420i() {
        return this.f296332k;
    }

    /* renamed from: j */
    public final C108235bf mo95421j() {
        return new C106182c();
    }

    /* renamed from: k */
    public final C108237bh mo95422k() {
        return this.f296341t;
    }

    /* renamed from: l */
    public final /* synthetic */ C108339fa mo95423l() {
        return null;
    }

    /* renamed from: m */
    public final C108423id mo95424m() {
        return this.f296333l;
    }

    /* renamed from: n */
    public final C108436iq mo95425n() {
        return this.f296339r;
    }

    /* renamed from: o */
    public final C107623a mo95426o() {
        return new C106183d(this);
    }

    /* renamed from: p */
    public final C60321oe mo95427p(C58833ax axVar) {
        C60321oe a = this.f296338q.mo96785a(axVar);
        this.f296338q.mo96787c();
        return a;
    }

    /* renamed from: q */
    public final /* synthetic */ C63088z mo95428q() {
        return null;
    }

    /* renamed from: r */
    public final /* synthetic */ Set mo95429r() {
        return C58733pz.f156496a;
    }

    /* renamed from: s */
    public final void mo95430s(C108232bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: t */
    public final /* synthetic */ void mo95431t(C108232bc bcVar) {
    }

    /* renamed from: u */
    public final void mo95432u(C108430ik ikVar) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo95433v(C58485gu guVar) {
    }

    /* renamed from: w */
    public final void mo95434w(int i) {
    }

    /* renamed from: x */
    public final void mo95435x() {
    }

    /* renamed from: y */
    public final void mo95436y() {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo95437z(Intent intent, C91096f fVar) {
    }
}
