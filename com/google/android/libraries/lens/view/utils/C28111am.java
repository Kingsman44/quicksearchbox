package com.google.android.libraries.lens.view.utils;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58557jl;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.utils.am */
/* compiled from: PG */
public final class C28111am {

    /* renamed from: a */
    private static final C58869cf f76508a = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: a */
    public static String m52392a(String str, C25799b bVar) {
        if (str.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        Locale locale = Locale.US;
        C58869cf cfVar = f76508a;
        return String.format(locale, "%s.%s.%s-%s", new Object[]{Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(cfVar.mo56153g(str), 0))), Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(cfVar.mo56153g(str), 1))), Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(cfVar.mo56153g(str), 2))), bVar.name().toLowerCase(Locale.US)});
    }
}
