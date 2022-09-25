package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0167am;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.core.content.p091b.C1874w;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.material.featurehighlight.C28509a;
import com.google.android.libraries.material.featurehighlight.C28518ai;
import com.google.android.libraries.material.featurehighlight.C28520b;
import com.google.android.libraries.material.featurehighlight.C28521c;
import com.google.android.libraries.material.featurehighlight.C28531m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.p3512i.C44693c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.chromium.net.PrivateKeyType;
import p3186j$.time.Duration;

/* compiled from: PG */
public class OobeView extends LinearLayout implements C113681bf {

    /* renamed from: p */
    private static final C59071e f314800p = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.OobeView");

    /* renamed from: a */
    public final C28521c f314801a = new C113684bi(this);

    /* renamed from: b */
    public final GestureDetector f314802b = new GestureDetector(new C113682bg(this), new Handler(Looper.getMainLooper()));

    /* renamed from: c */
    public Runnable f314803c;

    /* renamed from: d */
    public String f314804d;

    /* renamed from: e */
    public C0167am f314805e;

    /* renamed from: f */
    public SharedPreferences f314806f;

    /* renamed from: g */
    public C21370a f314807g;

    /* renamed from: h */
    public Long f314808h;

    /* renamed from: i */
    public C113680be f314809i = C113680be.UNKNOWN;

    /* renamed from: j */
    public long f314810j = 500;

    /* renamed from: k */
    public long f314811k = Long.MAX_VALUE;

    /* renamed from: l */
    public boolean f314812l = false;

    /* renamed from: m */
    public boolean f314813m;

    /* renamed from: n */
    public boolean f314814n;

    /* renamed from: o */
    public boolean f314815o;

    /* renamed from: q */
    private C113683bh f314816q = new C113683bh(this);

    public OobeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g */
    private final C28520b m188237g(int i, int i2, int i3) {
        C28509a a = C28509a.m53319a(R.id.action_buttons_and_toggle_plate);
        a.f77363a = C113672ax.m188247b(getContext(), i, this.f314804d);
        a.f77367e = C113672ax.m188247b(getContext(), i2, this.f314804d);
        a.f77384v = C113672ax.m188247b(getContext(), i2, this.f314804d);
        a.f77371i = C113672ax.m188247b(getContext(), i3, this.f314804d);
        int a2 = C19391a.m36980a(getContext(), R.attr.colorPrimary);
        Context context = getContext();
        a.f77386x = C28531m.GoogleMaterial;
        TypedValue b = C44693c.m79226b(context, R.attr.colorSurface);
        TypedValue b2 = C44693c.m79226b(context, R.attr.colorOnSurfaceVariant);
        if (b2 == null || b == null) {
            a.f77369g = C1874w.m5105b(context.getResources(), R.color.google_grey700, (Resources.Theme) null);
            a.f77376n = C1924a.m5189h(-1, context.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_outer_color_default_alpha));
            a.f77377o = C1924a.m5189h(C1874w.m5111h(context.getResources(), R.color.google_grey900), context.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_outer_color_default_alpha));
        } else {
            int i4 = b.data;
            a.f77369g = ColorStateList.valueOf(b2.data);
            a.f77376n = i4;
            a.f77377o = C1924a.m5189h(-16777216, context.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_scrim_default_alpha));
        }
        int h = C1924a.m5189h(a2, PrivateKeyType.INVALID);
        a.f77365c = ColorStateList.valueOf(h);
        a.f77373k = ColorStateList.valueOf(h);
        a.f77374l = ColorStateList.valueOf(h);
        a.f77378p = 1.0f;
        a.f77385w = C28518ai.PULSE;
        C1924a.m5189h(a2, context.getResources().getInteger(R.integer.libraries_material_featurehighlight_gm_no_element_color_override_pulse_default_alpha));
        a.f77386x = C28531m.Legacy;
        a.f77379q = "interpreter_oobe_callback_id";
        a.f77366d = 1;
        a.f77370h = 1;
        a.f77375m = 1;
        a.f77364b = R.style.onboarding_header;
        a.f77368f = R.style.onboarding_body;
        a.f77369g = ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant));
        a.f77373k = ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorPrimary));
        a.f77372j = R.style.onboarding_dismiss;
        a.f77380r = R.dimen.onboarding_vertical_offset;
        a.f77381s = R.dimen.onboarding_horizontal_offset;
        a.f77383u = false;
        return a.mo33993b();
    }

    /* renamed from: a */
    public final void mo100459a(C113680be beVar) {
        String str;
        C28520b bVar;
        if (this.f314805e != null) {
            C113680be beVar2 = C113680be.AUTO;
            if (beVar != beVar2 || !this.f314812l) {
                SharedPreferences sharedPreferences = this.f314806f;
                if (sharedPreferences == null || this.f314807g == null) {
                    ((C59052c) ((C59052c) f314800p.mo56225c()).mo56372aa(28347)).mo56386p("No shared prefs or clock");
                } else {
                    if (beVar == beVar2) {
                        str = "interpreter_auto_oobe_ms";
                    } else if (beVar == C113680be.MANUAL) {
                        str = "interpreter_manual_oobe_ms";
                    } else if (beVar == C113680be.KEYBOARD) {
                        str = "interpreter_keyboard_oobe_ms";
                    }
                    long j = sharedPreferences.getLong(str, 0);
                    if (j <= 0 || (this.f314807g.mo26870b() - j) / Duration.ofHours(1).toMillis() > this.f314811k) {
                        if (this.f314809i != beVar) {
                            this.f314809i = beVar;
                            this.f314815o = false;
                            C113683bh bhVar = this.f314816q;
                            if (beVar == C113680be.AUTO) {
                                bVar = m188237g(R.string.auto_onboarding_header, R.string.auto_onboarding_body, R.string.auto_onboarding_dismiss);
                            } else if (beVar == C113680be.MANUAL) {
                                bVar = m188237g(R.string.manual_onboarding_header, R.string.manual_onboarding_body, R.string.manual_onboarding_dismiss);
                            } else {
                                bVar = m188237g(R.string.keyboard_onboarding_header, R.string.keyboard_onboarding_body, R.string.keyboard_onboarding_dismiss);
                            }
                            C0167am amVar = bhVar.f314878a.f314805e;
                            if (amVar != null) {
                                bVar.mo34065a(amVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                mo100462d(beVar);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f314800p.mo56225c()).mo56372aa(28343)).mo56386p("no activity");
    }

    /* renamed from: b */
    public final InterpreterInputButtonPlateView mo100460b() {
        return (InterpreterInputButtonPlateView) findViewById(R.id.input_button_plate);
    }

    /* renamed from: c */
    public final ModeTogglePlateView mo100461c() {
        return (ModeTogglePlateView) findViewById(R.id.mode_toggle_plate);
    }

    /* renamed from: d */
    public final void mo100462d(C113680be beVar) {
        String str;
        if (this.f314806f == null || this.f314807g == null) {
            ((C59052c) ((C59052c) f314800p.mo56225c()).mo56372aa(28345)).mo56386p("No shared prefs or clock");
            return;
        }
        if (beVar == C113680be.AUTO) {
            str = "interpreter_auto_oobe_ms";
        } else if (beVar == C113680be.MANUAL) {
            str = "interpreter_manual_oobe_ms";
        } else if (beVar == C113680be.KEYBOARD) {
            str = "interpreter_keyboard_oobe_ms";
        } else {
            return;
        }
        this.f314806f.edit().putLong(str, this.f314807g.mo26870b()).apply();
    }

    /* renamed from: e */
    public final boolean mo100463e() {
        return this.f314809i != C113680be.UNKNOWN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r7.f314807g;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo100464f() {
        /*
            r7 = this;
            boolean r0 = r7.mo100463e()
            r1 = 1
            if (r0 != 0) goto L_0x0024
            java.lang.Long r0 = r7.f314808h
            r2 = 0
            if (r0 == 0) goto L_0x0023
            com.google.android.libraries.f.a r0 = r7.f314807g
            if (r0 == 0) goto L_0x0023
            long r3 = r0.mo26871c()
            java.lang.Long r0 = r7.f314808h
            long r5 = r0.longValue()
            long r3 = r3 - r5
            long r5 = r7.f314810j
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            return r2
        L_0x0023:
            r1 = 0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.translator.util.OobeView.mo100464f():boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent.actionToString(motionEvent.getAction());
        if (!mo100463e() && !mo100464f()) {
            return false;
        }
        if (motionEvent.getAction() == 3) {
            motionEvent.setAction(1);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (!mo100463e()) {
                return false;
            }
            this.f314815o = false;
            this.f314813m = mo100461c().mo100458m(x, y);
            this.f314814n = mo100460b().mo100387p(x, y, false);
        } else if (motionEvent.getAction() == 1) {
            this.f314813m &= mo100461c().mo100458m(x, y);
            this.f314814n = mo100460b().mo100387p(x, y, false) & this.f314814n;
        }
        return this.f314802b.onTouchEvent(motionEvent);
    }
}
