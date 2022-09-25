package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9856x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.y */
/* compiled from: PG */
public final /* synthetic */ class C9829y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C9855w f33815a;

    public /* synthetic */ C9829y(C9855w wVar) {
        this.f33815a = wVar;
    }

    public final Object apply(Object obj) {
        C9855w wVar = this.f33815a;
        C9856x xVar = (C9856x) ((C9857y) obj).toBuilder();
        xVar.copyOnWrite();
        C9857y yVar = (C9857y) xVar.instance;
        yVar.f33886b = wVar.f33882d;
        yVar.f33885a |= 1;
        return (C9857y) xVar.build();
    }
}
