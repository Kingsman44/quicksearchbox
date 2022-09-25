package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.app.Activity;
import android.content.Intent;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108207ae;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108264ch;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108273cq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108308dy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113768ak;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an */
/* compiled from: PG */
public final class C114109an extends C0640fb implements C108264ch {

    /* renamed from: f */
    private static final C59071e f316251f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an");

    /* renamed from: a */
    public final C108308dy f316252a = new C108308dy();

    /* renamed from: b */
    public C108303dt f316253b;

    /* renamed from: c */
    public C108321ej f316254c;

    /* renamed from: d */
    public C108324em f316255d;

    /* renamed from: e */
    public C109037fg f316256e;

    /* renamed from: g */
    private final C21370a f316257g;

    /* renamed from: h */
    private final C108230ba f316258h;

    /* renamed from: i */
    private boolean f316259i;

    /* renamed from: j */
    private final C91097g f316260j;

    /* renamed from: k */
    private final Activity f316261k;

    /* renamed from: l */
    private final C86124t f316262l;

    /* renamed from: m */
    private final C113954b f316263m;

    /* renamed from: n */
    private final C58881cr f316264n;

    /* renamed from: o */
    private final C58881cr f316265o;

    /* renamed from: p */
    private final C58833ax f316266p;

    /* renamed from: q */
    private final C73906a f316267q;

    /* renamed from: r */
    private final boolean f316268r;

    /* renamed from: s */
    private final C28421h f316269s;

    /* renamed from: t */
    private final C104149a f316270t;

    public C114109an(C91097g gVar, C108230ba baVar, C58881cr crVar, C58881cr crVar2, C21370a aVar, Activity activity, C86124t tVar, C104149a aVar2, C113954b bVar, C58833ax axVar, C73906a aVar3, boolean z, C28421h hVar) {
        this.f316257g = aVar;
        this.f316260j = gVar;
        this.f316258h = baVar;
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.f316259i = C87566i.m142258aF(intent.getExtras());
        }
        setHasStableIds(true);
        this.f316261k = activity;
        this.f316262l = tVar;
        this.f316270t = aVar2;
        this.f316263m = bVar;
        this.f316264n = crVar;
        this.f316265o = crVar2;
        this.f316266p = axVar;
        this.f316267q = aVar3;
        this.f316268r = z;
        this.f316269s = hVar;
    }

    /* renamed from: d */
    private final int m189277d() {
        C108303dt dtVar = this.f316253b;
        if (dtVar == null) {
            return 0;
        }
        return dtVar.mo96741b();
    }

    /* renamed from: e */
    private final void m189278e(ImageView imageView, SelectedAccountDisc selectedAccountDisc) {
        if (this.f316262l.mo79746e(C90014bt.f247560jU)) {
            C114034q.m188818n(imageView, selectedAccountDisc, this.f316261k, this.f316266p, new C114107al(this), this.f316263m, this.f316260j, this.f316262l, this.f316269s);
            return;
        }
        ImageView imageView2 = imageView;
        C114034q.m188813i(this.f316261k, imageView2, (PopupMenu.OnMenuItemClickListener) this.f316264n.mo6453a(), (C113768ak) this.f316265o.mo6453a(), this.f316266p, this.f316267q, this.f316260j);
    }

    /* renamed from: f */
    private static boolean m189279f(int i) {
        return i == -1;
    }

    /* renamed from: g */
    private final boolean m189280g(int i) {
        return i == mo101151a();
    }

    /* renamed from: a */
    public final int mo101151a() {
        return this.f316252a.mo95351a() + m189277d();
    }

    /* renamed from: b */
    public final C108232bc mo101152b(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        C108303dt dtVar = this.f316253b;
        if (dtVar == null || i >= dtVar.mo96741b()) {
            return this.f316252a.mo95352b(i - m189277d());
        }
        C108303dt dtVar2 = this.f316253b;
        dtVar2.getClass();
        C108232bc e = dtVar2.mo96743e((dtVar2.mo96741b() - i) - 1);
        if (e == null) {
            return new C108273cq((C91097g) null);
        }
        return e;
    }

    /* renamed from: c */
    public final void mo101153c(C108232bc bcVar) {
        int a = mo101151a();
        List list = this.f316252a.f301304a;
        C28292j jVar = new C28292j(bcVar.mo95829g());
        if (bcVar.mo96597d()) {
            jVar.f76976d = true;
        }
        jVar.mo33794h(1);
        bcVar.mo96608r(jVar);
        bcVar.f301035q = this.f316257g.mo26870b();
        list.add(bcVar);
        bcVar.f301041w = this.f316262l;
        bcVar.f301042x = this.f316270t.mo93970a();
        notifyItemInserted(a + 1);
    }

    public final int getItemCount() {
        return this.f316252a.mo95351a() + m189277d() + 2;
    }

    public final long getItemId(int i) {
        int i2 = i - 1;
        if (m189279f(i2)) {
            return -3;
        }
        if (m189280g(i2)) {
            return -2;
        }
        C108232bc b = mo101152b(i2);
        b.getClass();
        return b.f301027i;
    }

    public final int getItemViewType(int i) {
        int i2 = i - 1;
        if (m189279f(i2)) {
            return -3;
        }
        if (m189280g(i2)) {
            return -2;
        }
        C108232bc b = mo101152b(i2);
        b.getClass();
        return b.mo95830h();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        ImageView imageView;
        C108241bl blVar = (C108241bl) ghVar;
        int i2 = i - 1;
        C108232bc b = mo101152b(i2);
        if (b != null) {
            blVar.f301070T = this.f316254c;
            blVar.f301071U = this.f316255d;
            b.f301040v = blVar.mo96686b();
            b.mo95832j(blVar, this.f316258h.mo95422k());
            blVar.mo96688d(b);
            C28295m.m52919e(blVar.itemView, b.f301030l);
            if (b instanceof C108212aj) {
                C108212aj ajVar = (C108212aj) b;
                if (ajVar.f300977c == 1 && b.mo96602l() == 1 && ajVar.mo96603m() != null) {
                    C108241bl m = ajVar.mo96603m();
                    m.getClass();
                    m.f301081h.f253398a = new C108207ae();
                }
            }
            if (b instanceof C108451je) {
                imageView = (ImageView) blVar.itemView.findViewById(R.id.chatui_user_bubble_profile_icon);
            } else {
                imageView = b instanceof C108262cf ? (ImageView) blVar.itemView.findViewById(R.id.chatui_google_bubble_profile_icon) : null;
            }
            if (imageView != null) {
                if (this.f316266p.mo56113h()) {
                    boolean isDeviceLocked = ((C106171l) this.f316266p.mo56107c()).f296304b.f230023b.isDeviceLocked();
                    C58976aa aaVar = C58975e.f156826a;
                    if (isDeviceLocked) {
                        return;
                    }
                }
                C114034q.m188819o(imageView, this.f316263m);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f316251f.mo56224b()).mo56372aa(28705)).mo56387q("onBindViewHolder: OUT OF CHAT ELEMENT BOUNDS, index = %d", i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return new com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.support.p033v7.widget.C0673gh onCreateViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            android.app.Activity r0 = r4.f316261k
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624541(0x7f0e025d, float:1.8876265E38)
            r2 = 0
            android.view.View r1 = r0.inflate(r1, r5, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 2131435706(0x7f0b20ba, float:1.8493262E38)
            switch(r6) {
                case -3: goto L_0x013c;
                case -2: goto L_0x012e;
                case -1: goto L_0x0016;
                case 0: goto L_0x0105;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00cf;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00a2;
                case 10: goto L_0x0096;
                case 11: goto L_0x008a;
                case 12: goto L_0x0128;
                case 13: goto L_0x007e;
                case 14: goto L_0x0016;
                case 15: goto L_0x0072;
                case 16: goto L_0x0066;
                case 17: goto L_0x0016;
                case 18: goto L_0x005a;
                case 19: goto L_0x00cf;
                case 20: goto L_0x004e;
                case 21: goto L_0x0016;
                case 22: goto L_0x0042;
                case 23: goto L_0x0016;
                case 24: goto L_0x0016;
                case 25: goto L_0x0016;
                case 26: goto L_0x0016;
                case 27: goto L_0x0016;
                case 28: goto L_0x0036;
                case 29: goto L_0x002a;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown ChatUiElement ViewType: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x002a:
            r5 = 2131626829(0x7f0e0b4d, float:1.8880905E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x0036:
            r5 = 2131626828(0x7f0e0b4c, float:1.8880903E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x0042:
            r5 = 2131624565(0x7f0e0275, float:1.8876313E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x004e:
            r5 = 2131626409(0x7f0e09a9, float:1.8880053E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x005a:
            r5 = 2131627262(0x7f0e0cfe, float:1.8881783E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x0066:
            r6 = 2131625953(0x7f0e07e1, float:1.8879129E38)
            android.view.View r5 = r0.inflate(r6, r5, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x0072:
            r6 = 2131625952(0x7f0e07e0, float:1.8879126E38)
            android.view.View r5 = r0.inflate(r6, r5, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x007e:
            r6 = 2131625509(0x7f0e0625, float:1.8878228E38)
            android.view.View r5 = r0.inflate(r6, r5, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x008a:
            r5 = 2131624535(0x7f0e0257, float:1.8876252E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x0096:
            r5 = 2131624415(0x7f0e01df, float:1.887601E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00a2:
            r5 = 2131624552(0x7f0e0268, float:1.8876287E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00ae:
            r5 = 2131624549(0x7f0e0265, float:1.887628E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00b9:
            r5 = 2131624558(0x7f0e026e, float:1.88763E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00c4:
            r5 = 2131627170(0x7f0e0ca2, float:1.8881597E38)
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00cf:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r4.f316258h
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r5 = r5.mo95422k()
            int r5 = r5.mo96659b()
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            goto L_0x0128
        L_0x00e1:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r4.f316258h
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r5 = r5.mo95422k()
            int r5 = r5.mo96674q()
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            r5 = 2131429644(0x7f0b090c, float:1.8480967E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r6 = r1.findViewById(r3)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r6 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r6
            r4.m189278e(r5, r6)
            goto L_0x0128
        L_0x0105:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r4.f316258h
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r5 = r5.mo95422k()
            int r5 = r5.mo96645R()
            android.view.View r5 = r0.inflate(r5, r1, r2)
            r1.addView(r5)
            r5 = 2131429666(0x7f0b0922, float:1.8481011E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r6 = r1.findViewById(r3)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r6 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r6
            r4.m189278e(r5, r6)
        L_0x0128:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r5 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r5.<init>(r1)
            goto L_0x0159
        L_0x012e:
            r6 = 2131625508(0x7f0e0624, float:1.8878226E38)
            android.view.View r5 = r0.inflate(r6, r5, r2)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r6 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r6.<init>(r5)
        L_0x013a:
            r5 = r6
            goto L_0x0159
        L_0x013c:
            boolean r6 = r4.f316268r
            if (r6 == 0) goto L_0x0144
            r6 = 2131625708(0x7f0e06ec, float:1.8878632E38)
            goto L_0x014f
        L_0x0144:
            boolean r6 = r4.f316259i
            if (r6 == 0) goto L_0x014c
            r6 = 2131624771(0x7f0e0343, float:1.8876731E38)
            goto L_0x014f
        L_0x014c:
            r6 = 2131625707(0x7f0e06eb, float:1.887863E38)
        L_0x014f:
            android.view.View r5 = r0.inflate(r6, r5, r2)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r6 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r6.<init>(r5)
            goto L_0x013a
        L_0x0159:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114109an.onCreateViewHolder(android.view.ViewGroup, int):android.support.v7.widget.gh");
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C108241bl) ghVar).mo96687c();
    }
}
