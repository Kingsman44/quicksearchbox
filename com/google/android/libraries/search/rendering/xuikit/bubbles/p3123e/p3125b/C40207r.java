package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import android.view.View;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40367t;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.r */
/* compiled from: PG */
public final class C40207r implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C40208s f105638a;

    public C40207r(C40208s sVar) {
        this.f105638a = sVar;
    }

    /* renamed from: d */
    private final boolean m69812d(C57784p pVar, String str) {
        if (pVar == null) {
            C59052c cVar = (C59052c) C40208s.f105639a.mo56225c();
            cVar.mo56378ag(C40364q.f106014a, this.f105638a.f105646h.mo42422a());
            C61301b a = C40367t.m70035a(str);
            cVar.mo56379ah(new C59094n(53284));
            cVar.mo56389s("XBlend response does not contain an ElementsOutput for %s", a);
            return false;
        } else if ((pVar.f154384a & 1) != 0) {
            return true;
        } else {
            C59052c cVar2 = (C59052c) C40208s.f105639a.mo56225c();
            cVar2.mo56378ag(C40364q.f106014a, this.f105638a.f105646h.mo42422a());
            C61301b a2 = C40367t.m70035a(str);
            cVar2.mo56379ah(new C59094n(53283));
            cVar2.mo56389s("XBlend response ElementsOutput does not contain an Element tree for %s", a2);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C40208s.f105639a.mo56226d()).mo56382g(th);
        cVar.mo56378ag(C40364q.f106014a, this.f105638a.f105646h.mo42422a());
        cVar.mo56379ah(new C59094n(53282));
        cVar.mo56386p("Error fetching remote content");
        C40208s.m69817j(this.f105638a);
        C40208s.m69818l(this.f105638a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo18078b(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.bv.j.b.b.x r8 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57827x) r8
            java.lang.String r0 = "response"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40208s.m69817j(r0)
            int r0 = r8.f154502b
            r1 = 3
            if (r0 != r1) goto L_0x0016
            java.lang.Object r0 = r8.f154503c
            com.google.bv.j.b.b.ah r0 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah) r0
            goto L_0x0018
        L_0x0016:
            com.google.bv.j.b.b.ah r0 = com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah.f154429f
        L_0x0018:
            java.lang.String r2 = "response.bubbleResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.lang.String r3 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            int r4 = r0.f154431a
            r5 = 1
            r4 = r4 & r5
            r6 = 0
            if (r4 == 0) goto L_0x0030
            com.google.bv.j.b.a.p r0 = r0.f154432b
            if (r0 != 0) goto L_0x0031
            com.google.bv.j.b.a.p r0 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f
            goto L_0x0031
        L_0x0030:
            r0 = r6
        L_0x0031:
            java.lang.String r4 = "CollapsedBubble"
            boolean r0 = r7.m69812d(r0, r4)
            if (r0 == 0) goto L_0x010a
            int r0 = r8.f154502b
            if (r0 != r1) goto L_0x0042
            java.lang.Object r0 = r8.f154503c
            com.google.bv.j.b.b.ah r0 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah) r0
            goto L_0x0044
        L_0x0042:
            com.google.bv.j.b.b.ah r0 = com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah.f154429f
        L_0x0044:
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            int r2 = r0.f154431a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0056
            com.google.bv.j.b.a.p r6 = r0.f154433c
            if (r6 != 0) goto L_0x0056
            com.google.bv.j.b.a.p r6 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f
        L_0x0056:
            java.lang.String r0 = "ExpandedBubble"
            boolean r0 = r7.m69812d(r6, r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x010a
        L_0x0060:
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.l r2 = r0.f105652n
            com.google.android.libraries.search.rendering.xuikit.bubbles.c.d r0 = r0.f105651m
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.d r0 = r2.mo42357a(r0)
            if (r0 == 0) goto L_0x006e
            r0.f105673c = r5
        L_0x006e:
            int r0 = r8.f154502b
            if (r0 != r1) goto L_0x0077
            java.lang.Object r0 = r8.f154503c
            com.google.bv.j.b.b.ah r0 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah) r0
            goto L_0x0079
        L_0x0077:
            com.google.bv.j.b.b.ah r0 = com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah.f154429f
        L_0x0079:
            int r0 = r0.f154431a
            r2 = 8
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00e6
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.l r3 = r0.f105652n
            com.google.android.libraries.search.rendering.xuikit.bubbles.c.d r0 = r0.f105651m
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.d r0 = r3.mo42357a(r0)
            if (r0 == 0) goto L_0x00e6
            int r3 = r8.f154502b
            if (r3 != r1) goto L_0x0095
            java.lang.Object r3 = r8.f154503c
            com.google.bv.j.b.b.ah r3 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah) r3
            goto L_0x0097
        L_0x0095:
            com.google.bv.j.b.b.ah r3 = com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah.f154429f
        L_0x0097:
            com.google.bv.j.b.b.ad r3 = r3.f154435e
            if (r3 != 0) goto L_0x009d
            com.google.bv.j.b.b.ad r3 = com.google.p4283bv.p4380j.p4385b.p4411b.C57800ad.f154417d
        L_0x009d:
            com.google.bv.j.b.b.ad r4 = r0.f105671a
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00e6
            r0.f105671a = r3
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.e r0 = r0.f105674d
            java.lang.String r4 = r3.f154419a
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00c8
            boolean r5 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40231l.m69857a(r4)
            if (r5 != 0) goto L_0x00c8
            r5 = r0
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.ak r5 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak) r5
            com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView r5 = r5.f105518y
            r6 = 2131429398(0x7f0b0816, float:1.8480468E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.Button r5 = (android.widget.Button) r5
            r5.setText(r4)
        L_0x00c8:
            java.lang.String r3 = r3.f154420b
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00e6
            boolean r4 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40231l.m69857a(r3)
            if (r4 != 0) goto L_0x00e6
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.ak r0 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak) r0
            com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView r0 = r0.f105518y
            r4 = 2131430989(0x7f0b0e4d, float:1.8483695E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.Button r0 = (android.widget.Button) r0
            r0.setText(r3)
        L_0x00e6:
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.n r3 = r0.f105642d
            android.view.View r3 = r3.requireView()
            java.lang.String r4 = "fragment.requireView()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r4 = 2131437249(0x7f0b26c1, float:1.8496391E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00ff
            r3.setVisibility(r2)
        L_0x00ff:
            android.view.View r0 = r0.mo42312a()
            if (r0 == 0) goto L_0x010f
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x010f
        L_0x010a:
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40208s.m69818l(r0)
        L_0x010f:
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.s r0 = r7.f105638a
            com.google.android.libraries.search.rendering.xuikit.bubbles.l r2 = r0.f105652n
            com.google.android.libraries.search.rendering.xuikit.bubbles.c.d r0 = r0.f105651m
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.d r0 = r2.mo42357a(r0)
            if (r0 == 0) goto L_0x013b
            int r2 = r8.f154502b
            if (r2 != r1) goto L_0x0124
            java.lang.Object r8 = r8.f154503c
            com.google.bv.j.b.b.ah r8 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah) r8
            goto L_0x0126
        L_0x0124:
            com.google.bv.j.b.b.ah r8 = com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah.f154429f
        L_0x0126:
            com.google.bv.j.b.b.af r8 = r8.f154434d
            if (r8 != 0) goto L_0x012c
            com.google.bv.j.b.b.af r8 = com.google.p4283bv.p4380j.p4385b.p4411b.C57802af.f154423d
        L_0x012c:
            com.google.bv.j.b.b.af r1 = r0.f105672b
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x013b
            r0.f105672b = r8
            com.google.android.libraries.search.rendering.xuikit.bubbles.e.d.e r0 = r0.f105674d
            r0.mo42279j(r8)
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40207r.mo18078b(java.lang.Object):void");
    }

    /* renamed from: c */
    public final void mo18079c() {
        C40208s sVar = this.f105638a;
        View requireView = sVar.f105642d.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        View a = sVar.mo42312a();
        if (a != null) {
            a.setVisibility(8);
        }
        View findViewById = requireView.findViewById(R.id.xbubble_fragment_indicators_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ProgressBar i = C40208s.m69816i(requireView);
        if (i != null) {
            i.setVisibility(0);
        }
    }
}
