package com.google.apps.tiktok.account.data.manager;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.manager.ai */
/* compiled from: PG */
public final /* synthetic */ class C46236ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46241an f121209a;

    public /* synthetic */ C46236ai(C46241an anVar) {
        this.f121209a = anVar;
    }

    public final Object call() {
        C46243ap apVar = (C46243ap) this.f121209a.f121214a.get();
        SharedPreferences.Editor edit = apVar.f121218a.edit();
        ArrayList arrayList = apVar.f121219b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            edit.remove((String) arrayList.get(i));
        }
        apVar.f121219b.clear();
        return Boolean.valueOf(edit.commit());
    }
}
