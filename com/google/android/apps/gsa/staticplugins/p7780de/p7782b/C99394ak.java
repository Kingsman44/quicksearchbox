package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C99394ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278064a;

    /* renamed from: b */
    public final /* synthetic */ boolean f278065b;

    public /* synthetic */ C99394ak(C99403at atVar, boolean z) {
        this.f278064a = atVar;
        this.f278065b = z;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278064a;
        boolean z = this.f278065b;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C99403at.f278080a.mo56226d()).mo56382g(exc)).mo56372aa(32612)).mo56386p("Failed to get intent with TikTok account for TNG homescreen.");
        ((C89911f) atVar.f278130y.mo27525b()).mo83755a(exc, 157567305, 29).mo83721a();
        atVar.mo91419f(new Intent(), z);
    }
}
