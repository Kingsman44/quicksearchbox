package com.google.android.apps.search.googleapp.search.srp.p10431a;

import com.google.android.gms.common.C144022y;
import com.google.android.gms.p10725a.p10726a.p10728b.C142668a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.a.a */
/* compiled from: PG */
public final /* synthetic */ class C137693a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C137696d f374518a;

    public /* synthetic */ C137693a(C137696d dVar) {
        this.f374518a = dVar;
    }

    public final Object call() {
        C137697e eVar;
        C137696d dVar = this.f374518a;
        synchronized (dVar.f374524c) {
            try {
                dVar.f374526e = new C137697e(new C142668a(dVar.f374525d, dVar.f374523b));
                eVar = dVar.f374526e;
            } catch (C144022y e) {
                throw new RuntimeException(e);
            }
        }
        return eVar;
    }
}
