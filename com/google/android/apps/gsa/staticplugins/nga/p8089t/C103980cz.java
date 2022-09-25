package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cz */
/* compiled from: PG */
public final /* synthetic */ class C103980cz implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289379a;

    public /* synthetic */ C103980cz(C104026er erVar) {
        this.f289379a = erVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104026er erVar = this.f289379a;
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return erVar.f289448b.mo28210j(erVar.f289448b.mo28210j(erVar.mo93924h(erVar.f289452f.mo74368c(C80627v.SOT_CONFIGS)), "[NGA] NgaInitialDownloader.downloadGroups.downloadGroupIds", new C104023eo(erVar, set)), "[NGA] NgaInitialDownloader.verifyPendingGroups", new C104024ep(erVar));
    }
}
