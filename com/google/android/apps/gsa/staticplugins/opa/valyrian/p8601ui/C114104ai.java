package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.app.Activity;
import android.content.Intent;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108192a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108235bf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108273cq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108327ep;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108328eq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113768ak;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114050dp;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ai */
/* compiled from: PG */
public final class C114104ai extends C0640fb implements C108235bf, C114095a {

    /* renamed from: e */
    private static final C59071e f316198e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ai");

    /* renamed from: A */
    private final boolean f316199A;

    /* renamed from: B */
    private final C28421h f316200B;

    /* renamed from: C */
    private final LayoutInflater f316201C;

    /* renamed from: D */
    private final C104149a f316202D;

    /* renamed from: a */
    public final C108226ax f316203a;

    /* renamed from: b */
    C108412ht f316204b;

    /* renamed from: c */
    public final List f316205c = new ArrayList();

    /* renamed from: d */
    public C109037fg f316206d;

    /* renamed from: f */
    private C108237bh f316207f;

    /* renamed from: g */
    private final C108423id f316208g;

    /* renamed from: h */
    private final ArrayList f316209h;

    /* renamed from: i */
    private final C91097g f316210i;

    /* renamed from: j */
    private final Activity f316211j;

    /* renamed from: k */
    private final C21370a f316212k;

    /* renamed from: l */
    private final C108327ep f316213l;

    /* renamed from: m */
    private boolean f316214m;

    /* renamed from: n */
    private final C114106ak f316215n;

    /* renamed from: o */
    private C108321ej f316216o;

    /* renamed from: p */
    private C108324em f316217p;

    /* renamed from: q */
    private View f316218q;

    /* renamed from: r */
    private int f316219r;

    /* renamed from: s */
    private final List f316220s = new ArrayList();

    /* renamed from: t */
    private final C86124t f316221t;

    /* renamed from: u */
    private final C22871g f316222u;

    /* renamed from: v */
    private final C113954b f316223v;

    /* renamed from: w */
    private final C58881cr f316224w;

    /* renamed from: x */
    private final C58881cr f316225x;

    /* renamed from: y */
    private final C58833ax f316226y;

    /* renamed from: z */
    private final C73906a f316227z;

    public C114104ai(C91097g gVar, C108226ax axVar, C108237bh bhVar, C108423id idVar, C58881cr crVar, C58881cr crVar2, C21370a aVar, C108328eq eqVar, Activity activity, C86124t tVar, C104149a aVar2, C81517a aVar3, C22871g gVar2, C114106ak akVar, C113954b bVar, C58833ax axVar2, C73906a aVar4, C28421h hVar) {
        Activity activity2 = activity;
        C86124t tVar2 = tVar;
        C104149a aVar5 = aVar2;
        axVar.getClass();
        this.f316203a = axVar;
        this.f316207f = bhVar;
        this.f316208g = idVar;
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.f316214m = C87566i.m142258aF(intent.getExtras());
        }
        this.f316212k = aVar;
        this.f316209h = new ArrayList();
        boolean z = true;
        setHasStableIds(true);
        this.f316213l = eqVar.mo96788a();
        this.f316210i = gVar;
        this.f316211j = activity2;
        this.f316215n = akVar;
        this.f316221t = tVar2;
        this.f316202D = aVar5;
        this.f316222u = gVar2;
        this.f316223v = bVar;
        this.f316224w = crVar;
        this.f316225x = crVar2;
        this.f316226y = axVar2;
        this.f316227z = aVar4;
        this.f316200B = hVar;
        if (aVar3.mo75125b() != 2 && !tVar2.mo79746e(C90029ch.f248283bq)) {
            z = false;
        }
        this.f316199A = z;
        this.f316201C = LayoutInflater.from(C108435ip.m180256a(aVar5, activity2));
    }

    /* renamed from: H */
    private final void m189233H(ImageView imageView, SelectedAccountDisc selectedAccountDisc) {
        if (this.f316221t.mo79746e(C90014bt.f247560jU)) {
            C114034q.m188818n(imageView, selectedAccountDisc, this.f316211j, this.f316226y, new C114103ah(this), this.f316223v, this.f316210i, this.f316221t, this.f316200B);
            return;
        }
        ImageView imageView2 = imageView;
        C114034q.m188813i(this.f316211j, imageView2, (PopupMenu.OnMenuItemClickListener) this.f316224w.mo6453a(), (C113768ak) this.f316225x.mo6453a(), this.f316226y, this.f316227z, this.f316210i);
    }

    /* renamed from: I */
    private final void m189234I(String str) {
        int i = this.f316219r + 1;
        this.f316219r = i;
        List list = this.f316220s;
        int size = this.f316209h.size();
        list.add("modifySeq=" + i + " ElementCount=" + size + " " + str + "\n");
        C58557jl.m90131l(this.f316220s);
        while (this.f316220s.size() > 10) {
            this.f316220s.remove(0);
        }
    }

    /* renamed from: J */
    private final void m189235J(C108232bc bcVar) {
        this.f316222u.mo28207g("Notify listeners with item added.", new C114100ae(this, bcVar));
    }

    /* renamed from: K */
    private static boolean m189236K(int i) {
        return i == -1;
    }

    /* renamed from: L */
    private final boolean m189237L(int i) {
        return i == this.f316209h.size();
    }

    /* renamed from: M */
    private final boolean m189238M() {
        return this.f316207f.mo96656ab() && this.f316221t.mo79746e(C90014bt.f247617kY);
    }

    /* renamed from: N */
    private final void m189239N(C108232bc bcVar) {
        C28292j jVar = new C28292j(bcVar.mo95829g());
        if (bcVar.mo96597d()) {
            jVar.f76976d = true;
        }
        jVar.mo33794h(1);
        bcVar.mo96608r(jVar);
        bcVar.f301035q = this.f316212k.mo26870b();
        bcVar.f301041w = this.f316221t;
        bcVar.f301042x = this.f316202D.mo93970a();
        this.f316213l.mo96786b(bcVar);
    }

    /* renamed from: O */
    private final void m189240O() {
        this.f316222u.mo28207g("Notify listeners with item removed.", new C114098ac(this));
    }

    /* renamed from: A */
    public final void mo101115A(C108237bh bhVar) {
        this.f316207f = bhVar;
    }

    /* renamed from: B */
    public final void mo101116B(C108321ej ejVar) {
        this.f316216o = ejVar;
    }

    /* renamed from: C */
    public final void mo101117C(C108324em emVar) {
        this.f316217p = emVar;
    }

    /* renamed from: D */
    public final void mo101118D(C114050dp dpVar) {
        this.f316205c.add(dpVar);
    }

    /* renamed from: E */
    public final void mo101119E() {
    }

    /* renamed from: F */
    public final void mo101120F(C108232bc bcVar) {
        C108232bc b;
        int size = this.f316209h.size();
        do {
            size--;
            if (size >= 0) {
                b = mo95352b(size);
                b.getClass();
            } else {
                return;
            }
        } while (!b.equals(bcVar));
        m189234I(String.format("remove i=%s element=%s", new Object[]{Integer.valueOf(size), bcVar}));
        this.f316209h.remove(size);
        notifyItemRemoved(size + 1);
        m189240O();
    }

    /* renamed from: G */
    public final void mo101121G(C109037fg fgVar) {
        this.f316206d = fgVar;
    }

    /* renamed from: a */
    public final int mo95351a() {
        return this.f316209h.size();
    }

    /* renamed from: b */
    public final C108232bc mo95352b(int i) {
        if (i < 0 || i >= this.f316209h.size() + 2 || i >= this.f316209h.size()) {
            return null;
        }
        return (C108232bc) this.f316209h.get(i);
    }

    /* renamed from: c */
    public final C108232bc mo95353c() {
        if (!this.f316209h.isEmpty()) {
            return mo95352b(this.f316209h.size() - 1);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo95354d(int i) {
        notifyItemChanged(i + 1);
    }

    /* renamed from: e */
    public final int mo101122e(C58839bc bcVar) {
        for (int size = this.f316209h.size() - 1; size >= 0; size--) {
            C108232bc b = mo95352b(size);
            b.getClass();
            if (bcVar.mo5941a(b)) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public final int mo101123f() {
        View view = this.f316218q;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo101124g() {
        return 0;
    }

    public final int getItemCount() {
        return this.f316209h.size() + 2;
    }

    public final long getItemId(int i) {
        if (this.f316209h.size() != 0) {
            int i2 = i - 1;
            if (m189237L(i2)) {
                return -2;
            }
            if (m189236K(i2)) {
                return -3;
            }
            C108232bc b = mo95352b(i2);
            b.getClass();
            return b.f301027i;
        } else if (i == 0) {
            return -3;
        } else {
            if (i > 1) {
                C59052c cVar = (C59052c) f316198e.mo56226d();
                cVar.mo56380ai(C58979ad.MEDIUM);
                ((C59052c) cVar.mo56372aa(28672)).mo56387q("#getItemId: position %d no element", i);
            }
            return -2;
        }
    }

    public final int getItemViewType(int i) {
        int i2 = i - 1;
        if (m189237L(i2)) {
            return -2;
        }
        if (m189236K(i2)) {
            return -3;
        }
        C108232bc b = mo95352b(i2);
        b.getClass();
        return b.mo95830h();
    }

    /* renamed from: h */
    public final int mo101125h() {
        return this.f316209h.size() + 1;
    }

    /* renamed from: i */
    public final C0640fb mo101126i() {
        return this;
    }

    /* renamed from: j */
    public final C108232bc mo101127j(C58839bc bcVar) {
        C108232bc b;
        int size = this.f316209h.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            b = mo95352b(size);
            b.getClass();
        } while (!bcVar.mo5941a(b));
        return b;
    }

    /* renamed from: k */
    public final C108232bc mo101128k() {
        C108232bc b;
        int e = mo101122e(C108230ba.f301013a);
        if (e < 0) {
            return null;
        }
        do {
            e--;
            if (e < 0) {
                return null;
            }
            b = mo95352b(e);
            b.getClass();
        } while (b instanceof C108192a);
        return b;
    }

    /* renamed from: l */
    public final C108412ht mo101129l(List list, boolean z, boolean z2) {
        RecyclerView recyclerView;
        C108412ht htVar;
        if (list.isEmpty()) {
            return null;
        }
        C108412ht htVar2 = this.f316204b;
        if (htVar2 == null || htVar2.f301530b.f301557d != z2) {
            this.f316204b = new C108412ht(this.f316208g, z2);
            C28292j jVar = new C28292j(this.f316204b.mo95829g());
            this.f316204b.getClass();
            RecyclerView recyclerView2 = this.f316208g.f301565l;
            if (recyclerView2 != null) {
                C28295m.m52919e(recyclerView2, jVar);
            }
            jVar.f76976d = true;
            jVar.mo33794h(1);
            C108412ht htVar3 = this.f316204b;
            htVar3.getClass();
            htVar3.mo96608r(jVar);
            C108412ht htVar4 = this.f316204b;
            htVar4.getClass();
            htVar4.f301035q = this.f316212k.mo26870b();
            C108412ht htVar5 = this.f316204b;
            htVar5.getClass();
            htVar5.mo96850b(list);
            C108412ht htVar6 = this.f316204b;
            htVar6.getClass();
            if (!htVar6.f301530b.f301557d) {
                this.f316213l.mo96786b(htVar6);
            }
            C108232bc c = mo95353c();
            if (!(c == null || (htVar = this.f316204b) == null || c.mo96576jz(htVar.f301029k) != 2)) {
                mo101142y();
            }
        } else {
            htVar2.mo96850b(list);
        }
        if (z) {
            this.f316208g.mo96868n();
        }
        C108423id idVar = this.f316208g;
        if (!idVar.f301557d && (recyclerView = idVar.f301565l) != null) {
            long a = this.f316221t.mo79743a(C90085ej.f250230h);
            if (a > 0) {
                recyclerView.animate().alpha(1.0f).setDuration(a).start();
            } else {
                recyclerView.setAlpha(1.0f);
            }
        }
        return this.f316204b;
    }

    /* renamed from: m */
    public final C108412ht mo101130m() {
        return this.f316204b;
    }

    /* renamed from: n */
    public final C108423id mo101131n() {
        return this.f316208g;
    }

    /* renamed from: o */
    public final C60321oe mo101132o(C58833ax axVar) {
        C60321oe a = this.f316213l.mo96785a(axVar);
        this.f316213l.mo96787c();
        return a;
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C58979ad adVar;
        ImageView imageView;
        ViewGroup.LayoutParams layoutParams;
        int i2 = i;
        C108241bl blVar = (C108241bl) ghVar;
        if (blVar.mItemViewType == -3) {
            View findViewById = blVar.itemView.findViewById(R.id.initial_position_placeholder);
            if (findViewById != null && this.f316199A && (layoutParams = findViewById.getLayoutParams()) != null) {
                layoutParams.height = (int) C91115n.m148870b(this.f316211j.getResources().getConfiguration().orientation == 2 ? 0.0f : 6.0f, this.f316211j);
            } else {
                return;
            }
        }
        int i3 = blVar.mItemViewType;
        if (i3 == -3 || i3 == -2) {
            C59052c cVar = (C59052c) f316198e.mo56224b();
            if (i3 != -2 || !this.f316209h.isEmpty()) {
                adVar = C58979ad.NONE;
            } else {
                adVar = C58979ad.MEDIUM;
            }
            cVar.mo56380ai(adVar);
            ((C59052c) cVar.mo56372aa(28689)).mo56359L("#onBindViewHolder: position %d viewHolder %s skip for PLACEHOLDER, ElementCount %s", Integer.valueOf(i), C108241bl.m179898a(blVar.mItemViewType), Integer.valueOf(this.f316209h.size()));
            return;
        }
        int i4 = i2 - 1;
        C108232bc b = mo95352b(i4);
        if (b != null) {
            if (b.mo95830h() != blVar.mItemViewType) {
                C59071e eVar = f316198e;
                C59052c cVar2 = (C59052c) eVar.mo56226d();
                cVar2.mo56380ai(C58979ad.MEDIUM);
                ((C59052c) cVar2.mo56372aa(28692)).mo56361N("onBindViewHolder: May cause inconsistent render, ChatUiItem: [type= %s stableId= %d veId=%d] ViewHolder: [type=%s, itemId=%d]", C108241bl.m179898a(b.mo95830h()), Long.valueOf(b.f301027i), Integer.valueOf(b.mo95829g()), C108241bl.m179898a(blVar.mItemViewType), Long.valueOf(blVar.mItemId));
                if (this.f316209h.isEmpty()) {
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(28686)).mo56386p("logUiItems isEmpty");
                }
                ArrayList arrayList = this.f316209h;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C108232bc bcVar = (C108232bc) arrayList.get(i5);
                    this.f316209h.size();
                }
                if (this.f316221t.mo79746e(C90063do.f249359bz)) {
                    return;
                }
            } else {
                ((C59052c) ((C59052c) f316198e.mo56224b()).mo56372aa(28691)).mo56360M("#onBindViewHolder: position %d viewHolder %s ChatUiElement %s, ElementCount %s", Integer.valueOf(i), blVar, C108241bl.m179898a(b.mo95830h()), Integer.valueOf(this.f316209h.size()));
            }
            blVar.f301070T = this.f316216o;
            blVar.f301071U = this.f316217p;
            if (this.f316199A && (b instanceof C108262cf) && b.mo95830h() == 1) {
                ((C108262cf) b).f301169J = true;
                blVar.f301072V = new C114099ad(this, b, blVar, i2);
            }
            b.f301040v = blVar.mo96686b();
            b.mo95832j(blVar, this.f316207f);
            blVar.mo96688d(b);
            C28295m.m52919e(blVar.itemView, b.f301030l);
            if (b instanceof C108451je) {
                imageView = (ImageView) blVar.itemView.findViewById(R.id.chatui_user_bubble_profile_icon);
            } else if (b instanceof C108262cf) {
                imageView = (ImageView) blVar.itemView.findViewById(R.id.chatui_google_bubble_profile_icon);
            } else {
                if ((b instanceof C108273cq) && m189238M()) {
                    C108273cq.m179977b(blVar);
                }
                imageView = null;
            }
            if (imageView != null) {
                if (this.f316226y.mo56113h()) {
                    boolean isDeviceLocked = ((C106171l) this.f316226y.mo56107c()).f296304b.f230023b.isDeviceLocked();
                    C58976aa aaVar = C58975e.f156826a;
                    if (isDeviceLocked) {
                        return;
                    }
                }
                C114034q.m188819o(imageView, this.f316223v);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f316198e.mo56224b()).mo56372aa(28690)).mo56393w("onBindViewHolder: OUT OF CHAT ELEMENT BOUNDS, index = %d, count = %d", i4, this.f316209h.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return new com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.support.p033v7.widget.C0673gh onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            com.google.common.f.e r0 = f316198e
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 28675(0x7003, float:4.0182E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            boolean r2 = com.google.android.apps.gsa.shared.util.p7159c.C90934cd.m148548a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl.m179898a(r8)
            java.util.ArrayList r4 = r6.f316209h
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "#onCreateViewHolder: current thread is ui thread: %b and type: %s ElementCount %d"
            r1.mo56359L(r5, r2, r3, r4)
            android.view.LayoutInflater r1 = r6.f316201C
            r2 = 2131624541(0x7f0e025d, float:1.8876265E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r7, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 2131429644(0x7f0b090c, float:1.8480967E38)
            r4 = 2131429666(0x7f0b0922, float:1.8481011E38)
            r5 = 2131435706(0x7f0b20ba, float:1.8493262E38)
            switch(r8) {
                case -3: goto L_0x024b;
                case -2: goto L_0x0233;
                case -1: goto L_0x0043;
                case 0: goto L_0x0214;
                case 1: goto L_0x01f5;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x0043;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01c8;
                case 7: goto L_0x01ba;
                case 8: goto L_0x0198;
                case 9: goto L_0x018a;
                case 10: goto L_0x017c;
                case 11: goto L_0x016e;
                case 12: goto L_0x0160;
                case 13: goto L_0x0043;
                case 14: goto L_0x0043;
                case 15: goto L_0x0043;
                case 16: goto L_0x0043;
                case 17: goto L_0x0152;
                case 18: goto L_0x026e;
                case 19: goto L_0x01e4;
                case 20: goto L_0x0144;
                case 21: goto L_0x0136;
                case 22: goto L_0x026e;
                case 23: goto L_0x0125;
                case 24: goto L_0x0117;
                case 25: goto L_0x00f7;
                case 26: goto L_0x00d7;
                case 27: goto L_0x00c6;
                case 28: goto L_0x00b8;
                case 29: goto L_0x00aa;
                case 30: goto L_0x0099;
                case 31: goto L_0x008b;
                case 32: goto L_0x006c;
                case 33: goto L_0x0043;
                case 34: goto L_0x005e;
                case 35: goto L_0x0050;
                default: goto L_0x0043;
            }
        L_0x0043:
            com.google.common.f.x r7 = r0.mo56225c()
            java.lang.String r0 = "Unknown ChatUiElement ViewType: %d"
            r2 = 28676(0x7004, float:4.0184E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56387q(r0, r8)
            goto L_0x026e
        L_0x0050:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624065(0x7f0e0081, float:1.88753E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x005e:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624543(0x7f0e025f, float:1.8876269E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x006c:
            com.google.android.apps.gsa.search.core.i.t r7 = r6.f316221t
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247793np
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x026e
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r7 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            android.view.LayoutInflater r8 = r6.f316201C
            r0 = 2131624557(0x7f0e026d, float:1.8876297E38)
            android.view.View r8 = r8.inflate(r0, r1, r3)
            r6.f316218q = r8
            r8.getClass()
            r7.<init>(r8)
            goto L_0x0273
        L_0x008b:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131627262(0x7f0e0cfe, float:1.8881783E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0099:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96629B()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x00aa:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131626829(0x7f0e0b4d, float:1.8880905E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x00b8:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131626828(0x7f0e0b4c, float:1.8880903E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x00c6:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96628A()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x00d7:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96668k()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            android.view.View r7 = r1.findViewById(r2)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r1.findViewById(r5)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r8 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r8
            r6.m189233H(r7, r8)
            goto L_0x026e
        L_0x00f7:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96669l()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            android.view.View r7 = r1.findViewById(r4)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r1.findViewById(r5)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r8 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r8
            r6.m189233H(r7, r8)
            goto L_0x026e
        L_0x0117:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624780(0x7f0e034c, float:1.887675E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0125:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96670m()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0136:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624564(0x7f0e0274, float:1.8876311E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0144:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131626409(0x7f0e09a9, float:1.8880053E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0152:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131625847(0x7f0e0777, float:1.8878914E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0160:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131625942(0x7f0e07d6, float:1.8879106E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x016e:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624535(0x7f0e0257, float:1.8876252E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x017c:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624418(0x7f0e01e2, float:1.8876015E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x018a:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624552(0x7f0e0268, float:1.8876287E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x0198:
            boolean r7 = r6.m189238M()
            if (r7 == 0) goto L_0x01ac
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624539(0x7f0e025b, float:1.887626E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01ac:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624549(0x7f0e0265, float:1.887628E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01ba:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624558(0x7f0e026e, float:1.88763E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01c8:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131627170(0x7f0e0ca2, float:1.8881597E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01d6:
            android.view.LayoutInflater r7 = r6.f316201C
            r8 = 2131624548(0x7f0e0264, float:1.8876279E38)
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01e4:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96659b()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            goto L_0x026e
        L_0x01f5:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96674q()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            android.view.View r7 = r1.findViewById(r2)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r1.findViewById(r5)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r8 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r8
            r6.m189233H(r7, r8)
            goto L_0x026e
        L_0x0214:
            android.view.LayoutInflater r7 = r6.f316201C
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            int r8 = r8.mo96645R()
            android.view.View r7 = r7.inflate(r8, r1, r3)
            r1.addView(r7)
            android.view.View r7 = r1.findViewById(r4)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r1.findViewById(r5)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r8 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r8
            r6.m189233H(r7, r8)
            goto L_0x026e
        L_0x0233:
            android.view.LayoutInflater r8 = r6.f316201C
            r0 = 2131624710(0x7f0e0306, float:1.8876607E38)
            android.view.View r7 = r8.inflate(r0, r7, r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ag r8 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ag
            r8.<init>(r6)
            r7.setOnClickListener(r8)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r8 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r8.<init>(r7)
        L_0x0249:
            r7 = r8
            goto L_0x0273
        L_0x024b:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r8 = r6.f316207f
            boolean r8 = r8.mo96656ab()
            if (r8 == 0) goto L_0x0257
            r8 = 2131625708(0x7f0e06ec, float:1.8878632E38)
            goto L_0x0262
        L_0x0257:
            boolean r8 = r6.f316214m
            if (r8 == 0) goto L_0x025f
            r8 = 2131624771(0x7f0e0343, float:1.8876731E38)
            goto L_0x0262
        L_0x025f:
            r8 = 2131625707(0x7f0e06eb, float:1.887863E38)
        L_0x0262:
            android.view.LayoutInflater r0 = r6.f316201C
            android.view.View r7 = r0.inflate(r8, r7, r3)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r8 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r8.<init>(r7)
            goto L_0x0249
        L_0x026e:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r7 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bl
            r7.<init>(r1)
        L_0x0273:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114104ai.onCreateViewHolder(android.view.ViewGroup, int):android.support.v7.widget.gh");
    }

    public final /* synthetic */ void onViewAttachedToWindow(C0673gh ghVar) {
        C108241bl blVar = (C108241bl) ghVar;
        this.f316215n.mo101149a();
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C108241bl) ghVar).mo96687c();
    }

    /* renamed from: p */
    public final void mo101133p(C108232bc bcVar) {
        if (bcVar == null) {
            C59052c cVar = (C59052c) f316198e.mo56226d();
            cVar.mo56380ai(C58979ad.MEDIUM);
            ((C59052c) cVar.mo56372aa(28677)).mo56387q("addElement: null, getElementCount: %s", this.f316209h.size());
            return;
        }
        bcVar.f301041w = this.f316221t;
        bcVar.f301042x = this.f316202D.mo93970a();
        int i = -1;
        int size = this.f316209h.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            C108232bc b = mo95352b(size);
            b.getClass();
            int jz = b.mo96576jz(bcVar.f301029k);
            if (jz == 2) {
                mo101120F(b);
                jz = 2;
            }
            if (jz != 2 && jz != 3) {
                i = size;
                break;
            }
            size--;
        }
        int i2 = i + 1;
        m189234I(String.format("addElement insertPosition=%s newItem=%s", new Object[]{Integer.valueOf(i2), bcVar}));
        ArrayList arrayList = this.f316209h;
        m189239N(bcVar);
        arrayList.add(i2, bcVar);
        notifyItemInserted(i2 + 1);
        m189235J(bcVar);
    }

    /* renamed from: q */
    public final void mo101134q(C108232bc bcVar, int i) {
        m189234I(String.format("addElement index=%s newItem=%s", new Object[]{Integer.valueOf(i), bcVar}));
        ArrayList arrayList = this.f316209h;
        m189239N(bcVar);
        arrayList.add(i, bcVar);
        bcVar.f301041w = this.f316221t;
        bcVar.f301042x = this.f316202D.mo93970a();
        notifyItemInserted(i + 1);
        m189235J(bcVar);
    }

    /* renamed from: r */
    public final void mo101135r(C108232bc bcVar) {
        C28292j jVar = new C28292j(bcVar.mo95829g());
        if (bcVar.mo96597d()) {
            jVar.f76976d = true;
        }
        jVar.mo33794h(1);
        bcVar.mo96608r(jVar);
        bcVar.f301035q = this.f316212k.mo26870b();
        bcVar.f301041w = this.f316221t;
        bcVar.f301042x = this.f316202D.mo93970a();
        this.f316213l.mo96786b(bcVar);
    }

    /* renamed from: s */
    public final void mo101136s(C108232bc bcVar, C108232bc bcVar2) {
        if (bcVar != null) {
            m189239N(bcVar);
        }
        C108212aj ajVar = (C108212aj) bcVar2;
        View view = ajVar.f300977c == 3 ? ajVar.f300976b : null;
        if (view != null) {
            ArrayList arrayList = this.f316209h;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= size) {
                    i2 = -1;
                    break;
                }
                C108232bc bcVar3 = (C108232bc) arrayList.get(i);
                if (bcVar3.mo95830h() == 2 && (bcVar3 instanceof C108212aj) && ((C108212aj) bcVar3).f300976b == view) {
                    break;
                }
                i2++;
                i++;
            }
            if (i2 < 0) {
                mo101133p(bcVar);
                mo101133p(bcVar2);
            } else if (bcVar != null) {
                int i3 = i2 - 1;
                if (i3 >= 0) {
                    C108232bc bcVar4 = (C108232bc) this.f316209h.get(i3);
                    CharSequence charSequence = ((C108262cf) bcVar).f301174d;
                    if (!(bcVar4 instanceof C108262cf) || charSequence == null) {
                        m189234I(String.format("replaceChatUiElement promptIndex=%s prompt=%s", new Object[]{Integer.valueOf(i3), bcVar}));
                        this.f316209h.set(i3, bcVar);
                    } else {
                        ((C108262cf) bcVar4).f301174d = charSequence;
                    }
                    notifyItemChanged(i3 + 1);
                    return;
                }
                m189234I(String.format("add promptIndex=%s prompt=%s", new Object[]{0, bcVar}));
                this.f316209h.add(0, bcVar);
                notifyItemInserted(1);
                m189235J(bcVar);
            }
        }
    }

    /* renamed from: t */
    public final void mo101137t() {
        C108412ht htVar = this.f316204b;
        if (htVar != null) {
            htVar.mo96851c();
            this.f316204b = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValyrianChatAdapter ");
        for (String append : this.f316220s) {
            sb.append(append);
            sb.append(" ");
        }
        sb.append("ChatUiListenerCount=");
        sb.append(this.f316205c.size());
        sb.append(" ");
        for (C114050dp dpVar : this.f316205c) {
            sb.append(dpVar.getClass().getName());
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo101138u() {
        notifyItemChanged(0);
    }

    /* renamed from: v */
    public final void mo101139v() {
        notifyItemChanged(this.f316209h.size() + 1);
    }

    /* renamed from: w */
    public final void mo101140w(C108232bc bcVar) {
        int indexOf = this.f316209h.indexOf(bcVar);
        if (indexOf >= 0) {
            m189234I(String.format("removeElement index=%s element=%s", new Object[]{Integer.valueOf(indexOf), bcVar}));
            this.f316209h.remove(indexOf);
            notifyItemRemoved(indexOf + 1);
            m189240O();
        }
    }

    /* renamed from: x */
    public final void mo101141x(int i) {
        C58838bb.m90871f(i <= this.f316209h.size() && i >= 0, "Invalid numElements=%s", i);
        m189234I(String.format("removeElementsFromBeginning numElements=%s getElementCount=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f316209h.size())}));
        this.f316209h.subList(0, i).clear();
        this.mObservable.mo2883e(1, i);
    }

    /* renamed from: y */
    public final void mo101142y() {
        if (this.f316209h.size() > 0) {
            int size = this.f316209h.size() - 1;
            m189234I(String.format("removeLastElement lastPosition=%s element=%s", new Object[]{Integer.valueOf(size), (C108232bc) this.f316209h.remove(size)}));
            notifyItemRemoved(size + 1);
            m189240O();
        }
    }

    /* renamed from: z */
    public final void mo101143z(int i, C108232bc bcVar) {
        m189234I(String.format("replaceChatUiElement index=%s newItem=%s", new Object[]{Integer.valueOf(i), bcVar}));
        ArrayList arrayList = this.f316209h;
        m189239N(bcVar);
        arrayList.set(i, bcVar);
        notifyItemChanged(i + 1);
    }
}
