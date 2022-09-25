package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29195ib;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.mdi.download.gh */
/* compiled from: PG */
public final /* synthetic */ class C29454gh implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79851a;

    /* renamed from: b */
    public final /* synthetic */ C28721b f79852b;

    public /* synthetic */ C29454gh(C29647hr hrVar, C28721b bVar) {
        this.f79851a = hrVar;
        this.f79852b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29647hr hrVar = this.f79851a;
        C28721b bVar = this.f79852b;
        C29045l.m53932d("%s: Adding for download group = '%s', variant = '%s' and associating it with account = '%s', variant = '%s'", "MobileDataDownload", bVar.mo34331a().f77997b, bVar.mo34331a().f78005j, String.valueOf(bVar.mo34332b().mo56111f()), String.valueOf(bVar.mo34333c().mo56111f()));
        C28708an a = bVar.mo34331a();
        if ((a.f77996a & 2) == 0) {
            C28707am amVar = (C28707am) a.toBuilder();
            String packageName = hrVar.f80295a.getPackageName();
            amVar.copyOnWrite();
            C28708an anVar = (C28708an) amVar.instance;
            packageName.getClass();
            anVar.f77996a |= 2;
            anVar.f77998c = packageName;
            a = (C28708an) amVar.build();
        } else if (!hrVar.f80295a.getPackageName().equals(a.f77998c)) {
            C29045l.m53937i("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", a.f77997b, hrVar.f80295a.getPackageName(), a.f77998c);
            return C60856cj.m92900i(false);
        }
        C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
        String str = a.f77997b;
        eoVar.copyOnWrite();
        C29392ep epVar = (C29392ep) eoVar.instance;
        str.getClass();
        epVar.f79681a |= 1;
        epVar.f79682b = str;
        String str2 = a.f77998c;
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        str2.getClass();
        epVar2.f79681a = 2 | epVar2.f79681a;
        epVar2.f79683c = str2;
        if (bVar.mo34332b().mo56113h()) {
            String b = C28694b.m53577b((Account) bVar.mo34332b().mo56107c());
            eoVar.copyOnWrite();
            C29392ep epVar3 = (C29392ep) eoVar.instance;
            epVar3.f79681a = 4 | epVar3.f79681a;
            epVar3.f79684d = b;
        }
        if (bVar.mo34333c().mo56113h()) {
            String str3 = (String) bVar.mo34333c().mo56107c();
            eoVar.copyOnWrite();
            C29392ep epVar4 = (C29392ep) eoVar.instance;
            str3.getClass();
            epVar4.f79681a |= 16;
            epVar4.f79686f = str3;
        }
        try {
            byte[] byteArray = a.toByteArray();
            C62921ba baVar = C62921ba.f169869a;
            C29211ir irVar = hrVar.f80297c;
            C29392ep epVar5 = (C29392ep) eoVar.build();
            C60931s sVar = hrVar.f80304j;
            C29045l.m53931c("%s addGroupForDownload %s", "MDDManager", epVar5.f79682b);
            return C60922j.m93045h(irVar.mo34632h(), C47810es.m84966f(new C29195ib(irVar, (C29334dr) C62942bv.parseFrom((C62942bv) C29334dr.f79497w, byteArray, baVar), epVar5, sVar)), irVar.f79204n);
        } catch (C62974ct e) {
            C29045l.m53938j(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
            return C60856cj.m92900i(false);
        }
    }
}
