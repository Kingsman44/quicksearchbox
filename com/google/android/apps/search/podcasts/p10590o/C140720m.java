package com.google.android.apps.search.podcasts.p10590o;

import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.o.m */
/* compiled from: PG */
public final /* synthetic */ class C140720m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Runnable f382143a;

    public /* synthetic */ C140720m(Runnable runnable) {
        this.f382143a = runnable;
    }

    public final Object apply(Object obj) {
        Runnable runnable = this.f382143a;
        List list = (List) obj;
        C140704ae aeVar = ((C140732y) list.get(0)).f382166a;
        if (aeVar == null) {
            aeVar = C140704ae.f382118b;
        }
        C140704ae aeVar2 = ((C140732y) list.get(1)).f382166a;
        if (aeVar2 == null) {
            aeVar2 = C140704ae.f382118b;
        }
        boolean z = !aeVar.equals(aeVar2);
        if (z) {
            runnable.run();
        }
        return Boolean.valueOf(z);
    }
}
