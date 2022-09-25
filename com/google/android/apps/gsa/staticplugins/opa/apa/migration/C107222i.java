package com.google.android.apps.gsa.staticplugins.opa.apa.migration;

import android.util.Pair;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.migration.i */
/* compiled from: PG */
public final /* synthetic */ class C107222i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C51809dy f298420a;

    public /* synthetic */ C107222i(C51809dy dyVar) {
        this.f298420a = dyVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C51809dy dyVar = this.f298420a;
        Pair pair = (Pair) obj;
        String str = dyVar.f135936b;
        C129146c cVar = (C129146c) ((Map) pair.second).get(dyVar.f135936b);
        AccountId accountId = (AccountId) pair.first;
        if (cVar == null) {
            return new C107220g(accountId);
        }
        return new C107221h(cVar, dyVar, accountId);
    }
}
