package com.google.android.apps.search.googleapp.customtabs.features.p10157a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.a.a */
/* compiled from: PG */
public final /* synthetic */ class C133772a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C133774c f364374a;

    /* renamed from: b */
    public final /* synthetic */ int f364375b;

    /* renamed from: c */
    public final /* synthetic */ C60931s f364376c;

    /* renamed from: d */
    public final /* synthetic */ Object f364377d;

    public /* synthetic */ C133772a(C133774c cVar, int i, C60931s sVar, Object obj) {
        this.f364374a = cVar;
        this.f364375b = i;
        this.f364376c = sVar;
        this.f364377d = obj;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C133774c cVar = this.f364374a;
        int i = this.f364375b;
        C60931s sVar = this.f364376c;
        Object obj = this.f364377d;
        synchronized (cVar.f364382a) {
            if (cVar.f364384c == i) {
                return sVar.apply(obj);
            }
            C60870cx g = C60856cj.m92898g();
            return g;
        }
    }
}
