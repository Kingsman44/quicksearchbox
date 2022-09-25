package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
public class AccountParticleDisc extends FrameLayout {

    /* renamed from: a */
    public final AvatarView f81547a;

    /* renamed from: b */
    public final BadgeFrameLayout f81548b;

    /* renamed from: c */
    public final RingFrameLayout f81549c;

    /* renamed from: d */
    public final CopyOnWriteArrayList f81550d;

    /* renamed from: e */
    public final C30195aw f81551e;

    /* renamed from: f */
    public final C30197ay f81552f;

    /* renamed from: g */
    public DrawableBadgeViewHolder f81553g;

    /* renamed from: h */
    public C30202bc f81554h;

    /* renamed from: i */
    public boolean f81555i;

    /* renamed from: j */
    public boolean f81556j;

    /* renamed from: k */
    public C30213m f81557k;

    /* renamed from: l */
    public C30180ah f81558l;

    /* renamed from: m */
    public Object f81559m;

    /* renamed from: n */
    public C30178af f81560n;

    /* renamed from: o */
    public int f81561o;

    /* renamed from: p */
    public C30158c f81562p;

    /* renamed from: q */
    public C58833ax f81563q;

    /* renamed from: r */
    private final boolean f81564r;

    /* renamed from: s */
    private final C30177ae f81565s;

    /* renamed from: t */
    private final boolean f81566t;

    /* renamed from: u */
    private final int f81567u;

    /* renamed from: v */
    private final int f81568v;

    /* renamed from: w */
    private C30897z f81569w;

    /* renamed from: x */
    private int f81570x;

    public AccountParticleDisc(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static C30226z m56067b(C30178af afVar) {
        C30175ac acVar;
        if (afVar == null || (acVar = afVar.f81609b) == null) {
            return null;
        }
        return (C30226z) acVar.mo35623a().mo56111f();
    }

    /* renamed from: s */
    private final void m56068s() {
        C30897z zVar = this.f81569w;
        if (zVar != null) {
            DrawableBadgeViewHolder drawableBadgeViewHolder = this.f81553g;
            if (drawableBadgeViewHolder != null) {
                drawableBadgeViewHolder.f81586d = zVar;
                if (drawableBadgeViewHolder.f81589g != null) {
                    drawableBadgeViewHolder.f81584b.mo35632lk(zVar);
                    drawableBadgeViewHolder.f81584b.mo35631c(zVar, drawableBadgeViewHolder.f81589g);
                }
            }
            C30202bc bcVar = this.f81554h;
            if (bcVar != null) {
                C30897z zVar2 = this.f81569w;
                bcVar.f81655f = zVar2;
                if (bcVar.f81654e != null) {
                    bcVar.f81651b.mo35632lk(zVar2);
                    bcVar.f81651b.mo35631c(zVar2, bcVar.f81654e);
                }
            }
        }
    }

    /* renamed from: t */
    private final void m56069t() {
        int dimension = (this.f81555i || this.f81556j || this.f81564r) ? (int) getResources().getDimension(R.dimen.og_apd_min_padding) : 0;
        this.f81570x = dimension;
        this.f81547a.setPadding(dimension, dimension, dimension, dimension);
        this.f81547a.mo35601a();
        ViewGroup.LayoutParams layoutParams = this.f81547a.getLayoutParams();
        layoutParams.width = this.f81561o;
        layoutParams.height = this.f81561o;
    }

    /* renamed from: a */
    public final int mo35584a() {
        int i = this.f81561o;
        int i2 = this.f81570x;
        return i - (i2 + i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f81609b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.onegoogle.account.disc.C30173aa mo35585c() {
        /*
            r2 = this;
            com.google.android.libraries.onegoogle.account.disc.af r0 = r2.f81560n
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.google.android.libraries.onegoogle.account.disc.ac r0 = r0.f81609b
            if (r0 != 0) goto L_0x000a
            goto L_0x0015
        L_0x000a:
            com.google.common.base.ax r0 = r0.mo35623a()
            java.lang.Object r0 = r0.mo56111f()
            com.google.android.libraries.onegoogle.account.disc.z r0 = (com.google.android.libraries.onegoogle.account.disc.C30226z) r0
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x0019
            return r1
        L_0x0019:
            com.google.android.libraries.onegoogle.account.disc.aa r0 = r0.mo35669b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.mo35585c():com.google.android.libraries.onegoogle.account.disc.aa");
    }

    /* renamed from: d */
    public final C58833ax mo35586d() {
        C19559g.m37304c();
        if (this.f81556j) {
            C30195aw awVar = this.f81551e;
            C19559g.m37304c();
            Object obj = awVar.f81637c;
            if (obj == null) {
                return C58836b.f156633a;
            }
            C30180ah ahVar = awVar.f81636b;
            if (ahVar != null) {
                C58833ax a = C30195aw.m56129a(ahVar.mo35633a(obj));
                if (a.mo56113h()) {
                    return a;
                }
            }
            C30180ah ahVar2 = awVar.f81635a;
            if (ahVar2 != null) {
                return C30195aw.m56129a(ahVar2.mo35633a(awVar.f81637c));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: f */
    public final String mo35588f() {
        if (this.f81563q.mo56113h()) {
            return ((C30192at) this.f81563q.mo56107c()).mo35646b();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo35589g(C30897z zVar) {
        if (this.f81555i || this.f81556j) {
            this.f81569w = zVar;
            m56068s();
            if (this.f81555i) {
                BadgeFrameLayout badgeFrameLayout = this.f81548b;
                badgeFrameLayout.f81610a = true;
                badgeFrameLayout.mo35630b(zVar);
            }
            if (this.f81556j) {
                RingFrameLayout ringFrameLayout = this.f81549c;
                ringFrameLayout.f81610a = true;
                ringFrameLayout.mo35630b(zVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo35590h() {
        if (!this.f81555i) {
            C58838bb.m90884s(!mo35599q(), "enableBadges is only allowed before calling initialize.");
            this.f81555i = true;
        }
    }

    /* renamed from: i */
    public final void mo35591i() {
        Iterator it = this.f81550d.iterator();
        while (it.hasNext()) {
            ((C30208h) it.next()).mo35667a();
        }
    }

    /* renamed from: j */
    public final void mo35592j(Object obj) {
        C30914an.m57706a(new C30203c(this, obj));
    }

    /* renamed from: k */
    public final void mo35593k(boolean z) {
        if (z != this.f81556j) {
            C58838bb.m90884s(!mo35599q(), "setAllowRings is only allowed before calling initialize.");
            this.f81556j = z;
        }
    }

    /* renamed from: l */
    public final void mo35594l() {
        AvatarView avatarView = this.f81547a;
        Context context = avatarView.getContext();
        int i = this.f81568v;
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.disc_oval);
        C30905ae.m57696b(c, i);
        avatarView.setImageDrawable(c);
    }

    /* renamed from: m */
    public final void mo35595m(C30180ah ahVar) {
        C58838bb.m90884s(this.f81555i, "setDecorationRetriever is not allowed with false allowBadges.");
        this.f81558l = ahVar;
        mo35597o();
        if (this.f81556j) {
            C30914an.m57706a(new C30204d(this, ahVar));
        }
        mo35596n();
        mo35591i();
    }

    /* renamed from: n */
    public final void mo35596n() {
        C30914an.m57706a(new C30206f(this));
    }

    /* renamed from: o */
    public final void mo35597o() {
        Object obj;
        C30178af afVar = this.f81560n;
        if (afVar != null) {
            afVar.f81608a.remove(this.f81565s);
        }
        C30180ah ahVar = this.f81558l;
        C30178af afVar2 = null;
        if (!(ahVar == null || (obj = this.f81559m) == null)) {
            afVar2 = ahVar.mo35633a(obj);
        }
        this.f81560n = afVar2;
        if (afVar2 != null) {
            afVar2.f81608a.add(this.f81565s);
        }
    }

    /* renamed from: p */
    public final void mo35598p() {
        C19559g.m37304c();
        C58833ax d = mo35586d();
        if (!d.equals(this.f81563q)) {
            this.f81563q = d;
            C30202bc bcVar = this.f81554h;
            if (bcVar != null) {
                C19559g.m37304c();
                bcVar.mo35661a(d, true);
            }
            mo35591i();
        }
    }

    /* renamed from: q */
    public final boolean mo35599q() {
        return this.f81557k != null;
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    /* JADX INFO: finally extract failed */
    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81550d = new CopyOnWriteArrayList();
        this.f81565s = new C30172a(this);
        this.f81551e = new C30195aw(new C30199b(this));
        this.f81563q = C58836b.f156633a;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, this, true);
        AvatarView avatarView = (AvatarView) findViewById(R.id.og_apd_internal_image_view);
        this.f81547a = avatarView;
        this.f81548b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.f81549c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.f81552f = new C30197ay(getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30191as.f81634a, i, 2132149635);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.f81561o = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.f81561o = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.og_apd_default_max_disc_content_size));
            }
            this.f81564r = obtainStyledAttributes.getBoolean(0, true);
            this.f81556j = obtainStyledAttributes.getBoolean(1, false);
            this.f81566t = obtainStyledAttributes.getBoolean(6, false);
            this.f81567u = obtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            avatarView.f81571a.setColor(obtainStyledAttributes.getColor(2, 0));
            avatarView.f81571a.setAlpha(30);
            this.f81568v = obtainStyledAttributes.getColor(5, getResources().getColor(R.color.og_default_disc_placeholder_color_light));
            obtainStyledAttributes.recycle();
            mo35594l();
            m56069t();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f81609b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo35587e() {
        /*
            r3 = this;
            com.google.android.libraries.onegoogle.account.disc.af r0 = r3.f81560n
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.google.android.libraries.onegoogle.account.disc.ac r0 = r0.f81609b
            if (r0 != 0) goto L_0x000a
            goto L_0x0015
        L_0x000a:
            com.google.common.base.ax r0 = r0.mo35623a()
            java.lang.Object r0 = r0.mo56111f()
            com.google.android.libraries.onegoogle.account.disc.z r0 = (com.google.android.libraries.onegoogle.account.disc.C30226z) r0
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x001a
            r0 = r1
            goto L_0x001e
        L_0x001a:
            java.lang.String r0 = r0.mo35670c()
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x002c
            goto L_0x003e
        L_0x002c:
            java.lang.String r1 = "."
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L_0x003d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r0.concat(r1)
            goto L_0x003e
        L_0x003d:
            r1 = r0
        L_0x003e:
            java.lang.String r0 = r3.mo35588f()
            if (r1 == 0) goto L_0x005c
            if (r0 != 0) goto L_0x0047
            goto L_0x005c
        L_0x0047:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x005c:
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            if (r0 == 0) goto L_0x0062
            return r0
        L_0x0062:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.mo35587e():java.lang.String");
    }

    /* renamed from: r */
    public final void mo35600r(C30213m mVar, C30158c cVar) {
        mVar.getClass();
        this.f81557k = mVar;
        this.f81562p = cVar;
        if (this.f81566t) {
            int i = this.f81567u - this.f81561o;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int max = Math.max(0, (int) Math.ceil((double) (((float) ((i - paddingLeft) - paddingRight)) / 2.0f)));
            int max2 = Math.max(0, (int) Math.ceil((double) (((float) ((i - paddingTop) - paddingBottom)) / 2.0f)));
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        m56069t();
        if (this.f81555i) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        C30914an.m57706a(new C30205e(this, cVar));
        this.f81547a.requestLayout();
        if (this.f81556j) {
            this.f81554h = new C30202bc((RingView) findViewById(R.id.og_apd_ring_view), mo35584a(), this.f81561o, this.f81549c);
        }
        if (this.f81555i) {
            BadgeFrameLayout badgeFrameLayout = this.f81548b;
            this.f81553g = new DrawableBadgeViewHolder(badgeFrameLayout, (ImageView) badgeFrameLayout.findViewById(R.id.og_apd_drawable_badge), mo35584a(), this.f81547a);
        }
        m56068s();
    }
}
