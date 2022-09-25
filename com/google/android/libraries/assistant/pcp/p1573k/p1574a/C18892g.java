package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.g */
/* compiled from: PG */
public final /* synthetic */ class C18892g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f53171a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f53172b;

    public /* synthetic */ C18892g(ComponentName componentName, C58485gu guVar) {
        this.f53171a = componentName;
        this.f53172b = guVar;
    }

    public final Object apply(Object obj) {
        ComponentName componentName = this.f53171a;
        C58485gu guVar = this.f53172b;
        Optional optional = (Optional) obj;
        if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
            return Optional.m71637of(componentName);
        }
        if (guVar.size() <= 1) {
            return Optional.empty();
        }
        guVar.get(1);
        return Optional.m71637of((ComponentName) guVar.get(1));
    }
}
