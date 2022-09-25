package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.b */
/* compiled from: PG */
public final class C104929b extends C104348l {

    /* renamed from: A */
    private static final C59071e f292386A = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.g.b");

    /* renamed from: y */
    public static final C9277u[] f292387y = {C9277u.IMAGE_HEADER_LANDSCAPE, C9277u.IMAGE_HEADER_LANDSCAPE_SMALL};

    /* renamed from: B */
    private final C105070g f292388B;

    /* renamed from: z */
    View f292389z = null;

    public C104929b(Context context, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292388B = gVar;
    }

    /* renamed from: L */
    private static void m173951L(TextView textView) {
        if (textView != null) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return mo94019c(a, mo94115i());
    }

    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        C9277u uVar2 = C9277u.UNKNOWN;
        int ordinal = uVar.ordinal();
        if (!(ordinal == 17 || ordinal == 18)) {
            C59104x c = f292386A.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AdaptiveImageHeaderMP");
            ((C59052c) ((C59052c) c).mo56372aa(22067)).mo56389s("Bad AdaptiveImageHeader card module: %s", uVar);
        }
        this.f292389z = this.f290308c.f256406b.inflate(R.layout.qp_image_header_landscape, viewGroup, false);
        return this.f290308c.f256406b.inflate(R.layout.qp_image_header_landscape, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r19 = this;
            r7 = r19
            android.view.View r8 = r7.f290311f
            com.google.android.apps.g.d.v r9 = r7.f290310e
            com.google.android.apps.g.d.f r0 = r9.f32209p
            if (r0 != 0) goto L_0x000c
            com.google.android.apps.g.d.f r0 = com.google.android.apps.p489g.p494d.C9262f.f32035q
        L_0x000c:
            r10 = r0
            int r0 = r9.f32196c
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r0)
            if (r0 != 0) goto L_0x0017
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0017:
            r11 = r0
            android.content.Context r0 = r7.f290307b
            android.content.res.Resources r12 = r0.getResources()
            int r0 = r9.f32195b
            r0 = r0 & 128(0x80, float:1.794E-43)
            r1 = 2131436600(0x7f0b2438, float:1.8495075E38)
            r13 = 0
            if (r0 == 0) goto L_0x006b
            com.google.android.apps.g.d.v r0 = r9.f32182P
            if (r0 != 0) goto L_0x002f
            com.google.android.apps.g.d.v r2 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            goto L_0x0030
        L_0x002f:
            r2 = r0
        L_0x0030:
            boolean r2 = r2.f32181O
            if (r2 == 0) goto L_0x006b
            if (r0 != 0) goto L_0x0038
            com.google.android.apps.g.d.v r0 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
        L_0x0038:
            int r0 = r0.f32167A
            if (r0 != 0) goto L_0x006b
            int r0 = r8.getPaddingLeft()
            int r2 = r8.getPaddingRight()
            int r3 = r8.getPaddingBottom()
            r8.setPadding(r0, r13, r2, r3)
            android.view.View r0 = r8.findViewById(r1)
            android.content.Context r2 = r7.f290307b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131169613(0x7f07114d, float:1.7953561E38)
            int r2 = r2.getDimensionPixelSize(r3)
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            int r5 = r0.getPaddingBottom()
            r0.setPadding(r3, r2, r4, r5)
        L_0x006b:
            java.lang.String r0 = r10.f32038b
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150954a(r8, r1, r0)
            int r0 = r10.f32037a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0081
            android.content.Context r0 = r7.f290307b
            com.google.ai.b.uj r2 = r10.f32051o
            if (r2 != 0) goto L_0x007e
            com.google.ai.b.uj r2 = com.google.p375ai.p378b.C8069uj.f28398c
        L_0x007e:
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150959f(r0, r8, r1, r2)
        L_0x0081:
            int r0 = r10.f32037a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r10.f32039c
            r1 = 2131436197(0x7f0b22a5, float:1.8494258E38)
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150954a(r8, r1, r0)
            int r0 = r10.f32037a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00a0
            android.content.Context r0 = r7.f290307b
            com.google.ai.b.uj r2 = r10.f32052p
            if (r2 != 0) goto L_0x009d
            com.google.ai.b.uj r2 = com.google.p375ai.p378b.C8069uj.f28398c
        L_0x009d:
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150959f(r0, r8, r1, r2)
        L_0x00a0:
            com.google.protobuf.cq r0 = r10.f32047k
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00cb
            com.google.android.apps.gsa.staticplugins.nowcards.ui.g r0 = r7.f292388B
            android.content.Context r1 = r7.f290307b
            com.google.android.apps.gsa.sidekick.shared.ui.p r2 = r7.f290308c
            android.view.LayoutInflater r2 = r2.f256406b
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r19.mo94120n()
            r4 = 0
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r0 = r0.mo94516a(r1, r2, r4, r3)
            r1 = 2131433297(0x7f0b1751, float:1.8488376E38)
            android.view.View r1 = r8.findViewById(r1)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r1
            com.google.protobuf.cq r2 = r10.f32047k
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r3 = r7.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r3 = r3.f290349s
            r1.mo94502d(r0, r2, r3)
        L_0x00cb:
            java.lang.String r0 = r10.f32040d
            r1 = 2131432626(0x7f0b14b2, float:1.8487015E38)
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150954a(r8, r1, r0)
            boolean r0 = r10.f32041e
            r2 = -1
            r14 = 1
            if (r0 == 0) goto L_0x0118
            android.view.View r0 = r8.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131232963(0x7f0808c3, float:1.808205E38)
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r1)
            r3 = 168(0xa8, float:2.35E-43)
            r1.setAlpha(r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r2, r3)
            r1.setLevel(r14)
            int r3 = r1.getIntrinsicWidth()
            double r3 = (double) r3
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r1.getIntrinsicHeight()
            double r14 = (double) r4
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r5
            int r4 = (int) r14
            r1.setBounds(r13, r13, r3, r4)
            android.graphics.drawable.ScaleDrawable r3 = new android.graphics.drawable.ScaleDrawable
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.<init>(r1, r13, r4, r4)
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148882n(r0, r3)
        L_0x0118:
            r0 = 2131432362(0x7f0b13aa, float:1.848648E38)
            android.view.View r1 = r8.findViewById(r0)
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f32043g
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150954a(r8, r0, r1)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131103444(0x7f060ed4, float:1.7819354E38)
            int r1 = r12.getColor(r1)
            r0.setTextColor(r1)
            r1 = 2131100168(0x7f060208, float:1.781271E38)
            int r1 = r12.getColor(r1)
            r0.setBackgroundColor(r1)
        L_0x0140:
            int r0 = r10.f32037a
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x016f
            r0 = 2131430434(0x7f0b0c22, float:1.8482569E38)
            android.view.View r1 = r8.findViewById(r0)
            if (r1 == 0) goto L_0x016f
            com.google.android.apps.g.d.cj r1 = r10.f32049m
            if (r1 != 0) goto L_0x0155
            com.google.android.apps.g.d.cj r1 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x0155:
            java.lang.String r1 = r1.f31776b
            com.google.android.apps.gsa.now.shared.ui.WebImageView r0 = r7.mo94117k(r8, r0, r1)
            if (r0 == 0) goto L_0x016f
            int r1 = r10.f32037a
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x016f
            int r1 = r10.f32050n
            int r1 = com.google.p375ai.p378b.C7787jy.m22849a(r1)
            if (r1 != 0) goto L_0x016c
            r1 = 1
        L_0x016c:
            com.google.android.apps.gsa.sidekick.shared.util.C91961al.m150918b(r12, r0, r1)
        L_0x016f:
            r0 = 2131432374(0x7f0b13b6, float:1.8486504E38)
            android.view.View r14 = r8.findViewById(r0)
            int r0 = r10.f32037a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0181
            if (r14 == 0) goto L_0x0181
            r14.setVisibility(r13)
        L_0x0181:
            r15 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            android.view.View r0 = r8.findViewById(r15)
            r6 = r0
            com.google.android.apps.gsa.now.shared.ui.WebImageView r6 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r6
            boolean r0 = r10.f32044h
            r1 = -2
            if (r0 == 0) goto L_0x01ad
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r6.setScaleType(r0)
            r0 = 2131171482(0x7f07189a, float:1.7957352E38)
            float r0 = r12.getDimension(r0)
            int r0 = java.lang.Math.round(r0)
            r6.setMaxHeight(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r1
            r6.setLayoutParams(r0)
            goto L_0x01eb
        L_0x01ad:
            boolean r0 = r10.f32048l
            if (r0 == 0) goto L_0x01b7
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r6.setScaleType(r0)
            goto L_0x01eb
        L_0x01b7:
            boolean r0 = r10.f32045i
            if (r0 == 0) goto L_0x01eb
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r6.setScaleType(r0)
            r0 = 2131171535(0x7f0718cf, float:1.795746E38)
            float r0 = r12.getDimension(r0)
            int r0 = java.lang.Math.round(r0)
            r6.setMaxHeight(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r1
            r0 = 2131171480(0x7f071898, float:1.7957348E38)
            float r0 = r12.getDimension(r0)
            int r0 = java.lang.Math.round(r0)
            r6.setPadding(r13, r0, r13, r0)
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setBackgroundColor(r2)
        L_0x01eb:
            android.view.View r1 = r7.f290311f
            com.google.android.apps.g.d.cj r0 = r10.f32042f
            if (r0 != 0) goto L_0x01f3
            com.google.android.apps.g.d.cj r0 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x01f3:
            r3 = r0
            boolean r4 = r10.f32046j
            r5 = 0
            r17 = 0
            r0 = r19
            r2 = r6
            r18 = r6
            r6 = r17
            r0.mo94124p(r1, r2, r3, r4, r5, r6)
            int r0 = r10.f32037a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x022b
            com.google.android.apps.g.d.cj r0 = r10.f32042f
            if (r0 != 0) goto L_0x020f
            com.google.android.apps.g.d.cj r0 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
        L_0x020f:
            java.lang.String r0 = r0.f31776b
            r7.mo94117k(r8, r15, r0)
            com.google.android.apps.g.d.u r0 = com.google.android.apps.p489g.p494d.C9277u.IMAGE_HEADER_LANDSCAPE_SMALL
            if (r11 != r0) goto L_0x022b
            r0 = 2131171481(0x7f071899, float:1.795735E38)
            int r0 = r12.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r1 = r18.getLayoutParams()
            r1.height = r0
            r0 = r18
            r0.setLayoutParams(r1)
            goto L_0x022d
        L_0x022b:
            r0 = r18
        L_0x022d:
            int r1 = r9.f32192a
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0237
        L_0x0234:
            r16 = 1
            goto L_0x023f
        L_0x0237:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x023d
            goto L_0x0234
        L_0x023d:
            r16 = 0
        L_0x023f:
            android.view.View r1 = r7.f290311f
            r2 = 2131436337(0x7f0b2331, float:1.8494542E38)
            java.lang.Object r1 = r1.getTag(r2)
            if (r1 != 0) goto L_0x0253
            android.view.View r1 = r7.f290311f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            r1.setTag(r2, r3)
        L_0x0253:
            if (r0 == 0) goto L_0x02ad
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x02ad
            r1 = 4
            int[] r3 = new int[r1]
            r3 = {2131432626, 2131433297, 2131436197, 2131436600} // fill-array
            r4 = 0
        L_0x0264:
            if (r4 >= r1) goto L_0x0277
            r5 = r3[r4]
            android.view.View r5 = r8.findViewById(r5)
            if (r5 == 0) goto L_0x0274
            int r5 = r5.getVisibility()
            if (r5 != r2) goto L_0x02ad
        L_0x0274:
            int r4 = r4 + 1
            goto L_0x0264
        L_0x0277:
            if (r14 == 0) goto L_0x0299
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            if (r1 == 0) goto L_0x0299
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            boolean r1 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0299
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.leftMargin
            int r3 = r1.rightMargin
            int r4 = r1.bottomMargin
            r1.setMargins(r2, r13, r3, r4)
            r14.setLayoutParams(r1)
        L_0x0299:
            boolean r1 = r0 instanceof com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView
            if (r1 == 0) goto L_0x02ad
            r6 = r0
            com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView r6 = (com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView) r6
            r0 = 3
            r6.mo76724hc(r0)
            android.content.Context r0 = r7.f290307b
            int r0 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r0)
            r6.mo76723hb(r0)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104929b.mo94020e():void");
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        View view = this.f292389z;
        if (view != null) {
            TextView textView = (TextView) this.f290311f.findViewById(R.id.title);
            TextView textView2 = (TextView) this.f290311f.findViewById(R.id.title);
            m173951L(textView);
            textView.setMaxLines(textView2.getMaxLines());
            textView.setEllipsize(textView2.getEllipsize());
            textView.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            TextView textView3 = (TextView) this.f290311f.findViewById(R.id.subtitle);
            TextView textView4 = (TextView) view.findViewById(R.id.subtitle);
            m173951L(textView3);
            textView3.setMaxLines(textView4.getMaxLines());
            textView3.setEllipsize(textView4.getEllipsize());
            TextView textView5 = (TextView) this.f290311f.findViewById(R.id.justification);
            TextView textView6 = (TextView) view.findViewById(R.id.justification);
            if (!(textView5 == null || textView6 == null)) {
                m173951L(textView5);
                textView5.setCompoundDrawablePadding(textView6.getCompoundDrawablePadding());
                textView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            TextView textView7 = (TextView) this.f290311f.findViewById(R.id.image_caption);
            TextView textView8 = (TextView) view.findViewById(R.id.image_caption);
            if (!(textView7 == null || textView8 == null)) {
                m173951L(textView7);
                textView7.setTextColor(textView8.getTextColors());
                textView7.setBackgroundColor(textView8.getDrawingCacheBackgroundColor());
            }
            MetadataLineView metadataLineView = (MetadataLineView) this.f290311f.findViewById(R.id.metadata);
            if (metadataLineView != null) {
                metadataLineView.mo94501c();
            }
            View findViewById = this.f290311f.findViewById(R.id.image_frame);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            WebImageView webImageView = (WebImageView) this.f290311f.findViewById(R.id.photo);
            WebImageView webImageView2 = (WebImageView) view.findViewById(R.id.photo);
            if (webImageView != null) {
                webImageView.setLayoutParams(webImageView2.getLayoutParams());
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    /* renamed from: s */
    public final void mo94126s(C9278v vVar) {
        super.mo94126s(vVar);
        this.f290308c.mo86640a(false);
    }
}
