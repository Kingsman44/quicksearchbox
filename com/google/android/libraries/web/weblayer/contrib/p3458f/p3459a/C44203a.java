package com.google.android.libraries.web.weblayer.contrib.p3458f.p3459a;

import android.content.Context;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.weblayer.contrib.p3458f.C44202a;
import com.google.common.base.C58893dc;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.f.a.a */
/* compiled from: PG */
public final class C44203a implements C43541a {

    /* renamed from: a */
    private final C44202a f114981a;

    /* renamed from: b */
    private final Context f114982b;

    public C44203a(C44202a aVar, Fragment fragment) {
        this.f114981a = aVar;
        this.f114982b = fragment.requireContext();
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.webx_translate_overflow_menu_button;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 112550;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        return this.f114982b.getResources().getString(R.string.webx_translate_overflow_menu_button_label);
    }

    /* renamed from: d */
    public final void mo46597d() {
        C72615d b = this.f114981a.f114980a.mo47083b();
        C58893dc.m90996a(b);
        C72601bj a = b.mo64482a();
        C58893dc.m90996a(a);
        C72604bm.m107399a();
        a.mo64476g();
        try {
            a.f193153k.mo63744o();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: e */
    public final boolean mo46598e() {
        C72615d b = this.f114981a.f114980a.mo47083b();
        C58893dc.m90996a(b);
        C72601bj a = b.mo64482a();
        C58893dc.m90996a(a);
        C72604bm.m107399a();
        a.mo64476g();
        try {
            return a.f193153k.mo63746q();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
