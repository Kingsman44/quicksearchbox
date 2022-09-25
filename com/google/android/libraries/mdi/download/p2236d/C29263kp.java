package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.kp */
/* compiled from: PG */
public final /* synthetic */ class C29263kp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79282a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79283b;

    public /* synthetic */ C29263kp(C29290lp lpVar, C29398ev evVar) {
        this.f79282a = lpVar;
        this.f79283b = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79282a;
        C29398ev evVar = this.f79283b;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53936h("%s: No file entry with key %s", "SharedFileManager", evVar);
            return C60856cj.m92900i(false);
        }
        Context context = lpVar.f79385a;
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        Uri e = C29090d.m53984e(context, a, ezVar.f79714b, evVar.f79703d, lpVar.f79386b, lpVar.f79394j, false);
        if (e != null) {
            lpVar.f79388d.mo34511d(e);
        }
        C60870cx f = lpVar.f79387c.mo34621f(evVar);
        C29281lg lgVar = new C29281lg(evVar);
        return C60922j.m93045h(f, C47810es.m84966f(lgVar), lpVar.f79395k);
    }
}
