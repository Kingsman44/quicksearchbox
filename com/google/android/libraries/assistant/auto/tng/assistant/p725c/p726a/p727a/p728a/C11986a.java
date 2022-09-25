package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p728a;

import android.app.AppOpsManager;
import android.os.Build;
import android.os.Process;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.a.a */
/* compiled from: PG */
public final class C11986a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f38492a;

    /* renamed from: b */
    final /* synthetic */ C11988c f38493b;

    public C11986a(C11988c cVar, C60870cx cxVar) {
        this.f38493b = cVar;
        this.f38492a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C11988c.f38495a.mo56226d()).mo56382g(th)).mo56372aa(43948)).mo56386p("#audio# Failed getting startListening future");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37400be beVar = (C37400be) obj;
        C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_MIC);
        C11988c cVar = this.f38493b;
        if (Build.VERSION.SDK_INT >= 31) {
            AppOpsManager appOpsManager = (AppOpsManager) cVar.f38496b.getSystemService("appops");
            if (appOpsManager == null) {
                ((C59052c) ((C59052c) C11988c.f38495a.mo56226d()).mo56372aa(43953)).mo56386p("#audio# Unable to get access to app ops manager");
            } else {
                appOpsManager.startOp("android:record_audio", Process.myUid(), cVar.f38496b.getPackageName(), C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_MIC), (String) null);
            }
        }
        C11988c cVar2 = this.f38493b;
        C60870cx cxVar = this.f38492a;
        C60845bz n = C47810es.m84974n(new C11987b(cVar2));
        C60856cj.m92911t(cxVar, C47810es.m84974n(n), cVar2.f38497c);
    }
}
