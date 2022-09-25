package android.support.p033v7.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.p098j.C2043bi;
import org.chromium.net.PrivateKeyType;

/* renamed from: android.support.v7.widget.cz */
/* compiled from: PG */
final class C0583cz extends C0648fj implements C0657fs {

    /* renamed from: r */
    private static final int[] f2242r = {16842919};

    /* renamed from: s */
    private static final int[] f2243s = new int[0];

    /* renamed from: A */
    private int f2244A = 0;

    /* renamed from: B */
    private final int[] f2245B = new int[2];

    /* renamed from: C */
    private final int[] f2246C = new int[2];

    /* renamed from: D */
    private final Runnable f2247D;

    /* renamed from: E */
    private final C0658ft f2248E;

    /* renamed from: a */
    public final int f2249a;

    /* renamed from: b */
    final StateListDrawable f2250b;

    /* renamed from: c */
    final Drawable f2251c;

    /* renamed from: d */
    int f2252d;

    /* renamed from: e */
    int f2253e;

    /* renamed from: f */
    float f2254f;

    /* renamed from: g */
    int f2255g;

    /* renamed from: h */
    int f2256h;

    /* renamed from: i */
    float f2257i;

    /* renamed from: j */
    public int f2258j = 0;

    /* renamed from: k */
    public int f2259k = 0;

    /* renamed from: l */
    public RecyclerView f2260l;

    /* renamed from: m */
    public boolean f2261m = false;

    /* renamed from: n */
    public boolean f2262n = false;

    /* renamed from: o */
    public int f2263o = 0;

    /* renamed from: p */
    final ValueAnimator f2264p;

    /* renamed from: q */
    int f2265q;

    /* renamed from: t */
    private final int f2266t;

    /* renamed from: u */
    private final int f2267u;

    /* renamed from: v */
    private final int f2268v;

    /* renamed from: w */
    private final StateListDrawable f2269w;

    /* renamed from: x */
    private final Drawable f2270x;

    /* renamed from: y */
    private final int f2271y;

    /* renamed from: z */
    private final int f2272z;

    public C0583cz(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2264p = ofFloat;
        this.f2265q = 0;
        this.f2247D = new C0579cv(this);
        C0580cw cwVar = new C0580cw(this);
        this.f2248E = cwVar;
        this.f2250b = stateListDrawable;
        this.f2251c = drawable;
        this.f2269w = stateListDrawable2;
        this.f2270x = drawable2;
        this.f2267u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2268v = Math.max(i, drawable.getIntrinsicWidth());
        this.f2271y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2272z = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2249a = i2;
        this.f2266t = i3;
        stateListDrawable.setAlpha(PrivateKeyType.INVALID);
        drawable.setAlpha(PrivateKeyType.INVALID);
        ofFloat.addListener(new C0581cx(this));
        ofFloat.addUpdateListener(new C0582cy(this));
        RecyclerView recyclerView2 = this.f2260l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f2260l.removeOnItemTouchListener(this);
                this.f2260l.removeOnScrollListener(cwVar);
                m2125e();
            }
            this.f2260l = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration$ar$ds(this);
                this.f2260l.mOnItemTouchListeners.add(this);
                this.f2260l.addOnScrollListener(cwVar);
            }
        }
    }

    /* renamed from: e */
    private final void m2125e() {
        this.f2260l.removeCallbacks(this.f2247D);
    }

    /* renamed from: f */
    private final void m2126f(int i) {
        m2125e();
        this.f2260l.postDelayed(this.f2247D, (long) i);
    }

    /* renamed from: g */
    private final boolean m2127g() {
        return C2043bi.m5577f(this.f2260l) == 1;
    }

    /* renamed from: h */
    private static final int m2128h(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2716a(int i) {
        if (i == 2 && this.f2263o != 2) {
            this.f2250b.setState(f2242r);
            m2125e();
        }
        if (i == 0) {
            this.f2260l.invalidate();
        } else {
            mo2717b();
        }
        if (this.f2263o == 2 && i != 2) {
            this.f2250b.setState(f2243s);
            m2126f(1200);
        } else if (i == 1) {
            m2126f(1500);
        }
        this.f2263o = i;
    }

    /* renamed from: b */
    public final void mo2717b() {
        int i = this.f2265q;
        if (i != 0) {
            if (i == 3) {
                this.f2264p.cancel();
            } else {
                return;
            }
        }
        this.f2265q = 1;
        ValueAnimator valueAnimator = this.f2264p;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2264p.setDuration(500);
        this.f2264p.setStartDelay(0);
        this.f2264p.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo2718c(float f, float f2) {
        if (f2 < ((float) (this.f2259k - this.f2271y))) {
            return false;
        }
        int i = this.f2256h;
        int i2 = this.f2255g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo2719d(float f, float f2) {
        if (m2127g()) {
            if (f > ((float) this.f2267u)) {
                return false;
            }
        } else if (f < ((float) (this.f2258j - this.f2267u))) {
            return false;
        }
        int i = this.f2253e;
        int i2 = this.f2252d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    public final void onDrawOver$ar$ds(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2258j != this.f2260l.getWidth() || this.f2259k != this.f2260l.getHeight()) {
            this.f2258j = this.f2260l.getWidth();
            this.f2259k = this.f2260l.getHeight();
            mo2716a(0);
        } else if (this.f2265q != 0) {
            if (this.f2261m) {
                int i = this.f2258j;
                int i2 = this.f2267u;
                int i3 = i - i2;
                int i4 = this.f2253e;
                int i5 = this.f2252d;
                int i6 = i4 - (i5 / 2);
                this.f2250b.setBounds(0, 0, i2, i5);
                this.f2251c.setBounds(0, 0, this.f2268v, this.f2259k);
                if (m2127g()) {
                    this.f2251c.draw(canvas);
                    canvas.translate((float) this.f2267u, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2250b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f2267u), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f2251c.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f2250b.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f2262n) {
                int i7 = this.f2259k;
                int i8 = this.f2271y;
                int i9 = i7 - i8;
                int i10 = this.f2256h;
                int i11 = this.f2255g;
                int i12 = i10 - (i11 / 2);
                this.f2269w.setBounds(0, 0, i11, i8);
                this.f2270x.setBounds(0, 0, this.f2258j, this.f2272z);
                canvas.translate(0.0f, (float) i9);
                this.f2270x.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f2269w.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2263o;
        if (i != 1) {
            return i == 2;
        }
        boolean d = mo2719d(motionEvent.getX(), motionEvent.getY());
        boolean c = mo2718c(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!d) {
            if (!c) {
                return false;
            }
        } else if (!c) {
            this.f2244A = 2;
            this.f2254f = (float) ((int) motionEvent.getY());
            mo2716a(2);
            return true;
        }
        this.f2244A = 1;
        this.f2257i = (float) ((int) motionEvent.getX());
        mo2716a(2);
        return true;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent$ar$ds(MotionEvent motionEvent) {
        if (this.f2263o != 0) {
            if (motionEvent.getAction() == 0) {
                boolean d = mo2719d(motionEvent.getX(), motionEvent.getY());
                boolean c = mo2718c(motionEvent.getX(), motionEvent.getY());
                if (!d) {
                    if (!c) {
                        return;
                    }
                } else if (!c) {
                    this.f2244A = 2;
                    this.f2254f = (float) ((int) motionEvent.getY());
                    mo2716a(2);
                }
                this.f2244A = 1;
                this.f2257i = (float) ((int) motionEvent.getX());
                mo2716a(2);
            } else if (motionEvent.getAction() == 1 && this.f2263o == 2) {
                this.f2254f = 0.0f;
                this.f2257i = 0.0f;
                mo2716a(1);
                this.f2244A = 0;
            } else if (motionEvent.getAction() == 2 && this.f2263o == 2) {
                mo2717b();
                if (this.f2244A == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f2246C;
                    int i = this.f2266t;
                    iArr[0] = i;
                    int i2 = this.f2258j - i;
                    iArr[1] = i2;
                    float max = Math.max((float) i, Math.min((float) i2, x));
                    if (Math.abs(((float) this.f2256h) - max) >= 2.0f) {
                        int h = m2128h(this.f2257i, max, iArr, this.f2260l.computeHorizontalScrollRange(), this.f2260l.computeHorizontalScrollOffset(), this.f2258j);
                        if (h != 0) {
                            this.f2260l.scrollBy(h, 0);
                        }
                        this.f2257i = max;
                    }
                }
                if (this.f2244A == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f2245B;
                    int i3 = this.f2266t;
                    iArr2[0] = i3;
                    int i4 = this.f2259k - i3;
                    iArr2[1] = i4;
                    float max2 = Math.max((float) i3, Math.min((float) i4, y));
                    if (Math.abs(((float) this.f2253e) - max2) >= 2.0f) {
                        int h2 = m2128h(this.f2254f, max2, iArr2, this.f2260l.computeVerticalScrollRange(), this.f2260l.computeVerticalScrollOffset(), this.f2259k);
                        if (h2 != 0) {
                            this.f2260l.scrollBy(0, h2);
                        }
                        this.f2254f = max2;
                    }
                }
            }
        }
    }
}
