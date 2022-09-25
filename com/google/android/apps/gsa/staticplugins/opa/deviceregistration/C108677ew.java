package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.graphics.drawable.Drawable;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ew */
/* compiled from: PG */
final class C108677ew implements C83992d {

    /* renamed from: a */
    final /* synthetic */ C108678ex f302265a;

    /* renamed from: b */
    private boolean f302266b;

    public C108677ew(C108678ex exVar) {
        this.f302265a = exVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77436a() {
        return 1;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo77437b() {
        return 0;
    }

    /* renamed from: c */
    public final Drawable mo77438c() {
        Drawable a = C1877c.m5125a(this.f302265a.getActivity(), R.drawable.quantum_ic_error_outline_vd_theme_24);
        C1929b.m5225f(a, C1878d.m5128a(this.f302265a.getActivity(), 17170443));
        return a;
    }

    /* renamed from: d */
    public final CharSequence mo77439d() {
        return this.f302265a.getString(R.string.multiple_devices_cant_find_device);
    }

    /* renamed from: e */
    public final /* synthetic */ CharSequence mo77440e() {
        return null;
    }

    /* renamed from: f */
    public final void mo77441f(boolean z) {
        this.f302266b = z;
        this.f302265a.f302270e.setEnabled(true);
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo77442g() {
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo77443h() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo77444i() {
        return this.f302266b;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo77445j() {
        return false;
    }
}
