package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28696ab;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.eo */
/* compiled from: PG */
public final /* synthetic */ class C104023eo implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289436a;

    /* renamed from: b */
    public final /* synthetic */ Set f289437b;

    public /* synthetic */ C104023eo(C104026er erVar, Set set) {
        this.f289436a = erVar;
        this.f289437b = set;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104026er erVar = this.f289436a;
        Set<C80627v> set = this.f289437b;
        C118826c cVar = (C118826c) obj;
        if (set.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        ArrayList arrayList = new ArrayList();
        for (C80627v vVar : set) {
            C58833ax axVar = C28696ab.f77968a;
            String c = erVar.f289452f.mo74368c(vVar);
            C58833ax k = C58833ax.m90834k(new C104025eq(erVar, vVar));
            if (c.equals(((C104032ex) erVar.f289461o.mo27525b()).mo93926d())) {
                cxVar = erVar.f289449c.mo28210j(erVar.f289448b.mo28202b("[NGA] NgaInitialDownloader.downloadFileGroup.downloadLanguagePack", new C103971cq(erVar, axVar, k)), "[NGA] NgaInitialDownloader.downloadFileGroup.onLanguagePackDownloadSuccess", new C103972cr(erVar));
            } else {
                C60870cx cxVar2 = C118826c.f331423b;
                boolean equals = c.equals(erVar.f289452f.mo74368c(C80627v.WEBREF));
                if (c.equals(erVar.f289452f.mo74368c(C80627v.WEBREF))) {
                    cxVar2 = erVar.mo93924h(erVar.f289452f.mo74370e());
                }
                C22871g gVar = erVar.f289448b;
                cxVar = gVar.mo28210j(cxVar2, "[NGA] download ".concat(String.valueOf(c)), new C103973cs(erVar, c, axVar, k, equals));
            }
            arrayList.add(cxVar);
        }
        return C60856cj.m92896e(arrayList);
    }
}
