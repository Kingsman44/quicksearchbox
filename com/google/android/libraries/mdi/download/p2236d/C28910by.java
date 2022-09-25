package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.by */
/* compiled from: PG */
public final /* synthetic */ class C28910by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78529a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78530b;

    public /* synthetic */ C28910by(C29117fe feVar, C29334dr drVar) {
        this.f78529a = feVar;
        this.f78530b = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78529a;
        C29334dr drVar = this.f78530b;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C29045l.m53936h("%s: Failed to add to stale for group: '%s';", "FileGroupManager", drVar.f79501c);
        feVar.f78973b.mo34543h(1036);
        return C60856cj.m92899h(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(drVar.f79501c))));
    }
}
