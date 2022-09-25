package com.google.android.apps.search.googleapp.customtabs.p10152d;

import androidx.browser.p059a.C0962j;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.e */
/* compiled from: PG */
public final /* synthetic */ class C133744e implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C133745f f364278a;

    /* renamed from: b */
    public final /* synthetic */ String f364279b;

    public /* synthetic */ C133744e(C133745f fVar, String str) {
        this.f364278a = fVar;
        this.f364279b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C133745f fVar = this.f364278a;
        String str = this.f364279b;
        C133742c cVar2 = new C133742c(fVar.f364280a, cVar, fVar);
        Objects.requireNonNull(cVar2);
        cVar.mo5436a(new C133743d(cVar2), fVar.f364281b);
        try {
            if (C0962j.m2898d(fVar.f364280a, str, cVar2)) {
                return "Custom Tabs Service connection";
            }
            cVar.mo5439d(new C133705a("Binding failure"));
            return "Custom Tabs Service connection";
        } catch (SecurityException e) {
            cVar.mo5439d(new C133705a((Throwable) e));
            return "Custom Tabs Service connection";
        }
    }
}
