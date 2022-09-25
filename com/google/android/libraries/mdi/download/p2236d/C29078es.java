package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.es */
/* compiled from: PG */
public final /* synthetic */ class C29078es implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29334dr f78920a;

    public /* synthetic */ C29078es(C29334dr drVar) {
        this.f78920a = drVar;
    }

    public final Object apply(Object obj) {
        C29045l.m53946r((IOException) obj, "%s: Detected corruption of isolated structure for group %s", "FileGroupManager", this.f78920a.f79501c);
        return false;
    }
}
