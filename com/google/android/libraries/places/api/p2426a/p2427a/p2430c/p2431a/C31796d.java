package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31791a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31793c;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.android.libraries.places.p2438b.C31894a;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.d */
/* compiled from: PG */
public final class C31796d extends C31802j {
    public C31796d(C31858n nVar, Locale locale, String str, C31894a aVar) {
        super(nVar, locale, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo37387c() {
        return "autocomplete/json";
    }

    /* renamed from: d */
    public final Map mo37388d() {
        String str;
        HashMap hashMap = new HashMap();
        C31858n nVar = (C31858n) this.f85443a;
        TypeFilter f = nVar.mo37427f();
        List i = nVar.mo37431i();
        String g = nVar.mo37428g();
        String str2 = null;
        if (g == null) {
            str = null;
        } else {
            str = g.replaceFirst("^\\s+", BuildConfig.FLAVOR).replaceFirst("\\s+$", " ");
        }
        m59166e(hashMap, "input", str);
        if (!i.isEmpty()) {
            m59166e(hashMap, "types", TextUtils.join("|", i));
        } else {
            if (f != null) {
                str2 = C31793c.m59158a(f);
            }
            m59166e(hashMap, "types", str2);
        }
        m59166e(hashMap, "sessiontoken", nVar.mo37423c());
        m59166e(hashMap, "origin", C31791a.m59150d(nVar.mo37422b()));
        m59166e(hashMap, "locationbias", C31791a.m59151e(nVar.mo37424d()));
        m59166e(hashMap, "locationrestriction", C31791a.m59152f(nVar.mo37425e()));
        m59166e(hashMap, "components", C31791a.m59148b(nVar.mo37429h()));
        return hashMap;
    }
}
