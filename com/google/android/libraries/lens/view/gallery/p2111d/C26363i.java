package com.google.android.libraries.lens.view.gallery.p2111d;

import android.app.Activity;
import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.app.C1820g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.carousel.C25946b;
import com.google.android.libraries.lens.view.filters.carousel.C25960p;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.android.libraries.lens.view.gallery.p2110c.C26336d;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.sampleimages.C27711o;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.i */
/* compiled from: PG */
public final class C26363i extends C0640fb {

    /* renamed from: A */
    private final C25960p f71678A;

    /* renamed from: a */
    public final C26373s f71679a;

    /* renamed from: b */
    public final int f71680b;

    /* renamed from: c */
    public final int f71681c;

    /* renamed from: d */
    public final int f71682d;

    /* renamed from: e */
    public C26372r f71683e;

    /* renamed from: f */
    public C26338a f71684f;

    /* renamed from: g */
    public int f71685g;

    /* renamed from: h */
    private final Activity f71686h;

    /* renamed from: i */
    private final Context f71687i;

    /* renamed from: j */
    private final C21370a f71688j;

    /* renamed from: k */
    private final C47449e f71689k;

    /* renamed from: l */
    private final C28443m f71690l;

    /* renamed from: m */
    private final C27711o f71691m;

    /* renamed from: n */
    private final C28448r f71692n;

    /* renamed from: o */
    private final C25684e f71693o;

    /* renamed from: p */
    private final C26353ao f71694p;

    /* renamed from: q */
    private final C25504aj f71695q;

    /* renamed from: r */
    private final C26336d f71696r;

    /* renamed from: s */
    private final C47770dh f71697s;

    /* renamed from: t */
    private final C26354ap f71698t;

    /* renamed from: u */
    private final C27481an f71699u;

    /* renamed from: v */
    private final boolean f71700v;

    /* renamed from: w */
    private final boolean f71701w;

    /* renamed from: x */
    private final C24974a f71702x;

    /* renamed from: y */
    private final C26359e f71703y;

    /* renamed from: z */
    private final C25225bd f71704z;

    public C26363i(C26406y yVar, C26353ao aoVar, LayoutInflater layoutInflater, int i, C25960p pVar, int i2, Activity activity, Fragment fragment, C21370a aVar, C26373s sVar, C47449e eVar, C28443m mVar, C27711o oVar, C28448r rVar, C25684e eVar2, C28306ab abVar, C25504aj ajVar, C26336d dVar, C47770dh dhVar, C27232l lVar, boolean z, C24974a aVar2, C27481an anVar, C26359e eVar3, C25225bd bdVar) {
        C26373s sVar2 = sVar;
        this.f71686h = activity;
        Context context = fragment.getContext();
        this.f71687i = context;
        this.f71688j = aVar;
        this.f71679a = sVar2;
        this.f71689k = eVar;
        this.f71690l = mVar;
        this.f71691m = oVar;
        this.f71692n = rVar;
        this.f71693o = eVar2;
        this.f71694p = aoVar;
        this.f71695q = ajVar;
        this.f71696r = dVar;
        this.f71697s = dhVar;
        this.f71680b = i;
        this.f71678A = pVar;
        this.f71685g = i2;
        this.f71700v = z;
        this.f71702x = aVar2;
        this.f71699u = anVar;
        this.f71703y = eVar3;
        this.f71704z = bdVar;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.f71698t = new C26354ap(layoutInflater, abVar, i);
        this.f71681c = context.getResources().getDimensionPixelSize(R.dimen.lens_gallery_inner_padding);
        this.f71682d = context.getResources().getDimensionPixelSize(R.dimen.lens_gallery_section_top_padding);
        C26406y yVar2 = yVar;
        this.f71683e = sVar2.mo31570a(yVar, i);
        this.f71701w = C62632i.m94823h(lVar.mo32701h());
    }

    /* renamed from: a */
    public final C58833ax mo31554a() {
        for (int i = 0; i < getItemCount(); i++) {
            if (this.f71683e.mo31563b(i) == 5) {
                return C58833ax.m90834k(Integer.valueOf(i));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final boolean mo31555b() {
        boolean b = C1820g.m4992b(this.f71686h, this.f71695q.mo30532b());
        if (!b && this.f71704z.mo30357m()) {
            return false;
        }
        C25504aj ajVar = this.f71695q;
        if (!ajVar.mo30537g(ajVar.mo30532b()) || b) {
            return true;
        }
        return false;
    }

    public final int getItemCount() {
        if (this.f71684f == null) {
            return 0;
        }
        return this.f71683e.mo31562a();
    }

    public final int getItemViewType(int i) {
        return this.f71683e.mo31563b(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v21, types: [int] */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p033v7.widget.C0673gh r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.libraries.lens.view.gallery.d.r r3 = r0.f71683e
            int r3 = r3.mo31563b(r2)
            int r4 = r1.mItemViewType
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            com.google.common.base.C58838bb.m90883r(r4)
            r4 = 2
            r7 = 8
            switch(r3) {
                case 0: goto L_0x048e;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03c7;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02a4;
                case 5: goto L_0x019a;
                case 6: goto L_0x0024;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r3)
            throw r1
        L_0x0024:
            com.google.android.libraries.lens.view.gallery.d.y r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26379y) r1
            com.google.android.libraries.lens.view.sampleimages.o r3 = r0.f71691m
            com.google.android.libraries.lens.view.gallery.d.ap r8 = r1.f71758a
            r9 = 148621(0x2448d, float:2.08262E-40)
            android.view.View r10 = r1.itemView
            r8.mo31550b(r9, r10, r2)
            boolean r2 = r1.f71770m
            if (r2 == 0) goto L_0x006b
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71763f
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            float r9 = r1.f71761d
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71766i
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71761d
            float r9 = r1.f71762e
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71767j
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            float r9 = r1.f71761d
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71769l
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71761d
            float r9 = r1.f71762e
            r2.mo33197a(r8, r9, r8, r9)
            goto L_0x009f
        L_0x006b:
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71763f
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71761d
            float r9 = r1.f71762e
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71766i
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            float r9 = r1.f71761d
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71767j
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71761d
            float r9 = r1.f71762e
            r2.mo33197a(r8, r9, r8, r9)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71769l
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            float r9 = r1.f71761d
            r2.mo33197a(r8, r9, r8, r9)
        L_0x009f:
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71764g
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            r2.mo33197a(r8, r8, r8, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71765h
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            r2.mo33197a(r8, r8, r8, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71768k
            com.google.android.libraries.lens.view.sampleimages.widget.c r2 = r2.mo17754z()
            float r8 = r1.f71762e
            r2.mo33197a(r8, r8, r8, r8)
            boolean r2 = r1.f71760c
            if (r2 == 0) goto L_0x00da
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71767j
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.ARABIC
            r3.mo33190a(r2, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71768k
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.ENGLISH
            r3.mo33190a(r2, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71769l
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.JAPANESE
            r3.mo33190a(r2, r8)
            goto L_0x00f6
        L_0x00da:
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71763f
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.SHOP
            r3.mo33190a(r2, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71764g
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.PLANT
            r3.mo33190a(r2, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71765h
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.MATH
            r3.mo33190a(r2, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71766i
            com.google.android.libraries.lens.view.sampleimages.b r8 = com.google.android.libraries.lens.view.sampleimages.C27698b.TRANSLATE
            r3.mo33190a(r2, r8)
        L_0x00f6:
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r2 = r1.f71767j
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r3 = r1.f71768k
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r8 = r1.f71769l
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89848p(r2, r3, r8)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r3 = r1.f71763f
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r8 = r1.f71764g
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r9 = r1.f71765h
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r10 = r1.f71766i
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89849q(r3, r8, r9, r10)
            boolean r8 = r1.f71760c
            if (r5 == r8) goto L_0x0112
            r9 = r3
            goto L_0x0113
        L_0x0112:
            r9 = r2
        L_0x0113:
            if (r5 != r8) goto L_0x0116
            r2 = r3
        L_0x0116:
            r3 = r9
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r8 = r3.f156474d
            r10 = 0
        L_0x011c:
            if (r10 >= r8) goto L_0x012a
            java.lang.Object r11 = r9.get(r10)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r11 = (com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard) r11
            r11.setVisibility(r6)
            int r10 = r10 + 1
            goto L_0x011c
        L_0x012a:
            r8 = r2
            com.google.common.b.pq r8 = (com.google.common.p4522b.C58724pq) r8
            int r8 = r8.f156474d
            r10 = 0
        L_0x0130:
            if (r10 >= r8) goto L_0x013e
            java.lang.Object r11 = r2.get(r10)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r11 = (com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard) r11
            r11.setVisibility(r7)
            int r10 = r10 + 1
            goto L_0x0130
        L_0x013e:
            com.google.android.libraries.lens.view.ac.a r2 = r1.f71759b
            android.app.Activity r2 = r2.f68122a
            boolean r2 = com.google.android.libraries.lens.view.p2052ac.C24974a.m46225a(r2)
            android.view.View r7 = r1.itemView
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            if (r2 != 0) goto L_0x015a
            if (r7 != r4) goto L_0x044b
        L_0x015a:
            int r3 = r3.f156474d
        L_0x015c:
            if (r6 >= r3) goto L_0x044b
            java.lang.Object r4 = r9.get(r6)
            com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard r4 = (com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard) r4
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            r7.getClass()
            androidx.constraintlayout.widget.d r7 = (androidx.constraintlayout.widget.C1745d) r7
            android.view.View r8 = r1.itemView
            android.content.res.Resources r8 = r8.getResources()
            if (r5 == r2) goto L_0x0179
            r10 = 2131169356(0x7f07104c, float:1.795304E38)
            goto L_0x017c
        L_0x0179:
            r10 = 2131169366(0x7f071056, float:1.795306E38)
        L_0x017c:
            int r8 = r8.getDimensionPixelSize(r10)
            r7.height = r8
            r8 = -1
            r7.f5247P = r8
            java.lang.String r8 = ""
            r7.f5238G = r8
            r4.setLayoutParams(r7)
            com.google.android.libraries.lens.view.sampleimages.widget.c r4 = r4.mo17754z()
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.google.android.libraries.lens.view.common.RoundedImageView r4 = r4.f75674c
            r4.setScaleType(r7)
            int r6 = r6 + 1
            goto L_0x015c
        L_0x019a:
            com.google.android.libraries.lens.view.gallery.d.d r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26358d) r1
            com.google.android.libraries.lens.view.gallery.d.a r3 = r0.f71684f
            r3.getClass()
            com.google.android.libraries.lens.view.onboarding.an r4 = r0.f71699u
            boolean r4 = r4.mo33017b()
            com.google.android.libraries.lens.view.filters.carousel.p r7 = r0.f71678A
            int r8 = r0.f71685g
            com.google.android.libraries.logging.ve.m r9 = r0.f71690l
            com.google.apps.tiktok.tracing.dh r10 = r0.f71697s
            com.google.android.libraries.lens.view.gallery.d.ap r11 = r1.f71655c
            r12 = 125099(0x1e8ab, float:1.75301E-40)
            android.view.View r13 = r1.itemView
            r11.mo31550b(r12, r13, r2)
            if (r4 == 0) goto L_0x026e
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = r1.f71656d
            if (r2 != 0) goto L_0x0283
            android.view.View r2 = r1.itemView
            android.content.Context r2 = r2.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r4 = r1.itemView
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r11 = 2131624997(0x7f0e0425, float:1.887719E38)
            android.view.View r2 = r2.inflate(r11, r4, r6)
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = (com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView) r2
            r1.f71656d = r2
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = r1.f71656d
            android.view.View r4 = r1.itemView
            android.content.Context r4 = r4.getContext()
            com.google.android.libraries.lens.view.filters.carousel.q r11 = r2.mo17754z()
            com.google.android.libraries.lens.view.filters.carousel.b r12 = r1.f71654b
            com.google.android.libraries.lens.view.gallery.d.b r13 = new com.google.android.libraries.lens.view.gallery.d.b
            r13.<init>(r2)
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r4)
            com.google.android.libraries.lens.view.filters.carousel.a r5 = r12.mo31129a(r13, r14, r6, r5)
            android.support.v7.widget.RecyclerView r6 = r11.f70552e
            r6.setAdapter(r5)
            com.google.android.libraries.lens.view.filters.carousel.q r5 = r2.mo17754z()
            com.google.android.libraries.lens.view.filters.e.d r6 = r1.f71653a
            com.google.android.libraries.lens.view.filters.e.i r6 = r6.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r11 = r6.f70649b
            int r6 = r6.mo31208a(r11)
            r5.mo31147i(r6)
            com.google.android.libraries.lens.view.filters.carousel.q r5 = r2.mo17754z()
            r5.f70557j = r7
            android.view.View r5 = r1.itemView
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.addView(r2)
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            r5.getClass()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            android.content.res.Resources r6 = r4.getResources()
            r7 = 2131169352(0x7f071048, float:1.7953032E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r5.bottomMargin = r6
            r2.setLayoutParams(r5)
            com.google.android.libraries.lens.view.filters.carousel.q r6 = r2.mo17754z()
            r7 = 2131102043(0x7f06095b, float:1.7816513E38)
            int r4 = androidx.core.content.C1878d.m5128a(r4, r7)
            com.google.android.libraries.lens.view.filters.carousel.WhiteChipView r7 = r6.f70553f
            int r6 = r6.f70554g
            r7.mo31123c(r4, r6)
            r4 = 80
            r5.gravity = r4
            r4 = -2
            r5.height = r4
            r2.setLayoutParams(r5)
            com.google.android.libraries.lens.view.gallery.d.ap r2 = r1.f71655c
            r4 = 144351(0x233df, float:2.02279E-40)
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r5 = r1.f71656d
            r2.mo31551c(r4, r5)
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = r1.f71656d
            com.google.android.libraries.lens.view.filters.carousel.q r2 = r2.mo17754z()
            r2.mo31148j(r8)
            android.view.View r2 = r1.itemView
            com.google.android.libraries.lens.view.filters.e.d r4 = r1.f71653a
            com.google.android.libraries.lens.view.filters.e.a.e r4 = r4.mo31203a()
            java.lang.String r4 = r4.mo31188f()
            r2.setContentDescription(r4)
            goto L_0x0283
        L_0x026e:
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = r1.f71656d
            if (r2 == 0) goto L_0x0283
            android.view.View r4 = r1.itemView
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r2)
            com.google.android.libraries.lens.view.gallery.d.ap r2 = r1.f71655c
            com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView r2 = r1.f71656d
            com.google.android.libraries.logging.p2185ve.C28306ab.m52929e(r2)
            r2 = 0
            r1.f71656d = r2
        L_0x0283:
            android.view.View r2 = r1.itemView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r3 = r3.f71596a
            r2.height = r3
            android.view.View r3 = r1.itemView
            r3.setLayoutParams(r2)
            android.view.View r1 = r1.itemView
            com.google.android.libraries.lens.view.gallery.d.c r2 = new com.google.android.libraries.lens.view.gallery.d.c
            r2.<init>(r9)
            com.google.apps.tiktok.tracing.co r3 = new com.google.apps.tiktok.tracing.co
            java.lang.String r4 = "Click camera passthrough"
            r3.<init>(r10, r4, r2)
            r1.setOnClickListener(r3)
            return
        L_0x02a4:
            com.google.android.libraries.lens.view.gallery.d.f r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26360f) r1
            com.google.android.libraries.lens.view.gallery.d.a r3 = r0.f71684f
            com.google.android.libraries.lens.view.gallery.d.ap r4 = r1.f71659a
            r5 = 118190(0x1cdae, float:1.6562E-40)
            android.view.View r6 = r1.itemView
            r4.mo31550b(r5, r6, r2)
            if (r3 == 0) goto L_0x044b
            android.view.View r2 = r1.itemView
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131169359(0x7f07104f, float:1.7953046E38)
            int r2 = r2.getDimensionPixelSize(r4)
            android.view.View r4 = r1.itemView
            android.view.ViewGroup r1 = r1.f71660b
            int r1 = r1.getHeight()
            r3.mo31532a(r4, r1, r2)
            return
        L_0x02cd:
            boolean r3 = r0.f71700v
            if (r3 == 0) goto L_0x0312
            com.google.android.libraries.lens.view.gallery.d.u r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26375u) r1
            boolean r2 = r16.mo31555b()
            r2 = r2 ^ r5
            com.google.android.libraries.logging.ve.m r3 = r0.f71690l
            com.google.apps.tiktok.tracing.dh r4 = r0.f71697s
            com.google.android.libraries.lens.view.gallery.d.ap r5 = r1.f71744a
            r6 = 150901(0x24d75, float:2.11457E-40)
            android.view.View r7 = r1.f71745b
            r5.mo31551c(r6, r7)
            android.view.View r5 = r1.f71745b
            r6 = 2131432772(0x7f0b1544, float:1.848731E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r2 == 0) goto L_0x02fa
            r6 = 2132088824(0x7f1517f8, float:1.9817942E38)
            r5.setText(r6)
            goto L_0x0300
        L_0x02fa:
            r6 = 2132088817(0x7f1517f1, float:1.9817928E38)
            r5.setText(r6)
        L_0x0300:
            android.view.View r1 = r1.f71745b
            com.google.android.libraries.lens.view.gallery.d.t r5 = new com.google.android.libraries.lens.view.gallery.d.t
            r5.<init>(r3, r2)
            com.google.apps.tiktok.tracing.co r2 = new com.google.apps.tiktok.tracing.co
            java.lang.String r3 = "Clicked Images Permission Card"
            r2.<init>(r4, r3, r5)
            r1.setOnClickListener(r2)
            return
        L_0x0312:
            com.google.android.libraries.lens.view.gallery.d.ab r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26340ab) r1
            boolean r3 = r16.mo31555b()
            r4 = r3 ^ 1
            com.google.android.libraries.lens.view.sampleimages.o r8 = r0.f71691m
            com.google.android.libraries.lens.view.gallery.d.a r9 = r0.f71684f
            com.google.android.libraries.lens.view.gallery.d.ap r10 = r1.f71599a
            r11 = 118192(0x1cdb0, float:1.65622E-40)
            android.view.View r12 = r1.itemView
            r10.mo31550b(r11, r12, r2)
            if (r5 == r3) goto L_0x032d
            r2 = 8
            goto L_0x032e
        L_0x032d:
            r2 = 0
        L_0x032e:
            if (r5 == r3) goto L_0x0332
            r3 = 0
            goto L_0x0334
        L_0x0332:
            r3 = 8
        L_0x0334:
            android.widget.Button r5 = r1.f71601c
            r5.setVisibility(r2)
            android.widget.Button r2 = r1.f71602d
            r2.setVisibility(r3)
            if (r4 == 0) goto L_0x0350
            android.widget.Button r2 = r1.f71602d
            com.google.android.libraries.lens.view.gallery.d.z r3 = com.google.android.libraries.lens.view.gallery.p2111d.C26380z.f71771a
            r4 = 115919(0x1c4cf, float:1.62437E-40)
            r8.mo33192c(r2, r4)
            java.lang.String r4 = "Clicked Open Settings Button"
            r8.mo33191b(r2, r3, r4)
            goto L_0x035f
        L_0x0350:
            android.widget.Button r2 = r1.f71601c
            com.google.android.libraries.lens.view.gallery.d.aa r3 = com.google.android.libraries.lens.view.gallery.p2111d.C26339aa.f71598a
            r4 = 114561(0x1bf81, float:1.60534E-40)
            r8.mo33192c(r2, r4)
            java.lang.String r4 = "Clicked Request Storage Button"
            r8.mo33191b(r2, r3, r4)
        L_0x035f:
            boolean r2 = r1.f71606h
            if (r2 == 0) goto L_0x0397
            android.view.View r2 = r1.f71603e
            r2.setVisibility(r7)
            android.view.View r2 = r1.f71604f
            r2.setVisibility(r7)
            android.view.View r2 = r1.f71605g
            r2.setVisibility(r7)
            android.view.View r2 = r1.f71607i
            r2.setVisibility(r6)
            android.view.View r2 = r1.f71608j
            r2.setVisibility(r6)
            android.view.View r2 = r1.f71609k
            r2.setVisibility(r6)
            android.view.View r2 = r1.f71607i
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.ARABIC
            r8.mo33190a(r2, r3)
            android.view.View r2 = r1.f71608j
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.ENGLISH
            r8.mo33190a(r2, r3)
            android.view.View r2 = r1.f71609k
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.JAPANESE
            r8.mo33190a(r2, r3)
            goto L_0x03ac
        L_0x0397:
            android.view.View r2 = r1.f71603e
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.SHOP
            r8.mo33190a(r2, r3)
            android.view.View r2 = r1.f71604f
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.PLANT
            r8.mo33190a(r2, r3)
            android.view.View r2 = r1.f71605g
            com.google.android.libraries.lens.view.sampleimages.b r3 = com.google.android.libraries.lens.view.sampleimages.C27698b.MATH
            r8.mo33190a(r2, r3)
        L_0x03ac:
            if (r9 == 0) goto L_0x044b
            android.view.View r2 = r1.itemView
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131169360(0x7f071050, float:1.7953048E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.view.View r3 = r1.itemView
            android.view.ViewGroup r1 = r1.f71600b
            int r1 = r1.getHeight()
            r9.mo31532a(r3, r1, r2)
            return
        L_0x03c7:
            com.google.android.libraries.lens.view.gallery.d.ai r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26347ai) r1
            android.content.Context r2 = r0.f71687i
            r3 = 2132088831(0x7f1517ff, float:1.9817957E38)
            java.lang.String r2 = r2.getString(r3)
            r1.mo31540b(r2)
            return
        L_0x03d6:
            boolean r2 = r1 instanceof com.google.android.libraries.lens.view.gallery.p2111d.C26345ag
            java.lang.String r3 = "Click expand section"
            r4 = 118191(0x1cdaf, float:1.65621E-40)
            if (r2 == 0) goto L_0x044c
            com.google.android.libraries.lens.view.gallery.d.ag r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26345ag) r1
            com.google.android.libraries.logging.ve.m r2 = r0.f71690l
            com.google.android.libraries.logging.ve.r r8 = r0.f71692n
            com.google.android.libraries.lens.view.ba.e r9 = r0.f71693o
            com.google.apps.tiktok.tracing.dh r10 = r0.f71697s
            com.google.android.libraries.lens.view.gallery.d.r r11 = r0.f71683e
            com.google.common.b.gu r12 = r11.f71735d
            boolean r11 = r11.mo31568g()
            android.view.View r13 = r1.itemView
            android.content.Context r13 = r13.getContext()
            com.google.android.libraries.lens.view.gallery.d.ae r14 = new com.google.android.libraries.lens.view.gallery.d.ae
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.libraries.lens.view.gallery.d.ac r7 = new com.google.android.libraries.lens.view.gallery.d.ac
            r7.<init>(r13)
            j$.util.stream.Stream r7 = r15.map(r7)
            j$.util.stream.Collector r15 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r15)
            java.util.List r7 = (java.util.List) r7
            r14.<init>(r1, r13, r7)
            android.widget.Spinner r7 = r1.f71620b
            r7.setAdapter(r14)
            com.google.android.libraries.lens.view.gallery.d.ap r7 = r1.f71619a
            r13 = 141442(0x22882, float:1.98202E-40)
            android.widget.Spinner r14 = r1.f71620b
            r7.mo31551c(r13, r14)
            android.widget.Spinner r7 = r1.f71620b
            com.google.android.libraries.lens.view.gallery.d.af r13 = new com.google.android.libraries.lens.view.gallery.d.af
            r13.<init>(r1, r12, r8, r9)
            r7.setOnItemSelectedListener(r13)
            android.widget.TextView r7 = r1.f71621c
            if (r5 == r11) goto L_0x0430
            r6 = 8
        L_0x0430:
            r7.setVisibility(r6)
            if (r11 == 0) goto L_0x044b
            com.google.android.libraries.lens.view.gallery.d.ap r5 = r1.f71619a
            android.widget.TextView r6 = r1.f71621c
            r5.mo31551c(r4, r6)
            android.widget.TextView r1 = r1.f71621c
            com.google.android.libraries.lens.view.gallery.d.ad r4 = new com.google.android.libraries.lens.view.gallery.d.ad
            r4.<init>(r2)
            com.google.apps.tiktok.tracing.co r2 = new com.google.apps.tiktok.tracing.co
            r2.<init>(r10, r3, r4)
            r1.setOnClickListener(r2)
        L_0x044b:
            return
        L_0x044c:
            com.google.android.libraries.lens.view.gallery.d.ai r1 = (com.google.android.libraries.lens.view.gallery.p2111d.C26347ai) r1
            com.google.android.libraries.lens.view.gallery.d.r r2 = r0.f71683e
            boolean r2 = r2.mo31568g()
            r5 = 2132088828(0x7f1517fc, float:1.981795E38)
            if (r2 == 0) goto L_0x0484
            android.content.Context r2 = r0.f71687i
            java.lang.String r2 = r2.getString(r5)
            com.google.apps.tiktok.tracing.dh r5 = r0.f71697s
            com.google.android.libraries.logging.ve.m r7 = r0.f71690l
            android.widget.TextView r8 = r1.f71624b
            r8.setText(r2)
            android.widget.TextView r2 = r1.f71625c
            r2.setVisibility(r6)
            com.google.android.libraries.lens.view.gallery.d.ap r2 = r1.f71623a
            android.widget.TextView r6 = r1.f71625c
            r2.mo31551c(r4, r6)
            android.widget.TextView r1 = r1.f71625c
            com.google.android.libraries.lens.view.gallery.d.ah r2 = new com.google.android.libraries.lens.view.gallery.d.ah
            r2.<init>(r7)
            com.google.apps.tiktok.tracing.co r4 = new com.google.apps.tiktok.tracing.co
            r4.<init>(r5, r3, r2)
            r1.setOnClickListener(r4)
            return
        L_0x0484:
            android.content.Context r2 = r0.f71687i
            java.lang.String r2 = r2.getString(r5)
            r1.mo31540b(r2)
            return
        L_0x048e:
            r3 = r1
            com.google.android.libraries.lens.view.gallery.d.x r3 = (com.google.android.libraries.lens.view.gallery.p2111d.C26378x) r3
            com.google.android.libraries.lens.view.gallery.d.r r1 = r0.f71683e
            com.google.android.libraries.lens.view.gallery.data.w r1 = r1.mo31566e(r2)
            com.google.android.libraries.lens.view.gallery.d.r r7 = r0.f71683e
            int r7 = r7.mo31569h(r2)
            if (r7 != r4) goto L_0x04a0
            r6 = 1
        L_0x04a0:
            com.google.android.libraries.lens.view.gallery.d.r r5 = r0.f71683e
            int r8 = r5.mo31565d(r2)
            if (r1 != 0) goto L_0x04e0
            com.google.android.libraries.lens.view.gallery.d.r r1 = r0.f71683e
            int r1 = r1.mo31564c(r2)
            com.google.android.libraries.lens.view.gallery.d.ap r2 = r3.f71753a
            com.google.android.libraries.lens.view.common.RoundedImageView r5 = r3.f71755c
            r2.mo31552d(r5, r8, r1)
            com.google.android.libraries.lens.view.common.RoundedImageView r1 = r3.f71755c
            com.google.android.libraries.lens.view.common.d r1 = r1.mo17754z()
            if (r7 != r4) goto L_0x04c0
            r2 = 1069547520(0x3fc00000, float:1.5)
            goto L_0x04c2
        L_0x04c0:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x04c2:
            r1.mo30898b(r2)
            com.google.android.libraries.lens.view.common.RoundedImageView r1 = r3.f71755c
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.content.Context r5 = r1.getContext()
            r6 = 2131101927(0x7f0608e7, float:1.7816278E38)
            int r5 = r5.getColor(r6)
            r2.<init>(r5)
            r1.setImageDrawable(r2)
            android.view.View r1 = r3.itemView
            r1.setImportantForAccessibility(r4)
            return
        L_0x04e0:
            com.google.android.libraries.lens.view.gallery.d.r r4 = r0.f71683e
            int r2 = r4.mo31564c(r2)
            com.google.android.libraries.lens.view.gallery.c.d r9 = r0.f71696r
            com.google.android.libraries.f.a r10 = r0.f71688j
            com.google.android.libraries.logging.ve.m r11 = r0.f71690l
            com.google.apps.tiktok.tracing.dh r12 = r0.f71697s
            r4 = r1
            r5 = r7
            r7 = r8
            r8 = r2
            r3.mo31573b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gallery.p2111d.C26363i.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final void onViewRecycled(C0673gh ghVar) {
        ((C26355aq) ghVar).mo31534a();
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C26378x(viewGroup, this.f71698t, this.f71689k, this.f71694p);
            case 1:
                if (this.f71683e.mo31567f()) {
                    return new C26345ag(viewGroup, this.f71698t);
                }
                return new C26347ai(viewGroup, this.f71698t);
            case 2:
                return new C26347ai(viewGroup, this.f71698t);
            case 3:
                if (this.f71700v) {
                    return new C26375u(viewGroup, this.f71698t);
                }
                return new C26340ab(viewGroup, this.f71698t, this.f71701w);
            case 4:
                return new C26360f(viewGroup, this.f71698t);
            case 5:
                C26359e eVar = this.f71703y;
                C26354ap apVar = this.f71698t;
                C25989d dVar = (C25989d) eVar.f71657a.mo17428b();
                dVar.getClass();
                C25946b bVar = (C25946b) eVar.f71658b.mo17428b();
                bVar.getClass();
                return new C26358d(dVar, bVar, viewGroup, apVar);
            case 6:
                return new C26379y(viewGroup, this.f71698t, this.f71702x, this.f71701w);
            default:
                throw new AssertionError(i);
        }
    }
}
