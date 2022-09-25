package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ep */
/* compiled from: PG */
public final /* synthetic */ class C29075ep implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78911a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78912b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78913c;

    public /* synthetic */ C29075ep(C29117fe feVar, C29328dl dlVar, C29334dr drVar) {
        this.f78911a = feVar;
        this.f78912b = dlVar;
        this.f78913c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78911a;
        C29328dl dlVar = this.f78912b;
        C29334dr drVar = this.f78913c;
        Uri uri = (Uri) obj;
        if (uri != null) {
            feVar.mo34578a(uri, dlVar, drVar, true);
        }
        return C60866ct.f164955a;
    }
}
