package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.h */
/* compiled from: PG */
public final class C113565h extends C0640fb implements C113427g {

    /* renamed from: b */
    private static final C59071e f314447b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.ui.h");

    /* renamed from: a */
    public final List f314448a;

    /* renamed from: c */
    private final C68214a f314449c;

    /* renamed from: d */
    private final C68214a f314450d;

    public C113565h(List list, C68214a aVar, C68214a aVar2) {
        this.f314448a = list;
        this.f314449c = aVar;
        this.f314450d = aVar2;
    }

    /* renamed from: a */
    public final void mo100230a(C113415ez ezVar) {
    }

    /* renamed from: b */
    public final Optional mo100309b(int i) {
        int itemCount = getItemCount();
        if (i >= 0 && i < itemCount) {
            return Optional.m71637of(((C113344co) this.f314448a.get(i)).f313867a);
        }
        C59104x d = f314447b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OuterSectionAdapter");
        ((C59052c) ((C59052c) d).mo56372aa(27913)).mo56393w("getGroupId() for position: %d but total count is %d", i, itemCount);
        return Optional.empty();
    }

    public final int getItemCount() {
        return this.f314448a.size();
    }

    public final long getItemId(int i) {
        C113344co coVar = (C113344co) this.f314448a.get(i);
        StringBuilder sb = new StringBuilder();
        sb.append(C113371dl.m187571a(coVar.f313867a));
        sb.append(",");
        for (C113415ez Q : coVar.f313868b) {
            sb.append(Q.mo100058Q());
            sb.append(",");
        }
        return (long) sb.toString().hashCode();
    }

    public final int getItemViewType(int i) {
        Optional b = mo100309b(i);
        if (!b.isPresent() || (!((C48670ae) b.get()).equals(C48670ae.SUGGESTION_GROUP_ICON_SHORTCUT) && !((C48670ae) b.get()).equals(C48670ae.SUGGESTION_GROUP_APP_PLACEHOLDER))) {
            return C113564g.DEFAULT.f314445c;
        }
        return C113564g.APPS.f314445c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p033v7.widget.C0673gh r13, int r14) {
        /*
            r12 = this;
            java.util.List r0 = r12.f314448a
            java.lang.Object r14 = r0.get(r14)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.co r14 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co) r14
            dagger.a r0 = r12.f314449c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.v r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113579v) r0
            boolean r1 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113577t
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0021
            r1 = r13
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.t r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113577t) r1
            int r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113577t.f314477c
            android.widget.LinearLayout r2 = r1.f314478a
            android.support.v7.widget.RecyclerView r1 = r1.f314479b
        L_0x001f:
            r10 = r1
            goto L_0x002f
        L_0x0021:
            boolean r1 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113578u
            if (r1 == 0) goto L_0x00de
            r1 = r13
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.u r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113578u) r1
            int r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113578u.f314480c
            android.widget.LinearLayout r2 = r1.f314481a
            android.support.v7.widget.RecyclerView r1 = r1.f314482b
            goto L_0x001f
        L_0x002f:
            android.view.View r1 = r13.itemView
            r1.getContext()
            com.google.assistant.ad.d.b.ae r1 = r14.f313867a
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.q r2 = r0.f314485c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r3 = r14.f313869c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r3 = r3.mo100118a()
            com.google.assistant.ad.d.b.ai r3 = r3.mo100024h()
            com.google.assistant.ad.d.b.ae r4 = com.google.assistant.p3781ad.p3789d.p3791b.C48670ae.SUGGESTION_GROUP_FALLBACK
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x007b;
                case 2: goto L_0x008d;
                case 3: goto L_0x008d;
                case 4: goto L_0x008d;
                case 5: goto L_0x008d;
                case 6: goto L_0x008d;
                case 7: goto L_0x008d;
                case 8: goto L_0x008d;
                case 9: goto L_0x008d;
                case 10: goto L_0x008d;
                case 11: goto L_0x006c;
                case 12: goto L_0x008d;
                case 13: goto L_0x008d;
                case 14: goto L_0x0062;
                case 15: goto L_0x008d;
                case 16: goto L_0x008d;
                case 17: goto L_0x008d;
                case 18: goto L_0x0053;
                case 19: goto L_0x008d;
                case 20: goto L_0x008d;
                case 21: goto L_0x008d;
                case 22: goto L_0x008d;
                case 23: goto L_0x008d;
                case 24: goto L_0x008d;
                case 25: goto L_0x008d;
                case 26: goto L_0x0053;
                case 27: goto L_0x008d;
                case 28: goto L_0x008d;
                case 29: goto L_0x008d;
                case 30: goto L_0x008d;
                case 31: goto L_0x008d;
                case 32: goto L_0x008d;
                case 33: goto L_0x008d;
                case 34: goto L_0x008d;
                case 35: goto L_0x008d;
                case 36: goto L_0x008d;
                case 37: goto L_0x008d;
                case 38: goto L_0x008d;
                case 39: goto L_0x008d;
                case 40: goto L_0x008d;
                case 41: goto L_0x008d;
                case 42: goto L_0x008d;
                case 43: goto L_0x008d;
                case 44: goto L_0x008d;
                case 45: goto L_0x008d;
                case 46: goto L_0x008d;
                case 47: goto L_0x008d;
                case 48: goto L_0x008d;
                case 49: goto L_0x008d;
                case 50: goto L_0x008d;
                case 51: goto L_0x008d;
                case 52: goto L_0x008d;
                case 53: goto L_0x008d;
                case 54: goto L_0x008d;
                case 55: goto L_0x008d;
                case 56: goto L_0x008d;
                case 57: goto L_0x008d;
                case 58: goto L_0x008d;
                case 59: goto L_0x008d;
                case 60: goto L_0x008d;
                case 61: goto L_0x008d;
                case 62: goto L_0x008d;
                case 63: goto L_0x008d;
                case 64: goto L_0x008d;
                case 65: goto L_0x008d;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Missing a section layout for a group id!"
            r13.<init>(r14)
            throw r13
        L_0x0053:
            r1 = 5
            android.support.v7.widget.fo r1 = r2.mo100315b(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.e r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.ui.e
            r2.<init>()
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x0095
        L_0x0062:
            r1 = 2
            android.support.v7.widget.fo r1 = r2.mo100315b(r1)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0095
        L_0x006c:
            android.support.v7.widget.LinearLayoutManager r1 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r2 = r2.f314473a
            r1.<init>(r2)
            r1.setOrientation(r9)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0095
        L_0x007b:
            android.support.v7.widget.LinearLayoutManager r1 = r2.mo100314a(r3)
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.f r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.ui.f
            boolean r3 = r1.getReverseLayout()
            r2.<init>(r3)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x0095
        L_0x008d:
            android.support.v7.widget.LinearLayoutManager r1 = r2.mo100314a(r3)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0095:
            r10.setLayoutManager(r1)
            r1 = 0
            r10.setItemAnimator(r1)
        L_0x009c:
            java.util.ArrayList r1 = r10.mItemDecorations
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            r10.removeItemDecorationAt(r9)
            goto L_0x009c
        L_0x00a8:
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.r r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.ui.r
            r1.<init>(r10)
            r2.ifPresent(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.o r11 = new com.google.android.apps.gsa.staticplugins.opa.tapas.ui.o
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gz r2 = r0.f314484b
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.s r3 = new com.google.android.apps.gsa.staticplugins.opa.tapas.ui.s
            r3.<init>(r12, r13)
            boolean r1 = r0.f314486d
            r4 = 0
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.b r5 = r0.f314487e
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.be r6 = r0.f314488f
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r7 = r0.f314489g
            r0 = r11
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.support.v7.widget.fh r0 = r10.mItemAnimator
            boolean r1 = r0 instanceof android.support.p033v7.widget.C0707ho
            if (r1 == 0) goto L_0x00d4
            android.support.v7.widget.ho r0 = (android.support.p033v7.widget.C0707ho) r0
            r0.f2538m = r9
        L_0x00d4:
            r11.setHasStableIds(r8)
            r10.setAdapter(r11)
            r10.setVisibility(r9)
            goto L_0x00eb
        L_0x00de:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113579v.f314483a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Unknown suggestion section view holder"
            r2 = 27916(0x6d0c, float:3.9119E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x00eb:
            dagger.a r0 = r12.f314450d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.be r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be) r0
            android.view.View r13 = r13.itemView
            com.google.assistant.ad.d.b.ae r14 = r14.f313867a
            int r14 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl.m187571a(r14)
            java.util.Map r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be.f312404a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            boolean r1 = r1.containsKey(r14)
            if (r1 == 0) goto L_0x011b
            com.google.android.libraries.logging.j r1 = new com.google.android.libraries.logging.j
            java.util.Map r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be.f312404a
            java.lang.Object r14 = r2.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r1.<init>(r14)
            com.google.android.libraries.logging.C28295m.m52919e(r13, r1)
        L_0x011b:
            java.util.concurrent.atomic.AtomicBoolean r13 = r0.f312408e
            r13.compareAndSet(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113565h.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C113579v vVar = (C113579v) this.f314449c.mo27525b();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C113564g gVar = C113564g.APPS;
        if (i != gVar.f314445c) {
            gVar = C113564g.DEFAULT;
        }
        View inflate = from.inflate(gVar.f314446d, viewGroup, false);
        if (i == C113564g.APPS.f314445c) {
            return new C113577t(inflate);
        }
        return new C113578u(inflate);
    }
}
