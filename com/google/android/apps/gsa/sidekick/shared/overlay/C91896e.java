package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.gsa.searchplate.p6963a.C88897g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90274c;
import com.google.android.apps.gsa.shared.p6993ao.C89250o;
import com.google.android.apps.gsa.shared.p6993ao.C89252q;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.e */
/* compiled from: PG */
public final class C91896e implements C88897g, C90274c {

    /* renamed from: a */
    public Rect f256229a;

    /* renamed from: b */
    ValueAnimator f256230b;

    /* renamed from: c */
    public final Context f256231c;

    /* renamed from: d */
    public final C91895d f256232d = new C91895d(this);

    /* renamed from: e */
    public final boolean f256233e;

    /* renamed from: f */
    public int f256234f;

    /* renamed from: g */
    int f256235g;

    /* renamed from: h */
    public C90208n f256236h;

    /* renamed from: i */
    final int f256237i;

    /* renamed from: j */
    public C90714z f256238j;

    /* renamed from: k */
    public boolean f256239k;

    /* renamed from: l */
    public int f256240l = 1;

    /* renamed from: m */
    public final C89252q f256241m;

    /* renamed from: n */
    private Integer f256242n;

    /* renamed from: o */
    private final int f256243o;

    /* renamed from: p */
    private float f256244p;

    /* renamed from: q */
    private final ValueAnimator.AnimatorUpdateListener f256245q = new C91893b(this);

    public C91896e(Context context, Rect rect, C89252q qVar, boolean z, boolean z2) {
        this.f256231c = context;
        this.f256229a = rect;
        this.f256241m = qVar;
        this.f256233e = z2;
        this.f256243o = context.getResources().getDimensionPixelSize(true != z ? R.dimen.now_header_height_resized_small : R.dimen.now_header_height_resized_mini);
        this.f256235g = 0;
        mo86480h();
        this.f256237i = (int) C91115n.m148870b(64.0f, context);
    }

    /* renamed from: i */
    private final int m150616i() {
        int i = this.f256243o;
        Rect rect = this.f256229a;
        return rect != null ? i + rect.top : i;
    }

    /* renamed from: j */
    private final void m150617j() {
        if (this.f256238j != null) {
            mo86480h();
        } else {
            mo86479g(true);
        }
    }

    /* renamed from: k */
    private final void m150618k(int i) {
        int i2;
        this.f256242n = null;
        if (i == 0 && this.f256240l == 2) {
            this.f256239k = true;
            this.f256240l = 1;
            C90714z zVar = this.f256238j;
            if (zVar != null) {
                zVar.mo85043e();
                i2 = this.f256238j.mo85041a(0, 2);
            } else {
                i2 = mo86475c();
            }
            ValueAnimator valueAnimator = this.f256230b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{this.f256241m.f242010c, (float) i2}).setDuration(300);
            this.f256230b = duration;
            duration.addUpdateListener(this.f256245q);
            this.f256230b.addListener(new C91894c(this));
            this.f256230b.start();
            if (m150620m()) {
                m150619l(false);
            }
        }
    }

    /* renamed from: l */
    private final void m150619l(boolean z) {
        C90714z zVar = this.f256238j;
        if (zVar != null) {
            if (this.f256240l == 1) {
                zVar.mo85044h(z, z);
            } else {
                zVar.mo85044h(false, false);
            }
        }
        if (z) {
            mo86480h();
        }
    }

    /* renamed from: m */
    private final boolean m150620m() {
        C90208n nVar = this.f256236h;
        if (nVar == null) {
            return false;
        }
        int ordinal = nVar.ordinal();
        return (ordinal == 6 || ordinal == 7) && this.f256240l == 1;
    }

    /* renamed from: a */
    public final void mo81837a(int i, int i2, boolean z) {
        this.f256234f = i;
        if (z) {
            m150618k(i);
        } else {
            this.f256242n = Integer.valueOf(i);
        }
        if (i == 2 || i == 1 || (i2 & 1) != 0) {
            m150619l(true);
            mo86478f();
        }
    }

    /* renamed from: b */
    public final void mo81838b() {
        Integer num = this.f256242n;
        if (num != null) {
            m150618k(num.intValue());
        }
    }

    /* renamed from: c */
    public final int mo86475c() {
        C89252q qVar = this.f256241m;
        qVar.getClass();
        int i = qVar.f242008a.f241535a;
        Rect rect = this.f256229a;
        if (rect != null) {
            i += rect.top;
        }
        return m150616i() - i;
    }

    /* renamed from: d */
    public final void mo86476d() {
        ValueAnimator valueAnimator = this.f256230b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f256230b = null;
        }
        this.f256239k = false;
    }

    /* renamed from: e */
    public final void mo86477e(int i, int i2, int i3) {
        this.f256235g = i;
        C90714z zVar = this.f256238j;
        if (zVar != null) {
            if (i != -1) {
                if (this.f256244p != 0.0f || i2 < 0 || this.f256233e) {
                    this.f256244p = C91115n.m148879k((float) (m150616i() - this.f256237i), (float) m150616i(), 0.0f, (float) i);
                }
                m150617j();
                zVar.mo81847b(i, Integer.MAX_VALUE);
                return;
            }
            this.f256244p = C91115n.m148879k((float) (m150616i() - this.f256237i), (float) m150616i(), 0.0f, 2.14748365E9f);
            m150617j();
            zVar.f253750e = zVar.f253747b + zVar.mo85042c();
            zVar.f253751f = Integer.MAX_VALUE;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    zVar.mo85047k(0, 5);
                    return;
                }
            }
            zVar.mo85047k(-i2, 0);
        }
    }

    /* renamed from: f */
    public final void mo86478f() {
        mo86476d();
        this.f256240l = 2;
        C90714z zVar = this.f256238j;
        if (zVar != null) {
            zVar.mo85044h(false, false);
        }
        mo86479g(false);
        mo86480h();
    }

    /* renamed from: g */
    public final void mo86479g(boolean z) {
        int i;
        if ((!z || this.f256238j == null || m150620m()) && !this.f256239k && this.f256240l != 0) {
            C90208n nVar = C90208n.UNKNOWN_TAB;
            int i2 = this.f256240l;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                if (this.f256235g == -1) {
                    i = -this.f256232d.mo85038a();
                } else {
                    i = mo86475c() - this.f256235g;
                }
                C89252q qVar = this.f256241m;
                qVar.getClass();
                qVar.mo83207b((float) i);
            } else if (i3 == 1) {
                C89252q qVar2 = this.f256241m;
                qVar2.getClass();
                qVar2.mo83207b(0.0f);
            }
        }
    }

    /* renamed from: h */
    public final void mo86480h() {
        float f;
        if (this.f256238j == null) {
            f = 0.0f;
        } else {
            f = this.f256244p;
        }
        C89252q qVar = this.f256241m;
        qVar.getClass();
        qVar.f242011d = f;
        C89250o oVar = qVar.f242013f;
        if (oVar != null) {
            oVar.f242006a.mo83194e(f);
        }
    }

    /* renamed from: n */
    public final void mo82752n() {
    }
}
