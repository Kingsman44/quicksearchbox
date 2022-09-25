package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28786ca;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.aq */
/* compiled from: PG */
public final /* synthetic */ class C28834aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78331a;

    /* renamed from: b */
    public final /* synthetic */ Map f78332b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f78333c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f78334d;

    /* renamed from: e */
    public final /* synthetic */ C29398ev f78335e;

    /* renamed from: f */
    public final /* synthetic */ C29334dr f78336f;

    public /* synthetic */ C28834aq(C29117fe feVar, Map map, C29328dl dlVar, C29392ep epVar, C29398ev evVar, C29334dr drVar) {
        this.f78331a = feVar;
        this.f78332b = map;
        this.f78333c = dlVar;
        this.f78334d = epVar;
        this.f78335e = evVar;
        this.f78336f = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78331a;
        Map map = this.f78332b;
        C29328dl dlVar = this.f78333c;
        C29392ep epVar = this.f78334d;
        C29398ev evVar = this.f78335e;
        C29334dr drVar = this.f78336f;
        if (((C29390en) obj).equals(C29390en.DOWNLOAD_COMPLETE)) {
            return C60866ct.f164955a;
        }
        if (!map.containsKey(dlVar.f79473b)) {
            C29045l.m53936h("%s:Attempt to import file without inline file source. Id = %s", "FileGroupManager", dlVar.f79473b);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.MISSING_INLINE_FILE_SOURCE;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        C29290lp lpVar = feVar.f78976e;
        C29380ed edVar = drVar.f79510l;
        if (edVar == null) {
            edVar = C29380ed.f79641f;
        }
        C29380ed edVar2 = edVar;
        C28786ca caVar = (C28786ca) map.get(dlVar.f79473b);
        caVar.getClass();
        if (!dlVar.f79474c.startsWith("inlinefile")) {
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.INVALID_INLINE_FILE_URL_SCHEME;
            bnVar2.f78063b = "Importing an inline file requires inlinefile scheme";
            return C60856cj.m92899h(bnVar2.mo34334a());
        }
        C60870cx e = lpVar.f79387c.mo34620e(evVar);
        C29284lj ljVar = new C29284lj(lpVar, dlVar, epVar, evVar, edVar2, caVar);
        return C60922j.m93045h(e, C47810es.m84966f(ljVar), lpVar.f79395k);
    }
}
