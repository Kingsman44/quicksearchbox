package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.r */
/* compiled from: PG */
public final class C104972r extends C104348l {
    public C104972r(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* renamed from: L */
    private static final void m174028L(RoundedCornerWebImageView roundedCornerWebImageView) {
        roundedCornerWebImageView.mo76724hc(15);
        roundedCornerWebImageView.f227343d = true;
        roundedCornerWebImageView.invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_generic_card, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_generic_card, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r2 = r2.f31604e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r16 = this;
            r0 = r16
            android.view.View r1 = r0.f290311f
            com.google.android.apps.g.d.v r2 = r0.f290310e
            com.google.android.apps.g.d.ar r2 = r2.f32207n
            if (r2 != 0) goto L_0x000c
            com.google.android.apps.g.d.ar r2 = com.google.android.apps.p489g.p494d.C9155ar.f31598g
        L_0x000c:
            int r3 = r2.f31600a
            r4 = 1
            r3 = r3 & r4
            r5 = 2131436600(0x7f0b2438, float:1.8495075E38)
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = r2.f31601b
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150961h(r1, r5, r3)
        L_0x001e:
            int r3 = r2.f31600a
            r6 = 2
            r3 = r3 & r6
            r7 = 0
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r2.f31602c
            com.google.android.apps.gsa.staticplugins.nowcards.g.p r8 = new com.google.android.apps.gsa.staticplugins.nowcards.g.p
            r8.<init>()
            r9 = 0
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r9, r8)
            r8 = 2131436487(0x7f0b23c7, float:1.8494846E38)
            android.view.View r8 = r1.findViewById(r8)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.TextViewWithImages r8 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.TextViewWithImages) r8
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r9 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r9 = r9.f290332b
            com.google.android.apps.gsa.shared.y.au r9 = r9.mo86214a()
            r8.mo94503a(r3, r9)
            r8.setVisibility(r7)
            int r3 = r2.f31600a
            r3 = r3 & r4
            if (r3 != 0) goto L_0x005f
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r9 = r3.leftMargin
            int r10 = r3.rightMargin
            int r11 = r3.bottomMargin
            r3.setMargins(r9, r7, r10, r11)
            r8.setLayoutParams(r3)
        L_0x005f:
            com.google.protobuf.cq r3 = r2.f31605f
            int r3 = r3.size()
            r8 = 2131430463(0x7f0b0c3f, float:1.8482628E38)
            r9 = 3
            r10 = 2131430462(0x7f0b0c3e, float:1.8482626E38)
            if (r3 <= 0) goto L_0x012c
            int r3 = r2.f31600a
            r11 = 4
            r3 = r3 & r11
            if (r3 == 0) goto L_0x007e
            int r3 = r2.f31603d
            int r3 = com.google.p375ai.p378b.C7776jn.m22840a(r3)
            if (r3 != 0) goto L_0x007f
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 2
        L_0x007f:
            if (r3 == r4) goto L_0x00e8
            if (r3 != r6) goto L_0x008a
            android.view.View r3 = r1.findViewById(r8)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r3 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r3
            goto L_0x00ee
        L_0x008a:
            if (r3 != r9) goto L_0x008d
            r11 = 1
        L_0x008d:
            com.google.android.apps.gsa.sidekick.shared.ui.p r3 = r0.f290308c
            android.view.LayoutInflater r3 = r3.f256406b
            com.google.protobuf.cq r12 = r2.f31605f
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x012c
            r12 = 2131430458(0x7f0b0c3a, float:1.8482618E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r12.setVisibility(r7)
            com.google.protobuf.cq r13 = r2.f31605f
            java.util.Iterator r13 = r13.iterator()
            r14 = 0
        L_0x00ac:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00e2
            java.lang.Object r15 = r13.next()
            com.google.ai.b.nw r15 = (com.google.p375ai.p378b.C7893nw) r15
            if (r14 >= r11) goto L_0x00ac
            int r14 = r14 + 1
            r8 = 2131625144(0x7f0e04b8, float:1.8877488E38)
            android.view.View r8 = r3.inflate(r8, r12, r7)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r8 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r8
            java.lang.String r15 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150938d(r15)
            if (r15 == 0) goto L_0x00dd
            android.net.Uri r15 = android.net.Uri.parse(r15)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r9 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r9 = r9.f290332b
            com.google.android.apps.gsa.shared.y.au r9 = r9.mo86214a()
            r8.mo76737h(r15, r9)
            r12.addView(r8)
        L_0x00dd:
            r8 = 2131430463(0x7f0b0c3f, float:1.8482628E38)
            r9 = 3
            goto L_0x00ac
        L_0x00e2:
            if (r14 != r4) goto L_0x012c
            r12.setPadding(r7, r7, r7, r7)
            goto L_0x012c
        L_0x00e8:
            android.view.View r3 = r1.findViewById(r10)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r3 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r3
        L_0x00ee:
            com.google.protobuf.cq r8 = r2.f31605f
            java.lang.Object r8 = r8.get(r7)
            com.google.ai.b.nw r8 = (com.google.p375ai.p378b.C7893nw) r8
            java.lang.String r9 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150938d(r8)
            if (r9 == 0) goto L_0x012c
            android.net.Uri r9 = android.net.Uri.parse(r9)
            int r11 = r8.f27734b
            int r8 = r8.f27735c
            r3.setVisibility(r7)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r7 = r7.f290332b
            com.google.android.apps.gsa.shared.y.au r7 = r7.mo86214a()
            r3.mo76737h(r9, r7)
            if (r11 > 0) goto L_0x0116
            if (r8 <= 0) goto L_0x012c
        L_0x0116:
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r9 = -2
            if (r11 <= 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r11 = -2
        L_0x0121:
            r7.width = r11
            if (r8 <= 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r8 = -2
        L_0x0127:
            r7.height = r8
            r3.setLayoutParams(r7)
        L_0x012c:
            int r3 = r2.f31600a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x01b5
            int r2 = r2.f31604e
            int r3 = com.google.p375ai.p378b.C7774jl.m22839a(r2)
            if (r3 != 0) goto L_0x013c
            goto L_0x01b5
        L_0x013c:
            if (r3 == r4) goto L_0x01b5
            int r2 = com.google.p375ai.p378b.C7774jl.m22839a(r2)
            if (r2 != 0) goto L_0x0145
            r2 = 1
        L_0x0145:
            if (r2 != r6) goto L_0x019d
            r2 = r1
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            android.content.Context r3 = r0.f290307b
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131100163(0x7f060203, float:1.78127E38)
            int r3 = r3.getColor(r6)
            r2.mo4473c(r3)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextAlignment(r4)
            r2 = 17
            r1.setGravity(r2)
            android.content.Context r2 = r0.f290307b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131172815(0x7f071dcf, float:1.7960055E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.topMargin = r2
            r3.bottomMargin = r2
            r1.setLayoutParams(r3)
            com.google.android.apps.g.d.v r2 = r0.f290310e
            int r2 = r2.f32192a
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0194
            android.content.Context r2 = r0.f290307b
            r3 = 2132151117(0x7f160b4d, float:1.9944288E38)
            r1.setTextAppearance(r2, r3)
            return
        L_0x0194:
            android.content.Context r2 = r0.f290307b
            r3 = 2132151116(0x7f160b4c, float:1.9944286E38)
            r1.setTextAppearance(r2, r3)
            return
        L_0x019d:
            r3 = 3
            if (r2 != r3) goto L_0x01b5
            android.view.View r2 = r1.findViewById(r10)
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r2 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r2
            m174028L(r2)
            r2 = 2131430463(0x7f0b0c3f, float:1.8482628E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r1 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r1
            m174028L(r1)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104972r.mo94020e():void");
    }
}
