package com.google.android.libraries.lens.view.infopanel.p2138a;

import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26964c;
import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27134aj;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.p */
/* compiled from: PG */
public final class C26980p implements C27654a {

    /* renamed from: a */
    public final Context f73567a;

    /* renamed from: b */
    public final C60888db f73568b;

    /* renamed from: c */
    public final C25758g f73569c;

    /* renamed from: d */
    public final C25758g f73570d;

    /* renamed from: e */
    public final C25758g f73571e;

    /* renamed from: f */
    public final ArrayDeque f73572f = new ArrayDeque();

    /* renamed from: g */
    public C26973i f73573g;

    /* renamed from: h */
    public C26973i f73574h = null;

    /* renamed from: i */
    private final C26244b f73575i;

    /* renamed from: j */
    private final boolean f73576j;

    /* renamed from: k */
    private boolean f73577k;

    static {
        C58974d.m91135i("InfoPanelModelManager");
    }

    public C26980p(Context context, C60888db dbVar, C26244b bVar, C27655b bVar2, boolean z) {
        this.f73567a = context;
        this.f73575i = bVar;
        this.f73568b = dbVar;
        this.f73576j = z;
        bVar2.mo33143a(this);
        this.f73569c = new C25758g(C58836b.f156633a);
        this.f73570d = new C25758g(C26968d.HIDDEN);
        this.f73571e = new C25758g(C58836b.f156633a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[LOOP:0: B:1:0x0002->B:22:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m50058m(com.google.android.libraries.lens.view.infopanel.p2138a.C26973i r8, com.google.android.libraries.lens.view.p2078at.C25527j r9) {
        /*
            r0 = 0
            r1 = 0
        L_0x0002:
            com.google.common.b.gu r2 = r8.mo32423l()
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x009a
            com.google.common.b.gu r2 = r8.mo32423l()
            java.lang.Object r2 = r2.get(r1)
            com.google.android.libraries.lens.view.infopanel.e.ae r2 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae) r2
            r3 = r9
            com.google.android.libraries.lens.view.at.e r3 = (com.google.android.libraries.lens.view.p2078at.C25522e) r3
            java.lang.String r4 = r3.f69500a
            boolean r5 = r2 instanceof com.google.android.libraries.lens.view.infopanel.p2144e.C27183y
            if (r5 == 0) goto L_0x0049
            r5 = r2
            com.google.android.libraries.lens.view.infopanel.e.y r5 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27183y) r5
            r6 = 0
        L_0x0023:
            com.google.common.b.gu r7 = r5.f74306a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0049
            com.google.common.b.gu r7 = r5.f74306a
            java.lang.Object r7 = r7.get(r6)
            com.google.android.libraries.lens.view.infopanel.e.t r7 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27178t) r7
            com.google.at.g.a.a.j r7 = r7.f74292b
            java.lang.String r7 = r7.f141830a
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0046
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x004b
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0049:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x004b:
            boolean r5 = r4.mo56113h()
            if (r5 == 0) goto L_0x0096
            r8 = r2
            com.google.android.libraries.lens.view.infopanel.e.y r8 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27183y) r8
            com.google.common.b.gu r8 = r8.f74306a
            java.lang.Object r9 = r4.mo56107c()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r8 = r8.get(r9)
            com.google.android.libraries.lens.view.infopanel.e.t r8 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27178t) r8
            int r9 = r3.f69502c
            r8.f74299i = r9
            int r9 = r3.f69501b
            com.google.common.b.hd r0 = r8.f74296f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007b
            r8.f74295e = r9
            goto L_0x0089
        L_0x007b:
            com.google.common.f.a.d r8 = com.google.android.libraries.lens.view.infopanel.p2144e.C27178t.f74291a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "Ignoring invalid chip state ID: %d"
            r1 = 49581(0xc1ad, float:6.9478E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r1)).mo56387q(r0, r9)
        L_0x0089:
            com.google.android.libraries.lens.view.infopanel.e.z r8 = r2.f74135d
            if (r8 == 0) goto L_0x0094
            com.google.android.libraries.lens.view.infopanel.e.s r8 = r8.f74308a
            android.support.v7.widget.fc r8 = r8.mObservable
            r8.mo2879a()
        L_0x0094:
            r8 = 1
            return r8
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.infopanel.p2138a.C26980p.m50058m(com.google.android.libraries.lens.view.infopanel.a.i, com.google.android.libraries.lens.view.at.j):boolean");
    }

    /* renamed from: a */
    public final C26968d mo32435a() {
        return (C26968d) this.f73570d.mo3842a();
    }

    /* renamed from: b */
    public final C26973i mo32436b() {
        C26973i iVar = this.f73573g;
        return iVar == null ? C26973i.f73554m : iVar;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("InfoPanelModelManager");
        C26973i iVar = this.f73573g;
        if (iVar != null) {
            eVar.mo33150g("CurrentModel");
            eVar.mo33146c(iVar);
        }
        eVar.mo33150g("Panel History in LIFO");
        Iterator it = this.f73572f.iterator();
        int i = 0;
        while (it.hasNext()) {
            eVar.mo33150g("PreviousModel:" + i);
            eVar.mo33146c((C26973i) it.next());
            i++;
        }
    }

    /* renamed from: d */
    public final C26973i mo32437d(String str) {
        C26972h hVar;
        if (mo32435a() == C26968d.HIDDEN || mo32435a() == C26968d.HEADER) {
            hVar = C26972h.PROGRESS_BAR;
        } else {
            hVar = C26972h.LOADING_CONTAINER;
        }
        C26971g p = C26973i.m50040p();
        C26964c e = C26965d.m50009e();
        e.mo32402d(str);
        p.mo32394b(e.mo32399a());
        p.mo32398f(true);
        C58833ax k = C58833ax.m90834k(hVar);
        C26961a aVar = (C26961a) p;
        aVar.f73509a = k;
        p.mo32396d(C58485gu.m89845m());
        aVar.f73511c = C58836b.f156633a;
        p.mo32395c(false);
        return p.mo32393a();
    }

    /* renamed from: e */
    public final void mo32438e(boolean z) {
        this.f73577k = z;
        if (!z) {
            this.f73572f.clear();
        }
    }

    /* renamed from: f */
    public final void mo32439f() {
        C26973i iVar = this.f73573g;
        if (iVar != null) {
            this.f73569c.mo5708l(C58833ax.m90834k(iVar));
        }
    }

    /* renamed from: g */
    public final void mo32440g(C26973i iVar) {
        C26973i iVar2 = this.f73573g;
        if (this.f73577k && iVar2 != null && ((!iVar2.mo32423l().isEmpty() || iVar2.mo32433q()) && !iVar2.mo32425n())) {
            this.f73572f.add(iVar2);
        }
        this.f73573g = iVar;
        if (TextUtils.isEmpty((CharSequence) ((C58833ax) this.f73571e.mo3842a()).mo56106b(C26979o.f73566a).mo56109e(BuildConfig.FLAVOR))) {
            this.f73574h = iVar;
        }
        mo32439f();
    }

    /* renamed from: h */
    public final void mo32441h(C26968d dVar) {
        C58838bb.m90869d(dVar.f73550f, String.format(Locale.US, "Target state %s cannot be set", new Object[]{dVar}));
        C25758g gVar = this.f73570d;
        dVar.getClass();
        gVar.mo5708l(dVar);
    }

    /* renamed from: i */
    public final void mo32442i() {
        mo32441h(C26968d.HIDDEN);
        if (this.f73576j && this.f73575i.mo31462g(C26239a.ONELRP_STICKY_WEBVIEW_ENABLED)) {
            this.f73573g = null;
            this.f73571e.mo5708l(C58836b.f156633a);
        }
    }

    /* renamed from: j */
    public final void mo32443j(C26982r rVar) {
        if (!((String) ((C58833ax) this.f73571e.mo3842a()).mo56106b(C26979o.f73566a).mo56109e(BuildConfig.FLAVOR)).equals(((C26967c) rVar).f73542a)) {
            this.f73571e.mo5708l(C58833ax.m90834k(rVar));
        }
    }

    /* renamed from: k */
    public final void mo32444k(String str) {
        C26973i d = mo32437d(str);
        if (!d.equals(mo32436b())) {
            mo32440g(d);
        }
        if (mo32435a() == C26968d.HIDDEN) {
            mo32441h(C26968d.HEADER);
        }
    }

    /* renamed from: l */
    public final boolean mo32445l() {
        if (!this.f73577k || this.f73572f.isEmpty()) {
            return false;
        }
        C26971g a = ((C26973i) this.f73572f.removeLast()).mo32411a();
        a.mo32397e(C58833ax.m90834k(true));
        this.f73573g = a.mo32393a();
        mo32439f();
        return true;
    }

    /* renamed from: n */
    public final void mo32446n(int i) {
        C27134aj ajVar = new C27134aj(new C26978n(this, i), i);
        C26971g p = C26973i.m50040p();
        p.mo32396d(C58485gu.m89846n(ajVar));
        ((C26961a) p).f73511c = C58836b.f156633a;
        p.mo32398f(false);
        p.mo32394b(C26965d.m50011g());
        p.mo32395c(false);
        mo32440g(p.mo32393a());
        mo32441h(C26968d.OPEN);
    }
}
