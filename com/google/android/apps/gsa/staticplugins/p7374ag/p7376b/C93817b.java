package com.google.android.apps.gsa.staticplugins.p7374ag.p7376b;

import com.google.android.apps.gsa.staticplugins.p7374ag.p7376b.C93819d;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.b.b */
/* compiled from: PG */
public final /* synthetic */ class C93817b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93819d f262062a;

    /* renamed from: b */
    public final /* synthetic */ String f262063b;

    public /* synthetic */ C93817b(C93819d dVar, String str) {
        this.f262062a = dVar;
        this.f262063b = str;
    }

    public final C60870cx apply(Object obj) {
        C93819d dVar = this.f262062a;
        String str = this.f262063b;
        C32221c eP = ((C93819d.C93820a) C47245e.m84045a(dVar.f262066c, C93819d.C93820a.class, (AccountId) obj)).mo88182eP();
        if (str == null) {
            return eP.mo38002b();
        }
        return eP.mo38007g(str);
    }
}
