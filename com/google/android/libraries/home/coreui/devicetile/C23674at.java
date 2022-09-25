package com.google.android.libraries.home.coreui.devicetile;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1882h;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23736k;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.model.C23741p;
import com.google.android.libraries.home.coreui.devicetile.model.C23746u;
import com.google.android.libraries.home.coreui.devicetile.model.C23747v;
import com.google.android.libraries.home.coreui.devicetile.model.C23749x;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23646h;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23654p;
import com.google.android.libraries.home.coreui.p1953c.C23636a;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C71414ao;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Optional;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.at */
/* compiled from: PG */
public final class C23674at extends C23656ab {

    /* renamed from: A */
    public boolean f64737A;

    /* renamed from: B */
    public boolean f64738B;

    /* renamed from: C */
    public boolean f64739C;

    /* renamed from: D */
    public final GradientDrawable f64740D;

    /* renamed from: E */
    public final C69615a f64741E;

    /* renamed from: F */
    public C23638a f64742F;

    /* renamed from: G */
    public ValueAnimator f64743G;

    /* renamed from: H */
    public Animator f64744H;

    /* renamed from: I */
    public Dialog f64745I;

    /* renamed from: J */
    public final C23764z f64746J;

    /* renamed from: K */
    public final int f64747K;

    /* renamed from: L */
    private final C23655aa f64748L;

    /* renamed from: M */
    private final TextView f64749M;

    /* renamed from: N */
    private final ClipDrawable f64750N;

    /* renamed from: O */
    private CharSequence f64751O;

    /* renamed from: P */
    private C23658ad f64752P;

    /* renamed from: Q */
    private final C23667am f64753Q;

    /* renamed from: e */
    public final ViewGroup f64754e;

    /* renamed from: f */
    public final C71414ao f64755f;

    /* renamed from: g */
    public final C23752n f64756g;

    /* renamed from: h */
    public final C23681b f64757h;

    /* renamed from: i */
    public final Optional f64758i;

    /* renamed from: j */
    public final C69615a f64759j;

    /* renamed from: k */
    public Control f64760k;

    /* renamed from: l */
    public final ConstraintLayout f64761l;

    /* renamed from: m */
    public final C69613f f64762m = new C69747m(new C23672ar(this));

    /* renamed from: n */
    public C23739n f64763n;

    /* renamed from: o */
    public final Context f64764o;

    /* renamed from: p */
    public final ImageView f64765p;

    /* renamed from: q */
    public final TextView f64766q;

    /* renamed from: r */
    public final TextView f64767r;

    /* renamed from: s */
    public final ImageView f64768s;

    /* renamed from: t */
    public final TextView f64769t;

    /* renamed from: u */
    public final ImageButton f64770u;

    /* renamed from: v */
    public final ImageButton f64771v;

    /* renamed from: w */
    public final ImageView f64772w;

    /* renamed from: x */
    public final View f64773x;

    /* renamed from: y */
    public int f64774y;

    /* renamed from: z */
    public boolean f64775z;

    public C23674at(ViewGroup viewGroup, C23655aa aaVar, C71414ao aoVar, C23752n nVar, C23681b bVar, Optional optional, C69615a aVar) {
        this.f64754e = viewGroup;
        this.f64748L = aaVar;
        this.f64755f = aoVar;
        this.f64756g = nVar;
        this.f64757h = bVar;
        this.f64758i = optional;
        this.f64759j = aVar;
        View r = C2043bi.m5589r(viewGroup, R.id.control);
        C69664n.m101060f(r, "requireViewById(container, R.id.control)");
        ConstraintLayout constraintLayout = (ConstraintLayout) r;
        this.f64761l = constraintLayout;
        Context context = constraintLayout.getContext();
        C69664n.m101060f(context, "layout.context");
        this.f64764o = context;
        View r2 = C2043bi.m5589r(constraintLayout, R.id.icon);
        C69664n.m101060f(r2, "requireViewById(layout, R.id.icon)");
        this.f64765p = (ImageView) r2;
        View r3 = C2043bi.m5589r(constraintLayout, R.id.title);
        C69664n.m101060f(r3, "requireViewById(layout, R.id.title)");
        this.f64766q = (TextView) r3;
        View r4 = C2043bi.m5589r(constraintLayout, R.id.subtitle);
        C69664n.m101060f(r4, "requireViewById(layout, R.id.subtitle)");
        this.f64767r = (TextView) r4;
        View r5 = C2043bi.m5589r(constraintLayout, R.id.badge);
        C69664n.m101060f(r5, "requireViewById(layout, R.id.badge)");
        this.f64768s = (ImageView) r5;
        TextView textView = (TextView) constraintLayout.findViewById(R.id.status);
        this.f64769t = textView;
        this.f64770u = (ImageButton) constraintLayout.findViewById(R.id.decrement_button);
        this.f64771v = (ImageButton) constraintLayout.findViewById(R.id.increment_button);
        Barrier barrier = (Barrier) constraintLayout.findViewById(R.id.endBarrier);
        this.f64772w = (ImageView) constraintLayout.findViewById(R.id.expandable);
        this.f64773x = constraintLayout.findViewById(R.id.action_button);
        this.f64749M = (TextView) constraintLayout.findViewById(R.id.status_detail);
        this.f64774y = -1;
        this.f64738B = true;
        this.f64741E = new C23671aq(this);
        this.f64751O = BuildConfig.FLAVOR;
        C69664n.m101061g(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        C69664n.m101060f(displayMetrics, "this.resources.displayMetrics");
        this.f64747K = (int) TypedValue.applyDimension(1, 32.0f, displayMetrics);
        this.f64753Q = new C23667am(this);
        Drawable background = constraintLayout.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) background;
        layerDrawable.mutate();
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.clip_layer);
        C69664n.m101059e(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
        ClipDrawable clipDrawable = (ClipDrawable) findDrawableByLayerId;
        this.f64750N = clipDrawable;
        clipDrawable.setAlpha(0);
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
        C69664n.m101059e(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.f64740D = (GradientDrawable) findDrawableByLayerId2;
        this.f64746J = new C23764z(viewGroup);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    /* renamed from: l */
    public static final int m44153l(View view, ViewGroup viewGroup) {
        return (viewGroup.getHeight() - view.getHeight()) / 2;
    }

    /* renamed from: m */
    public static final TouchDelegate m44154m(View view, int i, int i2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left -= i2;
        rect.top -= i;
        rect.right += i2;
        rect.bottom += i;
        return new TouchDelegate(rect, view);
    }

    /* renamed from: n */
    private final int m44155n(int i) {
        return i == 0 ? C23636a.m44118a(this.f64764o, R.attr.control_default_background) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (r0 = r5.f64769t).getText();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m44156o(boolean r6, java.lang.CharSequence r7) {
        /*
            r5 = this;
            boolean r0 = p5462h.p5483m.C69764m.m101229h(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            android.widget.TextView r0 = r5.f64769t
            if (r0 == 0) goto L_0x001a
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p5462h.p5483m.C69764m.m101229h(r0)
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.libraries.home.coreui.devicetile.model.Control r3 = r5.mo29001a()
            com.google.android.libraries.home.coreui.devicetile.ad r3 = m44157p(r3)
            com.google.android.libraries.home.coreui.devicetile.ad r4 = r5.f64752P
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)
            r3 = r3 ^ r1
            android.widget.TextView r4 = r5.f64769t
            if (r4 == 0) goto L_0x0033
            java.lang.CharSequence r4 = r4.getText()
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r4)
            r7 = r7 ^ r1
            if (r6 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x003f
            if (r3 != 0) goto L_0x0044
        L_0x003f:
            if (r7 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            return r1
        L_0x0043:
            r1 = 0
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.devicetile.C23674at.m44156o(boolean, java.lang.CharSequence):boolean");
    }

    /* renamed from: p */
    private static final C23658ad m44157p(Control control) {
        return new C23658ad(control.f64888f, control.f64889g);
    }

    /* renamed from: a */
    public final Control mo29001a() {
        Control control = this.f64760k;
        if (control != null) {
            return control;
        }
        C69664n.m101065k("control");
        return null;
    }

    /* renamed from: b */
    public final void mo29002b(C23739n nVar) {
        this.f64763n = nVar;
        if ((nVar instanceof C23749x) && this.f64748L.mo28999b()) {
            mo29001a().f64884b.send();
        }
        this.f64748L.mo29000d(mo29001a(), nVar, new C23659ae(this));
    }

    /* renamed from: c */
    public final void mo29003c(CharSequence charSequence, boolean z) {
        C69664n.m101061g(charSequence, "text");
        if (z) {
            TextView textView = this.f64769t;
            if (textView != null) {
                textView.setAlpha(1.0f);
            }
            mo29025j(charSequence);
            mo29024i();
        }
        this.f64751O = charSequence;
    }

    /* renamed from: d */
    public final void mo29004d(float f) {
        TextView textView = this.f64769t;
        if (textView != null) {
            textView.setTextSize(0, f);
        }
    }

    /* renamed from: e */
    public final boolean mo29005e() {
        return C69540x.m100848ad(C23656ab.f64704a, mo29022g()) || mo29001a().f64889g.mo28976b() || (mo29001a().f64889g instanceof C23646h);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo29006f(boolean z, int i) {
        C23747v vVar;
        int i2;
        List list;
        ObjectAnimator objectAnimator;
        if (mo29001a().f64888f == C23736k.OK || mo29001a().f64888f == C23736k.UNKNOWN) {
            vVar = mo29022g();
        } else {
            vVar = C23741p.ERROR;
        }
        SparseArray sparseArray = C23685bd.f64788a;
        Context context = this.f64764o;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(vVar, "deviceType");
        if (i > 0) {
            i2 = (vVar.mo29093a() * 1000) + i;
        } else {
            i2 = vVar.mo29093a();
        }
        Map map = C23688bg.f64794a;
        Integer valueOf = Integer.valueOf(i2);
        C23763y yVar = (C23763y) C69505av.m100865g(map, valueOf);
        int intValue = ((Number) C69505av.m100865g(C23688bg.f64795b, valueOf)).intValue();
        Drawable drawable = (Drawable) C23685bd.f64788a.get(intValue);
        Integer num = null;
        if (drawable == null) {
            drawable = context.getResources().getDrawable(intValue, (Resources.Theme) null);
            C23685bd.f64788a.put(intValue, drawable);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        C69664n.m101058d(constantState);
        Drawable newDrawable = constantState.newDrawable(context.getResources());
        C69664n.m101060f(newDrawable, "icon.constantState!!.new…awable(context.resources)");
        C23685bd bdVar = new C23685bd(newDrawable, intValue, yVar);
        C23642d dVar = mo29001a().f64889g;
        boolean z2 = dVar instanceof C23651m;
        int i3 = R.attr.control_unavailable_foreground;
        if (!z2 ? !(dVar instanceof C23654p) : !C69664n.m101066l(((C23651m) dVar).f64687b, C23654p.f64703a)) {
            i3 = bdVar.f64791d.f65128a;
        }
        Context context2 = this.f64764o;
        C69664n.m101061g(context2, "<this>");
        TypedValue typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(i3, typedValue, true);
        ColorStateList d = C1882h.m5138d(context2, typedValue.resourceId);
        if (d != null) {
            CharSequence charSequence = this.f64751O;
            mo29001a();
            boolean o = m44156o(this.f64739C, charSequence);
            boolean o2 = m44156o(this.f64738B, charSequence);
            this.f64752P = m44157p(mo29001a());
            C23662ah ahVar = new C23662ah(this, z, charSequence, bdVar, d);
            Animator animator = this.f64744H;
            if (animator != null) {
                animator.cancel();
            }
            if (this.f64775z) {
                ahVar.mo5672a();
                TextView textView = this.f64769t;
                if (textView != null) {
                    objectAnimator = ObjectAnimator.ofFloat(textView, "alpha", new float[]{1.0f, 0.45f});
                    objectAnimator.setRepeatMode(2);
                    objectAnimator.setRepeatCount(-1);
                    objectAnimator.setDuration(500);
                    objectAnimator.setInterpolator(new LinearInterpolator());
                    objectAnimator.setStartDelay(900);
                    C69664n.m101060f(objectAnimator, "ofFloat(this, \"alpha\", V…Y_EXTRA_LONG_MILLIS\n    }");
                    if (objectAnimator != null) {
                        objectAnimator.start();
                        this.f64744H = objectAnimator;
                    }
                }
                objectAnimator = null;
                this.f64744H = objectAnimator;
            } else if (!o) {
                TextView textView2 = this.f64769t;
                if (textView2 != null) {
                    textView2.setAlpha(1.0f);
                }
                ahVar.mo5672a();
            } else {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f64769t, "alpha", new float[]{0.0f});
                ofFloat.setDuration(200);
                Interpolator interpolator = C23679ay.f64783a;
                ofFloat.setInterpolator(C23679ay.f64784b);
                ofFloat.addListener(new C23664aj(ahVar));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f64769t, "alpha", new float[]{1.0f});
                ofFloat2.setDuration(200);
                ofFloat2.setInterpolator(C23679ay.f64784b);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                animatorSet.addListener(new C23663ai(this));
                animatorSet.start();
                this.f64744H = animatorSet;
            }
            C23763y yVar2 = bdVar.f64791d;
            int a = C23636a.m44118a(this.f64764o, R.attr.control_default_background);
            if (z) {
                mo29001a();
                list = C69540x.m100947e(Integer.valueOf(C23636a.m44118a(this.f64764o, yVar2.f65129b)), Integer.valueOf(PrivateKeyType.INVALID));
            } else {
                list = C69540x.m100947e(Integer.valueOf(a), 0);
            }
            int intValue2 = ((Number) list.get(0)).intValue();
            int intValue3 = ((Number) list.get(1)).intValue();
            int a2 = (!z || !(this.f64742F instanceof C23707bz)) ? a : C23636a.m44118a(this.f64764o, yVar2.f65130c);
            Drawable drawable2 = this.f64750N.getDrawable();
            C69664n.m101059e(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            ValueAnimator valueAnimator = this.f64743G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (o2) {
                Drawable drawable3 = this.f64750N.getDrawable();
                C69664n.m101059e(drawable3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ColorStateList color = ((GradientDrawable) drawable3).getColor();
                Integer valueOf2 = color != null ? Integer.valueOf(m44155n(color.getDefaultColor())) : null;
                int intValue4 = valueOf2 != null ? valueOf2.intValue() : intValue2;
                ColorStateList color2 = this.f64740D.getColor();
                if (color2 != null) {
                    num = Integer.valueOf(m44155n(color2.getDefaultColor()));
                }
                int intValue5 = num != null ? num.intValue() : a2;
                float alpha = this.f64761l.getAlpha();
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f64750N.getAlpha(), intValue3});
                ofInt.addUpdateListener(new C23660af(gradientDrawable, intValue4, intValue2, this, intValue5, a2, alpha));
                ofInt.addListener(new C23661ag(this));
                ofInt.setDuration(700);
                Interpolator interpolator2 = C23679ay.f64783a;
                ofInt.setInterpolator(C23679ay.f64783a);
                ofInt.start();
                this.f64743G = ofInt;
                return;
            }
            gradientDrawable.setAlpha(intValue3);
            gradientDrawable.setColor(intValue2);
            this.f64740D.setColor(a2);
            this.f64761l.setAlpha(1.0f);
        }
    }

    /* renamed from: g */
    public final C23747v mo29022g() {
        C23747v vVar = mo29001a().f64885c;
        if ((vVar instanceof C23746u ? (C23746u) vVar : null) == null) {
            return mo29001a().f64885c;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        if (r8 < 0) goto L_0x009d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29023h() {
        /*
            r13 = this;
            android.widget.TextView r0 = r13.f64766q
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = "title.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            boolean r0 = p5462h.p5483m.C69764m.m101229h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0021
            android.widget.TextView r0 = r13.f64766q
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0021
            android.widget.TextView r0 = r13.f64766q
            java.lang.CharSequence r0 = r0.getText()
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = r13.mo29001a()
            com.google.android.libraries.home.coreui.devicetile.model.v r2 = r2.f64885c
            android.content.Context r3 = r13.f64764o
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = "context.resources"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.lang.String r2 = r2.mo29094b(r3)
            boolean r3 = p5462h.p5483m.C69764m.m101229h(r2)
            r4 = 1
            if (r4 != r3) goto L_0x003f
            r2 = r1
        L_0x003f:
            android.widget.TextView r3 = r13.f64767r
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r5 = "subtitle.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            boolean r3 = p5462h.p5483m.C69764m.m101229h(r3)
            if (r3 != 0) goto L_0x005e
            android.widget.TextView r3 = r13.f64767r
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x005e
            android.widget.TextView r1 = r13.f64767r
            java.lang.CharSequence r1 = r1.getText()
        L_0x005e:
            r3 = 3
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r3]
            r6 = 0
            r5[r6] = r0
            r5[r4] = r2
            r0 = 2
            r5[r0] = r1
            java.util.List r7 = p5462h.p5463a.C69531o.m100936m(r5)
            java.lang.String r8 = ", "
            r9 = 0
            java.lang.String r10 = "."
            r11 = 0
            r12 = 58
            java.lang.String r1 = p5462h.p5463a.C69540x.m100851ag(r7, r8, r9, r10, r11, r12)
            char[] r2 = new char[r3]
            r2 = {32, 44, 46} // fill-array
            java.lang.String r4 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            int r4 = r1.length()
            r5 = 0
        L_0x0088:
            if (r5 >= r4) goto L_0x00a6
            char r7 = r1.charAt(r5)
            r8 = 0
        L_0x008f:
            if (r8 >= r3) goto L_0x009d
            char r9 = r2[r8]
            if (r7 != r9) goto L_0x009a
            if (r8 < 0) goto L_0x009d
            int r5 = r5 + 1
            goto L_0x0088
        L_0x009a:
            int r8 = r8 + 1
            goto L_0x008f
        L_0x009d:
            int r2 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r5, r2)
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r1 = ""
        L_0x00a8:
            java.lang.String r1 = r1.toString()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r13.f64761l
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r2)
            if (r2 != 0) goto L_0x00ca
            androidx.constraintlayout.widget.ConstraintLayout r2 = r13.f64761l
            r2.setContentDescription(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r13.f64761l
            boolean r1 = r1.isAccessibilityFocused()
            if (r1 == 0) goto L_0x00ca
            androidx.constraintlayout.widget.ConstraintLayout r1 = r13.f64761l
            r1.sendAccessibilityEvent(r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.devicetile.C23674at.mo29023h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29024i() {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f64769t
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r2 = "status.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            boolean r0 = p5462h.p5483m.C69764m.m101229h(r0)
            if (r0 != 0) goto L_0x0023
            android.widget.TextView r0 = r9.f64769t
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
            android.widget.TextView r0 = r9.f64769t
            java.lang.CharSequence r0 = r0.getText()
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            android.widget.TextView r2 = r9.f64749M
            if (r2 == 0) goto L_0x0045
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r3 = "statusDetail.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            boolean r2 = p5462h.p5483m.C69764m.m101229h(r2)
            if (r2 != 0) goto L_0x0045
            android.widget.TextView r2 = r9.f64749M
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0045
            android.widget.TextView r1 = r9.f64749M
            java.lang.CharSequence r1 = r1.getText()
        L_0x0045:
            r2 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.util.List r3 = p5462h.p5463a.C69531o.m100936m(r2)
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            java.lang.String r0 = p5462h.p5463a.C69540x.m100851ag(r3, r4, r5, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.f64761l
            java.lang.CharSequence r1 = androidx.core.p098j.C2043bi.m5510D(r1)
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r1)
            if (r1 != 0) goto L_0x0081
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.f64761l
            androidx.core.j.ap r2 = androidx.core.p098j.C2043bi.m5594w()
            r2.mo5186e(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.f64761l
            boolean r0 = r0.isAccessibilityFocused()
            if (r0 == 0) goto L_0x0081
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.f64761l
            r1 = 64
            r0.sendAccessibilityEvent(r1)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.devicetile.C23674at.mo29024i():void");
    }

    /* renamed from: j */
    public final void mo29025j(CharSequence charSequence) {
        if (C69764m.m101229h(charSequence)) {
            TextView textView = this.f64769t;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TransitionManager.beginDelayedTransition(this.f64761l);
            C1756o oVar = new C1756o();
            oVar.mo4889i(this.f64761l);
            oVar.mo4891k(R.id.title, 3, 0, 3);
            oVar.mo4888h(this.f64761l);
            return;
        }
        C1756o oVar2 = new C1756o();
        oVar2.mo4889i(this.f64761l);
        oVar2.mo4891k(R.id.title, 3, R.id.status, 4);
        oVar2.mo4888h(this.f64761l);
        TextView textView2 = this.f64769t;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        TextView textView3 = this.f64769t;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final void mo29026k(C23638a aVar, C23638a aVar2, int i) {
        C69664n.m101061g(aVar2, "newBehavior");
        if (!C69664n.m101066l(aVar, aVar2)) {
            this.f64761l.setOnTouchListener((View.OnTouchListener) null);
            this.f64761l.setOnClickListener((View.OnClickListener) null);
            aVar2.mo28965b(this);
        }
        this.f64761l.setAccessibilityDelegate(this.f64753Q);
        this.f64742F = aVar2;
        aVar2.mo28964a(mo29001a(), i);
    }
}
