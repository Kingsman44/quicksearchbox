package com.google.android.apps.gsa.staticplugins.nowcards.p8101b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ClusterCard;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.b.h */
/* compiled from: PG */
public final class C104295h extends C104348l {

    /* renamed from: A */
    private ClusterCard f290083A;

    /* renamed from: B */
    private int f290084B = 0;

    /* renamed from: y */
    View f290085y;

    /* renamed from: z */
    private boolean f290086z;

    public C104295h(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* renamed from: M */
    private final int m172320M() {
        return m172323P() ? R.id.cluster_title_lobby : R.id.cluster_title;
    }

    /* renamed from: N */
    private final void m172321N() {
        this.f290085y.setVisibility(8);
        if (this.f290084B != 0) {
            ((TextView) this.f290085y.findViewById(m172320M())).setTextColor(this.f290084B);
            this.f290084B = 0;
        }
        C91985d.m150957d(this.f290085y, R.id.cluster_justification);
        C91985d.m150957d(this.f290085y, R.id.cluster_secondary_label);
        View findViewById = this.f290085y.findViewById(R.id.cluster_divider);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f290083A.setTag(R.id.suggestion_grid_layout_full_bleed, (Object) null);
    }

    /* renamed from: O */
    private final void m172322O(View view) {
        int i;
        this.f290086z = mo94120n() != null || mo94108G();
        if (mo94109H()) {
            i = true != this.f290318m ? R.id.cluster_header_momo_light : R.id.cluster_header_momo_dark;
        } else {
            i = this.f290086z ? R.id.cluster_header_lobby : R.id.cluster_header;
        }
        this.f290085y = view.findViewById(i);
        this.f290083A = (ClusterCard) view;
    }

    /* renamed from: P */
    private final boolean m172323P() {
        return mo94109H() || this.f290086z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final int mo94035L() {
        if (!mo94108G()) {
            return R.layout.card_cluster;
        }
        CardRenderingContext n = mo94120n();
        return (n == null || !n.mo49317l()) ? R.layout.cluster_header_hq : R.layout.cluster_header_hq_v1p5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(mo94035L(), mo94115i(), false);
        m172322O(inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        View inflate = this.f290308c.f256406b.inflate(mo94035L(), viewGroup, false);
        m172322O(inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r10.f290314i.f290335e != false) goto L_0x0067;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94020e() {
        /*
            r10 = this;
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r0 = r10.f290083A
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r3 = 2131436282(0x7f0b22fa, float:1.849443E38)
            r0.setTag(r3, r2)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r0 = r10.f290314i
            boolean r0 = r0.f290335e
            r4 = 0
            if (r0 != 0) goto L_0x0022
            com.google.android.apps.gsa.shared.ui.an r0 = new com.google.android.apps.gsa.shared.ui.an
            r0.<init>((int) r4)
            r0.f253473b = r4
            r0.f253474c = r1
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r5 = r10.f290083A
            r5.setLayoutParams(r0)
        L_0x0022:
            com.google.android.apps.g.d.v r0 = r10.f290310e
            com.google.ai.b.hj r0 = r0.f32174H
            if (r0 != 0) goto L_0x002a
            com.google.ai.b.hj r0 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x002a:
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r5 = r10.f290083A
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r6 = r10.f290314i
            com.google.android.apps.gsa.sidekick.shared.h.a r6 = r6.f290333c
            r10.mo94120n()
            r5.f256357j = r6
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r5 = r10.f290083A
            int r6 = r0.f26966g
            com.google.ai.b.ik r6 = com.google.p375ai.p378b.C7746ik.m22834a(r6)
            if (r6 != 0) goto L_0x0041
            com.google.ai.b.ik r6 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0041:
            long r7 = r0.f26969j
            long r6 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150935a(r6, r7)
            r5.f256349b = r6
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r5 = r10.mo94120n()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r6 = r5.f118456b
            monitor-enter(r6)
            android.os.Bundle r5 = r5.f118457c     // Catch:{ all -> 0x005e }
            java.lang.String r7 = "SWIPE_ENABLED_KEY"
            boolean r5 = r5.getBoolean(r7, r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x0067
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x0061:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r5 = r10.f290314i
            boolean r5 = r5.f290335e
            if (r5 == 0) goto L_0x006d
        L_0x0067:
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r5 = r10.f290083A
            com.google.android.apps.gsa.shared.ui.ay r5 = r5.f256350c
            r5.f253515g = r4
        L_0x006d:
            int r5 = r0.f26955a
            r6 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0191
            com.google.ai.b.eu r0 = r0.f26934F
            if (r0 != 0) goto L_0x007a
            com.google.ai.b.eu r0 = com.google.p375ai.p378b.C7648eu.f26542o
        L_0x007a:
            int r5 = r0.f26544a
            r6 = r5 & 32
            if (r6 == 0) goto L_0x00b0
            int r6 = r0.f26549f
            int r6 = com.google.p375ai.p378b.C7647et.m22794a(r6)
            if (r6 != 0) goto L_0x0089
            goto L_0x00b0
        L_0x0089:
            r7 = 16
            if (r6 != r7) goto L_0x00b0
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r0 = r10.f290083A
            r1 = 2131435506(0x7f0b1ff2, float:1.8492856E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            r1 = 2131435505(0x7f0b1ff1, float:1.8492854E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.setVisibility(r4)
            r1.setVisibility(r4)
            r0 = 2131099730(0x7f060052, float:1.7811821E38)
            r1.setBackgroundResource(r0)
            return
        L_0x00b0:
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0191
            android.view.View r1 = r10.f290085y
            r1.setVisibility(r4)
            int r1 = r10.m172320M()
            android.view.View r5 = r10.f290085y
            java.lang.String r6 = r0.f26545b
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150960g(r5, r1, r6)
            int r5 = r0.f26548e
            if (r5 == 0) goto L_0x00da
            android.view.View r5 = r10.f290085y
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r5 = r1.getCurrentTextColor()
            r10.f290084B = r5
            int r5 = r0.f26548e
            r1.setTextColor(r5)
        L_0x00da:
            int r1 = r0.f26544a
            r5 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 & r1
            if (r5 == 0) goto L_0x013a
            r5 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r5
            if (r1 == 0) goto L_0x013a
            boolean r1 = r10.m172323P()
            if (r1 == 0) goto L_0x013a
            com.google.ai.b.xj r1 = r0.f26556m
            if (r1 != 0) goto L_0x00f2
            com.google.ai.b.xj r1 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x00f2:
            com.google.ai.b.ax r5 = r0.f26557n
            if (r5 != 0) goto L_0x00f8
            com.google.ai.b.ax r5 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x00f8:
            android.view.View r6 = r10.f290085y
            r7 = 2131429769(0x7f0b0989, float:1.848122E38)
            android.view.View r6 = r6.findViewById(r7)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r8 = r10.f290314i
            com.google.android.apps.gsa.shared.au.b.a r8 = r8.f290331a
            android.content.Context r9 = r10.f290307b
            java.lang.String r1 = r8.mo83231a(r9, r1)
            if (r1 == 0) goto L_0x013a
            if (r6 == 0) goto L_0x013a
            android.view.View r8 = r10.f290085y
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150961h(r8, r7, r1)
            android.content.Context r1 = r10.f290307b
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r10.f290314i
            com.google.android.apps.gsa.shared.au.b.a r7 = r7.f290331a
            com.google.android.apps.g.d.ad r1 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150979g(r1, r7, r4, r5)
            if (r1 == 0) goto L_0x0137
            android.content.Context r5 = r10.f290307b
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131233965(0x7f080cad, float:1.8084082E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r7)
            r6.setBackground(r5)
            r10.mo94103B(r6, r1)
        L_0x0137:
            r6.setVisibility(r4)
        L_0x013a:
            int r1 = r0.f26544a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0147
            android.view.View r1 = r10.f290085y
            int r5 = r0.f26547d
            r1.setBackgroundColor(r5)
        L_0x0147:
            boolean r1 = r10.m172323P()
            if (r1 == 0) goto L_0x0157
            android.view.View r1 = r10.f290085y
            r5 = 2131429768(0x7f0b0988, float:1.8481218E38)
            java.lang.String r6 = r0.f26546c
            com.google.android.apps.gsa.sidekick.shared.util.C91985d.m150961h(r1, r5, r6)
        L_0x0157:
            boolean r1 = r10.m172323P()
            if (r1 != 0) goto L_0x016d
            boolean r1 = r0.f26550g
            if (r1 == 0) goto L_0x016d
            android.view.View r1 = r10.f290085y
            r5 = 2131429762(0x7f0b0982, float:1.8481206E38)
            android.view.View r1 = r1.findViewById(r5)
            r1.setVisibility(r4)
        L_0x016d:
            boolean r1 = r10.m172323P()
            if (r1 == 0) goto L_0x0188
            com.google.android.apps.g.d.v r1 = r10.f290310e
            int r1 = r1.f32192a
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0188
            android.view.View r1 = r10.f290085y
            r5 = 2131429761(0x7f0b0981, float:1.8481204E38)
            android.view.View r1 = r1.findViewById(r5)
            r1.setVisibility(r4)
        L_0x0188:
            boolean r0 = r0.f26554k
            if (r0 == 0) goto L_0x0191
            com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard r0 = r10.f290083A
            r0.setTag(r3, r2)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8101b.C104295h.mo94020e():void");
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        m172321N();
    }

    /* renamed from: t */
    public final void mo94037t(boolean z) {
        if (!(z == this.f290318m || this.f290083A == null || !mo94109H())) {
            if (this.f290085y != null) {
                m172321N();
            }
            this.f290085y = this.f290083A.findViewById(z ? R.id.cluster_header_momo_dark : R.id.cluster_header_momo_light);
            mo94020e();
        }
        super.mo94037t(z);
    }
}
