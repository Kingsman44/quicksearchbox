package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.delta.vcdiff.C29321a;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ky */
/* compiled from: PG */
public final /* synthetic */ class C29272ky implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79318a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79319b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f79320c;

    /* renamed from: d */
    public final /* synthetic */ C29328dl f79321d;

    /* renamed from: e */
    public final /* synthetic */ C29380ed f79322e;

    /* renamed from: f */
    public final /* synthetic */ int f79323f;

    /* renamed from: g */
    public final /* synthetic */ List f79324g;

    public /* synthetic */ C29272ky(C29290lp lpVar, C29398ev evVar, C29392ep epVar, C29328dl dlVar, C29380ed edVar, int i, List list) {
        this.f79318a = lpVar;
        this.f79319b = evVar;
        this.f79320c = epVar;
        this.f79321d = dlVar;
        this.f79322e = edVar;
        this.f79323f = i;
        this.f79324g = list;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29290lp lpVar = this.f79318a;
        C29398ev evVar = this.f79319b;
        C29392ep epVar = this.f79320c;
        C29328dl dlVar = this.f79321d;
        C29380ed edVar = this.f79322e;
        int i = this.f79323f;
        List list = this.f79324g;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53936h("%s: Start download called on file that doesn't exists. Key = %s!", "SharedFileManager", evVar);
            C29291lq lqVar = new C29291lq();
            lpVar.f79386b.mo34497a(lqVar, "Shared file not found in downloadFileGroup", new Object[0]);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.SHARED_FILE_NOT_FOUND_ERROR;
            bnVar.f78064c = lqVar;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        C29390en a = C29390en.m54308a(ezVar.f79715c);
        if (a == null) {
            a = C29390en.NONE;
        }
        if (a == C29390en.DOWNLOAD_COMPLETE) {
            if (lpVar.f79391g.mo56113h()) {
                ((C29441e) lpVar.f79391g.mo56107c()).mo34740j(epVar.f79682b, (long) dlVar.f79475d);
            }
            return C60866ct.f164955a;
        }
        int a2 = C29332dp.m54217a(evVar.f79704e);
        if (a2 == 0) {
            a2 = 1;
        }
        if (C29173hg.m54127a(lpVar.f79385a, lpVar.f79386b).f79119d < C29172hf.USE_CHECKSUM_ONLY.f79119d || !lpVar.f79390f.mo56113h()) {
            cxVar = C60866ct.f164955a;
        } else {
            C29321a aVar = (C29321a) lpVar.f79390f.mo56107c();
            cxVar = lpVar.mo34645i(dlVar.f79482k, 0, a2);
        }
        C29265kr krVar = new C29265kr(lpVar, ezVar, dlVar, epVar, evVar, edVar, i, list);
        return C60922j.m93045h(cxVar, C47810es.m84966f(krVar), lpVar.f79395k);
    }
}
