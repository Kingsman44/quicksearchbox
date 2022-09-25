package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.m */
/* compiled from: PG */
public final /* synthetic */ class C113634m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ OfflineSubController f314675a;

    /* renamed from: b */
    public final /* synthetic */ C113611x f314676b;

    public /* synthetic */ C113634m(OfflineSubController offlineSubController, C113611x xVar) {
        this.f314675a = offlineSubController;
        this.f314676b = xVar;
    }

    public final void run() {
        OfflineSubController offlineSubController = this.f314675a;
        C113611x xVar = this.f314676b;
        String str = (String) C113630i.f314648a.get(Locale.forLanguageTag(offlineSubController.f314601e).getLanguage());
        str.getClass();
        xVar.f314553b.mo100348w(str, offlineSubController.f314601e);
    }
}
