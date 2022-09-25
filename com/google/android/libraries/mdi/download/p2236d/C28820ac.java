package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C28820ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78288a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78289b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78290c;

    public /* synthetic */ C28820ac(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78288a = feVar;
        this.f78289b = epVar;
        this.f78290c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78288a;
        C29392ep epVar = this.f78289b;
        C29334dr drVar = this.f78290c;
        if (((Boolean) obj).booleanValue()) {
            return feVar.f78983l.mo34521c(drVar.f79501c);
        }
        C29045l.m53937i("%s: Failed to add to stale for group: '%s'; account: '%s'", "FileGroupManager", epVar.f79682b, epVar.f79684d);
        feVar.f78973b.mo34543h(1036);
        return C60856cj.m92899h(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(epVar.f79682b))));
    }
}
