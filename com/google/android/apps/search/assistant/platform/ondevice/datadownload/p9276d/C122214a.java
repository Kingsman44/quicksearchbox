package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.a */
/* compiled from: PG */
public final /* synthetic */ class C122214a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122277d f338923a;

    public /* synthetic */ C122214a(C122277d dVar) {
        this.f338923a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C122277d dVar = this.f338923a;
        if (dVar.f339063a.equals((AccountId) obj)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx a = dVar.f339064b.mo50214a(dVar.f339063a);
        C122268c cVar = C122268c.f339042a;
        return C60922j.m93044g(a, C47810es.m84963c(cVar), dVar.f339065c);
    }
}
