package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.libraries.gsa.c.a.a.aq */
/* compiled from: PG */
public final class C22174aq implements C89045bp {

    /* renamed from: b */
    private static final C59071e f61211b = C59071e.m91332i("com.google.android.libraries.gsa.c.a.a.aq");

    /* renamed from: c */
    private final C22170am f61212c;

    public C22174aq(C22170am amVar) {
        this.f61212c = amVar;
    }

    /* renamed from: d */
    private static int[] m41452d(String str) {
        if (str == null || str.length() < 3) {
            return f241322a;
        }
        try {
            return new int[]{Integer.parseInt(str.substring(0, 3)), Integer.parseInt(str.substring(3))};
        } catch (NumberFormatException e) {
            C59104x c = f61211b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TelephonyMonitor");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48546)).mo56389s("Wrong mccMnc: %s", str);
            return f241322a;
        }
    }

    /* renamed from: a */
    public final String mo27402a() {
        String simCountryIso = this.f61212c.f61187h.getSimCountryIso();
        if (TextUtils.isEmpty(simCountryIso)) {
            return BuildConfig.FLAVOR;
        }
        return simCountryIso.toUpperCase(Locale.US);
    }

    /* renamed from: b */
    public final int[] mo27403b() {
        return m41452d(this.f61212c.f61187h.getNetworkOperator());
    }

    /* renamed from: c */
    public final int[] mo27404c() {
        return m41452d(this.f61212c.f61187h.getSimOperator());
    }
}
