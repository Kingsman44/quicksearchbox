package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28786ca;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28926n;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.lj */
/* compiled from: PG */
public final /* synthetic */ class C29284lj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79356a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f79357b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f79358c;

    /* renamed from: d */
    public final /* synthetic */ C29398ev f79359d;

    /* renamed from: e */
    public final /* synthetic */ C29380ed f79360e;

    /* renamed from: f */
    public final /* synthetic */ C28786ca f79361f;

    public /* synthetic */ C29284lj(C29290lp lpVar, C29328dl dlVar, C29392ep epVar, C29398ev evVar, C29380ed edVar, C28786ca caVar) {
        this.f79356a = lpVar;
        this.f79357b = dlVar;
        this.f79358c = epVar;
        this.f79359d = evVar;
        this.f79360e = edVar;
        this.f79361f = caVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C29290lp lpVar = this.f79356a;
        C29328dl dlVar = this.f79357b;
        C29392ep epVar = this.f79358c;
        C29398ev evVar = this.f79359d;
        C29380ed edVar = this.f79360e;
        C28786ca caVar = this.f79361f;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53936h("%s: Start import called on file that doesn't exist. Id = %s", "SharedFileManager", dlVar.f79473b);
            C29291lq lqVar = new C29291lq();
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
            return C60866ct.f164955a;
        }
        C29401ey eyVar = (C29401ey) ezVar.toBuilder();
        if ((dlVar.f79472a & 32) != 0) {
            str = C28926n.m53845b(ezVar.f79714b, dlVar.f79479h);
        } else {
            str = ezVar.f79714b;
        }
        String str2 = str;
        C60870cx c = lpVar.mo34639c(epVar);
        C29267kt ktVar = new C29267kt(lpVar, eyVar, evVar, str2, epVar, dlVar, edVar, caVar);
        return C60922j.m93045h(c, C47810es.m84966f(ktVar), lpVar.f79395k);
    }
}
