package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29689e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ed */
/* compiled from: PG */
public final /* synthetic */ class C104012ed implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289421a;

    /* renamed from: b */
    public final /* synthetic */ boolean f289422b;

    public /* synthetic */ C104012ed(C104026er erVar, boolean z) {
        this.f289421a = erVar;
        this.f289422b = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104026er erVar = this.f289421a;
        boolean z = this.f289422b;
        Set set = (Set) obj;
        C22871g gVar = erVar.f289448b;
        if (set.isEmpty()) {
            cxVar = C60856cj.m92900i(0L);
        } else {
            cxVar = erVar.f289448b.mo28209i(erVar.mo93919c(C29689e.PENDING), "[NGA] NgaInitialDownloader.downloadSizeBytes.groupDownloadSizeBytes", new C104020el(erVar, set));
        }
        return erVar.f289448b.mo28210j(gVar.mo28210j(cxVar, "[NGA] NgaInitialDownloader.shouldDownload.isDownloadEligible", new C103997dp(erVar, set, z)), "[NGA] NgaInitialDownloader.shouldDownload.isEligibleFuture", new C103998dq(erVar));
    }
}
