package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.net.Uri;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.e.ar */
/* compiled from: PG */
public final /* synthetic */ class C29029ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29034aw f78797a;

    public /* synthetic */ C29029ar(C29034aw awVar) {
        this.f78797a = awVar;
    }

    public final Object apply(Object obj) {
        C29034aw awVar = this.f78797a;
        Uri uri = (Uri) obj;
        if (uri != null) {
            try {
                return Long.valueOf(awVar.f78821c.mo45887a(uri));
            } catch (IOException e) {
                C29045l.m53938j(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
            }
        }
        return 0L;
    }
}
