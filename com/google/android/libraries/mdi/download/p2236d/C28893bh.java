package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bh */
/* compiled from: PG */
public final /* synthetic */ class C28893bh implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78471a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f78472b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78473c;

    /* renamed from: d */
    public final /* synthetic */ C29328dl f78474d;

    public /* synthetic */ C28893bh(C29117fe feVar, C29398ev evVar, C29334dr drVar, C29328dl dlVar) {
        this.f78471a = feVar;
        this.f78472b = evVar;
        this.f78473c = drVar;
        this.f78474d = dlVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78471a;
        C29398ev evVar = this.f78472b;
        C29334dr drVar = this.f78473c;
        C29328dl dlVar = this.f78474d;
        C29291lq lqVar = (C29291lq) obj;
        C29045l.m53936h("%s: Shared file not found, newFileKey = %s", "FileGroupManager", evVar);
        feVar.f78974c.mo34497a(lqVar, "Shared file not found in downloadFileGroup", new Object[0]);
        C29117fe.m54054w(feVar.f78973b, drVar, dlVar, 26);
        return C60856cj.m92899h(lqVar);
    }
}
