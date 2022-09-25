package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91201bf;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import dagger.C68214a;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.d */
/* compiled from: PG */
final class C112801d implements C113342cm {

    /* renamed from: c */
    private static final C59071e f312637c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.d");

    /* renamed from: a */
    public final C107662av f312638a;

    /* renamed from: b */
    public final C112913hd f312639b;

    /* renamed from: d */
    private final Context f312640d;

    /* renamed from: e */
    private final l f312641e;

    /* renamed from: f */
    private final C91201bf f312642f;

    /* renamed from: g */
    private final C91189au f312643g;

    /* renamed from: h */
    private final C112794ct f312644h;

    /* renamed from: i */
    private final C112694be f312645i;

    /* renamed from: j */
    private final C68214a f312646j;

    public C112801d(Context context, l lVar, C91201bf bfVar, C91189au auVar, C112794ct ctVar, C112694be beVar, C68214a aVar, C107662av avVar, C112913hd hdVar) {
        this.f312640d = context;
        this.f312641e = lVar;
        this.f312642f = bfVar;
        this.f312643g = auVar;
        this.f312644h = ctVar;
        this.f312645i = beVar;
        this.f312646j = aVar;
        this.f312638a = avVar;
        this.f312639b = hdVar;
    }

    /* renamed from: j */
    private final TextView m186691j(List list) {
        TextView textView = new TextView(this.f312640d);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context context = this.f312640d;
        textView.setText(C88767al.m143943e(list, context, context.getResources(), false));
        m186692k(textView, C88767al.m143941c(list));
        m186692k(textView, 2);
        return textView;
    }

    /* renamed from: k */
    private static void m186692k(TextView textView, int i) {
        if (i > 0) {
            textView.setSingleLine(false);
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.answer_suggestion_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97538;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112774c(view, new C112720a(this));
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C59529cz a = this.f312644h.mo99739a(2, ezVar, esVar, Optional.m71637of(Arrays.asList(new Integer[]{26673})));
        this.f312645i.mo99653d(ghVar.itemView);
        String L = ezVar.mo100199L();
        if (!TextUtils.isEmpty(L)) {
            C59568x xVar = (C59568x) C59569y.f158066g.createBuilder();
            int length = esVar.mo100118a().mo100033p().length();
            xVar.copyOnWrite();
            C59569y yVar = (C59569y) xVar.instance;
            yVar.f158068a = 1 | yVar.f158068a;
            yVar.f158069b = length;
            String num = Integer.toString(ezVar.mo100211k().f125915O);
            xVar.copyOnWrite();
            C59569y yVar2 = (C59569y) xVar.instance;
            num.getClass();
            yVar2.f158068a = 2 | yVar2.f158068a;
            yVar2.f158070c = num;
            C59450aa aaVar = (C59450aa) esVar.mo100125g().orElse(C59450aa.f157704d);
            xVar.copyOnWrite();
            C59569y yVar3 = (C59569y) xVar.instance;
            aaVar.getClass();
            yVar3.f158072e = aaVar;
            yVar3.f158068a |= 32;
            this.f312641e.b(L, C58833ax.m90833j(this.f312645i.mo99650a().orElse(null)), C58833ax.m90833j(Optional.m71637of((C59569y) xVar.build()).orElse(null)), C58833ax.m90833j(Optional.m71637of(a).orElse(null)));
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312646j.mo27525b()).mo99774b(ezVar, view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0150 A[Catch:{ JSONException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0152 A[Catch:{ JSONException -> 0x0192 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99686h(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es r17, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez r18, android.support.p033v7.widget.C0673gh r19, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r19
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.c r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112774c) r2
            android.view.View r0 = r2.itemView
            j$.util.Optional r0 = r18.mo100217q()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x01a7
            android.widget.LinearLayout r0 = r2.f312591a     // Catch:{ JSONException -> 0x0192 }
            r0.removeAllViews()     // Catch:{ JSONException -> 0x0192 }
            j$.util.Optional r0 = r18.mo100217q()     // Catch:{ JSONException -> 0x0192 }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x0192 }
            com.google.at.h.d.a.d r0 = (com.google.p4017at.p4060h.p4073d.p4074a.C54240d) r0     // Catch:{ JSONException -> 0x0192 }
            java.lang.String r0 = r0.f142412b     // Catch:{ JSONException -> 0x0192 }
            android.widget.LinearLayout r3 = r2.f312591a     // Catch:{ JSONException -> 0x0192 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0192 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0192 }
            org.json.JSONArray r0 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143949k(r4)     // Catch:{ JSONException -> 0x0192 }
            r4 = 0
            r5 = 0
        L_0x0030:
            int r6 = r0.length()     // Catch:{ JSONException -> 0x0192 }
            r7 = 1
            if (r5 >= r6) goto L_0x0168
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x0192 }
            org.json.JSONObject r6 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143950l(r0, r5)     // Catch:{ JSONException -> 0x0192 }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x0192 }
            android.content.Context r9 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            r8.<init>(r9)     // Catch:{ JSONException -> 0x0192 }
            r8.setOrientation(r4)     // Catch:{ JSONException -> 0x0192 }
            r8.setDuplicateParentStateEnabled(r7)     // Catch:{ JSONException -> 0x0192 }
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0192 }
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)     // Catch:{ JSONException -> 0x0192 }
            r8.setLayoutParams(r9)     // Catch:{ JSONException -> 0x0192 }
            r3.addView(r8)     // Catch:{ JSONException -> 0x0192 }
            java.lang.String r9 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143945g(r6)     // Catch:{ JSONException -> 0x0192 }
            int r10 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143939a(r6)     // Catch:{ JSONException -> 0x0192 }
            int r11 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143940b(r6)     // Catch:{ JSONException -> 0x0192 }
            if (r9 == 0) goto L_0x0117
            android.widget.ImageView r12 = new android.widget.ImageView     // Catch:{ JSONException -> 0x0192 }
            android.content.Context r13 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x0192 }
            r13 = 5
            r14 = 2131165636(0x7f0701c4, float:1.7945495E38)
            r15 = 2131165637(0x7f0701c5, float:1.7945497E38)
            if (r11 == r13) goto L_0x00b3
            android.content.Context r11 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ JSONException -> 0x0192 }
            r13 = 2131165639(0x7f0701c7, float:1.79455E38)
            int r11 = r11.getDimensionPixelSize(r13)     // Catch:{ JSONException -> 0x0192 }
            android.content.Context r13 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            android.content.res.Resources r13 = r13.getResources()     // Catch:{ JSONException -> 0x0192 }
            r7 = 2131165634(0x7f0701c2, float:1.794549E38)
            int r7 = r13.getDimensionPixelSize(r7)     // Catch:{ JSONException -> 0x0192 }
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0192 }
            r13.<init>(r11, r7)     // Catch:{ JSONException -> 0x0192 }
            android.content.Context r7 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ JSONException -> 0x0192 }
            int r7 = r7.getDimensionPixelSize(r15)     // Catch:{ JSONException -> 0x0192 }
            if (r10 != 0) goto L_0x00a2
            r11 = 0
            goto L_0x00ac
        L_0x00a2:
            android.content.Context r11 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ JSONException -> 0x0192 }
            int r11 = r11.getDimensionPixelSize(r14)     // Catch:{ JSONException -> 0x0192 }
        L_0x00ac:
            r13.setMargins(r11, r4, r7, r4)     // Catch:{ JSONException -> 0x0192 }
            r12.setLayoutParams(r13)     // Catch:{ JSONException -> 0x0192 }
            goto L_0x00f4
        L_0x00b3:
            android.content.Context r7 = r1.f312640d     // Catch:{ JSONException -> 0x0192 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ JSONException -> 0x0192 }
            r11 = 2131165640(0x7f0701c8, float:1.7945503E38)
            int r11 = r7.getDimensionPixelSize(r11)     // Catch:{ JSONException -> 0x0192 }
            r13 = 2131165635(0x7f0701c3, float:1.7945493E38)
            int r13 = r7.getDimensionPixelSize(r13)     // Catch:{ JSONException -> 0x0192 }
            boolean r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148875g()     // Catch:{ JSONException -> 0x0192 }
            r14 = 1
            if (r14 == r4) goto L_0x00d1
            r4 = 1119092736(0x42b40000, float:90.0)
            goto L_0x00d3
        L_0x00d1:
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x00d3:
            r12.setRotation(r4)     // Catch:{ JSONException -> 0x0192 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0192 }
            r4.<init>(r11, r13)     // Catch:{ JSONException -> 0x0192 }
            int r11 = r7.getDimensionPixelSize(r15)     // Catch:{ JSONException -> 0x0192 }
            r13 = 2131165636(0x7f0701c4, float:1.7945495E38)
            int r13 = r7.getDimensionPixelSize(r13)     // Catch:{ JSONException -> 0x0192 }
            r14 = 2131165638(0x7f0701c6, float:1.7945499E38)
            int r7 = r7.getDimensionPixelSize(r14)     // Catch:{ JSONException -> 0x0192 }
            r14 = 0
            r4.setMargins(r13, r7, r11, r14)     // Catch:{ JSONException -> 0x0192 }
            r12.setLayoutParams(r4)     // Catch:{ JSONException -> 0x0192 }
        L_0x00f4:
            boolean r4 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143951m(r9)     // Catch:{ JSONException -> 0x0192 }
            if (r4 != 0) goto L_0x0100
            java.lang.String r4 = "https:"
            java.lang.String r9 = r4.concat(r9)     // Catch:{ JSONException -> 0x0192 }
        L_0x0100:
            com.google.android.apps.gsa.shared.y.au r4 = r1.f312643g     // Catch:{ JSONException -> 0x0192 }
            com.google.android.apps.gsa.shared.y.bf r7 = r1.f312642f     // Catch:{ JSONException -> 0x0192 }
            android.net.Uri r7 = r7.mo85474b(r9)     // Catch:{ JSONException -> 0x0192 }
            com.google.common.util.concurrent.cx r7 = r4.mo85417d(r7)     // Catch:{ JSONException -> 0x0192 }
            java.lang.String r9 = "AnswerResultRenderer.ImageCallback"
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.b r11 = new com.google.android.apps.gsa.staticplugins.opa.tapas.m.b     // Catch:{ JSONException -> 0x0192 }
            r11.<init>(r12)     // Catch:{ JSONException -> 0x0192 }
            r4.mo85428r(r7, r9, r11)     // Catch:{ JSONException -> 0x0192 }
            goto L_0x0118
        L_0x0117:
            r12 = 0
        L_0x0118:
            java.util.List r4 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143948j(r6)     // Catch:{ JSONException -> 0x0192 }
            boolean r7 = r4.isEmpty()     // Catch:{ JSONException -> 0x0192 }
            if (r7 != 0) goto L_0x0154
            if (r10 == 0) goto L_0x0147
            int r7 = r4.size()     // Catch:{ JSONException -> 0x0192 }
            if (r10 < r7) goto L_0x012b
            goto L_0x0147
        L_0x012b:
            r7 = 0
            java.util.List r9 = r4.subList(r7, r10)     // Catch:{ JSONException -> 0x0192 }
            int r7 = r4.size()     // Catch:{ JSONException -> 0x0192 }
            java.util.List r4 = r4.subList(r10, r7)     // Catch:{ JSONException -> 0x0192 }
            android.widget.TextView r7 = r1.m186691j(r9)     // Catch:{ JSONException -> 0x0192 }
            r8.addView(r7)     // Catch:{ JSONException -> 0x0192 }
            android.widget.TextView r4 = r1.m186691j(r4)     // Catch:{ JSONException -> 0x0192 }
            r8.addView(r4)     // Catch:{ JSONException -> 0x0192 }
            goto L_0x014e
        L_0x0147:
            android.widget.TextView r4 = r1.m186691j(r4)     // Catch:{ JSONException -> 0x0192 }
            r8.addView(r4)     // Catch:{ JSONException -> 0x0192 }
        L_0x014e:
            if (r10 != 0) goto L_0x0152
            r7 = 0
            goto L_0x0155
        L_0x0152:
            r7 = 1
            goto L_0x0155
        L_0x0154:
            r7 = r10
        L_0x0155:
            if (r12 == 0) goto L_0x015a
            r8.addView(r12, r7)     // Catch:{ JSONException -> 0x0192 }
        L_0x015a:
            java.lang.String r4 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143944f(r6)     // Catch:{ JSONException -> 0x0192 }
            if (r4 == 0) goto L_0x0163
            r8.setContentDescription(r4)     // Catch:{ JSONException -> 0x0192 }
        L_0x0163:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x0030
        L_0x0168:
            android.widget.LinearLayout r0 = r2.f312591a     // Catch:{ JSONException -> 0x0192 }
            r3 = 0
            r0.setVisibility(r3)     // Catch:{ JSONException -> 0x0192 }
            com.google.android.apps.gsa.staticplugins.opa.ay.av r0 = r1.f312638a     // Catch:{ JSONException -> 0x0192 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_ANSWER_CARD_SHOWN     // Catch:{ JSONException -> 0x0192 }
            r0.mo96205a(r3)     // Catch:{ JSONException -> 0x0192 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.hd r4 = r1.f312639b     // Catch:{ JSONException -> 0x0192 }
            java.lang.String r5 = "Track Answer Card attention"
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]     // Catch:{ JSONException -> 0x0192 }
            r3 = 26673(0x6831, float:3.7377E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x0192 }
            r6 = 0
            r0[r6] = r3     // Catch:{ JSONException -> 0x0192 }
            r6 = 3
            java.util.List r7 = java.util.Arrays.asList(r0)     // Catch:{ JSONException -> 0x0192 }
            r8 = r17
            r9 = r18
            r4.mo99780b(r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0192 }
            return
        L_0x0192:
            r0 = move-exception
            com.google.common.f.e r3 = f312637c
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "AnswerResultRenderer"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Render answer card error"
            r5 = 27758(0x6c6e, float:3.8897E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x01a7:
            android.widget.LinearLayout r0 = r2.f312591a
            r2 = 8
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112801d.mo99686h(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez, android.support.v7.widget.gh, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g):void");
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
