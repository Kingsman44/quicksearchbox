package com.google.android.libraries.material.featurehighlight;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.p091b.C1874w;
import androidx.core.graphics.C1924a;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.material.featurehighlight.l */
/* compiled from: PG */
public final class C28530l extends Fragment {

    /* renamed from: A */
    private ColorStateList f77508A;

    /* renamed from: B */
    private ColorStateList f77509B;

    /* renamed from: C */
    private int f77510C;

    /* renamed from: D */
    private int f77511D;

    /* renamed from: E */
    private int f77512E;

    /* renamed from: F */
    private int f77513F = 0;

    /* renamed from: G */
    private int f77514G = 0;

    /* renamed from: H */
    private int f77515H;

    /* renamed from: I */
    private int f77516I;

    /* renamed from: J */
    private int f77517J;

    /* renamed from: K */
    private int f77518K;

    /* renamed from: L */
    private float f77519L;

    /* renamed from: M */
    private String f77520M;

    /* renamed from: N */
    private int f77521N;

    /* renamed from: O */
    private int f77522O;

    /* renamed from: P */
    private int f77523P;

    /* renamed from: Q */
    private boolean f77524Q;

    /* renamed from: R */
    private boolean f77525R;

    /* renamed from: S */
    private boolean f77526S;

    /* renamed from: T */
    private int f77527T;

    /* renamed from: U */
    private C28518ai f77528U;

    /* renamed from: V */
    private C28531m f77529V;

    /* renamed from: W */
    private int f77530W;

    /* renamed from: X */
    private boolean f77531X;

    /* renamed from: a */
    public ViewFinder f77532a;

    /* renamed from: b */
    public String f77533b;

    /* renamed from: c */
    public boolean f77534c;

    /* renamed from: d */
    public long f77535d;

    /* renamed from: e */
    CharSequence f77536e;

    /* renamed from: f */
    C28522d f77537f;

    /* renamed from: g */
    public C28512ac f77538g;

    /* renamed from: h */
    public int f77539h = 0;

    /* renamed from: i */
    public final Runnable f77540i = new C28524f(this);

    /* renamed from: j */
    public boolean f77541j = false;

    /* renamed from: k */
    public boolean f77542k = false;

    /* renamed from: l */
    private int f77543l;

    /* renamed from: m */
    private int f77544m;

    /* renamed from: n */
    private CharSequence f77545n;

    /* renamed from: o */
    private int f77546o;

    /* renamed from: p */
    private int f77547p;

    /* renamed from: q */
    private ColorStateList f77548q;

    /* renamed from: r */
    private int f77549r;

    /* renamed from: s */
    private CharSequence f77550s;

    /* renamed from: t */
    private int f77551t;

    /* renamed from: u */
    private int f77552u;

    /* renamed from: v */
    private ColorStateList f77553v;

    /* renamed from: w */
    private int f77554w;

    /* renamed from: x */
    private CharSequence f77555x;

    /* renamed from: y */
    private int f77556y;

    /* renamed from: z */
    private ColorStateList f77557z;

    /* renamed from: a */
    public final View mo34074a() {
        C0167am activity;
        if (this.f77544m == -1 || (activity = getActivity()) == null) {
            return null;
        }
        return activity.findViewById(this.f77544m);
    }

    /* renamed from: b */
    public final C28521c mo34075b() {
        C28522d dVar = this.f77537f;
        if (dVar != null) {
            return dVar.mo34068a(this.f77520M);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo34076c() {
        FragmentManager fragmentManager;
        if (getActivity() != null && !getActivity().isFinishing() && isAdded() && !isRemoving() && (fragmentManager = getFragmentManager()) != null) {
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo516m(this);
            aVar.mo505b(true);
        }
    }

    /* renamed from: d */
    public final void mo34077d() {
        C28521c b = mo34075b();
        if (b != null) {
            b.mo34067b(this.f77520M);
        }
    }

    /* renamed from: e */
    public final void mo34078e() {
        this.f77539h = 0;
        C28521c b = mo34075b();
        if (b != null) {
            b.mo34066a(this.f77520M);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34079f() {
        if (this.f77539h == 1 && this.f77538g != null) {
            mo34075b();
            mo34078e();
            this.f77538g.mo34005f(new C28526h(this));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        Context context;
        Drawable f;
        super.onActivityCreated(bundle);
        boolean z = bundle != null;
        this.f77541j = z;
        if (!z || this.f77539h != 0) {
            int i = this.f77530W;
            if (i == 0) {
                context = getContext();
            } else {
                context = new ContextThemeWrapper(getContext(), i);
            }
            C28512ac acVar = new C28512ac(context, this.f77529V);
            this.f77538g = acVar;
            boolean z2 = this.f77524Q;
            acVar.f77433z = z2;
            C28516ag agVar = acVar.f77425r;
            agVar.f77453e = z2;
            acVar.f77392A = this.f77525R;
            acVar.f77393B = this.f77526S;
            agVar.f77454f = this.f77527T;
            int i2 = this.f77512E;
            if (i2 != 0) {
                acVar.f77412e.mo34050c(i2);
            }
            int i3 = this.f77513F;
            if (i3 != 0) {
                int i4 = this.f77514G;
                if (i4 != 0) {
                    this.f77538g.mo34011i(i3, i4);
                } else {
                    C28512ac acVar2 = this.f77538g;
                    acVar2.mo34011i(i3, C1924a.m5189h(i3, acVar2.getContext().getResources().getInteger(acVar2.f77399H == C28531m.Legacy ? R.integer.libraries_material_featurehighlight_pulse_base_alpha : R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha)));
                }
            }
            int i5 = this.f77515H;
            if (i5 != 0) {
                this.f77538g.f77412e.mo34051d(i5);
            }
            int i6 = this.f77516I;
            if (i6 != 0) {
                this.f77538g.f77416i = i6;
            }
            if (!(this.f77517J == 0 || (f = C1874w.m5109f(getResources(), this.f77517J, getActivity().getTheme())) == null)) {
                if (this.f77518K != 0) {
                    f.mutate();
                    C1929b.m5225f(f, this.f77518K);
                }
                C28512ac acVar3 = this.f77538g;
                acVar3.f77419l = f;
                f.setBounds(0, 0, f.getIntrinsicWidth(), f.getIntrinsicHeight());
                f.setCallback(acVar3);
            }
            C28512ac acVar4 = this.f77538g;
            float f2 = this.f77519L;
            float f3 = acVar4.f77420m;
            acVar4.f77420m = f2;
            if (acVar4.f77394C && f3 != f2) {
                acVar4.requestLayout();
            }
            C28512ac acVar5 = this.f77538g;
            boolean z3 = this.f77531X;
            acVar5.f77421n = z3;
            if (acVar5.f77415h != null) {
                if (z3) {
                    acVar5.mo34013k();
                } else {
                    ImageView imageView = acVar5.f77423p;
                    if (imageView != null) {
                        acVar5.removeView(imageView);
                        acVar5.f77423p = null;
                    }
                }
            }
            if (this.f77546o != 0) {
                this.f77538g.f77414g.mo33988v(getResources().getDimension(this.f77546o) / getResources().getDisplayMetrics().density);
            }
            int i7 = this.f77547p;
            if (i7 != 0) {
                this.f77538g.f77414g.mo33986t(i7);
            }
            ColorStateList colorStateList = this.f77548q;
            if (colorStateList != null) {
                this.f77538g.f77414g.mo33987u(colorStateList);
            }
            this.f77538g.f77414g.mo33985s(this.f77549r);
            if (this.f77551t != 0) {
                this.f77538g.f77414g.mo33976k(getResources().getDimension(this.f77551t) / getResources().getDisplayMetrics().density);
            }
            int i8 = this.f77552u;
            if (i8 != 0) {
                this.f77538g.f77414g.mo33974i(i8);
            }
            ColorStateList colorStateList2 = this.f77553v;
            if (colorStateList2 != null) {
                this.f77538g.f77414g.mo33975j(colorStateList2);
            }
            this.f77538g.f77414g.mo33973h(this.f77554w);
            int i9 = this.f77556y;
            if (i9 != 0) {
                this.f77538g.f77414g.mo33983q(i9);
            }
            ColorStateList colorStateList3 = this.f77557z;
            if (colorStateList3 != null) {
                this.f77538g.f77414g.mo33984r(colorStateList3);
            }
            ColorStateList colorStateList4 = this.f77508A;
            if (colorStateList4 != null) {
                this.f77538g.f77414g.mo33979n(colorStateList4);
            }
            ColorStateList colorStateList5 = this.f77509B;
            if (colorStateList5 != null) {
                this.f77538g.f77414g.mo33980o(colorStateList5);
            }
            this.f77538g.f77414g.mo33982p(this.f77510C);
            this.f77538g.f77414g.mo33978m(this.f77511D);
            if (!(this.f77521N == 0 || this.f77522O == 0)) {
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(this.f77521N);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(this.f77522O);
                C28517ah ahVar = this.f77538g.f77412e;
                ahVar.f77463g = dimensionPixelOffset;
                ahVar.f77462f = dimensionPixelOffset2;
            }
            if (this.f77523P != 0) {
                this.f77538g.f77412e.f77457a = getResources().getDimensionPixelOffset(this.f77523P);
            }
            int i10 = this.f77543l;
            if (i10 != 0) {
                C28512ac acVar6 = this.f77538g;
                acVar6.f77397F = i10;
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                acVar6.f77396E = paint;
                if (acVar6.mo34024p()) {
                    acVar6.mo34010h();
                }
            }
            this.f77538g.f77414g.mo33989w(this.f77545n, this.f77550s, this.f77555x);
            this.f77538g.setContentDescription(this.f77536e);
            C28512ac acVar7 = this.f77538g;
            acVar7.f77413f.f77441g = this.f77528U;
            if (!acVar7.f77427t && !acVar7.f77433z && acVar7.f77394C) {
                acVar7.mo34015m(acVar7.mo33998a());
            }
            this.f77538g.setTag(R.id.featurehighlight_view_tag_fragment, this);
            ((ViewGroup) getActivity().findViewById(16908290)).addView(this.f77538g);
            return;
        }
        mo34076c();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C28522d) {
            this.f77537f = (C28522d) parentFragment;
        } else if (activity instanceof C28522d) {
            this.f77537f = (C28522d) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.setClassLoader(C28530l.class.getClassLoader());
            this.f77532a = (ViewFinder) arguments.getParcelable("fh_view_finder");
            this.f77543l = arguments.getInt("fh_target_view_tint_color");
            this.f77544m = arguments.getInt("fh_confining_view_id");
            this.f77545n = arguments.getCharSequence("fh_header_text");
            this.f77546o = arguments.getInt("fh_header_text_size_res");
            this.f77547p = arguments.getInt("fh_header_text_appearance");
            this.f77548q = (ColorStateList) arguments.getParcelable("fh_header_text_color");
            this.f77549r = arguments.getInt("fh_header_text_alignment");
            this.f77550s = arguments.getCharSequence("fh_body_text");
            this.f77551t = arguments.getInt("fh_body_text_size_res");
            this.f77552u = arguments.getInt("fh_body_text_appearance");
            this.f77553v = (ColorStateList) arguments.getParcelable("fh_body_text_color");
            this.f77554w = arguments.getInt("fh_body_text_alignment");
            this.f77555x = arguments.getCharSequence("fh_dismiss_action_text");
            this.f77556y = arguments.getInt("fh_dismiss_action_text_appearance");
            this.f77557z = (ColorStateList) arguments.getParcelable("fh_dismiss_action_text_color");
            this.f77508A = (ColorStateList) arguments.getParcelable("fh_dismiss_action_ripple_color");
            this.f77509B = (ColorStateList) arguments.getParcelable("fh_dismiss_action_stroke_color");
            this.f77510C = arguments.getInt("fh_dismiss_action_text_alignment");
            this.f77511D = arguments.getInt("fh_dismiss_action_button_alignment");
            this.f77512E = arguments.getInt("fh_outer_color");
            this.f77513F = arguments.getInt("fh_pulse_inner_color");
            this.f77514G = arguments.getInt("fh_pulse_outer_color");
            this.f77515H = arguments.getInt("fh_scrim_color");
            this.f77516I = arguments.getInt("fh_target_text_color");
            this.f77517J = arguments.getInt("fh_target_drawable");
            this.f77518K = arguments.getInt("fh_target_drawable_color");
            this.f77519L = arguments.getFloat("fh_target_scale");
            this.f77531X = arguments.getBoolean("fh_target_shadow_enabled");
            this.f77520M = arguments.getString("fh_callback_id");
            this.f77533b = arguments.getString("fh_task_tag");
            this.f77521N = arguments.getInt("fh_vertical_offset_res");
            this.f77522O = arguments.getInt("fh_horizontal_offset_res");
            this.f77523P = arguments.getInt("fh_center_threshold_res");
            this.f77534c = arguments.getBoolean("fh_task_complete_on_tap");
            this.f77535d = arguments.getLong("fh_duration");
            this.f77524Q = arguments.getBoolean("fh_pin_to_closest_vertical_edge");
            this.f77525R = arguments.getBoolean("fh_swipe_to_dismiss_enabled");
            this.f77526S = arguments.getBoolean("fh_tap_to_dismiss_enabled");
            this.f77527T = arguments.getInt("fh_text_vertical_gravity_hint");
            this.f77536e = arguments.getCharSequence("fh_content_description");
            this.f77528U = (C28518ai) arguments.getSerializable("fh_pulse_animation_type");
            this.f77529V = (C28531m) arguments.getSerializable("fh_feature_highlight_style");
            this.f77530W = arguments.getInt("fh_theme_overlay");
            if (bundle != null) {
                int i = bundle.getInt("showState");
                if (i == 0 || i == 1) {
                    this.f77539h = i;
                    return;
                }
                throw new IllegalArgumentException("Unrecognised show state.");
            }
        }
    }

    public final void onDestroy() {
        C28512ac acVar = this.f77538g;
        if (acVar != null) {
            acVar.setTag(R.id.featurehighlight_view_tag_fragment, (Object) null);
            ((ViewGroup) getActivity().findViewById(16908290)).removeView(this.f77538g);
            this.f77538g = null;
        }
        super.onDestroy();
    }

    public final void onDetach() {
        super.onDetach();
        mo34075b();
        this.f77537f = null;
    }

    public final void onPause() {
        super.onPause();
        this.f77538g.removeCallbacks(this.f77540i);
    }

    public final void onResume() {
        super.onResume();
        C28512ac acVar = this.f77538g;
        if (acVar != null) {
            long j = this.f77535d;
            if (j > 0) {
                acVar.postDelayed(this.f77540i, j);
            }
            if (!this.f77542k) {
                C2043bi.m5520N(this.f77538g, new C28525g(this));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("showState", this.f77539h);
    }
}
