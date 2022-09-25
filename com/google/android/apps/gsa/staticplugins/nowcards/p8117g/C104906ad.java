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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.ad */
/* compiled from: PG */
public final class C104906ad extends C104348l {
    public C104906ad(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_now_card_simple_image, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_now_card_simple_image, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
        if (r2 == (r0.mo86099n() - 1)) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012e, code lost:
        if (r2 != 4) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013a, code lost:
        if (r0 != 7) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r9 = this;
            com.google.android.apps.g.d.v r0 = r9.f290310e
            com.google.android.apps.g.d.az r0 = r0.f32197d
            if (r0 != 0) goto L_0x0008
            com.google.android.apps.g.d.az r0 = com.google.android.apps.p489g.p494d.C9163az.f31628l
        L_0x0008:
            boolean r0 = r0.f31632c
            r1 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            if (r0 == 0) goto L_0x0012
            r9.mo94127u(r1)
        L_0x0012:
            com.google.android.apps.g.d.v r0 = r9.f290310e
            com.google.android.apps.g.d.az r0 = r0.f32197d
            if (r0 != 0) goto L_0x001a
            com.google.android.apps.g.d.az r0 = com.google.android.apps.p489g.p494d.C9163az.f31628l
        L_0x001a:
            android.view.View r2 = r9.f290311f
            android.view.View r1 = r2.findViewById(r1)
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r1 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r1
            android.view.View r4 = r9.f290311f
            com.google.android.apps.g.d.cj r2 = r0.f31631b
            if (r2 != 0) goto L_0x002a
            com.google.android.apps.g.d.cj r2 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x002a:
            r5 = r2
            boolean r6 = r0.f31632c
            r7 = 0
            r8 = 0
            r2 = r9
            r3 = r4
            r2.mo94124p(r3, r4, r5, r6, r7, r8)
            int r2 = r0.f31630a
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x004e
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r0.f31640k
            float r3 = (float) r3
            android.content.Context r4 = r9.f290307b
            float r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r3, r4)
            int r3 = (int) r3
            r2.height = r3
            r1.setLayoutParams(r2)
            goto L_0x005d
        L_0x004e:
            r2 = r2 & 8
            if (r2 == 0) goto L_0x005d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r0.f31634e
            r2.height = r3
            r1.setLayoutParams(r2)
        L_0x005d:
            android.view.View r2 = r9.f290311f
            r3 = 2131432374(0x7f0b13b6, float:1.8486504E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r0.f31630a
            r4 = r3 & 32
            r5 = 0
            if (r4 == 0) goto L_0x0070
            goto L_0x007c
        L_0x0070:
            r6 = r3 & 64
            if (r6 != 0) goto L_0x007c
            r6 = r3 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x007c
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x00c6
        L_0x007c:
            if (r4 == 0) goto L_0x0089
            int r3 = r0.f31636g
            float r3 = (float) r3
            android.content.Context r4 = r9.f290307b
            float r3 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r3, r4)
            int r3 = (int) r3
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            int r4 = r0.f31630a
            r4 = r4 & 64
            if (r4 == 0) goto L_0x009b
            int r4 = r0.f31637h
            float r4 = (float) r4
            android.content.Context r6 = r9.f290307b
            float r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r6)
            int r4 = (int) r4
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            int r6 = r0.f31630a
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00ad
            int r6 = r0.f31638i
            float r6 = (float) r6
            android.content.Context r7 = r9.f290307b
            float r6 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r6, r7)
            int r6 = (int) r6
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            int r7 = r0.f31630a
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00bf
            int r7 = r0.f31639j
            float r7 = (float) r7
            android.content.Context r8 = r9.f290307b
            float r7 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r7, r8)
            int r7 = (int) r7
            goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            r2.getClass()
            r2.setPadding(r3, r6, r4, r7)
        L_0x00c6:
            int r2 = r0.f31630a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00d5
            boolean r2 = r0.f31635f
            if (r2 == 0) goto L_0x00d5
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r2)
        L_0x00d5:
            java.lang.String r2 = r0.f31633d
            boolean r2 = r2.isEmpty()
            r3 = 2
            r4 = 1
            if (r2 != 0) goto L_0x00ea
            java.lang.String r0 = r0.f31633d
            r1.setContentDescription(r0)
            android.view.View r0 = r9.f290311f
            r0.setImportantForAccessibility(r5)
            goto L_0x0101
        L_0x00ea:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r0 = r9.f290314i
            boolean r0 = r0.f290335e
            if (r0 == 0) goto L_0x00f9
            r1.setImportantForAccessibility(r3)
            android.view.View r0 = r9.f290311f
            r0.setImportantForAccessibility(r4)
            goto L_0x0101
        L_0x00f9:
            r1.setImportantForAccessibility(r3)
            android.view.View r0 = r9.f290311f
            r0.setImportantForAccessibility(r3)
        L_0x0101:
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r0 = r9.f290309d
            if (r0 == 0) goto L_0x0117
            int r2 = r0.mo86100o(r9)
            if (r2 != 0) goto L_0x010d
            r3 = 1
            goto L_0x010e
        L_0x010d:
            r3 = 0
        L_0x010e:
            int r0 = r0.mo86099n()
            int r0 = r0 + -1
            if (r2 != r0) goto L_0x013d
            goto L_0x0130
        L_0x0117:
            com.google.android.apps.g.d.v r0 = r9.f290310e
            int r0 = r0.f32184R
            int r2 = com.google.p375ai.p378b.C7693gl.m22807a(r0)
            if (r2 != 0) goto L_0x0123
        L_0x0121:
            r3 = 0
            goto L_0x0126
        L_0x0123:
            if (r2 != r3) goto L_0x0121
            r3 = 1
        L_0x0126:
            int r2 = com.google.p375ai.p378b.C7693gl.m22807a(r0)
            if (r2 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r6 = 4
            if (r2 != r6) goto L_0x0132
        L_0x0130:
            r5 = 1
            goto L_0x013d
        L_0x0132:
            int r0 = com.google.p375ai.p378b.C7693gl.m22807a(r0)
            if (r0 != 0) goto L_0x0139
            goto L_0x013d
        L_0x0139:
            r2 = 7
            if (r0 != r2) goto L_0x013d
            goto L_0x0130
        L_0x013d:
            if (r3 == 0) goto L_0x014d
            r0 = 3
            r1.mo76724hc(r0)
            android.content.Context r0 = r9.f290307b
            int r0 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r0)
            r1.mo76723hb(r0)
            goto L_0x015d
        L_0x014d:
            if (r5 == 0) goto L_0x015d
            r0 = 12
            r1.mo76724hc(r0)
            android.content.Context r0 = r9.f290307b
            int r0 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r0)
            r1.mo76723hb(r0)
        L_0x015d:
            com.google.android.apps.g.d.v r0 = r9.f290310e
            int r0 = r0.f32192a
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x017a
            android.view.View r0 = r9.f290311f
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.content.Context r1 = r9.f290307b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131233965(0x7f080cad, float:1.8084082E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setForeground(r1)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104906ad.mo94020e():void");
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        RoundedCornerWebImageView roundedCornerWebImageView = (RoundedCornerWebImageView) this.f290311f.findViewById(R.id.photo);
        if (roundedCornerWebImageView != null) {
            roundedCornerWebImageView.setContentDescription((CharSequence) null);
            roundedCornerWebImageView.setImportantForAccessibility(0);
            this.f290311f.setImportantForAccessibility(0);
        }
    }
}
