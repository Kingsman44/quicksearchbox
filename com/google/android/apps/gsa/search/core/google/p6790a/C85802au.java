package com.google.android.apps.gsa.search.core.google.p6790a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.au */
/* compiled from: PG */
public final /* synthetic */ class C85802au implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C85802au f232007a = new C85802au();

    private /* synthetic */ C85802au() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        for (String str2 : C58869cf.m90937c(C58837ba.m90854c(";\\s")).mo56153g(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && indexOf != str2.length() - 1 && str2.substring(0, indexOf).equals("NID")) {
                return str2.substring(indexOf + 1);
            }
        }
        return BuildConfig.FLAVOR;
    }
}
