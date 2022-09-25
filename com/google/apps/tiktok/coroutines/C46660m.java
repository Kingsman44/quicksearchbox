package com.google.apps.tiktok.coroutines;

import android.support.p031v4.app.Fragment;
import dagger.p5294a.C68220f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71683ds;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.m */
/* compiled from: PG */
public final class C46660m implements C68220f {
    /* renamed from: a */
    public static C71422aw m83130a(C69585o oVar, Fragment fragment) {
        C69664n.m101061g(oVar, "mainContext");
        C69664n.m101061g(fragment, "fragment");
        C71683ds dsVar = new C71683ds();
        fragment.getLifecycle().mo5790b(new C46589xa6d52dad(dsVar));
        return new C46659l(oVar, dsVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
