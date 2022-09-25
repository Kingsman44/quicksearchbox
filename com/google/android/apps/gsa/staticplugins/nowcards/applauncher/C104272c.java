package com.google.android.apps.gsa.staticplugins.nowcards.applauncher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104404o;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.c */
/* compiled from: PG */
public final class C104272c extends C104404o {
    public C104272c(Context context, C90929bz bzVar, C68214a aVar, C104350n nVar) {
        super(context, bzVar, aVar, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_app_strip_module, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_app_strip_module, viewGroup, false);
    }

    /* renamed from: d */
    public final List mo94030d() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015f A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r17 = this;
            r0 = r17
            android.view.View r1 = r0.f290311f
            r2 = 2131427841(0x7f0b0201, float:1.847731E38)
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.content.Context r3 = r0.f290307b
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131171485(0x7f07189d, float:1.7957358E38)
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            com.google.android.apps.g.d.v r4 = r0.f290310e
            com.google.android.apps.g.d.x r4 = r4.f32212s
            if (r4 != 0) goto L_0x0023
            com.google.android.apps.g.d.x r4 = com.google.android.apps.p489g.p494d.C9280x.f32220d
        L_0x0023:
            com.google.protobuf.cq r5 = r4.f32223b
            int r5 = r5.size()
            if (r5 == 0) goto L_0x0164
            r1 = 0
            r5 = 0
        L_0x002d:
            com.google.protobuf.cq r6 = r4.f32223b
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0163
            com.google.protobuf.cq r6 = r4.f32223b
            java.lang.Object r6 = r6.get(r5)
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r7 = r6.f32192a
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x015f
            com.google.android.apps.g.d.h r7 = r6.f32213t
            if (r7 != 0) goto L_0x004a
            com.google.android.apps.g.d.h r7 = com.google.android.apps.p489g.p494d.C9264h.f32054e
        L_0x004a:
            android.content.Context r8 = r0.f290307b
            java.lang.String r9 = r7.f32057b
            boolean r10 = r9.isEmpty()
            r11 = 2131169342(0x7f07103e, float:1.7953011E38)
            r12 = 2131169343(0x7f07103f, float:1.7953013E38)
            r13 = 2131626591(0x7f0e0a5f, float:1.8880423E38)
            if (r10 != 0) goto L_0x00b0
            com.google.android.apps.gsa.sidekick.shared.ui.p r10 = r0.f290308c
            android.view.LayoutInflater r10 = r10.f256406b
            java.lang.String r15 = r7.f32058c
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ApplicationInfo r9 = r8.getApplicationInfo(r9, r1)     // Catch:{ NameNotFoundException -> 0x00af }
            android.graphics.drawable.Drawable r14 = r9.loadIcon(r8)     // Catch:{ NameNotFoundException -> 0x00af }
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ NameNotFoundException -> 0x00af }
            if (r16 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            java.lang.CharSequence r15 = r9.loadLabel(r8)     // Catch:{ NameNotFoundException -> 0x00af }
        L_0x007a:
            r10.inflate(r13, r2)     // Catch:{ NameNotFoundException -> 0x00af }
            int r8 = r2.getChildCount()     // Catch:{ NameNotFoundException -> 0x00af }
            int r8 = r8 + -1
            android.view.View r8 = r2.getChildAt(r8)     // Catch:{ NameNotFoundException -> 0x00af }
            com.google.android.apps.gsa.staticplugins.nowcards.applauncher.AppIconView r8 = (com.google.android.apps.gsa.staticplugins.nowcards.applauncher.AppIconView) r8     // Catch:{ NameNotFoundException -> 0x00af }
            if (r14 == 0) goto L_0x0096
            android.content.res.Resources r9 = r8.getResources()     // Catch:{ NameNotFoundException -> 0x00af }
            int r9 = r9.getDimensionPixelSize(r12)     // Catch:{ NameNotFoundException -> 0x00af }
            r14.setBounds(r1, r1, r9, r9)     // Catch:{ NameNotFoundException -> 0x00af }
        L_0x0096:
            android.content.res.Resources r9 = r8.getResources()     // Catch:{ NameNotFoundException -> 0x00af }
            int r9 = r9.getDimensionPixelOffset(r11)     // Catch:{ NameNotFoundException -> 0x00af }
            r10 = 0
            r8.setCompoundDrawables(r10, r14, r10, r10)     // Catch:{ NameNotFoundException -> 0x00af }
            r8.setCompoundDrawablePadding(r9)     // Catch:{ NameNotFoundException -> 0x00af }
            r8.setText(r15)     // Catch:{ NameNotFoundException -> 0x00af }
            r8.setContentDescription(r15)     // Catch:{ NameNotFoundException -> 0x00af }
            r8.setVisibility(r1)     // Catch:{ NameNotFoundException -> 0x00af }
            goto L_0x00b1
        L_0x00af:
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 != 0) goto L_0x011d
            java.lang.String r9 = r7.f32058c
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x011d
            java.lang.String r9 = r7.f32059d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x011d
            java.lang.String r8 = r7.f32058c
            java.lang.String r7 = r7.f32059d
            com.google.android.apps.gsa.sidekick.shared.ui.p r9 = r0.f290308c
            android.view.LayoutInflater r9 = r9.f256406b
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r10 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r10 = r10.f290332b
            com.google.android.apps.gsa.shared.y.au r10 = r10.mo86214a()
            r9.inflate(r13, r2)
            int r9 = r2.getChildCount()
            int r9 = r9 + -1
            android.view.View r9 = r2.getChildAt(r9)
            com.google.android.apps.gsa.staticplugins.nowcards.applauncher.AppIconView r9 = (com.google.android.apps.gsa.staticplugins.nowcards.applauncher.AppIconView) r9
            android.content.res.Resources r13 = r9.getResources()
            int r12 = r13.getDimensionPixelSize(r12)
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r1)
            r13.setBounds(r1, r1, r12, r12)
            android.content.res.Resources r12 = r9.getResources()
            int r11 = r12.getDimensionPixelOffset(r11)
            r12 = 0
            r9.setCompoundDrawables(r12, r13, r12, r12)
            r9.setCompoundDrawablePadding(r11)
            r9.setText(r8)
            r9.setContentDescription(r8)
            r9.setVisibility(r1)
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.google.common.util.concurrent.cx r7 = r10.mo85417d(r7)
            com.google.android.apps.gsa.staticplugins.nowcards.applauncher.a r8 = new com.google.android.apps.gsa.staticplugins.nowcards.applauncher.a
            r8.<init>(r9)
            java.lang.String r11 = "AppIconView.ImageCallback"
            r10.mo85428r(r7, r11, r8)
            r8 = r9
        L_0x011d:
            if (r8 == 0) goto L_0x0148
            com.google.protobuf.cq r7 = r4.f32223b
            int r7 = r7.size()
            int r7 = r7 + -1
            if (r5 == r7) goto L_0x0148
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r9 = r0.f290307b
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165671(0x7f0701e7, float:1.7945566E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            r10 = -2
            r7.<init>(r9, r10)
            if (r5 != 0) goto L_0x0141
            r9 = r3
            goto L_0x0142
        L_0x0141:
            r9 = 0
        L_0x0142:
            r7.setMargins(r9, r1, r3, r1)
            r8.setLayoutParams(r7)
        L_0x0148:
            if (r8 == 0) goto L_0x015f
            com.google.android.apps.g.d.ad r7 = r6.f32169C
            if (r7 != 0) goto L_0x0150
            com.google.android.apps.g.d.ad r7 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
        L_0x0150:
            com.google.ai.b.hj r9 = r6.f32174H
            if (r9 != 0) goto L_0x0156
            com.google.ai.b.hj r9 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0156:
            r0.mo94104C(r8, r7, r9)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r0.f290314i
            com.google.android.apps.gsa.sidekick.shared.p.c r7 = r7.f290350t
            com.google.ai.b.hj r6 = r6.f32174H
        L_0x015f:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0163:
            return
        L_0x0164:
            r2 = 8
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.C104272c.mo94020e():void");
    }
}
