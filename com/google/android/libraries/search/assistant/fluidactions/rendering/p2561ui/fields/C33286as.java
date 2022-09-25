package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.support.constraint.ConstraintLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33183h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33226d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.UnconstrainedSwitch;
import com.google.assistant.p3897e.p3902c.p3907c.C50980by;
import com.google.assistant.p3897e.p3921j.C52483tk;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.as */
/* compiled from: PG */
public final class C33286as implements C33177b, C32974g {

    /* renamed from: a */
    public static final C59071e f89265a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.as");

    /* renamed from: b */
    public final Context f89266b;

    /* renamed from: c */
    public final C33285ar f89267c = new C33285ar();

    /* renamed from: d */
    public final ConstraintLayout f89268d;

    /* renamed from: e */
    public final SeekBar f89269e;

    /* renamed from: f */
    public final LayerDrawable f89270f;

    /* renamed from: g */
    public final TextView f89271g;

    /* renamed from: h */
    public final ConstraintLayout f89272h;

    /* renamed from: i */
    public final ImageView f89273i;

    /* renamed from: j */
    public final TextView f89274j;

    /* renamed from: k */
    public final UnconstrainedSwitch f89275k;

    /* renamed from: l */
    public C51941eu f89276l;

    /* renamed from: m */
    public C33182g f89277m;

    /* renamed from: n */
    public C32942a f89278n;

    /* renamed from: o */
    private final C33183h f89279o;

    /* renamed from: p */
    private boolean f89280p = false;

    public C33286as(DeviceSettingField deviceSettingField, C33183h hVar) {
        this.f89266b = deviceSettingField.getContext();
        this.f89279o = hVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) deviceSettingField.findViewById(R.id.fa_device_setting_field_slider_container);
        constraintLayout.getClass();
        this.f89268d = constraintLayout;
        SeekBar seekBar = (SeekBar) deviceSettingField.findViewById(R.id.fa_device_setting_field_slider);
        seekBar.getClass();
        this.f89269e = seekBar;
        DrawableWrapper drawableWrapper = (DrawableWrapper) ((LayerDrawable) seekBar.getProgressDrawable()).findDrawableByLayerId(R.id.fa_device_setting_slider_progress);
        drawableWrapper.getClass();
        LayerDrawable layerDrawable = (LayerDrawable) drawableWrapper.getDrawable();
        layerDrawable.getClass();
        this.f89270f = layerDrawable;
        TextView textView = (TextView) deviceSettingField.findViewById(R.id.fa_device_setting_field_slider_value);
        textView.getClass();
        this.f89271g = textView;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) deviceSettingField.findViewById(R.id.fa_device_setting_field_toggle_container);
        constraintLayout2.getClass();
        this.f89272h = constraintLayout2;
        ImageView imageView = (ImageView) deviceSettingField.findViewById(R.id.fa_device_setting_field_toggle_image);
        imageView.getClass();
        this.f89273i = imageView;
        TextView textView2 = (TextView) deviceSettingField.findViewById(R.id.fa_device_setting_field_toggle_description);
        textView2.getClass();
        this.f89274j = textView2;
        UnconstrainedSwitch unconstrainedSwitch = (UnconstrainedSwitch) deviceSettingField.findViewById(R.id.fa_device_setting_field_toggle_switch);
        unconstrainedSwitch.getClass();
        this.f89275k = unconstrainedSwitch;
        unconstrainedSwitch.f1902e = PorterDuff.Mode.SRC;
        unconstrainedSwitch.f1903f = true;
        unconstrainedSwitch.mo2354b();
        unconstrainedSwitch.f1899b = PorterDuff.Mode.SRC;
        unconstrainedSwitch.f1900c = true;
        unconstrainedSwitch.mo2353a();
    }

    /* renamed from: h */
    public static C52492tt m61894h(C51941eu euVar, C51953ff ffVar, C52483tk tkVar) {
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = euVar.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = euVar.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        tkVar.getClass();
        trVar4.f137799c = tkVar;
        trVar4.f137798b = 17;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        ffVar.getClass();
        ttVar.f137806b = ffVar;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        return (C52492tt) tsVar.build();
    }

    /* renamed from: a */
    public final void mo38428a(C32973f fVar) {
        C50980by byVar;
        if (fVar.mo38424f() == 2) {
            mo38748j(fVar);
            if (!this.f89280p) {
                this.f89269e.setEnabled(true);
                this.f89271g.setVisibility(0);
            }
        } else if (fVar.mo38424f() == 1) {
            this.f89275k.setChecked(fVar.mo38422e());
            if (this.f89276l != null) {
                int i = true != fVar.mo38422e() ? R.string.fa_device_setting_toggle_off_description : R.string.fa_device_setting_toggle_on_description;
                C51941eu euVar = this.f89276l;
                if (euVar.f136277e == 35) {
                    byVar = (C50980by) euVar.f136278f;
                } else {
                    byVar = C50980by.f132720e;
                }
                this.f89274j.setText(this.f89266b.getString(i, new Object[]{byVar.f132724c}));
            } else {
                ((C59052c) ((C59052c) f89265a.mo56226d()).mo56372aa(51060)).mo56386p("Failed to update toggle description due to invalid args");
            }
            if (!this.f89280p) {
                this.f89275k.setVisibility(0);
            }
        }
        this.f89280p = true;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        ((C59052c) ((C59052c) f89265a.mo56225c()).mo56372aa(51058)).mo56386p("DeviceSettingField does not support update, please re-create one with new FormField ID");
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* renamed from: i */
    public final void mo38747i(C50980by byVar) {
        Optional optional;
        if (byVar.f132723b.isEmpty()) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(byVar.f132723b);
        }
        if (!this.f89279o.mo38582a(new C32954a(byVar.f132722a, optional), this)) {
            ((C59052c) ((C59052c) f89265a.mo56225c()).mo56372aa(51057)).mo56386p("Failed to subscribe to setting data source");
        }
    }

    /* renamed from: j */
    public final void mo38748j(C32973f fVar) {
        if (fVar.mo38420c() < fVar.mo38419b() || fVar.mo38420c() > fVar.mo38418a()) {
            ((C59052c) ((C59052c) f89265a.mo56226d()).mo56372aa(51059)).mo56389s("Invalid slider setting data: %s", fVar);
            return;
        }
        C33285ar arVar = this.f89267c;
        String b = fVar.mo38421d().mo38400b();
        if (C33226d.f88855b.contains(b)) {
            arVar.mo38746b(fVar.mo38419b(), fVar.mo38418a(), 0, 10, BuildConfig.FLAVOR);
        } else if (b.equals("BRIGHTNESS_LEVEL")) {
            arVar.mo38746b(fVar.mo38419b(), fVar.mo38418a(), 0, 100, "%");
        } else {
            arVar.mo38746b(fVar.mo38419b(), fVar.mo38418a(), fVar.mo38419b(), fVar.mo38418a(), BuildConfig.FLAVOR);
        }
        if (this.f89267c.f89260c != this.f89269e.getMin()) {
            this.f89269e.setMin(this.f89267c.f89260c);
        }
        if (this.f89267c.f89261d != this.f89269e.getMax()) {
            this.f89269e.setMax(this.f89267c.f89261d);
        }
        SeekBar seekBar = this.f89269e;
        C33285ar arVar2 = this.f89267c;
        int c = fVar.mo38420c();
        int i = arVar2.f89258a;
        int i2 = arVar2.f89260c;
        if (!(i == i2 && arVar2.f89259b == arVar2.f89261d)) {
            c = Math.round(((float) i2) + ((((float) (c - i)) / arVar2.f89262e) * arVar2.f89263f));
        }
        seekBar.setProgress(c);
        mo38749k();
        this.f89271g.setText(this.f89267c.mo38745a(this.f89269e.getProgress()));
    }

    /* renamed from: k */
    public final void mo38749k() {
        if (this.f89269e.getProgress() == this.f89269e.getMax()) {
            this.f89271g.setTextColor(C19391a.m36980a(this.f89266b, R.attr.colorOnPrimary));
        } else {
            this.f89271g.setTextColor(C33234l.m61644b(this.f89266b, R.attr.fa_device_setting_field_slider_value_text_color));
        }
    }
}
