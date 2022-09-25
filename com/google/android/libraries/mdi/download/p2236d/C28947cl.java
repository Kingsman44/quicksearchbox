package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.cl */
/* compiled from: PG */
public final /* synthetic */ class C28947cl implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78629a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78630b;

    public /* synthetic */ C28947cl(C29117fe feVar, C29334dr drVar) {
        this.f78629a = feVar;
        this.f78630b = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78629a;
        C29045l.m53936h("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", this.f78630b.f79501c);
        feVar.f78974c.mo34497a((C29291lq) obj, "Shared file not found in getFileGroupDownloadStatus", new Object[0]);
        return C60856cj.m92900i(C29390en.NONE);
    }
}
