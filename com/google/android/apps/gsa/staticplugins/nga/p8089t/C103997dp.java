package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.dp */
/* compiled from: PG */
public final /* synthetic */ class C103997dp implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289402a;

    /* renamed from: b */
    public final /* synthetic */ Set f289403b;

    /* renamed from: c */
    public final /* synthetic */ boolean f289404c;

    public /* synthetic */ C103997dp(C104026er erVar, Set set, boolean z) {
        this.f289402a = erVar;
        this.f289403b = set;
        this.f289404c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104026er erVar = this.f289402a;
        Set set = this.f289403b;
        boolean z = this.f289404c;
        long longValue = ((Long) obj).longValue();
        if (longValue == 0) {
            if (!set.contains(C80627v.SODA)) {
                return C60856cj.m92900i(false);
            }
            longValue = 0;
        }
        ((C103967cm) erVar.f289459m.mo27525b()).mo93910c(longValue);
        if (z) {
            return C60856cj.m92900i(true);
        }
        C22871g gVar = erVar.f289448b;
        C103948bu buVar = (C103948bu) erVar.f289454h.mo27525b();
        if (!buVar.f289306b.mo79746e(C90126fx.f251049bV)) {
            cxVar = C60856cj.m92900i(C103947bt.INELIGIBLE_FLAG_DISABLED);
        } else if (!buVar.mo93893a()) {
            cxVar = C60856cj.m92900i(C103947bt.INELIGIBLE_NOT_FIRST_RUN);
        } else if (((Boolean) buVar.f289308d.mo6453a()).booleanValue()) {
            cxVar = C60856cj.m92900i(C103947bt.ELIGIBLE);
        } else {
            cxVar = buVar.f289307c.mo28209i(buVar.f289305a.mo27378c(), "[NGA] NgaInitialDownloadEligibilityChecker.getConnectivityInfo", new C103946bs(buVar, longValue));
        }
        return gVar.mo28209i(cxVar, "[NGA] NgaInitialDownloader.isDownloadEligible.shouldDownloadInitialFiles", new C103982da(erVar));
    }
}
