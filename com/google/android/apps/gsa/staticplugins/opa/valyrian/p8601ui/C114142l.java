package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.support.p033v7.widget.C0552bv;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108192a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114050dp;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.l */
/* compiled from: PG */
public final class C114142l implements C114095a {

    /* renamed from: a */
    public boolean f316418a;

    /* renamed from: b */
    final C0552bv f316419b;

    /* renamed from: c */
    final C114137g f316420c;

    /* renamed from: d */
    final C0640fb f316421d;

    /* renamed from: e */
    final C0640fb f316422e;

    /* renamed from: f */
    public final boolean f316423f;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114142l(com.google.android.apps.gsa.shared.util.p7184t.C91097g r28, com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax r29, com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh r30, com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id r31, com.google.common.base.C58881cr r32, com.google.common.base.C58881cr r33, android.app.Activity r34, com.google.android.apps.gsa.search.core.p6805i.C86124t r35, com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a r36, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114138h r37) {
        /*
            r27 = this;
            r0 = r27
            r1 = r34
            r2 = r37
            r27.<init>()
            int r3 = r36.mo75125b()
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == r6) goto L_0x001f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248283bq
            r7 = r35
            boolean r3 = r7.mo79746e(r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            r0.f316423f = r3
            android.content.Intent r3 = r34.getIntent()
            if (r3 == 0) goto L_0x0032
            android.os.Bundle r3 = r3.getExtras()
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r3)
            r0.f316418a = r3
        L_0x0032:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.i r3 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.i
            r10 = r30
            r3.<init>(r0, r10, r1)
            r0.f316421d = r3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.k r13 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.k
            r9 = r29
            r13.<init>(r1, r9)
            r0.f316422e = r13
            r3.setHasStableIds(r5)
            r13.setHasStableIds(r5)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.g r1 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.g
            r7 = r1
            g.a.a r8 = r2.f316399a
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.shared.s.a.a r8 = (com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a) r8
            r14 = r8
            r8.getClass()
            g.a.a r8 = r2.f316400b
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.f.a r8 = (com.google.android.libraries.p1730f.C21370a) r8
            r15 = r8
            r8.getClass()
            g.a.a r8 = r2.f316401c
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.eq r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108328eq) r8
            r16 = r8
            r8.getClass()
            g.a.a r8 = r2.f316402d
            java.lang.Object r8 = r8.mo17428b()
            android.app.Activity r8 = (android.app.Activity) r8
            r17 = r8
            r8.getClass()
            g.a.a r8 = r2.f316403e
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8
            r18 = r8
            r8.getClass()
            g.a.a r8 = r2.f316404f
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r8 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r8
            r19 = r8
            r8.getClass()
            g.a.a r8 = r2.f316405g
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.nga.shared.ui.a.a r8 = (com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a) r8
            r20 = r8
            r8.getClass()
            g.a.a r8 = r2.f316406h
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.gsa.k.g r8 = (com.google.android.libraries.gsa.p1876k.C22871g) r8
            r21 = r8
            r8.getClass()
            g.a.a r8 = r2.f316407i
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ak r8 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114106ak) r8
            r22 = r8
            r8.getClass()
            g.a.a r8 = r2.f316408j
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b r8 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b) r8
            r23 = r8
            r8.getClass()
            g.a.a r8 = r2.f316409k
            java.lang.Object r8 = r8.mo17428b()
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            r24 = r8
            r8.getClass()
            g.a.a r8 = r2.f316410l
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.assistant.shared.r.a r8 = (com.google.android.apps.gsa.assistant.shared.p5829r.C73906a) r8
            r25 = r8
            r8.getClass()
            g.a.a r2 = r2.f316411m
            java.lang.Object r2 = r2.mo17428b()
            r26 = r2
            com.google.android.libraries.logging.ve.f.h r26 = (com.google.android.libraries.logging.p2185ve.p2199f.C28421h) r26
            r8 = r28
            r11 = r31
            r12 = r32
            r2 = r13
            r13 = r33
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.f316420c = r1
            android.support.v7.widget.bv r7 = new android.support.v7.widget.bv
            android.support.v7.widget.bu r8 = new android.support.v7.widget.bu
            r9 = 3
            r8.<init>(r4, r9)
            android.support.v7.widget.fb[] r9 = new android.support.p033v7.widget.C0640fb[r9]
            r9[r4] = r3
            r9[r5] = r1
            r9[r6] = r2
            java.util.List r1 = java.util.Arrays.asList(r9)
            r7.<init>(r8, r1)
            r0.f316419b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114142l.<init>(com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.staticplugins.opa.chatui.ax, com.google.android.apps.gsa.staticplugins.opa.chatui.bh, com.google.android.apps.gsa.staticplugins.opa.chatui.id, com.google.common.base.cr, com.google.common.base.cr, android.app.Activity, com.google.android.apps.gsa.search.core.i.t, com.google.android.apps.gsa.nga.shared.ui.a.a, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.h):void");
    }

    /* renamed from: A */
    public final void mo101115A(C108237bh bhVar) {
        this.f316420c.f316376d = bhVar;
    }

    /* renamed from: B */
    public final void mo101116B(C108321ej ejVar) {
        this.f316420c.f316382j = ejVar;
    }

    /* renamed from: C */
    public final void mo101117C(C108324em emVar) {
        this.f316420c.f316383k = emVar;
    }

    /* renamed from: D */
    public final void mo101118D(C114050dp dpVar) {
        this.f316420c.f316386n.add(dpVar);
    }

    /* renamed from: E */
    public final void mo101119E() {
        C90476a aVar = this.f316420c.f316374b;
    }

    /* renamed from: F */
    public final void mo101120F(C108232bc bcVar) {
        this.f316420c.mo101183k(bcVar);
    }

    /* renamed from: G */
    public final void mo101121G(C109037fg fgVar) {
        this.f316420c.f316388p = fgVar;
    }

    /* renamed from: a */
    public final int mo95351a() {
        return this.f316420c.f316379g.size();
    }

    /* renamed from: b */
    public final C108232bc mo95352b(int i) {
        return this.f316420c.mo95352b(i);
    }

    /* renamed from: c */
    public final C108232bc mo95353c() {
        return this.f316420c.mo95353c();
    }

    /* renamed from: d */
    public final void mo95354d(int i) {
        this.f316420c.mo95354d(i);
    }

    /* renamed from: e */
    public final int mo101122e(C58839bc bcVar) {
        return this.f316420c.mo101177e(bcVar);
    }

    /* renamed from: f */
    public final int mo101123f() {
        View view = this.f316420c.f316384l;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo101124g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo101125h() {
        return this.f316419b.f2147a.mo2626b() - 1;
    }

    /* renamed from: i */
    public final C0640fb mo101126i() {
        return this.f316419b;
    }

    /* renamed from: j */
    public final C108232bc mo101127j(C58839bc bcVar) {
        C108232bc b;
        C114137g gVar = this.f316420c;
        int size = gVar.f316379g.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            b = gVar.mo95352b(size);
            b.getClass();
        } while (!bcVar.mo5941a(b));
        return b;
    }

    /* renamed from: k */
    public final C108232bc mo101128k() {
        C108232bc b;
        C114137g gVar = this.f316420c;
        int e = gVar.mo101177e(C108230ba.f301013a);
        if (e < 0) {
            return null;
        }
        do {
            e--;
            if (e < 0) {
                return null;
            }
            b = gVar.mo95352b(e);
            b.getClass();
        } while (b instanceof C108192a);
        return b;
    }

    /* renamed from: l */
    public final C108412ht mo101129l(List list, boolean z, boolean z2) {
        RecyclerView recyclerView;
        C108412ht htVar;
        C114137g gVar = this.f316420c;
        if (list.isEmpty()) {
            return null;
        }
        C108412ht htVar2 = gVar.f316378f;
        if (htVar2 == null || htVar2.f301530b.f301557d != z2) {
            C108226ax axVar = gVar.f316375c;
            gVar.f316378f = new C108412ht(gVar.f316377e, z2);
            C28292j jVar = new C28292j(gVar.f316378f.mo95829g());
            gVar.f316378f.getClass();
            RecyclerView recyclerView2 = gVar.f316377e.f301565l;
            if (recyclerView2 != null) {
                C28295m.m52919e(recyclerView2, jVar);
            }
            jVar.f76976d = true;
            jVar.mo33794h(1);
            C108412ht htVar3 = gVar.f316378f;
            htVar3.getClass();
            htVar3.mo96608r(jVar);
            C108412ht htVar4 = gVar.f316378f;
            htVar4.getClass();
            htVar4.f301035q = gVar.f316380h.mo26870b();
            C108412ht htVar5 = gVar.f316378f;
            htVar5.getClass();
            htVar5.mo96850b(list);
            C108412ht htVar6 = gVar.f316378f;
            htVar6.getClass();
            if (!htVar6.f301530b.f301557d) {
                gVar.f316381i.mo96786b(htVar6);
            }
            C108232bc c = gVar.mo95353c();
            if (!(c == null || (htVar = gVar.f316378f) == null || c.mo96576jz(htVar.f301029k) != 2)) {
                gVar.mo101181i();
            }
        } else {
            htVar2.mo96850b(list);
        }
        if (z) {
            gVar.f316377e.mo96868n();
        }
        C108423id idVar = gVar.f316377e;
        if (!idVar.f301557d && (recyclerView = idVar.f301565l) != null) {
            long a = gVar.f316385m.mo79743a(C90085ej.f250230h);
            if (a > 0) {
                recyclerView.animate().alpha(1.0f).setDuration(a).start();
            } else {
                recyclerView.setAlpha(1.0f);
            }
        }
        return gVar.f316378f;
    }

    /* renamed from: m */
    public final C108412ht mo101130m() {
        return this.f316420c.f316378f;
    }

    /* renamed from: n */
    public final C108423id mo101131n() {
        return this.f316420c.f316377e;
    }

    /* renamed from: o */
    public final C60321oe mo101132o(C58833ax axVar) {
        C114137g gVar = this.f316420c;
        C60321oe a = gVar.f316381i.mo96785a(axVar);
        gVar.f316381i.mo96787c();
        return a;
    }

    /* renamed from: p */
    public final void mo101133p(C108232bc bcVar) {
        this.f316420c.mo101178f(bcVar);
    }

    /* renamed from: q */
    public final void mo101134q(C108232bc bcVar, int i) {
        C114137g gVar = this.f316420c;
        gVar.mo101179g(String.format("addElement index=%s newItem=%s", new Object[]{Integer.valueOf(i), bcVar}));
        ArrayList arrayList = gVar.f316379g;
        gVar.mo101182j(bcVar);
        arrayList.add(i, bcVar);
        bcVar.f301041w = gVar.f316385m;
        bcVar.f301042x = gVar.f316387o.mo93970a();
        gVar.notifyItemInserted(i);
        gVar.mo101180h(bcVar);
    }

    /* renamed from: r */
    public final void mo101135r(C108232bc bcVar) {
        C114137g gVar = this.f316420c;
        C58976aa aaVar = C58975e.f156826a;
        C28292j jVar = new C28292j(bcVar.mo95829g());
        if (bcVar.mo96597d()) {
            jVar.f76976d = true;
        }
        jVar.mo33794h(1);
        bcVar.mo96608r(jVar);
        bcVar.f301035q = gVar.f316380h.mo26870b();
        gVar.f316381i.mo96786b(bcVar);
    }

    /* renamed from: s */
    public final void mo101136s(C108232bc bcVar, C108232bc bcVar2) {
        C114137g gVar = this.f316420c;
        if (bcVar != null) {
            gVar.mo101182j(bcVar);
        }
        C108212aj ajVar = (C108212aj) bcVar2;
        View view = ajVar.f300977c == 3 ? ajVar.f300976b : null;
        if (view == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        ArrayList arrayList = gVar.f316379g;
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
            C58976aa aaVar2 = C58975e.f156826a;
            gVar.mo101178f(bcVar);
            gVar.mo101178f(bcVar2);
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (bcVar != null) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                C108232bc bcVar4 = (C108232bc) gVar.f316379g.get(i3);
                CharSequence charSequence = ((C108262cf) bcVar).f301174d;
                if (!(bcVar4 instanceof C108262cf) || charSequence == null) {
                    gVar.mo101179g(String.format("replaceChatUiElement promptIndex=%s prompt=%s", new Object[]{Integer.valueOf(i3), bcVar}));
                    gVar.f316379g.set(i3, bcVar);
                } else {
                    ((C108262cf) bcVar4).f301174d = charSequence;
                }
                gVar.notifyItemChanged(i3);
                return;
            }
            gVar.mo101179g(String.format("add promptIndex=%s prompt=%s", new Object[]{0, bcVar}));
            gVar.f316379g.add(0, bcVar);
            gVar.notifyItemInserted(0);
            gVar.mo101180h(bcVar);
        }
    }

    /* renamed from: t */
    public final void mo101137t() {
        C114137g gVar = this.f316420c;
        C108412ht htVar = gVar.f316378f;
        if (htVar != null) {
            htVar.mo96851c();
            gVar.f316378f = null;
        }
    }

    /* renamed from: u */
    public final void mo101138u() {
        this.f316421d.notifyItemChanged(0);
    }

    /* renamed from: v */
    public final void mo101139v() {
        this.f316422e.notifyItemChanged(0);
    }

    /* renamed from: w */
    public final void mo101140w(C108232bc bcVar) {
        C114137g gVar = this.f316420c;
        int indexOf = gVar.f316379g.indexOf(bcVar);
        if (indexOf < 0) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        gVar.mo101179g(String.format("removeElement index=%s element=%s", new Object[]{Integer.valueOf(indexOf), bcVar}));
        gVar.f316379g.remove(indexOf);
        gVar.notifyItemRemoved(indexOf);
        gVar.mo101184l();
    }

    /* renamed from: x */
    public final void mo101141x(int i) {
        C114137g gVar = this.f316420c;
        C58838bb.m90871f(i <= gVar.f316379g.size() && i >= 0, "Invalid numElements=%s", i);
        gVar.mo101179g(String.format("removeElementsFromBeginning numElements=%s getElementCount=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(gVar.f316379g.size())}));
        gVar.f316379g.subList(0, i).clear();
        gVar.mObservable.mo2883e(0, i);
    }

    /* renamed from: y */
    public final void mo101142y() {
        this.f316420c.mo101181i();
    }

    /* renamed from: z */
    public final void mo101143z(int i, C108232bc bcVar) {
        C114137g gVar = this.f316420c;
        gVar.mo101179g(String.format("replaceChatUiElement index=%s newItem=%s", new Object[]{Integer.valueOf(i), bcVar}));
        ArrayList arrayList = gVar.f316379g;
        gVar.mo101182j(bcVar);
        arrayList.set(i, bcVar);
        gVar.notifyItemChanged(i);
    }
}
