package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.p8352a.C108155a;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.p8352a.C108156b;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.p8352a.C108157c;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view.ChatHeadNudge;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view.ChatHeadOutline;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view.ChatHeadViewProxy;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.z */
/* compiled from: PG */
public final class C108185z implements C108155a {

    /* renamed from: a */
    public static final Duration f300855a = Duration.ofMillis(300);

    /* renamed from: k */
    private static final Duration f300856k = Duration.ofMillis(100);

    /* renamed from: l */
    private static final Duration f300857l = Duration.ofSeconds(2);

    /* renamed from: m */
    private static final Duration f300858m = Duration.ZERO;

    /* renamed from: A */
    private boolean f300859A = false;

    /* renamed from: B */
    private final AtomicReference f300860B = new AtomicReference(C118826c.f331423b);

    /* renamed from: C */
    private boolean f300861C = false;

    /* renamed from: D */
    private ValueAnimator f300862D = null;

    /* renamed from: E */
    private final AtomicReference f300863E = new AtomicReference(C118826c.f331423b);

    /* renamed from: F */
    private final AtomicReference f300864F = new AtomicReference(C118826c.f331423b);

    /* renamed from: b */
    public final C22871g f300865b;

    /* renamed from: c */
    public final C86124t f300866c;

    /* renamed from: d */
    public final WindowManager f300867d;

    /* renamed from: e */
    public final WindowManager.LayoutParams f300868e;

    /* renamed from: f */
    public final AtomicBoolean f300869f = new AtomicBoolean(true);

    /* renamed from: g */
    public boolean f300870g = false;

    /* renamed from: h */
    public boolean f300871h = false;

    /* renamed from: i */
    public final AtomicBoolean f300872i = new AtomicBoolean(false);

    /* renamed from: j */
    public int f300873j = 1;

    /* renamed from: n */
    private final Context f300874n;

    /* renamed from: o */
    private final C108154a f300875o;

    /* renamed from: p */
    private final WindowManager.LayoutParams f300876p;

    /* renamed from: q */
    private final float f300877q;

    /* renamed from: r */
    private final float f300878r;

    /* renamed from: s */
    private View f300879s = null;

    /* renamed from: t */
    private View f300880t = null;

    /* renamed from: u */
    private ChatHeadOutline f300881u = null;

    /* renamed from: v */
    private View f300882v = null;

    /* renamed from: w */
    private View f300883w = null;

    /* renamed from: x */
    private View f300884x = null;

    /* renamed from: y */
    private ChatHeadNudge f300885y = null;

    /* renamed from: z */
    private boolean f300886z = false;

    public C108185z(Context context, C22871g gVar, C108154a aVar, C86124t tVar) {
        this.f300874n = context;
        this.f300865b = gVar;
        this.f300875o = aVar;
        this.f300866c = tVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f300867d = windowManager;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 40, -3);
        this.f300868e = layoutParams;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        this.f300876p = layoutParams2;
        layoutParams2.copyFrom(layoutParams);
        this.f300877q = C91115n.m148870b(8.0f, context);
        this.f300878r = C91115n.m148870b(24.0f, context);
    }

    /* renamed from: A */
    private final void m179558A() {
        if (this.f300871h || this.f300861C) {
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) mo96521c().findViewById(R.id.opa_chat_head_dismiss_progress);
            circularProgressIndicator.setProgress(0);
            circularProgressIndicator.mo48272e();
            ValueAnimator valueAnimator = this.f300862D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f300861C = false;
            ((C60870cx) this.f300860B.getAndSet(C118826c.f331423b)).cancel(false);
            this.f300871h = false;
            ((TextView) mo96521c().findViewById(R.id.opa_chat_head_dismiss_text)).setText(R.string.opa_chat_head_dismiss_hold_to_optout_text);
        }
    }

    /* renamed from: B */
    private final void m179559B() {
        this.f300876p.x = this.f300868e.x;
        this.f300876p.y = this.f300868e.y;
        Point point = new Point();
        this.f300867d.getDefaultDisplay().getSize(point);
        if (this.f300876p.x + (point.x / 2) > point.x / 2) {
            this.f300876p.x += mo96523e().getWidth() / 2;
            return;
        }
        this.f300876p.x -= mo96523e().getWidth() / 2;
    }

    /* renamed from: C */
    private final boolean m179560C() {
        int width = mo96520b().getWidth() / 2;
        int[] j = C91115n.m148878j(mo96520b());
        j[0] = j[0] + width;
        j[1] = j[1] + width;
        View findViewById = mo96521c().findViewById(R.id.opa_chat_head_dismiss_area);
        int width2 = findViewById.getWidth() / 2;
        int[] j2 = C91115n.m148878j(findViewById);
        int i = j2[0] + width2;
        j2[0] = i;
        int i2 = j2[1] + width2;
        j2[1] = i2;
        return Math.hypot((double) (j[0] - i), (double) (j[1] - i2)) < ((double) (width + width2));
    }

    /* renamed from: D */
    private static boolean m179561D() {
        return f300858m.toMillis() > 0;
    }

    /* renamed from: w */
    public static boolean m179562w(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: x */
    private final WindowManager.LayoutParams m179563x() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f300868e);
        Point point = new Point();
        this.f300867d.getDefaultDisplay().getSize(point);
        layoutParams.width = point.x;
        layoutParams.x = (-mo96521c().getWidth()) / 2;
        layoutParams.y = 0;
        return layoutParams;
    }

    /* renamed from: y */
    private final WindowManager.LayoutParams m179564y() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f300868e);
        layoutParams.y += (int) C91115n.m148870b(76.0f, this.f300874n);
        return layoutParams;
    }

    /* renamed from: z */
    private final void m179565z(boolean z) {
        if (this.f300873j == 4) {
            this.f300870g = false;
            mo96527i();
            ViewPropertyAnimator interpolator = mo96520b().animate().x((float) ((mo96523e().getWidth() / 2) - (mo96520b().getWidth() / 2))).alpha(1.0f).setUpdateListener(new C108167k(this)).setDuration(f300855a.toMillis()).setInterpolator(new AccelerateDecelerateInterpolator());
            if (!z) {
                mo96522d().setVisibility(8);
                interpolator = interpolator.withEndAction(new C108168l(this));
            }
            interpolator.start();
            mo96526h().mo96511a();
        }
    }

    /* renamed from: a */
    public final float mo96519a() {
        return ((float) this.f300866c.mo79743a(C90037cp.f248623s)) / 100.0f;
    }

    /* renamed from: b */
    public final View mo96520b() {
        if (this.f300880t == null) {
            this.f300880t = mo96523e().findViewById(R.id.opa_chat_head);
        }
        return this.f300880t;
    }

    /* renamed from: c */
    public final View mo96521c() {
        if (this.f300882v == null) {
            this.f300882v = LayoutInflater.from(this.f300874n).inflate(R.layout.opa_chat_head_dismiss_area, (ViewGroup) null);
        }
        return this.f300882v;
    }

    /* renamed from: d */
    public final View mo96522d() {
        if (this.f300884x == null) {
            this.f300884x = LayoutInflater.from(this.f300874n).inflate(R.layout.opa_chat_head_minimized_touch_interceptor, (ViewGroup) null);
        }
        return this.f300884x;
    }

    /* renamed from: e */
    public final View mo96523e() {
        if (this.f300879s == null) {
            this.f300879s = LayoutInflater.from(this.f300874n).inflate(R.layout.opa_chat_head_bubble, (ViewGroup) null);
        }
        return this.f300879s;
    }

    /* renamed from: f */
    public final View mo96524f() {
        if (this.f300883w == null) {
            this.f300883w = LayoutInflater.from(this.f300874n).inflate(R.layout.opa_chat_head_tooltip, (ViewGroup) null);
        }
        return this.f300883w;
    }

    /* renamed from: g */
    public final ChatHeadNudge mo96525g() {
        if (this.f300885y == null) {
            this.f300885y = (ChatHeadNudge) mo96523e().findViewById(R.id.opa_chat_head_bubble_nudge);
        }
        return this.f300885y;
    }

    /* renamed from: h */
    public final ChatHeadOutline mo96526h() {
        if (this.f300881u == null) {
            this.f300881u = (ChatHeadOutline) mo96520b().findViewById(R.id.opa_chat_head_bubble_outline);
        }
        return this.f300881u;
    }

    /* renamed from: i */
    public final void mo96527i() {
        ((C60870cx) this.f300864F.getAndSet(C118826c.f331423b)).cancel(false);
    }

    /* renamed from: j */
    public final void mo96528j() {
        this.f300865b.mo28212l("endNudge", new C108170n(this));
    }

    /* renamed from: k */
    public final void mo96529k() {
        if (this.f300873j == 1) {
            this.f300873j = 2;
            this.f300867d.addView(mo96521c(), m179563x());
            mo96521c().setVisibility(8);
            mo96521c().setAlpha(0.0f);
            TextView textView = (TextView) mo96521c().findViewById(R.id.opa_chat_head_dismiss_text);
            if (m179561D()) {
                textView.setText(R.string.opa_chat_head_dismiss_hold_to_optout_text);
            } else {
                textView.setText(R.string.opa_chat_head_dismiss_text);
            }
            LogoView logoView = (LogoView) mo96520b().findViewById(R.id.opa_chat_head_bubble);
            logoView.getClass();
            logoView.mo28225e((int) this.f300866c.mo79743a(C90037cp.f248621q), true);
            logoView.mo28223c(35.0f, 35.0f);
            this.f300867d.addView(mo96523e(), this.f300868e);
            mo96523e().setVisibility(8);
            mo96531p();
            this.f300867d.addView(mo96524f(), m179564y());
            mo96524f().setVisibility(8);
            mo96524f().setAlpha(0.0f);
            mo96524f().setOnClickListener(new C108161e(this));
            ((ChatHeadViewProxy) mo96523e().findViewById(R.id.opa_chat_head_view_proxy)).f300848a.set(new C108162f(this));
            mo96520b().setOnSystemUiVisibilityChangeListener(new C108163g(this));
            if (!this.f300866c.mo79746e(C90037cp.f248628x)) {
                mo96520b().setOnTouchListener(new C108157c(this, this.f300877q, 1));
            }
            m179559B();
            this.f300867d.addView(mo96522d(), this.f300876p);
            mo96522d().setVisibility(8);
            mo96522d().setOnTouchListener(new C108156b(this, this.f300877q));
            mo96523e().addOnLayoutChangeListener(C108178v.f300840a);
            mo96522d().addOnLayoutChangeListener(C108178v.f300840a);
            mo96520b().addOnLayoutChangeListener(C108178v.f300840a);
        }
    }

    /* renamed from: l */
    public final void mo96530l(boolean z) {
        long j;
        if (this.f300873j == 3) {
            this.f300870g = true;
            float width = ((float) mo96523e().getWidth()) - (((float) mo96520b().getWidth()) * 0.2f);
            Point point = new Point();
            this.f300867d.getDefaultDisplay().getSize(point);
            if (this.f300868e.x + (point.x / 2) < point.x / 2) {
                width = ((float) mo96520b().getWidth()) * -0.8f;
            }
            ViewPropertyAnimator withEndAction = mo96520b().animate().x(width).alpha(this.f300872i.get() ? 0.0f : mo96519a()).setInterpolator(new OvershootInterpolator()).setUpdateListener(new C108182w(this)).withEndAction(new C108183x(this));
            if (z) {
                j = 0;
            } else {
                j = f300855a.toMillis();
            }
            withEndAction.setDuration(j).start();
            ChatHeadOutline h = mo96526h();
            if (!h.f300846b) {
                h.f300846b = true;
                ViewPropertyAnimator viewPropertyAnimator = h.f300847c;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                h.setBackgroundTintList(ColorStateList.valueOf(ChatHeadOutline.f300844a));
                h.f300847c = h.animate().alpha(1.0f);
                h.f300847c.start();
            }
            mo96535t(false);
        }
    }

    /* renamed from: m */
    public final void mo96493m(int i, int i2) {
        int i3 = this.f300873j;
        if (i3 == 4) {
            m179565z(true);
        } else if (i3 == 3) {
            mo96533r(i, i2);
            mo96532q(true);
            long a = this.f300866c.mo79743a(C90037cp.f248620p);
            if (a > 0) {
                ((C60870cx) this.f300863E.getAndSet(this.f300865b.mo28204d("dragWatchdog", a, new C108160d(this)))).cancel(false);
            }
            if (m179561D()) {
                boolean C = m179560C();
                if (!this.f300886z || this.f300871h || this.f300861C) {
                    if (C) {
                        return;
                    }
                } else if (C) {
                    this.f300861C = true;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) mo96521c().findViewById(R.id.opa_chat_head_dismiss_progress);
                    circularProgressIndicator.setProgress(0);
                    circularProgressIndicator.f117002a.f117019e = 1;
                    circularProgressIndicator.invalidate();
                    circularProgressIndicator.f117002a.f117020f = 2;
                    circularProgressIndicator.invalidate();
                    circularProgressIndicator.mo48278i();
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
                    this.f300862D = ofInt;
                    ofInt.addUpdateListener(new C108164h(circularProgressIndicator));
                    ValueAnimator valueAnimator = this.f300862D;
                    Duration duration = f300858m;
                    valueAnimator.setDuration(duration.toMillis());
                    this.f300862D.start();
                    ((C60870cx) this.f300860B.getAndSet(this.f300865b.mo28204d("ChatHeadUiRenderer.startDismissHoldTimer", duration.toMillis(), new C108165i(this)))).cancel(false);
                    return;
                }
                m179558A();
            }
        }
    }

    /* renamed from: n */
    public final void mo96494n(boolean z) {
        int i = this.f300873j;
        if (i == 4 && z) {
            m179565z(false);
        } else if (i == 3) {
            ((C60870cx) this.f300863E.get()).cancel(false);
            this.f300875o.mo96485o();
            if (!m179560C()) {
                mo96536u(false);
                mo96532q(false);
                if (z) {
                    this.f300875o.mo96482l();
                }
                mo96537v();
            } else if (this.f300871h) {
                this.f300875o.mo96484n();
            } else {
                this.f300875o.mo96483m();
            }
        }
    }

    /* renamed from: o */
    public final void mo96495o() {
        if (this.f300873j == 3) {
            this.f300875o.mo96486p();
            mo96527i();
            mo96534s(false);
        }
    }

    /* renamed from: p */
    public final void mo96531p() {
        this.f300869f.set(true);
    }

    /* renamed from: q */
    public final void mo96532q(boolean z) {
        if (this.f300886z != z) {
            this.f300886z = z;
            m179558A();
            this.f300867d.updateViewLayout(mo96521c(), m179563x());
            if (z) {
                mo96521c().setVisibility(0);
                mo96521c().animate().alpha(1.0f).start();
                return;
            }
            mo96521c().animate().alpha(0.0f).withEndAction(new C108175s(this)).start();
        }
    }

    /* renamed from: r */
    public final void mo96533r(int i, int i2) {
        this.f300868e.x = i;
        this.f300868e.y = i2;
        this.f300867d.updateViewLayout(mo96523e(), this.f300868e);
        m179559B();
        this.f300867d.updateViewLayout(mo96522d(), this.f300876p);
        if (this.f300859A) {
            this.f300867d.updateViewLayout(mo96524f(), m179564y());
        }
    }

    /* renamed from: s */
    public final void mo96534s(boolean z) {
        if (this.f300859A != z) {
            this.f300859A = z;
            if (z) {
                mo96524f().setVisibility(0);
                mo96524f().animate().alpha(1.0f).start();
                return;
            }
            mo96524f().animate().alpha(0.0f).withEndAction(new C108173q(this)).start();
        }
    }

    /* renamed from: t */
    public final void mo96535t(boolean z) {
        this.f300868e.flags &= -17;
        if (!z) {
            this.f300868e.flags |= 16;
        }
        this.f300867d.updateViewLayout(mo96523e(), this.f300868e);
    }

    /* renamed from: u */
    public final void mo96536u(boolean z) {
        Point point = new Point();
        this.f300867d.getDefaultDisplay().getSize(point);
        int i = this.f300868e.x;
        int i2 = point.x;
        int i3 = this.f300868e.y + (point.y / 2);
        int width = point.x - (mo96520b().getWidth() / 2);
        int width2 = mo96520b().getWidth() / 2;
        if (i + (i2 / 2) <= point.x / 2) {
            width = width2;
        }
        if (this.f300866c.mo79746e(C90037cp.f248628x)) {
            mo96520b().setOnTouchListener(new C108157c(this, this.f300877q, width < point.x / 2 ? 2 : 3));
        }
        float f = this.f300878r;
        int height = mo96520b().getHeight();
        int i4 = point.y;
        float f2 = this.f300878r;
        int height2 = mo96520b().getHeight();
        int i5 = width - (point.x / 2);
        int a = ((int) C91115n.m148869a(f + ((float) (height / 2)), (((float) i4) - f2) - ((float) (height2 / 2)), (float) i3)) - (point.y / 2);
        if (z) {
            mo96533r(i5, a);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f300868e.x, i5});
        ofInt.addUpdateListener(new C108184y(this));
        Duration duration = f300856k;
        ofInt.setDuration(duration.toMillis());
        ofInt.start();
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{this.f300868e.y, a});
        ofInt2.addUpdateListener(new C108159c(this));
        ofInt2.setDuration(duration.toMillis());
        ofInt2.start();
    }

    /* renamed from: v */
    public final void mo96537v() {
        if (this.f300873j == 3) {
            ((C60870cx) this.f300864F.getAndSet(this.f300865b.mo28204d("startMinimizeTimeout", f300857l.toMillis(), new C108176t(this)))).cancel(false);
        }
    }
}
