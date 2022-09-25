package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

import android.content.ComponentName;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130337a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f357234a;

    public /* synthetic */ C130337a(ComponentName componentName) {
        this.f357234a = componentName;
    }

    public final Object apply(Object obj) {
        ComponentName componentName = this.f357234a;
        String str = (String) obj;
        if (str.isEmpty()) {
            return C130345i.m212784a();
        }
        return new C130347k(2, str, componentName.getPackageName(), componentName.getClassName());
    }
}
