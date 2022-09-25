package com.google.android.apps.gsa.p8867w.p8878h;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.h.a */
/* compiled from: PG */
public final /* synthetic */ class C118795a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118796b f331356a;

    public /* synthetic */ C118795a(C118796b bVar) {
        this.f331356a = bVar;
    }

    public final Object call() {
        String string = this.f331356a.f331357a.getString("ph_server_token", BuildConfig.FLAVOR);
        if (string == null || string.isEmpty()) {
            return C58733pz.f156496a;
        }
        return new C58759qy(string);
    }
}
