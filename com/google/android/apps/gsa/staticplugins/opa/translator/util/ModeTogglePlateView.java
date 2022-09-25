package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113599l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aiw;
import com.google.common.p4552o.aiy;
import com.google.common.p4552o.aiz;
import com.google.common.p4552o.ajb;
import com.google.common.p4552o.ajg;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62940bt;
import java.util.Locale;

/* compiled from: PG */
public class ModeTogglePlateView extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f314785a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.ModeTogglePlateView");

    /* renamed from: j */
    private static final C58495hd f314786j;

    /* renamed from: b */
    public C113680be f314787b = C113680be.UNKNOWN;

    /* renamed from: c */
    public C113681bf f314788c;

    /* renamed from: d */
    public boolean f314789d;

    /* renamed from: e */
    public boolean f314790e;

    /* renamed from: f */
    public boolean f314791f;

    /* renamed from: g */
    public float f314792g = 5.0f;

    /* renamed from: h */
    public C113679bd f314793h = new C113679bd(this);

    /* renamed from: i */
    public C113599l f314794i;

    /* renamed from: k */
    private final int f314795k;

    /* renamed from: l */
    private final int f314796l;

    /* renamed from: m */
    private final int f314797m;

    /* renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f314798n;

    /* renamed from: o */
    private boolean f314799o;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C113680be.UNKNOWN, aiy.UNKNOWN);
        gzVar.mo55429h(C113680be.AUTO, aiy.AUTO_MODE);
        gzVar.mo55429h(C113680be.MANUAL, aiy.MANUAL_MODE);
        gzVar.mo55429h(C113680be.KEYBOARD, aiy.KEYBOARD_MODE);
        f314786j = gzVar.mo55427f(false);
    }

    public ModeTogglePlateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f314795k = C19391a.m36980a(context, R.attr.colorPrimary);
        this.f314796l = C19391a.m36980a(context, R.attr.colorOnBackground);
        this.f314797m = C1924a.m5189h(C19391a.m36980a(context, R.attr.colorHairline), context.getResources().getInteger(R.integer.disabled_button_alpha));
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.mode_toggle_plate, this, true);
    }

    /* renamed from: n */
    private final void m188223n(C113680be beVar) {
        this.f314787b = beVar;
        mo100456k(beVar);
        mo100457l(beVar);
        mo100447b().setContentDescription(getContext().getString(R.string.auto_mode));
        mo100449d().setContentDescription(getContext().getString(R.string.manual_mode));
        mo100448c().setContentDescription(getContext().getString(R.string.keyboard_mode));
        if (beVar == C113680be.AUTO) {
            mo100447b().setContentDescription(getContext().getString(R.string.auto_mode_selected));
            mo100447b().sendAccessibilityEvent(4);
        } else if (beVar == C113680be.MANUAL) {
            mo100449d().setContentDescription(getContext().getString(R.string.manual_mode_selected));
            mo100449d().sendAccessibilityEvent(4);
        } else if (beVar == C113680be.KEYBOARD) {
            mo100448c().setContentDescription(getContext().getString(R.string.keyboard_mode_selected));
            mo100448c().sendAccessibilityEvent(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LinearLayout mo100446a() {
        return (LinearLayout) findViewById(R.id.mode_toggle_plate_layout);
    }

    /* renamed from: b */
    public final TextView mo100447b() {
        return (TextView) findViewById(R.id.auto_mode);
    }

    /* renamed from: c */
    public final TextView mo100448c() {
        return (TextView) findViewById(R.id.keyboard_mode);
    }

    /* renamed from: d */
    public final TextView mo100449d() {
        return (TextView) findViewById(R.id.manual_mode);
    }

    /* renamed from: e */
    public final C113680be mo100450e(int i, int i2) {
        Rect rect = new Rect();
        mo100447b().getGlobalVisibleRect(rect);
        if (rect.contains(i, i2)) {
            return C113680be.AUTO;
        }
        mo100449d().getGlobalVisibleRect(rect);
        if (rect.contains(i, i2)) {
            return C113680be.MANUAL;
        }
        mo100448c().getGlobalVisibleRect(rect);
        if (rect.contains(i, i2)) {
            return C113680be.KEYBOARD;
        }
        return C113680be.UNKNOWN;
    }

    /* renamed from: f */
    public final void mo100451f(boolean z) {
        if (this.f314787b != C113680be.AUTO && this.f314789d) {
            m188223n(C113680be.AUTO);
            C113681bf bfVar = this.f314788c;
            if (bfVar != null) {
                bfVar.mo100459a(C113680be.AUTO);
            }
            C113599l lVar = this.f314794i;
            if (lVar != null) {
                lVar.mo100324b(C113680be.AUTO, z);
            }
        }
    }

    /* renamed from: g */
    public final void mo100452g(boolean z) {
        if (this.f314787b != C113680be.KEYBOARD) {
            m188223n(C113680be.KEYBOARD);
            C113681bf bfVar = this.f314788c;
            if (bfVar != null) {
                bfVar.mo100459a(C113680be.KEYBOARD);
            }
            C113599l lVar = this.f314794i;
            if (lVar != null) {
                lVar.mo100324b(C113680be.KEYBOARD, z);
            }
        }
    }

    /* renamed from: h */
    public final void mo100453h(boolean z) {
        if (this.f314787b != C113680be.MANUAL && this.f314791f) {
            m188223n(C113680be.MANUAL);
            C113681bf bfVar = this.f314788c;
            if (bfVar != null) {
                bfVar.mo100459a(C113680be.MANUAL);
            }
            C113599l lVar = this.f314794i;
            if (lVar != null) {
                lVar.mo100324b(C113680be.MANUAL, z);
            }
        }
    }

    /* renamed from: i */
    public final void mo100454i() {
        int i;
        int i2;
        int c = C113679bd.m188249c();
        int b = this.f314793h.mo100501b(C113680be.AUTO);
        int b2 = this.f314793h.mo100501b(C113680be.MANUAL);
        int b3 = this.f314793h.mo100501b(C113680be.KEYBOARD);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.interpreter_mode_button_margin);
        int i3 = b2 + b + b3 + dimensionPixelSize + dimensionPixelSize;
        if (b <= b3) {
            i2 = (c - b) / 2;
            i = i3 + i2;
        } else {
            int i4 = (b3 + c) / 2;
            int i5 = i4 - i3;
            i = i4;
            i2 = i5;
        }
        getResources().getDimensionPixelSize(R.dimen.interpreter_mode_button_margin);
        if (i2 < 0 || i >= c) {
            float textSize = (mo100447b().getTextSize() / getResources().getDisplayMetrics().scaledDensity) - 4.0f;
            if (textSize < this.f314792g) {
                ((C59052c) ((C59052c) f314785a.mo56225c()).mo56372aa(28316)).mo56386p("Text already at smallest size");
                return;
            }
            mo100447b().setTextSize(textSize);
            mo100449d().setTextSize(textSize);
            mo100448c().setTextSize(textSize);
            requestLayout();
            mo100454i();
        }
    }

    /* renamed from: j */
    public final void mo100455j(View view) {
        C60321oe i = C28285c.m52882i(view, 5, (Integer) null);
        if (i != null) {
            aiw aiw = (aiw) aiz.f158857c.createBuilder();
            aiw.copyOnWrite();
            aiz aiz = (aiz) aiw.instance;
            aiz.f158860b = ((aiy) f314786j.getOrDefault(this.f314787b, aiy.UNKNOWN)).f158856e;
            aiz.f158859a |= 1;
            aiz aiz2 = (aiz) aiw.build();
            aqp aqp = (aqp) aqs.f159780k.createBuilder();
            aqm aqm = i.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            int i2 = aqm.f159765d;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs.f159782a |= 1;
            aqs.f159783b = i2;
            C62940bt btVar = ajg.f158866h;
            ajb ajb = (ajb) ajg.f158865g.createBuilder();
            ajb.copyOnWrite();
            ajg ajg = (ajg) ajb.instance;
            aiz2.getClass();
            ajg.f158873f = aiz2;
            ajg.f158868a |= 1024;
            aqp.mo58885m(btVar, (ajg) ajb.build());
            C60320od odVar = (C60320od) i.toBuilder();
            odVar.mo57083c((aqs) aqp.build());
            i = (C60321oe) odVar.build();
        }
        C89949q.m146521e(i, false);
    }

    /* renamed from: k */
    public final void mo100456k(C113680be beVar) {
        int i;
        int i2;
        TextView b = mo100447b();
        if (this.f314789d) {
            i = this.f314796l;
        } else {
            i = this.f314797m;
        }
        b.setTextColor(i);
        TextView d = mo100449d();
        if (this.f314791f) {
            i2 = this.f314796l;
        } else {
            i2 = this.f314797m;
        }
        d.setTextColor(i2);
        mo100448c().setTextColor(this.f314796l);
        if (beVar == C113680be.AUTO) {
            mo100447b().setTextColor(this.f314795k);
        } else if (beVar == C113680be.MANUAL) {
            mo100449d().setTextColor(this.f314795k);
        } else if (beVar == C113680be.KEYBOARD) {
            mo100448c().setTextColor(this.f314795k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo100457l(C113680be beVar) {
        if (beVar == C113680be.UNKNOWN) {
            ((C59052c) ((C59052c) f314785a.mo56225c()).mo56372aa(28334)).mo56386p("Early call to setPositions");
            return;
        }
        float c = (((float) (C113679bd.m188249c() - this.f314793h.mo100501b(beVar))) / 2.0f) - this.f314793h.mo100500a(beVar);
        this.f314793h.mo100500a(beVar);
        Locale.getDefault().getLanguage();
        if (this.f314799o) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f314798n;
            this.f314798n = null;
            if (onGlobalLayoutListener != null) {
                getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            float x = c - this.f314793h.f314870a.getX();
            this.f314793h.f314870a.getX();
            this.f314793h.mo100501b(beVar);
            if (Math.abs(x) >= 1.0f) {
                C113679bd bdVar = this.f314793h;
                float x2 = bdVar.f314870a.f314793h.f314870a.getX();
                TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, x, 1, 0.0f, 1, 0.0f);
                translateAnimation.setFillAfter(true);
                translateAnimation.setRepeatCount(0);
                translateAnimation.setInterpolator(AnimationUtils.loadInterpolator(bdVar.f314870a.getContext(), R.interpolator.move_mode_toggle_interpolator));
                translateAnimation.setDuration((long) bdVar.f314870a.getContext().getResources().getInteger(R.integer.mode_change_move_mode_toggle_text_duration_millis));
                translateAnimation.setAnimationListener(new C113678bc(bdVar, x2 + x, translateAnimation));
                bdVar.f314870a.startAnimation(translateAnimation);
            }
        } else if (this.f314793h.mo100500a(C113680be.MANUAL) > 0.01f) {
            this.f314799o = true;
            this.f314793h.f314870a.setX(c);
        } else if (this.f314798n == null) {
            C113673ay ayVar = new C113673ay(this);
            this.f314798n = ayVar;
            getViewTreeObserver().addOnGlobalLayoutListener(ayVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo100458m(int i, int i2) {
        return mo100450e(i, i2) != C113680be.UNKNOWN;
    }
}
