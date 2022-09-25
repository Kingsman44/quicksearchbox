package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14223bg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p11002ag.C147575e;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.OptionalInt;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.z */
/* compiled from: PG */
public final class C15106z implements C15006ao {

    /* renamed from: a */
    public static final C59071e f45323a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.z");

    /* renamed from: i */
    private static final View.AccessibilityDelegate f45324i = new C15102v();

    /* renamed from: b */
    public final C14986h f45325b;

    /* renamed from: c */
    public final Context f45326c;

    /* renamed from: d */
    public View f45327d;

    /* renamed from: e */
    public TextView f45328e;

    /* renamed from: f */
    public View f45329f;

    /* renamed from: g */
    public String f45330g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public OptionalInt f45331h = OptionalInt.empty();

    /* renamed from: j */
    private final C69464a f45332j;

    /* renamed from: k */
    private final C14132bf f45333k;

    public C15106z(Context context, C14986h hVar, C69464a aVar, C14132bf bfVar) {
        this.f45326c = context;
        this.f45325b = hVar;
        this.f45332j = aVar;
        this.f45333k = bfVar;
    }

    /* renamed from: a */
    public final View mo21891a() {
        View view = this.f45327d;
        view.getClass();
        return view;
    }

    /* renamed from: c */
    public final void mo21964c(String str) {
        this.f45330g = str;
        if (str.isEmpty()) {
            this.f45328e.setText(this.f45326c.getString(R.string.dial_number));
            return;
        }
        C147576f c = C147576f.m240621c();
        try {
            String simCountryIso = ((TelephonyManager) this.f45326c.getSystemService("phone")).getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso) && Locale.getDefault() != null) {
                simCountryIso = Locale.getDefault().getCountry();
            }
            this.f45328e.setText(c.mo124328s(c.mo124320f(str, TextUtils.isEmpty(simCountryIso) ? "US" : simCountryIso.toUpperCase(Locale.US)), 3));
        } catch (C147575e unused) {
            C59104x d = f45323a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.DialerFullRend");
            ((C59052c) ((C59052c) d).mo56372aa(45951)).mo56389s("Could not parse number: %s", str);
            this.f45328e.setText(str);
        }
    }

    /* renamed from: b */
    public final void mo21963b(C14223bg bgVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z) {
        C14223bg bgVar2 = bgVar;
        ViewGroup viewGroup2 = viewGroup;
        ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
        int b = C14632v.m30648b(bgVar2.f43050c);
        if (b != 0 && b == 5) {
            this.f45331h = OptionalInt.m71640of(bgVar2.f43049b);
        }
        if (this.f45327d == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.dialer_fullscreen, viewGroup2, true);
            View findViewById = viewGroup2.findViewById(R.id.dialer);
            this.f45327d = findViewById;
            this.f45333k.mo21444a(findViewById, 108728);
            C15103w wVar = new C15103w(this);
            View view = this.f45327d;
            view.getClass();
            view.setOnTouchListener(new C14144n(contextThemeWrapper2, this.f45333k, wVar));
            View view2 = this.f45327d;
            view2.getClass();
            view2.setPadding(0, ((Integer) this.f45332j.mo17428b()).intValue(), 0, 0);
            View view3 = this.f45327d;
            view3.getClass();
            this.f45328e = (TextView) view3.findViewById(R.id.dial_number_textview);
            View view4 = this.f45327d;
            view4.getClass();
            View findViewById2 = view4.findViewById(R.id.place_end_call_button);
            View view5 = this.f45327d;
            view5.getClass();
            View findViewById3 = view5.findViewById(R.id.place_call_button);
            if (this.f45331h.isPresent()) {
                findViewById3.setVisibility(8);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new C15094n(this));
            } else {
                findViewById3.setVisibility(0);
                findViewById2.setVisibility(8);
                findViewById3.setOnClickListener(new C15095o(this));
            }
            if (bgVar2.f43048a != null) {
                View view6 = this.f45327d;
                view6.getClass();
                View findViewById4 = view6.findViewById(R.id.dismiss_dialpad);
                this.f45329f = findViewById4;
                findViewById4.getClass();
                findViewById4.setVisibility(0);
                View view7 = this.f45329f;
                view7.getClass();
                view7.setOnClickListener(new C15096p(this, bgVar2));
            }
            C15097q qVar = new C15097q(this);
            View view8 = this.f45327d;
            view8.getClass();
            view8.findViewById(R.id.one).setOnClickListener(qVar);
            View view9 = this.f45327d;
            view9.getClass();
            view9.findViewById(R.id.two).setOnClickListener(qVar);
            View view10 = this.f45327d;
            view10.getClass();
            view10.findViewById(R.id.three).setOnClickListener(qVar);
            View view11 = this.f45327d;
            view11.getClass();
            view11.findViewById(R.id.four).setOnClickListener(qVar);
            View view12 = this.f45327d;
            view12.getClass();
            view12.findViewById(R.id.five).setOnClickListener(qVar);
            View view13 = this.f45327d;
            view13.getClass();
            view13.findViewById(R.id.six).setOnClickListener(qVar);
            View view14 = this.f45327d;
            view14.getClass();
            view14.findViewById(R.id.seven).setOnClickListener(qVar);
            View view15 = this.f45327d;
            view15.getClass();
            view15.findViewById(R.id.eight).setOnClickListener(qVar);
            View view16 = this.f45327d;
            view16.getClass();
            view16.findViewById(R.id.nine).setOnClickListener(qVar);
            View view17 = this.f45327d;
            view17.getClass();
            view17.findViewById(R.id.zero).setOnClickListener(qVar);
            View view18 = this.f45327d;
            view18.getClass();
            view18.findViewById(R.id.star).setOnClickListener(qVar);
            View view19 = this.f45327d;
            view19.getClass();
            view19.findViewById(R.id.pound).setOnClickListener(qVar);
            View view20 = this.f45327d;
            view20.getClass();
            View findViewById5 = view20.findViewById(R.id.two);
            View.AccessibilityDelegate accessibilityDelegate = f45324i;
            findViewById5.setAccessibilityDelegate(accessibilityDelegate);
            View view21 = this.f45327d;
            view21.getClass();
            view21.findViewById(R.id.three).setAccessibilityDelegate(accessibilityDelegate);
            View view22 = this.f45327d;
            view22.getClass();
            view22.findViewById(R.id.four).setAccessibilityDelegate(accessibilityDelegate);
            View view23 = this.f45327d;
            view23.getClass();
            view23.findViewById(R.id.five).setAccessibilityDelegate(accessibilityDelegate);
            View view24 = this.f45327d;
            view24.getClass();
            view24.findViewById(R.id.six).setAccessibilityDelegate(accessibilityDelegate);
            View view25 = this.f45327d;
            view25.getClass();
            view25.findViewById(R.id.seven).setAccessibilityDelegate(accessibilityDelegate);
            View view26 = this.f45327d;
            view26.getClass();
            view26.findViewById(R.id.eight).setAccessibilityDelegate(accessibilityDelegate);
            View view27 = this.f45327d;
            view27.getClass();
            view27.findViewById(R.id.nine).setAccessibilityDelegate(accessibilityDelegate);
            View view28 = this.f45327d;
            view28.getClass();
            View findViewById6 = view28.findViewById(R.id.backspace);
            if (this.f45331h.isPresent()) {
                findViewById6.setVisibility(8);
            } else {
                findViewById6.setOnClickListener(new C15098r(this));
                findViewById6.setOnLongClickListener(new C15099s(this));
            }
            if (this.f45331h.isPresent()) {
                View view29 = this.f45327d;
                view29.getClass();
                view29.findViewById(R.id.plus_icon).setVisibility(8);
                View view30 = this.f45327d;
                view30.getClass();
                view30.findViewById(R.id.voicemail_icon).setVisibility(8);
            } else {
                View view31 = this.f45327d;
                view31.getClass();
                view31.findViewById(R.id.plus_icon).setVisibility(0);
                View view32 = this.f45327d;
                view32.getClass();
                view32.findViewById(R.id.voicemail_icon).setVisibility(0);
                View view33 = this.f45327d;
                view33.getClass();
                view33.findViewById(R.id.zero).setOnLongClickListener(new C15100t(this));
                View view34 = this.f45327d;
                view34.getClass();
                view34.findViewById(R.id.one).setOnLongClickListener(new C15101u(this));
                View view35 = this.f45327d;
                view35.getClass();
                view35.findViewById(R.id.zero).setAccessibilityDelegate(new C15104x(this));
                View view36 = this.f45327d;
                view36.getClass();
                view36.findViewById(R.id.one).setAccessibilityDelegate(new C15105y(this));
            }
            if (z) {
                View view37 = this.f45327d;
                view37.getClass();
                view37.startAnimation(C15352z.m31954f(contextThemeWrapper2, viewGroup2));
                View view38 = this.f45329f;
                if (view38 != null) {
                    view38.startAnimation(C15352z.m31955g(contextThemeWrapper2, 1));
                }
                TextView textView = this.f45328e;
                textView.getClass();
                textView.startAnimation(C15352z.m31955g(contextThemeWrapper2, 1));
                View view39 = this.f45327d;
                view39.getClass();
                view39.findViewById(R.id.dialpad_keys_container).startAnimation(C15352z.m31955g(contextThemeWrapper2, 2));
                View view40 = this.f45327d;
                view40.getClass();
                view40.findViewById(R.id.dialpad_place_call_button_row_container).startAnimation(C15352z.m31955g(contextThemeWrapper2, 3));
            }
        }
    }
}
