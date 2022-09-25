package com.google.android.apps.gsa.staticplugins.p7614bx.p7626g;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6807j.C86133b;
import com.google.android.apps.gsa.staticplugins.customtabs.C98585aj;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.g.c */
/* compiled from: PG */
public final /* synthetic */ class C97471c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C97472d f272166a;

    public /* synthetic */ C97471c(C97472d dVar) {
        this.f272166a = dVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C97472d dVar = this.f272166a;
        C86133b a = ((C98585aj) ((C58833ax) dVar.f272168b.mo27525b()).mo56107c()).mo91202a();
        String b = a.mo79779b();
        if (b == null || !a.mo79782f()) {
            return C58836b.f156633a;
        }
        Intent intent = new Intent("org.chromium.chrome.browser.incognito.OPEN_PRIVATE_TAB");
        intent.setPackage(b);
        if (intent.resolveActivity(dVar.f272167a.getPackageManager()) == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(intent);
    }
}
