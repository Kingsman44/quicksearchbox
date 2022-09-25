package com.google.android.apps.search.googleapp.customtabs.features.buttons.p10160a;

import android.net.Uri;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.a.d */
/* compiled from: PG */
public final /* synthetic */ class C133819d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C133821f f364489a;

    /* renamed from: b */
    public final /* synthetic */ String f364490b;

    /* renamed from: c */
    public final /* synthetic */ boolean f364491c;

    public /* synthetic */ C133819d(C133821f fVar, String str, boolean z) {
        this.f364489a = fVar;
        this.f364490b = str;
        this.f364491c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C133821f fVar = this.f364489a;
        String str = this.f364490b;
        boolean z = this.f364491c;
        Uri uri = (Uri) fVar.f364497f.get();
        if (str == null || uri == null ? !(uri == null && str == null) : !uri.toString().equals(str)) {
            return C60856cj.m92898g();
        }
        return fVar.mo111407h(z);
    }
}
