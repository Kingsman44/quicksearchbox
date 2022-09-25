package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9856x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.i */
/* compiled from: PG */
public final /* synthetic */ class C9813i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f33799a;

    public /* synthetic */ C9813i(boolean z) {
        this.f33799a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f33799a;
        C9856x xVar = (C9856x) ((C9857y) obj).toBuilder();
        xVar.copyOnWrite();
        C9857y yVar = (C9857y) xVar.instance;
        yVar.f33885a |= 2;
        yVar.f33887c = z;
        return (C9857y) xVar.build();
    }
}
