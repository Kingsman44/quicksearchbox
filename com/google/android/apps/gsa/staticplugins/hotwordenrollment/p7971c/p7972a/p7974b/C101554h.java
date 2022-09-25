package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.apps.gsa.shared.p7045k.C89809e;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92370h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.h */
/* compiled from: PG */
public final /* synthetic */ class C101554h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101560n f283396a;

    /* renamed from: b */
    public final /* synthetic */ C89824t f283397b;

    public /* synthetic */ C101554h(C101560n nVar, C89824t tVar) {
        this.f283396a = nVar;
        this.f283397b = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101560n nVar = this.f283396a;
        C89809e a = this.f283397b.mo83663a();
        ((C59052c) ((C59052c) C101560n.f283404a.mo56224b()).mo56372aa(20338)).mo56389s("#requestAuthTokenCheck deviceInfo: %s", a);
        return nVar.f283406c.mo87018b(a.mo83656j(), new URL(C92370h.m151688a(a)), C92361a.AUTH_TOKEN_CHECK, (String) obj, nVar.f283412i.e());
    }
}
