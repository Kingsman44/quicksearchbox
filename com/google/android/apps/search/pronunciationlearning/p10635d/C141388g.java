package com.google.android.apps.search.pronunciationlearning.p10635d;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.g */
/* compiled from: PG */
public final /* synthetic */ class C141388g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141399r f383808a;

    /* renamed from: b */
    public final /* synthetic */ String f383809b;

    public /* synthetic */ C141388g(C141399r rVar, String str) {
        this.f383808a = rVar;
        this.f383809b = str;
    }

    public final void run() {
        C141399r rVar = this.f383808a;
        String str = this.f383809b;
        if (rVar.f383825d.containsKey(str)) {
            C2164c cVar = (C2164c) rVar.f383825d.get(str);
            cVar.getClass();
            cVar.mo5437b((Object) null);
            rVar.f383825d.remove(str);
        }
    }
}
