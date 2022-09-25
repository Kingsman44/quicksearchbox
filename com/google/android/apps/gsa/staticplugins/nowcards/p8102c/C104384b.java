package com.google.android.apps.gsa.staticplugins.nowcards.p8102c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104930ba;
import com.google.android.apps.p489g.p494d.C9159av;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.c.b */
/* compiled from: PG */
public final class C104384b extends C104348l {

    /* renamed from: A */
    private LinearLayout f290454A;

    /* renamed from: B */
    private List f290455B;

    /* renamed from: y */
    List f290456y;

    /* renamed from: z */
    private final C104930ba f290457z;

    public C104384b(Context context, C104350n nVar, C104930ba baVar) {
        super(context, nVar);
        this.f290457z = baVar;
    }

    /* renamed from: L */
    private final void m172588L(View view) {
        this.f290454A = (LinearLayout) view.findViewById(R.id.grid_list_row_container);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.grid_list_row, mo94115i(), false);
        m172588L(inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        View inflate = this.f290308c.f256406b.inflate(R.layout.grid_list_row, viewGroup, false);
        m172588L(inflate);
        return inflate;
    }

    /* renamed from: d */
    public final List mo94030d() {
        return this.f290455B;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r10 == com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0186 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r16 = this;
            r0 = r16
            android.view.View r1 = r0.f290311f
            com.google.android.apps.g.d.v r2 = r0.f290310e
            int r3 = r2.f32192a
            r4 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0194
            com.google.android.apps.g.d.av r2 = r2.f32217x
            if (r2 != 0) goto L_0x0013
            com.google.android.apps.g.d.av r2 = com.google.android.apps.p489g.p494d.C9159av.f31613g
        L_0x0013:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f290455B = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f290456y = r3
            android.content.Context r3 = r1.getContext()
            int r4 = r2.f31617c
            android.content.res.Resources r5 = r3.getResources()
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r6 = r0.f290309d
            if (r6 == 0) goto L_0x004b
            com.google.android.apps.gsa.sidekick.shared.cards.a.f r6 = r6.mo86083e()
            com.google.android.apps.gsa.staticplugins.nowcards.b.b r6 = (com.google.android.apps.gsa.staticplugins.nowcards.p8101b.C104289b) r6
            if (r6 == 0) goto L_0x004b
            com.google.ai.b.hj r6 = r6.f290073a
            if (r6 == 0) goto L_0x004b
            int r8 = r6.f26955a
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x004b
            com.google.ai.b.eu r6 = r6.f26934F
            if (r6 != 0) goto L_0x0048
            com.google.ai.b.eu r6 = com.google.p375ai.p378b.C7648eu.f26542o
        L_0x0048:
            boolean r6 = r6.f26554k
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r8 = r0.f290314i
            boolean r8 = r8.f290336f
            r9 = 1
            if (r9 == r8) goto L_0x0055
            r8 = 1
            goto L_0x0056
        L_0x0055:
            r8 = 3
        L_0x0056:
            int r3 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148055a(r3, r8)
            r8 = 2131171575(0x7f0718f7, float:1.795754E38)
            if (r6 == 0) goto L_0x0065
            int r6 = r5.getDimensionPixelSize(r8)
            int r6 = r6 + r6
            int r3 = r3 + r6
        L_0x0065:
            int r6 = r4 + 1
            int r5 = r5.getDimensionPixelSize(r8)
            int r6 = r6 * r5
            int r3 = r3 - r6
            int r3 = r3 / r4
            int r4 = r2.f31618d
            float r4 = (float) r4
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r9, r4, r1)
            int r1 = (int) r1
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r4 = r0.f290309d
            r5 = 0
        L_0x0082:
            com.google.protobuf.cq r6 = r2.f31616b
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0194
            com.google.protobuf.cq r6 = r2.f31616b
            java.lang.Object r6 = r6.get(r5)
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.g.d.q r6 = (com.google.android.apps.p489g.p494d.C9273q) r6
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            int r10 = r10.f32196c
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r10)
            if (r10 != 0) goto L_0x00a6
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x00a6:
            com.google.android.apps.g.d.u r11 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_LOGO
            if (r10 == r11) goto L_0x00bc
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            int r10 = r10.f32196c
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r10)
            if (r10 != 0) goto L_0x00b8
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x00b8:
            com.google.android.apps.g.d.u r11 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO
            if (r10 != r11) goto L_0x00f4
        L_0x00bc:
            com.google.protobuf.bv r10 = r6.instance
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            com.google.android.apps.g.d.bx r10 = r10.f32210q
            if (r10 != 0) goto L_0x00c6
            com.google.android.apps.g.d.bx r10 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x00c6:
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.android.apps.g.d.bs r10 = (com.google.android.apps.p489g.p494d.C9183bs) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.g.d.bx r11 = (com.google.android.apps.p489g.p494d.C9188bx) r11
            r12 = 2
            r11.f31724i = r12
            int r12 = r11.f31716a
            r12 = r12 | 16
            r11.f31716a = r12
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.android.apps.g.d.v r11 = (com.google.android.apps.p489g.p494d.C9278v) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.apps.g.d.bx r10 = (com.google.android.apps.p489g.p494d.C9188bx) r10
            r10.getClass()
            r11.f32210q = r10
            int r10 = r11.f32192a
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r11.f32192a = r10
        L_0x00f4:
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            com.google.protobuf.cq r10 = r2.f31616b
            int r10 = r10.size()
            int r10 = r10 + -1
            if (r5 >= r10) goto L_0x0106
            r10 = 1
            goto L_0x0107
        L_0x0106:
            r10 = 0
        L_0x0107:
            boolean r11 = r2.f31619e
            boolean r12 = r2.f31620f
            com.google.android.apps.gsa.staticplugins.nowcards.g.ba r13 = r0.f290457z
            android.content.Context r14 = r0.f290307b
            com.google.android.apps.gsa.staticplugins.nowcards.g.az r13 = r13.mo94016a(r14)
            java.util.List r14 = r0.f290456y
            r14.add(r13)
            android.view.View r13 = r13.mo86091a(r4, r6)
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r14)
            r7 = -2
            r15.height = r7
            r15.width = r3
            if (r10 != 0) goto L_0x0133
            if (r11 != 0) goto L_0x0133
            if (r12 == 0) goto L_0x0158
            r12 = 1
        L_0x0133:
            android.content.res.Resources r7 = r13.getResources()
            int r7 = r7.getDimensionPixelSize(r8)
            if (r9 == r10) goto L_0x013f
            r10 = 0
            goto L_0x0140
        L_0x013f:
            r10 = r7
        L_0x0140:
            if (r9 == r11) goto L_0x0144
            r11 = 0
            goto L_0x0145
        L_0x0144:
            r11 = r7
        L_0x0145:
            if (r9 == r12) goto L_0x0148
            r7 = 0
        L_0x0148:
            r15.setMarginEnd(r10)
            int r10 = r14.leftMargin
            int r12 = r14.topMargin
            int r12 = r12 + r11
            int r11 = r14.rightMargin
            int r14 = r14.bottomMargin
            int r14 = r14 + r7
            r15.setMargins(r10, r12, r11, r14)
        L_0x0158:
            r13.setLayoutParams(r15)
            r7 = 2131434510(0x7f0b1c0e, float:1.8490836E38)
            android.view.View r7 = r13.findViewById(r7)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r7 = (com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub) r7
            if (r7 == 0) goto L_0x017c
            int r10 = r6.f32196c
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r10)
            if (r10 != 0) goto L_0x0170
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0170:
            com.google.android.apps.g.d.u r11 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CENTERED_ICON
            if (r10 == r11) goto L_0x017c
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r1)
            r7.setLayoutParams(r10)
        L_0x017c:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.p.c r7 = r7.f290350t
            com.google.ai.b.hj r6 = r6.f32174H
            if (r6 != 0) goto L_0x0186
            com.google.protobuf.ci r6 = com.google.p375ai.p378b.C7718hj.f26926ac
        L_0x0186:
            android.widget.LinearLayout r6 = r0.f290454A
            r6.addView(r13)
            java.util.List r6 = r0.f290455B
            r6.add(r13)
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8102c.C104384b.mo94020e():void");
    }

    /* renamed from: h */
    public final View mo94114h(C9278v vVar) {
        int i;
        if (vVar == null || (i = vVar.f32192a & C89885b.NOW_VALUE) == 0) {
            return mo86091a(this.f290309d, vVar);
        }
        if (i == 0) {
            return super.mo94114h(vVar);
        }
        C9159av avVar = vVar.f32217x;
        if (avVar == null) {
            avVar = C9159av.f31613g;
        }
        C62971cq cqVar = avVar.f31616b;
        if (cqVar.size() != this.f290456y.size()) {
            return mo86091a(this.f290309d, vVar);
        }
        for (int i2 = 0; i2 < cqVar.size(); i2++) {
            ((C104928az) this.f290456y.get(i2)).mo94114h((C9278v) cqVar.get(i2));
        }
        return this.f290311f;
    }
}
