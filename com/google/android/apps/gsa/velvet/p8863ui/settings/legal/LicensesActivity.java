package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.licenses.License;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.LicensesActivity */
/* compiled from: PG */
public class LicensesActivity extends C118663e implements C118670l, C118668j {

    /* renamed from: k */
    public C118669k f331019k;

    /* renamed from: l */
    private C118672n f331020l;

    /* renamed from: m */
    private C118671m f331021m;

    /* renamed from: n */
    private License f331022n;

    /* renamed from: o */
    private boolean f331023o;

    /* renamed from: a */
    public final void mo103838a(License license, String str) {
        if (this.f331023o && this.f331022n == license) {
            C118672n nVar = this.f331020l;
            if (nVar != null) {
                synchronized (nVar.f331052a) {
                    if (nVar.f331053b) {
                        nVar.mo103851d(str);
                    } else {
                        nVar.f331054c = str;
                    }
                }
                return;
            }
            throw new IllegalStateException("Fragment not found");
        }
    }

    /* renamed from: b */
    public final void mo103839b(List list) {
        if (this.f331023o) {
            C118671m mVar = this.f331021m;
            if (mVar != null) {
                mVar.mo730a(new ArrayAdapter(mVar.getActivity(), 17367043, list));
                return;
            }
            throw new IllegalStateException("Fragment not found");
        }
    }

    /* renamed from: c */
    public final void mo103840c() {
        if (this.f331023o) {
            Toast.makeText(this, "Failed to load license text", 0).show();
            finish();
        }
    }

    /* renamed from: d */
    public final void mo103841d() {
        if (this.f331023o) {
            Toast.makeText(this, "Failed to load licenses", 0).show();
            finish();
        }
    }

    /* renamed from: e */
    public final void mo103842e(License license) {
        this.f331022n = license;
        if (this.f331020l == null) {
            this.f331020l = new C118672n();
        }
        C0154a aVar = new C0154a(mo545jw());
        aVar.mo689v(R.id.gsa_licenses_fragment_container, this.f331020l, "license_text");
        aVar.mo686s((String) null);
        aVar.mo505b(false);
        this.f331019k.mo103850a(license, this);
    }

    public final void onBackPressed() {
        FragmentManager jw = mo545jw();
        if (jw.mo471b() != 0) {
            this.f331022n = null;
            jw.mo442I();
            return;
        }
        this.f2707h.mo3340c();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aX);
        super.onCreate(bundle);
        setContentView((int) R.layout.open_source_licenses_activity);
        FragmentManager jw = mo545jw();
        if (bundle == null) {
            this.f331021m = new C118671m();
            C0154a aVar = new C0154a(jw);
            aVar.mo511h(R.id.gsa_licenses_fragment_container, this.f331021m, "license_menu", 1);
            aVar.mo505b(false);
            return;
        }
        this.f331021m = (C118671m) jw.f634a.mo671c("license_menu");
        this.f331020l = (C118672n) jw.f634a.mo671c("license_text");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f331022n = null;
        this.f331021m = null;
        this.f331020l = null;
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        FragmentManager jw = mo545jw();
        if (jw.mo471b() != 0) {
            this.f331022n = null;
            jw.mo442I();
            return true;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        License license = (License) bundle.getParcelable("license");
        this.f331022n = license;
        if (license != null) {
            this.f331019k.mo103850a(license, this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("license", this.f331022n);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f331023o = true;
        C118669k kVar = this.f331019k;
        if (kVar.f331050g == null) {
            kVar.f331050g = kVar.f331046c.mo28201a("LoadLicensesTask", new C118664f(kVar));
        }
        kVar.f331047d.mo28211k(kVar.f331050g, "LoadLicensesTaskCallback", new C118666h(this));
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f331023o = false;
        C118669k kVar = this.f331019k;
        C60870cx cxVar = kVar.f331050g;
        if (cxVar != null) {
            cxVar.cancel(true);
            kVar.f331050g = null;
        }
        for (C60870cx cancel : kVar.f331049f.values()) {
            cancel.cancel(true);
        }
        kVar.f331049f.clear();
        super.onStop();
    }
}
