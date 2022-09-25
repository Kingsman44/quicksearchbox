package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60745b;

/* compiled from: PG */
public class InterpreterInputButtonPlateView extends RelativeLayout {

    /* renamed from: a */
    public static final C59071e f314711a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView");

    /* renamed from: b */
    public final C113693j f314712b;

    /* renamed from: c */
    public final C113693j f314713c;

    /* renamed from: d */
    public final C113693j f314714d;

    /* renamed from: e */
    public final C113693j f314715e;

    /* renamed from: f */
    public final C113693j f314716f;

    /* renamed from: g */
    public final C113693j f314717g;

    /* renamed from: h */
    public C113680be f314718h = C113680be.UNKNOWN;

    /* renamed from: i */
    public boolean f314719i;

    /* renamed from: j */
    public boolean f314720j;

    /* renamed from: k */
    public boolean f314721k;

    /* renamed from: l */
    public ViewTreeObserver.OnGlobalLayoutListener f314722l;

    /* renamed from: m */
    public C113695l f314723m = new C113695l(this);

    /* renamed from: n */
    public int f314724n = 1;

    public InterpreterInputButtonPlateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_input_button_plate, this, true);
        this.f314712b = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_in));
        this.f314713c = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_out));
        this.f314714d = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_in));
        this.f314715e = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_out));
        this.f314716f = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_in));
        this.f314717g = new C113693j(AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_out));
    }

    /* renamed from: t */
    private final void m188137t(C113693j jVar) {
        if (jVar.mo100526d()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        jVar.mo100523a();
        if (this.f314718h == C113680be.AUTO) {
            jVar.mo100524b(findViewById(R.id.auto_mic_plate));
            return;
        }
        C113680be beVar = this.f314718h;
        if (beVar == C113680be.MANUAL) {
            jVar.mo100524b(findViewById(R.id.manual_mic_plate));
        } else if (beVar == C113680be.KEYBOARD) {
            jVar.mo100524b(findViewById(R.id.keyboard_plate));
        }
    }

    /* renamed from: u */
    private final void m188138u() {
        mo100380i();
        if (this.f314724n != 1) {
            mo100378g().setVisibility(0);
            findViewById(R.id.auto_mic_plate).setVisibility(8);
            findViewById(R.id.manual_mic_plate).setVisibility(8);
            findViewById(R.id.keyboard_plate).setVisibility(8);
        }
    }

    /* renamed from: v */
    private final void m188139v() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f314722l;
        if (onGlobalLayoutListener == null) {
            return;
        }
        if ((this.f314718h == C113680be.MANUAL && this.f314720j) || (this.f314718h == C113680be.KEYBOARD && this.f314721k)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f314722l = null;
            this.f314723m.mo100530c(onGlobalLayoutListener);
        }
    }

    /* renamed from: w */
    private static boolean m188140w(View view, int i, int i2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains(i, i2);
    }

    /* renamed from: x */
    private static boolean m188141x(View view) {
        return view.getVisibility() == 0 && view.getAlpha() == 1.0f;
    }

    /* renamed from: y */
    private static boolean m188142y(View view) {
        return view.getVisibility() == 0 && view.getAlpha() > 0.0f;
    }

    /* renamed from: a */
    public final int mo100372a(View view) {
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            f += view.getX();
            ViewParent viewParent = view.getParent();
            while (!(viewParent instanceof View) && viewParent != this) {
                viewParent = view.getParent();
            }
            if (viewParent == this) {
                break;
            }
            view = (View) viewParent;
        }
        return (int) f;
    }

    /* renamed from: b */
    public final InterpreterKeyboardButtonView mo100373b() {
        return (InterpreterKeyboardButtonView) findViewById(R.id.source_keyboard_button);
    }

    /* renamed from: c */
    public final InterpreterKeyboardButtonView mo100374c() {
        return (InterpreterKeyboardButtonView) findViewById(R.id.target_keyboard_button);
    }

    /* renamed from: d */
    public final InterpreterMicButtonView mo100375d() {
        return (InterpreterMicButtonView) findViewById(R.id.auto_mic_button);
    }

    /* renamed from: e */
    public final InterpreterMicButtonView mo100376e() {
        return (InterpreterMicButtonView) findViewById(R.id.source_mic_button);
    }

    /* renamed from: f */
    public final InterpreterMicButtonView mo100377f() {
        return (InterpreterMicButtonView) findViewById(R.id.target_mic_button);
    }

    /* renamed from: g */
    public final LogoView mo100378g() {
        return (LogoView) findViewById(R.id.shared_logo_view);
    }

    /* renamed from: h */
    public final void mo100379h() {
        View view;
        if (this.f314718h != C113680be.MANUAL && this.f314718h != C113680be.KEYBOARD) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.f314723m.f314895a.getWidth() == 0) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C113680be beVar = this.f314718h;
            C113680be beVar2 = C113680be.MANUAL;
            int i = 0;
            boolean z = beVar != beVar2;
            if ((beVar != beVar2 || !this.f314720j) && (beVar != C113680be.KEYBOARD || !this.f314721k)) {
                boolean z2 = !z;
                InterpreterInputButtonPlateView interpreterInputButtonPlateView = this.f314723m.f314895a;
                if (z2) {
                    view = interpreterInputButtonPlateView.mo100376e().mo100438a();
                } else {
                    view = interpreterInputButtonPlateView.mo100373b().mo100393a();
                }
                int a = interpreterInputButtonPlateView.mo100372a(view);
                C113695l lVar = this.f314723m;
                int a2 = lVar.f314895a.mo100372a(lVar.mo100528a(z2));
                if (a == a2 || a2 == 0) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    return;
                }
                int width = this.f314723m.f314895a.getWidth() - (a2 + this.f314723m.mo100528a(z2).getWidth());
                C58976aa aaVar4 = C58975e.f156826a;
                this.f314723m.f314895a.getWidth();
                Integer valueOf = Integer.valueOf(a);
                Integer valueOf2 = Integer.valueOf(width);
                if (a == width) {
                    if (z2) {
                        this.f314720j = true;
                    } else {
                        this.f314721k = true;
                    }
                    m188139v();
                    return;
                }
                int abs = Math.abs(a - width);
                C59104x b = f314711a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
                ((C59052c) ((C59052c) b).mo56372aa(28146)).mo56359L("Margin mismatch: %d vs %d, adding %d margin", valueOf, valueOf2, Integer.valueOf(abs));
                View e = z2 ? mo100376e() : mo100373b();
                View f = z2 ? mo100377f() : mo100374c();
                if (a >= width) {
                    e = f;
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) e.getLayoutParams();
                int i2 = layoutParams.leftMargin + (a < width ? abs : 0);
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.rightMargin;
                if (a >= width) {
                    i = abs;
                }
                layoutParams.setMargins(i2, i3, i4 + i, layoutParams.bottomMargin);
                e.setLayoutParams(layoutParams);
                requestLayout();
                if (z2) {
                    this.f314720j = true;
                } else {
                    this.f314721k = true;
                }
                m188139v();
                return;
            }
            C58976aa aaVar5 = C58975e.f156826a;
        }
    }

    /* renamed from: i */
    public final void mo100380i() {
        this.f314714d.mo100523a();
        this.f314715e.mo100523a();
        this.f314712b.mo100523a();
        this.f314713c.mo100523a();
        this.f314716f.mo100523a();
        this.f314717g.mo100523a();
        mo100382k();
        mo100378g().setVisibility(8);
    }

    /* renamed from: j */
    public final void mo100381j() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f314719i) {
            if (this.f314718h == C113680be.UNKNOWN) {
                C59104x c = f314711a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
                ((C59052c) ((C59052c) c).mo56372aa(28162)).mo56386p("Unknown mode type");
                return;
            }
            this.f314724n = 1;
            this.f314713c.mo100523a();
            if (!this.f314712b.mo100526d()) {
                if (m188141x(findViewById(R.id.auto_mic_plate)) || m188141x(findViewById(R.id.manual_mic_plate)) || m188141x(findViewById(R.id.keyboard_plate))) {
                    mo100379h();
                } else {
                    m188137t(this.f314712b);
                }
            }
            this.f314714d.mo100523a();
            if (m188142y(mo100378g())) {
                this.f314715e.mo100524b(mo100378g());
            }
            mo100386o();
        }
    }

    /* renamed from: k */
    public final void mo100382k() {
        C58976aa aaVar = C58975e.f156826a;
        C113680be beVar = C113680be.UNKNOWN;
        int ordinal = this.f314718h.ordinal();
        if (ordinal == 1) {
            findViewById(R.id.auto_mic_plate).setVisibility(0);
            findViewById(R.id.auto_mic_plate).setAlpha(1.0f);
            findViewById(R.id.manual_mic_plate).setVisibility(8);
            findViewById(R.id.keyboard_plate).setVisibility(8);
        } else if (ordinal == 2) {
            findViewById(R.id.auto_mic_plate).setVisibility(8);
            findViewById(R.id.manual_mic_plate).setVisibility(0);
            findViewById(R.id.manual_mic_plate).setAlpha(1.0f);
            findViewById(R.id.keyboard_plate).setVisibility(8);
        } else if (ordinal != 3) {
            C59104x c = f314711a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c).mo56372aa(28164)).mo56389s("Unknown Mode Type: %s", this.f314718h);
        } else {
            findViewById(R.id.auto_mic_plate).setVisibility(8);
            findViewById(R.id.manual_mic_plate).setVisibility(8);
            findViewById(R.id.keyboard_plate).setVisibility(0);
            findViewById(R.id.keyboard_plate).setAlpha(1.0f);
        }
    }

    /* renamed from: l */
    public final void mo100383l() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314718h == C113680be.UNKNOWN) {
            C59104x c = f314711a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c).mo56372aa(28168)).mo56386p("Unknown mode type");
            return;
        }
        this.f314724n = 2;
        mo100385n(1);
        mo100386o();
    }

    /* renamed from: m */
    public final void mo100384m(int i) {
        if (i <= 0) {
            C58976aa aaVar = C58975e.f156826a;
            setVisibility(0);
        } else if (!postDelayed(new C113686c(this), (long) i)) {
            C59104x c = f314711a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c).mo56372aa(28171)).mo56386p("Failed to post show, running immediately");
            setVisibility(0);
        }
    }

    /* renamed from: n */
    public final void mo100385n(int i) {
        this.f314715e.mo100523a();
        if (!this.f314714d.mo100526d()) {
            if (!m188141x(mo100378g())) {
                C58976aa aaVar = C58975e.f156826a;
                this.f314714d.mo100524b(mo100378g());
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        mo100378g().mo28225e(i, false);
        this.f314712b.mo100523a();
        if (m188142y(findViewById(R.id.auto_mic_plate)) || m188142y(findViewById(R.id.manual_mic_plate)) || m188142y(findViewById(R.id.keyboard_plate))) {
            C58976aa aaVar3 = C58975e.f156826a;
            m188137t(this.f314713c);
            return;
        }
        C58976aa aaVar4 = C58975e.f156826a;
    }

    /* renamed from: o */
    public final void mo100386o() {
        boolean z = false;
        boolean z2 = findViewById(R.id.auto_mic_plate).getVisibility() == 0;
        boolean z3 = findViewById(R.id.manual_mic_plate).getVisibility() == 0;
        boolean z4 = findViewById(R.id.keyboard_plate).getVisibility() == 0;
        if (C60745b.m92717b(z2, z3, z4) > 1) {
            C59104x c = f314711a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c).mo56372aa(28185)).mo56359L("VERIFY: Too many plates: %b %b %b", Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
            return;
        }
        boolean z5 = z2 || z3 || z4;
        if (mo100378g().getVisibility() == 0) {
            z = true;
        }
        boolean d = this.f314714d.mo100526d();
        boolean d2 = this.f314715e.mo100526d();
        boolean d3 = this.f314712b.mo100526d();
        boolean d4 = this.f314713c.mo100526d();
        if (d && d2) {
            C59104x c2 = f314711a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c2).mo56372aa(28184)).mo56386p("VERIFY: Logo fading both in and out");
            m188138u();
        } else if (d3 && d4) {
            C59104x c3 = f314711a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c3).mo56372aa(28183)).mo56386p("VERIFY: Buttons fading in and out");
            m188138u();
        } else if (z && !d && !d2 && !z5 && !d3 && !d4) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!z && !d && !d2 && z5 && !d3 && !d4) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (!d2 && ((z || d) && !d3 && (!z5 || d4))) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (d || ((z && !d2) || d4 || (!z5 && !d3))) {
            C59104x c4 = f314711a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c4).mo56372aa(28178)).mo56362O("VERIFY: Unexpected state: %b %b %b - %b %b %b", Boolean.valueOf(z), Boolean.valueOf(d), Boolean.valueOf(d2), Boolean.valueOf(z5), Boolean.valueOf(d3), Boolean.valueOf(d4));
            m188138u();
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
        }
    }

    /* renamed from: p */
    public final boolean mo100387p(int i, int i2, boolean z) {
        if (this.f314718h != C113680be.AUTO) {
            C113680be beVar = this.f314718h;
            if (beVar == C113680be.MANUAL) {
                if (m188140w(mo100376e(), i, i2)) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (z) {
                        mo100376e().performClick();
                    }
                    return true;
                } else if (m188140w(mo100377f(), i, i2)) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (z) {
                        mo100377f().performClick();
                    }
                    return true;
                }
            } else if (beVar == C113680be.KEYBOARD) {
                if (m188140w(mo100373b(), i, i2)) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    if (z) {
                        mo100373b().performClick();
                    }
                    return true;
                } else if (m188140w(mo100374c(), i, i2)) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    if (z) {
                        mo100374c().performClick();
                    }
                    return true;
                }
            }
        } else if (m188140w(mo100375d(), i, i2)) {
            C58976aa aaVar5 = C58975e.f156826a;
            if (z) {
                mo100375d().performClick();
            }
            return true;
        }
        C58976aa aaVar6 = C58975e.f156826a;
        return false;
    }

    /* renamed from: q */
    public final boolean mo100388q() {
        return this.f314718h == C113680be.AUTO && this.f314724n != 1;
    }

    /* renamed from: r */
    public final boolean mo100389r() {
        int i = this.f314724n;
        return i == 2 || i == 3;
    }

    /* renamed from: s */
    public final boolean mo100390s() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314718h == C113680be.UNKNOWN) {
            C59104x c = f314711a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterInputPlate");
            ((C59052c) ((C59052c) c).mo56372aa(28193)).mo56386p("Unknown mode type");
            return false;
        }
        this.f314724n = 4;
        mo100385n(4);
        mo100386o();
        return true;
    }
}
