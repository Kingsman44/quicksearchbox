package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.monet.p7070b.p7092k.C90250a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7113e.C90321e;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91765a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91767c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91768d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91770f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91771g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91775k;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91821b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7249e.C91822a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91851j;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91852k;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91869k;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91870l;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91722f;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91723g;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91725i;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105457d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105388a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105432b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d.C105458a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d.C105459b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8153a.C105472b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23292h;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23293i;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23296l;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23300p;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23306v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ab */
/* compiled from: PG */
public abstract class C105474ab extends C23300p implements C91820a, C91765a, C91869k {

    /* renamed from: M */
    private static final C59071e f294165M = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ab");

    /* renamed from: A */
    protected C91851j f294166A;

    /* renamed from: B */
    public final C105659y f294167B;

    /* renamed from: C */
    public final C105653u f294168C;

    /* renamed from: N */
    private final C90314b f294169N;

    /* renamed from: O */
    private final C105473aa f294170O;

    /* renamed from: R */
    private final C105660z f294171R;

    /* renamed from: S */
    private final C91768d f294172S;

    /* renamed from: T */
    private final C105657w f294173T;

    /* renamed from: U */
    private final C90323a f294174U;

    /* renamed from: V */
    private final C91728l f294175V;

    /* renamed from: W */
    private final C90321e f294176W;

    /* renamed from: X */
    private final C105658x f294177X;

    /* renamed from: Y */
    private final C91822a f294178Y;

    /* renamed from: Z */
    private C90315c f294179Z;

    /* renamed from: a */
    protected final Context f294180a;

    /* renamed from: aa */
    private C91767c f294181aa;

    /* renamed from: ab */
    private FrameLayout f294182ab;

    /* renamed from: ac */
    private boolean f294183ac;

    /* renamed from: ad */
    private boolean f294184ad;

    /* renamed from: ae */
    private ChildStub f294185ae;

    /* renamed from: af */
    private ChildStub f294186af;

    /* renamed from: ag */
    private ChildStub f294187ag;

    /* renamed from: ah */
    private String f294188ah;

    /* renamed from: ai */
    private C91775k f294189ai;

    /* renamed from: aj */
    private final C90479a f294190aj;

    /* renamed from: ak */
    private C0658ft f294191ak;

    /* renamed from: al */
    private final View.OnLayoutChangeListener f294192al = new C105648p(this);

    /* renamed from: am */
    private C91722f f294193am;

    /* renamed from: b */
    public final C105457d f294194b;

    /* renamed from: c */
    public final boolean f294195c;

    /* renamed from: d */
    protected final C105419b f294196d;

    /* renamed from: e */
    public final C91825b f294197e;

    /* renamed from: f */
    public final C105388a f294198f;

    /* renamed from: g */
    protected final C91821b f294199g;

    /* renamed from: h */
    public final C105459b f294200h;

    /* renamed from: i */
    public boolean f294201i;

    /* renamed from: j */
    public boolean f294202j;

    /* renamed from: k */
    public C105472b f294203k;

    /* renamed from: l */
    public boolean f294204l;

    /* renamed from: m */
    public boolean f294205m;

    /* renamed from: n */
    public boolean f294206n;

    /* renamed from: o */
    public SwipeRefreshLayout f294207o;

    /* renamed from: p */
    public int f294208p;

    /* renamed from: q */
    public RecyclerView f294209q;

    /* renamed from: r */
    public boolean f294210r;

    /* renamed from: s */
    public int f294211s;

    /* renamed from: t */
    public C23292h f294212t;

    /* renamed from: u */
    public C91870l f294213u;

    /* renamed from: v */
    public C90250a f294214v;

    /* renamed from: w */
    public C105604ex f294215w;

    /* renamed from: x */
    protected final C105432b f294216x;

    /* renamed from: y */
    protected final C90320d f294217y;

    /* renamed from: z */
    public final boolean f294218z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C105474ab(C22945j jVar, Context context, C105432b bVar, C105388a aVar, boolean z, C23306v vVar, C90314b bVar2, C105457d dVar, C91821b bVar3, C91768d dVar2, C105419b bVar4, C90323a aVar2, C91825b bVar5, C91728l lVar, C90479a aVar3, C91822a aVar4, C90320d dVar3, C105459b bVar6) {
        super(jVar, vVar);
        C22945j jVar2 = jVar;
        C23306v vVar2 = vVar;
        this.f294180a = context;
        this.f294216x = bVar;
        this.f294169N = bVar2;
        this.f294194b = dVar;
        this.f294195c = z;
        this.f294190aj = aVar3;
        this.f294199g = bVar3;
        this.f294198f = aVar;
        this.f294170O = new C105473aa(this);
        this.f294196d = bVar4;
        this.f294171R = new C105660z(this);
        this.f294174U = aVar2;
        this.f294197e = bVar5;
        this.f294172S = dVar2;
        this.f294175V = lVar;
        this.f294178Y = aVar4;
        this.f294200h = bVar6;
        this.f294173T = new C105657w(this);
        this.f294217y = dVar3;
        this.f294176W = new C105652t(this);
        this.f294167B = new C105659y(this);
        this.f294177X = new C105658x(this);
        this.f294168C = new C105653u(this);
        this.f63793J.setHasStableIds(true);
        this.f294218z = true;
    }

    /* renamed from: ag */
    private final Rect m175293ag() {
        View findChildViewUnder = this.f294209q.findChildViewUnder((float) (this.f294180a.getResources().getDisplayMetrics().widthPixels / 2), 0.0f);
        Rect rect = new Rect();
        RecyclerView.getDecoratedBoundsWithMarginsInt(findChildViewUnder, rect);
        return rect;
    }

    /* renamed from: ah */
    private final boolean m175294ah() {
        return this.f63786G.f63800a.mo28713l("MINUS_ONE_HEADER") || this.f63786G.f63800a.mo28713l("DOODLE_HEADER");
    }

    /* renamed from: A */
    public final void mo86392A(long j) {
        this.f294198f.mo94588jf(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams mo28798B() {
        return new C0654fp(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public View mo94593C() {
        FrameLayout frameLayout = new FrameLayout(this.f294180a);
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.f294180a);
        this.f294207o = swipeRefreshLayout;
        swipeRefreshLayout.setId(R.id.feed_swipe_refresh_layout);
        frameLayout.addView(this.f294207o, new ViewGroup.MarginLayoutParams(-1, -1));
        this.f294208p = this.f294207o.f13517j;
        FrameLayout frameLayout2 = new FrameLayout(this.f294180a);
        this.f294182ab = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerView ab = super.mo28799ab(mo28804x());
        this.f294209q = ab;
        ab.mHasFixedSize = true;
        C105472b bVar = new C105472b(this.f294167B);
        this.f294203k = bVar;
        this.f294209q.setItemAnimator(bVar);
        this.f294209q.setId(R.id.recycler_view);
        this.f294207o.setEnabled(true);
        this.f294207o.addView(this.f294182ab);
        this.f294182ab.addView(this.f294209q);
        this.f294191ak = new C105649q(this);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public ViewGroup mo94594D() {
        return this.f294182ab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract C8142xb mo94595E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94596F(boolean z) {
        C105457d dVar = this.f294194b;
        if (dVar.f294074a) {
            dVar.f294075b = z;
        }
        Resources resources = this.f294180a.getResources();
        if (z) {
            this.f294207o.mo8790i(resources.getColor(R.color.agsa_color_dark_primary), resources.getColor(R.color.googleapp_progress_bar_red), resources.getColor(R.color.googleapp_progress_bar_yellow), resources.getColor(R.color.googleapp_progress_bar_green));
            SwipeRefreshLayout swipeRefreshLayout = this.f294207o;
            swipeRefreshLayout.f13513f.setBackgroundColor(resources.getColor(R.color.agsa_color_dark_surface_elevation_2));
            return;
        }
        this.f294207o.mo8790i(resources.getColor(R.color.agsa_color_light_primary), resources.getColor(R.color.googleapp_progress_bar_red), resources.getColor(R.color.googleapp_progress_bar_yellow), resources.getColor(R.color.googleapp_progress_bar_green));
        SwipeRefreshLayout swipeRefreshLayout2 = this.f294207o;
        swipeRefreshLayout2.f13513f.setBackgroundColor(resources.getColor(R.color.agsa_color_light_surface_elevation_2));
    }

    /* renamed from: G */
    public final Pair mo94825G() {
        int i;
        int i2;
        C0653fo foVar = this.f294209q.mLayout;
        if (foVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) foVar;
            i = linearLayoutManager.findFirstVisibleItemPosition();
            i2 = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            C59104x d = f294165M.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RecyclerViewRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(22336)).mo56386p("Expected a LinearLayoutManager.");
            int i3 = C90755l.f253831a;
            i = 0;
            i2 = 0;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94826H(FrameLayout frameLayout) {
        if (this.f294185ae == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ChildStub childStub = new ChildStub(this.f294180a);
            childStub.setLayoutParams(layoutParams);
            frameLayout.addView(childStub);
            ((C23219p) this.f294216x.mo94539d()).mo28685c(new C105650r(this, childStub));
            this.f294185ae = childStub;
        }
        if (this.f294186af == null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            ChildStub childStub2 = new ChildStub(this.f294180a);
            childStub2.setLayoutParams(layoutParams2);
            frameLayout.addView(childStub2);
            ((C23219p) this.f294216x.mo94541f()).mo28685c(new C23243a(childStub2));
            this.f294186af = childStub2;
        }
        if (this.f294187ag == null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            ChildStub childStub3 = new ChildStub(this.f294180a);
            childStub3.setLayoutParams(layoutParams3);
            this.f294182ab.addView(childStub3);
            ((C23219p) this.f294216x.mo94540e()).mo28685c(new C105651s(this, childStub3));
            this.f294187ag = childStub3;
        }
    }

    /* renamed from: I */
    public final void mo94827I() {
        C91722f fVar = this.f294193am;
        if (fVar != null) {
            synchronized (fVar.f255816a.f255822b) {
                fVar.f255816a.f255828h.remove(fVar);
                if (fVar.f255816a.f255828h.isEmpty()) {
                    C91725i iVar = fVar.f255816a;
                    synchronized (iVar.f255822b) {
                        C91723g gVar = iVar.f255832l;
                        if (gVar != null) {
                            iVar.f255823c.unbindService(gVar);
                            iVar.f255831k = null;
                            iVar.f255832l = null;
                        }
                    }
                }
            }
            this.f294193am = null;
        }
    }

    /* renamed from: J */
    public final void mo94828J(boolean z, Pair pair) {
        if (this.f294213u == null) {
            this.f294213u = this.f294200h.mo86397a(this.f63126Q);
        }
        if (z || this.f294183ac) {
            this.f294183ac = false;
            this.f294166A.mo86341c(z, new C91775k(this.f63793J, this.f294180a, this.f294209q.getWidth()), 0, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        }
    }

    /* renamed from: K */
    public final void mo94829K() {
        if (this.f294190aj.mo84228c() && ((Boolean) ((C23249a) this.f294216x.mo94553r()).mo28725a()).booleanValue() && !this.f294184ad) {
            this.f294184ad = true;
            C105458a aVar = new C105458a(this.f294180a);
            mo94594D().addView(aVar, new FrameLayout.LayoutParams(-1, -1));
            this.f294200h.f294090c = aVar;
        }
    }

    /* renamed from: L */
    public final void mo94830L() {
        if (this.f294193am == null && this.f294210r && ((Boolean) ((C23249a) this.f294216x.mo94543h()).mo28725a()).booleanValue()) {
            C91722f p = this.f294175V.mo86229p();
            this.f294193am = p;
            synchronized (p.f255816a.f255822b) {
                C91725i iVar = p.f255816a;
                synchronized (iVar.f255822b) {
                    if (iVar.f255832l == null) {
                        Intent intent = new Intent("com.google.android.apps.gsa.sidekick.shared.remoteapi.INowService");
                        intent.setPackage(iVar.f255823c.getPackageName());
                        iVar.f255832l = new C91723g(iVar);
                        if (!iVar.f255823c.bindService(intent, iVar.f255832l, 1)) {
                            ((C59052c) ((C59052c) C91725i.f255821a.mo56225c()).mo56372aa(11888)).mo56386p("Error binding to predictive cards service");
                            iVar.f255832l = null;
                            return;
                        }
                    }
                    p.f255816a.f255828h.add(p);
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo94831M() {
        C23292h hVar = this.f294212t;
        if (m175294ah()) {
            C58976aa aaVar = C58975e.f156826a;
            C23293i c = this.f63793J.mo28783c(0);
            c.getClass();
            C58485gu n = C58485gu.m89846n(c);
            hVar.f63774a.clear();
            hVar.f63774a.addAll(n);
            hVar.mObservable.mo2879a();
        }
    }

    /* renamed from: N */
    public final void mo94832N(int i, int i2) {
        C0653fo foVar = this.f294209q.mLayout;
        if (foVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) foVar).scrollToPositionWithOffset(i, i2);
            return;
        }
        C59104x d = f294165M.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RecyclerViewRenderer");
        ((C59052c) ((C59052c) d).mo56372aa(22341)).mo56386p("Expected a LinearLayoutManager.");
        int i3 = C90755l.f253831a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (((java.lang.Integer) r0.second).intValue() == 0) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94833O(boolean r5) {
        /*
            r4 = this;
            android.util.Pair r0 = r4.mo94825G()
            r1 = 0
            if (r5 == 0) goto L_0x003b
            boolean r5 = r4.f294205m
            if (r5 != 0) goto L_0x003b
            java.lang.Object r5 = r0.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2 = -1
            if (r5 != r2) goto L_0x0020
            java.lang.Object r5 = r0.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == r2) goto L_0x003b
        L_0x0020:
            boolean r5 = r4.m175294ah()
            r2 = 1
            if (r5 == 0) goto L_0x003c
            java.lang.Object r5 = r0.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x003c
            java.lang.Object r5 = r0.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            com.google.android.apps.gsa.staticplugins.nowstream.shared.b r5 = r4.f294196d
            boolean r0 = r5.f294038e
            if (r0 != r2) goto L_0x0043
            goto L_0x0067
        L_0x0043:
            r5.f294038e = r2
            boolean r0 = r5.f294037d
            if (r0 == 0) goto L_0x0067
            java.util.Set r5 = r5.f294034a
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r5)
            int r0 = r5.size()
        L_0x0053:
            if (r1 >= r0) goto L_0x0067
            java.lang.Object r3 = r5.get(r1)
            com.google.android.apps.gsa.sidekick.shared.monet.a.a r3 = (com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a) r3
            if (r2 == 0) goto L_0x0061
            r3.mo86259e()
            goto L_0x0064
        L_0x0061:
            r3.mo86260f()
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105474ab.mo94833O(boolean):void");
    }

    /* renamed from: P */
    public final void mo94834P(Pair pair) {
        if (this.f294204l && !this.f294205m && !this.f294201i && !this.f294183ac && this.f294166A.f256157a.size() != 0) {
            if (((Integer) pair.first).intValue() != -1 || ((Integer) pair.second).intValue() != -1) {
                if (!m175294ah() || ((Integer) pair.first).intValue() != 0 || ((Integer) pair.second).intValue() != 0) {
                    this.f294200h.mo86399c(this.f294213u);
                    this.f294213u = null;
                    this.f294183ac = true;
                    this.f294166A.mo86340b(0, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.f294199g.mo86285i(), this.f294199g.mo86288l(), this.f294180a.getResources().getConfiguration().orientation == 1);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void mo94835Q() {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        RecyclerView recyclerView = this.f294209q;
        C0640fb fbVar = recyclerView.mAdapter;
        C23292h hVar = this.f63793J;
        int i = 0;
        if (fbVar != hVar) {
            recyclerView.swapAdapter(hVar, false);
        }
        this.f294212t = null;
        C105388a aVar = this.f294198f;
        String str = this.f294188ah;
        if (str == null) {
            z = false;
        } else {
            int a = this.f63793J.mo28781a(str);
            if (a != -1) {
                mo94832N(a, this.f294180a.getResources().getDimensionPixelSize(R.dimen.scroll_item_offest) + this.f294211s);
                z = true;
            } else {
                C59104x d = f294165M.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RecyclerViewRenderer");
                ((C59052c) ((C59052c) d).mo56372aa(22345)).mo56389s("Adapter did not find monetId %s", this.f294188ah);
                z = false;
            }
            this.f294188ah = null;
        }
        aVar.mo94583b(z);
        RecyclerView recyclerView2 = this.f294209q;
        C91822a aVar2 = this.f294178Y;
        Objects.requireNonNull(aVar2);
        recyclerView2.post(new C105607f(aVar2));
        int intValue = ((Integer) ((C23249a) this.f294216x.mo94550o()).mo28725a()).intValue();
        int intValue2 = ((Integer) ((C23249a) this.f294216x.mo94549n()).mo28725a()).intValue();
        if (intValue != 0) {
            i = intValue;
        } else if (intValue2 == 0) {
            return;
        }
        mo94832N(i, intValue2);
    }

    /* renamed from: a */
    public final int mo86261a(String str) {
        return this.f294181aa.f255910b.mo28770R(str);
    }

    /* renamed from: b */
    public final int mo86262b(String str) {
        return this.f294181aa.f255910b.mo28771S(str);
    }

    /* renamed from: c */
    public final void mo86263c(C91775k kVar) {
        C91767c cVar = this.f294181aa;
        if (this.f294189ai == null) {
            RecyclerView recyclerView = this.f294209q;
            C0640fb fbVar = recyclerView.mAdapter;
            fbVar.getClass();
            this.f294189ai = new C91775k((C23292h) fbVar, this.f294180a, recyclerView.getWidth());
        }
        cVar.mo86263c(this.f294189ai);
    }

    /* renamed from: e */
    public final int mo86264e() {
        return this.f294181aa.mo86264e();
    }

    /* renamed from: f */
    public final int mo86265f() {
        return this.f294181aa.mo86265f();
    }

    /* renamed from: g */
    public final int mo86266g(int i, List list, int i2) {
        return this.f294181aa.mo86266g(i, list, i2);
    }

    /* renamed from: h */
    public final int mo86267h() {
        return this.f294181aa.mo86267h();
    }

    /* renamed from: i */
    public final int mo86285i() {
        return this.f294209q.getHeight();
    }

    /* renamed from: iZ */
    public final int mo86269iZ() {
        return this.f294181aa.mo86269iZ();
    }

    /* renamed from: im */
    public final void mo28298im() {
        super.mo28298im();
        mo94828J(true, mo94825G());
        mo94833O(false);
        this.f294166A.mo86342d();
        if (this.f294195c) {
            this.f294194b.mo94785c((View) null);
        }
        this.f294174U.mo84005b(this.f294171R);
        this.f294196d.mo94781c(this.f294170O);
        this.f294169N.mo83995b(this.f294179Z);
        this.f294197e.mo86304c(this.f294177X);
        this.f294178Y.mo86299b(this.f294173T);
        mo94827I();
        this.f294217y.mo84001b(this.f294176W);
        SwipeRefreshLayout swipeRefreshLayout = this.f294207o;
        swipeRefreshLayout.f13508a = null;
        swipeRefreshLayout.mo8794l(false, false);
        this.f294200h.f294089b = null;
        this.f294209q.removeOnScrollListener(this.f294191ak);
        this.f294199g.mo86297a((C91820a) null);
        this.f294209q.removeOnLayoutChangeListener(this.f294192al);
    }

    /* renamed from: iw */
    public void mo28299iw() {
        this.f294181aa = this.f294172S.mo86279a(this.f63126Q, this);
        this.f294166A = C91852k.m150475a(this);
        ((C23249a) this.f294216x.mo94547l()).mo28726b(new C105526c(this));
        ((C23249a) this.f294216x.mo94542g()).mo28726b(new C105634g(this));
        ((C23249a) this.f294216x.mo94543h()).mo28726b(new C105640h(this));
        ((C23249a) this.f294216x.mo94552q()).mo28726b(new C105641i(this));
        ((C23249a) this.f294216x.mo94545j()).mo28726b(new C105642j(this));
        ((C23249a) this.f294216x.mo94551p()).mo28726b(new C105643k(this));
        ((C23249a) this.f294216x.mo94548m()).mo28726b(new C105644l(this));
        ((C23249a) this.f294216x.mo94553r()).mo28726b(new C105645m(this));
        this.f63126Q.mo28327o("CYCLE_VE_SESSION", new C105646n(this));
        this.f294179Z = new C105647o(this);
        mo28295iC(mo94593C());
        mo94826H(this.f294182ab);
        mo28800ac();
    }

    /* renamed from: ix */
    public void mo28300ix() {
        super.mo28300ix();
        mo94829K();
        this.f294199g.mo86297a(this);
        this.f294200h.f294089b = this;
        this.f294174U.mo84004a(this.f294171R);
        this.f294196d.mo94779a(this.f294170O);
        this.f294169N.mo83994a(this.f294179Z);
        this.f294178Y.mo86298a(this.f294173T);
        this.f294217y.mo84000a(this.f294176W);
        SwipeRefreshLayout swipeRefreshLayout = this.f294207o;
        C105388a aVar = this.f294198f;
        Objects.requireNonNull(aVar);
        swipeRefreshLayout.f13508a = new C105553d(aVar);
        this.f294197e.mo86302a(this.f294177X);
        if (this.f294195c) {
            this.f294194b.mo94785c(this.f294207o);
        }
        this.f294209q.addOnScrollListener(this.f294191ak);
        this.f294209q.addOnLayoutChangeListener(this.f294192al);
    }

    /* renamed from: j */
    public final List mo86270j() {
        return C58485gu.m89842j(this.f294181aa.f255911c);
    }

    /* renamed from: jd */
    public final void mo28789jd(int i, String str) {
        this.f294181aa.mo86274n(i, str);
        if (i == 0 && this.f294212t != null) {
            mo94831M();
        }
    }

    /* renamed from: jg */
    public final int mo86286jg() {
        return m175293ag().height();
    }

    /* renamed from: jh */
    public final void mo28790jh(C22939d dVar, String str) {
        if (dVar instanceof C91770f) {
            C91770f fVar = (C91770f) dVar;
            this.f294181aa.mo86272l(fVar);
            fVar.mo86278r(this);
        } else if (dVar instanceof C90250a) {
            this.f294214v = (C90250a) dVar;
        }
        this.f294166A.mo86339a(str, dVar);
    }

    /* renamed from: ji */
    public final void mo28791ji(C22939d dVar, String str) {
        if (dVar instanceof C91770f) {
            C91770f fVar = (C91770f) dVar;
            this.f294181aa.mo86273m(fVar);
            fVar.mo86278r((C91771g) null);
        }
        this.f294166A.mo86343e(str);
    }

    /* renamed from: jj */
    public final void mo28792jj(int i, String str, C23296l lVar) {
        if (lVar instanceof C91765a) {
            ((C91770f) lVar).mo86278r(this);
            this.f294181aa.mo86277q(i, (C91765a) lVar);
        } else {
            C59104x d = f294165M.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RecyclerViewRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(22339)).mo56389s("RecyclableContainer children must implement MetricDataManagingRecyclableContainer but class %s does not.", lVar.getClass());
            int i2 = C90755l.f253831a;
        }
        this.f294166A.mo86339a(str, lVar);
    }

    /* renamed from: jk */
    public final void mo86393jk(long j, C58485gu guVar) {
        this.f294198f.mo94586g(j, guVar);
    }

    /* renamed from: jl */
    public final void mo86287jl(String str) {
        this.f294188ah = str;
    }

    /* renamed from: jm */
    public final void mo28793jm(int i, int i2) {
        this.f294181aa.mo86275o(i, i2);
    }

    /* renamed from: jn */
    public final void mo28794jn(int i) {
        this.f294181aa.mo86276p(i);
    }

    /* renamed from: jo */
    public final void mo28795jo(int i, int i2) {
        this.f294181aa.mo86275o(i, i2);
    }

    /* renamed from: k */
    public final void mo86271k(String str, int i, int i2) {
        this.f294181aa.mo86271k(str, i, i2);
    }

    /* renamed from: l */
    public final int mo86288l() {
        return this.f294209q.getWidth();
    }

    /* renamed from: m */
    public final int mo86289m() {
        return -m175293ag().top;
    }

    /* renamed from: o */
    public final C0653fo mo86290o() {
        C0653fo foVar = this.f294209q.mLayout;
        foVar.getClass();
        return foVar;
    }

    /* renamed from: p */
    public final String mo86291p() {
        return this.f63126Q.mo28342l();
    }

    /* renamed from: q */
    public final void mo86292q(int[] iArr) {
        this.f294209q.getLocationOnScreen(iArr);
    }

    /* renamed from: r */
    public final void mo86278r(C91771g gVar) {
        this.f294181aa.f255909a = gVar;
    }

    /* renamed from: s */
    public final void mo28796s(int i, String str, C23296l lVar) {
        if (lVar instanceof C91765a) {
            ((C91770f) lVar).mo86278r((C91771g) null);
        }
        this.f294181aa.mo86276p(i);
        this.f294166A.mo86343e(str);
    }

    /* renamed from: u */
    public final void mo86294u() {
        this.f294209q.stopScroll();
    }

    /* renamed from: v */
    public final boolean mo86295v() {
        return true;
    }

    /* renamed from: w */
    public final boolean mo86296w() {
        return this.f294209q.getChildAdapterPosition(this.f294209q.findChildViewUnder((float) (this.f294180a.getResources().getDisplayMetrics().widthPixels / 2), 0.0f)) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Context mo28804x() {
        return this.f294180a;
    }

    /* renamed from: y */
    public final void mo86394y(C8178yk ykVar, int i, long j) {
        this.f294198f.mo94585d(C23245b.m43556a(ykVar), i, j);
    }

    /* renamed from: z */
    public final void mo86395z(Rect rect, long j) {
        this.f294198f.mo94587je(rect, j);
    }

    /* renamed from: t */
    public final void mo86293t() {
        C91820a aVar = this.f294199g.f256086a;
        aVar.getClass();
        aVar.mo86294u();
        mo94832N(0, 0);
        this.f294198f.mo94584c(0, 0, true);
    }
}
