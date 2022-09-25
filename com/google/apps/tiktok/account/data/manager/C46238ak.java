package com.google.apps.tiktok.account.data.manager;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.manager.ak */
/* compiled from: PG */
public final /* synthetic */ class C46238ak implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46241an f121211a;

    public /* synthetic */ C46238ak(C46241an anVar) {
        this.f121211a = anVar;
    }

    public final Object call() {
        File file = new File(this.f121211a.f121217d.f121220a.getApplicationInfo().dataDir, "shared_prefs/accounts.xml");
        if (!file.exists()) {
            file = new File(String.valueOf(file.getPath()).concat(".bak"));
        }
        return Boolean.valueOf(file.exists());
    }
}
