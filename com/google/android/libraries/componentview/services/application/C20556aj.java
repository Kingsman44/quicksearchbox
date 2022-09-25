package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import android.util.Log;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.services.application.aj */
/* compiled from: PG */
public final /* synthetic */ class C20556aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C20557ak f57734a;

    public /* synthetic */ C20556aj(C20557ak akVar) {
        this.f57734a = akVar;
    }

    public final C60870cx apply(Object obj) {
        C20557ak akVar = this.f57734a;
        Uri uri = (Uri) obj;
        Log.d("DefaultLogger", "Issuing visibility update or interaction: ".concat(String.valueOf(uri.toString())));
        return akVar.f57735d.mo25518c(uri, (Map) null, true);
    }
}
