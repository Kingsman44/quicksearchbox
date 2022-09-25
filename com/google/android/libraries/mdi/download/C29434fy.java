package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29197id;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.fy */
/* compiled from: PG */
public final /* synthetic */ class C29434fy implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79792a;

    /* renamed from: b */
    public final /* synthetic */ C29652hw f79793b;

    public /* synthetic */ C29434fy(C29647hr hrVar, C29652hw hwVar) {
        this.f79792a = hrVar;
        this.f79793b = hwVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29647hr hrVar = this.f79792a;
        C29652hw hwVar = this.f79793b;
        C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
        String c = hwVar.mo34794c();
        eoVar.copyOnWrite();
        C29392ep epVar = (C29392ep) eoVar.instance;
        c.getClass();
        epVar.f79681a |= 1;
        epVar.f79682b = c;
        String packageName = hrVar.f80295a.getPackageName();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        packageName.getClass();
        epVar2.f79681a |= 2;
        epVar2.f79683c = packageName;
        if (hwVar.mo34792a().mo56113h()) {
            String b = C28694b.m53577b((Account) hwVar.mo34792a().mo56107c());
            eoVar.copyOnWrite();
            C29392ep epVar3 = (C29392ep) eoVar.instance;
            epVar3.f79681a |= 4;
            epVar3.f79684d = b;
        }
        if (hwVar.mo34793b().mo56113h()) {
            String str = (String) hwVar.mo34793b().mo56107c();
            eoVar.copyOnWrite();
            C29392ep epVar4 = (C29392ep) eoVar.instance;
            str.getClass();
            epVar4.f79681a |= 16;
            epVar4.f79686f = str;
        }
        C29392ep epVar5 = (C29392ep) eoVar.build();
        C29211ir irVar = hrVar.f80297c;
        boolean d = hwVar.mo34795d();
        C29045l.m53931c("%s removeFileGroup %s", "MDDManager", epVar5.f79682b);
        return C60922j.m93044g(C60922j.m93045h(irVar.mo34632h(), C47810es.m84966f(new C29197id(irVar, epVar5, d)), irVar.f79204n), C47810es.m84963c(C29415fj.f79753a), hrVar.f80301g);
    }
}
