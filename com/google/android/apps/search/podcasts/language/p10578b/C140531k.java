package com.google.android.apps.search.podcasts.language.p10578b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.language.b.k */
/* compiled from: PG */
public final class C140531k implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C140532l f381676a;

    /* renamed from: b */
    final /* synthetic */ String f381677b;

    public C140531k(C140532l lVar, String str) {
        this.f381676a = lVar;
        this.f381677b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Set set = this.f381676a.f381683f;
        if (set != null) {
            String str = this.f381677b;
            if (set.size() == 2 && !set.contains(str)) {
                return C60856cj.m92899h(new Exception("Can not select more after 2 languages have been selected."));
            }
            if (!set.add(str)) {
                set.remove(str);
            }
        }
        return C60866ct.f164955a;
    }
}
