package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bk */
/* compiled from: PG */
public final /* synthetic */ class C28896bk implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78480a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f78481b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78482c;

    /* renamed from: d */
    public final /* synthetic */ C29328dl f78483d;

    public /* synthetic */ C28896bk(C29117fe feVar, C29398ev evVar, C29334dr drVar, C29328dl dlVar) {
        this.f78480a = feVar;
        this.f78481b = evVar;
        this.f78482c = drVar;
        this.f78483d = dlVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78480a;
        C29398ev evVar = this.f78481b;
        C29334dr drVar = this.f78482c;
        C29328dl dlVar = this.f78483d;
        C29291lq lqVar = (C29291lq) obj;
        C29045l.m53936h("%s: Shared file not found, newFileKey = %s", "FileGroupManager", evVar);
        feVar.f78974c.mo34497a(lqVar, "Shared file not found in downloadFileGroup", new Object[0]);
        C29117fe.m54054w(feVar.f78973b, drVar, dlVar, 26);
        return C60856cj.m92899h(lqVar);
    }
}
