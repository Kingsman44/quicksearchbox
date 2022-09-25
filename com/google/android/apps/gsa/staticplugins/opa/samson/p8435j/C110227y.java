package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.y */
/* compiled from: PG */
final class C110227y extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C110190aa f307142a;

    public C110227y(C110190aa aaVar) {
        this.f307142a = aaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C110224v());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C110190aa aaVar = this.f307142a;
        if (!aaVar.mo98463b()) {
            return true;
        }
        String str = ((Account) aaVar.f307035e.mo77278a().mo56107c()).name;
        C73845bq bqVar = (C73845bq) aaVar.f307036f.mo6453a();
        bqVar.getClass();
        String d = bqVar.mo65330d();
        d.getClass();
        return !((C110361bt) aaVar.f307034d.mo27525b()).mo98593j(str, d);
    }
}
