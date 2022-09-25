package com.google.android.libraries.mdi.download.p2243e;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.q */
/* compiled from: PG */
public final /* synthetic */ class C29367q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f79599a;

    public /* synthetic */ C29367q(String str) {
        this.f79599a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f79599a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C29045l.m53940l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "DownloaderImp", str);
            ((C60870cx) axVar.mo56107c()).cancel(false);
        }
        return C60866ct.f164955a;
    }
}
