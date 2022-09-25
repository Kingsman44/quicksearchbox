package com.google.android.libraries.home.coreui.devicetile;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23640b;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23646h;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23652n;
import com.google.android.libraries.home.coreui.p1951b.p1952a.C23635a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69699g;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bz */
/* compiled from: PG */
public final class C23707bz implements C23638a {

    /* renamed from: l */
    private static final C59071e f64834l = C59071e.m91331h();

    /* renamed from: a */
    public ValueAnimator f64835a;

    /* renamed from: b */
    public Drawable f64836b;

    /* renamed from: c */
    public String f64837c;

    /* renamed from: d */
    public Control f64838d;

    /* renamed from: e */
    public C23656ab f64839e;

    /* renamed from: f */
    public C23646h f64840f;

    /* renamed from: g */
    public C23652n f64841g;

    /* renamed from: h */
    public Context f64842h;

    /* renamed from: i */
    public boolean f64843i;

    /* renamed from: j */
    public boolean f64844j;

    /* renamed from: k */
    public boolean f64845k;

    /* renamed from: m */
    private CharSequence f64846m = BuildConfig.FLAVOR;

    /* renamed from: n */
    private String f64847n = BuildConfig.FLAVOR;

    /* renamed from: o */
    private int f64848o;

    /* renamed from: p */
    private final C23703bv f64849p = new C23703bv(this);

    /* renamed from: j */
    private final String m44192j(String str, String str2, float f) {
        try {
            String format = String.format(str, Arrays.copyOf(new Object[]{Float.valueOf(mo29051c(f))}, 1));
            C69664n.m101060f(format, "format(format, *args)");
            return format;
        } catch (IllegalFormatException e) {
            C59052c cVar = (C59052c) ((C59052c) f64834l.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(48670));
            cVar.mo56386p("Illegal format in range template");
            if (C69664n.m101066l(str2, BuildConfig.FLAVOR)) {
                return BuildConfig.FLAVOR;
            }
            return m44192j(str2, BuildConfig.FLAVOR, f);
        }
    }

    /* renamed from: k */
    private final boolean m44193k(C23642d dVar) {
        if (dVar instanceof C23652n) {
            C23652n nVar = (C23652n) dVar;
            this.f64841g = nVar;
            this.f64840f = nVar.f64694a;
            this.f64844j = true;
            this.f64843i = nVar.f64695b;
            return true;
        }
        boolean z = false;
        C23646h hVar = null;
        if (dVar instanceof C23646h) {
            C23646h hVar2 = (C23646h) dVar;
            this.f64841g = null;
            this.f64840f = hVar2;
            if (hVar2 == null) {
                C69664n.m101065k("rangeTemplate");
            } else {
                hVar = hVar2;
            }
            float f = hVar.f64665b;
            if (this.f64840f == null) {
                C69664n.m101065k("rangeTemplate");
            }
            if (f != 0.0f) {
                z = true;
            }
            this.f64843i = z;
            return true;
        } else if (dVar instanceof C23640b) {
            C23640b bVar = (C23640b) dVar;
            throw null;
        } else if (dVar instanceof C23651m) {
            return m44193k(((C23651m) dVar).f64687b);
        } else {
            C59052c cVar = (C59052c) f64834l.mo56225c();
            cVar.mo56379ah(new C59094n(48671));
            cVar.mo56389s("Unsupported template type: %s", dVar);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        this.f64838d = control;
        this.f64848o = i;
        this.f64846m = control.f64890h;
        C23646h hVar = null;
        ((C23674at) mo29054f()).f64761l.setOnLongClickListener((View.OnLongClickListener) null);
        Drawable background = ((C23674at) mo29054f()).f64761l.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        Drawable findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.clip_layer);
        C69664n.m101060f(findDrawableByLayerId, "ld.findDrawableByLayerId(R.id.clip_layer)");
        this.f64836b = findDrawableByLayerId;
        C23642d dVar = control.f64889g;
        if (m44193k(dVar)) {
            this.f64837c = dVar.mo28966a();
            C23646h hVar2 = this.f64840f;
            if (hVar2 == null) {
                C69664n.m101065k("rangeTemplate");
            } else {
                hVar = hVar2;
            }
            mo29056h(mo29053e(hVar.f64665b), this.f64843i, false);
            if (this.f64840f == null) {
                C69664n.m101065k("rangeTemplate");
            }
            C2043bi.m5526T(((C23674at) mo29054f()).f64761l, this.f64849p);
        }
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64839e = abVar;
        C23674at atVar = (C23674at) abVar;
        this.f64842h = atVar.f64764o;
        C23702bu buVar = new C23702bu(this, atVar.f64761l);
        Context context = this.f64842h;
        if (context == null) {
            C69664n.m101065k("context");
            context = null;
        }
        atVar.f64761l.setOnTouchListener(new C23704bw(this, new GestureDetector(context, new C23635a(buVar)), buVar));
    }

    /* renamed from: c */
    public final float mo29051c(float f) {
        if (this.f64840f == null) {
            C69664n.m101065k("rangeTemplate");
        }
        float f2 = Float.MAX_VALUE;
        float f3 = 0.0f;
        while (true) {
            if (this.f64840f == null) {
                C69664n.m101065k("rangeTemplate");
            }
            if (f3 <= 100.0f) {
                float abs = Math.abs(f - f3);
                if (abs < f2) {
                    if (this.f64840f == null) {
                        C69664n.m101065k("rangeTemplate");
                    }
                    f3 += 1.0f;
                    f2 = abs;
                } else {
                    if (this.f64840f == null) {
                        C69664n.m101065k("rangeTemplate");
                    }
                    return f3 - 4.0f;
                }
            } else {
                if (this.f64840f == null) {
                    C69664n.m101065k("rangeTemplate");
                }
                return 100.0f;
            }
        }
    }

    /* renamed from: d */
    public final float mo29052d(int i) {
        if (this.f64840f == null) {
            C69664n.m101065k("rangeTemplate");
        }
        if (this.f64840f == null) {
            C69664n.m101065k("rangeTemplate");
        }
        return (C23680az.m44171a((((float) i) + 0.0f) / 10000.0f) * 100.0f) + 0.0f;
    }

    /* renamed from: e */
    public final int mo29053e(float f) {
        if (this.f64840f == null) {
            C69664n.m101065k("rangeTemplate");
        }
        if (this.f64840f == null) {
            C69664n.m101065k("rangeTemplate");
        }
        return (int) ((C23680az.m44171a((f + 0.0f) / 100.0f) * 10000.0f) + 0.0f);
    }

    /* renamed from: f */
    public final C23656ab mo29054f() {
        C23656ab abVar = this.f64839e;
        if (abVar != null) {
            return abVar;
        }
        C69664n.m101065k("cvh");
        return null;
    }

    /* renamed from: g */
    public final void mo29055g() {
        CharSequence charSequence;
        C23656ab f = mo29054f();
        Context context = this.f64842h;
        Drawable drawable = null;
        if (context == null) {
            C69664n.m101065k("context");
            context = null;
        }
        f.mo29004d((float) context.getResources().getDimensionPixelSize(R.dimen.control_status_normal));
        Drawable drawable2 = this.f64836b;
        if (drawable2 == null) {
            C69664n.m101065k("clipLayer");
            drawable2 = null;
        }
        if (mo29052d(drawable2.getLevel()) == mo29052d(0) && !this.f64843i) {
            charSequence = this.f64846m;
        } else if (!C69764m.m101229h(this.f64846m)) {
            charSequence = this.f64846m + " • " + this.f64847n;
        } else {
            charSequence = this.f64847n;
        }
        mo29054f().mo29003c(charSequence, true);
        C23752n nVar = ((C23674at) mo29054f()).f64756g;
        C23656ab f2 = mo29054f();
        C23646h hVar = this.f64840f;
        if (hVar == null) {
            C69664n.m101065k("rangeTemplate");
            hVar = null;
        }
        String str = hVar.f64664a;
        Drawable drawable3 = this.f64836b;
        if (drawable3 == null) {
            C69664n.m101065k("clipLayer");
        } else {
            drawable = drawable3;
        }
        nVar.mo29114e(f2, str, mo29051c(mo29052d(drawable.getLevel())));
        ((C23674at) mo29054f()).f64737A = false;
    }

    /* renamed from: h */
    public final void mo29056h(int i, boolean z, boolean z2) {
        int i2 = 10000;
        int e = C69699g.m101123e(i, 10000);
        ValueAnimator valueAnimator = this.f64835a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z3 = true;
        C23646h hVar = null;
        if (z2) {
            if (e == 0 || e != 10000) {
                i2 = e;
            }
            Drawable drawable = this.f64836b;
            if (drawable == null) {
                C69664n.m101065k("clipLayer");
                drawable = null;
            }
            if (drawable.getLevel() != i2) {
                if (Build.VERSION.SDK_INT >= 30) {
                    C23752n nVar = ((C23674at) mo29054f()).f64756g;
                }
                Drawable drawable2 = this.f64836b;
                if (drawable2 == null) {
                    C69664n.m101065k("clipLayer");
                    drawable2 = null;
                }
                drawable2.setLevel(i2);
            }
            e = i2;
        } else {
            Drawable drawable3 = this.f64836b;
            if (drawable3 == null) {
                C69664n.m101065k("clipLayer");
                drawable3 = null;
            }
            if (e != drawable3.getLevel()) {
                if (((C23674at) mo29054f()).f64738B) {
                    int[] iArr = new int[2];
                    Drawable drawable4 = this.f64836b;
                    if (drawable4 == null) {
                        C69664n.m101065k("clipLayer");
                        drawable4 = null;
                    }
                    iArr[0] = drawable4.getLevel();
                    iArr[1] = e;
                    ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                    ofInt.addUpdateListener(new C23705bx(this));
                    ofInt.addListener(new C23706by(this));
                    ofInt.setDuration(700);
                    Interpolator interpolator = C23679ay.f64783a;
                    ofInt.setInterpolator(C23679ay.f64783a);
                    ofInt.start();
                    this.f64835a = ofInt;
                } else {
                    Drawable drawable5 = this.f64836b;
                    if (drawable5 == null) {
                        C69664n.m101065k("clipLayer");
                        drawable5 = null;
                    }
                    drawable5.setLevel(e);
                }
            }
        }
        if (z) {
            float d = mo29052d(e);
            C23646h hVar2 = this.f64840f;
            if (hVar2 == null) {
                C69664n.m101065k("rangeTemplate");
            } else {
                hVar = hVar2;
            }
            this.f64847n = m44192j(hVar.f64666c.toString(), "%.1f", d);
            if (z2) {
                mo29054f().mo29003c(this.f64847n, true);
            } else if (!C69764m.m101229h(this.f64846m)) {
                C23656ab f = mo29054f();
                String str = this.f64846m + " • " + this.f64847n;
                Set set = C23656ab.f64704a;
                f.mo29003c(str, false);
            } else {
                C23656ab f2 = mo29054f();
                String str2 = this.f64847n;
                Set set2 = C23656ab.f64704a;
                f2.mo29003c(str2, false);
            }
        } else {
            C23656ab f3 = mo29054f();
            CharSequence charSequence = this.f64846m;
            Set set3 = C23656ab.f64704a;
            f3.mo29003c(charSequence, false);
        }
        C23656ab f4 = mo29054f();
        if (!this.f64843i && (!z2 || e <= 0)) {
            z3 = false;
        }
        f4.mo29006f(z3, this.f64848o);
    }

    /* renamed from: i */
    public final void mo29057i(int i) {
        float d = mo29052d(0);
        float d2 = mo29052d(10000);
        Drawable drawable = this.f64836b;
        if (drawable == null) {
            C69664n.m101065k("clipLayer");
            drawable = null;
        }
        mo29056h(mo29053e(mo29051c(mo29052d(drawable.getLevel()) + ((d2 - d) * 0.05f * ((float) (i == 2 ? -1 : 1))))), this.f64843i, true);
        mo29055g();
    }
}
