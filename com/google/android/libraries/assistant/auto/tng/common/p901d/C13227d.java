package com.google.android.libraries.assistant.auto.tng.common.p901d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1704e.C20675a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.d */
/* compiled from: PG */
public final /* synthetic */ class C13227d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13231h f40878a;

    public /* synthetic */ C13227d(C13231h hVar) {
        this.f40878a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C13231h hVar = this.f40878a;
        String str = (String) obj;
        if (str == null || BuildConfig.FLAVOR.equals(str)) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        hVar.f40882a = C20675a.m38859b(str);
        if (hVar.f40882a == null) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        C60870cx a = hVar.f40884c.mo20978a(hVar.f40883b);
        C13226c cVar = new C13226c(hVar);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), hVar.f40886e);
    }
}
