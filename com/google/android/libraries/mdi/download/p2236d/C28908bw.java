package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bw */
/* compiled from: PG */
public final /* synthetic */ class C28908bw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78521a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78522b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78523c;

    public /* synthetic */ C28908bw(C29117fe feVar, C29328dl dlVar, C29334dr drVar) {
        this.f78521a = feVar;
        this.f78522b = dlVar;
        this.f78523c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78521a;
        C29328dl dlVar = this.f78522b;
        C29334dr drVar = this.f78523c;
        if (!((Boolean) obj).booleanValue()) {
            C29045l.m53937i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            C29117fe.m54054w(feVar.f78973b, drVar, dlVar, 14);
        }
        return C60866ct.f164955a;
    }
}
