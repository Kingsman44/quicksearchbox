package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9856x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C9794aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f33777a;

    public /* synthetic */ C9794aa(int i) {
        this.f33777a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f33777a;
        C9856x xVar = (C9856x) ((C9857y) obj).toBuilder();
        xVar.copyOnWrite();
        C9857y yVar = (C9857y) xVar.instance;
        yVar.f33888d = i - 1;
        yVar.f33885a |= 4;
        return (C9857y) xVar.build();
    }
}
