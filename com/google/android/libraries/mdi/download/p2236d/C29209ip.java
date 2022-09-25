package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ip */
/* compiled from: PG */
public final /* synthetic */ class C29209ip implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79189a;

    public /* synthetic */ C29209ip(C29211ir irVar) {
        this.f79189a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79189a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C29045l.m53943o("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
        return irVar.mo34627c();
    }
}
