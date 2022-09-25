package com.google.android.libraries.lens.view.gallery;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.GridLayoutManager;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p092d.C1886a;
import androidx.p109f.p110a.C2248v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.gallery.data.C26398q;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.android.libraries.lens.view.gallery.p2108a.C26296a;
import com.google.android.libraries.lens.view.gallery.p2110c.C26336d;
import com.google.android.libraries.lens.view.gallery.p2111d.C26338a;
import com.google.android.libraries.lens.view.gallery.p2111d.C26353ao;
import com.google.android.libraries.lens.view.gallery.p2111d.C26359e;
import com.google.android.libraries.lens.view.gallery.p2111d.C26363i;
import com.google.android.libraries.lens.view.gallery.p2111d.C26364j;
import com.google.android.libraries.lens.view.gallery.p2111d.C26373s;
import com.google.android.libraries.lens.view.gallery.p2112e.C26408a;
import com.google.android.libraries.lens.view.gallery.p2112e.C26418k;
import com.google.android.libraries.lens.view.main.C27348ck;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2074ap.C25464d;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.sampleimages.C27711o;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.p3515l.C44782m;
import com.google.android.material.p3515l.C44783n;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.lens.p4711m.C62632i;
import dagger.p5294a.C68221g;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gallery.ac */
/* compiled from: PG */
public final class C26299ac implements C26312am {

    /* renamed from: A */
    public C26363i f71469A;

    /* renamed from: B */
    public C25464d f71470B;

    /* renamed from: C */
    public GalleryFrameLayout f71471C;

    /* renamed from: D */
    public View f71472D;

    /* renamed from: E */
    public View f71473E;

    /* renamed from: F */
    public GalleryRecyclerView f71474F;

    /* renamed from: G */
    public View f71475G;

    /* renamed from: H */
    public C26418k f71476H;

    /* renamed from: I */
    public C26408a f71477I;

    /* renamed from: J */
    public C2248v f71478J;

    /* renamed from: K */
    public boolean f71479K = true;

    /* renamed from: L */
    public boolean f71480L = false;

    /* renamed from: M */
    public Locale f71481M;

    /* renamed from: N */
    public Locale f71482N;

    /* renamed from: O */
    public int f71483O;

    /* renamed from: P */
    public C27348ck f71484P;

    /* renamed from: Q */
    public final C26398q f71485Q;

    /* renamed from: R */
    private final C26364j f71486R;

    /* renamed from: S */
    private final C24974a f71487S;

    /* renamed from: T */
    private final boolean f71488T;

    /* renamed from: U */
    private final ArgbEvaluator f71489U = new ArgbEvaluator();

    /* renamed from: V */
    private int f71490V = -1;

    /* renamed from: W */
    private boolean f71491W = false;

    /* renamed from: X */
    private boolean f71492X = false;

    /* renamed from: a */
    public final Executor f71493a;

    /* renamed from: b */
    public final AccountId f71494b;

    /* renamed from: c */
    public final C26422i f71495c;

    /* renamed from: d */
    public final C26393l f71496d;

    /* renamed from: e */
    public final C25537t f71497e;

    /* renamed from: f */
    public final C28443m f71498f;

    /* renamed from: g */
    public final C25752a f71499g;

    /* renamed from: h */
    public final C27481an f71500h;

    /* renamed from: i */
    public final boolean f71501i;

    /* renamed from: j */
    public final boolean f71502j;

    /* renamed from: k */
    public final C25504aj f71503k;

    /* renamed from: l */
    public final C25466f f71504l;

    /* renamed from: m */
    public final C26316aq f71505m;

    /* renamed from: n */
    public final C26353ao f71506n;

    /* renamed from: o */
    public final C28306ab f71507o;

    /* renamed from: p */
    public final C26059ax f71508p;

    /* renamed from: q */
    public final C47770dh f71509q;

    /* renamed from: r */
    public final C25989d f71510r;

    /* renamed from: s */
    public final C27232l f71511s;

    /* renamed from: t */
    public final C25941f f71512t;

    /* renamed from: u */
    public final C25225bd f71513u;

    /* renamed from: v */
    public final ValueAnimator f71514v = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: w */
    public final C26298ab f71515w = new C26298ab(this);

    /* renamed from: x */
    public int f71516x;

    /* renamed from: y */
    public int f71517y;

    /* renamed from: z */
    public Size f71518z;

    /* renamed from: com.google.android.libraries.lens.view.gallery.ac$a */
    /* compiled from: PG */
    public final class C26300a implements C47388b {
    }

    /* renamed from: com.google.android.libraries.lens.view.gallery.ac$b */
    /* compiled from: PG */
    public final class C26301b implements C47388b {
    }

    /* renamed from: com.google.android.libraries.lens.view.gallery.ac$c */
    /* compiled from: PG */
    public final class C26302c implements C47388b {

        /* renamed from: a */
        public final float f71519a;

        public C26302c(float f) {
            this.f71519a = f;
        }
    }

    public C26299ac(Executor executor, AccountId accountId, C26422i iVar, C26364j jVar, C26393l lVar, C25537t tVar, C28443m mVar, C24974a aVar, C25752a aVar2, C27481an anVar, boolean z, boolean z2, boolean z3, C25504aj ajVar, C26398q qVar, C25466f fVar, C26316aq aqVar, C26353ao aoVar, C28306ab abVar, C26059ax axVar, C47770dh dhVar, C25989d dVar, C27232l lVar2, C25941f fVar2, C25225bd bdVar) {
        this.f71493a = executor;
        this.f71494b = accountId;
        this.f71495c = iVar;
        this.f71486R = jVar;
        this.f71496d = lVar;
        this.f71497e = tVar;
        this.f71498f = mVar;
        this.f71487S = aVar;
        this.f71499g = aVar2;
        this.f71500h = anVar;
        this.f71501i = z2;
        this.f71502j = z;
        this.f71488T = z3;
        this.f71503k = ajVar;
        this.f71485Q = qVar;
        this.f71504l = fVar;
        this.f71505m = aqVar;
        this.f71506n = aoVar;
        this.f71507o = abVar;
        this.f71508p = axVar;
        this.f71509q = dhVar;
        this.f71510r = dVar;
        this.f71511s = lVar2;
        this.f71512t = fVar2;
        this.f71513u = bdVar;
    }

    /* renamed from: n */
    private final C26406y m48544n() {
        if (this.f71502j || this.f71500h.mo33016a()) {
            return this.f71496d.mo31596c();
        }
        return C26406y.f71843c;
    }

    /* renamed from: a */
    public final int mo31501a() {
        if (this.f71518z == null) {
            return 0;
        }
        Resources resources = this.f71495c.getResources();
        int i = this.f71483O;
        GalleryRecyclerView galleryRecyclerView = this.f71474F;
        galleryRecyclerView.getClass();
        int paddingTop = (i + galleryRecyclerView.getPaddingTop()) - resources.getDimensionPixelSize(R.dimen.lens_gallery_camera_view_padding_bottom);
        if (this.f71500h.mo33017b() || C62632i.m94823h(this.f71511s.mo32701h())) {
            return this.f71518z.getHeight() - paddingTop;
        }
        return (this.f71518z.getHeight() - paddingTop) - resources.getDimensionPixelSize(R.dimen.lens_gallery_lvf_bottom_height);
    }

    /* renamed from: c */
    public final C26320b mo31503c() {
        return (C26320b) this.f71495c.getChildFragmentManager().f634a.mo671c("expanded_gallery_tag");
    }

    /* renamed from: d */
    public final void mo31504d() {
        View view = this.f71495c.getView();
        view.getClass();
        view.animate().alpha(0.0f).setDuration(250).withEndAction(new C26424k(view)).start();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31505e() {
        /*
            r10 = this;
            com.google.android.libraries.lens.view.gallery.data.y r0 = r10.m48544n()
            com.google.android.libraries.lens.view.gallery.d.i r1 = r10.f71469A
            if (r1 == 0) goto L_0x00af
            com.google.android.libraries.lens.view.gallery.d.r r2 = r1.f71683e
            com.google.android.libraries.lens.view.gallery.data.y r2 = r2.f71732a
            if (r0 != r2) goto L_0x0016
            com.google.android.libraries.lens.view.gallery.data.x r2 = r0.mo31579b()
            com.google.android.libraries.lens.view.gallery.data.x r3 = com.google.android.libraries.lens.view.gallery.data.C26405x.NO_PERMISSION
            if (r2 != r3) goto L_0x00af
        L_0x0016:
            com.google.android.libraries.lens.view.gallery.d.s r2 = r1.f71679a
            int r3 = r1.f71680b
            com.google.android.libraries.lens.view.gallery.d.r r0 = r2.mo31570a(r0, r3)
            com.google.android.libraries.lens.view.gallery.d.r r2 = r1.f71683e
            r1.f71683e = r0
            int r3 = r2.mo31562a()
            int r4 = r0.mo31562a()
            int r5 = java.lang.Math.min(r3, r4)
            r6 = 0
        L_0x002f:
            if (r6 >= r5) goto L_0x009f
            boolean r7 = com.google.android.libraries.lens.view.gallery.p2111d.C26366l.m48626a(r6, r2, r0)
            if (r7 == 0) goto L_0x0051
            int r7 = r6 + 1
        L_0x0039:
            if (r7 >= r5) goto L_0x0044
            boolean r8 = com.google.android.libraries.lens.view.gallery.p2111d.C26366l.m48626a(r7, r2, r0)
            if (r8 == 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x0039
        L_0x0044:
            int r8 = r7 - r6
            android.support.v7.widget.fc r9 = r1.mObservable
            r9.mo2883e(r6, r8)
            android.support.v7.widget.fc r9 = r1.mObservable
            r9.mo2882d(r6, r8)
            r6 = r7
        L_0x0051:
            if (r6 >= r5) goto L_0x009c
            int r7 = r2.mo31563b(r6)
            switch(r7) {
                case 0: goto L_0x0083;
                case 1: goto L_0x006e;
                case 2: goto L_0x009c;
                case 3: goto L_0x0099;
                case 4: goto L_0x009c;
                case 5: goto L_0x009c;
                case 6: goto L_0x009c;
                default: goto L_0x005a;
            }
        L_0x005a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid itemType"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006e:
            com.google.common.b.gu r7 = r2.f71735d
            com.google.common.b.gu r8 = r0.f71735d
            boolean r7 = com.google.common.p4522b.C58597ky.m90218i(r7, r8)
            if (r7 == 0) goto L_0x0099
            boolean r7 = r2.mo31568g()
            boolean r8 = r0.mo31568g()
            if (r7 == r8) goto L_0x009c
            goto L_0x0099
        L_0x0083:
            int r7 = r2.f71733b
            int r8 = r0.f71733b
            if (r7 != r8) goto L_0x0099
            int r7 = r2.mo31565d(r6)
            int r8 = r2.f71733b
            int r7 = r7 % r8
            int r8 = r0.mo31565d(r6)
            int r9 = r0.f71733b
            int r8 = r8 % r9
            if (r7 == r8) goto L_0x009c
        L_0x0099:
            r1.notifyItemChanged(r6)
        L_0x009c:
            int r6 = r6 + 1
            goto L_0x002f
        L_0x009f:
            if (r3 <= r5) goto L_0x00a7
            android.support.v7.widget.fc r0 = r1.mObservable
            int r3 = r3 - r5
            r0.mo2883e(r5, r3)
        L_0x00a7:
            if (r4 <= r5) goto L_0x00af
            android.support.v7.widget.fc r0 = r1.mObservable
            int r4 = r4 - r5
            r0.mo2882d(r5, r4)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gallery.C26299ac.mo31505e():void");
    }

    /* renamed from: f */
    public final void mo31506f() {
        if (this.f71495c.isResumed()) {
            this.f71480L = false;
            C47393f.m84236g(new C26301b(), this.f71495c);
            return;
        }
        this.f71480L = true;
    }

    /* renamed from: g */
    public final void mo31507g(float f, float f2) {
        View findViewById;
        C26408a aVar = this.f71477I;
        if (aVar != null) {
            aVar.f71847b = f;
            aVar.invalidateSelf();
        }
        float f3 = f / f2;
        float b = 1.0f - C1886a.m5144b(f3, 0.0f, 1.0f);
        if (this.f71474F != null) {
            C26298ab abVar = this.f71515w;
            if (!abVar.f71468c.f71500h.mo33017b() || abVar.f71468c.mo31513m()) {
                abVar.f71467b = b;
                abVar.mo31500a();
            }
            View view = this.f71473E;
            if (view != null) {
                view.setTranslationY(Math.min(f, f2) + ((float) this.f71516x));
            }
            if (this.f71500h.mo33017b()) {
                FilterCarouselView filterCarouselView = (FilterCarouselView) this.f71495c.requireView().findViewById(R.id.filter_carousel_view);
                if (filterCarouselView != null) {
                    filterCarouselView.mo17754z().mo31148j(((Integer) this.f71489U.evaluate(C1886a.m5144b(f3, 0.0f, 1.0f), Integer.valueOf(C1878d.m5128a(this.f71495c.requireContext(), R.color.filter_carousel_translucent_color)), Integer.valueOf(C1878d.m5128a(this.f71495c.requireContext(), R.color.filter_lvf_carousel_background)))).intValue());
                }
                if (!mo31513m() && this.f71495c.getView() != null) {
                    ImageView imageView = (ImageView) this.f71495c.requireView().findViewById(R.id.lens_camera_cutout_image);
                    View findViewById2 = this.f71495c.requireView().findViewById(R.id.shutter_button_view);
                    View findViewById3 = this.f71495c.requireView().findViewById(R.id.lens_camera_cutout_text);
                    if (!(imageView == null || findViewById2 == null || findViewById3 == null)) {
                        float b2 = C1886a.m5144b(f3, 0.0f, 1.0f);
                        imageView.setAlpha(1.0f - b2);
                        findViewById2.setAlpha(b2);
                        findViewById3.setAlpha(Math.max(0.0f, 1.0f - (b2 + b2)));
                        int i = 0;
                        if (this.f71500h.mo33017b() && this.f71518z != null) {
                            float a = (float) (this.f71516x + mo31501a() + mo31502b().getResources().getDimensionPixelSize(R.dimen.lens_gallery_big_camera_cutout_image_size));
                            C27348ck ckVar = this.f71484P;
                            if (ckVar != null) {
                                int height = this.f71518z.getHeight();
                                View findViewById4 = ckVar.f74840a.mo32953r().f70385d.requireView().findViewById(R.id.filter_lvf_buttons);
                                findViewById4.getClass();
                                ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
                                layoutParams.getClass();
                                i = (int) (((float) (height - ((LinearLayout.LayoutParams) layoutParams).bottomMargin)) - a);
                            }
                        }
                        float f4 = b2 * ((float) i);
                        imageView.setTranslationY(f4);
                        findViewById2.setTranslationY(f4);
                    }
                }
            } else {
                this.f71474F.setAlpha(b);
            }
            this.f71474F.setTranslationY(Math.max(0.0f, Math.min(f, f2)));
        }
        if (this.f71495c.getView() != null && (findViewById = this.f71495c.requireView().findViewById(R.id.lens_gallery_floating_permission_button)) != null) {
            findViewById.setAlpha(b);
        }
    }

    /* renamed from: h */
    public final void mo31508h(boolean z) {
        View view = this.f71472D;
        view.getClass();
        view.setImportantForAccessibility(true != z ? 4 : 0);
        GalleryFrameLayout galleryFrameLayout = this.f71471C;
        galleryFrameLayout.getClass();
        galleryFrameLayout.f71455a = z;
        this.f71479K = z;
    }

    /* renamed from: i */
    public final void mo31509i() {
        mo31508h(false);
        if (!this.f71491W) {
            this.f71492X = true;
            return;
        }
        this.f71492X = false;
        int a = mo31501a();
        float f = (float) a;
        mo31507g(f, f);
        if (this.f71500h.mo33017b()) {
            C26363i iVar = this.f71469A;
            iVar.getClass();
            iVar.f71685g = C1878d.m5128a(this.f71495c.requireContext(), R.color.filter_lvf_carousel_background);
        }
        this.f71514v.setDuration(300);
        this.f71514v.addUpdateListener(new C26423j(this, a));
        this.f71514v.start();
    }

    /* renamed from: j */
    public final void mo31510j() {
        int i;
        C26363i iVar;
        C0673gh findViewHolderForAdapterPosition;
        C25981e a = this.f71510r.mo31203a();
        Context b = mo31502b();
        if (a.mo31185d() == C25980d.AUTO_FILTER) {
            i = R.drawable.quantum_gm_ic_lens_camera_vd_theme_24;
        } else {
            i = a.mo31184c();
        }
        Drawable drawable = b.getDrawable(i);
        View view = this.f71473E;
        view.getClass();
        ImageView imageView = (ImageView) view.findViewById(R.id.lens_camera_cutout_image);
        imageView.getClass();
        imageView.setImageDrawable(drawable);
        View view2 = this.f71473E;
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.lens_camera_cutout_text);
        textView.getClass();
        textView.setText(a.mo31188f());
        if (!(this.f71474F == null || (iVar = this.f71469A) == null)) {
            C58833ax a2 = iVar.mo31554a();
            if (a2.mo56113h() && (findViewHolderForAdapterPosition = this.f71474F.findViewHolderForAdapterPosition(((Integer) a2.mo56107c()).intValue())) != null && this.f71500h.mo33017b()) {
                findViewHolderForAdapterPosition.itemView.setContentDescription(this.f71510r.mo31203a().mo31188f());
            }
        }
        View view3 = this.f71473E;
        view3.getClass();
        View findViewById = view3.findViewById(R.id.shutter_button_view);
        findViewById.getClass();
        View view4 = this.f71473E;
        view4.getClass();
        ImageView imageView2 = (ImageView) view4.findViewById(R.id.filter_icon);
        imageView2.getClass();
        imageView2.setImageDrawable(mo31502b().getDrawable(a.mo31184c()));
        findViewById.setVisibility(0);
        findViewById.setAlpha(0.0f);
    }

    /* renamed from: k */
    public final void mo31511k(View view) {
        if (mo31513m() && view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C26437x(this, view));
        }
    }

    /* renamed from: l */
    public final void mo31512l() {
        int i;
        if (this.f71470B != null && this.f71518z != null) {
            Context b = mo31502b();
            int a = C26296a.m48541a(b.getResources(), this.f71518z.getWidth());
            if (this.f71469A == null || a != this.f71490V) {
                this.f71490V = a;
                C26364j jVar = this.f71486R;
                C26406y n = m48544n();
                C26406y yVar = n;
                C26353ao aoVar = this.f71506n;
                C26353ao aoVar2 = aoVar;
                LayoutInflater from = LayoutInflater.from(b);
                LayoutInflater layoutInflater = from;
                C26438y yVar2 = r4;
                C26438y yVar3 = new C26438y(this);
                int a2 = C1878d.m5128a(this.f71495c.requireContext(), R.color.filter_carousel_translucent_color);
                n.getClass();
                aoVar.getClass();
                from.getClass();
                Activity activity = (Activity) jVar.f71705a.mo17428b();
                Activity activity2 = activity;
                activity.getClass();
                Fragment fragment = (Fragment) ((C68221g) jVar.f71706b).f184583a;
                Fragment fragment2 = fragment;
                fragment.getClass();
                C21370a aVar = (C21370a) jVar.f71707c.mo17428b();
                C21370a aVar2 = aVar;
                aVar.getClass();
                C26373s sVar = (C26373s) jVar.f71708d.mo17428b();
                C26373s sVar2 = sVar;
                sVar.getClass();
                C47449e eVar = (C47449e) jVar.f71709e.mo17428b();
                Context context = b;
                C26363i iVar = r4;
                C47449e eVar2 = eVar;
                eVar.getClass();
                C28443m mVar = (C28443m) jVar.f71710f.mo17428b();
                C28443m mVar2 = mVar;
                mVar.getClass();
                C27711o oVar = (C27711o) jVar.f71711g.mo17428b();
                C27711o oVar2 = oVar;
                oVar.getClass();
                C28448r rVar = (C28448r) jVar.f71712h.mo17428b();
                C28448r rVar2 = rVar;
                rVar.getClass();
                C25684e eVar3 = (C25684e) jVar.f71713i.mo17428b();
                C25684e eVar4 = eVar3;
                eVar3.getClass();
                C28306ab abVar = (C28306ab) jVar.f71714j.mo17428b();
                C28306ab abVar2 = abVar;
                abVar.getClass();
                C25504aj ajVar = (C25504aj) jVar.f71715k.mo17428b();
                C25504aj ajVar2 = ajVar;
                ajVar.getClass();
                C26336d dVar = (C26336d) jVar.f71716l.mo17428b();
                C26336d dVar2 = dVar;
                dVar.getClass();
                C47770dh dhVar = (C47770dh) jVar.f71717m.mo17428b();
                C47770dh dhVar2 = dhVar;
                dhVar.getClass();
                C27232l lVar = (C27232l) jVar.f71718n.mo17428b();
                C27232l lVar2 = lVar;
                lVar.getClass();
                Boolean bool = (Boolean) jVar.f71719o.mo17428b();
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                C24974a aVar3 = (C24974a) jVar.f71720p.mo17428b();
                C24974a aVar4 = aVar3;
                aVar3.getClass();
                C27481an anVar = (C27481an) jVar.f71721q.mo17428b();
                C27481an anVar2 = anVar;
                anVar.getClass();
                C26359e eVar5 = (C26359e) jVar.f71722r.mo17428b();
                eVar5.getClass();
                C25225bd bdVar = (C25225bd) jVar.f71723s.mo17428b();
                C25225bd bdVar2 = bdVar;
                bdVar.getClass();
                i = 0;
                C26363i iVar2 = new C26363i(yVar, aoVar2, layoutInflater, a, yVar2, a2, activity2, fragment2, aVar2, sVar2, eVar2, mVar2, oVar2, rVar2, eVar4, abVar2, ajVar2, dVar2, dhVar2, lVar2, booleanValue, aVar4, anVar2, eVar5, bdVar2);
                this.f71469A = iVar;
                this.f71474F.setAdapter(iVar);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, a);
                gridLayoutManager.mSpanSizeLookup = new C26439z(this);
                this.f71474F.setLayoutManager(gridLayoutManager);
                C0661fw fwVar = this.f71474F.mRecycler;
                fwVar.f2435e = a;
                fwVar.mo3038o();
                this.f71474F.mRecycler.mo3025b().mo3023h(0, (int) (((float) a) * 28.0f));
            } else {
                i = 0;
            }
            Resources resources = this.f71495c.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lens_gallery_top_padding);
            int a3 = dimensionPixelSize + this.f71470B.mo30499a();
            MaterialCardView materialCardView = (MaterialCardView) this.f71471C.findViewById(R.id.lens_gallery_floating_permission_button);
            if (mo31513m()) {
                this.f71483O = Math.max(i, ((int) (((float) this.f71518z.getHeight()) * 0.5f)) - dimensionPixelSize);
                if (materialCardView != null) {
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    layoutParams.width = resources.getDisplayMetrics().heightPixels;
                    materialCardView.setLayoutParams(layoutParams);
                }
            } else {
                this.f71483O = (int) (((float) this.f71518z.getHeight()) * (true != this.f71488T ? 0.25f : 0.38f));
            }
            if (materialCardView != null) {
                C44784o oVar3 = new C44784o(materialCardView.f116031g.f116048m);
                oVar3.mo48148g(new C44783n());
                oVar3.mo48147f(new C44782m(0.5f));
                materialCardView.mo47555l(new C44785p(oVar3));
            }
            int dimensionPixelSize2 = this.f71495c.getResources().getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders);
            if (this.f71500h.mo33017b()) {
                this.f71483O += dimensionPixelSize2;
            }
            C26363i iVar3 = this.f71469A;
            int i2 = this.f71483O;
            int itemCount = iVar3.getItemCount();
            iVar3.f71684f = new C26338a(i2, a3);
            int itemCount2 = iVar3.getItemCount();
            if (itemCount == 0) {
                C58838bb.m90883r(itemCount2 > 0);
                iVar3.mObservable.mo2882d(i, itemCount2);
            } else {
                C58838bb.m90883r(itemCount == itemCount2);
                iVar3.mObservable.mo2881c(i, itemCount2, (Object) null);
            }
            this.f71476H.f71890a = this.f71483O;
            this.f71474F.setPadding(i, a3, i, i);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.lens_gallery_camera_view_padding_bottom);
            int measuredHeight = this.f71473E.getMeasuredHeight();
            int i3 = mo31513m() ? this.f71483O + a3 : this.f71483O;
            if (this.f71500h.mo33017b()) {
                i3 = (i3 - dimensionPixelSize2) - resources.getDimensionPixelSize(R.dimen.lens_gallery_camera_view_padding_bottom);
            }
            if (true != mo31513m()) {
                i = a3;
            }
            int i4 = i + ((i3 - measuredHeight) / 2);
            int i5 = measuredHeight + i4 + dimensionPixelSize3 + dimensionPixelSize3;
            int i6 = this.f71483O + a3;
            if (i5 > i6) {
                i4 -= i5 - i6;
            }
            int translationY = ((int) this.f71473E.getTranslationY()) - this.f71516x;
            this.f71473E.setTranslationY((float) (translationY + i4));
            this.f71516x = i4;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f71475G.getLayoutParams();
            layoutParams2.height = a3;
            this.f71475G.setLayoutParams(layoutParams2);
            C26408a aVar5 = this.f71477I;
            aVar5.f71846a = this.f71483O + a3;
            aVar5.invalidateSelf();
            this.f71477I.mo31607a(translationY + this.f71483O + a3);
            this.f71491W = true;
            if (this.f71492X) {
                mo31509i();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo31513m() {
        return !C24974a.m46225a(this.f71487S.f68122a) && this.f71495c.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public final Context mo31502b() {
        GalleryFrameLayout galleryFrameLayout = this.f71471C;
        galleryFrameLayout.getClass();
        return galleryFrameLayout.getContext();
    }
}
