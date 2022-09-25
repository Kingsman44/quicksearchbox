package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.ge */
/* compiled from: PG */
public final /* synthetic */ class C29451ge implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f79846a;

    public /* synthetic */ C29451ge(String str) {
        this.f79846a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f79846a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C29045l.m53940l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "MobileDataDownload", str);
            ((C60870cx) axVar.mo56107c()).cancel(false);
        }
        return C60866ct.f164955a;
    }
}
