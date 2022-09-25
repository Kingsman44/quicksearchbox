package com.google.android.apps.gsa.search.core.preferences.p6818b;

import com.google.android.apps.gsa.search.core.preferences.p6818b.C86299d;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133531a;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133550as;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133567r;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.b.c */
/* compiled from: PG */
public final /* synthetic */ class C86298c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C86299d f233337a;

    /* renamed from: b */
    public final /* synthetic */ boolean f233338b;

    public /* synthetic */ C86298c(C86299d dVar, boolean z) {
        this.f233337a = dVar;
        this.f233338b = z;
    }

    public final C60870cx apply(Object obj) {
        C86299d dVar = this.f233337a;
        boolean z = this.f233338b;
        Optional hY = ((C86299d.C86300a) C47245e.m84045a(dVar.f233339a, C86299d.C86300a.class, (AccountId) obj)).mo80009hY();
        if (!hY.isPresent()) {
            return C60866ct.f164955a;
        }
        C133550as asVar = (C133550as) hY.get();
        C47538ax c = asVar.f363869c.mo51613c("updateSignedOutSearchCustomizationFromAgsaC");
        try {
            C133567r rVar = asVar.f363867a;
            C133531a aVar = new C133531a();
            aVar.f363832b = 1;
            aVar.f363831a = 1;
            aVar.mo111244c(z);
            aVar.mo111243b(true);
            C60870cx a = rVar.mo111269a(aVar.mo111242a());
            if (c == null) {
                return a;
            }
            c.close();
            return a;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
