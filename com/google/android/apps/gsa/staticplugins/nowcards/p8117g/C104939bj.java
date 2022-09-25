package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9241dw;
import com.google.android.apps.p489g.p494d.C9243dy;
import com.google.android.apps.p489g.p494d.C9244dz;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C8057ty;
import com.google.p375ai.p378b.C8063ud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bj */
/* compiled from: PG */
public final class C104939bj extends C104348l {

    /* renamed from: A */
    private final C105070g f292414A;

    /* renamed from: y */
    private LayoutInflater f292415y;

    /* renamed from: z */
    private C105069f f292416z;

    public C104939bj(Context context, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292414A = gVar;
    }

    /* renamed from: L */
    private final float m173980L(float f) {
        return TypedValue.applyDimension(1, (float) ((int) f), this.f290307b.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0286 A[SYNTHETIC] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.widget.TableRow m173981M(com.google.android.apps.p489g.p494d.C9243dy r19, boolean r20, int r21, boolean r22, com.google.p375ai.p378b.C8057ty[] r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r23
            android.widget.TableRow r4 = new android.widget.TableRow
            android.content.Context r5 = r0.f290307b
            r4.<init>(r5)
            boolean r5 = r1.f31960h
            if (r5 == 0) goto L_0x0018
            r5 = 16
            r4.setGravity(r5)
        L_0x0018:
            int r5 = r1.f31953a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x0023
            int r5 = r1.f31961i
            r4.setBackgroundColor(r5)
        L_0x0023:
            r5 = 0
            if (r3 != 0) goto L_0x0028
            r6 = 0
            goto L_0x0029
        L_0x0028:
            int r6 = r3.length
        L_0x0029:
            com.google.protobuf.cq r7 = r1.f31954b
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
            r9 = 0
            r10 = 1
        L_0x0032:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0292
            java.lang.Object r11 = r7.next()
            com.google.android.apps.g.d.dw r11 = (com.google.android.apps.p489g.p494d.C9241dw) r11
            int r12 = r11.f31944a
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0049
            int r13 = r11.f31947d
            int r13 = r13 + -1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r20 == 0) goto L_0x0091
            r12 = r12 & 1
            if (r12 == 0) goto L_0x0091
            com.google.protobuf.bn r12 = r11.toBuilder()
            com.google.android.apps.g.d.dv r12 = (com.google.android.apps.p489g.p494d.C9240dv) r12
            com.google.ai.b.lb r11 = r11.f31945b
            if (r11 != 0) goto L_0x005c
            com.google.ai.b.lb r11 = com.google.p375ai.p378b.C7818lb.f27416n
        L_0x005c:
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.ai.b.kw r11 = (com.google.p375ai.p378b.C7812kw) r11
            com.google.ai.b.la r14 = com.google.p375ai.p378b.C7817la.TABULAR_HEADER_NO_TITLE
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.ai.b.lb r15 = (com.google.p375ai.p378b.C7818lb) r15
            int r14 = r14.f27415aP
            r15.f27420c = r14
            int r14 = r15.f27418a
            r14 = r14 | r8
            r15.f27418a = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.android.apps.g.d.dw r14 = (com.google.android.apps.p489g.p494d.C9241dw) r14
            com.google.protobuf.bv r11 = r11.build()
            com.google.ai.b.lb r11 = (com.google.p375ai.p378b.C7818lb) r11
            r11.getClass()
            r14.f31945b = r11
            int r11 = r14.f31944a
            r11 = r11 | r8
            r14.f31944a = r11
            com.google.protobuf.bv r11 = r12.build()
            com.google.android.apps.g.d.dw r11 = (com.google.android.apps.p489g.p494d.C9241dw) r11
        L_0x0091:
            r12 = 2131626659(0x7f0e0aa3, float:1.888056E38)
            if (r2 != 0) goto L_0x00b4
            int r14 = r11.f31944a
            r14 = r14 & r8
            if (r14 == 0) goto L_0x00a8
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r12 = r0.f292416z
            com.google.ai.b.lb r11 = r11.f31945b
            if (r11 != 0) goto L_0x00a3
            com.google.ai.b.lb r11 = com.google.p375ai.p378b.C7818lb.f27416n
        L_0x00a3:
            android.widget.TextView r11 = r12.mo94515g(r11, r4)
            goto L_0x00b0
        L_0x00a8:
            android.view.LayoutInflater r11 = r0.f292415y
            android.view.View r11 = r11.inflate(r12, r4, r5)
            android.widget.TextView r11 = (android.widget.TextView) r11
        L_0x00b0:
            r17 = r7
            goto L_0x01f6
        L_0x00b4:
            int r14 = r11.f31944a
            r14 = r14 & 4
            java.lang.String r15 = ""
            r16 = 0
            if (r14 == 0) goto L_0x01ab
            if (r9 >= r6) goto L_0x00c2
            r16 = r3[r9]
        L_0x00c2:
            r14 = r16
            if (r2 != r8) goto L_0x019b
            android.view.LayoutInflater r12 = r0.f292415y
            r15 = 2131626662(0x7f0e0aa6, float:1.8880567E38)
            android.view.View r12 = r12.inflate(r15, r4, r5)
            r15 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            android.view.View r15 = r12.findViewById(r15)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r15 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r15
            com.google.ai.b.nw r8 = r11.f31949f
            if (r8 != 0) goto L_0x00de
            com.google.ai.b.nw r8 = com.google.p375ai.p378b.C7893nw.f27731q
        L_0x00de:
            java.lang.String r5 = r8.f27743k
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r17 = r7
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r7 = r7.f290332b
            com.google.android.apps.gsa.shared.y.au r7 = r7.mo86214a()
            r15.mo76737h(r5, r7)
            boolean r5 = r11.f31950g
            r7 = 2131171619(0x7f071923, float:1.795763E38)
            if (r5 == 0) goto L_0x0142
            android.content.Context r5 = r0.f290307b
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131170114(0x7f071342, float:1.7954577E38)
            int r5 = r5.getDimensionPixelSize(r8)
            android.content.Context r8 = r0.f290307b
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131170113(0x7f071341, float:1.7954575E38)
            int r8 = r8.getDimensionPixelSize(r11)
            android.view.ViewGroup$LayoutParams r11 = r15.getLayoutParams()
            r11.width = r5
            r11.height = r5
            boolean r5 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0130
            r5 = r11
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.Context r14 = r0.f290307b
            android.content.res.Resources r14 = r14.getResources()
            int r7 = r14.getDimensionPixelOffset(r7)
            r14 = 0
            r5.setMargins(r14, r14, r14, r7)
            goto L_0x0131
        L_0x0130:
            r14 = 0
        L_0x0131:
            r15.setLayoutParams(r11)
            float r5 = (float) r8
            r7 = r15
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r7 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r7
            r7.mo76728d(r5, r5, r5, r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END
            r15.setScaleType(r5)
        L_0x0140:
            r7 = 0
            goto L_0x0199
        L_0x0142:
            r5 = 0
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r5, r5)
            if (r14 == 0) goto L_0x0152
            boolean r5 = r14.f28359h
            if (r5 == 0) goto L_0x0152
            r5 = 17
            r11.gravity = r5
        L_0x0152:
            if (r14 == 0) goto L_0x0176
            int r5 = r14.f28352a
            r16 = r5 & 32
            if (r16 == 0) goto L_0x0176
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0176
            int r5 = r14.f28357f
            float r5 = (float) r5
            float r5 = r0.m173980L(r5)
            int r5 = (int) r5
            r11.width = r5
            int r5 = r14.f28358g
            float r5 = (float) r5
            float r5 = r0.m173980L(r5)
            int r5 = (int) r5
            r11.height = r5
            r15.setLayoutParams(r11)
            goto L_0x0140
        L_0x0176:
            int r5 = r8.f27733a
            r14 = r5 & 2
            if (r14 == 0) goto L_0x0140
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0140
            int r5 = r8.f27734b
            r11.width = r5
            int r5 = r8.f27735c
            r11.height = r5
            android.content.Context r5 = r0.f290307b
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelOffset(r7)
            r7 = 0
            r11.setMargins(r7, r7, r7, r5)
            r15.setLayoutParams(r11)
        L_0x0199:
            r11 = r12
            goto L_0x01f6
        L_0x019b:
            r17 = r7
            r7 = 0
            android.view.LayoutInflater r5 = r0.f292415y
            android.view.View r5 = r5.inflate(r12, r4, r7)
            r11 = r5
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setText(r15)
            goto L_0x01f6
        L_0x01ab:
            r17 = r7
            com.google.protobuf.cq r5 = r11.f31946c
            int r5 = r5.size()
            if (r5 < r2) goto L_0x01e5
            int r5 = r2 + -1
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r7 = r0.f292416z
            com.google.protobuf.cq r8 = r11.f31946c
            java.lang.Object r8 = r8.get(r5)
            com.google.ai.b.lb r8 = (com.google.p375ai.p378b.C7818lb) r8
            android.widget.TextView r7 = r7.mo94515g(r8, r4)
            if (r7 == 0) goto L_0x01e3
            com.google.protobuf.cb r8 = r11.f31948e
            int r8 = r8.size()
            if (r8 < r2) goto L_0x01e3
            com.google.protobuf.cb r8 = r11.f31948e
            boolean r5 = r8.mo58924g(r5)
            if (r5 == 0) goto L_0x01e3
            java.lang.CharSequence r5 = r7.getText()
            com.google.android.apps.gsa.staticplugins.nowcards.base.k r8 = new com.google.android.apps.gsa.staticplugins.nowcards.base.k
            r8.<init>(r0, r5)
            r7.setOnClickListener(r8)
        L_0x01e3:
            r11 = r7
            goto L_0x01e7
        L_0x01e5:
            r11 = r16
        L_0x01e7:
            if (r11 != 0) goto L_0x01f6
            android.view.LayoutInflater r5 = r0.f292415y
            r7 = 0
            android.view.View r5 = r5.inflate(r12, r4, r7)
            r11 = r5
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setText(r15)
        L_0x01f6:
            if (r22 == 0) goto L_0x0220
            if (r9 >= r6) goto L_0x0220
            r7 = r3[r9]
            float r7 = r7.f28353b
            r8 = 0
            r14 = 0
        L_0x0200:
            if (r14 >= r13) goto L_0x0218
            int r9 = r9 + 1
            if (r9 >= r6) goto L_0x0215
            int r12 = r9 + -1
            r12 = r3[r12]
            int r12 = r12.f28355d
            r15 = r3[r9]
            int r5 = r15.f28354c
            int r12 = r12 + r5
            int r8 = r8 + r12
            float r5 = r15.f28353b
            float r7 = r7 + r5
        L_0x0215:
            int r14 = r14 + 1
            goto L_0x0200
        L_0x0218:
            android.widget.TableRow$LayoutParams r5 = new android.widget.TableRow$LayoutParams
            r12 = -2
            r14 = 0
            r5.<init>(r14, r12, r7)
            goto L_0x022d
        L_0x0220:
            r12 = -2
            r14 = 0
            android.widget.TableRow$LayoutParams r5 = new android.widget.TableRow$LayoutParams
            r5.<init>(r12, r12)
            int r7 = r13 + 1
            r5.span = r7
            int r9 = r9 + r13
            r8 = 0
        L_0x022d:
            int r7 = r9 - r13
            if (r7 >= r6) goto L_0x0244
            r7 = r3[r7]
            int r12 = r7.f28352a
            r12 = r12 & 2
            if (r12 == 0) goto L_0x0244
            int r7 = r7.f28354c
            float r7 = (float) r7
            float r7 = r0.m173980L(r7)
            int r7 = (int) r7
            r5.leftMargin = r7
            goto L_0x0257
        L_0x0244:
            if (r22 != 0) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            android.content.Context r7 = r0.f290307b
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131171492(0x7f0718a4, float:1.7957372E38)
            int r7 = r7.getDimensionPixelSize(r10)
            r5.leftMargin = r7
        L_0x0257:
            if (r9 >= r6) goto L_0x0266
            r7 = r3[r9]
            int r7 = r7.f28355d
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r0.m173980L(r7)
            int r7 = (int) r7
            r5.rightMargin = r7
        L_0x0266:
            int r7 = r1.f31953a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0276
            int r7 = r1.f31957e
            float r7 = (float) r7
            float r7 = r0.m173980L(r7)
            int r7 = (int) r7
            r5.topMargin = r7
        L_0x0276:
            int r7 = r1.f31953a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0286
            int r7 = r1.f31958f
            float r7 = (float) r7
            float r7 = r0.m173980L(r7)
            int r7 = (int) r7
            r5.bottomMargin = r7
        L_0x0286:
            r4.addView(r11, r5)
            int r9 = r9 + 1
            r7 = r17
            r5 = 0
            r8 = 1
            r10 = 0
            goto L_0x0032
        L_0x0292:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104939bj.m173981M(com.google.android.apps.g.d.dy, boolean, int, boolean, com.google.ai.b.ty[]):android.widget.TableRow");
    }

    /* renamed from: N */
    private final void m173982N(TableLayout tableLayout, C8063ud udVar) {
        View inflate = this.f292415y.inflate(R.layout.qp_tabular_border_row, new TableRow(this.f290307b), false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = (int) m173980L((float) udVar.f28373b);
        inflate.setBackgroundColor(udVar.f28372a);
        inflate.setLayoutParams(layoutParams);
        tableLayout.addView(inflate, layoutParams);
    }

    /* renamed from: O */
    private static boolean m173983O(C9244dz dzVar) {
        if (dzVar.f31969f.size() != 0) {
            for (int i = 0; i < dzVar.f31969f.size(); i++) {
                if ((((C8057ty) dzVar.f31969f.get(i)).f28352a & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        this.f292415y = layoutInflater;
        return layoutInflater.inflate(R.layout.qp_tabular_module, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.f290308c.f256406b;
        this.f292415y = layoutInflater;
        return layoutInflater.inflate(R.layout.qp_tabular_module, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        int i;
        int i2;
        C9244dz dzVar;
        ArrayList arrayList;
        String str;
        TableLayout.LayoutParams layoutParams;
        CharSequence charSequence;
        CharSequence charSequence2;
        View view = this.f290311f;
        TableLayout tableLayout = (TableLayout) view.findViewById(R.id.tabular_grid);
        this.f292416z = this.f292414A.mo94516a(this.f290307b, this.f292415y, (Map) null, mo94120n());
        C9244dz dzVar2 = this.f290310e.f32204k;
        if (dzVar2 == null) {
            dzVar2 = C9244dz.f31962i;
        }
        C9244dz dzVar3 = dzVar2;
        tableLayout.removeAllViews();
        int paddingLeft = view.getPaddingLeft();
        if ((dzVar3.f31964a & 4) != 0) {
            i = (int) m173980L((float) dzVar3.f31970g);
        } else {
            i = view.getPaddingTop();
        }
        int paddingRight = view.getPaddingRight();
        if ((dzVar3.f31964a & 8) != 0) {
            i2 = (int) m173980L((float) dzVar3.f31971h);
        } else {
            i2 = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, i, paddingRight, i2);
        C91985d.m150961h(view, R.id.title, Html.fromHtml(dzVar3.f31965b));
        C91985d.m150961h(view, R.id.subtitle, Html.fromHtml(dzVar3.f31966c));
        if (dzVar3.f31968e.size() > 0) {
            ((MetadataLineView) view.findViewById(R.id.metadata)).mo94502d(this.f292414A.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n()), dzVar3.f31968e, this.f290314i.f290349s);
        }
        boolean z = dzVar3.f31965b.isEmpty() && dzVar3.f31966c.isEmpty();
        if (dzVar3.f31969f.size() != 0 && !m173983O(dzVar3)) {
            Iterator it = dzVar3.f31969f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C8057ty) it.next()).f28356e) {
                    tableLayout.setStretchAllColumns(false);
                    tableLayout.setShrinkAllColumns(false);
                    for (int i3 = 0; i3 < dzVar3.f31969f.size(); i3++) {
                        if (((C8057ty) dzVar3.f31969f.get(i3)).f28356e) {
                            tableLayout.setColumnStretchable(i3, true);
                            tableLayout.setColumnShrinkable(i3, true);
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        C8057ty[] tyVarArr = (C8057ty[]) dzVar3.f31969f.toArray(new C8057ty[0]);
        boolean z2 = true;
        for (C9243dy dyVar : dzVar3.f31967d) {
            boolean O = m173983O(dzVar3);
            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
            ArrayList arrayList2 = new ArrayList(dyVar.f31954b.size());
            for (int i4 = 0; i4 < dyVar.f31954b.size(); i4++) {
                arrayList2.add(new StringBuilder());
            }
            if ((dyVar.f31953a & 2) != 0) {
                C8063ud udVar = dyVar.f31956d;
                if (udVar == null) {
                    udVar = C8063ud.f28370c;
                }
                m173982N(tableLayout, udVar);
            }
            if (!dyVar.f31955c) {
                str = " ";
                arrayList = arrayList2;
                dzVar = dzVar3;
                layoutParams = layoutParams2;
                TableRow M = m173981M(dyVar, z2 && z, 0, O, tyVarArr);
                for (int i5 = 0; i5 < M.getChildCount(); i5++) {
                    TextView textView = (TextView) M.getChildAt(i5);
                    if (!TextUtils.isEmpty(textView.getContentDescription())) {
                        charSequence2 = textView.getContentDescription();
                    } else {
                        charSequence2 = textView.getText();
                    }
                    StringBuilder sb2 = (StringBuilder) arrayList.get(i5);
                    sb2.append(charSequence2);
                    sb2.append(str);
                }
                tableLayout.addView(M, layoutParams);
            } else {
                str = " ";
                arrayList = arrayList2;
                dzVar = dzVar3;
                layoutParams = layoutParams2;
            }
            int i6 = 0;
            for (C9241dw dwVar : dyVar.f31954b) {
                if (dwVar.f31946c.size() > i6) {
                    i6 = dwVar.f31946c.size();
                }
            }
            int i7 = 1;
            while (i7 <= i6) {
                int i8 = i7;
                int i9 = i6;
                TableRow M2 = m173981M(dyVar, false, i7, O, tyVarArr);
                tableLayout.addView(M2, layoutParams);
                for (int i10 = 0; i10 < M2.getChildCount(); i10++) {
                    View childAt = M2.getChildAt(i10);
                    if (childAt instanceof TextView) {
                        TextView textView2 = (TextView) childAt;
                        if (!TextUtils.isEmpty(textView2.getContentDescription())) {
                            charSequence = textView2.getContentDescription();
                        } else {
                            charSequence = textView2.getText();
                        }
                        StringBuilder sb3 = (StringBuilder) arrayList.get(i10);
                        sb3.append(charSequence);
                        sb3.append(str);
                    }
                }
                i7 = i8 + 1;
                i6 = i9;
            }
            if ((dyVar.f31953a & 16) != 0) {
                C8063ud udVar2 = dyVar.f31959g;
                if (udVar2 == null) {
                    udVar2 = C8063ud.f28370c;
                }
                m173982N(tableLayout, udVar2);
            }
            StringBuilder sb4 = new StringBuilder();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb4.append((StringBuilder) arrayList.get(i11));
                sb4.append(", ");
            }
            sb.append(sb4.toString());
            sb.append(", ");
            dzVar3 = dzVar;
            z2 = false;
        }
        tableLayout.setContentDescription(sb.toString());
    }
}
