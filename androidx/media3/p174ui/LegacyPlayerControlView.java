package androidx.media3.p174ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C2591ar;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2659c;
import androidx.media3.common.C2682z;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.ui.LegacyPlayerControlView */
/* compiled from: PG */
public class LegacyPlayerControlView extends FrameLayout {

    /* renamed from: A */
    private final String f11624A;

    /* renamed from: B */
    private final String f11625B;

    /* renamed from: C */
    private final String f11626C;

    /* renamed from: D */
    private final Drawable f11627D;

    /* renamed from: E */
    private final Drawable f11628E;

    /* renamed from: F */
    private final float f11629F;

    /* renamed from: G */
    private final float f11630G;

    /* renamed from: H */
    private final String f11631H;

    /* renamed from: I */
    private final String f11632I;

    /* renamed from: J */
    private boolean f11633J;

    /* renamed from: K */
    private int f11634K;

    /* renamed from: L */
    private int f11635L;

    /* renamed from: M */
    private boolean f11636M;

    /* renamed from: N */
    private boolean f11637N;

    /* renamed from: O */
    private boolean f11638O;

    /* renamed from: P */
    private boolean f11639P;

    /* renamed from: Q */
    private boolean f11640Q;

    /* renamed from: R */
    private long f11641R;

    /* renamed from: S */
    private long[] f11642S;

    /* renamed from: T */
    private boolean[] f11643T;

    /* renamed from: U */
    private long[] f11644U;

    /* renamed from: V */
    private boolean[] f11645V;

    /* renamed from: W */
    private long f11646W;

    /* renamed from: a */
    public final C3644h f11647a;

    /* renamed from: aa */
    private long f11648aa;

    /* renamed from: b */
    public final View f11649b;

    /* renamed from: c */
    public final View f11650c;

    /* renamed from: d */
    public final View f11651d;

    /* renamed from: e */
    public final View f11652e;

    /* renamed from: f */
    public final View f11653f;

    /* renamed from: g */
    public final View f11654g;

    /* renamed from: h */
    public final ImageView f11655h;

    /* renamed from: i */
    public final ImageView f11656i;

    /* renamed from: j */
    public final TextView f11657j;

    /* renamed from: k */
    public final StringBuilder f11658k;

    /* renamed from: l */
    public final Formatter f11659l;

    /* renamed from: m */
    public C2646bh f11660m;

    /* renamed from: n */
    public boolean f11661n;

    /* renamed from: o */
    public int f11662o;

    /* renamed from: p */
    private final CopyOnWriteArrayList f11663p;

    /* renamed from: q */
    private final View f11664q;

    /* renamed from: r */
    private final TextView f11665r;

    /* renamed from: s */
    private final C3660x f11666s;

    /* renamed from: t */
    private final C2649bk f11667t;

    /* renamed from: u */
    private final C2650bl f11668u;

    /* renamed from: v */
    private final Runnable f11669v;

    /* renamed from: w */
    private final Runnable f11670w;

    /* renamed from: x */
    private final Drawable f11671x;

    /* renamed from: y */
    private final Drawable f11672y;

    /* renamed from: z */
    private final Drawable f11673z;

    static {
        C2591ar.m6797b("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: l */
    public static final void m10504l(C2646bh bhVar) {
        int e = bhVar.mo5998e();
        if (e == 1) {
            bhVar.mo6017x();
        } else if (e == 4) {
            bhVar.mo5996c();
            ((C2682z) bhVar).mo6263ah(-9223372036854775807L);
        }
        ((C2682z) bhVar).mo5974B(true);
    }

    /* renamed from: m */
    private final void m10505m() {
        removeCallbacks(this.f11670w);
        if (this.f11634K > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = (long) this.f11634K;
            this.f11641R = uptimeMillis + j;
            if (this.f11633J) {
                postDelayed(this.f11670w, j);
                return;
            }
            return;
        }
        this.f11641R = -9223372036854775807L;
    }

    /* renamed from: n */
    private final void m10506n() {
        if (!m10509q()) {
            View view = this.f11651d;
            if (view != null) {
                view.sendAccessibilityEvent(8);
                return;
            }
            return;
        }
        View view2 = this.f11652e;
        if (view2 != null) {
            view2.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: o */
    private final void m10507o() {
        if (!m10509q()) {
            View view = this.f11651d;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        View view2 = this.f11652e;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    /* renamed from: p */
    private final void m10508p(boolean z, boolean z2, View view) {
        float f;
        if (view != null) {
            view.setEnabled(z2);
            if (z2) {
                f = this.f11629F;
            } else {
                f = this.f11630G;
            }
            view.setAlpha(f);
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    /* renamed from: q */
    private final boolean m10509q() {
        C2646bh bhVar = this.f11660m;
        if (bhVar == null || bhVar.mo5998e() == 4 || this.f11660m.mo5998e() == 1 || !this.f11660m.mo5987O()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7663a() {
        if (mo7675k()) {
            setVisibility(8);
            Iterator it = this.f11663p.iterator();
            while (it.hasNext()) {
                getVisibility();
                ((C3645i) it.next()).mo7688a();
            }
            removeCallbacks(this.f11669v);
            removeCallbacks(this.f11670w);
            this.f11641R = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void mo7664b(int i) {
        this.f11634K = i;
        if (mo7675k()) {
            m10505m();
        }
    }

    /* renamed from: c */
    public final void mo7665c() {
        if (!mo7675k()) {
            setVisibility(0);
            Iterator it = this.f11663p.iterator();
            while (it.hasNext()) {
                getVisibility();
                ((C3645i) it.next()).mo7688a();
            }
            mo7666d();
            m10507o();
            m10506n();
        }
        m10505m();
    }

    /* renamed from: d */
    public final void mo7666d() {
        mo7670f();
        mo7669e();
        mo7672h();
        mo7673i();
        mo7674j();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C2646bh bhVar = this.f11660m;
        if (bhVar != null) {
            if (!(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87)) {
                if (keyCode == 88) {
                    keyCode = 88;
                }
            }
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (bhVar.mo5998e() != 4) {
                        bhVar.mo6262ag();
                    }
                } else if (keyCode == 89) {
                    bhVar.mo6261af();
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode == 79 || keyCode == 85) {
                        int e = bhVar.mo5998e();
                        if (e == 1 || e == 4 || !bhVar.mo5987O()) {
                            m10504l(bhVar);
                        } else {
                            ((C2682z) bhVar).mo5974B(false);
                        }
                    } else if (keyCode == 87) {
                        bhVar.mo6265aj();
                    } else if (keyCode == 88) {
                        bhVar.mo6267al();
                    } else if (keyCode == 126) {
                        m10504l(bhVar);
                    } else if (keyCode == 127) {
                        ((C2682z) bhVar).mo5974B(false);
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f11670w);
        } else if (motionEvent.getAction() == 1) {
            m10505m();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo7669e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (mo7675k() && this.f11633J) {
            C2646bh bhVar = this.f11660m;
            if (bhVar != null) {
                z4 = bhVar.mo6272ar(5);
                z3 = bhVar.mo6272ar(7);
                z2 = bhVar.mo6272ar(11);
                z = bhVar.mo6272ar(12);
                z5 = bhVar.mo6272ar(9);
            } else {
                z4 = false;
                z5 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            m10508p(this.f11638O, z3, this.f11649b);
            m10508p(this.f11636M, z2, this.f11654g);
            m10508p(this.f11637N, z, this.f11653f);
            m10508p(this.f11639P, z5, this.f11650c);
            C3660x xVar = this.f11666s;
            if (xVar != null) {
                xVar.setEnabled(z4);
            }
        }
    }

    /* renamed from: f */
    public final void mo7670f() {
        boolean z;
        boolean z2;
        if (mo7675k() && this.f11633J) {
            boolean q = m10509q();
            View view = this.f11651d;
            int i = 8;
            if (view != null) {
                z2 = q && view.isFocused();
                int i2 = C2612ak.f7249a;
                z = q && C3643g.m10523a(this.f11651d);
                this.f11651d.setVisibility(true != q ? 0 : 8);
            } else {
                z2 = false;
                z = false;
            }
            View view2 = this.f11652e;
            if (view2 != null) {
                z2 |= !q && view2.isFocused();
                int i3 = C2612ak.f7249a;
                z |= !q && C3643g.m10523a(this.f11652e);
                View view3 = this.f11652e;
                if (true == q) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z2) {
                m10507o();
            }
            if (z) {
                m10506n();
            }
        }
    }

    /* renamed from: g */
    public final void mo7671g() {
        long j;
        long j2;
        int i;
        if (mo7675k() && this.f11633J) {
            C2646bh bhVar = this.f11660m;
            if (bhVar != null) {
                j2 = this.f11646W + bhVar.mo6003j();
                j = this.f11646W + bhVar.mo6002i();
            } else {
                j2 = 0;
                j = 0;
            }
            long j3 = this.f11648aa;
            this.f11648aa = j2;
            TextView textView = this.f11657j;
            if (!(textView == null || this.f11661n || j2 == j3)) {
                textView.setText(C2612ak.m6935R(this.f11658k, this.f11659l, j2));
            }
            C3660x xVar = this.f11666s;
            if (xVar != null) {
                xVar.mo7649f(j2);
                this.f11666s.mo7646d(j);
            }
            removeCallbacks(this.f11669v);
            if (bhVar == null) {
                i = 1;
            } else {
                i = bhVar.mo5998e();
            }
            long j4 = 1000;
            if (bhVar != null && bhVar.mo6277aw()) {
                C3660x xVar2 = this.f11666s;
                long min = Math.min(xVar2 != null ? xVar2.mo7643a() : 1000, 1000 - (j2 % 1000));
                float f = bhVar.mo6012s().f7313b;
                if (f > 0.0f) {
                    j4 = (long) (((float) min) / f);
                }
                postDelayed(this.f11669v, C2612ak.m6994s(j4, (long) this.f11635L, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f11669v, 1000);
            }
        }
    }

    /* renamed from: h */
    public final void mo7672h() {
        ImageView imageView;
        if (mo7675k() && this.f11633J && (imageView = this.f11655h) != null) {
            if (this.f11662o == 0) {
                m10508p(false, false, imageView);
                return;
            }
            C2646bh bhVar = this.f11660m;
            if (bhVar == null) {
                m10508p(true, false, imageView);
                this.f11655h.setImageDrawable(this.f11671x);
                this.f11655h.setContentDescription(this.f11624A);
                return;
            }
            m10508p(true, true, imageView);
            int g = bhVar.mo6000g();
            if (g == 0) {
                this.f11655h.setImageDrawable(this.f11671x);
                this.f11655h.setContentDescription(this.f11624A);
            } else if (g == 1) {
                this.f11655h.setImageDrawable(this.f11672y);
                this.f11655h.setContentDescription(this.f11625B);
            } else if (g == 2) {
                this.f11655h.setImageDrawable(this.f11673z);
                this.f11655h.setContentDescription(this.f11626C);
            }
            this.f11655h.setVisibility(0);
        }
    }

    /* renamed from: i */
    public final void mo7673i() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (mo7675k() && this.f11633J && (imageView = this.f11656i) != null) {
            C2646bh bhVar = this.f11660m;
            if (!this.f11640Q) {
                m10508p(false, false, imageView);
            } else if (bhVar == null) {
                m10508p(true, false, imageView);
                this.f11656i.setImageDrawable(this.f11628E);
                this.f11656i.setContentDescription(this.f11632I);
            } else {
                m10508p(true, true, imageView);
                ImageView imageView2 = this.f11656i;
                if (bhVar.mo5988P()) {
                    drawable = this.f11627D;
                } else {
                    drawable = this.f11628E;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f11656i;
                if (bhVar.mo5988P()) {
                    str = this.f11631H;
                } else {
                    str = this.f11632I;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* renamed from: j */
    public final void mo7674j() {
        int i;
        C2650bl blVar;
        long j;
        C2646bh bhVar = this.f11660m;
        if (bhVar != null) {
            long j2 = 0;
            this.f11646W = 0;
            C2651bm u = bhVar.mo6014u();
            boolean z = false;
            if (!u.mo6304o()) {
                int c = bhVar.mo5996c();
                int i2 = c;
                long j3 = 0;
                i = 0;
                while (i2 <= c) {
                    if (i2 == c) {
                        this.f11646W = C2612ak.m6918A(j3);
                    }
                    u.mo6024e(i2, this.f11668u, 0);
                    C2650bl blVar2 = this.f11668u;
                    if (blVar2.f7349n == -9223372036854775807L) {
                        break;
                    }
                    int i3 = blVar2.f7350o;
                    while (true) {
                        blVar = this.f11668u;
                        if (i3 > blVar.f7351p) {
                            break;
                        }
                        u.mo6023d(i3, this.f11667t, z);
                        C2659c cVar = this.f11667t.f7334g;
                        int i4 = cVar.f7418f;
                        int i5 = cVar.f7415c;
                        int i6 = 0;
                        while (i6 < i5) {
                            long f = this.f11667t.mo6286f(i6);
                            if (f == Long.MIN_VALUE) {
                                j = j3;
                                long j4 = this.f11667t.f7331d;
                                if (j4 == -9223372036854775807L) {
                                    i6++;
                                    j3 = j;
                                } else {
                                    f = j4;
                                }
                            } else {
                                j = j3;
                            }
                            long j5 = f + this.f11667t.f7332e;
                            if (j5 >= 0) {
                                long[] jArr = this.f11642S;
                                int length = jArr.length;
                                if (i == length) {
                                    int i7 = length == 0 ? 1 : length + length;
                                    this.f11642S = Arrays.copyOf(jArr, i7);
                                    this.f11643T = Arrays.copyOf(this.f11643T, i7);
                                }
                                this.f11642S[i] = C2612ak.m6918A(j + j5);
                                this.f11643T[i] = this.f11667t.mo6287g(i6);
                                i++;
                            }
                            i6++;
                            j3 = j;
                        }
                        long j6 = j3;
                        i3++;
                        z = false;
                    }
                    i2++;
                    j3 += blVar.f7349n;
                    z = false;
                }
                j2 = j3;
            } else {
                i = 0;
            }
            long A = C2612ak.m6918A(j2);
            TextView textView = this.f11665r;
            if (textView != null) {
                textView.setText(C2612ak.m6935R(this.f11658k, this.f11659l, A));
            }
            C3660x xVar = this.f11666s;
            if (xVar != null) {
                xVar.mo7648e(A);
                int length2 = this.f11644U.length;
                long[] jArr2 = this.f11642S;
                if (i > jArr2.length) {
                    this.f11642S = Arrays.copyOf(jArr2, i);
                    this.f11643T = Arrays.copyOf(this.f11643T, i);
                }
                System.arraycopy(this.f11644U, 0, this.f11642S, i, 0);
                System.arraycopy(this.f11645V, 0, this.f11643T, i, 0);
                this.f11666s.mo7645c(this.f11642S, this.f11643T, i);
            }
            mo7671g();
        }
    }

    /* renamed from: k */
    public final boolean mo7675k() {
        return getVisibility() == 0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11633J = true;
        long j = this.f11641R;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo7663a();
            } else {
                postDelayed(this.f11670w, uptimeMillis);
            }
        } else if (mo7675k()) {
            m10505m();
        }
        mo7666d();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11633J = false;
        removeCallbacks(this.f11669v);
        removeCallbacks(this.f11670w);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        this.f11634K = 5000;
        this.f11662o = 0;
        this.f11635L = 200;
        this.f11641R = -9223372036854775807L;
        this.f11636M = true;
        this.f11637N = true;
        this.f11638O = true;
        this.f11639P = true;
        this.f11640Q = false;
        int i2 = R.layout.exo_legacy_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3653q.f11751c, i, 0);
            try {
                this.f11634K = obtainStyledAttributes.getInt(19, this.f11634K);
                i2 = obtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.f11662o = obtainStyledAttributes.getInt(8, this.f11662o);
                this.f11636M = obtainStyledAttributes.getBoolean(17, this.f11636M);
                this.f11637N = obtainStyledAttributes.getBoolean(14, this.f11637N);
                this.f11638O = obtainStyledAttributes.getBoolean(16, this.f11638O);
                this.f11639P = obtainStyledAttributes.getBoolean(15, this.f11639P);
                this.f11640Q = obtainStyledAttributes.getBoolean(18, this.f11640Q);
                this.f11635L = C2612ak.m6981f(obtainStyledAttributes.getInt(20, this.f11635L), 16, 1000);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f11663p = new CopyOnWriteArrayList();
        this.f11667t = new C2649bk();
        this.f11668u = new C2650bl();
        StringBuilder sb = new StringBuilder();
        this.f11658k = sb;
        this.f11659l = new Formatter(sb, Locale.getDefault());
        this.f11642S = new long[0];
        this.f11643T = new boolean[0];
        this.f11644U = new long[0];
        this.f11645V = new boolean[0];
        C3644h hVar = new C3644h(this);
        this.f11647a = hVar;
        this.f11669v = new C3641e(this);
        this.f11670w = new C3642f(this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        C3660x xVar = (C3660x) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (xVar != null) {
            this.f11666s = xVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f11666s = defaultTimeBar;
        } else {
            this.f11666s = null;
        }
        this.f11665r = (TextView) findViewById(R.id.exo_duration);
        this.f11657j = (TextView) findViewById(R.id.exo_position);
        C3660x xVar2 = this.f11666s;
        if (xVar2 != null) {
            xVar2.mo7644b(hVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f11651d = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(hVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f11652e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(hVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f11649b = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(hVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f11650c = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(hVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f11654g = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(hVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f11653f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(hVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f11655h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(hVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f11656i = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(hVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f11664q = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        m10508p(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f11629F = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f11630G = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f11671x = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_off);
        this.f11672y = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_one);
        this.f11673z = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_all);
        this.f11627D = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_on);
        this.f11628E = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_off);
        this.f11624A = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f11625B = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f11626C = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f11631H = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f11632I = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f11648aa = -9223372036854775807L;
    }
}
