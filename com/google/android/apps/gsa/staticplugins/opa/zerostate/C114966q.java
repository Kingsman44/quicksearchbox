package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.C4186o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114732b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114753g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.q */
/* compiled from: PG */
public class C114966q implements C114754h {

    /* renamed from: e */
    public static final C59071e f319032e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.q");

    /* renamed from: A */
    protected RecyclerView f319033A;

    /* renamed from: B */
    protected View f319034B;

    /* renamed from: C */
    protected C58485gu f319035C;

    /* renamed from: D */
    protected C114753g f319036D;

    /* renamed from: E */
    protected C4186o f319037E;

    /* renamed from: a */
    private final C68214a f319038a;

    /* renamed from: b */
    private final C114732b f319039b;

    /* renamed from: c */
    private final C114119ax f319040c;

    /* renamed from: f */
    protected final Context f319041f;

    /* renamed from: g */
    public final C114708ci f319042g;

    /* renamed from: h */
    protected final C114604by f319043h;

    /* renamed from: i */
    protected final C114712cm f319044i;

    /* renamed from: j */
    protected final SettableFuture f319045j = new SettableFuture();

    /* renamed from: k */
    protected final C108226ax f319046k;

    /* renamed from: l */
    protected final C114796at f319047l;

    /* renamed from: m */
    protected final C114839ci f319048m;

    /* renamed from: n */
    protected final C53306j f319049n;

    /* renamed from: o */
    protected final C68214a f319050o;

    /* renamed from: p */
    protected final C114742l f319051p;

    /* renamed from: q */
    public final C22871g f319052q;

    /* renamed from: r */
    protected final C114865dh f319053r;

    /* renamed from: s */
    protected C91097g f319054s;

    /* renamed from: t */
    protected C28291i f319055t;

    /* renamed from: u */
    protected boolean f319056u;

    /* renamed from: v */
    boolean f319057v;

    /* renamed from: w */
    protected ViewGroup f319058w;

    /* renamed from: x */
    protected ViewGroup f319059x;

    /* renamed from: y */
    protected SwipeRefreshLayout f319060y;

    /* renamed from: z */
    protected C114711cl f319061z;

    public C114966q(Context context, C114709cj cjVar, C114604by byVar, C114712cm cmVar, C114742l lVar, C68214a aVar, C22871g gVar, C114732b bVar, C114748b bVar2, C114839ci ciVar, C114796at atVar, C68214a aVar2, C114865dh dhVar, C108226ax axVar, boolean z, C114119ax axVar2) {
        C114748b bVar3 = bVar2;
        C58976aa aaVar = C58975e.f156826a;
        this.f319041f = context;
        C114709cj cjVar2 = cjVar;
        this.f319042g = cjVar.mo101531a(z, bVar3.f318449b);
        this.f319043h = byVar;
        this.f319044i = cmVar;
        this.f319051p = lVar;
        this.f319038a = aVar;
        this.f319053r = dhVar;
        this.f319052q = gVar;
        this.f319039b = bVar;
        this.f319046k = axVar;
        this.f319049n = bVar3.f318449b;
        this.f319048m = ciVar;
        this.f319040c = axVar2;
        this.f319047l = atVar;
        this.f319050o = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo101756A(boolean z) {
        if (this.f319034B == null) {
            ViewGroup viewGroup = this.f319058w;
            viewGroup.getClass();
            ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.zero_state_offline_bar_view_stub);
            if (viewStub != null) {
                this.f319034B = viewStub.inflate();
            } else {
                return;
            }
        }
        int i = true != z ? R.string.zero_state_network_error_toast_message : R.string.zero_state_generic_error_toast_message;
        View view = this.f319034B;
        view.getClass();
        ((TextView) view.findViewById(R.id.zero_state_blue_bar_description)).setText(this.f319041f.getResources().getString(i));
        View view2 = this.f319034B;
        view2.getClass();
        view2.setVisibility(0);
    }

    /* renamed from: a */
    public ViewGroup mo101411a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319058w == null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f319041f).inflate(R.layout.zero_state_main_view, (ViewGroup) null);
            this.f319058w = viewGroup;
            mo101548d(viewGroup);
            mo101549e();
            ViewGroup viewGroup2 = this.f319058w;
            viewGroup2.getClass();
            RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.zero_state_content_view);
            int i = this.f319041f.getResources().getConfiguration().orientation;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f319041f));
            recyclerView.setLayerType(2, (Paint) null);
            C114711cl a = this.f319044i.mo101533a(this.f319049n);
            this.f319061z = a;
            recyclerView.setAdapter(a);
            mo101760x(recyclerView);
            C114119ax axVar = this.f319040c;
            if (axVar != null) {
                recyclerView.addOnScrollListener(axVar);
            }
            recyclerView.addOnScrollListener(((C114737g) this.f319050o.mo27525b()).mo101567f(true));
            this.f319033A = recyclerView;
            this.f319042g.f318285f.mo101443e();
            ViewGroup viewGroup3 = this.f319058w;
            viewGroup3.getClass();
            this.f319059x = (ViewGroup) viewGroup3.findViewById(R.id.zero_state_loading_view);
            ViewGroup viewGroup4 = this.f319058w;
            viewGroup4.getClass();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup4.findViewById(R.id.swipe_refresh);
            this.f319060y = swipeRefreshLayout;
            swipeRefreshLayout.getClass();
            swipeRefreshLayout.mo8792j(R.color.quantum_googblue);
            swipeRefreshLayout.mo8793k(true, this.f319041f.getResources().getDimensionPixelSize(R.dimen.refresh_progress_offset));
            C114900p pVar = new C114900p(this, swipeRefreshLayout);
            this.f319037E = pVar;
            swipeRefreshLayout.f13508a = pVar;
            mo101758o();
        }
        ViewGroup viewGroup5 = this.f319058w;
        viewGroup5.getClass();
        return viewGroup5;
    }

    /* renamed from: b */
    public C28293k mo101412b() {
        C114711cl clVar = this.f319061z;
        if (clVar == null) {
            return null;
        }
        C28257a aVar = (C28257a) clVar.mo33782a();
        List list = aVar.f76909b;
        if (list.size() > 1) {
            return C28293k.m52907d(aVar.f76908a, list.subList(1, list.size()));
        }
        return C28293k.m52908e(aVar.f76908a, new C28293k[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo101547c(C58485gu guVar, C87546b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (guVar.isEmpty()) {
            C59104x d = f319032e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSBaseController");
            ((C59052c) ((C59052c) d).mo56372aa(29117)).mo56386p("#initializeSections(): received empty section data list.");
            return;
        }
        C58485gu i = mo101757i(guVar, bVar);
        this.f319035C = i;
        i.getClass();
        i.size();
        C114711cl clVar = this.f319061z;
        clVar.getClass();
        clVar.f318305a = i;
        clVar.mObservable.mo2879a();
        ((C113854ci) this.f319038a.mo27525b()).mo100702c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo101548d(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo101549e() {
        C114708ci ciVar = this.f319042g;
        C114898n nVar = new C114898n(this);
        C58976aa aaVar = C58975e.f156826a;
        ciVar.f318282c = nVar;
    }

    /* renamed from: f */
    public boolean mo101416f(int i) {
        RecyclerView recyclerView = this.f319033A;
        return recyclerView != null && recyclerView.canScrollVertically(i);
    }

    /* renamed from: g */
    public final /* synthetic */ long mo101417g() {
        return 0;
    }

    /* renamed from: h */
    public final Animator mo101418h() {
        ViewGroup viewGroup = this.f319058w;
        if (viewGroup == null) {
            return new ObjectAnimator();
        }
        return this.f319048m.mo101648a(viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C58485gu mo101757i(C58485gu guVar, C87546b bVar) {
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < guVar.size(); i++) {
            mo101759p(e, (C114758l) guVar.get(i), (C58485gu) null, bVar);
        }
        return e.mo55394f();
    }

    /* renamed from: j */
    public final /* synthetic */ C63204j mo101420j() {
        return null;
    }

    /* renamed from: k */
    public final void mo101421k(C0657fs fsVar) {
        RecyclerView recyclerView = this.f319033A;
        if (recyclerView != null) {
            recyclerView.mOnItemTouchListeners.add(fsVar);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo101422l() {
    }

    /* renamed from: m */
    public final void mo101423m() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319042g.mo101526b();
        if (this.f319033A != null) {
            this.f319055t.mo33787c();
            RecyclerView recyclerView = this.f319033A;
            recyclerView.getClass();
            this.f319055t = new C28291i(recyclerView, this.f319051p);
            RecyclerView recyclerView2 = this.f319033A;
            recyclerView2.getClass();
            recyclerView2.setAdapter((C0640fb) null);
        }
        C58485gu guVar = this.f319035C;
        if (guVar != null) {
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C114757k) guVar.get(i)).mo101580d();
            }
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void mo101424n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo101758o() {
        C59104x d = f319032e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSBaseController");
        ((C59052c) ((C59052c) d).mo56372aa(29118)).mo56389s("#initializeSectionsAsync() for baseController with hashcode as %s", this);
        new C90873ag(C60856cj.m92897f(this.f319042g.mo101525a(), this.f319045j), this.f319052q, "initializeSectionsAsync", new C114775j(this)).mo85223a(new C114895k(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo101759p(C58480gp gpVar, C114758l lVar, C58485gu guVar, C87546b bVar) {
        C58833ax a = this.f319043h.mo101449a(lVar, guVar, this.f319046k, bVar, this.f319054s, this.f319049n, this.f319047l, false, (AnimatorListenerAdapter) null);
        if (a.mo56113h()) {
            gpVar.mo55395g((C114757k) a.mo56107c());
        }
    }

    /* renamed from: q */
    public final void mo101427q(boolean z) {
        RecyclerView recyclerView = this.f319033A;
        if (recyclerView == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C0653fo foVar = recyclerView.mLayout;
        if (foVar == null) {
            C59104x d = f319032e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSBaseController");
            ((C59052c) ((C59052c) d).mo56372aa(29121)).mo56386p("#onPageSelected(): Zero State view has no layout manager attached.");
            return;
        }
        foVar.scrollToPosition(0);
    }

    /* renamed from: r */
    public final void mo101428r() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo101429s() {
    }

    /* renamed from: t */
    public final void mo101430t(C87546b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319045j.mo57356n(bVar);
    }

    /* renamed from: u */
    public final void mo101431u(C114753g gVar) {
        this.f319036D = gVar;
    }

    /* renamed from: v */
    public final /* synthetic */ void mo101432v(C28293k kVar) {
    }

    /* renamed from: w */
    public final void mo101433w(C91097g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319054s = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo101760x(RecyclerView recyclerView) {
        C114711cl clVar = this.f319061z;
        clVar.getClass();
        C28293k a = clVar.mo33782a();
        recyclerView.getClass();
        C28295m.m52919e(recyclerView, ((C28257a) a).f76908a);
        C28291i iVar = new C28291i(recyclerView, this.f319051p);
        this.f319055t = iVar;
        C114711cl clVar2 = this.f319061z;
        clVar2.getClass();
        iVar.f76970d = clVar2;
        iVar.mo33786b();
        recyclerView.getViewTreeObserver().dispatchOnGlobalLayout();
        recyclerView.addOnScrollListener(this.f319039b.mo101550a(a, 3));
    }

    /* renamed from: y */
    public final void mo101435y() {
    }

    /* renamed from: z */
    public final void mo101436z(C53270hr hrVar, C53287ih ihVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319042g.mo101530f(hrVar, (C53287ih) null);
        this.f319057v = true;
    }
}
