package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ch */
/* compiled from: PG */
public final class C96131ch extends C96363kx {

    /* renamed from: j */
    public static final /* synthetic */ int f269115j = 0;

    /* renamed from: k */
    private static final C59071e f269116k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ch");

    /* renamed from: l */
    private static final Duration f269117l = Duration.ofSeconds(30);

    /* renamed from: b */
    public Integer f269118b;

    /* renamed from: c */
    public C96094ay f269119c;

    /* renamed from: d */
    public C22871g f269120d;

    /* renamed from: e */
    public C22871g f269121e;

    /* renamed from: f */
    public C96325jm f269122f;

    /* renamed from: g */
    public C96331js f269123g;

    /* renamed from: h */
    public C95495l f269124h;

    /* renamed from: i */
    public C124550f f269125i;

    /* renamed from: m */
    private C60870cx f269126m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "DeviceCustomizeInfo";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo89973g(Throwable th) {
        C59071e eVar = f269116k;
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(16960)).mo56386p("Failed to download device customization");
        String str = this.f269119c.f269039a;
        if (str == null) {
            C59104x c2 = eVar.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
            ((C59052c) ((C59052c) c2).mo56372aa(16961)).mo56386p("Missing Device Id");
            mo77318iT().mo77312a();
            return;
        }
        new AlertDialog.Builder(getActivity()).setMessage(R.string.bisto_error_consent_retry_message).setNegativeButton(R.string.bisto_generic_cancel_button, new C96120bx(this, str)).setPositiveButton(R.string.bisto_try_again, new C96121by(this, str)).setCancelable(false).create().show();
        C60103kw kwVar = ((C95299e) this.f269603D.mo27525b()).f266647b;
        int i = ((C60106kz) kwVar.instance).f162543k;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        kzVar.f162533a |= 8192;
        kzVar.f162543k = i + 1;
    }

    /* renamed from: h */
    public final void mo89974h() {
        String str = this.f269119c.f269039a;
        if (str == null) {
            C59104x c = f269116k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
            ((C59052c) ((C59052c) c).mo56372aa(16962)).mo56386p("Missing Device Id");
            mo77318iT().mo77312a();
            return;
        }
        C60870cx j = this.f269121e.mo28210j(this.f269125i.mo83411q(str, C96122bz.f269103a, f269117l), "wait-for-download", new C96124ca(this, str));
        this.f269126m = j;
        C90873ag agVar = new C90873ag(j, this.f269120d, "customization", new C96125cb(this));
        agVar.mo85224b(CancellationException.class, C96126cc.f269108a);
        agVar.mo85223a(new C96127cd(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.loading, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.onboarding_loading_title);
        if (textView != null) {
            textView.setText(R.string.bisto_downloading_device_customization);
        }
        return inflate;
    }

    public final void onPause() {
        C60870cx cxVar = this.f269126m;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.f269119c.f269039a == null) {
            mo89973g(new IllegalArgumentException("Missing deviceId"));
        } else {
            mo89974h();
        }
    }
}
