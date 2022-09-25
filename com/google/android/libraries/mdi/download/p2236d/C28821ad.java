package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29394er;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C28821ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78291a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78292b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78293c;

    public /* synthetic */ C28821ad(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78291a = feVar;
        this.f78292b = epVar;
        this.f78293c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78291a;
        C29392ep epVar = this.f78292b;
        C29334dr drVar = this.f78293c;
        C29394er erVar = (C29394er) obj;
        if (erVar == null) {
            erVar = C29394er.f79687b;
        }
        if (erVar.f79689a) {
            return C60866ct.f164955a;
        }
        C29045l.m53932d("%s: Trying to add group %s that requires activation %s.", "FileGroupManager", epVar.f79682b, epVar.f79683c);
        C29117fe.m54053v(1055, feVar.f78973b, drVar);
        throw new C28813a();
    }
}
