package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136432ad;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136433ae;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136438aj;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136425b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136428d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136529g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136533k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.x */
/* compiled from: PG */
public final class C136521x extends C136522y {

    /* renamed from: a */
    public static final C59071e f371653a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.b.i.a.x");

    /* renamed from: b */
    public static final Property f371654b = new C136517t(Integer.class);

    /* renamed from: c */
    public static final PathInterpolator f371655c = new PathInterpolator(0.4f, 0.0f, 0.3f, 1.0f);

    /* renamed from: A */
    public final int f371656A;

    /* renamed from: B */
    final int f371657B;

    /* renamed from: C */
    final int f371658C;

    /* renamed from: D */
    final int f371659D;

    /* renamed from: E */
    final int f371660E;

    /* renamed from: F */
    public final boolean f371661F;

    /* renamed from: G */
    public boolean f371662G;

    /* renamed from: H */
    public int f371663H;

    /* renamed from: J */
    private float f371664J = -1.0f;

    /* renamed from: K */
    private final List f371665K;

    /* renamed from: L */
    private C136507j f371666L;

    /* renamed from: d */
    public final C136512o f371667d;

    /* renamed from: e */
    public View f371668e;

    /* renamed from: f */
    public View f371669f;

    /* renamed from: g */
    public int f371670g;

    /* renamed from: h */
    public float f371671h;

    /* renamed from: i */
    public float f371672i;

    /* renamed from: j */
    public final boolean f371673j;

    /* renamed from: k */
    public float f371674k;

    /* renamed from: l */
    public float f371675l;

    /* renamed from: m */
    public float f371676m;

    /* renamed from: n */
    public float f371677n;

    /* renamed from: o */
    public float f371678o;

    /* renamed from: p */
    public float f371679p;

    /* renamed from: q */
    public int f371680q;

    /* renamed from: r */
    public int f371681r;

    /* renamed from: s */
    public VelocityTracker f371682s;

    /* renamed from: t */
    public final C136520w f371683t;

    /* renamed from: u */
    public final C47770dh f371684u;

    /* renamed from: v */
    public final C136453f f371685v;

    /* renamed from: w */
    public final C136453f f371686w;

    /* renamed from: x */
    public boolean f371687x;

    /* renamed from: y */
    public boolean f371688y;

    /* renamed from: z */
    public boolean f371689z;

    public C136521x(C136512o oVar, long j, boolean z, C47770dh dhVar, C21370a aVar) {
        boolean z2 = true;
        this.f371663H = 1;
        this.f371665K = Arrays.asList(new Rect[]{new Rect(), new Rect()});
        this.f371680q = -1;
        this.f371681r = 0;
        this.f371687x = false;
        this.f371688y = false;
        new DecelerateInterpolator(3.0f);
        this.f371667d = oVar;
        C136453f fVar = new C136453f("SlidingPanelLayout", 100, aVar);
        this.f371685v = fVar;
        this.f371686w = new C136453f("SlidingPanelLayout MotionEvents", 50, aVar);
        this.f371684u = dhVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(oVar.getContext());
        this.f371656A = viewConfiguration.getScaledPagingTouchSlop();
        this.f371657B = viewConfiguration.getScaledMaximumFlingVelocity();
        float f = oVar.getResources().getDisplayMetrics().density;
        this.f371658C = (int) (((float) j) * f);
        this.f371659D = (int) (250.0f * f);
        this.f371660E = (int) (f * 1500.0f);
        this.f371661F = z;
        this.f371673j = oVar.getResources().getConfiguration().getLayoutDirection() != 1 ? false : z2;
        this.f371683t = new C136520w(this, fVar, dhVar);
    }

    /* renamed from: a */
    public final void mo113133a(MotionEvent motionEvent) {
        if (this.f371682s == null) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f371682s = obtain;
            obtain.clear();
        }
        this.f371682s.addMovement(motionEvent);
    }

    /* renamed from: b */
    public final void mo113134b() {
        this.f371685v.mo113057a(String.format(Locale.US, "closeImmediate, width = %d", new Object[]{Integer.valueOf(this.f371667d.getMeasuredWidth())}));
        mo113146n();
        mo113138f();
        mo113137e();
        this.f371662G = false;
    }

    /* renamed from: c */
    public final void mo113135c(int i) {
        if (this.f371667d.getMeasuredWidth() == 0) {
            mo113134b();
            return;
        }
        mo113138f();
        this.f371662G = true;
        this.f371683t.mo113131c(0, i);
    }

    /* renamed from: d */
    public final void mo113136d(MotionEvent motionEvent) {
        C136529g gVar;
        C136533k i;
        C136470f b;
        int findPointerIndex = motionEvent.findPointerIndex(this.f371680q);
        if (findPointerIndex != -1) {
            float x = motionEvent.getX() - this.f371674k;
            float abs = Math.abs(x);
            float abs2 = Math.abs(motionEvent.getY() - this.f371675l);
            if (Float.compare(abs, 0.0f) != 0) {
                float atan = (float) Math.atan((double) (abs2 / abs));
                boolean z = true;
                if (!this.f371673j ? x <= 0.0f : x >= 0.0f) {
                    z = false;
                }
                if (this.f371687x && !this.f371688y) {
                    if (!z) {
                        C136507j jVar = this.f371666L;
                        if (!(jVar == null || (gVar = jVar.f371623a.f371637n) == null || (i = gVar.f371699a.mo22017i()) == null || (b = i.mo113163b()) == null || !b.mo113075o())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (atan <= 1.0471976f) {
                    float f = 1.0f;
                    if (atan > 0.5235988f) {
                        f = 1.0f + (((float) Math.sqrt((double) ((atan - 7.8112097f) / 0.5235988f))) * 4.0f);
                    }
                    if (((int) Math.abs(motionEvent.getX(findPointerIndex) - this.f371674k)) > Math.round(f * ((float) this.f371656A))) {
                        float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f371680q));
                        this.f371679p += Math.abs(this.f371678o - x2);
                        this.f371676m = x2;
                        this.f371678o = x2;
                        mo113149q();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo113137e() {
        this.f371687x = false;
        this.f371688y = false;
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            jVar.f371623a.mo113110i(4, this.f371663H, this.f371672i);
            this.f371672i = 0.0f;
            this.f371663H = 1;
        }
    }

    /* renamed from: f */
    public final void mo113138f() {
        this.f371688y = true;
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            jVar.f371623a.mo113110i(3, 1, 0.0f);
        }
    }

    /* renamed from: g */
    public final void mo113139g() {
        this.f371687x = true;
        this.f371688y = false;
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            jVar.f371623a.mo113110i(2, this.f371663H, this.f371672i);
            this.f371672i = 1.0f;
            this.f371663H = 1;
        }
    }

    /* renamed from: h */
    public final void mo113140h() {
        this.f371688y = true;
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            jVar.f371623a.mo113110i(1, 1, 1.0f);
        }
    }

    /* renamed from: i */
    public final void mo113141i(float f) {
        C136428d dVar;
        View view;
        if (Math.abs(f - this.f371664J) > 1.0E-6f && (Math.abs(-1.0f + f) < 1.0E-6f || Math.abs(0.0f + f) < 1.0E-6f)) {
            this.f371685v.mo113057a(String.format(Locale.US, "onPanelProgressChanged: positionRatio = %f, lastDispatchedPanelPositionRatio = %f, width = %d", new Object[]{Float.valueOf(f), Float.valueOf(this.f371664J), Integer.valueOf(this.f371667d.getMeasuredWidth())}));
        }
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            C136512o c = jVar.f371623a.mo113104c();
            if (!(c == null || (view = c.mo17754z().f371669f) == null)) {
                ((C136492a) view).mo17754z().f371610a.setAlpha(f);
            }
            C136529g gVar = jVar.f371623a.f371637n;
            if (!(gVar == null || f == gVar.f371699a.f371718o)) {
                C136438aj ajVar = gVar.f371700b;
                ajVar.f371443b.mo113040d(f);
                C136432ad adVar = ajVar.f371444c;
                if (!adVar.f371413b.f371427n) {
                    try {
                        adVar.f371412a.mo28128a(f);
                    } catch (RemoteException e) {
                        C136433ae aeVar = adVar.f371413b;
                        UUID uuid = aeVar.f371425l;
                        if (uuid != null) {
                            C136425b bVar = aeVar.f371423j;
                            if (bVar.f371399b && (dVar = (C136428d) bVar.f371398a.get(uuid)) != null) {
                                bVar.mo113013h(dVar, C37182a.f97749H.mo40806d(), C136425b.m221675e(3));
                            }
                        }
                        adVar.f371413b.f371425l = null;
                        ((C59052c) ((C59052c) ((C59052c) C136433ae.f371414a.mo56225c()).mo56382g(e)).mo56372aa(40734)).mo56386p("Unable to send scroll update to the client");
                    }
                }
                if (ajVar.f371442a && f != 1.0f) {
                    ajVar.f371442a = false;
                }
                C136533k i = gVar.f371699a.mo22017i();
                if (i != null) {
                    i.mo113167f(f);
                }
                gVar.f371699a.f371718o = f;
            }
            this.f371664J = f;
        }
    }

    /* renamed from: j */
    public final void mo113142j(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & PrivateKeyType.INVALID;
        if (motionEvent.getPointerId(action) == this.f371680q) {
            int i = action == 0 ? 1 : 0;
            float x = motionEvent.getX(i);
            this.f371676m += x - this.f371678o;
            this.f371674k = x;
            this.f371678o = x;
            this.f371680q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f371682s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: k */
    public final void mo113143k(int i) {
        if (this.f371667d.getMeasuredWidth() == 0) {
            mo113152t();
            return;
        }
        mo113140h();
        this.f371662G = true;
        this.f371683t.mo113131c(this.f371667d.getMeasuredWidth(), i);
    }

    /* renamed from: l */
    public final void mo113144l() {
        VelocityTracker velocityTracker = this.f371682s;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f371682s.recycle();
            this.f371682s = null;
        }
    }

    /* renamed from: m */
    public final void mo113145m() {
        mo113144l();
        this.f371689z = false;
        this.f371681r = 0;
        this.f371680q = -1;
    }

    /* renamed from: n */
    public final void mo113146n() {
        this.f371685v.mo113057a(String.format(Locale.US, "setPanelToFullyClosed, width = %d", new Object[]{Integer.valueOf(this.f371667d.getMeasuredWidth())}));
        this.f371671h = 0.0f;
        this.f371670g = 0;
        this.f371668e.setTranslationX(0.0f);
    }

    /* renamed from: o */
    public final void mo113147o() {
        this.f371685v.mo113057a(String.format(Locale.US, "setPanelToFullyOpen, width = %d", new Object[]{Integer.valueOf(this.f371667d.getMeasuredWidth())}));
        this.f371671h = 1.0f;
        int measuredWidth = this.f371667d.getMeasuredWidth();
        this.f371670g = measuredWidth;
        View view = this.f371668e;
        if (this.f371673j) {
            measuredWidth = -measuredWidth;
        }
        view.setTranslationX((float) measuredWidth);
    }

    /* renamed from: p */
    public final void mo113148p(int i) {
        int i2;
        int i3 = 0;
        if (i <= 1) {
            i = 0;
        }
        int measuredWidth = this.f371667d.getMeasuredWidth();
        if (measuredWidth != 0) {
            this.f371671h = ((float) i) / ((float) measuredWidth);
            i3 = Math.max(Math.min(i, measuredWidth), 0);
            this.f371670g = i3;
            i2 = i3;
        } else if (i == 0) {
            this.f371671h = 0.0f;
            this.f371670g = 0;
            i2 = 0;
        } else {
            this.f371685v.mo113057a("setPanelX: width is zero but panelPositionRatio is non-zero");
            return;
        }
        this.f371668e.setTranslationX(this.f371673j ? (float) (-i2) : (float) i3);
        mo113141i(this.f371671h);
    }

    /* renamed from: q */
    public final void mo113149q() {
        this.f371681r = 1;
        this.f371688y = true;
        this.f371662G = false;
        this.f371683t.mo113130b();
        C136507j jVar = this.f371666L;
        if (jVar != null) {
            C136529g gVar = jVar.f371623a.f371637n;
            if (gVar != null) {
                C136438aj ajVar = gVar.f371700b;
                ajVar.f371443b.f371455j.mo113057a("onOverlayDragStarted");
                C136433ae aeVar = ajVar.f371444c.f371413b;
                if (!aeVar.f371427n) {
                    if (aeVar.f371426m) {
                        C136425b bVar = aeVar.f371423j;
                        UUID randomUUID = UUID.randomUUID();
                        if (bVar.f371399b) {
                            bVar.mo113014i(randomUUID, C37182a.f97749H.mo40806d());
                            bVar.mo113008b(bVar.mo113007a(randomUUID), C37182a.f97798ad.mo40779c());
                        }
                        aeVar.mo113034y(randomUUID);
                    } else {
                        C136425b bVar2 = aeVar.f371423j;
                        UUID randomUUID2 = UUID.randomUUID();
                        if (bVar2.f371399b) {
                            bVar2.mo113014i(randomUUID2, C37182a.f97749H.mo40806d());
                            bVar2.mo113008b(bVar2.mo113007a(randomUUID2), C37182a.f97797ac.mo40779c());
                        }
                        aeVar.mo113034y(randomUUID2);
                    }
                }
                ajVar.f371442a = false;
            }
            jVar.f371623a.mo113110i(5, 1, 1.0f);
        }
    }

    /* renamed from: r */
    public final void mo113150r() {
        Rect rect = (Rect) this.f371665K.get(0);
        Rect rect2 = (Rect) this.f371665K.get(1);
        rect.setEmpty();
        rect2.setEmpty();
        int width = this.f371667d.getWidth() / 2;
        if (this.f371666L != null) {
            if (this.f371673j) {
                rect.set(0, 0, width, this.f371667d.getHeight());
            }
            if (!this.f371673j) {
                rect2.set(this.f371667d.getWidth() - width, 0, this.f371667d.getWidth(), this.f371667d.getHeight());
            }
        }
        this.f371667d.setSystemGestureExclusionRects(this.f371665K);
    }

    /* renamed from: s */
    public final void mo113151s(C136507j jVar) {
        C136453f fVar = this.f371685v;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        objArr[0] = jVar != null ? "SlidingPanelLayoutCallback" : "null";
        fVar.mo113057a(String.format(locale, "setCallbacks %s", objArr));
        this.f371666L = jVar;
        mo113150r();
    }

    /* renamed from: t */
    public final void mo113152t() {
        this.f371685v.mo113057a(String.format(Locale.US, "openImmediate, width = %d", new Object[]{Integer.valueOf(this.f371667d.getMeasuredWidth())}));
        mo113147o();
        this.f371668e.setAlpha(1.0f);
        mo113140h();
        mo113139g();
        this.f371662G = false;
    }
}
