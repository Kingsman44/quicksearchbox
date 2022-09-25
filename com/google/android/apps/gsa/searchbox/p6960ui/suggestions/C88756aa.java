package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.animation.LayoutTransition;
import android.view.ViewTreeObserver;
import com.google.android.libraries.searchbox.shared.response.Response;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.aa */
/* compiled from: PG */
public final class C88756aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    Response f240102a;

    /* renamed from: b */
    public LayoutTransition f240103b;

    /* renamed from: c */
    final /* synthetic */ C88760ae f240104c;

    public C88756aa(C88760ae aeVar) {
        this.f240104c = aeVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017e, code lost:
        if (r6.equals("web.nws") != false) goto L_0x01c9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82481a() {
        /*
            r13 = this;
            com.google.android.libraries.searchbox.shared.response.Response r0 = r13.f240102a
            if (r0 == 0) goto L_0x02a6
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r1 = r13.f240104c
            com.google.android.apps.gsa.shared.s.a.a r2 = r1.f240127g
            boolean r2 = r2.mo84225b()
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "SuggestionsBoxController.onRenderFinished"
            com.google.android.apps.gsa.shared.s.a.a r3 = r1.f240127g
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148695a(r2, r3)
        L_0x0015:
            boolean r2 = r1.mo82499u()
            if (r2 != 0) goto L_0x001d
            goto L_0x0295
        L_0x001d:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.searchbox.ui.a.g r2 = r1.f240123c
            r2.mo82409p(r0)
            com.google.android.libraries.searchbox.shared.response.Response r2 = r1.mo82489k()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x004a
            java.lang.String r6 = r2.f108861a
            java.lang.String r7 = r0.f108861a
            com.google.common.b.gu r2 = r2.f108862b
            int r2 = r2.size()
            com.google.common.b.gu r8 = r0.f108862b
            int r8 = r8.size()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0049
            if (r2 == r8) goto L_0x004a
        L_0x0049:
            r5 = 1
        L_0x004a:
            android.view.ViewGroup r2 = r1.f240135o
            android.content.Context r2 = r2.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r6 = r2.getSystemService(r6)
            android.view.accessibility.AccessibilityManager r6 = (android.view.accessibility.AccessibilityManager) r6
            boolean r7 = r6.isEnabled()
            r8 = 2
            if (r7 == 0) goto L_0x00cd
            if (r5 == 0) goto L_0x00cd
            r5 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r5 = android.view.accessibility.AccessibilityEvent.obtain(r5)
            com.google.common.b.gu r7 = r0.f108862b
            java.util.Iterator r7 = r7.iterator()
            r9 = 0
        L_0x006e:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0081
            java.lang.Object r10 = r7.next()
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r10 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r10
            int r10 = r10.f108914o
            if (r10 != r8) goto L_0x006e
            int r9 = r9 + 1
            goto L_0x006e
        L_0x0081:
            if (r9 != 0) goto L_0x008b
            r7 = 2132090130(0x7f151d12, float:1.9820591E38)
            java.lang.String r7 = r2.getString(r7)
            goto L_0x009e
        L_0x008b:
            android.content.res.Resources r7 = r2.getResources()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10[r4] = r11
            r11 = 2131951681(0x7f130041, float:1.9539783E38)
            java.lang.String r7 = r7.getQuantityString(r11, r9, r10)
        L_0x009e:
            java.util.List r9 = r5.getText()
            r9.add(r7)
            android.view.ViewGroup r7 = r1.f240135o
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r5.setClassName(r7)
            java.lang.String r2 = r2.getPackageName()
            r5.setPackageName(r2)
            android.view.ViewGroup r2 = r1.f240135o
            r5.setSource(r2)
            androidx.core.j.a.r r2 = new androidx.core.j.a.r
            r2.<init>(r5)
            android.view.ViewGroup r7 = r1.f240135o
            android.view.accessibility.AccessibilityRecord r2 = r2.f5926a
            r2.setSource(r7)
            r6.sendAccessibilityEvent(r5)
        L_0x00cd:
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f240128h
            java.lang.String r5 = "displayedResponse"
            r2.mo83174n(r5, r0)
            com.google.common.b.gu r2 = r0.f108862b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00f5
            com.google.common.b.gu r2 = r0.f108862b
            int r2 = r2.size()
            if (r2 != r3) goto L_0x00f3
            com.google.common.b.gu r2 = r0.f108862b
            java.lang.Object r2 = r2.get(r4)
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r2 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r2
            int r2 = r2.f108910k
            r5 = 161(0xa1, float:2.26E-43)
            if (r2 != r5) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r2 = 0
            goto L_0x00f6
        L_0x00f5:
            r2 = 1
        L_0x00f6:
            boolean r5 = r1.f240136p
            if (r5 == 0) goto L_0x0283
            if (r2 == 0) goto L_0x0283
            java.lang.String r2 = r0.f108861a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0278
            com.google.android.apps.gsa.searchbox.ui.suggestions.af r2 = r1.f240137q
            if (r2 != 0) goto L_0x0119
            android.view.ViewGroup r2 = r1.f240135o
            if (r2 == 0) goto L_0x0119
            com.google.android.apps.gsa.searchbox.ui.suggestions.af r2 = new com.google.android.apps.gsa.searchbox.ui.suggestions.af
            android.view.ViewGroup r5 = r1.f240135o
            android.content.Context r5 = r5.getContext()
            r2.<init>(r5)
            r1.f240137q = r2
        L_0x0119:
            com.google.android.apps.gsa.searchbox.ui.suggestions.af r2 = r1.f240137q
            android.view.ViewGroup r5 = r1.f240135o
            java.lang.String r6 = r0.f108865e
            r2.f240151e = r6
            java.util.HashMap r7 = r2.f240148b
            boolean r7 = r7.containsKey(r6)
            r9 = 3
            if (r7 != 0) goto L_0x0250
            android.content.Context r7 = r2.f240147a
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r10 = 2131627031(0x7f0e0c17, float:1.8881315E38)
            android.view.View r7 = r7.inflate(r10, r5, r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r10 = r5
            com.google.android.apps.gsa.shared.ui.SuggestionGridLayout r10 = (com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout) r10
            android.view.ViewGroup$LayoutParams r10 = r10.generateDefaultLayoutParams()
            r11 = r10
            com.google.android.apps.gsa.shared.ui.an r11 = (com.google.android.apps.gsa.shared.p7148ui.C90638an) r11
            r11.f253473b = r4
            r11.f253474c = r4
            r7.setLayoutParams(r10)
            r10 = 2131434257(0x7f0b1b11, float:1.8490323E38)
            android.view.View r10 = r7.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r11 = 2131434258(0x7f0b1b12, float:1.8490325E38)
            android.view.View r11 = r7.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.util.HashMap r12 = r2.f240149c
            r12.put(r6, r10)
            java.util.HashMap r12 = r2.f240150d
            r12.put(r6, r11)
            int r12 = r6.hashCode()
            switch(r12) {
                case -764028567: goto L_0x01be;
                case -763740848: goto L_0x01b4;
                case 101486: goto L_0x01a9;
                case 107868: goto L_0x019f;
                case 117588: goto L_0x0195;
                case 1222272135: goto L_0x018b;
                case 1222272944: goto L_0x0181;
                case 1222284848: goto L_0x0178;
                case 1222292087: goto L_0x016e;
                default: goto L_0x016d;
            }
        L_0x016d:
            goto L_0x01c8
        L_0x016e:
            java.lang.String r8 = "web.vid"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 3
            goto L_0x01c9
        L_0x0178:
            java.lang.String r12 = "web.nws"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x0181:
            java.lang.String r8 = "web.bks"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 5
            goto L_0x01c9
        L_0x018b:
            java.lang.String r8 = "web.app"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 7
            goto L_0x01c9
        L_0x0195:
            java.lang.String r8 = "web"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 1
            goto L_0x01c9
        L_0x019f:
            java.lang.String r8 = "map"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 6
            goto L_0x01c9
        L_0x01a9:
            java.lang.String r8 = "flt"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 8
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r8 = "web.shop"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 4
            goto L_0x01c9
        L_0x01be:
            java.lang.String r8 = "web.isch"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c8
            r8 = 0
            goto L_0x01c9
        L_0x01c8:
            r8 = -1
        L_0x01c9:
            r12 = 2131235091(0x7f081113, float:1.8086366E38)
            switch(r8) {
                case 0: goto L_0x023f;
                case 1: goto L_0x0235;
                case 2: goto L_0x0228;
                case 3: goto L_0x021b;
                case 4: goto L_0x020e;
                case 5: goto L_0x0201;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01e7;
                case 8: goto L_0x01da;
                default: goto L_0x01cf;
            }
        L_0x01cf:
            r10.setImageResource(r12)
            r8 = 2132090143(0x7f151d1f, float:1.9820618E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x01da:
            r8 = 2131234775(0x7f080fd7, float:1.8085725E38)
            r10.setImageResource(r8)
            r8 = 2132086850(0x7f151042, float:1.9813939E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x01e7:
            r8 = 2131234573(0x7f080f0d, float:1.8085316E38)
            r10.setImageResource(r8)
            r8 = 2132083282(0x7f150252, float:1.9806702E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x01f4:
            r8 = 2131235005(0x7f0810bd, float:1.8086192E38)
            r10.setImageResource(r8)
            r8 = 2132089252(0x7f1519a4, float:1.981881E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x0201:
            r8 = 2131234616(0x7f080f38, float:1.8085403E38)
            r10.setImageResource(r8)
            r8 = 2132085470(0x7f150ade, float:1.981114E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x020e:
            r8 = 2131235131(0x7f08113b, float:1.8086447E38)
            r10.setImageResource(r8)
            r8 = 2132092351(0x7f1525bf, float:1.9825096E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x021b:
            r8 = 2131234723(0x7f080fa3, float:1.808562E38)
            r10.setImageResource(r8)
            r8 = 2132093498(0x7f152a3a, float:1.9827422E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x0228:
            r8 = 2131234951(0x7f081087, float:1.8086082E38)
            r10.setImageResource(r8)
            r8 = 2132089618(0x7f151b12, float:1.9819553E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x0235:
            r10.setImageResource(r12)
            r8 = 2132093663(0x7f152adf, float:1.9827757E38)
            r11.setText(r8)
            goto L_0x024b
        L_0x023f:
            r8 = 2131234824(0x7f081008, float:1.8085825E38)
            r10.setImageResource(r8)
            r8 = 2132088370(0x7f151632, float:1.9817022E38)
            r11.setText(r8)
        L_0x024b:
            java.util.HashMap r8 = r2.f240148b
            r8.put(r6, r7)
        L_0x0250:
            int r7 = r2.f240152f
            if (r7 != r3) goto L_0x025f
            java.util.HashMap r3 = r2.f240148b
            java.lang.Object r3 = r3.get(r6)
            android.view.View r3 = (android.view.View) r3
            r5.addView(r3)
        L_0x025f:
            java.util.HashMap r3 = r2.f240149c
            java.lang.Object r3 = r3.get(r6)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.clearAnimation()
            java.util.HashMap r3 = r2.f240150d
            java.lang.Object r3 = r3.get(r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setVisibility(r4)
            r2.f240152f = r9
            goto L_0x0283
        L_0x0278:
            com.google.android.apps.gsa.searchbox.ui.suggestions.af r2 = r1.f240137q
            if (r2 == 0) goto L_0x0283
            android.view.ViewGroup r3 = r1.f240135o
            java.lang.String r4 = r0.f108865e
            r2.mo82501a(r3, r4)
        L_0x0283:
            com.google.android.apps.gsa.searchbox.ui.b r2 = r1.f240121a
            r2.mo44277o(r0)
            com.google.android.apps.gsa.shared.s.a.a r0 = r1.f240127g
            boolean r0 = r0.mo84225b()
            if (r0 == 0) goto L_0x0295
            com.google.android.apps.gsa.shared.s.a.a r0 = r1.f240127g
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148696b(r0)
        L_0x0295:
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r0 = r13.f240104c
            r0.mo82498t()
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r0 = r13.f240104c
            boolean r0 = r0.f240136p
            if (r0 != 0) goto L_0x02a3
            r13.mo82482b()
        L_0x02a3:
            r0 = 0
            r13.f240102a = r0
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88756aa.mo82481a():void");
    }

    /* renamed from: b */
    public final void mo82482b() {
        LayoutTransition layoutTransition = this.f240103b;
        if (layoutTransition != null) {
            this.f240104c.f240135o.setLayoutTransition(layoutTransition);
            this.f240103b = null;
        }
    }

    public final void onGlobalLayout() {
        mo82481a();
    }
}
