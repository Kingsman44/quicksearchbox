package com.google.android.libraries.lens.view.filters.p2103f;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25984h;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.filters.f.i */
/* compiled from: PG */
public final class C26005i extends C25984h {

    /* renamed from: a */
    public Activity f70658a;

    /* renamed from: b */
    public C25537t f70659b;

    /* renamed from: c */
    public C25225bd f70660c;

    /* renamed from: d */
    public C25504aj f70661d;

    /* renamed from: e */
    public C28310af f70662e;

    /* renamed from: f */
    public C28443m f70663f;

    /* renamed from: g */
    public C28306ab f70664g;

    /* renamed from: h */
    public C47770dh f70665h;

    /* renamed from: i */
    public C24974a f70666i;

    /* renamed from: j */
    LocationManager f70667j;

    /* renamed from: k */
    View f70668k;

    /* renamed from: l */
    Button f70669l;

    /* renamed from: m */
    private boolean f70670m;

    /* renamed from: e */
    private final void m48004e(int i) {
        this.f70664g.mo33802c(this.f70668k, this.f70662e.mo33805a(C28427h.m53115a(87094)));
        if (this.f70670m) {
            C28306ab.m52929e(this.f70669l);
        }
        this.f70664g.mo33801b(this.f70669l, this.f70662e.mo33805a(C28427h.m53115a(i)));
        this.f70670m = true;
    }

    /* renamed from: f */
    private final void m48005f(Intent intent) {
        m48004e(87096);
        this.f70669l.setText(R.string.lens_places_permission_settings_button);
        this.f70669l.setOnClickListener(new C47591co(this.f70665h, "Click go to settings", new C26004h(this, intent)));
    }

    /* renamed from: g */
    private final void m48006g(View view, Configuration configuration) {
        View findViewById = view.findViewById(R.id.permission_image);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Resources resources = findViewById.getResources();
        boolean a = C24974a.m46225a(this.f70666i.f68122a);
        int i = R.dimen.filter_permission_image_size;
        if (!a && configuration.orientation == 2) {
            i = R.dimen.filter_permission_image_phone_landscape_size;
        }
        layoutParams.height = resources.getDimensionPixelSize(i);
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo31201a() {
        if (!this.f70667j.isLocationEnabled()) {
            m48005f(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (!this.f70660c.mo30356l()) {
            m48004e(87095);
            this.f70669l.setText(R.string.lens_places_permission_request_button);
            this.f70669l.setOnClickListener(new C47591co(this.f70665h, "Click permissions button", new C26002f(this)));
        } else {
            mo31212c();
        }
    }

    /* renamed from: b */
    public final boolean mo31202b() {
        if (!this.f70667j.isLocationEnabled()) {
            return true;
        }
        Stream stream = DesugarArrays.stream((T[]) this.f70661d.mo30538h());
        C25504aj ajVar = this.f70661d;
        Objects.requireNonNull(ajVar);
        return !stream.anyMatch(new C26000d(ajVar));
    }

    /* renamed from: c */
    public final void mo31212c() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getContext().getPackageName(), (String) null));
        m48005f(intent);
    }

    /* renamed from: d */
    public final void mo31213d() {
        this.f70663f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f70669l));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view != null) {
            m48006g(view, configuration);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(layoutInflater.getContext(), 2132150759)).inflate(R.layout.filter_permission_view, viewGroup, false);
        this.f70668k = inflate;
        this.f70669l = (Button) inflate.findViewById(R.id.permission_toggle_button);
        this.f70670m = false;
        mo31201a();
        View view = this.f70668k;
        m48006g(view, view.getResources().getConfiguration());
        return this.f70668k;
    }
}
