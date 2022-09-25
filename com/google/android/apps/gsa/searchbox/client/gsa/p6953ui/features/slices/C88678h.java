package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88750u;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.h */
/* compiled from: PG */
public final class C88678h extends C88728ak implements C89196a, C89204i {

    /* renamed from: a */
    public static final C59071e f239759a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.h");

    /* renamed from: b */
    public final Context f239760b;

    /* renamed from: c */
    public final C88675e f239761c;

    /* renamed from: d */
    public C22871g f239762d;

    /* renamed from: e */
    final Map f239763e = new HashMap();

    /* renamed from: f */
    C88750u f239764f;

    /* renamed from: t */
    private Set f239765t;

    public C88678h(Context context, C88675e eVar) {
        this.f239760b = context;
        this.f239761c = eVar;
    }

    /* renamed from: n */
    private static void m143445n(Suggestion suggestion, int i) {
        C58485gu guVar = suggestion.f108925z;
        Integer valueOf = Integer.valueOf(i);
        if (!guVar.contains(valueOf)) {
            ArrayList arrayList = new ArrayList(suggestion.f108925z);
            arrayList.add(valueOf);
            suggestion.f108925z = C58485gu.m89842j(arrayList);
        }
    }

    /* renamed from: o */
    private final void m143446o() {
        C88683m mVar;
        LiveData liveData;
        if (this.f240013s.f239845B) {
            for (C88682l lVar : this.f239763e.values()) {
                if (!(lVar == null || (mVar = lVar.f239771c) == null || (liveData = mVar.f239775b) == null)) {
                    liveData.mo5679j(mVar);
                }
            }
            this.f239763e.clear();
        }
    }

    /* renamed from: q */
    private final void m143447q(Suggestion suggestion, SliceSuggestionView sliceSuggestionView) {
        SliceView sliceView;
        m143448r(suggestion, sliceSuggestionView);
        String obj = C89235z.m145132d(suggestion).toString();
        String l = C41670aj.m73079l(suggestion);
        RelativeLayout relativeLayout = sliceSuggestionView.f239742c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        C88682l lVar = sliceSuggestionView.f239741b;
        if (lVar == null) {
            sliceView = null;
        } else {
            sliceView = lVar.mo82369b();
        }
        RelativeLayout relativeLayout2 = sliceSuggestionView.f239743d;
        if (sliceView != null) {
            sliceView.setVisibility(8);
        }
        relativeLayout2.setVisibility(0);
        TextView textView = (TextView) relativeLayout2.getChildAt(1);
        ((TextView) relativeLayout2.getChildAt(0)).setText(obj);
        if (TextUtils.isEmpty(l)) {
            textView.setVisibility(8);
        } else {
            textView.setText(l);
            textView.setVisibility(0);
        }
        sliceSuggestionView.f239744e = true;
        m143445n(suggestion, 326);
    }

    /* renamed from: r */
    private final void m143448r(Suggestion suggestion, C88803an anVar) {
        anVar.mo82349c(0).mo82564g(C41670aj.m73072e(suggestion), C41670aj.m73081n(suggestion), this.f240008n);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 156;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 55;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return "A slice of an app relevant to your query";
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final void mo82223g(C22871g gVar) {
        this.f239762d = gVar;
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        m143446o();
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (((SliceSuggestionView) anVar).f239744e) {
            this.f240011q.mo82469z(true != suggestion.f108925z.contains(286) ? R.string.regular_app_result_suggestion_message : R.string.regular_app_suggestion_message, (Suggestion) null, false);
            return true;
        }
        if (this.f239764f == null) {
            this.f239764f = new C88750u(this.f239760b, this.f240007m);
        }
        this.f239764f.mo82479a(suggestion, anVar, (Integer) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        if (r9 >= r10.f108949e) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        if (r5.length() < r7) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        m143447q(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c  */
    /* renamed from: hI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r12, com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an r13) {
        /*
            r11 = this;
            r0 = r13
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.SliceSuggestionView r0 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.SliceSuggestionView) r0
            android.widget.RelativeLayout r1 = r0.f239743d
            r2 = 8
            r1.setVisibility(r2)
            r3 = 0
            android.view.View r4 = r1.getChildAt(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = ""
            r4.setText(r5)
            r4 = 1
            android.view.View r1 = r1.getChildAt(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r5)
            r0.f239744e = r3
            java.lang.String r1 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73080m(r12)
            java.util.Set r5 = r11.f239765t
            if (r5 != 0) goto L_0x0043
            com.google.android.apps.gsa.searchbox.ui.j r5 = r11.f240013s
            java.lang.String[] r5 = r5.f239848E
            if (r5 != 0) goto L_0x0038
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r11.f239765t = r5
            goto L_0x0043
        L_0x0038:
            java.util.HashSet r6 = new java.util.HashSet
            java.util.List r5 = java.util.Arrays.asList(r5)
            r6.<init>(r5)
            r11.f239765t = r6
        L_0x0043:
            java.util.Set r5 = r11.f239765t
            boolean r5 = r5.contains(r1)
            r6 = 300(0x12c, float:4.2E-43)
            if (r5 == 0) goto L_0x0060
            com.google.common.b.gu r13 = r12.f108925z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r13 = r13.contains(r1)
            if (r13 == 0) goto L_0x005a
            return r3
        L_0x005a:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.m143447q(r12, r0)
            return r4
        L_0x0060:
            com.google.android.apps.gsa.searchbox.ui.g r5 = r11.f240009o
            java.lang.CharSequence r5 = r5.mo82429a()
            java.lang.String r5 = r5.toString()
            java.util.Map r7 = r11.f239763e
            boolean r7 = r7.containsKey(r1)
            if (r7 != 0) goto L_0x00a2
            java.util.Map r13 = r11.f239763e
            r2 = 0
            r13.put(r1, r2)
            com.google.android.libraries.gsa.k.g r13 = r11.f239762d
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.f r2 = new com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.f
            r2.<init>(r11, r1, r12, r5)
            java.lang.String r1 = "asyncRenderSlice"
            com.google.common.util.concurrent.cx r13 = r13.mo28207g(r1, r2)
            com.google.android.libraries.gsa.k.g r1 = r11.f239762d
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.g r2 = new com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.g
            r2.<init>()
            java.lang.String r5 = "asyncRenderSliceCallback"
            r1.mo28211k(r13, r5, r2)
            com.google.common.b.gu r13 = r12.f108925z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r13 = r13.contains(r1)
            if (r13 == 0) goto L_0x009e
            return r3
        L_0x009e:
            r11.m143447q(r12, r0)
            return r4
        L_0x00a2:
            java.util.Map r7 = r11.f239763e
            java.lang.Object r1 = r7.get(r1)
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.l r1 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88682l) r1
            com.google.common.b.gu r7 = r12.f108925z
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x00b7
            return r3
        L_0x00b7:
            if (r1 == 0) goto L_0x01fb
            androidx.slice.widget.SliceView r6 = r1.mo82369b()
            if (r6 == 0) goto L_0x01fb
            androidx.slice.Slice r6 = r6.f13200g
            if (r6 == 0) goto L_0x01fb
            int r6 = r1.f239772d
            r7 = 4
            if (r6 != r7) goto L_0x00ca
            goto L_0x01fb
        L_0x00ca:
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.m r6 = r1.f239771c
            r6.f239776c = r12
            r6.mo82371d()
            r6.mo82370c(r5)
            com.google.android.apps.gsa.searchbox.ui.j r7 = r11.f240013s
            int r7 = r7.f239847D
            boolean r8 = r6.mo82372e()
            java.lang.String r9 = "com.android.settings"
            java.lang.String r10 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73076i(r12)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0109
            java.lang.String r9 = "wi"
            boolean r9 = com.google.common.base.C58890d.m90990e(r9, r5)
            if (r9 != 0) goto L_0x0115
            java.lang.String r9 = "nfc"
            boolean r9 = com.google.common.base.C58890d.m90990e(r9, r5)
            if (r9 == 0) goto L_0x00f9
            goto L_0x0115
        L_0x00f9:
            int r9 = r5.length()
            com.google.android.libraries.searchbox.shared.suggestion.e r10 = r12.f108907B
            com.google.android.libraries.searchbox.shared.suggestion.ag r10 = r10.f109016j
            if (r10 != 0) goto L_0x0105
            com.google.android.libraries.searchbox.shared.suggestion.ag r10 = com.google.android.libraries.searchbox.shared.suggestion.C41667ag.f108943h
        L_0x0105:
            int r10 = r10.f108949e
            if (r9 < r10) goto L_0x0111
        L_0x0109:
            if (r8 == 0) goto L_0x0115
            int r5 = r5.length()
            if (r5 >= r7) goto L_0x0115
        L_0x0111:
            r11.m143447q(r12, r0)
            return r4
        L_0x0115:
            boolean r5 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73083p(r12)
            if (r5 == 0) goto L_0x012c
            androidx.slice.widget.SliceView r5 = r6.f239774a
            androidx.slice.Slice r5 = r5.f13200g
            boolean r5 = r6.mo82373f(r5)
            if (r5 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.m143447q(r12, r0)
            return r4
        L_0x012c:
            android.widget.RelativeLayout r5 = r1.f239770b
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.l r6 = r0.f239741b
            if (r6 != r1) goto L_0x0149
            int r0 = r5.getVisibility()
            if (r0 != r2) goto L_0x01f0
            r11.m143448r(r12, r13)
            r5.setVisibility(r3)
            androidx.slice.widget.SliceView r13 = r1.mo82369b()
            if (r13 == 0) goto L_0x01f0
            r13.setVisibility(r3)
            goto L_0x01f0
        L_0x0149:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.m143448r(r12, r13)
            r0.mo82355e()
            r0.f239741b = r1
            android.widget.RelativeLayout r13 = r1.f239770b
            r0.f239742c = r13
            android.widget.RelativeLayout r13 = r0.f239742c
            android.view.ViewParent r13 = r13.getParent()
            if (r13 == 0) goto L_0x016a
            android.widget.RelativeLayout r13 = r0.f239742c
            android.view.ViewParent r13 = r13.getParent()
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.SliceSuggestionView r13 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.SliceSuggestionView) r13
            r13.mo82355e()
        L_0x016a:
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r6 = -2
            r13.<init>(r5, r6)
            android.content.Context r5 = r0.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131172123(0x7f071b1b, float:1.7958652E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r13.setMarginEnd(r5)
            r5 = 15
            r13.addRule(r5)
            r5 = 17
            r6 = 2131435964(0x7f0b21bc, float:1.8493785E38)
            r13.addRule(r5, r6)
            android.widget.RelativeLayout r5 = r0.f239742c
            if (r5 == 0) goto L_0x019b
            boolean r6 = r0.f239744e
            if (r6 != 0) goto L_0x019b
            r5.setVisibility(r3)
        L_0x019b:
            android.widget.RelativeLayout r5 = r0.f239742c
            r0.addView(r5, r13)
            androidx.slice.widget.SliceView r13 = r1.mo82369b()
            int r5 = r1.f239772d
            boolean r5 = com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88682l.m143464c(r5)
            java.lang.String r6 = "sb.u.SliceSugView"
            if (r5 == 0) goto L_0x01d0
            android.widget.RelativeLayout r0 = r1.mo82368a()
            if (r0 != 0) goto L_0x01c7
            com.google.common.f.e r13 = com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.SliceSuggestionView.f239740a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r6)
            java.lang.String r0 = "Error layout was not available while slice view component was in error state."
            r1 = 9887(0x269f, float:1.3855E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            goto L_0x01f0
        L_0x01c7:
            r0.setVisibility(r3)
            if (r13 == 0) goto L_0x01f0
            r13.setVisibility(r2)
            goto L_0x01f0
        L_0x01d0:
            if (r13 != 0) goto L_0x01e5
            com.google.common.f.e r13 = com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.SliceSuggestionView.f239740a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r6)
            java.lang.String r0 = "Set a slice view component with no slice to be shown."
            r1 = 9886(0x269e, float:1.3853E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            goto L_0x01f0
        L_0x01e5:
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.i r1 = new com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.i
            r1.<init>(r0)
            r13.setOnLongClickListener(r1)
            r13.setVisibility(r3)
        L_0x01f0:
            r13 = 325(0x145, float:4.55E-43)
            m143445n(r12, r13)
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.e r13 = r11.f239761c
            r13.mo82365h(r12)
            return r4
        L_0x01fb:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.m143447q(r12, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88678h.mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.searchbox.ui.suggestions.views.an):boolean");
    }

    /* renamed from: i */
    public final void mo82227i() {
        m143446o();
    }
}
