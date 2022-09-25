package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.Animator;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25987b;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.a */
/* compiled from: PG */
public final class C25943a extends C0640fb {

    /* renamed from: a */
    public final C25994i f70506a;

    /* renamed from: b */
    public boolean f70507b;

    /* renamed from: c */
    public int f70508c = 0;

    /* renamed from: d */
    private final C25950f f70509d;

    /* renamed from: e */
    private final LayoutInflater f70510e;

    /* renamed from: f */
    private final C28310af f70511f;

    /* renamed from: g */
    private final C28306ab f70512g;

    /* renamed from: h */
    private final C25987b f70513h;

    /* renamed from: i */
    private final C47770dh f70514i;

    /* renamed from: j */
    private final boolean f70515j;

    public C25943a(C25994i iVar, C28310af afVar, C28306ab abVar, C25987b bVar, C47770dh dhVar, C25950f fVar, LayoutInflater layoutInflater, boolean z, boolean z2) {
        this.f70506a = iVar;
        this.f70511f = afVar;
        this.f70512g = abVar;
        this.f70513h = bVar;
        this.f70514i = dhVar;
        this.f70509d = fVar;
        this.f70510e = layoutInflater;
        this.f70507b = z;
        this.f70515j = z2;
    }

    public final int getItemCount() {
        return this.f70506a.f70648a.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(android.support.p033v7.widget.C0673gh r12, int r13) {
        /*
            r11 = this;
            com.google.android.libraries.lens.view.filters.carousel.g r12 = (com.google.android.libraries.lens.view.filters.carousel.C25951g) r12
            com.google.android.libraries.lens.view.filters.e.i r0 = r11.f70506a
            com.google.android.libraries.lens.view.filters.e.a.e r0 = r0.mo31209b(r13)
            boolean r1 = r11.f70515j
            if (r1 == 0) goto L_0x0022
            com.google.android.libraries.logging.ve.ab r1 = r11.f70512g
            android.view.View r2 = r12.itemView
            com.google.android.libraries.logging.ve.af r3 = r11.f70511f
            int r4 = r0.mo31182a()
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)
            r1.mo33802c(r2, r3)
            goto L_0x004b
        L_0x0022:
            com.google.common.base.ax r1 = r0.mo31186e()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x004b
            com.google.android.libraries.logging.ve.ab r1 = r11.f70512g
            android.view.View r2 = r12.itemView
            com.google.android.libraries.logging.ve.af r3 = r11.f70511f
            com.google.common.base.ax r4 = r0.mo31186e()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)
            r1.mo33802c(r2, r3)
        L_0x004b:
            boolean r1 = r11.f70507b
            com.google.android.libraries.lens.view.filters.carousel.f r2 = r11.f70509d
            com.google.android.libraries.lens.view.filters.e.b r3 = r11.f70513h
            com.google.apps.tiktok.tracing.dh r4 = r11.f70514i
            android.widget.TextView r5 = r12.f70530a
            java.lang.String r6 = r0.mo31190h()
            r5.setText(r6)
            android.widget.TextView r5 = r12.f70530a
            int r6 = r0.mo31183b()
            r5.setId(r6)
            android.widget.TextView r5 = r12.f70530a
            android.content.Context r6 = r5.getContext()
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r0.mo31190h()
            r10 = 0
            r8[r10] = r9
            r9 = 2132089020(0x7f1518bc, float:1.981834E38)
            java.lang.String r6 = r6.getString(r9, r8)
            r5.setContentDescription(r6)
            com.google.android.libraries.lens.view.filters.e.a.d r0 = r0.mo31185d()
            boolean r5 = r3.f70640i
            if (r5 == 0) goto L_0x01bb
            if (r1 != 0) goto L_0x01bb
            com.google.android.libraries.lens.view.filters.e.a.d r1 = com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d.TRANSLATE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01bb
            com.google.android.libraries.lens.view.filters.e.i r1 = r3.f70634c
            com.google.android.libraries.lens.view.filters.e.a.d r1 = r1.f70649b
            if (r0 == r1) goto L_0x01bb
            com.google.common.base.ax r0 = r3.f70641j
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x00b7
            com.google.android.libraries.lens.view.ak.bd r0 = r3.f70637f
            com.google.android.libraries.lens.view.ak.m r0 = r0.mo30349e()
            int r0 = r0.f68755c
            r1 = 3
            if (r0 < r1) goto L_0x00ac
            r0 = 1
            goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r3.f70641j = r0
        L_0x00b7:
            com.google.common.base.ax r0 = r3.f70641j
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01bb
            com.google.android.libraries.lens.view.l.l r0 = r3.f70638g
            com.google.common.base.ax r0 = r0.mo32701h()
            boolean r0 = com.google.lens.p4711m.C62632i.m94819d(r0)
            if (r0 == 0) goto L_0x01bb
            com.google.android.libraries.lens.view.d.a r0 = r3.f70639h
            java.lang.Object r0 = r0.mo3842a()
            com.google.android.libraries.lens.view.onboarding.af r0 = (com.google.android.libraries.lens.view.onboarding.C27473af) r0
            boolean r0 = r0.mo33010b()
            if (r0 != 0) goto L_0x01bb
            android.view.ViewStub r0 = r12.f70531b
            r0.setVisibility(r10)
            android.view.View r0 = r12.itemView
            r1 = 2131431040(0x7f0b0e80, float:1.8483798E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = 2131431041(0x7f0b0e81, float:1.84838E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r5 = com.google.android.material.p3505b.C44534d.m78715b()
            if (r5 == 0) goto L_0x012c
            android.content.Context r5 = r0.getContext()
            r6 = 2130969163(0x7f04024b, float:1.7547E38)
            int r5 = com.google.android.libraries.material.p2206b.C28506b.m53284a(r5, r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r1.setBackgroundTintList(r5)
            r6 = 2131431039(0x7f0b0e7f, float:1.8483796E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageTintList(r5)
            android.content.Context r5 = r0.getContext()
            r6 = 2130969119(0x7f04021f, float:1.754691E38)
            int r5 = com.google.android.libraries.material.p2206b.C28506b.m53284a(r5, r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r1.setTextColor(r5)
        L_0x012c:
            com.google.common.o.i.m r1 = com.google.common.p4552o.p4563i.C59963m.f162060c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.i.l r1 = (com.google.common.p4552o.p4563i.C59962l) r1
            com.google.bp.f.b.a.df r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.common.o.i.m r6 = (com.google.common.p4552o.p4563i.C59963m) r6
            int r5 = r5.f150068m
            r6.f162063b = r5
            int r5 = r6.f162062a
            r5 = r5 | r7
            r6.f162062a = r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.i.m r1 = (com.google.common.p4552o.p4563i.C59963m) r1
            com.google.android.libraries.logging.ve.ab r5 = r3.f70635d
            com.google.android.libraries.logging.ve.af r6 = r5.f76990a
            r7 = 134261(0x20c75, float:1.8814E-40)
            com.google.android.libraries.logging.ve.h r7 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r7)
            com.google.android.libraries.logging.ve.c r6 = r6.mo33805a(r7)
            com.google.common.o.ado r7 = com.google.common.p4552o.ado.f158388g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.adn r7 = (com.google.common.p4552o.adn) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.ado r8 = (com.google.common.p4552o.ado) r8
            r1.getClass()
            r8.f158394d = r1
            int r1 = r8.f158391a
            r1 = r1 | 8
            r8.f158391a = r1
            com.google.protobuf.bv r1 = r7.build()
            com.google.common.o.ado r1 = (com.google.common.p4552o.ado) r1
            com.google.protobuf.bt r7 = com.google.android.libraries.lens.view.p2090ba.C25686g.f69825a
            com.google.android.libraries.logging.ve.e r8 = new com.google.android.libraries.logging.ve.e
            r8.<init>(r7, r1)
            r6.mo33858f(r8)
            r5.mo33802c(r0, r6)
            j$.time.Duration r1 = r3.f70636e
            boolean r5 = r1.isNegative()
            if (r5 != 0) goto L_0x01d6
            android.content.Context r5 = r0.getContext()
            r6 = 2130837510(0x7f020006, float:1.7279976E38)
            android.animation.Animator r5 = android.animation.AnimatorInflater.loadAnimator(r5, r6)
            r12.f70537h = r5
            android.animation.Animator r5 = r12.f70537h
            long r6 = r1.toMillis()
            r5.setStartDelay(r6)
            android.animation.Animator r1 = r12.f70537h
            com.google.android.libraries.lens.view.filters.carousel.e r5 = new com.google.android.libraries.lens.view.filters.carousel.e
            r5.<init>(r12, r3)
            r1.addListener(r5)
            android.animation.Animator r1 = r12.f70537h
            r1.setTarget(r0)
            android.animation.Animator r0 = r12.f70537h
            r0.start()
            goto L_0x01d6
        L_0x01bb:
            android.animation.Animator r0 = r12.f70537h
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x01d6
            android.animation.Animator r0 = r12.f70537h
            r0.cancel()
            android.animation.Animator r0 = r12.f70537h
            r5 = 0
            r0.setStartDelay(r5)
            android.animation.Animator r0 = r12.f70537h
            r0.start()
        L_0x01d6:
            android.view.View r0 = r12.itemView
            com.google.android.libraries.lens.view.filters.carousel.d r1 = new com.google.android.libraries.lens.view.filters.carousel.d
            r1.<init>(r12, r2)
            com.google.apps.tiktok.tracing.co r2 = new com.google.apps.tiktok.tracing.co
            java.lang.String r3 = "Clicked filter"
            r2.<init>(r4, r3, r1)
            r0.setOnClickListener(r2)
            android.view.View r0 = r12.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v7.widget.fp r0 = (android.support.p033v7.widget.C0654fp) r0
            r0.getClass()
            if (r13 != 0) goto L_0x01fb
            int r13 = r11.f70508c
            int r13 = r13 / 2
            r1 = r13
            r13 = 0
            goto L_0x01fc
        L_0x01fb:
            r1 = 0
        L_0x01fc:
            com.google.android.libraries.lens.view.filters.e.i r2 = r11.f70506a
            com.google.common.b.gu r2 = r2.f70648a
            int r2 = r2.size()
            int r2 = r2 + -1
            if (r13 != r2) goto L_0x020c
            int r13 = r11.f70508c
            int r10 = r13 / 2
        L_0x020c:
            r0.setMarginStart(r1)
            r0.setMarginEnd(r10)
            android.view.View r12 = r12.itemView
            r12.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.filters.carousel.C25943a.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f70510e;
        if (C44534d.m78715b()) {
            layoutInflater = LayoutInflater.from(C44534d.m78716c(new ContextThemeWrapper(layoutInflater.getContext(), 2132150715)));
        }
        return new C25951g((FrameLayout) layoutInflater.inflate(R.layout.filter_carousel_item, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C25951g gVar = (C25951g) ghVar;
        Animator animator = gVar.f70537h;
        if (animator != null) {
            animator.end();
            gVar.f70537h = null;
        }
        C28306ab.m52929e(gVar.itemView);
    }
}
