package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.assistant.shared.be;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.staticplugins.opa.C109036ff;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108387gv;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108388gw;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109280b;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109281c;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109282d;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109283e;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109285g;
import com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3917i.p3918a.C51456ij;
import com.google.assistant.p3897e.p3921j.C52215jm;
import com.google.assistant.p3897e.p3921j.C52223ju;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.k */
/* compiled from: PG */
public final class C107144k implements C108388gw {

    /* renamed from: a */
    public static final C59071e f298222a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ap.k");

    /* renamed from: b */
    public final Activity f298223b;

    /* renamed from: c */
    public final C108230ba f298224c;

    /* renamed from: d */
    public final C22871g f298225d;

    /* renamed from: e */
    public final PackageManager f298226e;

    /* renamed from: f */
    public final C109285g f298227f;

    /* renamed from: g */
    public final C107156w f298228g;

    /* renamed from: h */
    final List f298229h = new ArrayList();

    /* renamed from: i */
    final C87682aj f298230i;

    /* renamed from: j */
    public boolean f298231j = false;

    /* renamed from: k */
    public final C107129a f298232k;

    /* renamed from: l */
    public final C109036ff f298233l;

    /* renamed from: m */
    private final C68214a f298234m;

    /* renamed from: n */
    private final C58833ax f298235n;

    /* renamed from: o */
    private final C68214a f298236o;

    /* renamed from: p */
    private final C113863cr f298237p;

    /* renamed from: q */
    private C108430ik f298238q;

    /* renamed from: r */
    private C108430ik f298239r;

    /* renamed from: s */
    private C108430ik f298240s;

    /* renamed from: t */
    private C108430ik f298241t;

    /* renamed from: u */
    private boolean f298242u = false;

    public C107144k(C108230ba baVar, C58833ax axVar, C109036ff ffVar, C109285g gVar, C68214a aVar, Activity activity, C107710u uVar, C68214a aVar2, PackageManager packageManager, C22871g gVar2, C107156w wVar, C107129a aVar3, C113863cr crVar) {
        this.f298224c = baVar;
        this.f298233l = ffVar;
        this.f298227f = gVar;
        this.f298225d = gVar2;
        this.f298234m = aVar2;
        this.f298223b = activity;
        this.f298236o = aVar;
        this.f298226e = packageManager;
        this.f298235n = axVar;
        this.f298228g = wVar;
        this.f298232k = aVar3;
        this.f298237p = crVar;
        C107136c cVar = new C107136c(this);
        this.f298230i = cVar;
        uVar.mo96220c(cVar, C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED);
    }

    /* renamed from: i */
    public static void m177872i(C108248bs bsVar) {
        C28292j jVar = new C28292j(bsVar.f301132x);
        jVar.mo33795i(5);
        C89949q.m146521e(C28285c.m52884k(jVar, 5, 0), false);
    }

    /* renamed from: n */
    private final void m177873n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108430ik ikVar = (C108430ik) it.next();
            C60321oe f = C28285c.m52879f(ikVar.f301597d, false);
            ikVar.f301615v = true;
            this.f298237p.mo100721a(0, 0, f);
        }
    }

    /* renamed from: a */
    public final void mo95796a() {
        mo95805k();
    }

    /* renamed from: b */
    public final void mo95797b() {
        mo95805k();
    }

    /* renamed from: c */
    public final void mo95798c() {
        this.f298231j = false;
        this.f298224c.mo95373O(this.f298229h);
        m177873n(this.f298229h);
        this.f298227f.mo97744a();
    }

    /* renamed from: d */
    public final void mo95799d(List list, List list2, int i) {
        C109285g gVar = this.f298227f;
        C107138e eVar = new C107138e(this);
        if (gVar.f304430f == null) {
            gVar.f304429e.setLayoutResource(R.layout.imageviewer_overlay);
            gVar.f304430f = gVar.f304429e.inflate();
            gVar.f304430f.setVisibility(8);
            gVar.f304431g = (ViewPager) gVar.f304430f.findViewById(R.id.imageviewer_view_pager);
            gVar.f304430f.findViewById(R.id.back_arrow).setOnClickListener(new C109281c(gVar));
        }
        gVar.f304432h = true;
        gVar.f304433i = eVar;
        ViewPager viewPager = gVar.f304431g;
        viewPager.getClass();
        List list3 = viewPager.f13822f;
        if (list3 != null) {
            list3.clear();
        }
        gVar.f304431g.mo9146k(new C109280b(gVar.f304425a, list, list2, gVar.f304427c, gVar.f304428d));
        gVar.f304431g.mo9147l(i);
        ((ViewGroup.MarginLayoutParams) gVar.f304431g.getLayoutParams()).bottomMargin = gVar.f304426b.mo95419h().findViewById(R.id.opa_search_plate_container).getMeasuredHeight();
        gVar.f304434j.mo95793b();
        gVar.f304434j.mo95792a((C52223ju) list.get(i));
        gVar.f304431g.mo9137f(new C109282d(gVar, list));
        View view = gVar.f304430f;
        view.getClass();
        view.animate().setDuration(250).alpha(1.0f).setListener(new C109283e(gVar)).start();
        C89949q.m146521e(C28285c.m52875b(C28293k.m52908e(new C28292j(27415), C28293k.m52908e(new C28292j(82336), new C28293k[0])), 472), false);
        mo95805k();
    }

    /* renamed from: e */
    public final void mo95800e(String str) {
        this.f298224c.mo95394ae(str);
    }

    /* renamed from: f */
    public final C58833ax mo95801f() {
        for (int i = 0; i < this.f298224c.mo95421j().mo95351a(); i++) {
            C108232bc b = this.f298224c.mo95421j().mo95352b(i);
            if (b instanceof C108387gv) {
                return C58833ax.m90834k((C108387gv) b);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: g */
    public final C60870cx mo95802g(C52215jm jmVar) {
        C62971cq cqVar = jmVar.f137026a;
        if (cqVar.isEmpty()) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No photos to download."));
        }
        return this.f298228g.mo95815j(cqVar, this.f298233l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95804j() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.apps.gsa.staticplugins.opa.ap.w r0 = r4.f298228g     // Catch:{ all -> 0x006c }
            int r0 = r0.mo95809c()     // Catch:{ all -> 0x006c }
            r1 = 2
            if (r0 != r1) goto L_0x006a
            com.google.android.apps.gsa.staticplugins.opa.ap.w r0 = r4.f298228g     // Catch:{ all -> 0x006c }
            com.google.common.base.ax r0 = r0.mo95810e()     // Catch:{ all -> 0x006c }
            boolean r1 = r0.mo56113h()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.mo56107c()     // Catch:{ all -> 0x006c }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x006c }
            int r1 = r1.size()     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.staticplugins.opa.ao.a r2 = r4.f298232k     // Catch:{ all -> 0x006c }
            java.util.List r2 = r2.f298206a     // Catch:{ all -> 0x006c }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)     // Catch:{ all -> 0x006c }
            int r2 = r2.size()     // Catch:{ all -> 0x006c }
            if (r1 != r2) goto L_0x006a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x006c }
            android.app.Activity r2 = r4.f298223b     // Catch:{ all -> 0x006c }
            r1.<init>(r2)     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006c }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x003f
            monitor-exit(r4)
            return
        L_0x003f:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "android.intent.action.SEND_MULTIPLE"
            r2.<init>(r3)     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "image/*"
            r2.setType(r3)     // Catch:{ all -> 0x006c }
            r3 = 1
            r2.addFlags(r3)     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "android.intent.extra.STREAM"
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x006c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x006c }
            r2.putParcelableArrayListExtra(r3, r0)     // Catch:{ all -> 0x006c }
            r0 = 2132090581(0x7f151ed5, float:1.9821506E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x006c }
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)     // Catch:{ all -> 0x006c }
            r1.startActivity(r0)     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return
        L_0x006a:
            monitor-exit(r4)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k.mo95804j():void");
    }

    /* renamed from: k */
    public final void mo95805k() {
        if (this.f298224c.mo95424m().getItemCount() == 0) {
            ((C59052c) ((C59052c) f298222a.mo56226d()).mo56372aa(25337)).mo56386p("Selecting photo before suggestion is shown.");
        } else if (((C86124t) this.f298234m.mo27525b()).mo79746e(C90014bt.f247270dw)) {
            this.f298224c.mo95373O(this.f298229h);
            List<C108430ik> list = (List) Collection.EL.stream(Collections.unmodifiableList(this.f298224c.mo95424m().f301554a)).filter(C107135b.f298212a).collect(Collectors.toList());
            java.util.Collection h = mo95803h(list);
            if (!h.isEmpty()) {
                this.f298224c.mo95424m().mo96862e(0, h);
                C108423id m = this.f298224c.mo95424m();
                int i = 0;
                for (C108430ik lastIndexOf : list) {
                    int lastIndexOf2 = m.f301554a.lastIndexOf(lastIndexOf);
                    if (lastIndexOf2 >= 0) {
                        m.f301554a.remove(lastIndexOf2);
                        m.notifyItemRemoved(lastIndexOf2);
                        i++;
                    }
                }
                C58976aa aaVar = C58975e.f156826a;
                C59081b.m91349a(i > 0 ? C58979ad.MEDIUM : C58979ad.NONE, "stack size");
                list.size();
                m.mo96859b();
                if (i > 0) {
                    m.mo96865i();
                }
                this.f298224c.mo95424m().mo96862e(0, list);
                RecyclerView recyclerView = this.f298224c.mo95424m().f301565l;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo95806l() {
        C58833ax f = mo95801f();
        if (!f.mo56113h()) {
            return false;
        }
        return ((C108387gv) f.mo56107c()).mo96829c();
    }

    /* renamed from: m */
    public final boolean mo95807m() {
        return ((C86124t) this.f298234m.mo27525b()).mo79746e(C90014bt.f247206cl);
    }

    /* renamed from: h */
    public final java.util.Collection mo95803h(java.util.Collection collection) {
        C108430ik ikVar;
        C58833ax axVar;
        C17880aj ajVar;
        if (!this.f298242u) {
            this.f298242u = true;
            if (((C86124t) this.f298234m.mo27525b()).mo79746e(C90014bt.f247301ea)) {
                C108249bt a = ((C108250bu) this.f298236o.mo27525b()).mo96700a(C108248bs.SELECT_TO_SHARE, new Object[0]);
                this.f298241t = a;
                C108249bt btVar = a;
                a.f301138c = new C107141h(this);
                if (mo95807m()) {
                    this.f298241t.f301619z = false;
                }
            }
            C58838bb.m90884s(this.f298238q == null, "Share suggestions are already initialized.");
            if (!((C86124t) this.f298234m.mo27525b()).mo79746e(C90014bt.f247037B)) {
                axVar = C58836b.f156633a;
            } else if (this.f298223b.getIntent() == null) {
                axVar = C58836b.f156633a;
            } else {
                byte[] aU = C87566i.m142273aU(this.f298223b.getIntent().getExtras());
                if (aU != null) {
                    try {
                        ajVar = (C17880aj) C62942bv.parseFrom((C62942bv) C17880aj.f51221i, aU, C62921ba.m95368a());
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) f298222a.mo56226d()).mo56382g(e)).mo56372aa(25334)).mo56386p("Cannot parse given voice plate params");
                    }
                    axVar = ((be) this.f298235n.mo56107c()).a(ajVar);
                }
                ajVar = null;
                axVar = ((be) this.f298235n.mo56107c()).a(ajVar);
            }
            if (this.f298223b.getIntent() != null && axVar.mo56113h() && C90721ae.f253795d.contains(C87566i.m142234I(this.f298223b.getIntent().getExtras()))) {
                C108249bt a2 = ((C108250bu) this.f298236o.mo27525b()).mo96700a(C108248bs.SEND_PHOTOS_TO, ((C51456ij) axVar.mo56107c()).f134041c);
                this.f298239r = a2;
                C107137d dVar = new C107137d(this, axVar);
                C108249bt btVar2 = a2;
                a2.f301138c = dVar;
                if (mo95807m()) {
                    this.f298239r.f301619z = false;
                }
            }
            C108390gy gyVar = new C108390gy(74261, this.f298223b.getString(R.string.opa_share_photos), (String) null);
            this.f298238q = gyVar;
            gyVar.f301604k = e.A;
            if (mo95807m()) {
                this.f298238q.f301619z = false;
            }
            C108249bt a3 = ((C108250bu) this.f298236o.mo27525b()).mo96700a(C108248bs.UNSELECT_ALL_PHOTOS, new Object[0]);
            this.f298240s = a3;
            C108249bt btVar3 = a3;
            a3.f301138c = new C107142i(this);
            if (mo95807m()) {
                this.f298240s.f301619z = false;
            }
        }
        m177873n(this.f298229h);
        this.f298229h.clear();
        if (C58485gu.m89842j(this.f298232k.f298206a).isEmpty() && (ikVar = this.f298241t) != null) {
            this.f298229h.add(ikVar);
        }
        if (C58485gu.m89842j(this.f298232k.f298206a).size() > 0) {
            C108430ik ikVar2 = this.f298239r;
            if (ikVar2 != null) {
                this.f298229h.add(ikVar2);
            }
            if (collection.isEmpty()) {
                List list = this.f298229h;
                C108430ik ikVar3 = this.f298238q;
                ikVar3.getClass();
                list.add(ikVar3);
            }
        }
        if (C58485gu.m89842j(this.f298232k.f298206a).size() >= 2) {
            List list2 = this.f298229h;
            C108430ik ikVar4 = this.f298240s;
            ikVar4.getClass();
            list2.add(ikVar4);
        }
        if (!this.f298229h.isEmpty()) {
            for (C108430ik ikVar5 : this.f298229h) {
                C60321oe f = C28285c.m52879f(ikVar5.f301597d, true);
                ikVar5.f301615v = false;
                this.f298237p.mo100721a(0, 0, f);
            }
        }
        return this.f298229h;
    }
}
